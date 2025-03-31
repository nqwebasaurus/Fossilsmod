package fossils.fossils.client.blockentity.model.abyssosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AbyssosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Tail;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart snout;
	private final ModelPart snout2;
	private final ModelPart forehead;
	private final ModelPart forehead2;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;

	public AbyssosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Tail = this.Hips.getChild("Tail");
		this.BackFlipperR2 = this.Tail.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Tail.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.tail3 = this.Tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.Body = this.Hips.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.Neck2 = this.Chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.snout = this.Head.getChild("snout");
		this.snout2 = this.snout.getChild("snout2");
		this.forehead = this.snout2.getChild("forehead");
		this.forehead2 = this.forehead.getChild("forehead2");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperR2 = this.Chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.Chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.1543F, 2.952F, 0.6429F, 0.1321F, -0.1741F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 14).addBox(0.0F, -1.1848F, 3.9927F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 6.6F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 78).addBox(0.0F, -1.1848F, 3.9927F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 78).addBox(0.0F, -1.5848F, 1.9927F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 59).addBox(0.0F, -1.8848F, -0.0073F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 4.6F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 11).mirror().addBox(-1.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 10.8808F, 0.1807F, 0.1036F, -0.1559F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 44).mirror().addBox(-3.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 10.8808F, 0.1655F, 0.1352F, -0.2839F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-4.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 10.8808F, 0.0111F, 0.232F, -1.0593F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-1.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1367F, 9.0808F, 0.2777F, 0.0233F, -0.0938F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(-3.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1367F, 9.0808F, 0.2721F, 0.0676F, -0.2171F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 70).mirror().addBox(-4.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1367F, 9.0808F, 0.1381F, 0.2568F, -0.9725F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2216F, 0.0536F, -0.2725F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2259F, 0.0156F, -0.1471F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.1871F, 0.149F, -0.6102F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-6.0942F, -4.2155F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.0873F, 0.2223F, -1.138F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6367F, 5.0808F, 0.1896F, 0.1451F, -0.6099F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6367F, 5.0808F, 0.2264F, 0.0111F, -0.1472F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6367F, 5.0808F, 0.2226F, 0.0491F, -0.2726F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(-7.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6367F, 5.0808F, 0.0915F, 0.2202F, -1.1372F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 61).addBox(2.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 10.8808F, 0.0111F, -0.232F, 1.0593F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(66, 44).addBox(1.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 10.8808F, 0.1655F, -0.1352F, 0.2839F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 11).addBox(0.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 10.8808F, 0.1807F, -0.1036F, 0.1559F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 16).addBox(0.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1367F, 9.0808F, 0.2777F, -0.0233F, 0.0938F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 70).addBox(1.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1367F, 9.0808F, 0.2721F, -0.0676F, 0.2171F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 70).addBox(2.1598F, -2.12F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1367F, 9.0808F, 0.1381F, -0.2568F, 0.9725F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 53).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2216F, -0.0536F, 0.2725F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(78, 37).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2259F, -0.0156F, 0.1471F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(64, 48).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.1871F, -0.149F, 0.6102F));

		PartDefinition cube_r26 = Hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 71).addBox(4.0942F, -4.2155F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.0873F, -0.2223F, 1.138F));

		PartDefinition cube_r27 = Hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(71, 4).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6367F, 5.0808F, 0.1896F, -0.1451F, 0.6099F));

		PartDefinition cube_r28 = Hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6367F, 5.0808F, 0.2264F, -0.0111F, 0.1472F));

		PartDefinition cube_r29 = Hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(71, 12).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6367F, 5.0808F, 0.2226F, -0.0491F, 0.2726F));

		PartDefinition cube_r30 = Hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 32).addBox(4.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6367F, 5.0808F, 0.0915F, -0.2202F, 1.1372F));

		PartDefinition cube_r31 = Hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(25, 33).addBox(-1.5F, -0.2022F, -0.115F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(34, 45).addBox(-1.0F, -0.4803F, 0.0363F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6962F, 11.3425F, -0.2172F, -0.101F, 0.1551F));

		PartDefinition cube_r32 = Tail.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(60, 80).addBox(0.0F, -2.2623F, 21.8445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 80).addBox(0.0F, -2.4623F, 19.8445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 79).addBox(0.0F, -2.7623F, 17.8445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1584F, -16.5024F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Tail.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(23, 55).addBox(-2.0F, 2.9432F, 15.6272F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(28, 12).mirror().addBox(-2.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(28, 12).addBox(1.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 7.3288F, -18.5157F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Tail.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(45, 45).mirror().addBox(-11.3628F, 4.3432F, 15.9095F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 6.4814F, -21.1619F, 0.2449F, 0.4677F, 0.1122F));

		PartDefinition Hips_r3 = Tail.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(20, 48).mirror().addBox(-4.1807F, 3.5402F, 16.3315F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 6.3202F, -16.7248F, 0.2229F, 0.2044F, 0.046F));

		PartDefinition Hips_r4 = Tail.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(2.8581F, 4.1745F, 16.3897F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, 9.7576F, -14.5772F, 0.5179F, -0.3691F, -0.2028F));

		PartDefinition Hips_r5 = Tail.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(37, 53).mirror().addBox(1.9066F, 4.1745F, 19.2814F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, 9.7576F, -14.5772F, 0.4899F, -0.1932F, -0.102F));

		PartDefinition Hips_r6 = Tail.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-8.8532F, 12.6608F, 6.2375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6638F, 6.8909F, -14.1508F, 1.2733F, 0.422F, 0.3198F));

		PartDefinition cube_r33 = Tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(77, 5).mirror().addBox(-1.2737F, 3.9005F, 17.0911F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.5508F, -12.0403F, 0.3738F, 0.1396F, -0.6593F));

		PartDefinition cube_r34 = Tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-4.353F, 3.3213F, 17.1242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5508F, -14.0403F, 0.3537F, 0.1947F, -0.6227F));

		PartDefinition cube_r35 = Tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(79, 77).mirror().addBox(-1.7399F, 3.5889F, 17.143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5508F, -14.0403F, 0.3738F, 0.1396F, -0.5023F));

		PartDefinition cube_r36 = Tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(18, 41).mirror().addBox(-9.0228F, -0.9625F, 16.6946F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5508F, -16.0403F, 0.1282F, 0.4716F, -1.2852F));

		PartDefinition cube_r37 = Tail.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 70).mirror().addBox(-5.3052F, 4.1492F, 16.8437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5508F, -16.0403F, 0.416F, 0.2288F, -0.5049F));

		PartDefinition cube_r38 = Tail.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(78, 79).mirror().addBox(-2.5788F, 4.5339F, 16.8706F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.5508F, -16.0403F, 0.4391F, 0.1663F, -0.3876F));

		PartDefinition Hips_r7 = Tail.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(45, 45).addBox(5.3628F, 4.3432F, 15.9095F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.4F, 6.4814F, -21.1619F, 0.2449F, -0.4677F, -0.1122F));

		PartDefinition Hips_r8 = Tail.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(20, 48).addBox(2.1807F, 3.5402F, 16.3315F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3F, 6.3202F, -16.7248F, 0.2229F, -0.2044F, -0.046F));

		PartDefinition Hips_r9 = Tail.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(0, 60).addBox(-5.8581F, 4.1745F, 16.3897F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 9.7576F, -14.5772F, 0.5179F, 0.3691F, 0.2028F));

		PartDefinition Hips_r10 = Tail.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(55, 0).addBox(-1.6F, 4.1745F, 16.6683F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 9.7576F, -14.5772F, 0.48F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = Tail.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(37, 53).addBox(-3.9066F, 4.1745F, 19.2814F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 9.7576F, -14.5772F, 0.4899F, 0.1932F, 0.102F));

		PartDefinition Hips_r12 = Tail.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(0, 12).addBox(7.8532F, 12.6608F, 6.2375F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6638F, 6.8909F, -14.1508F, 1.2733F, -0.422F, -0.3198F));

		PartDefinition cube_r39 = Tail.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(77, 5).addBox(0.2737F, 3.9005F, 17.0911F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 3.5508F, -12.0403F, 0.3738F, -0.1396F, 0.6593F));

		PartDefinition cube_r40 = Tail.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 16).addBox(2.353F, 3.3213F, 17.1242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5508F, -14.0403F, 0.3537F, -0.1947F, 0.6227F));

		PartDefinition cube_r41 = Tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(79, 77).addBox(0.7399F, 3.5889F, 17.143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5508F, -14.0403F, 0.3738F, -0.1396F, 0.5023F));

		PartDefinition cube_r42 = Tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(18, 41).addBox(7.0228F, -0.9625F, 16.6946F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5508F, -16.0403F, 0.1282F, -0.4716F, 1.2852F));

		PartDefinition cube_r43 = Tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(38, 70).addBox(3.3052F, 4.1492F, 16.8437F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5508F, -16.0403F, 0.416F, -0.2288F, 0.5049F));

		PartDefinition cube_r44 = Tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 79).addBox(1.5788F, 4.5339F, 16.8706F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5508F, -16.0403F, 0.4391F, -0.1663F, 0.3876F));

		PartDefinition BackFlipperR2 = Tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create().texOffs(49, 20).addBox(-0.1971F, -0.4811F, -0.4574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(5.4F, 4.7082F, 2.09F, 0.2849F, -0.3618F, 0.5453F));

		PartDefinition cube_r45 = BackFlipperR2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 30).addBox(8.906F, 0.9166F, 15.5997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(9, 56).addBox(10.306F, 0.9166F, 14.5997F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4486F, -1.3977F, -17.2708F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r46 = BackFlipperR2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 23).addBox(-0.5066F, 0.9166F, -0.8755F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6514F, -1.3977F, 0.9292F, 0.0F, -0.5585F, 0.0F));

		PartDefinition cube_r47 = BackFlipperR2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(61, 5).addBox(0.1874F, 0.9166F, -0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2486F, -1.3977F, -0.2708F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r48 = BackFlipperR2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 65).addBox(-0.4485F, 0.9166F, -0.0866F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.7514F, -1.3977F, -0.3708F, 0.0F, 0.4014F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create().texOffs(43, 23).addBox(0.875F, -0.0307F, -1.4474F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(77, 63).addBox(-0.225F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 77).addBox(-0.225F, -0.5307F, 1.4526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5092F, 0.0209F, 1.0724F, 0.1061F, -0.324F, -0.3228F));

		PartDefinition cube_r49 = BackFlipperMiddleR2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(65, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -0.0307F, -1.1474F, 0.0F, 0.2618F, 0.0F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create().texOffs(40, 16).addBox(9.8407F, 0.4315F, 14.4661F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.415F, -0.4473F, -17.069F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperR3 = Tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create().texOffs(18, 38).addBox(-4.8029F, -0.4811F, -0.4574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-5.4F, 4.7082F, 2.09F, 0.301F, 0.4375F, -0.7182F));

		PartDefinition cube_r50 = BackFlipperR3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 17).addBox(-10.906F, 0.9166F, 15.5997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(14, 14).addBox(-11.306F, 0.9166F, 14.5997F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4486F, -1.3977F, -17.2708F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r51 = BackFlipperR3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 16).addBox(-3.4934F, 0.9166F, -0.8755F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6514F, -1.3977F, 0.9292F, 0.0F, 0.5585F, 0.0F));

		PartDefinition cube_r52 = BackFlipperR3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(20, 60).addBox(-4.1874F, 0.9166F, -0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2486F, -1.3977F, -0.2708F, 0.0F, 0.192F, 0.0F));

		PartDefinition cube_r53 = BackFlipperR3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(53, 65).addBox(-1.5515F, 0.9166F, -0.0866F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.7514F, -1.3977F, -0.3708F, 0.0F, -0.4014F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create().texOffs(19, 43).addBox(-6.875F, -0.0307F, -1.4474F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(77, 50).addBox(-0.775F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 77).addBox(-0.775F, -0.5307F, 1.4526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5092F, 0.0209F, 1.0724F, 0.1205F, 0.3191F, 0.3685F));

		PartDefinition cube_r54 = BackFlipperMiddleR3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(55, 77).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -0.0307F, -1.1474F, 0.0F, -0.2618F, 0.0F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create().texOffs(40, 12).addBox(-17.8407F, 0.4315F, 14.4661F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.415F, -0.4473F, -17.069F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(11, 48).addBox(-0.5F, -0.3113F, -0.1726F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(7, 12).addBox(0.0F, -1.4113F, 0.8274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 82).addBox(0.0F, -1.3113F, 2.8274F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 11).addBox(0.0F, -1.2113F, 4.8274F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1916F, 6.0976F, 0.0715F, -0.2176F, -0.0155F));

		PartDefinition cube_r55 = tail3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 1.0688F, 21.7315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 82).addBox(0.0F, 0.7688F, 19.7315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 8).addBox(0.0F, 0.5688F, 17.7315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9382F, -16.5186F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, -0.5259F, -0.135F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(79, 81).addBox(0.0F, -1.2259F, 0.865F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 82).addBox(0.0F, -1.0259F, 2.865F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 81).addBox(0.0F, -0.9259F, 4.865F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1882F, 5.8814F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition cube_r56 = tail4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(18, 27).addBox(0.0F, 2.4936F, 25.6658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 25).addBox(0.0F, 2.1936F, 23.6658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.124F, -22.4624F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(26, 48).addBox(-0.5F, -0.6094F, -0.0604F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0993F, 5.8479F, 0.0181F, 0.2618F, 0.0047F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 6.15F, -8.0F, 18.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8212F, 3.6925F, -0.049F, 0.0375F, -0.1328F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(52, 75).addBox(0.0F, -2.8951F, 4.0434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 75).addBox(0.0F, -2.8951F, 2.0434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 76).addBox(0.0F, -2.7951F, 0.0434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -13.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -0.1205F, -5.9815F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -8.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -2.05F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 55).addBox(0.0F, -2.35F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 68).addBox(0.0F, -2.65F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 77).addBox(0.0F, -2.85F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.283F, -0.0609F, -0.1156F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(42, 68).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.2877F, -0.0153F, -0.2384F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.2727F, 0.1055F, -0.5664F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-8.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.1851F, 0.2271F, -1.0833F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.3261F, -0.0679F, -0.1183F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(68, 50).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.3313F, -0.017F, -0.2391F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 68).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.3148F, 0.1178F, -0.5617F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(38, 33).mirror().addBox(-8.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.2164F, 0.2584F, -1.0758F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.3261F, -0.0679F, -0.1183F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(18, 69).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.3313F, -0.017F, -0.2391F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.3148F, 0.1178F, -0.5617F));

		PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(43, 28).mirror().addBox(-9.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.2164F, 0.2584F, -1.0758F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(11, 45).mirror().addBox(-8.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0845F, -12.4117F, 0.3475F, 0.3808F, -1.0694F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0845F, -12.4117F, 0.4847F, 0.1645F, -0.5727F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0845F, -12.4117F, 0.5057F, -0.0238F, -0.2776F));

		PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(32, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0845F, -12.4117F, 0.4992F, -0.0947F, -0.1673F));

		PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-9.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -10.4117F, 0.2938F, 0.3325F, -1.0707F));

		PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -10.4117F, 0.4165F, 0.1463F, -0.5658F));

		PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -10.4117F, 0.4359F, -0.0211F, -0.2585F));

		PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(62, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2155F, -10.4117F, 0.4299F, -0.0843F, -0.1437F));

		PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-9.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -8.5117F, 0.2938F, 0.3325F, -1.0533F));

		PartDefinition cube_r81 = Body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -8.5117F, 0.4165F, 0.1463F, -0.5483F));

		PartDefinition cube_r82 = Body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 2).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -8.5117F, 0.4359F, -0.0211F, -0.2411F));

		PartDefinition cube_r83 = Body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -8.5117F, 0.4299F, -0.0843F, -0.1262F));

		PartDefinition cube_r84 = Body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(14, 12).mirror().addBox(-10.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.2418F, 0.2833F, -1.0865F));

		PartDefinition cube_r85 = Body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.3486F, 0.1274F, -0.575F));

		PartDefinition cube_r86 = Body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(70, 25).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.3662F, -0.0184F, -0.2572F));

		PartDefinition cube_r87 = Body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.3607F, -0.0735F, -0.1382F));

		PartDefinition cube_r88 = Body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(71, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.283F, 0.0609F, 0.1156F));

		PartDefinition cube_r89 = Body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(42, 68).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.2877F, 0.0153F, 0.2384F));

		PartDefinition cube_r90 = Body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 46).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.2727F, -0.1055F, 0.5664F));

		PartDefinition cube_r91 = Body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 36).addBox(4.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.1851F, -0.2271F, 1.0833F));

		PartDefinition cube_r92 = Body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(49, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.3261F, 0.0679F, 0.1183F));

		PartDefinition cube_r93 = Body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(68, 50).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.3313F, 0.017F, 0.2391F));

		PartDefinition cube_r94 = Body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(56, 68).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.3148F, -0.1178F, 0.5617F));

		PartDefinition cube_r95 = Body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(38, 33).addBox(4.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.2164F, -0.2584F, 1.0758F));

		PartDefinition cube_r96 = Body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(5, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.3261F, 0.0679F, 0.1183F));

		PartDefinition cube_r97 = Body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(18, 69).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.3313F, 0.017F, 0.2391F));

		PartDefinition cube_r98 = Body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(69, 21).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.3148F, -0.1178F, 0.5617F));

		PartDefinition cube_r99 = Body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(43, 28).addBox(4.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.2164F, -0.2584F, 1.0758F));

		PartDefinition cube_r100 = Body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(11, 45).addBox(4.0942F, -4.2155F, -0.6121F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0845F, -12.4117F, 0.3475F, -0.3808F, 1.0694F));

		PartDefinition cube_r101 = Body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(25, 69).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0845F, -12.4117F, 0.4847F, -0.1645F, 0.5727F));

		PartDefinition cube_r102 = Body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(69, 28).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0845F, -12.4117F, 0.5057F, 0.0238F, 0.2776F));

		PartDefinition cube_r103 = Body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(32, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0845F, -12.4117F, 0.4992F, 0.0947F, 0.1673F));

		PartDefinition cube_r104 = Body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(56, 28).addBox(4.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -10.4117F, 0.2938F, -0.3325F, 1.0707F));

		PartDefinition cube_r105 = Body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(69, 41).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -10.4117F, 0.4165F, -0.1463F, 0.5658F));

		PartDefinition cube_r106 = Body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 56).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -10.4117F, 0.4359F, 0.0211F, 0.2585F));

		PartDefinition cube_r107 = Body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(62, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2155F, -10.4117F, 0.4299F, 0.0843F, 0.1437F));

		PartDefinition cube_r108 = Body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(57, 42).addBox(4.0942F, -4.2155F, -0.6121F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -8.5117F, 0.2938F, -0.3325F, 1.0533F));

		PartDefinition cube_r109 = Body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(69, 69).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -8.5117F, 0.4165F, -0.1463F, 0.5483F));

		PartDefinition cube_r110 = Body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(70, 2).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -8.5117F, 0.4359F, 0.0211F, 0.2411F));

		PartDefinition cube_r111 = Body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(70, 10).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -8.5117F, 0.4299F, 0.0843F, 0.1262F));

		PartDefinition cube_r112 = Body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(14, 12).addBox(4.0942F, -4.2155F, -0.6121F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.2418F, -0.2833F, 1.0865F));

		PartDefinition cube_r113 = Body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(70, 14).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.3486F, -0.1274F, 0.575F));

		PartDefinition cube_r114 = Body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(70, 25).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.3662F, 0.0184F, 0.2572F));

		PartDefinition cube_r115 = Body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(70, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.3607F, 0.0735F, 0.1382F));

		PartDefinition cube_r116 = Body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(30, 23).addBox(-1.0F, -0.35F, -1.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -13.8F, -0.1333F, 0.0221F, -0.2472F));

		PartDefinition cube_r117 = Chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(10, 73).addBox(0.0F, -3.1784F, -2.1094F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-0.5F, -0.9784F, -3.1094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.7F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(73, 71).addBox(0.0F, -3.2075F, -0.0709F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-2.9678F, -0.1151F, -0.4256F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0845F, -6.5117F, 0.5543F, 0.4482F, -0.4943F));

		PartDefinition cube_r120 = Chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 70).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0845F, -6.5117F, 0.5996F, 0.3693F, -0.3805F));

		PartDefinition cube_r121 = Chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9845F, -4.4117F, 0.624F, 0.3244F, -0.5378F));

		PartDefinition cube_r122 = Chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(67, 19).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9845F, -4.4117F, 0.6529F, 0.2392F, -0.4343F));

		PartDefinition cube_r123 = Chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(-5.0942F, -4.2155F, -0.6121F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.2668F, 0.5688F, -1.2847F));

		PartDefinition cube_r124 = Chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(64, 26).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.5166F, 0.3633F, -0.7425F));

		PartDefinition cube_r125 = Chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.5929F, 0.1577F, -0.4499F));

		PartDefinition cube_r126 = Chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(29, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.605F, 0.0764F, -0.3465F));

		PartDefinition cube_r127 = Chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(67, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.5312F, -0.0125F, -0.2578F));

		PartDefinition cube_r128 = Chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(67, 64).mirror().addBox(-3.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.5285F, 0.0614F, -0.3659F));

		PartDefinition cube_r129 = Chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(66, 67).mirror().addBox(-5.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.4817F, 0.2526F, -0.6621F));

		PartDefinition cube_r130 = Chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(28, 23).mirror().addBox(-7.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.2979F, 0.4564F, -1.1783F));

		PartDefinition Bodyfront_r1 = Chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(3.8528F, -2.2901F, -1.8501F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7142F, 7.579F, 0.4082F, -0.783F, 0.7737F, -1.3203F));

		PartDefinition Bodyfront_r2 = Chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(2.9714F, -1.31F, -4.2807F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5142F, 7.579F, -1.0918F, -0.4957F, 0.6358F, -0.3107F));

		PartDefinition Bodyfront_r3 = Chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(0.9022F, -1.31F, -2.2937F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5142F, 7.579F, -1.0918F, -1.0123F, 1.1026F, -0.9599F));

		PartDefinition Bodyfront_r4 = Chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(51, 57).mirror().addBox(-1.879F, -1.31F, -1.423F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5142F, 7.479F, -1.0918F, -2.4733F, 1.0501F, -2.5798F));

		PartDefinition Bodyfront_r5 = Chest.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(24, 27).mirror().addBox(-6.4228F, -0.5226F, 0.0051F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2856F, 7.0216F, -1.0658F, -0.1571F, 0.7618F, -0.1089F));

		PartDefinition cube_r131 = Chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(67, 0).addBox(0.9678F, -0.1151F, -0.4256F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0845F, -6.5117F, 0.5543F, -0.4482F, 0.4943F));

		PartDefinition cube_r132 = Chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(79, 70).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0845F, -6.5117F, 0.5996F, -0.3693F, 0.3805F));

		PartDefinition cube_r133 = Chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(67, 8).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9845F, -4.4117F, 0.624F, -0.3244F, 0.5378F));

		PartDefinition cube_r134 = Chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(67, 19).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9845F, -4.4117F, 0.6529F, -0.2392F, 0.4343F));

		PartDefinition cube_r135 = Chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(77, 3).addBox(4.0942F, -4.2155F, -0.6121F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.2668F, -0.5688F, 1.2847F));

		PartDefinition cube_r136 = Chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 26).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.5166F, -0.3633F, 0.7425F));

		PartDefinition cube_r137 = Chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(71, 23).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.5929F, -0.1577F, 0.4499F));

		PartDefinition cube_r138 = Chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(29, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.605F, -0.0764F, 0.3465F));

		PartDefinition cube_r139 = Chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.5312F, 0.0125F, 0.2578F));

		PartDefinition cube_r140 = Chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 64).addBox(1.9829F, -0.2604F, -0.5182F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.5285F, -0.0614F, 0.3659F));

		PartDefinition cube_r141 = Chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(66, 67).addBox(3.6534F, -1.6036F, -0.6121F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.4817F, -0.2526F, 0.6621F));

		PartDefinition cube_r142 = Chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(28, 23).addBox(4.0942F, -4.2155F, -0.6121F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.2979F, -0.4564F, 1.1783F));

		PartDefinition cube_r143 = Chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(44, 72).addBox(0.0F, -2.7245F, 0.0211F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(12, 25).addBox(0.0F, -2.2589F, -0.0861F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Chest.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(40, 61).addBox(-5.8528F, -2.2901F, -1.8501F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7142F, 7.579F, 0.4082F, -0.783F, -0.7737F, 1.3203F));

		PartDefinition Bodyfront_r7 = Chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(0, 19).addBox(-5.9714F, -1.31F, -4.2807F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5142F, 7.579F, -1.0918F, -0.4957F, -0.6358F, 0.3107F));

		PartDefinition Bodyfront_r8 = Chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(38, 57).addBox(-4.9022F, -1.31F, -2.2937F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5142F, 7.579F, -1.0918F, -1.0123F, -1.1026F, 0.9599F));

		PartDefinition Bodyfront_r9 = Chest.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(49, 38).addBox(-5.5142F, -1.31F, -5.2127F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5142F, 7.579F, -1.0918F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = Chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(0, 53).addBox(-3.5142F, -1.0939F, -4.1474F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5142F, 7.579F, -1.0918F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = Chest.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(51, 57).addBox(-2.121F, -1.31F, -1.423F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5142F, 7.479F, -1.0918F, -2.4733F, -1.0501F, 2.5798F));

		PartDefinition Bodyfront_r12 = Chest.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(0, 38).addBox(-4.2856F, -0.5226F, -0.1133F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2856F, 7.0216F, -1.0658F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = Chest.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(24, 27).addBox(2.4228F, -0.5226F, 0.0051F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2856F, 7.0216F, -1.0658F, -0.1571F, -0.7618F, 0.1089F));

		PartDefinition cube_r145 = Chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(46, 50).addBox(-1.0F, -0.3F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -7.7F, -0.2734F, 0.1338F, -0.1727F));

		PartDefinition cube_r146 = Neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -2.3F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(23, 78).addBox(-1.0F, -2.4F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 78).addBox(-1.0F, -2.0F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 78).addBox(-1.0F, -1.8F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 35).addBox(-1.5F, -0.3F, -6.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(77, 24).mirror().addBox(-1.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2845F, -0.6117F, 0.4758F, 0.5699F, -0.5326F));

		PartDefinition cube_r150 = Neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2845F, -0.6117F, 0.5408F, 0.4983F, -0.4053F));

		PartDefinition cube_r151 = Neck2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3845F, -6.6117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r152 = Neck2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r153 = Neck2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(77, 29).mirror().addBox(-1.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.3032F, 0.774F, -0.6408F));

		PartDefinition cube_r154 = Neck2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(77, 45).mirror().addBox(-1.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.6117F, 0.4433F, 0.6148F, -0.5508F));

		PartDefinition cube_r155 = Neck2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.6117F, 0.5166F, 0.5463F, -0.4173F));

		PartDefinition cube_r156 = Neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(79, 55).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3845F, -6.6117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r157 = Neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(79, 57).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r158 = Neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(77, 29).addBox(0.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.3032F, -0.774F, 0.6408F));

		PartDefinition cube_r159 = Neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(78, 66).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2845F, -0.6117F, 0.5408F, -0.4983F, 0.4053F));

		PartDefinition cube_r160 = Neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(77, 24).addBox(0.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2845F, -0.6117F, 0.4758F, -0.5699F, 0.5326F));

		PartDefinition cube_r161 = Neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(77, 45).addBox(0.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.6117F, 0.4433F, -0.6148F, 0.5508F));

		PartDefinition cube_r162 = Neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 68).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.6117F, 0.5166F, -0.5463F, 0.4173F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -7.9F, -0.3713F, 0.2435F, -0.1391F));

		PartDefinition cube_r163 = Neck3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(21, 14).addBox(-1.0F, -2.1F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -0.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Neck3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(43, 23).addBox(-1.0F, -2.1F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Neck3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(14, 78).addBox(-1.0F, -2.1F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 78).addBox(-1.0F, -2.0F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 78).addBox(-1.0F, -2.0F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 15).addBox(-1.5F, -0.9F, -6.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -4.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Neck3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2345F, -0.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r167 = Neck3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(78, 53).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1655F, -4.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r168 = Neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2655F, -8.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r169 = Neck3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1655F, -6.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r170 = Neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(79, 47).mirror().addBox(-0.9739F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0345F, -2.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r171 = Neck3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 79).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2655F, -8.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r172 = Neck3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(79, 18).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1655F, -6.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r173 = Neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(78, 53).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1655F, -4.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r174 = Neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 43).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2345F, -0.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r175 = Neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(79, 47).addBox(-0.0261F, 0.0119F, -0.4167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0345F, -2.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -10.0F, -0.3317F, 0.2513F, 0.098F));

		PartDefinition cube_r176 = Neck4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(11, 78).addBox(-1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.0F, -1.9F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 25).addBox(-1.0F, -1.8F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 81).addBox(-1.0F, -1.8F, -7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 59).addBox(-1.0F, -1.7F, -9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-1.5F, -0.9F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Neck4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(80, 39).mirror().addBox(4.5931F, -2.754F, -5.5518F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 80).mirror().addBox(3.199F, -2.0108F, -4.2891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 80).mirror().addBox(1.881F, -1.4088F, -2.907F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 4).mirror().addBox(0.4202F, -0.7313F, -1.6794F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 78).mirror().addBox(-0.9358F, -0.0587F, -0.357F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2042F, -0.8159F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r178 = Neck4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 39).addBox(-5.5931F, -2.754F, -5.5518F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 80).addBox(-4.199F, -2.0108F, -4.2891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 80).addBox(-2.881F, -1.4088F, -2.907F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 4).addBox(-1.4202F, -0.7313F, -1.6794F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 78).addBox(-0.0642F, -0.0587F, -0.357F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2042F, -0.8159F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6303F, -9.1042F, -0.3601F, 0.2428F, 0.0464F));

		PartDefinition cube_r179 = Neck5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(55, 8).addBox(-1.0F, -1.8F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(56, 50).addBox(-1.0F, -1.6F, -3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(66, 80).addBox(-1.0F, -1.5F, -5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 81).addBox(-1.0F, -1.4F, -7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(6, 0).addBox(-1.0F, -1.3F, -9.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 12).addBox(-1.5F, -1.0F, -10.9F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 0.7F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Neck5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(11.4494F, -6.2582F, -12.0443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 2).mirror().addBox(10.0933F, -5.5856F, -10.7218F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 4).mirror().addBox(8.6993F, -4.8424F, -9.4592F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 80).mirror().addBox(7.3432F, -4.1698F, -8.1368F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 80).mirror().addBox(5.9872F, -3.4972F, -6.8144F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8345F, 8.2883F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r181 = Neck5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(81, 0).addBox(-12.4494F, -6.2582F, -12.0443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 2).addBox(-11.0933F, -5.5856F, -10.7218F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 4).addBox(-9.6993F, -4.8424F, -9.4592F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 80).addBox(-8.3432F, -4.1698F, -8.1368F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 80).addBox(-6.9872F, -3.4972F, -6.8144F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.8345F, 8.2883F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, -0.7F, -8.8F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(55, 0).addBox(0.0F, -1.0F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 34).addBox(0.0F, -1.0F, -2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 48).addBox(0.0F, -1.0F, -4.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 48).addBox(0.0F, -1.0F, -6.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 45).addBox(0.0F, -1.0F, -8.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -11.0F, 0.255F, 0.3345F, 0.2326F));

		PartDefinition cube_r182 = Neck6.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(18.0775F, -9.3389F, -18.8954F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 72).mirror().addBox(16.7594F, -8.7369F, -17.5132F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 6).mirror().addBox(15.4414F, -8.1348F, -16.131F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 74).mirror().addBox(14.1234F, -7.5328F, -14.7488F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 81).mirror().addBox(12.8435F, -7.0014F, -13.3069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1345F, 19.2883F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r183 = Neck6.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(72, 80).addBox(-19.0775F, -9.3389F, -18.8954F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 72).addBox(-17.7594F, -8.7369F, -17.5132F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 6).addBox(-16.4414F, -8.1348F, -16.131F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 74).addBox(-15.1234F, -7.5328F, -14.7488F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 81).addBox(-13.8435F, -7.0014F, -13.3069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1345F, 19.2883F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(12, 27).addBox(-0.5F, -0.5F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(36, 44).addBox(0.0F, -0.8F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 16).addBox(0.0F, -0.8F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 12).addBox(0.0F, -0.8F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 12).addBox(0.0F, -0.8F, -8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1952F, -8.8025F, 0.2436F, 0.325F, 0.1304F));

		PartDefinition cube_r184 = Neck7.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(23.3636F, -11.7866F, -24.3769F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 56).mirror().addBox(22.0517F, -11.1941F, -22.9885F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 73).mirror().addBox(20.7398F, -10.6016F, -21.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 31).mirror().addBox(19.4278F, -10.009F, -20.2116F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.3297F, 28.0908F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r185 = Neck7.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 49).addBox(-24.3636F, -11.7866F, -24.3769F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 56).addBox(-23.0517F, -11.1941F, -22.9885F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 73).addBox(-21.7398F, -10.6016F, -21.6F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 31).addBox(-20.4278F, -10.009F, -20.2116F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.3297F, 28.0908F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2F, -8.8F, 0.1242F, 0.3421F, 0.0691F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 74).mirror().addBox(-0.6165F, -0.526F, -1.6045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.1656F, 1.2461F, -0.2957F, 0.0697F, 0.0697F, -0.0037F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(56, 74).addBox(-0.3835F, -0.526F, -1.6045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.1656F, 1.2461F, -0.2957F, 0.0697F, -0.0697F, 0.0037F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(64, 58).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -1.7443F, -1.0296F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, 0.7F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7443F, -1.0296F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(38, 35).mirror().addBox(-0.3578F, -0.2F, -0.3922F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.7443F, -0.1296F, 0.0936F, 0.5869F, 0.1679F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(64, 30).mirror().addBox(-0.1714F, -1.3781F, -0.7371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 64).mirror().addBox(-0.1714F, -0.7781F, -0.7371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.7443F, 0.2704F, 0.3279F, 0.3343F, 0.8452F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(30, 64).addBox(-1.8286F, -0.7781F, -0.7371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 30).addBox(-1.8286F, -1.3781F, -0.7371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.7443F, 0.2704F, 0.3279F, -0.3343F, -0.8452F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(38, 35).addBox(-1.6422F, -0.2F, -0.3922F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.7443F, -0.1296F, 0.0936F, -0.5869F, -0.1679F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1557F, -2.9796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forehead = snout2.addOrReplaceChild("forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r194 = forehead.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(62, 54).mirror().addBox(-0.2302F, -0.2865F, -1.6594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.7036F, 2.3672F, -0.5013F, -0.6322F, 0.2679F));

		PartDefinition cube_r195 = forehead.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(12, 27).mirror().addBox(-0.2415F, -0.6311F, -0.1649F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 2.0036F, 2.2672F, -0.3494F, -0.3196F, 0.0906F));

		PartDefinition cube_r196 = forehead.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(62, 54).addBox(-0.7698F, -0.2865F, -1.6594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.7036F, 2.3672F, -0.5013F, 0.6322F, -0.2679F));

		PartDefinition cube_r197 = forehead.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(24, 71).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7094F, 1.7153F, 1.1768F, -0.9479F, -0.4472F, 0.5901F));

		PartDefinition cube_r198 = forehead.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(19, 71).mirror().addBox(-0.7997F, -0.8972F, -0.2558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7755F, 1.9398F, 1.6993F, -0.5988F, -0.4472F, 0.5901F));

		PartDefinition cube_r199 = forehead.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(29, 71).mirror().addBox(-1.0993F, -0.7526F, -0.0314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 76).mirror().addBox(-1.0351F, 0.1769F, 0.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(38, 75).mirror().addBox(-1.0351F, -0.0231F, 0.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(28, 75).mirror().addBox(-1.0351F, -0.2231F, 0.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 73).mirror().addBox(-0.8959F, 0.1754F, 1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(73, 43).mirror().addBox(-0.8959F, -0.0246F, 1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(73, 37).mirror().addBox(-0.8959F, -0.2246F, 1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 75).mirror().addBox(-0.7568F, -0.026F, 1.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(47, 75).mirror().addBox(-0.7568F, -0.226F, 1.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 73).mirror().addBox(-0.5427F, -0.1584F, 2.0495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7755F, 2.1108F, 2.1691F, -0.5115F, -0.4472F, 0.5901F));

		PartDefinition cube_r200 = forehead.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 73).addBox(-0.4573F, -0.1584F, 2.0495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(47, 75).addBox(-0.2432F, -0.226F, 1.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 75).addBox(-0.2432F, -0.026F, 1.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(73, 37).addBox(-0.1041F, -0.2246F, 1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(73, 43).addBox(-0.1041F, -0.0246F, 1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 73).addBox(-0.1041F, 0.1754F, 1.0676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(28, 75).addBox(0.0351F, -0.2231F, 0.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(38, 75).addBox(0.0351F, -0.0231F, 0.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 76).addBox(0.0351F, 0.1769F, 0.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(29, 71).addBox(0.0993F, -0.7526F, -0.0314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2245F, 2.1108F, 2.1691F, -0.5115F, 0.4472F, -0.5901F));

		PartDefinition cube_r201 = forehead.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(19, 71).addBox(-0.2003F, -0.8972F, -0.2558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2245F, 1.9398F, 1.6993F, -0.5988F, 0.4472F, -0.5901F));

		PartDefinition cube_r202 = forehead.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(14, 71).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4891F, 1.555F, 1.019F, -1.2342F, 0.2667F, -0.6601F));

		PartDefinition cube_r203 = forehead.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(24, 71).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2906F, 1.7153F, 1.1768F, -0.9479F, 0.4472F, -0.5901F));

		PartDefinition cube_r204 = forehead.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(12, 27).addBox(-0.7585F, -0.6311F, -0.1649F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 2.0036F, 2.2672F, -0.3494F, 0.3196F, -0.0906F));

		PartDefinition cube_r205 = forehead.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(16, 63).addBox(-1.0F, -0.188F, -1.8506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6036F, 2.6672F, 0.4494F, 0.0F, 0.0F));

		PartDefinition forehead2 = forehead.addOrReplaceChild("forehead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.025F, 1.8F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r206 = forehead2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(77, 34).addBox(-1.4124F, -0.33F, -0.4801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.4124F, 0.7671F, 1.1393F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r207 = forehead2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -0.0155F, -1.5395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(46, 65).addBox(-1.0F, -0.0155F, -1.0395F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -0.3381F, 2.8298F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r208 = forehead2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.133F, -0.4772F, 0.4569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3124F, 0.7671F, 1.1393F, 0.1577F, -0.3451F, 0.2255F));

		PartDefinition cube_r209 = forehead2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.1581F, -0.4086F, 0.8047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3124F, 0.7671F, 1.1393F, -0.4706F, -0.3451F, 0.2255F));

		PartDefinition cube_r210 = forehead2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(33, 74).mirror().addBox(-0.1581F, -1.4299F, 0.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3124F, 0.7671F, 1.1393F, -1.1164F, -0.3451F, 0.2255F));

		PartDefinition cube_r211 = forehead2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(-0.1581F, -0.0273F, 0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(73, 65).mirror().addBox(-0.1581F, -0.0273F, 0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3124F, 0.7671F, 1.1393F, 0.437F, -0.3451F, 0.2255F));

		PartDefinition cube_r212 = forehead2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.4023F, -1.1992F, 0.0259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 74).mirror().addBox(-0.1926F, -1.1992F, 0.0259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3124F, 0.7671F, 1.1393F, -1.2385F, -0.3451F, 0.2255F));

		PartDefinition cube_r213 = forehead2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(-0.1581F, 0.0034F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(73, 52).mirror().addBox(-0.1857F, 0.1034F, -0.5864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3124F, 0.7671F, 1.1393F, -0.0168F, -0.3451F, 0.2255F));

		PartDefinition cube_r214 = forehead2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(47, 61).mirror().addBox(-0.0043F, -0.0211F, -1.0275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3124F, 0.7671F, 1.1393F, 0.47F, -0.3964F, 0.2103F));

		PartDefinition cube_r215 = forehead2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.2F, -0.2397F, -2.7782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.9205F, 4.9269F, -0.2403F, -0.1851F, 0.0513F));

		PartDefinition cube_r216 = forehead2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-1.1F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0138F, 3.0264F, 0.142F, -0.0432F, 0.2936F));

		PartDefinition cube_r217 = forehead2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(47, 61).addBox(-0.9957F, -0.0211F, -1.0275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.3124F, 0.7671F, 1.1393F, 0.47F, 0.3964F, -0.2103F));

		PartDefinition cube_r218 = forehead2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8F, -0.2397F, -2.7782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.9205F, 4.9269F, -0.2403F, 0.1851F, -0.0513F));

		PartDefinition cube_r219 = forehead2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(73, 61).addBox(-0.8419F, -0.0273F, 0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(73, 65).addBox(-0.8419F, -0.0273F, 0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3124F, 0.7671F, 1.1393F, 0.437F, 0.3451F, -0.2255F));

		PartDefinition cube_r220 = forehead2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(73, 52).addBox(-0.8143F, 0.1034F, -0.5864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 18).addBox(-0.8419F, 0.0034F, 0.0136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3124F, 0.7671F, 1.1393F, -0.0168F, 0.3451F, -0.2255F));

		PartDefinition cube_r221 = forehead2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(74, 47).addBox(-0.8419F, -0.4086F, 0.8047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3124F, 0.7671F, 1.1393F, -0.4706F, 0.3451F, -0.2255F));

		PartDefinition cube_r222 = forehead2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(73, 6).addBox(-0.5977F, -1.1992F, 0.0259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(61, 74).addBox(-0.8074F, -1.1992F, 0.0259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3124F, 0.7671F, 1.1393F, -1.2385F, 0.3451F, -0.2255F));

		PartDefinition cube_r223 = forehead2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(33, 74).addBox(-0.8419F, -1.4299F, 0.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3124F, 0.7671F, 1.1393F, -1.1164F, 0.3451F, -0.2255F));

		PartDefinition cube_r224 = forehead2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(0, 38).addBox(-0.867F, -0.4772F, 0.4569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3124F, 0.7671F, 1.1393F, 0.1577F, 0.3451F, -0.2255F));

		PartDefinition cube_r225 = forehead2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(54, 61).addBox(-0.9F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.0138F, 3.0264F, 0.142F, 0.0432F, -0.2936F));

		PartDefinition cube_r226 = forehead2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, -0.0159F, -1.9226F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.0F, -0.6381F, 3.3298F, 0.5411F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.9557F, -0.0296F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r227 = Jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(32, 77).mirror().addBox(-0.1F, -0.2F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 31).mirror().addBox(-0.1F, -0.4F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 40).mirror().addBox(-0.3F, -0.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 26).mirror().addBox(-0.3F, -0.5F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 8).mirror().addBox(-0.4F, -0.6F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 13).mirror().addBox(-0.4F, -0.4F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 21).mirror().addBox(-0.4F, -0.2F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(66, 74).mirror().addBox(-0.5F, -0.7F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(13, 75).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(18, 75).mirror().addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(46, 0).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.2749F, -0.7856F, -3.8606F, 0.0571F, -0.4987F, -0.4179F));

		PartDefinition cube_r228 = Jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(11, 47).mirror().addBox(-0.6F, -1.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(13, 67).mirror().addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3745F, -1.0368F, -4.764F, 0.1372F, -0.7932F, -0.4634F));

		PartDefinition cube_r229 = Jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1603F, -1.0827F, -5.1133F, 0.6759F, -0.7409F, -0.5605F));

		PartDefinition cube_r230 = Jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(16, 56).mirror().addBox(-0.487F, -0.7104F, -1.7258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2F, -4.0F, -0.33F, -0.7457F, 0.1954F));

		PartDefinition cube_r231 = Jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(61, 61).mirror().addBox(-0.6702F, -0.2548F, -3.2323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2F, -1.1F, -0.17F, -0.3608F, 0.0597F));

		PartDefinition cube_r232 = Jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-0.3924F, -0.3057F, -1.702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2F, -1.1F, -0.1255F, -0.1709F, 0.0275F));

		PartDefinition cube_r233 = Jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(23, 75).mirror().addBox(-0.5F, 0.1129F, 0.0709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.0F, -0.4F, 0.6283F, 0.2618F, 0.0F));

		PartDefinition cube_r234 = Jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(61, 44).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.0F, -0.4F, -0.3491F, 0.2618F, 0.0F));

		PartDefinition cube_r235 = Jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(62, 19).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.0F, -0.4F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r236 = Jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(32, 77).addBox(-0.9F, -0.2F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 31).addBox(-0.9F, -0.4F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 40).addBox(-0.7F, -0.3F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 26).addBox(-0.7F, -0.5F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 8).addBox(-0.6F, -0.6F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 13).addBox(-0.6F, -0.4F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 21).addBox(-0.6F, -0.2F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(66, 74).addBox(-0.5F, -0.7F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(13, 75).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(18, 75).addBox(-0.5F, -0.3F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(46, 0).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.2749F, -0.7856F, -3.8606F, 0.0571F, 0.4987F, 0.4179F));

		PartDefinition cube_r237 = Jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(11, 47).addBox(-0.4F, -1.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(13, 67).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3745F, -1.0368F, -4.764F, 0.1372F, 0.7932F, 0.4634F));

		PartDefinition cube_r238 = Jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1603F, -1.0827F, -5.1133F, 0.6759F, 0.7409F, 0.5605F));

		PartDefinition cube_r239 = Jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(16, 56).addBox(-0.513F, -0.7104F, -1.7258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.2F, -4.0F, -0.33F, 0.7457F, -0.1954F));

		PartDefinition cube_r240 = Jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(61, 61).addBox(-0.3298F, -0.2548F, -3.2323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.9F, -0.2F, -1.1F, -0.17F, 0.3608F, -0.0597F));

		PartDefinition cube_r241 = Jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(9, 62).addBox(-0.6076F, -0.3057F, -1.702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, -0.2F, -1.1F, -0.1255F, 0.1709F, -0.0275F));

		PartDefinition cube_r242 = Jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(23, 75).addBox(-0.5F, 0.1129F, 0.0709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.6F, 0.0F, -0.4F, 0.6283F, -0.2618F, 0.0F));

		PartDefinition cube_r243 = Jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(61, 44).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 0.0F, -0.4F, -0.3491F, -0.2618F, 0.0F));

		PartDefinition cube_r244 = Jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(62, 19).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.6F, 0.0F, -0.4F, 0.0F, -0.2618F, 0.0F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 5.5806F, -3.22F, 0.2112F, 0.1903F, -0.7811F));

		PartDefinition cube_r245 = FrontFlipperR2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(66, 38).addBox(-12.8411F, 3.1028F, 13.6091F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.8934F, -3.7839F, -19.5595F, 0.0F, 0.6196F, 0.0F));

		PartDefinition cube_r246 = FrontFlipperR2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(22, 66).addBox(-9.9917F, 3.1028F, -14.4501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.3934F, -3.7839F, -16.8595F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r247 = FrontFlipperR2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(31, 61).addBox(-18.5684F, 3.1028F, -4.5567F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.8934F, -3.7839F, -18.3595F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r248 = FrontFlipperR2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 64).addBox(11.7777F, 3.1028F, 12.4399F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5266F, -3.7839F, -18.0565F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r249 = FrontFlipperR2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(60, 12).addBox(-6.6567F, 3.1028F, 16.1684F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4723F, -3.7839F, -17.8396F, 0.0F, 0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(56, 50).addBox(1.7884F, 0.1028F, -1.9294F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 72).addBox(0.7884F, -0.3972F, -1.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 72).addBox(0.7884F, -0.3972F, -0.8294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 58).addBox(0.7884F, -0.3972F, 0.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 71).addBox(-0.0116F, -0.3972F, -0.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 71).addBox(-0.2116F, -0.3972F, -1.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2723F, -0.2839F, -0.6396F, 0.0149F, 0.041F, 0.3494F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create().texOffs(49, 34).addBox(3.5697F, 4.1194F, 16.5588F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9888F, -4.0F, -18.8073F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR3 = Chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 5.5806F, -3.22F, 0.456F, -0.2552F, 0.8548F));

		PartDefinition cube_r250 = FrontFlipperR3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(36, 66).addBox(10.8411F, 3.1028F, 13.6091F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.8934F, -3.7839F, -19.5595F, 0.0F, -0.6196F, 0.0F));

		PartDefinition cube_r251 = FrontFlipperR3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(6, 66).addBox(7.9917F, 3.1028F, -14.4501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.3934F, -3.7839F, -16.8595F, 0.0F, -2.4871F, 0.0F));

		PartDefinition cube_r252 = FrontFlipperR3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(24, 33).addBox(15.5684F, 3.1028F, -4.5567F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.8934F, -3.7839F, -18.3595F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r253 = FrontFlipperR3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(23, 63).addBox(-13.7777F, 3.1028F, 12.4399F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.5266F, -3.7839F, -18.0565F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r254 = FrontFlipperR3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(14, 20).addBox(2.6567F, 3.1028F, 16.1684F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4723F, -3.7839F, -17.8396F, 0.0F, -0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(55, 8).addBox(-5.7884F, 0.1028F, -1.9294F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 72).addBox(-1.7884F, -0.3972F, -1.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 34).addBox(-1.7884F, -0.3972F, -0.8294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 71).addBox(-1.7884F, -0.3972F, 0.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 48).addBox(-0.9884F, -0.3972F, -0.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 71).addBox(-0.7884F, -0.3972F, -1.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2723F, -0.2839F, -0.6396F, 0.0167F, -0.0403F, -0.393F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create().texOffs(48, 30).addBox(-9.5697F, 4.1194F, 16.5588F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9888F, -4.0F, -18.8073F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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