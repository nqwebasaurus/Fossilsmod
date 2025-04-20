package fossils.fossils.client.blockentity.model.zarafasaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ZarafasauraFossilModel extends SkullModelBase {
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
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;

	public ZarafasauraFossilModel(ModelPart root) {
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

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.8539F, -3.0305F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 83).addBox(0.0F, -1.2097F, -0.0823F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3512F, 10.6674F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 84).addBox(0.0F, -1.6598F, -0.0323F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5297F, 8.6037F, -0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 48).addBox(0.0F, -1.8348F, -0.0072F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8779F, 6.5963F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 81).addBox(0.0F, -1.9847F, -0.0072F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 4.6F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-2.07F, 0.3111F, -0.4456F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 10.8808F, 0.1655F, 0.1352F, -0.2839F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 84).mirror().addBox(-0.0284F, 0.3175F, -0.4451F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9367F, 10.8808F, 0.1807F, 0.1036F, -0.1559F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 84).mirror().addBox(-0.0156F, 0.2427F, -0.5211F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1367F, 9.0808F, 0.2777F, 0.0233F, -0.0938F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-2.0469F, 0.2387F, -0.5214F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1367F, 9.0808F, 0.2721F, 0.0676F, -0.2171F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(-2.615F, -1.2819F, -0.5713F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1367F, 9.0808F, 0.1381F, 0.2568F, -0.9725F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 2).mirror().addBox(-3.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2216F, 0.0536F, -0.2725F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-1.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2259F, 0.0156F, -0.1471F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-4.8429F, -1.018F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.1871F, 0.149F, -0.6102F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-4.0312F, -0.4339F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6367F, 5.0808F, 0.1896F, 0.1451F, -0.6099F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.0218F, 0.2909F, -0.5445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6367F, 5.0808F, 0.2264F, 0.0111F, -0.1472F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(14, 66).mirror().addBox(-2.0591F, 0.2856F, -0.5449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.6367F, 5.0808F, 0.2226F, 0.0491F, -0.2726F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(63, 0).addBox(0.07F, 0.3111F, -0.4456F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 10.8808F, 0.1655F, -0.1352F, 0.2839F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(38, 84).addBox(-0.9716F, 0.3175F, -0.4451F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9367F, 10.8808F, 0.1807F, -0.1036F, 0.1559F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(72, 84).addBox(-0.9844F, 0.2427F, -0.5211F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1367F, 9.0808F, 0.2777F, -0.0233F, 0.0938F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(63, 42).addBox(0.0469F, 0.2387F, -0.5214F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1367F, 9.0808F, 0.2721F, -0.0676F, 0.2171F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(67, 84).addBox(1.615F, -1.2819F, -0.5713F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1367F, 9.0808F, 0.1381F, -0.2568F, 0.9725F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(63, 2).addBox(1.0212F, 0.0135F, -0.5271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2216F, -0.0536F, 0.2725F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(86, 8).addBox(0.0109F, 0.1463F, -0.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.2259F, -0.0156F, 0.1471F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 66).addBox(2.8429F, -1.018F, -0.5992F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4367F, 7.0808F, 0.1871F, -0.149F, 0.6102F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(55, 65).addBox(2.0312F, -0.4339F, -0.5952F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6367F, 5.0808F, 0.1896F, -0.1451F, 0.6099F));

		PartDefinition cube_r25 = Hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(85, 0).addBox(-0.9782F, 0.2909F, -0.5445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6367F, 5.0808F, 0.2264F, -0.0111F, 0.1472F));

		PartDefinition cube_r26 = Hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 66).addBox(0.0591F, 0.2856F, -0.5449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.6367F, 5.0808F, 0.2226F, -0.0491F, 0.2726F));

		PartDefinition cube_r27 = Hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(19, 13).addBox(-1.0F, -0.2022F, -0.115F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.0F, 3.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(49, 35).addBox(-0.5F, -0.4802F, 0.0363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6962F, 11.3425F, -0.1664F, 0.0861F, -0.0144F));

		PartDefinition cube_r28 = Tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 84).addBox(0.0F, -1.2623F, -0.4555F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4074F, 3.5122F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Tail.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(50, 84).addBox(0.0F, -1.4623F, -0.1555F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3256F, 1.205F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Tail.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(51, 13).addBox(-1.0F, 2.9432F, 17.1272F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(50, 51).mirror().addBox(-1.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(50, 51).addBox(1.0F, 2.9432F, 17.6272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 4.8288F, -18.5157F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Tail.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(41, 43).mirror().addBox(-10.3628F, 4.3432F, 17.4095F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 3.9814F, -21.1619F, 0.2449F, 0.4677F, 0.1122F));

		PartDefinition Hips_r3 = Tail.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(33, 53).mirror().addBox(-3.1807F, 3.5402F, 16.3315F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 3.8202F, -16.7248F, 0.2229F, 0.2044F, 0.046F));

		PartDefinition Hips_r4 = Tail.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(11, 55).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.735F, 3.1561F, 3.4253F, 0.6911F, -0.7606F, -0.5182F));

		PartDefinition Hips_r5 = Tail.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(1.9066F, 4.1745F, 18.2564F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4F, 7.2576F, -14.5772F, 0.4899F, -0.1932F, -0.102F));

		PartDefinition Hips_r6 = Tail.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(39, 47).mirror().addBox(0.8F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8036F, 2.6116F, 2.952F, 1.9867F, 0.3217F, 0.5998F));

		PartDefinition Hips_r7 = Tail.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(41, 43).addBox(6.3628F, 4.3432F, 17.4095F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9F, 3.9814F, -21.1619F, 0.2449F, -0.4677F, -0.1122F));

		PartDefinition Hips_r8 = Tail.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(33, 53).addBox(2.1807F, 3.5402F, 16.3315F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 3.8202F, -16.7248F, 0.2229F, -0.2044F, -0.046F));

		PartDefinition Hips_r9 = Tail.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(11, 55).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.735F, 3.1561F, 3.4253F, 0.6911F, 0.7606F, 0.5182F));

		PartDefinition Hips_r10 = Tail.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(51, 17).addBox(-0.6F, 4.1745F, 16.6683F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9F, 7.2576F, -14.5772F, 0.48F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = Tail.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(55, 62).addBox(-3.9066F, 4.1745F, 18.2564F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 7.2576F, -14.5772F, 0.4899F, 0.1932F, 0.102F));

		PartDefinition Hips_r12 = Tail.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(39, 47).addBox(-1.8F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8036F, 2.6116F, 2.952F, 1.9867F, -0.3217F, -0.5998F));

		PartDefinition BackFlipperR2 = Tail.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create().texOffs(0, 32).addBox(-0.1971F, -0.4811F, -0.4574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.5415F, 3.5595F, 2.4315F, 0.4894F, -0.0718F, -0.5808F));

		PartDefinition cube_r30 = BackFlipperR2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 51).addBox(9.306F, 0.9166F, 14.6997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4486F, -1.3977F, -17.2708F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r31 = BackFlipperR2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 59).addBox(-0.5066F, 0.9166F, -0.8754F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6513F, -1.3977F, 0.9292F, 0.0F, -0.3142F, 0.0F));

		PartDefinition cube_r32 = BackFlipperR2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(51, 21).addBox(0.1875F, 0.9166F, -0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2487F, -1.3977F, -0.2708F, 0.0F, -0.192F, 0.0F));

		PartDefinition cube_r33 = BackFlipperR2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 59).addBox(-2.2485F, 0.9166F, -0.6866F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.7514F, -1.3977F, -0.3708F, 0.0626F, 0.2564F, 0.0081F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create().texOffs(37, 0).addBox(0.7165F, -0.0086F, -1.7011F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(82, 57).addBox(-0.225F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 63).addBox(-0.225F, -0.5307F, 1.4526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4448F, 0.0209F, 0.4833F, 0.0F, -0.3403F, 0.0F));

		PartDefinition cube_r34 = BackFlipperMiddleR2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(82, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -0.0307F, -1.1474F, 0.0F, 0.2618F, 0.0F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create().texOffs(17, 23).addBox(7.6505F, 0.4536F, 14.5351F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.415F, -0.4473F, -17.069F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperR3 = Tail.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create().texOffs(51, 10).addBox(-4.8029F, -0.4811F, -0.4574F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-3.5415F, 3.5595F, 2.4315F, 0.4457F, 0.0718F, 0.5808F));

		PartDefinition cube_r35 = BackFlipperR3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 27).addBox(-10.306F, 0.9166F, 14.6997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4486F, -1.3977F, -17.2708F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r36 = BackFlipperR3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(47, 59).addBox(-2.4934F, 0.9166F, -0.8754F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6513F, -1.3977F, 0.9292F, 0.0F, 0.3142F, 0.0F));

		PartDefinition cube_r37 = BackFlipperR3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 24).addBox(-4.1875F, 0.9166F, -0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2487F, -1.3977F, -0.2708F, 0.0F, 0.192F, 0.0F));

		PartDefinition cube_r38 = BackFlipperR3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(38, 59).addBox(-0.7515F, 0.9166F, -0.6866F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.7514F, -1.3977F, -0.3708F, 0.0626F, -0.2564F, -0.0081F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create().texOffs(37, 5).addBox(-4.7165F, -0.0086F, -1.7011F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(83, 69).addBox(-0.775F, -0.5307F, -0.1474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 76).addBox(-0.775F, -0.5307F, 1.4526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.4448F, 0.0209F, 0.4833F, 0.0F, 0.3403F, 0.0F));

		PartDefinition cube_r39 = BackFlipperMiddleR3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -0.0307F, -1.1474F, 0.0F, -0.2618F, 0.0F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create().texOffs(17, 27).addBox(-14.6505F, 0.4536F, 14.5351F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.415F, -0.4473F, -17.069F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail3 = Tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.3113F, -0.1726F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(56, 86).addBox(0.0F, -1.1113F, 0.8274F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 87).addBox(0.0F, -1.0113F, 2.8274F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2516F, 4.0885F, 0.1114F, 0.3471F, 0.038F));

		PartDefinition cube_r40 = tail3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(87, 52).addBox(0.0F, 0.7688F, 19.7315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 87).addBox(0.0F, 0.5688F, 17.7315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9382F, -16.5186F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(38, 24).addBox(-0.5F, -0.5259F, -0.135F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(86, 66).addBox(0.0F, -0.8259F, 0.865F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.258F, 3.8826F, 0.0813F, 0.261F, 0.021F));

		PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 4.75F, -6.0F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8212F, 3.6925F, 0.0352F, 0.1308F, 0.0046F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 84).addBox(0.0F, -2.125F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2906F, -1.0037F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(31, 68).addBox(0.0F, -2.35F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5568F, -2.8955F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(15, 68).addBox(0.0F, -2.35F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.73F, -4.9908F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 83).addBox(0.0F, -2.35F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7998F, -6.9895F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(-0.017F, 0.1877F, -0.6804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.283F, -0.0609F, -0.1156F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-2.0397F, 0.184F, -0.6807F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.2877F, -0.0153F, -0.2384F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-3.9751F, -0.5222F, -0.7301F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.2727F, 0.1055F, -0.5664F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-5.1815F, -2.4398F, -0.7301F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.1851F, 0.2271F, -1.0833F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(43, 85).mirror().addBox(-0.0186F, 0.1805F, -0.7033F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.3261F, -0.0679F, -0.1183F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 66).mirror().addBox(-2.0401F, 0.1767F, -0.7036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.3313F, -0.017F, -0.2391F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-3.9725F, -0.5291F, -0.7529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.3148F, 0.1178F, -0.5617F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-6.1757F, -2.4444F, -0.7529F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1155F, -2.5117F, 0.2164F, 0.2584F, -1.0758F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-0.0186F, 0.1805F, -0.7033F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.3261F, -0.0679F, -0.1183F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(63, 46).mirror().addBox(-2.0401F, 0.1767F, -0.7036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.3313F, -0.017F, -0.2391F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(62, 32).mirror().addBox(-3.9725F, -0.5291F, -0.7529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.3148F, 0.1178F, -0.5617F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(49, 41).mirror().addBox(-7.1757F, -2.4444F, -0.7529F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3155F, -4.5117F, 0.2164F, 0.2584F, -1.0758F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-7.2001F, -2.4347F, -0.7833F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.2418F, 0.2833F, -1.0865F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(63, 44).mirror().addBox(-3.9887F, -0.5084F, -0.7833F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.3486F, 0.1274F, -0.575F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(63, 4).mirror().addBox(-2.049F, 0.2018F, -0.7336F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.3662F, -0.0184F, -0.2572F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(-0.0244F, 0.2066F, -0.7333F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4155F, -6.5117F, 0.3607F, -0.0735F, -0.1382F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(33, 86).addBox(-0.983F, 0.1877F, -0.6804F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.283F, 0.0609F, 0.1156F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(63, 6).addBox(0.0397F, 0.184F, -0.6807F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.2877F, 0.0153F, 0.2384F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 59).addBox(1.9751F, -0.5222F, -0.7301F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.2727F, -0.1055F, 0.5664F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 48).addBox(3.1815F, -2.4398F, -0.7301F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.1851F, -0.2271F, 1.0833F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(43, 85).addBox(-0.9814F, 0.1805F, -0.7033F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.3261F, 0.0679F, 0.1183F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(28, 66).addBox(0.0401F, 0.1767F, -0.7036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.3313F, 0.017F, 0.2391F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(7, 66).addBox(1.9725F, -0.5291F, -0.7529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.3148F, -0.1178F, 0.5617F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(54, 8).addBox(3.1757F, -2.4444F, -0.7529F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1155F, -2.5117F, 0.2164F, -0.2584F, 1.0758F));

		PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(84, 30).addBox(-0.9814F, 0.1805F, -0.7033F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.3261F, 0.0679F, 0.1183F));

		PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(63, 46).addBox(0.0401F, 0.1767F, -0.7036F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.3313F, 0.017F, 0.2391F));

		PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(62, 32).addBox(1.9725F, -0.5291F, -0.7529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.3148F, -0.1178F, 0.5617F));

		PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 41).addBox(3.1757F, -2.4444F, -0.7529F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3155F, -4.5117F, 0.2164F, -0.2584F, 1.0758F));

		PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(51, 32).addBox(3.2001F, -2.4347F, -0.7833F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.2418F, -0.2833F, 1.0865F));

		PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(63, 44).addBox(1.9887F, -0.5084F, -0.7833F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.3486F, -0.1274F, 0.575F));

		PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(63, 4).addBox(0.049F, 0.2018F, -0.7336F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.3662F, 0.0184F, 0.2572F));

		PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(84, 60).addBox(-0.9756F, 0.2066F, -0.7333F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4155F, -6.5117F, 0.3607F, 0.0735F, 0.1382F));

		PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.35F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -7.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -7.9F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition cube_r78 = Chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(58, 67).addBox(0.0F, -3.0075F, -0.0709F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(62, 64).mirror().addBox(-3.1688F, 0.3152F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9845F, -4.4117F, 0.624F, 0.3244F, -0.5378F));

		PartDefinition cube_r80 = Chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-1.1187F, 0.4648F, -0.5849F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9845F, -4.4117F, 0.6529F, 0.2392F, -0.4343F));

		PartDefinition cube_r81 = Chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(84, 72).mirror().addBox(-4.6186F, -2.2845F, -0.8248F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.2668F, 0.5688F, -1.2847F));

		PartDefinition cube_r82 = Chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(21, 65).mirror().addBox(-4.276F, -0.1692F, -0.8248F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.5166F, 0.3633F, -0.7425F));

		PartDefinition cube_r83 = Chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-2.2043F, 0.6189F, -0.7697F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.5929F, 0.1577F, -0.4499F));

		PartDefinition cube_r84 = Chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(-0.1244F, 0.6404F, -0.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4845F, -2.5117F, 0.605F, 0.0764F, -0.3465F));

		PartDefinition cube_r85 = Chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(33, 84).mirror().addBox(-0.0663F, 0.4274F, -0.7792F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.5312F, -0.0125F, -0.2578F));

		PartDefinition cube_r86 = Chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 25).mirror().addBox(-2.1188F, 0.4153F, -0.7801F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.5597F, -0.0201F, -0.3653F));

		PartDefinition cube_r87 = Chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-4.126F, -0.3313F, -0.8323F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.5362F, 0.1835F, -0.6503F));

		PartDefinition cube_r88 = Chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(60, 30).mirror().addBox(-6.4076F, -2.35F, -0.8323F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1845F, -0.5117F, 0.3863F, 0.4215F, -1.1408F));

		PartDefinition Bodyfront_r1 = Chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(59, 51).mirror().addBox(-1.45F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7838F, 2.7624F, -3.0197F, -1.2785F, 0.285F, -1.4281F));

		PartDefinition Bodyfront_r2 = Chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(1.83F, 0.167F, -3.4185F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1941F, 4.8809F, -0.6395F, -0.6166F, 0.6003F, -0.3808F));

		PartDefinition Bodyfront_r3 = Chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5273F, 0.167F, -2.242F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1941F, 5.0559F, -0.6395F, -1.1849F, 0.9521F, -1.1082F));

		PartDefinition Bodyfront_r4 = Chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(54, 4).mirror().addBox(-0.9978F, 0.1647F, -2.1362F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1941F, 5.0559F, -0.6395F, -2.221F, 0.9412F, -2.3675F));

		PartDefinition Bodyfront_r5 = Chest.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-2.3471F, 0.7248F, -0.0248F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1941F, 4.8809F, -0.6395F, -0.299F, 0.7453F, -0.206F));

		PartDefinition cube_r89 = Chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 64).addBox(1.1688F, 0.3152F, -0.5954F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9845F, -4.4117F, 0.624F, -0.3244F, 0.5378F));

		PartDefinition cube_r90 = Chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(64, 10).addBox(-0.8813F, 0.4648F, -0.5849F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9845F, -4.4117F, 0.6529F, -0.2392F, 0.4343F));

		PartDefinition cube_r91 = Chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 72).addBox(3.6186F, -2.2845F, -0.8248F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.2668F, -0.5688F, 1.2847F));

		PartDefinition cube_r92 = Chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 65).addBox(2.276F, -0.1692F, -0.8248F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.5166F, -0.3633F, 0.7425F));

		PartDefinition cube_r93 = Chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 62).addBox(0.2043F, 0.6189F, -0.7697F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.5929F, -0.1577F, 0.4499F));

		PartDefinition cube_r94 = Chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(56, 84).addBox(-0.8756F, 0.6404F, -0.7682F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4845F, -2.5117F, 0.605F, -0.0764F, 0.3465F));

		PartDefinition cube_r95 = Chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(33, 84).addBox(-0.9337F, 0.4274F, -0.7792F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.5312F, 0.0125F, 0.2578F));

		PartDefinition cube_r96 = Chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(62, 25).addBox(0.1188F, 0.4153F, -0.7801F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.5285F, -0.0614F, 0.3659F));

		PartDefinition cube_r97 = Chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(63, 8).addBox(2.126F, -0.3313F, -0.8323F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.4817F, -0.2526F, 0.6621F));

		PartDefinition cube_r98 = Chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(60, 30).addBox(3.4076F, -2.35F, -0.8323F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1845F, -0.5117F, 0.2979F, -0.4564F, 1.1783F));

		PartDefinition cube_r99 = Chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(67, 34).addBox(0.0F, -2.6245F, 0.0211F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r100 = Chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(35, 66).addBox(0.0F, -2.1589F, -0.0861F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.9F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Chest.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(59, 51).addBox(-0.55F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7838F, 2.7624F, -3.0197F, -1.2785F, -0.285F, 1.4281F));

		PartDefinition Bodyfront_r7 = Chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(54, 43).addBox(-3.83F, 0.167F, -3.4185F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1941F, 4.8809F, -0.6395F, -0.6166F, -0.6003F, 0.3808F));

		PartDefinition Bodyfront_r8 = Chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(0, 46).addBox(-3.4727F, 0.167F, -2.242F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1941F, 5.0559F, -0.6395F, -1.1849F, -0.9521F, 1.1082F));

		PartDefinition Bodyfront_r9 = Chest.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(50, 47).addBox(-4.1941F, 0.167F, -3.8185F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1941F, 4.8809F, -0.6395F, -0.4974F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = Chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(13, 43).addBox(-3.1941F, 0.3081F, -2.6779F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1941F, 4.8809F, -0.6395F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = Chest.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(54, 4).addBox(-1.0022F, 0.1647F, -2.1362F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1941F, 5.0559F, -0.6395F, -2.221F, -0.9412F, 2.3675F));

		PartDefinition Bodyfront_r12 = Chest.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(26, 47).addBox(-4.1941F, 0.7248F, 0.3824F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1941F, 4.8809F, -0.6395F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = Chest.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(54, 0).addBox(0.3471F, 0.7248F, -0.0248F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1941F, 4.8809F, -0.6395F, -0.299F, -0.7453F, 0.206F));

		PartDefinition cube_r101 = Chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(19, 35).addBox(-0.5F, -0.3F, -5.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -5.7F, -0.1767F, 0.076F, 0.161F));

		PartDefinition cube_r102 = Neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(3, 83).addBox(-1.0F, -2.3F, -1.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3998F, -0.014F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(30, 84).addBox(-1.0F, -2.5F, -1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 42).addBox(-1.0F, -1.6F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3265F, -4.1127F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Neck2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(85, 4).mirror().addBox(-0.9739F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r106 = Neck2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(77, 84).mirror().addBox(-1.9679F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3845F, -4.6117F, 0.3032F, 0.774F, -0.6408F));

		PartDefinition cube_r107 = Neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(19, 86).mirror().addBox(-0.9739F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2845F, -0.6117F, 0.5408F, 0.4983F, -0.4053F));

		PartDefinition cube_r108 = Neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(86, 10).mirror().addBox(-1.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2845F, -0.6117F, 0.4758F, 0.5699F, -0.5326F));

		PartDefinition cube_r109 = Neck2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(84, 74).mirror().addBox(-1.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.6117F, 0.4433F, 0.6148F, -0.5508F));

		PartDefinition cube_r110 = Neck2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(85, 2).mirror().addBox(-0.9739F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2845F, -2.6117F, 0.5166F, 0.5463F, -0.4173F));

		PartDefinition cube_r111 = Neck2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(85, 4).addBox(-0.0261F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r112 = Neck2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(77, 84).addBox(0.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3845F, -4.6117F, 0.3032F, -0.774F, 0.6408F));

		PartDefinition cube_r113 = Neck2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(19, 86).addBox(-0.0261F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2845F, -0.6117F, 0.5408F, -0.4983F, 0.4053F));

		PartDefinition cube_r114 = Neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(86, 10).addBox(0.9679F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2845F, -0.6117F, 0.4758F, -0.5699F, 0.5326F));

		PartDefinition cube_r115 = Neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(84, 74).addBox(0.9678F, -0.1151F, -0.4256F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.6117F, 0.4433F, -0.6148F, 0.5508F));

		PartDefinition cube_r116 = Neck2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(85, 2).addBox(-0.0261F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2845F, -2.6117F, 0.5166F, -0.5463F, 0.4173F));

		PartDefinition cube_r117 = Neck2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(38, 10).addBox(-1.5F, -0.375F, -3.15F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(70, 86).addBox(0.0F, -1.4818F, -4.0116F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.15F, -4.9F, -0.1642F, 0.1437F, 0.064F));

		PartDefinition cube_r118 = Neck3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 84).addBox(-1.0F, -1.5F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2985F, -1.0582F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Neck3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(67, 86).addBox(0.0F, -0.45F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9717F, -5.5172F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Neck3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(-0.9739F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1655F, -5.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r121 = Neck3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(14, 85).mirror().addBox(-0.9739F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1655F, -3.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r122 = Neck3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(-0.9739F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0345F, -1.7117F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r123 = Neck3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(25, 85).addBox(-0.0261F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1655F, -5.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r124 = Neck3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(14, 85).addBox(-0.0261F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1655F, -3.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r125 = Neck3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(85, 6).addBox(-0.0261F, 0.0119F, -0.4168F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0345F, -1.7117F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r126 = Neck3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -0.9F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 0.3F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4453F, -7.0027F, -0.0272F, -0.1925F, -0.0948F));

		PartDefinition cube_r127 = Neck4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(79, 86).addBox(0.0F, -0.481F, -0.2245F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4553F, -0.5591F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Neck4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(76, 86).addBox(0.0F, -0.5844F, -0.0757F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.485F, -2.5602F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Neck4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(73, 86).addBox(0.0F, -0.6112F, 0.0392F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7395F, -4.5496F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Neck4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(85, 34).mirror().addBox(1.5265F, -1.2584F, -2.5135F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 51).mirror().addBox(0.1439F, -0.6111F, -1.3786F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 32).mirror().addBox(-1.1181F, 0.0254F, -0.1674F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2043F, -0.8159F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r131 = Neck4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(85, 34).addBox(-2.5265F, -1.2584F, -2.5135F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 51).addBox(-1.144F, -0.6111F, -1.3786F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 32).addBox(0.1181F, 0.0254F, -0.1674F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2043F, -0.8159F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r132 = Neck4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(34, 35).addBox(-1.5F, -0.85F, -5.55F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 0.4197F, -0.1042F, -0.0742F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.413F, -4.871F, -0.029F, -0.1177F, -0.1512F));

		PartDefinition cube_r133 = Neck5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(83, 79).mirror().addBox(5.6674F, -3.3028F, -6.5696F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 36).mirror().addBox(8.0838F, -4.4993F, -8.9297F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(83, 79).mirror().addBox(6.7151F, -3.8081F, -7.6182F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8345F, 8.2883F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r134 = Neck5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(83, 79).addBox(-6.6674F, -3.3028F, -6.5696F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 36).addBox(-9.0838F, -4.4993F, -8.9297F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 79).addBox(-7.7151F, -3.8081F, -7.6182F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.8345F, 8.2883F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition cube_r135 = Neck5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(87, 38).addBox(0.0F, -0.4724F, -0.0643F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4202F, -1.3251F, -0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Neck5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(87, 38).addBox(0.0F, -0.5231F, -1.679F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4202F, -1.3251F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Neck5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(11, 87).addBox(-1.0F, -1.5687F, -5.0784F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 39).addBox(-1.5F, -0.975F, -5.275F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, 0.7F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(38, 17).addBox(-0.5F, -0.7F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 87).addBox(0.0F, -1.225F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.075F, -4.9991F, -0.0124F, -0.1765F, -0.0821F));

		PartDefinition cube_r138 = Neck6.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(27, 87).addBox(0.0F, -0.525F, 0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.3F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Neck6.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(14.5591F, -7.704F, -15.2578F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 46).mirror().addBox(13.2927F, -7.125F, -13.9307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.1345F, 19.2883F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r140 = Neck6.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(85, 85).addBox(-15.5591F, -7.704F, -15.2578F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 46).addBox(-14.2927F, -7.125F, -13.9307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.1345F, 19.2883F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(13, 49).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.202F))
				.texOffs(13, 32).addBox(0.0F, -0.7F, -2.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 32).addBox(0.0F, -0.7999F, -0.6035F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1457F, -4.7911F, 0.2657F, -0.1685F, -0.0456F));

		PartDefinition cube_r141 = Neck7.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(6, 86).mirror().addBox(18.3126F, -9.4346F, -19.1639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 86).mirror().addBox(19.4948F, -9.9701F, -20.4122F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.3297F, 28.0908F, 0.4136F, 0.7195F, -0.4785F));

		PartDefinition cube_r142 = Neck7.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(6, 86).addBox(-19.3126F, -9.4346F, -19.1639F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 86).addBox(-20.4948F, -9.9701F, -20.4122F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.3297F, 28.0908F, 0.4136F, -0.7195F, 0.4785F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(6, 83).addBox(-1.0F, -1.0098F, -1.6098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5F, -0.0393F, -2.7372F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(-0.4921F, -0.9866F, -0.5437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(67, 56).mirror().addBox(-0.4921F, -0.6866F, -0.5437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.9123F, -0.5746F, -0.5307F, 2.0008F, -0.7529F, 0.0214F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 62).mirror().addBox(-0.4022F, -0.65F, -0.3708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4724F, -3.2311F, -0.0134F, -0.2094F, 0.0028F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(34, 62).mirror().addBox(-0.4088F, -0.65F, -0.3911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4724F, -3.2311F, -0.0144F, -0.4232F, 0.0059F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(62, 21).mirror().addBox(-0.4209F, -0.65F, -0.4112F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4724F, -3.2311F, -0.0166F, -0.6588F, 0.0101F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(14, 62).mirror().addBox(-0.5757F, -0.6574F, -0.4367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5744F, -0.634F, -0.2038F, -1.0365F, 0.2507F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(21, 67).mirror().addBox(-0.4921F, -1.0937F, -0.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(62, 66).mirror().addBox(-0.4921F, -0.7937F, -0.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.9806F, -0.5745F, -0.4577F, 1.5558F, -0.7529F, 0.0214F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(13, 39).mirror().addBox(-0.497F, -0.5043F, -0.599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.9806F, -0.5745F, -0.4577F, 1.3795F, -0.7877F, 0.0239F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-0.4925F, -0.2093F, -0.5989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.9806F, -0.5745F, -0.4577F, 1.3714F, -0.8219F, 0.0252F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.4925F, 0.0429F, -0.4432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.9806F, -0.5745F, -0.4577F, 1.0048F, -0.8219F, 0.0252F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.5172F, -0.5693F, -0.8329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0219F, -0.2985F, -2.0564F, -0.86F, -0.6097F, 1.1658F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-0.4641F, -0.5585F, -0.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0219F, -0.2985F, -2.0564F, -0.736F, -0.5283F, 0.7589F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(-0.4705F, -0.5675F, -0.3312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0219F, -0.2985F, -2.0564F, -0.9905F, -0.4998F, 0.7661F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.5011F, -0.8626F, -0.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(80, 0).mirror().addBox(-0.5011F, -0.8626F, 0.2205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.1316F, -0.0347F, -2.3318F, -0.4717F, -0.3142F, 0.2042F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.405F, -0.9065F, -1.0329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, 0.5574F, -0.0498F, 0.3146F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-0.405F, -0.8815F, -0.9073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, 0.2519F, -0.0498F, 0.3146F));

		PartDefinition cube_r158 = Head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(79, 60).mirror().addBox(-0.405F, -0.6491F, -0.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false)
				.texOffs(79, 18).mirror().addBox(-0.405F, -0.6491F, -0.658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, 0.025F, -0.0498F, 0.3146F));

		PartDefinition cube_r159 = Head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(60, 38).mirror().addBox(-0.405F, -0.6175F, -0.8483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(10, 71).mirror().addBox(-0.405F, -0.3175F, 0.1517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, -0.3153F, -0.0498F, 0.3146F));

		PartDefinition cube_r160 = Head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(45, 79).mirror().addBox(-0.405F, -0.7882F, -0.4182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 30).mirror().addBox(-0.405F, -0.7882F, -0.1182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(79, 21).mirror().addBox(-0.405F, -0.7882F, 0.1818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, -0.1582F, -0.0498F, 0.3146F));

		PartDefinition cube_r161 = Head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(79, 27).mirror().addBox(-0.405F, -0.0764F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 79).mirror().addBox(-0.405F, -0.3764F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, 1.5609F, -0.0498F, 0.3146F));

		PartDefinition cube_r162 = Head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(-0.405F, -0.7439F, -0.1251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, 1.2991F, -0.0498F, 0.3146F));

		PartDefinition cube_r163 = Head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-0.405F, -0.9743F, -0.4547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, 0.6534F, -0.0498F, 0.3146F));

		PartDefinition cube_r164 = Head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(39, 72).mirror().addBox(-0.405F, -0.7408F, -1.2216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, -0.0099F, -0.0498F, 0.3146F));

		PartDefinition cube_r165 = Head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(34, 72).mirror().addBox(-0.405F, -0.0998F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, 0.1058F, -0.7551F, 0.601F, -0.0498F, 0.3146F));

		PartDefinition cube_r166 = Head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(79, 24).mirror().addBox(-0.4107F, -0.6733F, -0.643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6576F, -0.1821F, 0.1012F, 0.577F, -0.4119F, 0.2272F));

		PartDefinition cube_r167 = Head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(14, 62).addBox(-0.4243F, -0.6574F, -0.4367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5F, 0.5744F, -0.634F, -0.2038F, 1.0365F, -0.2507F));

		PartDefinition cube_r168 = Head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(41, 62).addBox(-0.5978F, -0.65F, -0.3708F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5F, 0.4724F, -3.2311F, -0.0134F, 0.2094F, -0.0028F));

		PartDefinition cube_r169 = Head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(34, 62).addBox(-0.5912F, -0.65F, -0.3911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.5F, 0.4724F, -3.2311F, -0.0144F, 0.4232F, -0.0059F));

		PartDefinition cube_r170 = Head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(62, 21).addBox(-0.5791F, -0.65F, -0.4112F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(-0.5F, 0.4724F, -3.2311F, -0.0166F, 0.6588F, -0.0101F));

		PartDefinition cube_r171 = Head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.5F, 0.4894F, -1.9312F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(84, 27).addBox(-0.5F, -1.25F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 24).addBox(-0.5F, -1.25F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(84, 21).addBox(-0.5F, -1.25F, -1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(48, 62).addBox(-0.5F, -0.95F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 13).addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5F, 0.5744F, -0.634F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(84, 18).addBox(-0.5F, -0.3512F, -0.023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 15).addBox(-0.5F, -0.3512F, -0.323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5F, -0.6168F, -1.8883F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(84, 12).addBox(-0.5F, -0.3512F, -0.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.5F, -0.6168F, -1.8883F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(67, 56).addBox(-0.5079F, -0.6866F, -0.5437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(67, 66).addBox(-0.5079F, -0.9866F, -0.5437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(53, 67).addBox(-0.5079F, -1.1866F, -0.5437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.0877F, -0.5746F, -0.5307F, 2.0008F, 0.7529F, -0.0214F));

		PartDefinition cube_r176 = Head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(21, 67).addBox(-0.5079F, -1.0937F, -0.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 66).addBox(-0.5079F, -0.7937F, -0.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0194F, -0.5745F, -0.4577F, 1.5558F, 0.7529F, -0.0214F));

		PartDefinition cube_r177 = Head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(13, 39).addBox(-0.503F, -0.5043F, -0.599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0194F, -0.5745F, -0.4577F, 1.3795F, 0.7877F, -0.0239F));

		PartDefinition cube_r178 = Head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(67, 39).addBox(-0.5075F, -0.2093F, -0.5989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.0194F, -0.5745F, -0.4577F, 1.3714F, 0.8219F, -0.0252F));

		PartDefinition cube_r179 = Head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(10, 68).addBox(-0.5075F, 0.0429F, -0.4432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0194F, -0.5745F, -0.4577F, 1.0048F, 0.8219F, -0.0252F));

		PartDefinition cube_r180 = Head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(79, 24).addBox(-0.5893F, -0.6733F, -0.643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6576F, -0.1821F, 0.1012F, 0.577F, 0.4119F, -0.2272F));

		PartDefinition cube_r181 = Head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(45, 79).addBox(-0.595F, -0.7882F, -0.4182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 30).addBox(-0.595F, -0.7882F, -0.1182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(79, 21).addBox(-0.595F, -0.7882F, 0.1818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, -0.1582F, 0.0498F, -0.3146F));

		PartDefinition cube_r182 = Head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(79, 27).addBox(-0.595F, -0.0764F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 79).addBox(-0.595F, -0.3764F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, 1.5609F, 0.0498F, -0.3146F));

		PartDefinition cube_r183 = Head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(44, 72).addBox(-0.595F, -0.7439F, -0.1251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, 1.2991F, 0.0498F, -0.3146F));

		PartDefinition cube_r184 = Head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(72, 39).addBox(-0.595F, -0.9743F, -0.4547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, 0.6534F, 0.0498F, -0.3146F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(79, 73).addBox(-0.595F, -0.8815F, -0.9073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, 0.2519F, 0.0498F, -0.3146F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 80).addBox(-0.595F, -0.9065F, -1.0329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, 0.5574F, 0.0498F, -0.3146F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(40, 81).addBox(-0.4828F, -0.5693F, -0.8329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0219F, -0.2985F, -2.0564F, -0.86F, 0.6097F, -1.1658F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(72, 54).addBox(-0.5359F, -0.5585F, -0.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0219F, -0.2985F, -2.0564F, -0.736F, 0.5283F, -0.7589F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 82).addBox(-0.5295F, -0.5675F, -0.3312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0219F, -0.2985F, -2.0564F, -0.9905F, 0.4998F, -0.7661F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 3).addBox(-0.4989F, -0.8626F, -0.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(80, 0).addBox(-0.4989F, -0.8626F, 0.2205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.1316F, -0.0347F, -2.3318F, -0.4717F, 0.3142F, -0.2042F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(39, 72).addBox(-0.595F, -0.7408F, -1.2216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, -0.0099F, 0.0498F, -0.3146F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(60, 38).addBox(-0.595F, -0.6175F, -0.8483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F))
				.texOffs(10, 71).addBox(-0.595F, -0.3175F, 0.1517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, -0.3153F, 0.0498F, -0.3146F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(79, 60).addBox(-0.595F, -0.6491F, -0.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F))
				.texOffs(79, 18).addBox(-0.595F, -0.6491F, -0.658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, 0.025F, 0.0498F, -0.3146F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(34, 72).addBox(-0.595F, -0.0998F, -0.1872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6576F, 0.1058F, -0.7551F, 0.601F, 0.0498F, -0.3146F));

		PartDefinition snout = Head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7307F, -2.9796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forehead = snout2.addOrReplaceChild("forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r195 = forehead.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.3867F, -0.6033F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.3867F, -0.5033F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.716F, 1.8083F, 2.8294F, -1.0551F, 0.069F, 0.4836F));

		PartDefinition cube_r196 = forehead.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.4651F, -0.3899F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.4651F, -0.4899F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.751F, 1.8257F, 3.0314F, -0.5278F, -0.1159F, 0.5466F));

		PartDefinition cube_r197 = forehead.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.5177F, -0.5068F, -0.4721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5177F, -0.4068F, -0.4721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.9757F, 1.983F, 3.2904F, -0.5046F, -0.3049F, 0.5304F));

		PartDefinition cube_r198 = forehead.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.519F, -0.2412F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.519F, -0.3412F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.519F, -0.4412F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.1914F, 2.1659F, 3.6753F, -0.3754F, -0.2858F, 0.5663F));

		PartDefinition cube_r199 = forehead.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.4985F, -0.3207F, -0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.4985F, -0.4207F, -0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.4985F, -0.5207F, -0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.3735F, 2.2015F, 3.9941F, -0.2422F, -0.4082F, 0.5849F));

		PartDefinition cube_r200 = forehead.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.4706F, -0.5933F, -0.4631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.4706F, -0.4933F, -0.6131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.4706F, -0.5933F, -0.6131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.5055F, 2.2912F, 4.2158F, -0.3689F, -0.3809F, 0.6647F));

		PartDefinition cube_r201 = forehead.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.3878F, -0.5438F, -0.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.3878F, -0.5438F, -0.3345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.3878F, -0.5438F, -0.4595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.6635F, 2.2062F, 4.6315F, -0.0109F, -0.2423F, 0.4559F));

		PartDefinition cube_r202 = forehead.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(65, 81).mirror().addBox(0.0095F, -0.3733F, -0.8846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 81).mirror().addBox(0.0095F, -0.3733F, -0.9846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(81, 48).mirror().addBox(0.0095F, -0.3733F, -1.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1316F, 1.6168F, 4.2201F, 0.2764F, 0.1582F, -0.7177F));

		PartDefinition cube_r203 = forehead.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.3921F, -0.4938F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.3921F, -0.3938F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.5886F, 2.1846F, 4.426F, -0.0115F, -0.3907F, 0.4577F));

		PartDefinition cube_r204 = forehead.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.5148F, -0.328F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5148F, -0.403F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5148F, -0.503F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5148F, -0.603F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.8692F, 1.9981F, 3.1058F, -0.3537F, -0.3561F, 0.4286F));

		PartDefinition cube_r205 = forehead.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.5438F, -0.3058F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5438F, -0.4058F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5438F, -0.5058F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.2592F, 2.2357F, 3.7969F, -0.2812F, -0.4481F, 0.4478F));

		PartDefinition cube_r206 = forehead.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.5191F, -0.419F, -0.5388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(69, 30).mirror().addBox(-0.5191F, -0.519F, -0.5388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.1089F, 2.1162F, 3.5292F, -0.3289F, -0.2716F, 0.5731F));

		PartDefinition cube_r207 = forehead.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(7, 62).mirror().addBox(-0.4108F, -0.6241F, -1.0382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3567F, 1.9551F, 4.3601F, -0.3395F, -0.304F, 0.3626F));

		PartDefinition cube_r208 = forehead.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(60, 81).mirror().addBox(-0.4472F, -0.4356F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8988F, 1.6422F, 3.8167F, 0.9497F, 1.0131F, 0.0763F));

		PartDefinition cube_r209 = forehead.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(55, 81).mirror().addBox(-0.411F, -0.4317F, -0.5361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7569F, 1.3491F, 4.331F, 0.0289F, 0.1683F, -0.4437F));

		PartDefinition cube_r210 = forehead.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-0.4163F, -0.4453F, -0.5005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7623F, 1.4131F, 4.0421F, 0.211F, 0.1304F, -0.566F));

		PartDefinition cube_r211 = forehead.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-0.4731F, -0.0513F, -1.0685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1316F, 1.6168F, 4.2201F, -0.8449F, -0.3839F, 0.86F));

		PartDefinition cube_r212 = forehead.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.3438F, -0.0513F, -0.7711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1316F, 1.6168F, 4.2201F, -0.7809F, -0.1729F, 0.6297F));

		PartDefinition cube_r213 = forehead.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.4938F, -0.123F, -0.1969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1316F, 1.6168F, 4.2201F, 0.5012F, -0.2576F, 0.2534F));

		PartDefinition cube_r214 = forehead.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-0.5091F, -0.1053F, -0.4221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1316F, 1.6168F, 4.2201F, 0.932F, -0.1884F, 0.2539F));

		PartDefinition cube_r215 = forehead.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.528F, -0.4361F, -0.97F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 80).mirror().addBox(-0.528F, -0.4361F, -0.67F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(80, 6).mirror().addBox(-0.528F, -0.4361F, -0.37F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0606F, 1.9169F, 3.7108F, -0.5245F, -0.514F, 0.0952F));

		PartDefinition cube_r216 = forehead.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-0.6983F, -0.5875F, -1.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(75, 81).mirror().addBox(-0.6983F, -0.5875F, -1.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-1.0606F, 1.9169F, 3.7108F, -0.2714F, -0.8809F, 0.096F));

		PartDefinition cube_r217 = forehead.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.549F, -0.3776F, -0.2691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0606F, 1.9169F, 3.7108F, -0.0563F, -0.3152F, 0.089F));

		PartDefinition cube_r218 = forehead.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(80, 81).addBox(-0.3017F, -0.5875F, -1.0822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(75, 81).addBox(-0.3017F, -0.5875F, -1.3072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.0606F, 1.9169F, 3.7108F, -0.2714F, 0.8809F, -0.096F));

		PartDefinition cube_r219 = forehead.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(25, 82).addBox(-0.6562F, -0.0513F, -0.7711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1316F, 1.6168F, 4.2201F, -0.7809F, 0.1729F, -0.6297F));

		PartDefinition cube_r220 = forehead.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 39).addBox(-0.527F, -0.0513F, -1.0685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1316F, 1.6168F, 4.2201F, -0.8449F, 0.3839F, -0.86F));

		PartDefinition cube_r221 = forehead.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(20, 80).addBox(-0.472F, -0.4361F, -0.97F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 80).addBox(-0.472F, -0.4361F, -0.67F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(80, 6).addBox(-0.472F, -0.4361F, -0.37F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0606F, 1.9169F, 3.7108F, -0.5245F, 0.514F, -0.0952F));

		PartDefinition cube_r222 = forehead.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(69, 30).addBox(-0.6133F, -0.6033F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.6133F, -0.5033F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-0.284F, 1.8083F, 2.8294F, -1.0551F, -0.069F, -0.4836F));

		PartDefinition cube_r223 = forehead.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(69, 30).addBox(-0.5349F, -0.3899F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.5349F, -0.4899F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-0.249F, 1.8257F, 3.0314F, -0.5278F, 0.1159F, -0.5466F));

		PartDefinition cube_r224 = forehead.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(69, 30).addBox(-0.4852F, -0.603F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.4852F, -0.328F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.4852F, -0.403F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.4852F, -0.503F, -0.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-0.1308F, 1.9981F, 3.1058F, -0.3537F, 0.3561F, -0.4286F));

		PartDefinition cube_r225 = forehead.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(69, 30).addBox(-0.4823F, -0.5068F, -0.4721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.4823F, -0.4068F, -0.4721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-0.0243F, 1.983F, 3.2904F, -0.5046F, 0.3049F, -0.5304F));

		PartDefinition cube_r226 = forehead.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(69, 30).addBox(-0.6122F, -0.5438F, -0.3345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.6122F, -0.5438F, -0.4595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.6122F, -0.5438F, -0.5845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.6635F, 2.2062F, 4.6315F, -0.0109F, 0.2423F, -0.4559F));

		PartDefinition cube_r227 = forehead.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(69, 30).addBox(-0.6079F, -0.4938F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(18, 70).addBox(-0.6079F, -0.3938F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.5886F, 2.1846F, 4.426F, -0.0115F, 0.3907F, -0.4577F));

		PartDefinition cube_r228 = forehead.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(69, 30).addBox(-0.5294F, -0.5933F, -0.4631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.5294F, -0.5933F, -0.6131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.5294F, -0.4933F, -0.6131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.5055F, 2.2912F, 4.2158F, -0.3689F, 0.3809F, -0.6647F));

		PartDefinition cube_r229 = forehead.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(69, 30).addBox(-0.5015F, -0.5207F, -0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.5015F, -0.4207F, -0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.5015F, -0.3207F, -0.5204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.3735F, 2.2015F, 3.9941F, -0.2422F, 0.4082F, -0.5849F));

		PartDefinition cube_r230 = forehead.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(69, 30).addBox(-0.4562F, -0.5058F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.4562F, -0.4058F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.4562F, -0.3058F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.2592F, 2.2357F, 3.7969F, -0.2812F, 0.4481F, -0.4478F));

		PartDefinition cube_r231 = forehead.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 30).addBox(-0.481F, -0.4412F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.481F, -0.2412F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.481F, -0.3412F, -0.4918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.1914F, 2.1659F, 3.6753F, -0.3754F, 0.2858F, -0.5663F));

		PartDefinition cube_r232 = forehead.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(69, 30).addBox(-0.4809F, -0.419F, -0.5388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(69, 30).addBox(-0.4809F, -0.519F, -0.5388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.1089F, 2.1162F, 3.5292F, -0.3289F, 0.2716F, -0.5731F));

		PartDefinition cube_r233 = forehead.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5062F, -0.123F, -0.1969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1316F, 1.6168F, 4.2201F, 0.5012F, 0.2576F, -0.2534F));

		PartDefinition cube_r234 = forehead.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(70, 81).addBox(-0.4909F, -0.1053F, -0.4221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1316F, 1.6168F, 4.2201F, 0.932F, 0.1884F, -0.2539F));

		PartDefinition cube_r235 = forehead.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(7, 62).addBox(-0.5892F, -0.6241F, -1.0382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3567F, 1.9551F, 4.3601F, -0.3395F, 0.304F, -0.3626F));

		PartDefinition cube_r236 = forehead.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 62).addBox(-0.451F, -0.3776F, -0.2691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0606F, 1.9169F, 3.7108F, -0.0563F, 0.3152F, -0.089F));

		PartDefinition cube_r237 = forehead.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(80, 36).addBox(-0.5F, -0.3702F, -0.3561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5F, 1.1764F, 4.4946F, -0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r238 = forehead.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(81, 48).addBox(-1.0095F, -0.3733F, -1.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 81).addBox(-1.0095F, -0.3733F, -0.8846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 81).addBox(-1.0095F, -0.3733F, -0.9846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.1316F, 1.6168F, 4.2201F, 0.2764F, -0.1582F, 0.7177F));

		PartDefinition cube_r239 = forehead.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(55, 81).addBox(-0.589F, -0.4317F, -0.5361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2431F, 1.3491F, 4.331F, 0.0289F, -0.1683F, 0.4437F));

		PartDefinition cube_r240 = forehead.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(81, 51).addBox(-0.5837F, -0.4453F, -0.5005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2377F, 1.4131F, 4.0421F, 0.211F, -0.1304F, 0.566F));

		PartDefinition cube_r241 = forehead.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(60, 81).addBox(-0.5528F, -0.4356F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1012F, 1.6422F, 3.8167F, 0.9497F, -1.0131F, -0.0763F));

		PartDefinition cube_r242 = forehead.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(80, 42).addBox(-1.1F, -0.3345F, -0.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(35, 81).addBox(-1.1F, -0.3345F, -0.1579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1F, 1.4036F, 3.3672F, 0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r243 = forehead.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(80, 45).addBox(-0.6F, -0.3506F, -0.3567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.4F, 1.1764F, 4.1946F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r244 = forehead.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(81, 9).addBox(-0.6F, -0.4038F, -0.3467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.4F, 1.2764F, 3.8946F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r245 = forehead.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(30, 81).addBox(-0.6F, -0.5979F, -0.3346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.4F, 1.5861F, 3.7337F, 0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r246 = forehead.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(80, 33).addBox(-0.6F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.4F, 1.5912F, 3.2363F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(15, 73).addBox(0.6646F, -0.2238F, -0.9653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F))
				.texOffs(15, 73).mirror().addBox(-1.6646F, -0.2238F, -0.9653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5262F, -0.0568F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.4661F, -0.835F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.735F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.635F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.3979F, -0.2782F, -3.0191F, 0.3242F, -0.8157F, -0.6052F));

		PartDefinition cube_r248 = Jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.4661F, -0.6921F, -0.597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.5921F, -0.597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.7921F, -0.597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.5921F, -0.722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.3979F, -0.2782F, -3.0191F, 0.1147F, -0.8157F, -0.6052F));

		PartDefinition cube_r249 = Jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.5154F, -0.3254F, -0.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5154F, -0.4254F, -0.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5154F, -0.3754F, -1.1459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5154F, -0.5254F, -0.7209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5154F, -0.4254F, -0.7209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.8318F, -0.3061F, -2.3507F, -0.0947F, -0.5411F, -0.4723F));

		PartDefinition cube_r250 = Jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.5154F, -0.4187F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5154F, -0.5187F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.8318F, -0.3061F, -2.3507F, -0.0117F, -0.5411F, -0.4723F));

		PartDefinition cube_r251 = Jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.5246F, -0.4361F, -1.2297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.5361F, -1.2297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.6361F, -1.2297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.4861F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.5861F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.6861F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.5111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.8111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.6111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.7111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.3861F, -1.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.4861F, -1.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.4611F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.5611F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.6611F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.6611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.5611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.4611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.7611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -0.2427F, -1.3425F, 0.0079F, -0.3126F, -0.4222F));

		PartDefinition cube_r252 = Jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(-0.6734F, -0.4604F, -1.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(20, 74).mirror().addBox(-0.6734F, -0.4604F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(74, 18).mirror().addBox(-0.6734F, -0.4604F, -1.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8868F, -0.125F, -2.3287F, -0.2748F, -0.8525F, 0.2185F));

		PartDefinition cube_r253 = Jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.4661F, -0.9321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.7321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.8321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.4661F, -0.6321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-0.3979F, -0.2782F, -3.0191F, 0.5423F, -0.8157F, -0.6052F));

		PartDefinition cube_r254 = Jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.5246F, -0.7611F, -0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.6611F, -0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.5246F, -0.5611F, -0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(-1.1841F, -0.2249F, -1.2236F, -0.0183F, -0.3126F, -0.4222F));

		PartDefinition cube_r255 = Jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(-0.6734F, -0.0592F, -1.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(71, 69).mirror().addBox(-0.6734F, -0.0592F, -1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3505F)).mirror(false), PartPose.offsetAndRotation(-0.8868F, -0.125F, -2.3287F, -0.5846F, -0.8525F, 0.2185F));

		PartDefinition cube_r256 = Jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(69, 61).mirror().addBox(-0.3519F, -0.4661F, -0.6696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(61, 69).mirror().addBox(-0.3519F, -0.4661F, -0.9696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-0.8868F, -0.125F, -2.3287F, -0.1598F, -0.4697F, 0.0626F));

		PartDefinition cube_r257 = Jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-0.3519F, -0.3876F, -1.161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.8868F, -0.125F, -2.3287F, -0.2776F, -0.4697F, 0.0626F));

		PartDefinition cube_r258 = Jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 69).mirror().addBox(-0.3519F, -0.349F, -1.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false)
				.texOffs(38, 69).mirror().addBox(-0.3519F, -0.349F, -1.0243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(26, 68).mirror().addBox(-0.3519F, -0.349F, -0.7243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-0.8868F, -0.125F, -2.3287F, -0.09F, -0.4697F, 0.0626F));

		PartDefinition cube_r259 = Jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(27, 61).mirror().addBox(-0.4496F, -0.4611F, -1.6047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-1.2118F, -0.125F, -1.1537F, -0.0082F, -0.341F, 0.0287F));

		PartDefinition cube_r260 = Jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-0.3779F, -0.3711F, -0.6381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false)
				.texOffs(74, 12).addBox(1.9514F, -0.3711F, -0.6381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, 0.8247F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.3779F, -0.1406F, -1.1406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(5, 74).mirror().addBox(-0.3779F, -0.1406F, -1.4156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3545F)).mirror(false)
				.texOffs(68, 72).mirror().addBox(-0.3779F, -0.0406F, -1.1406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(23, 71).mirror().addBox(-0.3779F, -0.0406F, -1.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(68, 72).addBox(1.9514F, -0.0406F, -1.1406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 74).addBox(1.9514F, -0.1406F, -1.1406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(5, 74).addBox(1.9514F, -0.1406F, -1.4156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3545F))
				.texOffs(23, 71).addBox(1.9514F, -0.0406F, -1.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.3779F, -0.5326F, -1.4502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 74).addBox(1.9514F, -0.5326F, -1.4502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, 0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(73, 72).mirror().addBox(-0.3779F, -0.4125F, -1.169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false)
				.texOffs(73, 72).addBox(1.9514F, -0.4125F, -1.169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(49, 73).mirror().addBox(-0.3779F, -0.1507F, -0.4797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(63, 72).mirror().addBox(-0.3779F, -0.1507F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(49, 73).addBox(1.9514F, -0.1507F, -0.4797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 72).addBox(1.9514F, -0.1507F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, 0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(-0.3779F, -0.1493F, -0.7129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(28, 73).addBox(1.9514F, -0.1493F, -0.7129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r266 = Jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(72, 64).mirror().addBox(-0.3779F, -0.1015F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(71, 48).mirror().addBox(-0.3779F, -0.1015F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 64).addBox(1.9514F, -0.1015F, -0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(71, 48).addBox(1.9514F, -0.1015F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, -0.7112F, 0.0F, 0.0F));

		PartDefinition cube_r267 = Jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(60, 34).mirror().addBox(-0.4496F, -0.1854F, -1.6114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2118F, -0.125F, -1.1537F, -0.1304F, -0.341F, 0.0287F));

		PartDefinition cube_r268 = Jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-0.3779F, -0.0839F, -0.2627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(71, 51).addBox(1.9514F, -0.0839F, -0.2627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2868F, -0.125F, -0.0537F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r269 = Jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(76, 9).addBox(-0.3266F, -0.4604F, -1.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(20, 74).addBox(-0.3266F, -0.4604F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(74, 18).addBox(-0.3266F, -0.4604F, -1.366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8868F, -0.125F, -2.3287F, -0.2748F, 0.8525F, -0.2185F));

		PartDefinition cube_r270 = Jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(74, 15).addBox(-0.3266F, -0.0592F, -1.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(71, 69).addBox(-0.3266F, -0.0592F, -1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3505F)), PartPose.offsetAndRotation(0.8868F, -0.125F, -2.3287F, -0.5846F, 0.8525F, -0.2185F));

		PartDefinition cube_r271 = Jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(48, 69).addBox(-0.6481F, -0.3876F, -1.161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.8868F, -0.125F, -2.3287F, -0.2776F, 0.4697F, -0.0626F));

		PartDefinition cube_r272 = Jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(61, 69).addBox(-0.6481F, -0.4661F, -0.9696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F))
				.texOffs(69, 61).addBox(-0.6481F, -0.4661F, -0.6696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8868F, -0.125F, -2.3287F, -0.1598F, 0.4697F, -0.0626F));

		PartDefinition cube_r273 = Jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(43, 69).addBox(-0.6481F, -0.349F, -1.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F))
				.texOffs(38, 69).addBox(-0.6481F, -0.349F, -1.0243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(26, 68).addBox(-0.6481F, -0.349F, -0.7243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(0.8868F, -0.125F, -2.3287F, -0.09F, 0.4697F, -0.0626F));

		PartDefinition cube_r274 = Jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(74, 27).addBox(-0.4846F, -0.3754F, -1.1459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4846F, -0.3254F, -0.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4846F, -0.4254F, -0.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4846F, -0.4254F, -0.7209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4846F, -0.5254F, -0.7209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.8318F, -0.3061F, -2.3507F, -0.0947F, 0.5411F, 0.4723F));

		PartDefinition cube_r275 = Jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(74, 27).addBox(-0.5339F, -0.5921F, -0.722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.7921F, -0.597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.6921F, -0.597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.5921F, -0.597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.3979F, -0.2782F, -3.0191F, 0.1147F, 0.8157F, 0.6052F));

		PartDefinition cube_r276 = Jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(74, 27).addBox(-0.5339F, -0.6321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.9321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.8321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.7321F, -0.9123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.3979F, -0.2782F, -3.0191F, 0.5423F, 0.8157F, 0.6052F));

		PartDefinition cube_r277 = Jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(74, 27).addBox(-0.5339F, -0.635F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.835F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.5339F, -0.735F, -0.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.3979F, -0.2782F, -3.0191F, 0.3242F, 0.8157F, 0.6052F));

		PartDefinition cube_r278 = Jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(74, 27).addBox(-0.4846F, -0.4187F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4846F, -0.5187F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.8318F, -0.3061F, -2.3507F, -0.0117F, 0.5411F, 0.4723F));

		PartDefinition cube_r279 = Jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(74, 27).addBox(-0.4754F, -0.4861F, -1.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.3861F, -1.4047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.6361F, -1.2297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.5361F, -1.2297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.4361F, -1.2297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.6611F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.5611F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.4611F, -1.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.4861F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.5861F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.6861F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.7611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.4611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.5611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.6611F, -0.7047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.8111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.7111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.6111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.5111F, -0.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(1.15F, -0.2427F, -1.3425F, 0.0079F, 0.3126F, 0.4222F));

		PartDefinition cube_r280 = Jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(74, 27).addBox(-0.4754F, -0.7611F, -0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.6611F, -0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(74, 27).addBox(-0.4754F, -0.5611F, -0.5047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(1.1841F, -0.2249F, -1.2236F, -0.0183F, 0.3126F, 0.4222F));

		PartDefinition cube_r281 = Jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(27, 61).addBox(-0.5504F, -0.4611F, -1.6047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(1.2118F, -0.125F, -1.1537F, -0.0082F, 0.341F, -0.0287F));

		PartDefinition cube_r282 = Jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(60, 34).addBox(-0.5504F, -0.1854F, -1.6114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.2118F, -0.125F, -1.1537F, -0.1304F, 0.341F, -0.0287F));

		PartDefinition FrontFlipperR2 = Chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4879F, 4.4123F, -3.3832F, -0.1361F, -0.3795F, 0.8012F));

		PartDefinition cube_r283 = FrontFlipperR2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(56, 59).addBox(-2.175F, -0.5F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4466F, -0.1811F, -1.197F, 0.0F, 0.4014F, 0.0F));

		PartDefinition cube_r284 = FrontFlipperR2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 56).addBox(-0.7F, -0.5F, -0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.0348F, -0.1811F, -0.3184F, 0.0F, -3.098F, 0.0F));

		PartDefinition cube_r285 = FrontFlipperR2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(29, 58).addBox(-18.5684F, 3.1028F, -4.5567F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.8934F, -3.7839F, -18.3595F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r286 = FrontFlipperR2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(42, 53).addBox(12.0777F, 3.1028F, 12.1899F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5266F, -3.7839F, -18.0565F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r287 = FrontFlipperR2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(42, 56).addBox(-5.6567F, 3.1028F, 16.1684F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4723F, -3.7839F, -17.8396F, 0.0F, 0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(36, 31).addBox(1.7883F, 4.1028F, -1.9294F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(5, 80).addBox(0.7883F, 3.6028F, -1.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 68).addBox(0.7883F, 3.6028F, -0.8294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(21, 62).addBox(0.7883F, 3.6028F, 0.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 66).addBox(-0.0116F, 3.6028F, -0.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(43, 66).addBox(-0.2117F, 3.6028F, -1.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2723F, -4.2839F, -0.6396F, 0.0F, 0.0436F, 0.0F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create().texOffs(17, 31).addBox(3.5697F, 4.1194F, 16.5588F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9888F, 0.0F, -18.8073F, 0.0F, -0.1309F, 0.0F));

		PartDefinition FrontFlipperR3 = Chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4879F, 4.4123F, -3.3832F, -0.0648F, 0.3971F, -0.6136F));

		PartDefinition cube_r288 = FrontFlipperR3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(60, 27).addBox(-0.825F, -0.5F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.4466F, -0.1811F, -1.197F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r289 = FrontFlipperR3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(20, 56).addBox(-2.3F, -0.5F, -0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.0348F, -0.1811F, -0.3184F, 0.0F, 3.098F, 0.0F));

		PartDefinition cube_r290 = FrontFlipperR3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(0, 59).addBox(15.5684F, 3.1028F, -4.5567F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.8934F, -3.7839F, -18.3595F, 0.0F, -1.789F, 0.0F));

		PartDefinition cube_r291 = FrontFlipperR3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(60, 56).addBox(-14.0777F, 3.1028F, 12.1899F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.5266F, -3.7839F, -18.0565F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r292 = FrontFlipperR3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(51, 56).addBox(2.6567F, 3.1028F, 16.1684F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4723F, -3.7839F, -17.8396F, 0.0F, -0.2182F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(26, 43).addBox(-5.7883F, 4.1028F, -1.9294F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(81, 66).addBox(-1.7883F, 3.6028F, -1.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 68).addBox(-1.7883F, 3.6028F, -0.8294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 66).addBox(-1.7883F, 3.6028F, 0.1706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 50).addBox(-0.9884F, 3.6028F, -0.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(66, 53).addBox(-0.7883F, 3.6028F, -1.6294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2723F, -4.2839F, -0.6396F, 0.0F, -0.0436F, 0.0F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create().texOffs(0, 35).addBox(-9.5697F, 4.1194F, 16.5588F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9888F, 0.0F, -18.8073F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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