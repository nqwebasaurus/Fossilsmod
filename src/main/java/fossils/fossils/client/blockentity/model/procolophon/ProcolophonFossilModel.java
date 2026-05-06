package fossils.fossils.client.blockentity.model.procolophon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProcolophonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;

	public ProcolophonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck3 = this.chest.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.3257F, 9.9094F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(75, 89).addBox(0.0F, -1.6F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0108F, 0.957F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 89).addBox(0.0F, -2.2F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1106F, -0.9639F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 52).addBox(0.0F, -2.15F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, -2.9602F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 6).mirror().addBox(-2.7F, 0.0F, 0.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2993F, -3.0262F, -0.0492F, -0.0179F, -0.3486F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 6).addBox(-0.3F, 0.0F, 0.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2993F, -3.0262F, -0.0492F, 0.0179F, 0.3486F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.066F, 1.2946F, -0.6724F, 0.1642F, -0.0594F, 0.3878F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(63, 38).addBox(-0.9074F, -0.9062F, 0.3999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, 0.3497F, 1.789F, 0.0F, -0.2705F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 75).addBox(-0.9074F, 0.4212F, 1.4538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, 0.3497F, 2.3562F, 0.0F, -0.2705F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(31, 69).addBox(-0.9074F, 0.7319F, -0.3429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, 0.3497F, -3.0543F, 0.0F, -0.2705F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 46).addBox(-0.9074F, -0.2576F, -2.6704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, 0.3497F, -1.789F, 0.0F, -0.2705F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(17, 76).addBox(-0.9074F, -1.9321F, -1.9356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, 0.3497F, -1.0472F, 0.0F, -0.2705F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(79, 29).addBox(-0.9074F, -2.2247F, -0.6264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, 0.3497F, -0.3927F, 0.0F, -0.2705F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 45).addBox(-0.9074F, -1.6744F, -1.2618F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2177F, -0.0448F, 0.3497F, -0.1309F, 0.0F, -0.2705F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 0).addBox(-0.7941F, -0.1929F, 0.5023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, -0.131F, 0.1452F, 0.5915F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 77).addBox(-0.7941F, 2.5714F, 1.1079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, 0.8289F, 0.1452F, 0.5915F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(69, 3).addBox(-0.7941F, 0.1948F, -0.6731F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, -1.6146F, 0.1452F, 0.5915F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(74, 74).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 74).addBox(-0.5F, -1.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2739F, 0.8668F, -1.6017F, -0.8471F, -0.0072F, 0.1223F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 74).addBox(-0.7941F, 0.8647F, -1.6967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, -1.1346F, 0.1452F, 0.5915F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 32).addBox(-0.7941F, 0.159F, 2.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, -2.9236F, 0.1452F, 0.5915F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(13, 41).addBox(-1.8441F, -0.1534F, -0.4045F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6259F, 2.2116F, 0.3679F, 2.974F, -0.0244F, -0.5782F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 46).addBox(-0.7941F, -0.8784F, -0.4045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, 3.0542F, 0.1452F, 0.5915F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(66, 42).addBox(-0.7941F, -0.6256F, -1.6639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, 2.6615F, 0.1452F, 0.5915F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(53, 58).addBox(-1.85F, -1.5F, -0.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6934F, 2.966F, 2.8196F, 1.3836F, -0.056F, -0.5282F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(7, 68).addBox(-0.7941F, 1.0757F, -1.2086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, 1.4398F, 0.1452F, 0.5915F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(55, 70).addBox(-0.8099F, -0.2841F, 0.124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2567F, 1.5896F, 0.4378F, 0.8293F, 0.1523F, 0.5901F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(59, 50).addBox(-0.5F, -0.8F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2843F, 0.7002F, 0.2875F, 0.4625F, 0.0F, 0.1222F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 25).addBox(-0.9F, 1.4337F, -1.4348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3937F, -1.5399F, 0.9058F, -0.2618F, 0.0F, 0.1222F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.066F, 4.2832F, -0.411F, 0.1642F, 0.0594F, -0.3878F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 38).mirror().addBox(-0.0926F, -0.9062F, 0.3999F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -3.0333F, 0.0883F, 1.789F, 0.0F, 0.2705F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.0926F, 0.4212F, 1.4538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -3.0333F, 0.0883F, 2.3562F, 0.0F, 0.2705F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(31, 69).mirror().addBox(-0.0926F, 0.7319F, -0.3429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -3.0333F, 0.0883F, -3.0543F, 0.0F, 0.2705F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-0.0926F, -0.2576F, -2.6704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -3.0333F, 0.0883F, -1.789F, 0.0F, 0.2705F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(17, 76).mirror().addBox(-0.0926F, -1.9321F, -1.9356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -3.0333F, 0.0883F, -1.0472F, 0.0F, 0.2705F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(-0.0926F, -2.2247F, -0.6264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -3.0333F, 0.0883F, -0.3927F, 0.0F, 0.2705F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(59, 45).mirror().addBox(-0.0926F, -1.6744F, -1.2618F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2177F, -3.0333F, 0.0883F, -0.1309F, 0.0F, 0.2705F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.2059F, -0.1929F, 0.5023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, -0.131F, -0.1452F, -0.5915F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(64, 77).mirror().addBox(-0.2059F, 2.5714F, 1.1079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, 0.8289F, -0.1452F, -0.5915F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(-0.2059F, 0.1948F, -0.6731F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, -1.6146F, -0.1452F, -0.5915F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(69, 74).mirror().addBox(-0.5F, -1.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2739F, -2.1218F, -1.8632F, -0.8471F, 0.0072F, -0.1223F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(22, 74).mirror().addBox(-0.2059F, 0.8647F, -1.6967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, -1.1346F, -0.1452F, -0.5915F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-0.2059F, 0.159F, 2.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, -2.9236F, -0.1452F, -0.5915F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(13, 41).mirror().addBox(-0.1559F, -0.1534F, -0.4045F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6259F, -0.777F, 0.1065F, 2.974F, 0.0244F, 0.5782F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(39, 46).mirror().addBox(-0.2059F, -0.8784F, -0.4045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, 3.0542F, -0.1452F, -0.5915F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-0.2059F, -0.6256F, -1.6639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, 2.6615F, -0.1452F, -0.5915F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(53, 58).mirror().addBox(-0.15F, -1.5F, -0.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -0.0226F, 2.5581F, 1.3836F, 0.056F, 0.5282F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.2059F, 1.0757F, -1.2086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, 1.4398F, -0.1452F, -0.5915F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(55, 70).mirror().addBox(-0.19F, -0.2841F, 0.124F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -1.399F, 0.1763F, 0.8293F, -0.1523F, -0.5901F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 50).mirror().addBox(-0.5F, -0.8F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2843F, -2.2883F, 0.0261F, 0.4625F, 0.0F, -0.1222F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(58, 25).mirror().addBox(-0.1F, 1.4337F, -1.4348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -4.5285F, 0.6444F, -0.2618F, 0.0F, -0.1222F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1681F, 2.702F, -0.4567F, -0.1897F, 0.0263F, -1.56F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5F, 2.625F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(60, 70).addBox(-0.5F, -1.775F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.6623F, 1.0579F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg8_r1 = upperleg2.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(79, 57).addBox(0.5F, -0.9032F, 0.847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(11, 51).addBox(0.5F, 5.0968F, -2.153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(7, 64).addBox(0.5F, -0.9032F, -0.853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 0.7754F, -0.5098F, 0.5498F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(0, 72).addBox(0.5F, 2.3969F, -0.578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(12, 70).addBox(0.5F, -1.0281F, -0.428F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.6534F, -0.2882F, 0.7069F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(14, 56).addBox(0.5F, -1.5686F, -1.0385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 56).addBox(0.5F, -1.5686F, -1.5385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9409F, 6.5938F, 1.4069F, 1.1146F, -1.4251F, 0.303F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(34, 57).addBox(-0.2F, -0.1F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4465F, 2.5773F, 0.804F, -1.5708F, 1.5184F, -1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(67, 20).addBox(-1.2F, -6.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.4465F, 6.1385F, 0.0506F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(58, 30).addBox(-0.9F, -0.15F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.1465F, 0.0786F, -0.0092F, 1.5708F, 1.5446F, 1.5708F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(60, 63).addBox(-0.375F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.3465F, 0.4899F, -0.1802F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition leg6_r1 = leg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(72, 17).addBox(-0.45F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6465F, 2.1365F, 0.1654F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition leg4_r3 = leg2.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(75, 83).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.6465F, 2.5837F, 0.5729F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(70, 83).addBox(-0.1F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.6465F, 3.2811F, 0.6339F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg5_r2 = leg2.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(14, 64).addBox(-0.1F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.6465F, 3.7792F, 0.6775F, -1.5708F, 1.4661F, -1.5708F));

		PartDefinition leg7_r1 = leg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(5, 81).addBox(-0.75F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(81, 0).addBox(-0.75F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0465F, 2.1365F, 0.1654F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition leg5_r3 = leg2.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(72, 21).addBox(-0.45F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.0465F, 2.1365F, 0.1654F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition leg5_r4 = leg2.addOrReplaceChild("leg5_r4", CubeListBuilder.create().texOffs(53, 63).addBox(-0.9821F, -0.6095F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F))
				.texOffs(39, 63).addBox(-0.9821F, 0.1905F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3465F, 0.9402F, -0.6918F, 1.5708F, 1.2828F, 1.5708F));

		PartDefinition leg4_r4 = leg2.addOrReplaceChild("leg4_r4", CubeListBuilder.create().texOffs(64, 5).addBox(-0.1F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0465F, 3.7792F, 0.6775F, -1.5708F, 1.4661F, -1.5708F));

		PartDefinition leg4_r5 = leg2.addOrReplaceChild("leg4_r5", CubeListBuilder.create().texOffs(79, 72).addBox(-0.1F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0465F, 3.2811F, 0.6339F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg5_r5 = leg2.addOrReplaceChild("leg5_r5", CubeListBuilder.create().texOffs(10, 81).addBox(-0.325F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 9).addBox(-0.325F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.0465F, 2.5837F, 0.5729F, -1.5708F, 1.3963F, -1.5708F));

		PartDefinition leg3_r3 = leg2.addOrReplaceChild("leg3_r3", CubeListBuilder.create().texOffs(79, 69).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-1.0465F, 2.5837F, 0.5729F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(32, 26).addBox(-2.0487F, -0.975F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4567F, 0.979F, 0.1707F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0487F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0229F, -2.7873F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5752F, 2.7979F, -0.3523F, -0.7114F, -0.0378F, 1.4999F));

		PartDefinition upperleg6_r2 = upperleg3.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(17, 72).mirror().addBox(-0.5F, 2.625F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 70).mirror().addBox(-0.5F, -1.775F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6623F, 1.0579F, -0.0349F, 0.0F, 0.0F));

		PartDefinition upperleg9_r1 = upperleg3.addOrReplaceChild("upperleg9_r1", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-1.5F, -0.9032F, 0.847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(11, 51).mirror().addBox(-1.5F, 5.0968F, -2.153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(7, 64).mirror().addBox(-1.5F, -0.9032F, -0.853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7754F, -0.5098F, 0.5498F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg3.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.5F, 2.3969F, -0.578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(12, 70).mirror().addBox(-1.5F, -1.0281F, -0.428F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6534F, -0.2882F, 0.7069F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-1.5F, -1.5686F, -1.0385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 56).mirror().addBox(-1.5F, -1.5686F, -1.5385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.3578F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9409F, 6.5938F, 1.4069F, 1.2455F, 1.4251F, -0.303F));

		PartDefinition leg5_r6 = leg3.addOrReplaceChild("leg5_r6", CubeListBuilder.create().texOffs(34, 57).mirror().addBox(-0.8F, -0.1F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4465F, 2.5773F, 0.804F, -1.5708F, -1.5184F, 1.5708F));

		PartDefinition leg4_r6 = leg3.addOrReplaceChild("leg4_r6", CubeListBuilder.create().texOffs(67, 20).mirror().addBox(0.2F, -6.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.4465F, 6.1385F, 0.0506F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition leg5_r7 = leg3.addOrReplaceChild("leg5_r7", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-0.1F, -0.15F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.1465F, 0.0786F, -0.0092F, 1.5708F, -1.5446F, -1.5708F));

		PartDefinition leg4_r7 = leg3.addOrReplaceChild("leg4_r7", CubeListBuilder.create().texOffs(60, 63).mirror().addBox(-0.625F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(1.3465F, 0.4899F, -0.1802F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition leg7_r2 = leg3.addOrReplaceChild("leg7_r2", CubeListBuilder.create().texOffs(72, 17).mirror().addBox(-0.55F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.6465F, 2.1365F, 0.1654F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition leg5_r8 = leg3.addOrReplaceChild("leg5_r8", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.9F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.6465F, 2.5837F, 0.5729F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition leg6_r2 = leg3.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-0.9F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.6465F, 3.2811F, 0.6339F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg6_r3 = leg3.addOrReplaceChild("leg6_r3", CubeListBuilder.create().texOffs(14, 64).mirror().addBox(-0.9F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.6465F, 3.7792F, 0.6775F, -1.5708F, -1.4661F, 1.5708F));

		PartDefinition leg8_r1 = leg3.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.25F, -0.5F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(81, 0).mirror().addBox(-0.25F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.1365F, 0.1654F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition leg6_r4 = leg3.addOrReplaceChild("leg6_r4", CubeListBuilder.create().texOffs(72, 21).mirror().addBox(-0.55F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.1365F, 0.1654F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition leg6_r5 = leg3.addOrReplaceChild("leg6_r5", CubeListBuilder.create().texOffs(53, 63).mirror().addBox(-0.0179F, -0.6095F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false)
				.texOffs(39, 63).mirror().addBox(-0.0179F, 0.1905F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3465F, 0.9402F, -0.6918F, 1.5708F, -1.2828F, -1.5708F));

		PartDefinition leg5_r9 = leg3.addOrReplaceChild("leg5_r9", CubeListBuilder.create().texOffs(64, 5).mirror().addBox(-0.9F, 0.2F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 3.7792F, 0.6775F, -1.5708F, -1.4661F, 1.5708F));

		PartDefinition leg5_r10 = leg3.addOrReplaceChild("leg5_r10", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-0.9F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 3.2811F, 0.6339F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg6_r6 = leg3.addOrReplaceChild("leg6_r6", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.675F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(81, 9).mirror().addBox(-0.675F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.5837F, 0.5729F, -1.5708F, -1.3963F, 1.5708F));

		PartDefinition leg4_r8 = leg3.addOrReplaceChild("leg4_r8", CubeListBuilder.create().texOffs(79, 69).mirror().addBox(-0.9F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(1.0465F, 2.5837F, 0.5729F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(32, 26).mirror().addBox(-2.9513F, -0.975F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.4567F, 0.979F, 0.0398F, 0.0F, 0.0F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.9513F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0229F, -2.7873F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(28, 35).addBox(-0.5F, -0.5001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, -2.025F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5001F, -2.0122F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 78).addBox(0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4001F, -4.0122F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-2.8706F, -0.6889F, -0.538F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2001F, -3.5122F, 0.1571F, 0.2735F, -0.8594F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 60).mirror().addBox(-1.9934F, -0.0076F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2001F, -3.5122F, 0.2412F, 0.2037F, -0.5072F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 62).mirror().addBox(-2.0143F, 0.1184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.567F, -0.312F, -1.5178F, 0.2922F, 0.0983F, -0.5294F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(72, 62).addBox(0.0143F, 0.1184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.567F, -0.312F, -1.5178F, 0.2922F, -0.0983F, 0.5294F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 60).addBox(-0.0066F, -0.0076F, -0.538F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2001F, -3.5122F, 0.2412F, -0.2037F, 0.5072F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 51).addBox(1.8706F, -0.6889F, -0.538F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2001F, -3.5122F, 0.1571F, -0.2735F, 0.8594F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(15, 34).addBox(-0.5F, -0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -4.9122F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 75).addBox(0.0F, -2.025F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(78, 49).addBox(0.0F, -2.175F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2953F, -1.1018F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(47, 78).addBox(0.0F, -2.025F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.6F, 0.233F, 0.1044F, -0.2646F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(72, 25).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.6F, 0.1841F, 0.1774F, -0.6095F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-6.1344F, -2.3955F, -0.471F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.6F, 0.0807F, 0.2421F, -1.096F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 27).mirror().addBox(-5.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.6F, 0.079F, 0.2247F, -1.2012F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-3.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.6F, 0.1743F, 0.1629F, -0.7158F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(72, 29).mirror().addBox(-2.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.6F, 0.2189F, 0.094F, -0.3707F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(74, 11).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.6F, 0.2339F, 0.1201F, -0.4567F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.6F, 0.1795F, 0.1925F, -0.8025F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(72, 31).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.6F, 0.1795F, -0.1925F, 0.8025F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 11).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.6F, 0.2339F, -0.1201F, 0.4567F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(72, 29).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.6F, 0.2189F, -0.094F, 0.3707F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 70).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.6F, 0.1743F, -0.1629F, 0.7158F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(72, 27).addBox(3.1344F, -2.3955F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.6F, 0.079F, -0.2247F, 1.2012F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 18).addBox(3.1344F, -2.3955F, -0.471F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.6F, 0.0807F, -0.2421F, 1.096F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(72, 25).addBox(1.8864F, -0.6775F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.6F, 0.1841F, -0.1774F, 0.6095F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(22, 72).addBox(0.0044F, 0.0085F, -0.471F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.6F, 0.233F, -0.1044F, 0.2646F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(17, 20).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.3617F, -4.3475F, 0.3403F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(26, 47).addBox(-0.5F, -0.4F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.1245F, -0.0839F, -0.0324F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(66, 89).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3234F, -3.1169F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(27, 80).addBox(0.0F, -2.075F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -2.05F, -4.025F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.4395F, -0.1183F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(-7.121F, -2.399F, -0.5124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.6F, 0.0597F, 0.0965F, -1.0658F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.6F, 0.1114F, 0.0214F, -0.2385F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.6F, 0.0975F, 0.0581F, -0.5859F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(21, 12).mirror().addBox(-8.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.6F, 0.0597F, 0.0965F, -1.092F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(72, 64).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.6F, 0.0975F, 0.0581F, -0.6121F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(65, 72).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.6F, 0.1114F, 0.0214F, -0.2647F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 72).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.6F, 0.1114F, -0.0214F, 0.2647F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(72, 64).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.6F, 0.0975F, -0.0581F, 0.6121F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(21, 12).addBox(3.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.6F, 0.0597F, -0.0965F, 1.092F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(72, 35).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.6F, 0.0975F, -0.0581F, 0.5859F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(72, 33).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.6F, 0.1114F, -0.0214F, 0.2385F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(54, 43).addBox(3.121F, -2.399F, -0.5124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.6F, 0.0597F, -0.0965F, 1.0658F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r92 = body4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(69, 89).addBox(0.0F, -1.9F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3234F, -3.1169F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(89, 66).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(17, 14).addBox(-3.0F, -2.05F, -3.025F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.9983F, -0.4146F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(49, 19).mirror().addBox(-8.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.6F, 0.0565F, 0.0443F, -1.1184F));

		PartDefinition cube_r96 = body4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 66).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.6F, 0.0708F, -0.0117F, -0.2911F));

		PartDefinition cube_r97 = body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.6F, 0.0706F, 0.0132F, -0.6392F));

		PartDefinition cube_r98 = body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 56).mirror().addBox(-7.121F, -2.399F, -0.5124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.6F, 0.0555F, 0.0268F, -1.1795F));

		PartDefinition cube_r99 = body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.6F, 0.0616F, -0.0018F, -0.7004F));

		PartDefinition cube_r100 = body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.6F, 0.0573F, -0.0228F, -0.3519F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(72, 72).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.6F, 0.0573F, 0.0228F, 0.3519F));

		PartDefinition cube_r102 = body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 70).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.6F, 0.0616F, 0.0018F, 0.7004F));

		PartDefinition cube_r103 = body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 56).addBox(3.121F, -2.399F, -0.5124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.6F, 0.0555F, -0.0268F, 1.1795F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(72, 68).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.6F, 0.0706F, -0.0132F, 0.6392F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(72, 66).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.6F, 0.0708F, 0.0117F, 0.2911F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(49, 19).addBox(3.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.6F, 0.0565F, -0.0443F, 1.1184F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(41, 41).addBox(-1.5F, 6.4667F, -4.1296F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0708F, -0.2057F, -4.9622F, -0.1622F, -0.1039F, 0.0076F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5648F, 0.1395F, 3.1618F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(60, 89).addBox(0.0F, -1.9413F, -0.0199F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -1.1223F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(34, 53).addBox(0.0F, -1.9505F, 0.0138F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -3.1223F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-2.0552F, 0.0397F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1356F, 0.5233F, -2.5223F, 0.2519F, 0.0608F, -0.4511F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(-5.1918F, -2.4119F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1356F, 0.5233F, -2.5223F, 0.1268F, 0.2264F, -1.2734F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(17, 70).mirror().addBox(-3.9448F, -0.6656F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1356F, 0.5233F, -2.5223F, 0.2168F, 0.1427F, -0.7923F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(48, 70).mirror().addBox(-1.9867F, -0.0324F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6356F, 0.4233F, -0.5223F, 0.192F, 0.0564F, -0.3755F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-3.8558F, -0.71F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6356F, 0.4233F, -0.5223F, 0.1616F, 0.1184F, -0.7204F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(64, 55).mirror().addBox(-6.0923F, -2.4102F, -0.5535F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6356F, 0.4233F, -0.5223F, 0.0887F, 0.1795F, -1.2019F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(49, 15).mirror().addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1415F, 7.5431F, -3.737F, -0.0073F, -1.2773F, -0.0374F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(13, 47).mirror().addBox(-0.4F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5634F, 7.5214F, -1.8225F, 2.0966F, -1.3721F, -2.1323F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(13, 47).addBox(-3.6F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4219F, 7.5214F, -1.8225F, 2.0966F, 1.3721F, 2.1323F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(49, 15).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 7.5431F, -3.737F, -0.0073F, 1.2773F, 0.0374F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(32, 31).addBox(-3.8643F, 0.3353F, -3.4116F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8643F, 6.5016F, -2.0965F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(26, 42).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4667F, -1.1296F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(64, 55).addBox(3.0923F, -2.4102F, -0.5535F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 0.4233F, -0.5223F, 0.0887F, -0.1795F, 1.2019F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(48, 72).addBox(1.8558F, -0.71F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 0.4233F, -0.5223F, 0.1616F, -0.1184F, 0.7204F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 70).addBox(-0.0133F, -0.0324F, -0.5535F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 0.4233F, -0.5223F, 0.192F, -0.0564F, 0.3755F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(17, 70).addBox(1.9448F, -0.6656F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.5233F, -2.5223F, 0.2168F, -0.1427F, 0.7923F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(66, 53).addBox(3.1918F, -2.4119F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.5233F, -2.5223F, 0.1268F, -0.2264F, 1.2734F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(36, 72).addBox(0.0552F, 0.0397F, -0.5747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.5233F, -2.5223F, 0.2519F, -0.0608F, 0.4511F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5092F, 5.6985F, -2.8142F, 1.1714F, 0.4993F, -0.9131F));

		PartDefinition cube_r128 = UpperArmL.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.8038F, -0.6576F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r129 = UpperArmL.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(86, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.7762F, -0.891F, 2.906F, 0.0F, 0.0F));

		PartDefinition cube_r130 = UpperArmL.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 84).addBox(-0.5F, -0.5952F, -0.1735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 5.9134F, 0.1182F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r131 = UpperArmL.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(85, 84).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.6737F, 1.0068F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r132 = UpperArmL.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(85, 34).addBox(-0.5F, -0.1735F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r133 = UpperArmL.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(67, 65).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r134 = UpperArmL.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -0.575F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3172F, -0.7939F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r135 = UpperArmL.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(34, 74).addBox(-0.5F, -1.0F, -1.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 0.9812F, 0.3128F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r136 = UpperArmL.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(67, 60).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, 0.0517F, -0.1309F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7602F, 6.4048F, -0.4863F, -0.9568F, 0.1582F, 0.8226F));

		PartDefinition cube_r137 = LowerArmL.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(54, 74).addBox(-0.5082F, -2.2519F, -0.591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.0349F, 1.1781F, 0.0F));

		PartDefinition cube_r138 = LowerArmL.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(49, 74).addBox(-0.5082F, -2.2001F, -0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.2094F, 1.1781F, 0.0F));

		PartDefinition cube_r139 = LowerArmL.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(62, 11).addBox(-0.5082F, -0.6606F, -0.607F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(29, 53).addBox(-0.5082F, -2.6606F, 0.243F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1918F, 2.0606F, -0.343F, 0.0F, 1.1781F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(38, 7).addBox(-2.5F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3596F, 6.5636F, 0.8265F, 0.3032F, -0.5561F, 0.2408F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(21, 0).addBox(-3.0F, -1.0F, -3.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.0087F, -1.9028F, -0.1396F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6507F, 5.6985F, -2.8142F, 0.4867F, -0.2886F, 1.067F));

		PartDefinition cube_r140 = UpperArmL2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.8038F, -0.6576F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r141 = UpperArmL2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.7762F, -0.891F, 2.906F, 0.0F, 0.0F));

		PartDefinition cube_r142 = UpperArmL2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.5F, -0.5952F, -0.1735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.9134F, 0.1182F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r143 = UpperArmL2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.6737F, 1.0068F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r144 = UpperArmL2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(85, 34).mirror().addBox(-0.5F, -0.1735F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r145 = UpperArmL2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r146 = UpperArmL2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.5F, -0.575F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3172F, -0.7939F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r147 = UpperArmL2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(34, 74).mirror().addBox(-0.5F, -1.0F, -1.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.9812F, 0.3128F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r148 = UpperArmL2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.9641F, 0.0517F, -0.1309F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7602F, 6.4048F, -0.4863F, -1.1498F, -0.1861F, -0.8616F));

		PartDefinition cube_r149 = LowerArmL2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(54, 74).mirror().addBox(-0.4918F, -2.2519F, -0.591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.0349F, -1.1781F, 0.0F));

		PartDefinition cube_r150 = LowerArmL2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(49, 74).mirror().addBox(-0.4918F, -2.2001F, -0.5165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.2094F, -1.1781F, 0.0F));

		PartDefinition cube_r151 = LowerArmL2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(62, 11).mirror().addBox(-0.4918F, -0.6606F, -0.607F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(29, 53).mirror().addBox(-0.4918F, -2.6606F, 0.243F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 2.0606F, -0.343F, 0.0F, -1.1781F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(38, 7).mirror().addBox(-2.5F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3596F, 6.5636F, 0.8265F, 0.8694F, 0.3821F, 0.0394F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-2.0F, -1.0F, -3.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.0894F, 6.9489F, -4.5662F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(50, 46).addBox(-0.4985F, -1.1656F, -0.3552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.7733F, 0.0258F, -0.1343F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(87, 18).addBox(-0.4985F, -0.2558F, 0.5439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(87, 15).addBox(-0.4985F, 0.3442F, 0.5439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, -0.8847F, 0.0258F, -0.1343F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(70, 86).addBox(-0.4985F, 0.2027F, -0.8077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.1189F, 0.0258F, -0.1343F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(8, 87).addBox(-0.4985F, -0.064F, -0.4448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.337F, 0.0258F, -0.1343F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(3, 87).addBox(-0.4985F, -1.1132F, -0.4934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, -0.2302F, 0.0258F, -0.1343F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 79).addBox(-0.4985F, -0.9211F, -0.8522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.4243F, 0.0258F, -0.1343F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(49, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9092F, -2.9171F, -0.1444F, 1.0788F, 0.0258F, -0.2652F));

		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(54, 38).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4268F, -3.0481F, -0.1573F, 1.3449F, 0.1582F, 0.244F));

		PartDefinition cube_r160 = bone2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(50, 51).addBox(-0.4985F, -1.2105F, -0.3305F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.2009F, -3.0403F, 1.4738F, 0.9042F, 0.0258F, -0.1343F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.2309F, 6.9489F, -4.5662F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 46).mirror().addBox(-0.5015F, -1.1656F, -0.3552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.7733F, -0.0258F, 0.1343F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-0.5015F, -0.2558F, 0.5439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(87, 15).mirror().addBox(-0.5015F, 0.3442F, 0.5439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, -0.8847F, -0.0258F, 0.1343F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-0.5015F, 0.2027F, -0.8077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.1189F, -0.0258F, 0.1343F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(8, 87).mirror().addBox(-0.5015F, -0.064F, -0.4448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.337F, -0.0258F, 0.1343F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(3, 87).mirror().addBox(-0.5015F, -1.1132F, -0.4934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, -0.2302F, -0.0258F, 0.1343F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5015F, -0.9211F, -0.8522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.4243F, -0.0258F, 0.1343F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(49, 25).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.9092F, -2.9171F, -0.1444F, 1.0788F, -0.0258F, 0.2652F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4268F, -3.0481F, -0.1573F, 1.3449F, -0.1582F, -0.244F));

		PartDefinition cube_r169 = bone3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-0.5015F, -1.2105F, -0.3305F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.2009F, -3.0403F, 1.4738F, 0.9042F, -0.0258F, 0.1343F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.3519F, -3.8154F, -0.0668F, -0.2676F, -0.0668F));

		PartDefinition cube_r170 = neck3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(81, 89).addBox(0.5F, -0.7305F, -0.0119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3701F, -3.1662F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(89, 62).addBox(0.5F, -1.7805F, -0.0119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5965F, -1.1791F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-1.6552F, 0.0397F, -0.5748F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3297F, -0.2286F, -0.5069F, 0.1943F, 0.3517F, -0.3559F));

		PartDefinition cube_r173 = neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(88, 79).mirror().addBox(-1.0552F, 0.0397F, -0.5748F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3297F, -0.2286F, -2.5069F, -0.008F, 0.6224F, -0.4636F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(88, 79).addBox(0.0552F, 0.0397F, -0.5748F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2286F, -2.5069F, -0.008F, -0.6224F, 0.4636F));

		PartDefinition cube_r175 = neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(5, 73).addBox(-0.3448F, 0.0397F, -0.5748F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2286F, -0.5069F, 0.1943F, -0.3517F, 0.3559F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(49, 30).addBox(-0.0648F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0038F, 0.07F, -2.8972F, 0.0505F, -0.2074F, -0.0672F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(85, 87).addBox(-0.5154F, -1.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(87, 73).addBox(-0.5154F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.0456F, 1.7555F, -11.805F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 6).addBox(-0.567F, -0.925F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, 1.1209F, -11.9481F, -1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(50, 87).addBox(-0.567F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0059F, 1.0449F, -12.013F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(40, 87).addBox(-0.567F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(35, 87).addBox(-0.567F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0059F, 0.0455F, -11.9781F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(39, 57).addBox(-1.5154F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, 0.2522F, -0.0702F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(37, 52).addBox(-1.5154F, -1.8F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -0.9155F, -3.0826F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0154F, -2.2F, -2.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9544F, -1.7259F, 0.2255F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(41, 35).addBox(-2.0154F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -1.7259F, 0.2255F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(54, 35).addBox(-2.5154F, 0.4F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(53, 8).addBox(-2.5154F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -3.3325F, -0.39F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(81, 49).addBox(-0.5154F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -0.6441F, -11.2717F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(40, 81).addBox(-0.5154F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0456F, -1.2459F, -10.4731F, 2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(35, 81).addBox(-1.0154F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -1.7383F, -9.6027F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(30, 81).addBox(-1.0154F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4544F, -2.1129F, -8.6755F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(20, 81).addBox(-0.5154F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -2.4468F, -7.7329F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(65, 33).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, 1.9786F, -8.7793F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(20, 53).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, 1.4834F, -5.8204F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 44).addBox(-2.5F, -1.7F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, 0.3235F, -4.4808F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(19, 61).addBox(-1.0154F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -3.3239F, -4.864F, 1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(67, 57).addBox(-1.5154F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -3.5658F, -3.8937F, -2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(53, 67).addBox(-1.5154F, 1.6F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(60, 83).addBox(-0.9F, 0.825F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 21).addBox(-2.5154F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4544F, -3.7472F, -1.3F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(53, 5).addBox(-2.5154F, -0.775F, -1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4544F, -2.4199F, -0.2565F, -0.4276F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1277F, 2.2692F, -11.2683F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(64, 74).addBox(-0.8762F, -1.7592F, -0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6849F, -1.5176F, 10.6856F, 1.4084F, 0.1272F, -0.0142F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(12, 74).addBox(-1.3355F, 0.6612F, -0.8884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3888F, -2.5379F, 8.3631F, 1.529F, 1.3034F, 0.3411F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(26, 68).addBox(-0.0857F, 0.9763F, -0.8884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3888F, -2.5379F, 8.3631F, 1.5537F, 0.8672F, 0.3684F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(46, 62).addBox(-1.1742F, -0.9477F, -0.8884F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.3888F, -2.5379F, 8.3631F, 1.5517F, 0.9545F, 0.3658F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(26, 62).addBox(-1.225F, -1.5F, -0.325F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0358F, -2.1525F, 8.5724F, 1.4642F, 0.7783F, -0.0871F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 13).addBox(-0.723F, -3.6692F, 0.0049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6849F, -1.5176F, 10.6856F, 1.4932F, 0.2133F, -0.0286F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(19, 58).addBox(-2.3478F, -4.4505F, 0.4548F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.6849F, -1.5176F, 10.6856F, 1.619F, 0.3179F, -0.0298F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(66, 50).addBox(-1.902F, -0.807F, -0.3738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8238F, -2.0817F, 6.3151F, 2.0319F, 0.5533F, 0.051F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(76, 0).addBox(-0.8814F, -1.0066F, -1.5635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8238F, -2.0817F, 6.3151F, 1.093F, 0.555F, 0.0823F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(45, 83).addBox(-1.0F, -0.975F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8748F, -1.4451F, 4.6375F, 2.2292F, 0.0214F, 1.2616F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(82, 16).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9044F, -0.4636F, 4.8267F, 1.8056F, 0.6214F, 0.1083F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(73, 49).addBox(-0.975F, -0.375F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0864F, -1.5568F, 4.9743F, 2.1925F, -0.0364F, 1.2355F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(79, 26).addBox(-0.8814F, -2.1102F, -1.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.8238F, -2.0817F, 6.3151F, 1.8784F, 0.555F, 0.0823F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(79, 13).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4129F, -1.3074F, 4.0014F, 1.9597F, -0.0293F, 1.1663F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(50, 78).addBox(-0.9207F, 2.8714F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.216F, -0.2584F, 0.9912F, 1.7548F, 0.3458F, 0.0262F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(19, 66).addBox(-0.45F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3337F, -0.1152F, 0.2966F, 1.8878F, 0.8165F, 0.1212F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(89, 30).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2708F, -0.3183F, 4.7823F, 1.915F, 0.4144F, 0.0467F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(89, 59).addBox(-0.475F, 0.6966F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 56).addBox(-0.475F, -0.1034F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4432F, 0.0639F, 3.0058F, 1.7841F, 0.4144F, 0.0467F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(55, 89).addBox(-0.525F, -0.8935F, -0.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4432F, 0.0639F, 3.0058F, 1.6532F, 0.4144F, 0.0467F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(89, 53).addBox(-0.55F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.084F, 0.055F, 1.841F, 1.6012F, 0.2401F, 0.044F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 29).addBox(-0.525F, -0.5F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8492F, 0.1443F, 1.0749F, 1.8229F, 0.2908F, 0.0574F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(15, 82).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8933F, 0.0532F, 0.1937F, 2.8166F, -0.6793F, 0.4029F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(83, 78).addBox(-0.6915F, -0.016F, 1.2898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.391F, -0.4584F, 2.3912F, -2.9154F, 0.3522F, 0.036F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(84, 58).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8793F, -1.8211F, 0.2261F, -2.0954F, 0.6807F, -1.9402F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(84, 64).addBox(-0.75F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4574F, -2.0107F, -0.548F, -1.7599F, 0.6503F, 0.071F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(84, 70).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6765F, -1.6581F, -0.2693F, -0.7318F, 0.724F, 0.0795F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(84, 67).addBox(-0.725F, -0.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(84, 61).addBox(-0.725F, -0.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(84, 55).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4411F, -2.5264F, -0.3312F, -0.8907F, 0.4818F, -0.1973F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(40, 84).addBox(-0.9121F, 1.9381F, -0.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9312F, -3.9345F, 1.6391F, -0.778F, 0.1917F, 0.1373F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(84, 12).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6726F, -3.1642F, 0.4005F, -1.0288F, 0.4419F, -0.2404F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(10, 84).addBox(-0.9121F, 0.9726F, -0.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9312F, -3.9345F, 1.6391F, -0.9089F, 0.1917F, 0.1373F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(79, 23).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7891F, -3.4583F, 0.7876F, -1.1495F, -0.6905F, -1.0058F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(15, 79).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8541F, -3.707F, 1.2165F, -1.2186F, 0.4183F, -0.5795F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(79, 3).addBox(-1.0142F, -0.0144F, -0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9312F, -3.9345F, 1.6391F, -1.0407F, 0.1087F, 0.0726F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(65, 86).addBox(-0.7F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3793F, -2.5687F, 1.1852F, 2.5223F, 0.4182F, -1.9166F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(60, 86).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6726F, -3.3291F, 1.8377F, 0.98F, 0.3926F, -1.9551F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(55, 86).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7143F, -3.5218F, 2.2972F, -0.2146F, 0.3466F, -1.9282F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(84, 3).addBox(-1.0F, -1.0F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5345F, -1.951F, 1.4194F, -2.6119F, 0.3133F, 0.2373F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(73, 45).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0017F, -2.448F, 2.1775F, -0.7978F, 0.9909F, 2.5315F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(29, 73).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0434F, -2.6407F, 2.6369F, -0.4034F, -0.0414F, -3.0252F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(86, 47).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9174F, -3.9551F, 1.6437F, 0.311F, -0.8839F, -1.1223F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(45, 86).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9591F, -4.1478F, 2.1031F, 0.2081F, 0.3504F, -0.8063F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(75, 86).addBox(-1.3693F, -0.6669F, -6.5942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8267F, -5.866F, 7.9354F, 0.3993F, 0.0721F, 0.044F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(73, 41).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1195F, -2.9718F, 3.4885F, -0.3443F, -0.0839F, -3.1306F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(79, 60).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7945F, -3.8707F, 3.1944F, -0.1933F, 0.2984F, -1.9177F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(79, 6).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.042F, -4.5089F, 3.0316F, 0.1719F, 0.3111F, -0.8143F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(25, 85).addBox(-1.3693F, -0.3732F, -5.6214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8267F, -5.866F, 7.9354F, 0.3469F, 0.0721F, 0.044F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(74, 3).addBox(-0.475F, -0.5F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8828F, -4.5529F, 4.8538F, -1.2467F, 0.2125F, 0.0508F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(79, 63).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7629F, -4.7075F, 5.305F, -2.5786F, -0.982F, -0.4752F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(46, 66).addBox(-1.0817F, -0.9882F, -0.0812F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8346F, -5.7421F, 6.9935F, -2.8407F, -0.0091F, 0.0052F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(80, 83).addBox(-1.0067F, -0.0382F, -0.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8267F, -5.866F, 7.9354F, -1.4397F, 0.0774F, 0.0166F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0275F, -0.1551F, -1.3127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 81).addBox(-1.0275F, -0.1551F, -0.9127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.216F, -0.2584F, 0.9912F, -3.1371F, 0.2563F, 0.035F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(82, 75).addBox(-0.7F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(82, 19).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4185F, -0.8683F, -0.4366F, -0.7227F, -0.3023F, -0.7135F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(83, 44).addBox(-0.4F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 41).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.188F, -1.0784F, -0.4343F, -1.2379F, -0.8284F, -0.2254F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(83, 38).addBox(-0.7F, -0.7F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6256F, -1.1569F, -0.2525F, -1.5878F, -0.8775F, 0.2355F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(65, 25).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6256F, -1.1569F, -0.2525F, -0.6326F, -0.4782F, -0.9485F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 65).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8034F, -1.453F, -0.0509F, -0.6135F, 0.5038F, 0.2131F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(88, 40).addBox(-0.7015F, -0.225F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(88, 43).addBox(-0.6015F, -0.325F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(88, 37).addBox(-0.7015F, -0.225F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6634F, -1.7767F, -0.254F, -0.6989F, 0.6702F, 0.0597F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 87).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2881F, -1.9872F, -0.5792F, -1.6152F, 0.6702F, 0.0597F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(89, 12).addBox(-0.8015F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2847F, -1.7259F, -0.7272F, -0.0444F, 0.6702F, 0.0597F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(13, 88).addBox(-0.9015F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(25, 88).addBox(-0.9015F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3282F, -2.2237F, -0.7098F, -0.0348F, 0.0423F, 0.0858F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(79, 66).addBox(-1.0F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8267F, -5.809F, 10.4233F, -0.103F, -0.3853F, -1.0972F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(84, 28).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.079F, -4.9251F, 10.9858F, 0.429F, 0.8645F, -0.9404F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(84, 31).addBox(-1.0F, 0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(30, 84).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7649F, -5.429F, 11.0208F, 0.429F, 0.8645F, -0.9404F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(44, 74).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.6142F, -4.3445F, 10.7005F, 0.8653F, 0.8645F, -0.9404F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(39, 74).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2887F, -4.5959F, 11.3664F, 0.096F, 0.9361F, -1.3626F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(46, 56).addBox(-0.8887F, -2.4915F, -0.4121F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.8849F, -1.5176F, 10.6856F, 1.1303F, 0.0056F, -0.1931F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(38, 67).addBox(-0.85F, -2.85F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.6319F, -2.6376F, 11.6232F, 0.8257F, -0.0042F, -0.2552F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(60, 58).addBox(-0.45F, -2.05F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(3.048F, -3.5157F, 10.0246F, -0.0821F, -0.0385F, -0.6465F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(31, 65).addBox(-0.85F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.2432F, -3.9307F, 9.8821F, -0.0903F, -0.0082F, -0.2987F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(75, 37).addBox(-1.3662F, 1.02F, -0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.216F, -0.2584F, 0.9912F, 1.6463F, 0.5232F, 0.0379F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(50, 84).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0552F, -1.2019F, 3.2173F, 2.0099F, 0.0211F, 1.2642F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 22).addBox(0.0F, -0.925F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1923F, -4.2474F, 7.8063F, -1.7356F, -1.1051F, 1.1393F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(55, 83).addBox(-0.125F, -0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3059F, -3.3831F, 7.8048F, -0.7099F, -1.395F, 0.5948F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(20, 84).addBox(0.0F, -0.925F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1781F, -3.4367F, 7.2211F, -1.2399F, -0.9036F, 1.1762F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(5, 84).addBox(-0.6F, 0.35F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3795F, -3.2913F, 7.8697F, -1.1326F, -0.7869F, 1.2658F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(83, 52).addBox(0.0F, -0.2F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3795F, -3.2913F, 7.8697F, -1.3534F, -0.0487F, 1.5709F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(73, 53).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5522F, -3.3883F, 9.8599F, -1.4669F, -0.0487F, 1.5709F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(67, 14).addBox(0.0F, 0.7F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 11).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.6324F, -5.1643F, 9.8531F, -1.4716F, -0.0034F, 1.0929F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 69).addBox(-2.0F, -0.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.5461F, -5.1157F, 8.858F, -1.4899F, 0.075F, 0.4423F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(69, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.5461F, -5.1157F, 8.858F, -1.4793F, -0.4902F, 0.3931F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(60, 67).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8267F, -6.0164F, 9.9683F, -1.49F, 0.0576F, 0.4409F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -1.4F, -0.425F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5544F, -1.0594F, 4.1994F, 1.7907F, 0.3144F, 0.1748F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(84, 6).addBox(-1.1688F, 1.9634F, -0.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.216F, -0.2584F, 0.9912F, 1.6893F, 0.4243F, 0.0196F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2497F, 2.2692F, -11.2683F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(64, 74).mirror().addBox(-0.1238F, -1.7592F, -0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6849F, -1.5176F, 10.6856F, 1.4084F, -0.1272F, 0.0142F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(12, 74).mirror().addBox(0.3355F, 0.6612F, -0.8884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3888F, -2.5379F, 8.3631F, 1.529F, -1.3034F, -0.3411F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(26, 68).mirror().addBox(-0.9143F, 0.9763F, -0.8884F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3888F, -2.5379F, 8.3631F, 1.5537F, -0.8672F, -0.3684F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-0.8258F, -0.9477F, -0.8884F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.3888F, -2.5379F, 8.3631F, 1.5517F, -0.9545F, -0.3658F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(26, 62).mirror().addBox(0.225F, -1.5F, -0.325F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0358F, -2.1525F, 8.5724F, 1.4642F, -0.7783F, 0.0871F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(74, 13).mirror().addBox(-0.277F, -3.6692F, 0.0049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6849F, -1.5176F, 10.6856F, 1.4932F, -0.2133F, 0.0286F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-0.6522F, -4.4505F, 0.4548F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.6849F, -1.5176F, 10.6856F, 1.619F, -0.3179F, 0.0298F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(66, 50).mirror().addBox(-0.098F, -0.807F, -0.3738F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8238F, -2.0817F, 6.3151F, 2.0319F, -0.5533F, -0.051F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.1186F, -1.0066F, -1.5635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8238F, -2.0817F, 6.3151F, 1.093F, -0.555F, -0.0823F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(0.0F, -0.975F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8748F, -1.4451F, 4.6375F, 2.2292F, -0.0214F, -1.2616F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(82, 16).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9044F, -0.4636F, 4.8267F, 1.8056F, -0.6214F, -0.1083F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(73, 49).mirror().addBox(-0.025F, -0.375F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0864F, -1.5568F, 4.9743F, 2.1925F, 0.0364F, -1.2355F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(79, 26).mirror().addBox(-0.1186F, -2.1102F, -1.1009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8238F, -2.0817F, 6.3151F, 1.8784F, -0.555F, -0.0823F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(79, 13).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4129F, -1.3074F, 4.0014F, 1.9597F, 0.0293F, -1.1663F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(-0.0793F, 2.8714F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.216F, -0.2584F, 0.9912F, 1.7548F, -0.3458F, -0.0262F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(19, 66).mirror().addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3337F, -0.1152F, 0.2966F, 1.8878F, -0.8165F, -0.1212F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(89, 30).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2708F, -0.3183F, 4.7823F, 1.915F, -0.4144F, -0.0467F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-0.525F, 0.6966F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(89, 56).mirror().addBox(-0.525F, -0.1034F, -0.5022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4432F, 0.0639F, 3.0058F, 1.7841F, -0.4144F, -0.0467F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(-0.475F, -0.8935F, -0.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4432F, 0.0639F, 3.0058F, 1.6532F, -0.4144F, -0.0467F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-0.45F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.084F, 0.055F, 1.841F, 1.6012F, -0.2401F, -0.044F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(65, 29).mirror().addBox(-0.475F, -0.5F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8492F, 0.1443F, 1.0749F, 1.8229F, -0.2908F, -0.0574F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8933F, 0.0532F, 0.1937F, 2.8166F, 0.6793F, -0.4029F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-0.3085F, -0.016F, 1.2898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.391F, -0.4584F, 2.3912F, -2.9154F, -0.3522F, -0.036F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8793F, -1.8211F, 0.2261F, -2.0954F, -0.6807F, 1.9402F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(-0.25F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4574F, -2.0107F, -0.548F, -1.7599F, -0.6503F, -0.071F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(84, 70).mirror().addBox(-0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6765F, -1.6581F, -0.2693F, -0.7318F, -0.724F, -0.0795F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(84, 67).mirror().addBox(-0.275F, -0.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 61).mirror().addBox(-0.275F, -0.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(84, 55).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4411F, -2.5264F, -0.3312F, -0.8907F, -0.4818F, 0.1973F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(40, 84).mirror().addBox(-0.0879F, 1.9381F, -0.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9312F, -3.9345F, 1.6391F, -0.778F, -0.1917F, -0.1373F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6726F, -3.1642F, 0.4005F, -1.0288F, -0.4419F, 0.2404F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-0.0879F, 0.9726F, -0.1352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9312F, -3.9345F, 1.6391F, -0.9089F, -0.1917F, -0.1373F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(79, 23).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7891F, -3.4583F, 0.7876F, -1.1495F, 0.6905F, 1.0058F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8541F, -3.707F, 1.2165F, -1.2186F, -0.4183F, 0.5795F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(0.0142F, -0.0144F, -0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9312F, -3.9345F, 1.6391F, -1.0407F, -0.1087F, -0.0726F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3793F, -2.5687F, 1.1852F, 2.5223F, -0.4182F, 1.9166F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6726F, -3.3291F, 1.8377F, 0.98F, -0.3926F, 1.9551F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(55, 86).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7143F, -3.5218F, 2.2972F, -0.2146F, -0.3466F, 1.9282F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(0.0F, -1.0F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5345F, -1.951F, 1.4194F, -2.6119F, -0.3133F, -0.2373F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0017F, -2.448F, 2.1775F, -0.7978F, -0.9909F, -2.5315F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(29, 73).mirror().addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0434F, -2.6407F, 2.6369F, -0.4034F, 0.0414F, 3.0252F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(86, 47).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9174F, -3.9551F, 1.6437F, 0.311F, 0.8839F, 1.1223F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9591F, -4.1478F, 2.1031F, 0.2081F, -0.3504F, 0.8063F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(0.3693F, -0.6669F, -6.5942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8267F, -5.866F, 7.9354F, 0.3993F, -0.0721F, -0.044F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(73, 41).mirror().addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1195F, -2.9718F, 3.4885F, -0.3443F, 0.0839F, 3.1306F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(79, 60).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7945F, -3.8707F, 3.1944F, -0.1933F, -0.2984F, 1.9177F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.042F, -4.5089F, 3.0316F, 0.1719F, -0.3111F, 0.8143F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(0.3693F, -0.3732F, -5.6214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8267F, -5.866F, 7.9354F, 0.3469F, -0.0721F, -0.044F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(74, 3).mirror().addBox(-0.525F, -0.5F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, -4.5529F, 4.8538F, -1.2467F, -0.2125F, -0.0508F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(79, 63).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7629F, -4.7075F, 5.305F, -2.5786F, 0.982F, 0.4752F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(46, 66).mirror().addBox(0.0817F, -0.9882F, -0.0812F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8346F, -5.7421F, 6.9935F, -2.8407F, 0.0091F, -0.0052F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(0.0067F, -0.0382F, -0.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8267F, -5.866F, 7.9354F, -1.4397F, -0.0774F, -0.0166F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(0.0275F, -0.1551F, -1.3127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 81).mirror().addBox(0.0275F, -0.1551F, -0.9127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.216F, -0.2584F, 0.9912F, -3.1371F, -0.2563F, -0.035F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-0.3F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(82, 19).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4185F, -0.8683F, -0.4366F, -0.7227F, 0.3023F, 0.7135F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-0.6F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 41).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.188F, -1.0784F, -0.4343F, -1.2379F, 0.8284F, 0.2254F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(83, 38).mirror().addBox(-0.3F, -0.7F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6256F, -1.1569F, -0.2525F, -1.5878F, 0.8775F, -0.2355F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6256F, -1.1569F, -0.2525F, -0.6326F, 0.4782F, 0.9485F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8034F, -1.453F, -0.0509F, -0.6135F, -0.5038F, -0.2131F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-0.2985F, -0.225F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(88, 43).mirror().addBox(-0.3985F, -0.325F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(88, 37).mirror().addBox(-0.2985F, -0.225F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6634F, -1.7767F, -0.254F, -0.6989F, -0.6702F, -0.0597F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 87).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2881F, -1.9872F, -0.5792F, -1.6152F, -0.6702F, -0.0597F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-0.1985F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2847F, -1.7259F, -0.7272F, -0.0444F, -0.6702F, -0.0597F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(13, 88).mirror().addBox(-0.0985F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(25, 88).mirror().addBox(-0.0985F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3282F, -2.2237F, -0.7098F, -0.0348F, -0.0423F, -0.0858F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(0.0F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8267F, -5.809F, 10.4233F, -0.103F, 0.3853F, 1.0972F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(84, 28).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.079F, -4.9251F, 10.9858F, 0.429F, -0.8645F, 0.9404F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(0.0F, 0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(30, 84).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7649F, -5.429F, 11.0208F, 0.429F, -0.8645F, 0.9404F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(44, 74).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6142F, -4.3445F, 10.7005F, 0.8653F, -0.8645F, 0.9404F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(39, 74).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2887F, -4.5959F, 11.3664F, 0.096F, -0.9361F, 1.3626F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(46, 56).mirror().addBox(-0.1113F, -2.4915F, -0.4121F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.8849F, -1.5176F, 10.6856F, 1.1303F, -0.0056F, 0.1931F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(38, 67).mirror().addBox(-0.15F, -2.85F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.6319F, -2.6376F, 11.6232F, 0.8257F, 0.0042F, 0.2552F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(-0.55F, -2.05F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-3.048F, -3.5157F, 10.0246F, -0.0821F, 0.0385F, 0.6465F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(31, 65).mirror().addBox(-0.15F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.2432F, -3.9307F, 9.8821F, -0.0903F, 0.0082F, 0.2987F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(0.3662F, 1.02F, -0.231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.216F, -0.2584F, 0.9912F, 1.6463F, -0.5232F, -0.0379F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(50, 84).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0552F, -1.2019F, 3.2173F, 2.0099F, -0.0211F, -1.2642F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-1.0F, -0.925F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1923F, -4.2474F, 7.8063F, -1.7356F, 1.1051F, -1.1393F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(-0.875F, -0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3059F, -3.3831F, 7.8048F, -0.7099F, 1.395F, -0.5948F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-1.0F, -0.925F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1781F, -3.4367F, 7.2211F, -1.2399F, 0.9036F, -1.1762F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.4F, 0.35F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3795F, -3.2913F, 7.8697F, -1.1326F, 0.7869F, -1.2658F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(83, 52).mirror().addBox(-1.0F, -0.2F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3795F, -3.2913F, 7.8697F, -1.3534F, 0.0487F, -1.5709F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(73, 53).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5522F, -3.3883F, 9.8599F, -1.4669F, 0.0487F, -1.5709F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(67, 14).mirror().addBox(-2.0F, 0.7F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 11).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6324F, -5.1643F, 9.8531F, -1.4716F, 0.0034F, -1.0929F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(0.0F, -0.3F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.5461F, -5.1157F, 8.858F, -1.4899F, -0.075F, -0.4423F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5461F, -5.1157F, 8.858F, -1.4793F, 0.4902F, -0.3931F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(60, 67).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8267F, -6.0164F, 9.9683F, -1.49F, -0.0576F, -0.4409F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.0F, -1.4F, -0.425F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5544F, -1.0594F, 4.1994F, 1.7907F, -0.3144F, -0.1748F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(0.1688F, 1.9634F, -0.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.216F, -0.2584F, 0.9912F, 1.6893F, -0.4243F, -0.0196F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9543F, 1.0779F, -0.6912F, 1.2128F, 0.0209F, -0.0035F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(69, 77).mirror().addBox(-0.0053F, -1.2498F, 0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(32, 78).mirror().addBox(-0.0053F, -1.141F, 0.8102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 2.4691F, -0.0168F, 0.0306F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(74, 77).mirror().addBox(-0.0053F, -0.9646F, 0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 2.7746F, -0.0168F, 0.0306F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(-0.1717F, 1.6566F, -0.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, -1.8512F, -0.104F, 0.0656F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.1717F, -0.1955F, -3.5758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, -0.2804F, -0.104F, 0.0656F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(78, 54).mirror().addBox(-0.1717F, -4.4487F, -1.2692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 1.1595F, -0.104F, 0.0656F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.0186F, -2.801F, 0.2291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, 2.3258F, -0.2872F, 0.3225F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(74, 57).mirror().addBox(-0.0103F, 0.9767F, 1.8921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -2.4667F, -0.2632F, 0.2962F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(0.0338F, 1.871F, 1.9725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -2.5214F, -0.2533F, 0.3678F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.881F, -0.9902F, -0.9803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4307F, -3.1966F, -6.9051F, -0.9994F, -0.2684F, 0.3788F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(0.0669F, 2.077F, -3.7259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -0.9968F, -0.2391F, 0.3783F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(80, 86).mirror().addBox(-0.881F, -1.9176F, -0.0865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4307F, -3.1966F, -6.9051F, 0.5278F, -0.2684F, 0.3788F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(80, 35).mirror().addBox(-0.219F, -0.8256F, -0.153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(58, 80).mirror().addBox(-0.219F, -0.8256F, 0.147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-3.4017F, -5.1382F, -7.4958F, 1.8921F, -0.2079F, 0.3367F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(0.1438F, -0.2803F, -1.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(89, 24).mirror().addBox(0.7438F, -0.2803F, -1.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(89, 27).mirror().addBox(0.7438F, -0.2803F, -1.3687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-3.4017F, -5.9382F, -8.3958F, 1.9814F, 0.1151F, -0.2851F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(88, 50).mirror().addBox(-0.2185F, -0.4191F, -0.1058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(88, 76).mirror().addBox(0.0815F, -0.4191F, -0.1058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.4017F, -5.1382F, -7.4958F, 2.3721F, -0.2079F, 0.3367F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(59, 74).mirror().addBox(0.0332F, 0.048F, -0.539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4017F, -5.1382F, -7.4958F, 2.5614F, -0.301F, 0.0778F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(63, 80).mirror().addBox(-0.325F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.79F, -6.0047F, -7.5514F, 2.3269F, -0.7102F, 0.6524F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(77, 20).mirror().addBox(-0.8413F, 1.2078F, 0.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 77).mirror().addBox(-0.8413F, 1.1078F, -0.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4307F, -3.1966F, -6.9051F, 2.4073F, -0.2846F, 0.3604F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(68, 80).mirror().addBox(0.0529F, -0.9659F, 2.9209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, 2.4086F, -0.2498F, 0.3677F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(0.0455F, -0.6038F, 2.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, 2.5412F, -0.2588F, 0.3588F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-0.0053F, -0.1057F, -0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, -1.9378F, -0.0168F, 0.0306F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(70, 37).mirror().addBox(-0.1687F, -4.6021F, -1.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 0.6283F, -0.111F, 0.0561F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(73, 80).mirror().addBox(-0.0265F, -0.2449F, -1.0244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -0.3626F, -0.2453F, 0.2281F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.012F, 0.8353F, -2.1617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -0.6838F, -0.2701F, 0.2865F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(78, 80).mirror().addBox(-0.0938F, 1.0409F, -0.3253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -1.91F, -0.2943F, 0.3588F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(59, 77).mirror().addBox(-0.1558F, 1.9669F, -0.0826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -2.05F, -0.3152F, 0.3988F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(74, 7).mirror().addBox(0.0655F, 2.2249F, 0.5141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, -2.2685F, -0.2462F, 0.3687F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(69, 7).mirror().addBox(-0.8634F, -0.2754F, -1.3632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4307F, -3.1966F, -6.9051F, -2.4017F, -0.2755F, 0.3691F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(37, 78).mirror().addBox(-0.0053F, -1.2795F, 0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 2.4255F, -0.0168F, 0.0306F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(-0.1687F, -2.564F, -1.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 0.5847F, -0.111F, 0.0561F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(-0.1687F, -2.7713F, -0.6863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 1.1519F, -0.111F, 0.0561F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(-0.1394F, -5.3997F, -1.662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 46).mirror().addBox(-0.1394F, -5.2997F, -1.662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 1.0601F, -0.0899F, 0.0976F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-0.1687F, -4.9244F, -1.0773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.2307F, 0.4034F, 0.6949F, 0.9774F, -0.111F, 0.0561F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(0.3874F, -0.6979F, 1.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.8307F, -2.5966F, -2.7051F, 2.5751F, -0.1481F, 0.1772F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-0.9405F, -0.2373F, -1.7386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(89, 21).mirror().addBox(-0.5405F, -0.2373F, -1.7386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.4017F, -5.9382F, -8.3958F, 1.8328F, 0.372F, -0.808F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(69, 7).addBox(-0.1366F, -0.2754F, -1.3632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6F, -3.1966F, -6.9051F, -2.4017F, 0.2755F, -0.3691F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(74, 7).addBox(-1.0655F, 2.2249F, 0.5141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -2.2685F, 0.2462F, -0.3687F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(59, 77).addBox(-0.8442F, 1.9669F, -0.0826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -2.05F, 0.3152F, -0.3988F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(78, 80).addBox(-0.9062F, 1.0409F, -0.3253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -1.91F, 0.2943F, -0.3588F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(60, 21).addBox(-0.988F, 0.8353F, -2.1617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -0.6838F, 0.2701F, -0.2865F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(73, 80).addBox(-0.9735F, -0.2449F, -1.0244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -0.3626F, 0.2453F, -0.2281F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(42, 78).addBox(-0.8313F, -2.7713F, -0.6863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 1.1519F, 0.111F, -0.0561F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(78, 40).addBox(-0.8313F, -2.564F, -1.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 0.5847F, 0.111F, -0.0561F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(43, 70).addBox(-0.8313F, -4.9244F, -1.0773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 0.9774F, 0.111F, -0.0561F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(70, 37).addBox(-0.8313F, -4.6021F, -1.8165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 0.6283F, 0.111F, -0.0561F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(32, 78).addBox(-0.9947F, -1.141F, 0.8102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(69, 77).addBox(-0.9947F, -1.2498F, 0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 2.4691F, 0.0168F, -0.0306F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(22, 78).addBox(-0.9947F, -0.1057F, -0.1278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, -1.9378F, 0.0168F, -0.0306F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(86, 0).addBox(-1.3874F, -0.6979F, 1.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, 2.5751F, 0.1481F, -0.1772F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(84, 25).addBox(-1.0455F, -0.6038F, 2.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, 2.5412F, 0.2588F, -0.3588F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(68, 80).addBox(-1.0529F, -0.9659F, 2.9209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, 2.4086F, 0.2498F, -0.3677F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(27, 77).addBox(-0.1587F, 1.1078F, -0.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 20).addBox(-0.1587F, 1.2078F, 0.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -3.1966F, -6.9051F, 2.4073F, 0.2846F, -0.3604F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(63, 80).addBox(-0.675F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2406F, -6.0047F, -7.5514F, 2.3269F, 0.7102F, -0.6524F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(59, 74).addBox(-1.0332F, 0.048F, -0.539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6289F, -5.1382F, -7.4958F, 2.5614F, 0.301F, -0.0778F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(88, 76).addBox(-1.0815F, -0.4191F, -0.1058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 50).addBox(-0.7815F, -0.4191F, -0.1058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6289F, -5.1382F, -7.4958F, 2.3721F, 0.2079F, -0.3367F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(89, 27).addBox(-1.7438F, -0.2803F, -1.3687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(89, 24).addBox(-1.7438F, -0.2803F, -1.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 89).addBox(-1.1438F, -0.2803F, -1.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.6289F, -5.9382F, -8.3958F, 1.9814F, -0.1151F, 0.2851F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(89, 21).addBox(-0.4595F, -0.2373F, -1.7386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 3).addBox(-0.0595F, -0.2373F, -1.7386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.6289F, -5.9382F, -8.3958F, 1.8328F, -0.372F, 0.808F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(58, 80).addBox(-0.781F, -0.8256F, 0.147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(80, 35).addBox(-0.781F, -0.8256F, -0.153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.6289F, -5.1382F, -7.4958F, 1.8921F, 0.2079F, -0.3367F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(80, 86).addBox(-0.119F, -1.9176F, -0.0865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -3.1966F, -6.9051F, 0.5278F, 0.2684F, -0.3788F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(10, 78).addBox(-1.0669F, 2.077F, -3.7259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -0.9968F, 0.2391F, -0.3783F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 76).addBox(-0.119F, -0.9902F, -0.9803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6F, -3.1966F, -6.9051F, -0.9994F, 0.2684F, -0.3788F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(65, 83).addBox(-1.0338F, 1.871F, 1.9725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -2.5214F, 0.2533F, -0.3678F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(74, 57).addBox(-0.9897F, 0.9767F, 1.8921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, -2.4667F, 0.2632F, -0.2962F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(78, 46).addBox(-0.8606F, -5.2997F, -1.662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(78, 43).addBox(-0.8606F, -5.3997F, -1.662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 1.0601F, 0.0899F, -0.0976F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(85, 81).addBox(-0.9814F, -2.801F, 0.2291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8F, -2.5966F, -2.7051F, 2.3258F, 0.2872F, -0.3225F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(78, 54).addBox(-0.8283F, -4.4487F, -1.2692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 1.1595F, 0.104F, -0.0656F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(5, 78).addBox(-0.8283F, -0.1955F, -3.5758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, -0.2804F, 0.104F, -0.0656F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(77, 17).addBox(-0.8283F, 1.6566F, -0.2001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, -1.8512F, 0.104F, -0.0656F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(37, 78).addBox(-0.9947F, -1.2795F, 0.0898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 2.4255F, 0.0168F, -0.0306F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(74, 77).addBox(-0.9947F, -0.9646F, 0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2F, 0.4034F, 0.6949F, 2.7746F, 0.0168F, -0.0306F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.4531F, 0.0037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, -0.1226F, 0.0866F, -0.0107F));

		PartDefinition cube_r432 = tail.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(78, 89).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 70).addBox(0.0F, -0.9F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 3.0037F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r433 = tail.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(63, 89).addBox(0.0F, -1.4044F, -0.9708F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 1.0037F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r434 = tail.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-2.5015F, 0.0F, -0.9651F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, -0.0239F, 0.0657F, -0.3521F));

		PartDefinition cube_r435 = tail.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(0, 23).addBox(-0.4985F, 0.0F, -0.9651F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, -0.0239F, -0.0657F, 0.3521F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(36, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4531F, 5.0037F, -0.1672F, 0.1291F, -0.0217F));

		PartDefinition cube_r436 = tail7.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(43, 67).addBox(0.0F, -0.5831F, 0.9912F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r437 = tail7.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(31, 62).addBox(0.0F, -0.6804F, 0.9608F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r438 = tail7.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(49, 11).mirror().addBox(-1.9F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5507F, 0.5F, 1.0326F, -0.033F, 0.0903F, -0.3528F));

		PartDefinition cube_r439 = tail7.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(49, 11).addBox(-1.1F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5507F, 0.5F, 1.0326F, -0.033F, -0.0903F, 0.3528F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0143F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.9209F, -0.0846F, -0.2473F, 0.1521F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(36, 19).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8143F, 6.0362F, 0.1828F, -0.2705F, -0.2606F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 14).addBox(-0.4968F, -0.1985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.591F, 4.8057F, 0.1059F, -0.3789F, -0.204F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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