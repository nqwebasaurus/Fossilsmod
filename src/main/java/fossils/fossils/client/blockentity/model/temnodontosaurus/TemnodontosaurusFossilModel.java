package fossils.fossils.client.blockentity.model.temnodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TemnodontosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Temnodontosaurus;
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
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body17;
	private final ModelPart Body19;
	private final ModelPart Body20;
	private final ModelPart Body18;
	private final ModelPart Body16;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public TemnodontosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Temnodontosaurus = this.fossil.getChild("Temnodontosaurus");
		this.Body1 = this.Temnodontosaurus.getChild("Body1");
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
		this.Body6 = this.Body5.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Body12 = this.Body8.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body17 = this.Body15.getChild("Body17");
		this.Body19 = this.Body17.getChild("Body19");
		this.Body20 = this.Body19.getChild("Body20");
		this.Body18 = this.Body17.getChild("Body18");
		this.Body16 = this.Body15.getChild("Body16");
		this.Head = this.Temnodontosaurus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Temnodontosaurus = fossil.addOrReplaceChild("Temnodontosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.6181F, -10.325F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body1 = Temnodontosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3817F, -16.8422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 114).addBox(0.0F, -1.3411F, 0.0015F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6817F, 1.2672F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 116).addBox(0.0F, -1.349F, 0.0263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0183F, -0.6328F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.5F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(104, 22).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2342F, 0.1526F, 0.8377F, 0.7681F, -0.3346F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(106, 28).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2342F, 0.1526F, 0.3747F, 1.0197F, -0.9176F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-4.9916F, -2.5101F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7658F, 1.7526F, 0.1627F, 0.9484F, -1.3706F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(103, 103).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7658F, 1.7526F, 0.6734F, 0.7438F, -0.703F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(103, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7658F, 1.7526F, 0.8887F, 0.4378F, -0.3242F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2342F, 0.1526F, 0.8377F, -0.7681F, 0.3346F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(106, 28).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2342F, 0.1526F, 0.3747F, -1.0197F, 0.9176F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 104).addBox(2.9916F, -2.5101F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7658F, 1.7526F, 0.1627F, -0.9484F, 1.3706F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(103, 103).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7658F, 1.7526F, 0.6734F, -0.7438F, 0.703F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(103, 57).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7658F, 1.7526F, 0.8887F, -0.4378F, 0.3242F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.026F, 3.1368F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(35, 20).mirror().addBox(-11.8805F, -2.0222F, -0.4902F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6557F, 8.2054F, 0.1829F, 0.5619F, -1.2599F));

		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(-3.4888F, -0.4637F, -0.4902F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6557F, 8.2054F, 0.4309F, 0.4132F, -0.7412F));

		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 105).mirror().addBox(-1.5453F, 0.2088F, -0.5019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6557F, 8.2054F, 0.5579F, 0.21F, -0.3343F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(105, 48).mirror().addBox(-1.5453F, 0.2089F, -0.5026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3557F, 6.2054F, 0.5917F, 0.2213F, -0.3271F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(47, 105).mirror().addBox(-3.4888F, -0.4637F, -0.4908F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3557F, 6.2054F, 0.4593F, 0.4366F, -0.7295F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-10.8805F, -2.0222F, -0.4908F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.3557F, 6.2054F, 0.1958F, 0.5951F, -1.2529F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(105, 46).mirror().addBox(-1.5453F, 0.2089F, -0.5032F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 4.2054F, 0.6427F, 0.2378F, -0.3155F));

		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(105, 34).mirror().addBox(-3.4888F, -0.4637F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 4.2054F, 0.5031F, 0.4712F, -0.7102F));

		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-10.8805F, -2.0222F, -0.4915F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1557F, 4.2054F, 0.2162F, 0.6448F, -1.241F));

		PartDefinition cube_r23 = Body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(-7.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3398F, 0.3158F, 0.2069F, 0.7578F, -1.2416F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(105, 32).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3398F, 0.3158F, 0.5641F, 0.5714F, -0.6745F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(105, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3398F, 0.3158F, 0.7332F, 0.3103F, -0.2856F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(21, 105).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 2.2158F, 0.6941F, 0.2538F, -0.303F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-10.9916F, -2.5101F, -0.4853F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 2.2158F, 0.2383F, 0.6942F, -1.2273F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(104, 24).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 2.2158F, 0.5485F, 0.5049F, -0.689F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 20).addBox(2.8805F, -2.0222F, -0.4902F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6557F, 8.2054F, 0.1829F, -0.5619F, 1.2599F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(105, 83).addBox(1.4888F, -0.4637F, -0.4902F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6557F, 8.2054F, 0.4309F, -0.4132F, 0.7412F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(64, 105).addBox(-0.4547F, 0.2088F, -0.5019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6557F, 8.2054F, 0.5579F, -0.21F, 0.3343F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(105, 48).addBox(-0.4547F, 0.2089F, -0.5026F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3557F, 6.2054F, 0.5917F, -0.2213F, 0.3271F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 105).addBox(1.4888F, -0.4637F, -0.4908F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3557F, 6.2054F, 0.4593F, -0.4366F, 0.7295F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 64).addBox(2.8805F, -2.0222F, -0.4908F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3557F, 6.2054F, 0.1958F, -0.5951F, 1.2529F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(105, 46).addBox(-0.4547F, 0.2089F, -0.5032F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 4.2054F, 0.6427F, -0.2378F, 0.3155F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(105, 34).addBox(1.4888F, -0.4637F, -0.4915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 4.2054F, 0.5031F, -0.4712F, 0.7102F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(57, 63).addBox(2.8805F, -2.0222F, -0.4915F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 4.2054F, 0.2162F, -0.6448F, 1.241F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(85, 59).addBox(2.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3398F, 0.3158F, 0.2069F, -0.7578F, 1.2416F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(105, 32).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3398F, 0.3158F, 0.5641F, -0.5714F, 0.6745F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(105, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3398F, 0.3158F, 0.7332F, -0.3103F, 0.2856F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(21, 105).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 2.2158F, 0.6941F, -0.2538F, 0.303F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 48).addBox(2.9916F, -2.5101F, -0.4853F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 2.2158F, 0.2383F, -0.6942F, 1.2273F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(104, 24).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 2.2158F, 0.5485F, -0.5049F, 0.689F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(114, 77).addBox(0.0F, -1.555F, -0.1012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7473F, 7.8734F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(114, 69).addBox(0.0F, -1.4846F, 0.0317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5504F, 5.6908F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(114, 65).addBox(-1.0F, -1.3928F, -0.0072F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 3.7054F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(71, 89).addBox(-0.5F, 1.2F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.4941F, 1.3313F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(31, 22).addBox(-3.5F, -0.4F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.7096F, 6.9098F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(23, 51).addBox(-1.5F, -0.0753F, -0.0056F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 2.7054F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(114, 39).addBox(-1.0F, -1.3245F, 0.0355F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8557F, 1.7054F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(25, 114).addBox(-1.0F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(89, 46).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, 6.4775F, 2.0769F, 0.4386F, 0.2044F, -0.2672F));

		PartDefinition cube_r53 = ForelimbL.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(54, 0).addBox(-6.85F, 0.0F, 1.35F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.8879F, 11.5831F, -3.7976F, 0.0F, -0.1222F, 0.6545F));

		PartDefinition cube_r54 = ForelimbL.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(19, 46).addBox(-1.3F, 0.0F, 0.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8369F, 3.8706F, -2.9116F, 0.0F, 0.0698F, 0.6545F));

		PartDefinition cube_r55 = ForelimbL.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(90, 27).addBox(-0.875F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.417F, 2.7811F, 0.2871F, 0.0F, -0.0175F, 0.6545F));

		PartDefinition cube_r56 = ForelimbL.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 60).addBox(-2.3F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.1229F, 3.3227F, -2.3116F, 0.0F, 0.3927F, 0.6545F));

		PartDefinition cube_r57 = ForelimbL.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(102, 69).addBox(-1.4F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.0249F, 1.7129F, -1.5708F, -3.0548F, 1.0455F, -2.3645F));

		PartDefinition cube_r58 = ForelimbL.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(102, 66).addBox(-2.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.0249F, 1.7129F, -1.5708F, -0.1282F, 1.3065F, 0.5462F));

		PartDefinition cube_r59 = ForelimbL.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(58, 99).addBox(2.0F, 0.2F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(27, 98).addBox(-0.675F, 0.2F, 1.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r60 = ForelimbL.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(102, 72).addBox(0.0F, -0.5F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7456F, 0.7437F, -1.0218F, 0.0042F, -0.0959F, 0.6543F));

		PartDefinition cube_r61 = ForelimbL.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(5, 111).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1893F, -0.0621F, 0.4711F, 3.0851F, -0.715F, -2.4155F));

		PartDefinition cube_r62 = ForelimbL.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 111).addBox(-0.025F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0966F, 0.2333F, -0.6116F, 0.2024F, -1.3569F, 0.4911F));

		PartDefinition cube_r63 = ForelimbL.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 103).addBox(-0.5F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0966F, 0.2333F, -0.6116F, 0.0185F, -0.401F, 0.6507F));

		PartDefinition cube_r64 = ForelimbL.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(101, 63).addBox(-1.975F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.3493F, 1.3631F, 1.3884F, 0.0F, -0.4669F, 0.6545F));

		PartDefinition ForelimbL2 = Body2.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, 6.4775F, 2.0769F, 0.4195F, 0.8236F, 0.4958F));

		PartDefinition cube_r65 = ForelimbL2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(54, 5).addBox(-0.15F, 0.0F, 1.35F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.8879F, 11.5831F, -3.7976F, 0.0F, 0.1222F, -0.6545F));

		PartDefinition cube_r66 = ForelimbL2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 51).addBox(-5.7F, 0.0F, 0.0F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8369F, 3.8706F, -2.9116F, 0.0F, -0.0698F, -0.6545F));

		PartDefinition cube_r67 = ForelimbL2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(18, 95).addBox(-1.125F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.417F, 2.7811F, 0.2871F, 0.0F, 0.0175F, -0.6545F));

		PartDefinition cube_r68 = ForelimbL2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(90, 18).addBox(0.3F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.1229F, 3.3227F, -2.3116F, 0.0F, -0.3927F, -0.6545F));

		PartDefinition cube_r69 = ForelimbL2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(103, 51).addBox(-0.6F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.0249F, 1.7129F, -1.5708F, -3.0548F, -1.0455F, 2.3645F));

		PartDefinition cube_r70 = ForelimbL2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(14, 103).addBox(0.0F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.0249F, 1.7129F, -1.5708F, -0.1282F, -1.3065F, -0.5462F));

		PartDefinition cube_r71 = ForelimbL2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(26, 101).addBox(-3.0F, 0.2F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(89, 98).addBox(-2.325F, 0.2F, 1.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r72 = ForelimbL2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(7, 103).addBox(-2.0F, -0.5F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7456F, 0.7437F, -1.0218F, 0.0042F, 0.0959F, -0.6543F));

		PartDefinition cube_r73 = ForelimbL2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(25, 111).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1893F, -0.0621F, 0.4711F, 3.0851F, 0.715F, 2.4155F));

		PartDefinition cube_r74 = ForelimbL2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(111, 22).addBox(-0.975F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0966F, 0.2333F, -0.6116F, 0.2024F, 1.3569F, -0.4911F));

		PartDefinition cube_r75 = ForelimbL2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 103).addBox(-1.5F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0966F, 0.2333F, -0.6116F, 0.0185F, 0.401F, -0.6507F));

		PartDefinition cube_r76 = ForelimbL2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(102, 80).addBox(-0.025F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-2.3493F, 1.3631F, 1.3884F, 0.0F, 0.4669F, -0.6545F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8738F, 4.7509F, 2.0219F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(97, 5).addBox(-0.1472F, 0.6272F, -0.7369F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9301F, 1.3696F, -1.2884F, -0.0825F, -0.3007F, -1.4243F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(91, 76).addBox(-0.5F, -1.2146F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6813F, 1.9909F, 0.8668F, 1.2627F, -0.1391F, 1.0836F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(94, 56).addBox(-0.4505F, 0.1153F, 1.311F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.9301F, 1.3696F, -1.2884F, -2.857F, -0.9607F, 2.289F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(96, 85).addBox(-1.8942F, 0.1153F, -0.9254F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9301F, 1.3696F, -1.2884F, -0.1683F, -0.2817F, -0.5701F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(44, 85).addBox(-0.5F, -0.7583F, -1.5516F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6813F, 1.9909F, 0.8668F, 1.6118F, -0.1391F, 1.0836F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(110, 53).addBox(-0.5F, 0.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(110, 50).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6262F, -0.0229F, 1.9961F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 96).addBox(-0.5F, -1.2F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6262F, 0.2799F, 0.2691F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(75, 99).addBox(-0.5F, -0.9648F, -0.0431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6262F, 1.8814F, -0.0769F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(7, 99).addBox(-0.5F, -0.0648F, -0.0431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6262F, 1.2179F, -0.6849F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 89).addBox(-0.5F, -0.7183F, -2.108F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6262F, -0.9324F, -0.2534F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(36, 97).addBox(-0.5F, -2.0319F, -0.0039F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6262F, -2.7324F, 0.7466F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(78, 31).addBox(-0.5F, -0.0319F, -0.9039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6262F, -0.9324F, -0.2534F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -0.035F, -0.5874F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6262F, -1.7492F, -1.0168F, 1.6755F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8738F, 4.7509F, 2.0219F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(-2.8528F, 0.6272F, -0.7369F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9301F, 1.3696F, -1.2884F, -0.0825F, 0.3007F, 1.4243F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(91, 76).mirror().addBox(-0.5F, -1.2146F, -1.7052F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6813F, 1.9909F, 0.8668F, 1.2627F, 0.1391F, -1.0836F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(-2.5495F, 0.1153F, 1.311F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.9301F, 1.3696F, -1.2884F, -2.857F, 0.9607F, -2.289F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(96, 85).mirror().addBox(-1.1058F, 0.1153F, -0.9254F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9301F, 1.3696F, -1.2884F, -0.1683F, 0.2817F, 0.5701F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 85).mirror().addBox(-0.5F, -0.7583F, -1.5516F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6813F, 1.9909F, 0.8668F, 1.6118F, 0.1391F, -1.0836F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(110, 53).mirror().addBox(-0.5F, 0.0F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(110, 50).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, -0.0229F, 1.9961F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(51, 96).mirror().addBox(-0.5F, -1.2F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, 0.2799F, 0.2691F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(75, 99).mirror().addBox(-0.5F, -0.9648F, -0.0431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, 1.8814F, -0.0769F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(7, 99).mirror().addBox(-0.5F, -0.0648F, -0.0431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, 1.2179F, -0.6849F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(-0.5F, -0.7183F, -2.108F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, -0.9324F, -0.2534F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(36, 97).mirror().addBox(-0.5F, -2.0319F, -0.0039F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, -2.7324F, 0.7466F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(78, 31).mirror().addBox(-0.5F, -0.0319F, -0.9039F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, -0.9324F, -0.2534F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.5F, -0.035F, -0.5874F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6262F, -1.7492F, -1.0168F, 1.6755F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5931F, 9.6655F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(111, 115).addBox(-1.0F, -1.3F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6014F, 5.9278F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(115, 102).addBox(-1.0F, -1.3368F, 0.0235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2418F, 3.8854F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(115, 52).addBox(-1.0F, -1.2851F, -0.0863F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1626F, 2.0399F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(115, 48).addBox(-1.0F, -1.275F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -2.0F, 0.05F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 10.8854F, -2.019F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(25, 36).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(105, 97).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.2889F, 0.2756F, -0.7901F));

		PartDefinition cube_r110 = Body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(105, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.3774F, 0.138F, -0.3665F));

		PartDefinition cube_r111 = Body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-11.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2533F, 6.2503F, 0.1267F, 0.3768F, -1.2862F));

		PartDefinition cube_r112 = Body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(105, 93).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.2917F, 0.2848F, -0.7891F));

		PartDefinition cube_r113 = Body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.3836F, 0.1453F, -0.3654F));

		PartDefinition cube_r114 = Body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(56, 20).mirror().addBox(-11.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8783F, 4.2503F, 0.1246F, 0.3862F, -1.2868F));

		PartDefinition cube_r115 = Body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-11.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3533F, 2.2503F, 0.1174F, 0.3699F, -1.2895F));

		PartDefinition cube_r116 = Body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-11.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1467F, 0.3503F, 0.1227F, 0.3866F, -1.2875F));

		PartDefinition cube_r117 = Body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(105, 89).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1467F, 0.3503F, 0.2903F, 0.286F, -0.7895F));

		PartDefinition cube_r118 = Body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 105).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1467F, 0.3503F, 0.3829F, 0.147F, -0.3655F));

		PartDefinition cube_r119 = Body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(105, 87).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3533F, 2.2503F, 0.2775F, 0.2736F, -0.793F));

		PartDefinition cube_r120 = Body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3533F, 2.2503F, 0.3665F, 0.1407F, -0.3678F));

		PartDefinition cube_r121 = Body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(105, 97).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.2889F, -0.2756F, 0.7901F));

		PartDefinition cube_r122 = Body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(105, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.3774F, -0.138F, 0.3665F));

		PartDefinition cube_r123 = Body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(56, 31).addBox(2.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2533F, 6.2503F, 0.1267F, -0.3768F, 1.2862F));

		PartDefinition cube_r124 = Body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(105, 93).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.2917F, -0.2848F, 0.7891F));

		PartDefinition cube_r125 = Body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(105, 91).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.3836F, -0.1453F, 0.3654F));

		PartDefinition cube_r126 = Body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(56, 20).addBox(2.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8783F, 4.2503F, 0.1246F, -0.3862F, 1.2868F));

		PartDefinition cube_r127 = Body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(54, 18).addBox(2.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3533F, 2.2503F, 0.1174F, -0.3699F, 1.2895F));

		PartDefinition cube_r128 = Body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 16).addBox(2.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1467F, 0.3503F, 0.1227F, -0.3866F, 1.2875F));

		PartDefinition cube_r129 = Body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(105, 89).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1467F, 0.3503F, 0.2903F, -0.286F, 0.7895F));

		PartDefinition cube_r130 = Body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(89, 105).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1467F, 0.3503F, 0.3829F, -0.147F, 0.3655F));

		PartDefinition cube_r131 = Body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(105, 87).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3533F, 2.2503F, 0.2775F, -0.2736F, 0.793F));

		PartDefinition cube_r132 = Body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(105, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3533F, 2.2503F, 0.3665F, -0.1407F, 0.3678F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition cube_r133 = Body10.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(116, 21).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Body10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(21, 116).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Body10.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(18, 116).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9032F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Body10.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(114, 115).addBox(-1.0F, -1.2F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Body10.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(44, 36).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Body10.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.3291F, 0.3348F, -0.83F));

		PartDefinition cube_r139 = Body10.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(106, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4373F, 0.1763F, -0.4091F));

		PartDefinition cube_r140 = Body10.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-9.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.1324F, 0.4471F, -1.3359F));

		PartDefinition cube_r141 = Body10.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(106, 2).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3396F, 0.3378F, -0.8267F));

		PartDefinition cube_r142 = Body10.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.4477F, 0.175F, -0.4075F));

		PartDefinition cube_r143 = Body10.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1404F, 0.4545F, -1.3326F));

		PartDefinition cube_r144 = Body10.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(30, 66).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1443F, 0.4536F, -1.2787F));

		PartDefinition cube_r145 = Body10.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1443F, 0.4536F, -1.2787F));

		PartDefinition cube_r146 = Body10.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3424F, 0.3352F, -0.7736F));

		PartDefinition cube_r147 = Body10.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(103, 105).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4491F, 0.1716F, -0.355F));

		PartDefinition cube_r148 = Body10.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(105, 101).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3424F, 0.3352F, -0.7736F));

		PartDefinition cube_r149 = Body10.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(105, 99).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.4491F, 0.1716F, -0.355F));

		PartDefinition cube_r150 = Body10.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(106, 6).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.3291F, -0.3348F, 0.83F));

		PartDefinition cube_r151 = Body10.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(106, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4373F, -0.1763F, 0.4091F));

		PartDefinition cube_r152 = Body10.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(72, 61).addBox(2.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.1324F, -0.4471F, 1.3359F));

		PartDefinition cube_r153 = Body10.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(106, 2).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3396F, -0.3378F, 0.8267F));

		PartDefinition cube_r154 = Body10.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(106, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.4477F, -0.175F, 0.4075F));

		PartDefinition cube_r155 = Body10.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(49, 67).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1404F, -0.4545F, 1.3326F));

		PartDefinition cube_r156 = Body10.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 66).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1443F, -0.4536F, 1.2787F));

		PartDefinition cube_r157 = Body10.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(49, 65).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1443F, -0.4536F, 1.2787F));

		PartDefinition cube_r158 = Body10.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 11).addBox(-4.5F, -2.0F, 0.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 10.9846F, -0.924F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Body10.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 106).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3424F, -0.3352F, 0.7736F));

		PartDefinition cube_r160 = Body10.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(103, 105).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4491F, -0.1716F, 0.355F));

		PartDefinition cube_r161 = Body10.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(105, 101).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3424F, -0.3352F, 0.7736F));

		PartDefinition cube_r162 = Body10.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(105, 99).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.4491F, -0.1716F, 0.355F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Body11.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(76, 116).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5823F, 5.8297F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Body11.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(73, 116).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2007F, 3.8664F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Body11.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(64, 116).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1809F, 1.9031F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Body11.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(28, 116).addBox(-1.0F, -1.4F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Body11.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Body11.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(106, 20).mirror().addBox(-1.9574F, -0.095F, -0.5732F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.4779F, 0.1936F, -0.5066F));

		PartDefinition cube_r169 = Body11.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(98, 83).mirror().addBox(-3.7344F, -0.9134F, -0.5589F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.3604F, 0.3669F, -0.9242F));

		PartDefinition cube_r170 = Body11.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 81).mirror().addBox(-6.8907F, -2.5345F, -0.5589F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0534F, 6.3503F, 0.1437F, 0.4895F, -1.4358F));

		PartDefinition cube_r171 = Body11.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(106, 14).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3271F, 0.3249F, -0.8308F));

		PartDefinition cube_r172 = Body11.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(14, 106).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.4315F, 0.168F, -0.4102F));

		PartDefinition cube_r173 = Body11.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-7.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.1359F, 0.4376F, -1.3346F));

		PartDefinition cube_r174 = Body11.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(-8.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r175 = Body11.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-9.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.1388F, 0.4369F, -1.2811F));

		PartDefinition cube_r176 = Body11.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(106, 12).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r177 = Body11.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(106, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition cube_r178 = Body11.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(106, 8).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3292F, 0.323F, -0.7778F));

		PartDefinition cube_r179 = Body11.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(7, 106).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.4325F, 0.1655F, -0.3578F));

		PartDefinition cube_r180 = Body11.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(91, 81).addBox(2.8907F, -2.5345F, -0.5589F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.1437F, -0.4895F, 1.4358F));

		PartDefinition cube_r181 = Body11.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 83).addBox(1.7344F, -0.9134F, -0.5589F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.3604F, -0.3669F, 0.9242F));

		PartDefinition cube_r182 = Body11.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(106, 20).addBox(-0.0426F, -0.095F, -0.5732F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0534F, 6.3503F, 0.4779F, -0.1936F, 0.5066F));

		PartDefinition cube_r183 = Body11.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(106, 14).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3271F, -0.3249F, 0.8308F));

		PartDefinition cube_r184 = Body11.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(14, 106).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.4315F, -0.168F, 0.4102F));

		PartDefinition cube_r185 = Body11.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(85, 83).addBox(2.9916F, -2.5101F, -0.4853F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.1359F, -0.4376F, 1.3346F));

		PartDefinition cube_r186 = Body11.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(75, 17).addBox(2.9916F, -2.5101F, -0.4853F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r187 = Body11.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(73, 29).addBox(2.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.1388F, -0.4369F, 1.2811F));

		PartDefinition cube_r188 = Body11.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(106, 12).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r189 = Body11.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(106, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition cube_r190 = Body11.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 22).addBox(-3.5F, -2.0F, 0.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 9.9902F, -1.0072F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Body11.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(106, 8).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3292F, -0.323F, 0.7778F));

		PartDefinition cube_r192 = Body11.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(7, 106).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.4325F, -0.1655F, 0.3578F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(89, 31).addBox(-1.5F, -1.0354F, 0.0444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Body4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(28, 106).mirror().addBox(-1.9933F, -0.0399F, -0.8991F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2627F, 2.7526F, 0.538F, 0.2596F, -0.7545F));

		PartDefinition cube_r195 = Body4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(102, 44).mirror().addBox(-3.7926F, -0.8791F, -0.8844F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2627F, 2.7526F, 0.3895F, 0.4509F, -1.174F));

		PartDefinition cube_r196 = Body4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(106, 26).mirror().addBox(-1.9957F, -0.0327F, -0.8671F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1373F, 0.7526F, 0.4626F, 0.1846F, -0.5793F));

		PartDefinition cube_r197 = Body4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(99, 20).mirror().addBox(-3.7976F, -0.8735F, -0.8524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1373F, 0.7526F, 0.3496F, 0.3524F, -0.9979F));

		PartDefinition cube_r198 = Body4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-4.9652F, -2.5284F, -0.8524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1373F, 0.7526F, 0.1417F, 0.472F, -1.5066F));

		PartDefinition cube_r199 = Body4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(106, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 5.832F, 0.4438F, 0.3379F, -0.9807F));

		PartDefinition cube_r200 = Body4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(106, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 4.232F, 0.5493F, 0.3489F, -0.7112F));

		PartDefinition cube_r201 = Body4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(106, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 5.832F, 0.4438F, -0.3379F, 0.9807F));

		PartDefinition cube_r202 = Body4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(106, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 4.232F, 0.5493F, -0.3489F, 0.7112F));

		PartDefinition cube_r203 = Body4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(31, 116).addBox(0.0F, -1.3F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5132F, 5.9324F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Body4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(67, 116).addBox(0.0F, -1.5F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4318F, 3.9083F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Body4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(70, 116).addBox(0.0F, -1.5F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0564F, 1.9054F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Body4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(55, 116).addBox(-1.0F, -1.3648F, 0.0357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3804F, 0.0194F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Body4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(102, 44).addBox(1.7926F, -0.8791F, -0.8844F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2627F, 2.7526F, 0.3895F, -0.4509F, 1.174F));

		PartDefinition cube_r208 = Body4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(28, 106).addBox(-0.0067F, -0.0399F, -0.8991F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2627F, 2.7526F, 0.538F, -0.2596F, 0.7545F));

		PartDefinition cube_r209 = Body4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(76, 52).addBox(2.9652F, -2.5284F, -0.8524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1373F, 0.7526F, 0.1417F, -0.472F, 1.5066F));

		PartDefinition cube_r210 = Body4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(99, 20).addBox(1.7976F, -0.8735F, -0.8524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1373F, 0.7526F, 0.3496F, -0.3524F, 0.9979F));

		PartDefinition cube_r211 = Body4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(54, 10).addBox(-3.5F, -2.075F, 7.65F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 8.5996F, -8.7049F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(106, 26).addBox(-0.0043F, -0.0327F, -0.8671F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1373F, 0.7526F, 0.4626F, -0.1846F, 0.5793F));

		PartDefinition cube_r213 = Body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(52, 79).addBox(-1.5F, -0.0648F, 0.1357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 5.5481F, 5.9413F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r214 = bone.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(21, 107).addBox(0.2737F, 0.7247F, -1.2364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8635F, 1.5141F, -0.3074F, 1.8187F, -0.417F, 0.9115F));

		PartDefinition cube_r215 = bone.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(112, 33).addBox(0.2737F, 0.0595F, -2.1408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8635F, 1.5141F, -0.3074F, 2.735F, -0.417F, 0.9115F));

		PartDefinition cube_r216 = bone.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(86, 22).addBox(0.2737F, 0.6068F, -1.3657F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8635F, 1.5141F, -0.3074F, 2.1678F, -0.417F, 0.9115F));

		PartDefinition cube_r217 = bone.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(40, 102).addBox(0.2163F, -0.8819F, -1.0611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8635F, 1.5141F, -0.3074F, 1.683F, 0.1261F, 0.9856F));

		PartDefinition cube_r218 = bone.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(113, 12).addBox(0.2163F, -0.6113F, -1.9943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 113).addBox(0.2163F, -1.6113F, -1.9943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 5).addBox(0.2163F, -1.1113F, -0.9943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.8635F, 1.5141F, -0.3074F, 1.4212F, 0.1261F, 0.9856F));

		PartDefinition cube_r219 = bone.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(33, 102).addBox(0.2163F, -1.287F, -1.3888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8635F, 1.5141F, -0.3074F, 1.1507F, 0.1261F, 0.9856F));

		PartDefinition cube_r220 = bone.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(89, 101).addBox(-0.5F, -0.975F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8881F, -3.6639F, -0.0368F, 1.499F, -0.0607F, -0.2118F));

		PartDefinition cube_r221 = bone.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(112, 96).addBox(-0.5F, -1.225F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.927F, -3.8063F, 0.0977F, 2.0052F, -0.0607F, -0.2118F));

		PartDefinition cube_r222 = bone.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(101, 59).addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4646F, -1.8405F, -0.5406F, 1.3943F, -0.0607F, -0.2118F));

		PartDefinition cube_r223 = bone.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(102, 40).addBox(-0.6F, -0.05F, 0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.003F, -0.2082F, -0.7682F, 1.8306F, -0.0607F, -0.2118F));

		PartDefinition cube_r224 = bone.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(51, 110).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, -0.0607F, -0.2118F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5481F, 5.9413F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r225 = bone4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(21, 107).mirror().addBox(-1.2737F, 0.7247F, -1.2364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8635F, 1.5141F, -0.3074F, 1.8187F, 0.417F, -0.9115F));

		PartDefinition cube_r226 = bone4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(112, 33).mirror().addBox(-1.2737F, 0.0595F, -2.1408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.8635F, 1.5141F, -0.3074F, 2.735F, 0.417F, -0.9115F));

		PartDefinition cube_r227 = bone4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(86, 22).mirror().addBox(-1.2737F, 0.6068F, -1.3657F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.8635F, 1.5141F, -0.3074F, 2.1678F, 0.417F, -0.9115F));

		PartDefinition cube_r228 = bone4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(40, 102).mirror().addBox(-1.2163F, -0.8819F, -1.0611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.8635F, 1.5141F, -0.3074F, 1.683F, -0.1261F, -0.9856F));

		PartDefinition cube_r229 = bone4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(113, 12).mirror().addBox(-1.2163F, -0.6113F, -1.9943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 113).mirror().addBox(-1.2163F, -1.6113F, -1.9943F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 5).mirror().addBox(-1.2163F, -1.1113F, -0.9943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.8635F, 1.5141F, -0.3074F, 1.4212F, -0.1261F, -0.9856F));

		PartDefinition cube_r230 = bone4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(33, 102).mirror().addBox(-1.2163F, -1.287F, -1.3888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.8635F, 1.5141F, -0.3074F, 1.1507F, -0.1261F, -0.9856F));

		PartDefinition cube_r231 = bone4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(89, 101).mirror().addBox(-0.5F, -0.975F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8881F, -3.6639F, -0.0368F, 1.499F, 0.0607F, 0.2118F));

		PartDefinition cube_r232 = bone4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(112, 96).mirror().addBox(-0.5F, -1.225F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.927F, -3.8063F, 0.0977F, 2.0052F, 0.0607F, 0.2118F));

		PartDefinition cube_r233 = bone4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-0.5F, -0.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4646F, -1.8405F, -0.5406F, 1.3943F, 0.0607F, 0.2118F));

		PartDefinition cube_r234 = bone4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-0.4F, -0.05F, 0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.003F, -0.2082F, -0.7682F, 1.8306F, 0.0607F, 0.2118F));

		PartDefinition cube_r235 = bone4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(51, 110).mirror().addBox(-0.4F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3245F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3555F, 6.8611F, 5.3481F, 0.5007F, -0.1874F, 0.0757F));

		PartDefinition cube_r236 = HindlimbL.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(31, 31).addBox(-5.5F, 0.0F, -1.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8162F, 5.5717F, 0.7927F, 0.0F, -0.0873F, 0.6109F));

		PartDefinition cube_r237 = HindlimbL.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(56, 33).addBox(0.15F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1969F, 2.3373F, -0.0733F, -3.1416F, -0.4625F, -2.5307F));

		PartDefinition cube_r238 = HindlimbL.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(25, 33).addBox(-1.7F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1683F, 2.3172F, 1.9264F, 3.1416F, -1.5533F, -2.5307F));

		PartDefinition cube_r239 = HindlimbL.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(10, 111).addBox(-0.375F, -0.5F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1299F, 1.5901F, 1.6214F, 0.0F, -0.8029F, 0.6109F));

		PartDefinition cube_r240 = HindlimbL.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(82, 103).addBox(-1.5F, -0.5F, 0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3449F, 1.0405F, -0.5073F, 0.0F, -0.3927F, 0.6109F));

		PartDefinition cube_r241 = HindlimbL.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(56, 69).addBox(-0.3F, 0.0F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, 0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3555F, 6.8611F, 5.3481F, 0.6521F, 0.2016F, -0.2662F));

		PartDefinition cube_r242 = HindlimbL2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(0, 33).addBox(-2.5F, 0.0F, -1.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8162F, 5.5717F, 0.7927F, 0.0F, 0.0873F, -0.6109F));

		PartDefinition cube_r243 = HindlimbL2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(44, 82).addBox(-2.15F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1969F, 2.3373F, -0.0733F, -3.1416F, 0.4625F, 2.5307F));

		PartDefinition cube_r244 = HindlimbL2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(27, 90).addBox(0.7F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1683F, 2.3172F, 1.9264F, 3.1416F, 1.5533F, 2.5307F));

		PartDefinition cube_r245 = HindlimbL2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(111, 106).addBox(-0.625F, -0.5F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.1299F, 1.5901F, 1.6214F, 0.0F, 0.8029F, -0.6109F));

		PartDefinition cube_r246 = HindlimbL2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(96, 103).addBox(-0.5F, -0.5F, 0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3449F, 1.0405F, -0.5073F, 0.0F, 0.3927F, -0.6109F));

		PartDefinition cube_r247 = HindlimbL2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(88, 10).addBox(-3.7F, 0.0F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8617F, 6.7871F, -0.0007F, 0.0859F, -0.0152F));

		PartDefinition cube_r248 = Body5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(79, 116).addBox(-1.0F, -1.35F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 114).addBox(-1.0F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 114).addBox(-1.0F, -1.25F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 55).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Body5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(6, 114).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r250 = Body5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(3, 114).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.413F, 5.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r251 = Body5.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 114).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Body5.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(-1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2481F, 3.4244F, -0.0147F, -0.0094F, -0.5672F));

		PartDefinition cube_r253 = Body5.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(76, 46).addBox(0.0F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2481F, 3.4244F, -0.0147F, 0.0094F, 0.5672F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.1396F, 0.0422F, 0.0174F));

		PartDefinition cube_r254 = Body6.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(108, 113).addBox(-1.0F, -1.925F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 116).addBox(-1.0F, -1.875F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 80).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Body6.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(39, 73).addBox(0.0F, 1.2999F, 1.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 116).addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 0.6101F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Body6.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(89, 94).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1317F, 2.045F, 0.0151F, 0.0087F, -0.5235F));

		PartDefinition cube_r257 = Body6.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(89, 94).addBox(0.0F, 0.0F, -2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1317F, 2.045F, 0.0151F, -0.0087F, 0.5235F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r258 = Body9.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(34, 116).addBox(-1.0F, -1.875F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 113).addBox(-1.0F, -1.9F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 80).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r259 = Body9.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(115, 56).addBox(0.0F, 2.3998F, 3.5175F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3907F, -3.3899F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r260 = Body9.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1404F, 1.545F, 0.0151F, 0.0087F, -0.5235F));

		PartDefinition cube_r261 = Body9.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1404F, 1.545F, 0.0151F, -0.0087F, 0.5235F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0209F, 4.003F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r262 = Body7.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(43, 116).addBox(-1.0F, -1.2912F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2595F, 4.0417F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Body7.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(40, 116).addBox(-1.0F, -1.3162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3119F, 2.0424F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Body7.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(37, 116).addBox(-1.0F, -1.3162F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Body7.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(39, 76).mirror().addBox(-1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1846F, 2.52F, -0.0227F, -0.0131F, -0.5235F));

		PartDefinition cube_r266 = Body7.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(39, 76).addBox(0.0F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1846F, 2.52F, -0.0227F, 0.0131F, 0.5235F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 4.925F, 0.0087F, -0.0436F, -0.0004F));

		PartDefinition cube_r267 = Body8.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(49, 116).addBox(-1.0F, -1.3162F, -0.1096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1873F, 3.1353F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r268 = Body8.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(46, 116).addBox(-1.0F, -1.3662F, -0.8096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1604F, 1.8315F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r269 = Body8.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(9, 95).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1846F, 2.52F, -0.0227F, -0.0131F, -0.5235F));

		PartDefinition cube_r270 = Body8.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(9, 95).addBox(0.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1846F, 2.52F, -0.0227F, 0.0131F, 0.5235F));

		PartDefinition cube_r271 = Body8.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(68, 65).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body12 = Body8.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 5.0F, -0.0783F, -0.2182F, -0.0019F));

		PartDefinition cube_r272 = Body12.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(47, 102).addBox(-1.0F, -0.9162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2595F, 4.0417F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Body12.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(52, 76).addBox(-1.0F, -1.0162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3119F, 2.0424F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Body12.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(52, 116).addBox(-1.0F, -1.0662F, -0.0096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r275 = Body12.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(43, 69).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 4.975F, -0.0792F, -0.1305F, 0.0103F));

		PartDefinition cube_r276 = Body13.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(50, 107).addBox(-1.0F, -0.9162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.251F, 1.0367F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r277 = Body13.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(89, 89).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.075F, 2.925F, -0.2978F, -0.0834F, 0.0256F));

		PartDefinition cube_r278 = Body14.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(81, 69).addBox(-1.0F, -0.8162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3119F, 2.0424F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r279 = Body14.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 116).addBox(-1.0F, -0.8162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r280 = Body14.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(58, 96).addBox(-1.0F, -0.5377F, 0.9915F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 0).addBox(-1.5F, 0.0623F, -0.0085F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 3.0431F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r281 = Body14.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 90).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0258F, 5.5521F, -0.7524F, 0.0638F, -0.0596F));

		PartDefinition cube_r282 = Body15.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(72, 54).addBox(-1.5F, -0.985F, -0.0367F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.7358F, 5.0431F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r283 = Body15.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body17 = Body15.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0558F, 9.8009F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r284 = Body17.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(75, 10).addBox(-1.5F, -0.985F, -0.0366F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.7358F, 5.0431F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r285 = Body17.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(73, 22).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body19 = Body17.addOrReplaceChild("Body19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4395F, 9.6533F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r286 = Body19.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(80, 37).addBox(-1.5F, -0.985F, -0.0366F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.7358F, 5.0431F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r287 = Body19.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(26, 73).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body20 = Body19.addOrReplaceChild("Body20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1434F, 4.9595F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1434F, 4.9595F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1434F, 4.9595F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Head = Temnodontosaurus.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(11, 86).addBox(-2.0536F, -3.2742F, -2.2481F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition cube_r288 = Head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(71, 110).addBox(-1.0F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.5574F, -27.504F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r289 = Head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(66, 110).addBox(-1.0F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.4007F, -26.5417F, 0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r290 = Head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(61, 110).addBox(-1.0F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.3072F, -25.5711F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r291 = Head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(100, 76).addBox(-1.0F, -0.1F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.2512F, -23.5705F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r292 = Head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(93, 41).addBox(-1.0F, -0.1F, -3.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.1073F, -20.574F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r293 = Head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(27, 93).addBox(-1.0F, -1.0F, -3.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.9566F, -17.6587F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r294 = Head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(92, 61).addBox(-1.0F, -1.0F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.8466F, -14.8609F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r295 = Head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(100, 36).addBox(-1.0F, -0.6F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4464F, 0.2483F, -12.911F, 0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(42, 92).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.3113F, -9.9637F, 0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r297 = Head.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(95, 22).addBox(-1.0F, -0.6F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.5869F, -9.0024F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r298 = Head.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(103, 54).addBox(-1.0F, -0.9831F, -0.5531F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, -0.5639F, -7.844F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r299 = Head.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(69, 72).addBox(-2.5F, -0.0257F, -1.9874F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -1.7926F, 0.6041F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r300 = Head.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(63, 41).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(80, 43).addBox(-2.5F, 0.4F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0536F, -2.5379F, -0.044F, -2.138F, 0.0F, 0.0F));

		PartDefinition cube_r301 = Head.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(77, 19).addBox(-3.0F, -0.0257F, -0.9874F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4464F, -1.7926F, 0.6041F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r302 = Head.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(13, 73).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -3.2771F, -2.2493F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r303 = Head.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(77, 5).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.6061F, -7.9039F, 0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r304 = Head.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(33, 82).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -2.5674F, -6.1603F, 0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r305 = Head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(80, 77).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -2.9888F, -4.2279F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r306 = Head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(42, 46).addBox(-1.0F, -0.6F, -5.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -0.2946F, -8.5997F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r307 = Head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(28, 68).addBox(-2.5F, -1.9675F, -0.0193F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 0.5529F, -0.7399F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r308 = Head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(13, 68).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 0.1262F, -2.0326F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r309 = Head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(22, 86).addBox(-2.0F, -1.9971F, 0.0168F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 1.5663F, -2.2934F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r310 = Head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(85, 85).addBox(-2.0F, -1.9971F, 0.0168F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 1.973F, -3.207F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r311 = Head.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(77, 0).addBox(-2.0F, -2.0152F, 0.0014F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 2.3346F, -5.1505F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r312 = Head.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(56, 72).addBox(-2.0F, -1.925F, -1.725F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 0.2553F, -5.3535F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(54, 106).addBox(-0.5F, -1.375F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.1253F, 6.1179F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(109, 39).addBox(-0.5F, -0.275F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 0.2434F, 5.942F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(108, 62).addBox(-0.5F, -0.7F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.4027F, 7.0486F, 2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(81, 106).addBox(-0.5F, -0.1659F, 1.1302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.375F, 0.2853F, 1.9776F, 0.6283F, 0.0698F, 0.0F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(96, 106).addBox(-0.5F, -0.4374F, 0.4866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.375F, 0.2853F, 1.9776F, 0.4189F, 0.0698F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(98, 98).addBox(-0.5F, -0.597F, -1.1422F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.375F, 0.2853F, 1.9776F, 0.1745F, 0.0698F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 88).addBox(-0.5F, -0.39F, -2.8412F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.375F, 0.2853F, 1.9776F, -0.0175F, 0.0698F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(99, 8).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.4027F, 7.0486F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(101, 107).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -0.8333F, 6.7137F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(99, 12).addBox(-0.5F, -0.5852F, -0.8864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3039F, 0.646F, -20.9286F, 0.192F, 0.0785F, 0.0034F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(82, 99).addBox(-0.5F, -0.405F, -1.0478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.3039F, 0.646F, -20.9286F, 0.0175F, 0.0785F, 0.0034F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(15, 60).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1713F, -0.4199F, -14.0825F, 0.061F, 0.0261F, 0.0034F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(58, 22).addBox(-1.2724F, -0.6596F, -16.9714F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1174F, 0.9405F, -3.1466F, -0.0089F, 0.0261F, 0.0034F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(63, 33).addBox(-0.8879F, -1.0202F, -11.0231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(61, 46).addBox(-0.8879F, -0.4202F, -11.0231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1174F, 0.9405F, -3.1466F, -0.0306F, 0.061F, 0.0034F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(35, 10).addBox(-0.5F, -0.175F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5882F, -0.5914F, -6.2976F, 0.1483F, 0.1177F, 0.002F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(35, 0).addBox(0.0026F, -0.6726F, -2.0391F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3061F, 0.7621F, -8.0655F, 0.0959F, 0.1177F, 0.002F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(40, 113).addBox(-0.5F, -0.5875F, -6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 113).addBox(-0.5F, -0.5875F, -5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 113).addBox(-0.5F, -0.5875F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 25).addBox(-0.5F, -0.5875F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 113).addBox(-0.5F, -0.5875F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 18).addBox(-0.5F, -0.5875F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 15).addBox(-0.5F, -0.5875F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2124F, 1.3167F, -15.8764F, -0.0001F, 0.0305F, 0.0021F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(112, 74).addBox(-0.5F, -0.5875F, -7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(112, 45).addBox(-0.5F, -0.5875F, -6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(112, 36).addBox(-0.5F, -0.5375F, -5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 9).addBox(-0.5F, -0.5125F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 6).addBox(-0.5F, -0.4625F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 3).addBox(-0.5F, -0.4625F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 0).addBox(-0.5F, -0.4625F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(111, 112).addBox(-0.5F, -0.4125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8626F, 1.3181F, -8.5848F, -0.0001F, 0.0479F, 0.0021F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(107, 75).addBox(-0.5F, -0.625F, -5.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 110).addBox(-0.5F, -0.575F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 78).addBox(-0.5F, -0.55F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 71).addBox(-0.5F, -0.525F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 68).addBox(-0.5F, -0.525F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 65).addBox(-0.5F, -0.525F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 42).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1701F, 1.5576F, -2.7257F, -0.0001F, 0.1177F, 0.002F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(57, 55).addBox(0.0026F, -0.3976F, -0.0391F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.3061F, 0.7621F, -8.0655F, -0.035F, 0.1177F, 0.002F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(98, 31).addBox(-0.5F, -1.5F, -0.725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0597F, 1.1539F, -1.9156F, -0.1675F, 0.1997F, -0.0083F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(15, 56).addBox(-1.0F, -2.3474F, -4.0033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(50, 101).addBox(-1.0F, -2.7724F, -4.0033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.025F, -2.9544F, 2.5894F, 1.7802F, 0.1004F, 0.0F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(84, 69).addBox(-1.0F, -0.8297F, -0.0525F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9106F, -2.5719F, 2.4516F, -0.1303F, 0.0311F, 0.0091F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(19, 38).addBox(-1.0F, -1.0128F, -1.7643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.4544F, 3.3394F, 0.0785F, 0.1004F, 0.0F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 99).addBox(-0.1375F, -0.8F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 52).addBox(-0.3875F, -1.3F, -1.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3587F, -0.2205F, 0.5884F, 1.693F, 0.1004F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(40, 106).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5928F, -0.016F, 3.2875F, 0.8465F, 0.1004F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(108, 59).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.591F, -1.0158F, 3.2702F, 0.0175F, 0.1004F, 0.0F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(26, 108).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5221F, -1.7412F, 2.5853F, -0.8116F, 0.1004F, 0.0F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(15, 108).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4305F, -2.148F, 1.6763F, -1.9897F, 0.1004F, 0.0F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(35, 106).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3304F, -2.1741F, 0.6817F, 3.1154F, 0.1004F, 0.0F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(10, 108).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.233F, -1.9407F, -0.2858F, 1.8064F, 0.1004F, 0.0F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(5, 108).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1471F, -1.4256F, -1.1386F, 0.5411F, 0.1004F, 0.0F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(59, 106).addBox(-0.5344F, -1.8712F, -0.3428F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.2305F, 0.1178F, 0.0F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(15, 111).addBox(-0.4344F, 0.6262F, -0.1348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.8326F, 0.1178F, 0.0F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(86, 110).addBox(-0.3844F, 0.6523F, -1.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -0.9599F, 0.1178F, 0.0F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(76, 110).addBox(-0.4344F, 0.6086F, -1.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.1519F, 0.1178F, 0.0F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(36, 110).addBox(-0.5344F, -0.1476F, -0.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, 1.7279F, 0.1178F, 0.0F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(112, 81).addBox(-0.5344F, -0.6642F, -0.3876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, 3.0194F, 0.1178F, 0.0F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(81, 110).addBox(-0.5344F, 0.179F, -0.3082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.7628F, 0.1178F, 0.0F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(110, 56).addBox(-0.5344F, 0.2831F, -0.6598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 110).addBox(-0.5344F, -0.1169F, -0.6598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.4486F, 0.1178F, 0.0F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(31, 110).addBox(-0.5344F, -1.8251F, 0.1672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.0036F, 0.1178F, 0.0F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(91, 107).addBox(-0.6344F, -1.4103F, -0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.3963F, 0.1178F, 0.0F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(86, 107).addBox(-0.6344F, -0.7081F, -0.5332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.1747F, 0.4216F, -4.9306F, -1.6144F, 0.1178F, 0.0F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0875F, -0.6218F, -1.7305F, -0.637F, 0.1004F, 0.0F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(106, 107).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0761F, 0.3718F, -1.8431F, -1.6842F, 0.1004F, 0.0F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(9, 90).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1451F, 1.0972F, -1.1582F, -2.3824F, 0.1004F, 0.0F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(36, 93).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2412F, 1.3812F, -0.2042F, 2.8536F, 0.1004F, 0.0F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(80, 89).addBox(-1.0F, -2.1447F, -4.7293F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.025F, -2.9544F, 2.5894F, 1.4137F, 0.1004F, 0.0F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(63, 79).addBox(-1.0F, 0.3741F, -3.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.025F, -2.9544F, 2.5894F, 0.8639F, 0.1004F, 0.0F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(70, 99).addBox(-1.0F, -1.8053F, -4.3279F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.4544F, 3.3394F, 0.4189F, 0.1004F, 0.0F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(65, 99).addBox(-1.0F, -1.511F, -3.4711F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.4544F, 3.3394F, 0.3316F, 0.1004F, 0.0F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(21, 99).addBox(-1.0F, -1.2925F, -2.5919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -2.4544F, 3.3394F, 0.2443F, 0.1004F, 0.0F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(43, 97).addBox(-1.0F, -0.0181F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -2.3388F, -1.3144F, 0.5503F, 0.0835F, 0.0308F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(98, 93).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.5F, 0.2009F, 0.1309F, 0.0034F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(54, 106).mirror().addBox(-0.5F, -1.375F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1253F, 6.1179F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(109, 39).mirror().addBox(-0.5F, -0.275F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2434F, 5.942F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(108, 62).mirror().addBox(-0.5F, -0.7F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4027F, 7.0486F, 2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(81, 106).mirror().addBox(-0.5F, -0.1659F, 1.1302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.2853F, 1.9776F, 0.6283F, -0.0698F, 0.0F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(96, 106).mirror().addBox(-0.5F, -0.4374F, 0.4866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.2853F, 1.9776F, 0.4189F, -0.0698F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(-0.5F, -0.597F, -1.1422F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.2853F, 1.9776F, 0.1745F, -0.0698F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(98, 88).mirror().addBox(-0.5F, -0.39F, -2.8412F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.2853F, 1.9776F, -0.0175F, -0.0698F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(99, 8).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4027F, 7.0486F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(101, 107).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8333F, 6.7137F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(99, 12).mirror().addBox(-0.5F, -0.5852F, -0.8864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3039F, 0.646F, -20.9286F, 0.192F, -0.0785F, -0.0034F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(82, 99).mirror().addBox(-0.5F, -0.405F, -1.0478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.3039F, 0.646F, -20.9286F, 0.0175F, -0.0785F, -0.0034F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(15, 60).mirror().addBox(-0.5F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1713F, -0.4199F, -14.0825F, 0.061F, -0.0261F, -0.0034F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(0.2724F, -0.6596F, -16.9714F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1174F, 0.9405F, -3.1466F, -0.0089F, -0.0261F, -0.0034F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-0.1121F, -1.0202F, -11.0231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 46).mirror().addBox(-0.1121F, -0.4202F, -11.0231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.1174F, 0.9405F, -3.1466F, -0.0306F, -0.061F, -0.0034F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(35, 10).mirror().addBox(-0.5F, -0.175F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5882F, -0.5914F, -6.2976F, 0.1483F, -0.1177F, -0.002F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-1.0026F, -0.6726F, -2.0391F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3061F, 0.7621F, -8.0655F, 0.0959F, -0.1177F, -0.002F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(40, 113).mirror().addBox(-0.5F, -0.5875F, -6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 113).mirror().addBox(-0.5F, -0.5875F, -5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 113).mirror().addBox(-0.5F, -0.5875F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 25).mirror().addBox(-0.5F, -0.5875F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 113).mirror().addBox(-0.5F, -0.5875F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 18).mirror().addBox(-0.5F, -0.5875F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 15).mirror().addBox(-0.5F, -0.5875F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2124F, 1.3167F, -15.8764F, -0.0001F, -0.0305F, -0.0021F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(112, 74).mirror().addBox(-0.5F, -0.5875F, -7.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(112, 45).mirror().addBox(-0.5F, -0.5875F, -6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(112, 36).mirror().addBox(-0.5F, -0.5375F, -5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 9).mirror().addBox(-0.5F, -0.5125F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 6).mirror().addBox(-0.5F, -0.4625F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 3).mirror().addBox(-0.5F, -0.4625F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 0).mirror().addBox(-0.5F, -0.4625F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(111, 112).mirror().addBox(-0.5F, -0.4125F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8626F, 1.3181F, -8.5848F, -0.0001F, -0.0479F, -0.0021F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(107, 75).mirror().addBox(-0.5F, -0.625F, -5.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 110).mirror().addBox(-0.5F, -0.575F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 78).mirror().addBox(-0.5F, -0.55F, -4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 71).mirror().addBox(-0.5F, -0.525F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 68).mirror().addBox(-0.5F, -0.525F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 65).mirror().addBox(-0.5F, -0.525F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 42).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1701F, 1.5576F, -2.7257F, -0.0001F, -0.1177F, -0.002F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(57, 55).mirror().addBox(-1.0026F, -0.3976F, -0.0391F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.3061F, 0.7621F, -8.0655F, -0.035F, -0.1177F, -0.002F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(98, 31).mirror().addBox(-0.5F, -1.5F, -0.725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0597F, 1.1539F, -1.9156F, -0.1675F, -0.1997F, 0.0083F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(0.0F, -2.3474F, -4.0033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(50, 101).mirror().addBox(0.0F, -2.7724F, -4.0033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.9544F, 2.5894F, 1.7802F, -0.1004F, 0.0F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(0.0F, -0.8297F, -0.0525F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9106F, -2.5719F, 2.4516F, -0.1303F, -0.0311F, -0.0091F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(19, 38).mirror().addBox(0.0F, -1.0128F, -1.7643F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4544F, 3.3394F, 0.0785F, -0.1004F, 0.0F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.8625F, -0.8F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 52).mirror().addBox(-0.6125F, -1.3F, -1.4F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3587F, -0.2205F, 0.5884F, 1.693F, -0.1004F, 0.0F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5928F, -0.016F, 3.2875F, 0.8465F, -0.1004F, 0.0F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(108, 59).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.591F, -1.0158F, 3.2702F, 0.0175F, -0.1004F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(26, 108).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5221F, -1.7412F, 2.5853F, -0.8116F, -0.1004F, 0.0F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(15, 108).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4305F, -2.148F, 1.6763F, -1.9897F, -0.1004F, 0.0F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(35, 106).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3304F, -2.1741F, 0.6817F, 3.1154F, -0.1004F, 0.0F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(10, 108).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.233F, -1.9407F, -0.2858F, 1.8064F, -0.1004F, 0.0F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(5, 108).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1471F, -1.4256F, -1.1386F, 0.5411F, -0.1004F, 0.0F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(59, 106).mirror().addBox(-0.4656F, -1.8712F, -0.3428F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.2305F, -0.1178F, 0.0F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(15, 111).mirror().addBox(-0.5656F, 0.6262F, -0.1348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.8326F, -0.1178F, 0.0F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(86, 110).mirror().addBox(-0.6156F, 0.6523F, -1.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -0.9599F, -0.1178F, 0.0F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(76, 110).mirror().addBox(-0.5656F, 0.6086F, -1.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.1519F, -0.1178F, 0.0F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(36, 110).mirror().addBox(-0.4656F, -0.1476F, -0.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, 1.7279F, -0.1178F, 0.0F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(112, 81).mirror().addBox(-0.4656F, -0.6642F, -0.3876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, 3.0194F, -0.1178F, 0.0F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(81, 110).mirror().addBox(-0.4656F, 0.179F, -0.3082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.7628F, -0.1178F, 0.0F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(110, 56).mirror().addBox(-0.4656F, 0.2831F, -0.6598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(56, 110).mirror().addBox(-0.4656F, -0.1169F, -0.6598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.4486F, -0.1178F, 0.0F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(31, 110).mirror().addBox(-0.4656F, -1.8251F, 0.1672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.0036F, -0.1178F, 0.0F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(91, 107).mirror().addBox(-0.3656F, -1.4103F, -0.3874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.3963F, -0.1178F, 0.0F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(86, 107).mirror().addBox(-0.3656F, -0.7081F, -0.5332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.1747F, 0.4216F, -4.9306F, -1.6144F, -0.1178F, 0.0F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0875F, -0.6218F, -1.7305F, -0.637F, -0.1004F, 0.0F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0761F, 0.3718F, -1.8431F, -1.6842F, -0.1004F, 0.0F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(9, 90).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1451F, 1.0972F, -1.1582F, -2.3824F, -0.1004F, 0.0F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(36, 93).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2412F, 1.3812F, -0.2042F, 2.8536F, -0.1004F, 0.0F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(0.0F, -2.1447F, -4.7293F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.9544F, 2.5894F, 1.4137F, -0.1004F, 0.0F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(63, 79).mirror().addBox(0.0F, 0.3741F, -3.4897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, -2.9544F, 2.5894F, 0.8639F, -0.1004F, 0.0F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(70, 99).mirror().addBox(0.0F, -1.8053F, -4.3279F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4544F, 3.3394F, 0.4189F, -0.1004F, 0.0F));

		PartDefinition cube_r417 = rightFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(0.0F, -1.511F, -3.4711F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4544F, 3.3394F, 0.3316F, -0.1004F, 0.0F));

		PartDefinition cube_r418 = rightFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(0.0F, -1.2925F, -2.5919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4544F, 3.3394F, 0.2443F, -0.1004F, 0.0F));

		PartDefinition cube_r419 = rightFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(43, 97).mirror().addBox(0.0F, -0.0181F, -2.0294F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.3388F, -1.3144F, 0.5503F, -0.0835F, -0.0308F));

		PartDefinition cube_r420 = rightFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(98, 93).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -1.5F, 0.2009F, -0.1309F, -0.0034F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.1453F, 0.7914F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r421 = Jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(65, 113).mirror().addBox(-1.0086F, 0.0332F, 11.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 62).mirror().addBox(-1.0086F, 0.0081F, 10.6223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 113).mirror().addBox(-1.0086F, 0.0581F, 9.7223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 113).mirror().addBox(-1.0086F, 0.0581F, 8.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(113, 59).mirror().addBox(-1.0086F, 0.0831F, 7.9223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 113).mirror().addBox(-1.0095F, 0.1572F, 7.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 113).mirror().addBox(-1.0095F, 0.1822F, 6.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 113).mirror().addBox(-1.0095F, 0.2072F, 5.2353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0674F, -0.0436F, 0.0F));

		PartDefinition cube_r422 = Jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(95, 113).mirror().addBox(-1.0095F, 0.4842F, 4.2904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 113).mirror().addBox(-0.9351F, 0.4619F, 3.4001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 113).mirror().addBox(-0.9351F, 0.4176F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.1198F, -0.0436F, 0.0F));

		PartDefinition cube_r423 = Jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(75, 113).mirror().addBox(-0.9351F, 0.3872F, 2.5151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 113).mirror().addBox(-0.9351F, 0.3744F, 0.7136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.1023F, -0.0436F, 0.0F));

		PartDefinition cube_r424 = Jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(46, 110).mirror().addBox(-0.9351F, 0.3873F, -0.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0849F, -0.0436F, 0.0F));

		PartDefinition cube_r425 = Jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(112, 30).mirror().addBox(-0.9301F, 0.2427F, 1.9372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(33, 88).mirror().addBox(-0.9301F, -0.2605F, 0.0671F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.4224F, -12.9558F, 3.1023F, -0.1309F, 0.0F));

		PartDefinition cube_r426 = Jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(112, 93).mirror().addBox(-0.9301F, 0.263F, 1.0242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.4224F, -12.9558F, 3.1198F, -0.1309F, 0.0F));

		PartDefinition cube_r427 = Jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(41, 110).mirror().addBox(-0.9301F, 0.2072F, 0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.4224F, -12.9558F, 3.0674F, -0.1309F, 0.0F));

		PartDefinition cube_r428 = Jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(106, 110).mirror().addBox(-0.0017F, -0.2354F, 5.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(110, 103).mirror().addBox(-0.0017F, -0.2354F, 4.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(101, 110).mirror().addBox(-0.0017F, -0.2354F, 3.4192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 110).mirror().addBox(-0.0017F, -0.2354F, 2.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(91, 110).mirror().addBox(-0.0017F, -0.2354F, 1.6192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 77).mirror().addBox(-0.0017F, -0.6854F, -0.8558F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.4224F, -7.1558F, 3.0674F, -0.1309F, 0.0F));

		PartDefinition cube_r429 = Jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(64, 107).mirror().addBox(0.0F, 0.3665F, -3.1036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -0.0218F, -0.0524F, 0.0F));

		PartDefinition cube_r430 = Jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(45, 107).mirror().addBox(0.0F, 1.0264F, -3.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -0.2487F, -0.0524F, 0.0F));

		PartDefinition cube_r431 = Jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(107, 36).mirror().addBox(0.0F, 3.4725F, 0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -1.5577F, -0.0524F, 0.0F));

		PartDefinition cube_r432 = Jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(99, 26).mirror().addBox(0.0F, -1.2794F, 5.8289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -3.1023F, -0.0524F, 0.0F));

		PartDefinition cube_r433 = Jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(0.0F, -0.3854F, 4.4055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -2.9627F, -0.0524F, 0.0F));

		PartDefinition cube_r434 = Jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(99, 16).mirror().addBox(-0.0017F, -1.5058F, 0.1075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(18, 90).mirror().addBox(-0.0017F, -1.7058F, 0.1075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.4224F, -7.1558F, 3.0238F, -0.1309F, 0.0F));

		PartDefinition cube_r435 = Jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(53, 91).mirror().addBox(-0.0017F, -0.6582F, 3.0915F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.4224F, -7.1558F, 3.0761F, -0.1309F, 0.0F));

		PartDefinition cube_r436 = Jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(81, 63).mirror().addBox(-0.9351F, -0.1399F, 0.0043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.1067F, -0.0436F, 0.0F));

		PartDefinition cube_r437 = Jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(74, 83).mirror().addBox(-1.0095F, -0.0867F, 3.8778F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.098F, -0.0436F, 0.0F));

		PartDefinition cube_r438 = Jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(94, 51).mirror().addBox(-1.1086F, -0.0093F, 7.5473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0936F, -0.0436F, 0.0F));

		PartDefinition cube_r439 = Jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(71, 94).mirror().addBox(-1.1086F, -0.7298F, 10.1354F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0238F, -0.0436F, 0.0F));

		PartDefinition cube_r440 = Jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(80, 94).mirror().addBox(-1.1086F, -1.6305F, 10.1089F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 2.954F, -0.0436F, 0.0F));

		PartDefinition cube_r441 = Jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(62, 94).mirror().addBox(-1.1086F, -0.7288F, 7.5944F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0412F, -0.0436F, 0.0F));

		PartDefinition cube_r442 = Jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(63, 83).mirror().addBox(-1.0095F, -0.6211F, 3.9096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0456F, -0.0436F, 0.0F));

		PartDefinition cube_r443 = Jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.9351F, -0.5446F, 0.0546F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0369F, -0.0436F, 0.0F));

		PartDefinition cube_r444 = Jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(93, 71).mirror().addBox(-0.9301F, -0.9014F, 0.0908F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.4224F, -12.9558F, 3.0238F, -0.1309F, 0.0F));

		PartDefinition cube_r445 = Jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(-0.0017F, -1.8132F, 3.0211F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.4224F, -7.1558F, 2.9889F, -0.1309F, 0.0F));

		PartDefinition cube_r446 = Jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(53, 85).mirror().addBox(0.0F, -3.0936F, 4.757F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 3.0761F, -0.0524F, 0.0F));

		PartDefinition cube_r447 = Jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(98, 46).mirror().addBox(0.0F, -5.0679F, -2.599F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 1.6057F, -0.0524F, 0.0F));

		PartDefinition cube_r448 = Jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(76, 106).mirror().addBox(0.0F, 0.0168F, -3.5147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 0.2182F, -0.0524F, 0.0F));

		PartDefinition cube_r449 = Jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(14, 99).mirror().addBox(0.0F, 2.1105F, -1.1222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -0.9599F, -0.0524F, 0.0F));

		PartDefinition cube_r450 = Jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(71, 106).mirror().addBox(0.0F, 0.0605F, 0.4638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -1.2566F, -0.0524F, 0.0F));

		PartDefinition cube_r451 = Jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(90, 13).mirror().addBox(0.0F, -0.0306F, -2.5672F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 0.4014F, -0.0524F, 0.0F));

		PartDefinition cube_r452 = Jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(112, 90).mirror().addBox(0.0F, -1.4268F, -0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, -2.6529F, -0.0524F, 0.0F));

		PartDefinition cube_r453 = Jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(112, 99).mirror().addBox(0.0F, -0.8129F, -1.3463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 3.0369F, -0.0524F, 0.0F));

		PartDefinition cube_r454 = Jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(112, 87).mirror().addBox(0.0F, 0.2101F, -0.6189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 2.0769F, -0.0524F, 0.0F));

		PartDefinition cube_r455 = Jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(112, 84).mirror().addBox(0.0F, -0.597F, 0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 1.1345F, -0.0524F, 0.0F));

		PartDefinition cube_r456 = Jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(111, 109).mirror().addBox(0.0F, -0.8977F, -0.2563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 0.7854F, -0.0524F, 0.0F));

		PartDefinition cube_r457 = Jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(93, 66).mirror().addBox(0.0F, -0.8F, -2.475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5224F, 0.4442F, 0.4451F, -0.0524F, 0.0F));

		PartDefinition cube_r458 = Jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(90, 13).addBox(-1.0F, -0.0306F, -2.5672F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 0.4014F, 0.0524F, 0.0F));

		PartDefinition cube_r459 = Jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(94, 51).addBox(0.1086F, -0.0093F, 7.5473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0936F, 0.0436F, 0.0F));

		PartDefinition cube_r460 = Jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(71, 94).addBox(0.1086F, -0.7298F, 10.1354F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0238F, 0.0436F, 0.0F));

		PartDefinition cube_r461 = Jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(80, 94).addBox(0.1086F, -1.6305F, 10.1089F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 2.954F, 0.0436F, 0.0F));

		PartDefinition cube_r462 = Jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(62, 94).addBox(0.1086F, -0.7288F, 7.5944F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2004F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0412F, 0.0436F, 0.0F));

		PartDefinition cube_r463 = Jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(74, 83).addBox(0.0095F, -0.0867F, 3.8778F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.098F, 0.0436F, 0.0F));

		PartDefinition cube_r464 = Jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(63, 83).addBox(0.0095F, -0.6211F, 3.9096F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0456F, 0.0436F, 0.0F));

		PartDefinition cube_r465 = Jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(81, 63).addBox(-0.0649F, -0.1399F, 0.0043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.1067F, 0.0436F, 0.0F));

		PartDefinition cube_r466 = Jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(0, 84).addBox(-0.0649F, -0.5446F, 0.0546F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0369F, 0.0436F, 0.0F));

		PartDefinition cube_r467 = Jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(33, 88).addBox(-0.0699F, -0.2605F, 0.0671F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.019F))
				.texOffs(112, 30).addBox(-0.0699F, 0.2427F, 1.9372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.4224F, -12.9558F, 3.1023F, 0.1309F, 0.0F));

		PartDefinition cube_r468 = Jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(93, 71).addBox(-0.0699F, -0.9014F, 0.0908F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.4F, 1.4224F, -12.9558F, 3.0238F, 0.1309F, 0.0F));

		PartDefinition cube_r469 = Jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(65, 113).addBox(0.0086F, 0.0332F, 11.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 62).addBox(0.0086F, 0.0081F, 10.6223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 113).addBox(0.0086F, 0.0581F, 9.7223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 113).addBox(0.0086F, 0.0581F, 8.8223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(113, 59).addBox(0.0086F, 0.0831F, 7.9223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 113).addBox(0.0095F, 0.1572F, 7.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 113).addBox(0.0095F, 0.1822F, 6.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 113).addBox(0.0095F, 0.2072F, 5.2353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0674F, 0.0436F, 0.0F));

		PartDefinition cube_r470 = Jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(95, 113).addBox(0.0095F, 0.4842F, 4.2904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 113).addBox(-0.0649F, 0.4619F, 3.4001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 113).addBox(-0.0649F, 0.4176F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.1198F, 0.0436F, 0.0F));

		PartDefinition cube_r471 = Jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(75, 113).addBox(-0.0649F, 0.3872F, 2.5151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 113).addBox(-0.0649F, 0.3744F, 0.7136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.1023F, 0.0436F, 0.0F));

		PartDefinition cube_r472 = Jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(46, 110).addBox(-0.0649F, 0.3873F, -0.1712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.4224F, -15.9558F, 3.0849F, 0.0436F, 0.0F));

		PartDefinition cube_r473 = Jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(112, 93).addBox(-0.0699F, 0.263F, 1.0242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.4224F, -12.9558F, 3.1198F, 0.1309F, 0.0F));

		PartDefinition cube_r474 = Jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(41, 110).addBox(-0.0699F, 0.2072F, 0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 1.4224F, -12.9558F, 3.0674F, 0.1309F, 0.0F));

		PartDefinition cube_r475 = Jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(106, 110).addBox(-0.9983F, -0.2354F, 5.2192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(110, 103).addBox(-0.9983F, -0.2354F, 4.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(101, 110).addBox(-0.9983F, -0.2354F, 3.4192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 110).addBox(-0.9983F, -0.2354F, 2.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 110).addBox(-0.9983F, -0.2354F, 1.6192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 77).addBox(-0.9983F, -0.6854F, -0.8558F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.1F, 1.4224F, -7.1558F, 3.0674F, 0.1309F, 0.0F));

		PartDefinition cube_r476 = Jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(53, 91).addBox(-0.9983F, -0.6582F, 3.0915F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.1F, 1.4224F, -7.1558F, 3.0761F, 0.1309F, 0.0F));

		PartDefinition cube_r477 = Jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(91, 36).addBox(-0.9983F, -1.8132F, 3.0211F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.1F, 1.4224F, -7.1558F, 2.9889F, 0.1309F, 0.0F));

		PartDefinition cube_r478 = Jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(99, 16).addBox(-0.9983F, -1.5058F, 0.1075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F))
				.texOffs(18, 90).addBox(-0.9983F, -1.7058F, 0.1075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.1F, 1.4224F, -7.1558F, 3.0238F, 0.1309F, 0.0F));

		PartDefinition cube_r479 = Jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(99, 26).addBox(-1.0F, -1.2794F, 5.8289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -3.1023F, 0.0524F, 0.0F));

		PartDefinition cube_r480 = Jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(64, 107).addBox(-1.0F, 0.3665F, -3.1036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -0.0218F, 0.0524F, 0.0F));

		PartDefinition cube_r481 = Jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(45, 107).addBox(-1.0F, 1.0264F, -3.3642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -0.2487F, 0.0524F, 0.0F));

		PartDefinition cube_r482 = Jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(107, 36).addBox(-1.0F, 3.4725F, 0.1264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -1.5577F, 0.0524F, 0.0F));

		PartDefinition cube_r483 = Jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(99, 0).addBox(-1.0F, -0.3854F, 4.4055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -2.9627F, 0.0524F, 0.0F));

		PartDefinition cube_r484 = Jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(53, 85).addBox(-1.0F, -3.0936F, 4.757F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 3.0761F, 0.0524F, 0.0F));

		PartDefinition cube_r485 = Jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(98, 46).addBox(-1.0F, -5.0679F, -2.599F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 1.6057F, 0.0524F, 0.0F));

		PartDefinition cube_r486 = Jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(76, 106).addBox(-1.0F, 0.0168F, -3.5147F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 0.2182F, 0.0524F, 0.0F));

		PartDefinition cube_r487 = Jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(14, 99).addBox(-1.0F, 2.1105F, -1.1222F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -0.9599F, 0.0524F, 0.0F));

		PartDefinition cube_r488 = Jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(71, 106).addBox(-1.0F, 0.0605F, 0.4638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -1.2566F, 0.0524F, 0.0F));

		PartDefinition cube_r489 = Jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(112, 90).addBox(-1.0F, -1.4268F, -0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, -2.6529F, 0.0524F, 0.0F));

		PartDefinition cube_r490 = Jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(112, 99).addBox(-1.0F, -0.8129F, -1.3463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 3.0369F, 0.0524F, 0.0F));

		PartDefinition cube_r491 = Jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(112, 87).addBox(-1.0F, 0.2101F, -0.6189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 2.0769F, 0.0524F, 0.0F));

		PartDefinition cube_r492 = Jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(112, 84).addBox(-1.0F, -0.597F, 0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 1.1345F, 0.0524F, 0.0F));

		PartDefinition cube_r493 = Jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(111, 109).addBox(-1.0F, -0.8977F, -0.2563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 0.7854F, 0.0524F, 0.0F));

		PartDefinition cube_r494 = Jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(93, 66).addBox(-1.0F, -0.8F, -2.475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(2.5F, 0.5224F, 0.4442F, 0.4451F, 0.0524F, 0.0F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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