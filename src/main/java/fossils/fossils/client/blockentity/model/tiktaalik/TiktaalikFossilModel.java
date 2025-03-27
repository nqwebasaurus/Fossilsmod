package fossils.fossils.client.blockentity.model.tiktaalik;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TiktaalikFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart body4;
	private final ModelPart analfin;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart upperjaw;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;

	public TiktaalikFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.hindlegL = this.body3.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.hindlegL3 = this.body3.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.body4 = this.body3.getChild("body4");
		this.analfin = this.body4.getChild("analfin");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.head = this.body.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.bone2 = this.lowerjaw.getChild("bone2");
		this.bone4 = this.lowerjaw.getChild("bone4");
		this.upperjaw = this.head.getChild("upperjaw");
		this.bone = this.upperjaw.getChild("bone");
		this.bone3 = this.upperjaw.getChild("bone3");
		this.forelegL = this.body.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.body.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -3.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -5.4F, 1.8F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 26).mirror().addBox(-3.9844F, -0.8704F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6929F, -0.368F, -5.5268F, -0.4029F, 0.5331F, -0.871F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-2.1662F, -0.1077F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6929F, -0.368F, -5.5268F, -0.1791F, 0.6349F, -0.4695F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 12).mirror().addBox(-4.2284F, -1.0737F, -0.5314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2929F, -0.468F, -7.5268F, -0.445F, 0.4958F, -0.8917F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 50).mirror().addBox(-2.465F, -0.2153F, -0.5314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2929F, -0.468F, -7.5268F, -0.2386F, 0.6145F, -0.5043F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 1).mirror().addBox(-1.4476F, -0.2707F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2946F, 0.38F, -8.0347F, -0.4393F, 0.5638F, -0.8027F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 11).mirror().addBox(-0.5169F, -0.0697F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2946F, 0.38F, -8.0347F, -0.2F, 0.6753F, -0.3949F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(-1.7F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8011F, -0.2318F, -10.7615F, -0.2222F, 0.7154F, -0.4092F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 21).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7641F, 0.1131F, -12.7462F, 0.0616F, 0.6257F, -0.2697F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 54).addBox(0.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -3.8F, -0.1791F, -0.6349F, 0.3822F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 40).addBox(2.1812F, -0.9594F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5F, -3.8F, -0.4029F, -0.5331F, 0.7837F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 26).addBox(1.9844F, -0.8704F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6929F, -0.368F, -5.5268F, -0.4029F, -0.5331F, 0.871F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 36).addBox(0.1662F, -0.1077F, -0.2882F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6929F, -0.368F, -5.5268F, -0.1791F, -0.6349F, 0.4695F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 12).addBox(2.2284F, -1.0737F, -0.5314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2929F, -0.468F, -7.5268F, -0.445F, -0.4958F, 0.8917F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 50).addBox(0.465F, -0.2153F, -0.5314F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2929F, -0.468F, -7.5268F, -0.2386F, -0.6145F, 0.5043F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 11).addBox(-2.4831F, -0.0697F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2946F, 0.38F, -8.0347F, -0.2F, -0.6753F, 0.3949F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(57, 1).addBox(0.4476F, -0.2707F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2946F, 0.38F, -8.0347F, -0.4393F, -0.5638F, 0.8027F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7641F, 0.1131F, -12.7462F, 0.0616F, -0.6257F, 0.2697F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 6).addBox(-0.3F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8011F, -0.2318F, -10.7615F, -0.2222F, -0.7154F, 0.4092F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.3F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9715F, 3.1459F, -10.902F, -0.0594F, -0.0237F, -1.3549F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(30, 16).mirror().addBox(0.0F, 0.8949F, 0.587F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.9F, -10.5F, -0.4156F, 0.229F, 0.4751F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(42, 46).mirror().addBox(-1.2F, -1.25F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5421F, 2.234F, -12.1221F, -0.0595F, -0.0673F, -1.3523F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(42, 46).addBox(0.2F, -1.25F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5421F, 2.234F, -12.1221F, -0.0595F, 0.0673F, 1.3523F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 50).addBox(-0.7F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9715F, 3.1459F, -10.902F, -0.0594F, 0.0237F, 1.3549F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(30, 16).addBox(-1.0F, 0.8949F, 0.587F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.9F, -10.5F, -0.4156F, -0.229F, -0.4751F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 21).addBox(-0.5F, -0.7793F, -0.1037F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -4.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.764F, 0.0986F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, -6.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 1.3F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 28).addBox(-0.5F, 1.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 30).addBox(-0.5F, 1.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6F, -13.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(46, 54).mirror().addBox(-2.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.5F, -3.8F, -0.1791F, 0.6349F, -0.3822F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 40).mirror().addBox(-4.1812F, -0.9594F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.5F, -3.8F, -0.4029F, 0.5331F, -0.7837F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, 1.1F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.6F, -13.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(51, 2).mirror().addBox(-2.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3F, 8.5F, -0.1791F, 0.6349F, -0.3822F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(52, 23).mirror().addBox(-2.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3F, 6.5F, -0.1791F, 0.6349F, -0.3822F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-2.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2F, 4.5F, -0.1791F, 0.6349F, -0.3822F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(53, 42).mirror().addBox(-2.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2F, 2.5F, -0.1791F, 0.6349F, -0.3822F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(22, 47).mirror().addBox(-3.1812F, -0.9594F, 0.0394F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1F, 0.5F, -0.4029F, 0.5331F, -0.7837F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 14).mirror().addBox(-2.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1F, 0.5F, -0.1791F, 0.6349F, -0.3822F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 2).addBox(0.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3F, 8.5F, -0.1791F, -0.6349F, 0.3822F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(52, 23).addBox(0.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3F, 6.5F, -0.1791F, -0.6349F, 0.3822F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 53).addBox(0.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2F, 4.5F, -0.1791F, -0.6349F, 0.3822F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(53, 42).addBox(0.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2F, 2.5F, -0.1791F, -0.6349F, 0.3822F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(22, 47).addBox(2.1812F, -0.9594F, 0.0394F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1F, 0.5F, -0.4029F, -0.5331F, 0.7837F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 14).addBox(0.3815F, -0.124F, 0.0394F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1F, 0.5F, -0.1791F, -0.6349F, 0.3822F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, 0.0293F, 7.9932F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 20).addBox(-0.5F, 0.0293F, 5.9932F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 20).addBox(-0.5F, 0.0293F, 3.9932F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 21).addBox(-0.5F, 0.0293F, 1.9932F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 16).addBox(-0.5F, 0.0293F, -0.0068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, 0.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(16, 17).addBox(-1.0F, 1.21F, 0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7F, -0.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 9.6F, 0.0443F, -0.1743F, -0.0096F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(35, 46).mirror().addBox(-0.5F, -2.9F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.086F, 3.3624F, 2.7739F, -0.8133F, -0.215F, -1.4297F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(9, 49).mirror().addBox(-1.2307F, -2.313F, 0.2205F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4122F, 2.9121F, 4.1169F, -0.4084F, 0.0494F, 0.615F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(35, 46).addBox(-0.5F, -2.9F, -0.7F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.086F, 3.3624F, 2.7739F, -0.8133F, 0.215F, 1.4297F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(9, 49).addBox(0.2307F, -2.313F, 0.2205F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4122F, 2.9121F, 4.1169F, -0.4084F, -0.0494F, -0.615F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(3, 56).addBox(0.0F, -1.4171F, -0.0178F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.2687F, 6.872F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(8, 7).addBox(0.0F, -1.0171F, -0.0178F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3385F, 4.8733F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, -0.8173F, -0.0108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4084F, 2.8675F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(15, 9).addBox(0.0F, 0.57F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(30, 0).addBox(-0.5F, 1.17F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.7F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(-0.509F, -0.0522F, -0.1657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1F, 7.6F, -0.1566F, 0.3632F, -0.3273F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-1.4256F, -0.2355F, -0.1657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1F, 7.6F, -0.273F, 0.2879F, -0.6874F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-0.1461F, -0.0354F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7187F, 0.3151F, 6.0235F, -0.2041F, 0.4868F, -0.3469F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3011F, 0.3149F, 3.9305F, -0.0447F, 0.7308F, -0.3355F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3011F, 0.3149F, 1.9305F, -0.0447F, 0.7308F, -0.3355F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 48).addBox(-0.491F, -0.0522F, -0.1657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1F, 7.6F, -0.1566F, -0.3632F, 0.3273F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(56, 46).addBox(0.4256F, -0.2355F, -0.1657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1F, 7.6F, -0.273F, -0.2879F, 0.6874F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(54, 34).addBox(-1.8539F, -0.0354F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7187F, 0.3151F, 6.0235F, -0.2041F, -0.4868F, 0.3469F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(51, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3011F, 0.3149F, 3.9305F, -0.0447F, -0.7308F, 0.3355F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(54, 44).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3011F, 0.3149F, 1.9305F, -0.0447F, -0.7308F, 0.3355F));

		PartDefinition hindlegL = body3.addOrReplaceChild("hindlegL", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.9F, 3.85F, 5.75F, 0.8814F, -0.2483F, -1.0523F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(28, 30).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 38).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, 0.6981F, 0.0F, -0.1745F));

		PartDefinition cube_r63 = hindlegL2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition hindlegL3 = body3.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(46, 37).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 3.85F, 5.75F, 0.6431F, 0.2982F, 0.978F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(28, 30).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 38).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, 0.5236F, 0.0F, 0.1745F));

		PartDefinition cube_r64 = hindlegL4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 8.1F, -0.043F, -0.0434F, 0.0095F));

		PartDefinition cube_r65 = body4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(41, 17).addBox(0.0F, -1.6216F, -0.0092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4428F, 8.8206F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -1.7216F, -0.0092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4428F, 6.8206F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 7).addBox(0.0F, -1.5216F, -0.0092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4428F, 4.8206F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(55, 25).addBox(0.0F, -1.5216F, -0.0092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4428F, 2.8206F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(43, 55).addBox(0.0F, -1.3216F, -0.0092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4428F, 0.8206F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6243F, 0.7344F, 9.8345F, -0.0373F, 0.4692F, -0.3225F));

		PartDefinition cube_r72 = body4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7243F, 0.7344F, 7.8345F, -0.0373F, 0.4692F, -0.3225F));

		PartDefinition cube_r73 = body4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8243F, 0.7344F, 5.8345F, -0.0373F, 0.4692F, -0.3225F));

		PartDefinition cube_r74 = body4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(56, 38).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9243F, 0.6646F, 3.8357F, -0.0373F, 0.4692F, -0.3225F));

		PartDefinition cube_r75 = body4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(56, 40).mirror().addBox(-1.4298F, -0.23F, -0.3656F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5F, 1.7F, -0.3022F, 0.3215F, -0.6961F));

		PartDefinition cube_r76 = body4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(46, 56).mirror().addBox(-0.5111F, -0.0455F, -0.3656F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5F, 1.7F, -0.1719F, 0.4045F, -0.333F));

		PartDefinition cube_r77 = body4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(56, 36).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6243F, 0.7344F, 9.8345F, -0.0373F, -0.4692F, 0.3225F));

		PartDefinition cube_r78 = body4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(56, 36).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7243F, 0.7344F, 7.8345F, -0.0373F, -0.4692F, 0.3225F));

		PartDefinition cube_r79 = body4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(56, 36).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8243F, 0.7344F, 5.8345F, -0.0373F, -0.4692F, 0.3225F));

		PartDefinition cube_r80 = body4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 38).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9243F, 0.6646F, 3.8357F, -0.0373F, -0.4692F, 0.3225F));

		PartDefinition cube_r81 = body4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 62).addBox(0.0F, 0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 61).addBox(-0.001F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3F, 4.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.7F, 6.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.9F, 8.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(46, 56).addBox(-0.4889F, -0.0455F, -0.3656F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.5F, 1.7F, -0.1719F, -0.4045F, 0.333F));

		PartDefinition cube_r86 = body4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(56, 40).addBox(0.4298F, -0.23F, -0.3656F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.5F, 1.7F, -0.3022F, -0.3215F, 0.6961F));

		PartDefinition analfin = body4.addOrReplaceChild("analfin", CubeListBuilder.create().texOffs(11, 28).addBox(0.0F, 0.1428F, -1.266F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3F, 10.05F, 0.8727F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, 10.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r87 = body5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(3, 61).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -0.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.9F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 28).addBox(0.0F, -0.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.9F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 54).addBox(0.0F, -0.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.0F, 3.9F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 53).addBox(0.0F, -0.2076F, -0.0383F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1F, 7.9F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(32, 47).addBox(0.0F, -0.0158F, -0.0951F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.9F, 9.9F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(10, 55).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1F, 3.9F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body5.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(19, 51).addBox(0.0F, -4.9842F, -0.0951F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.9F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(53, 36).addBox(0.0F, -3.7924F, -0.0383F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, 7.9F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(37, 53).addBox(0.0F, -3.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1F, 5.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(13, 55).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1F, 1.9F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -2.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(16, 3).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(30, 16).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 10.6F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r100 = body6.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(7, 28).addBox(0.0F, -0.1F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.4F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body6.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(22, 51).addBox(0.0F, -0.4625F, 0.0349F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 3.3F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body6.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(23, 3).addBox(0.0F, -0.6632F, -0.0265F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 5.4F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body6.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 0).addBox(-0.001F, 0.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5257F, 7.1182F, 2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body6.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(6, 0).addBox(-0.001F, -1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6257F, 7.1182F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body6.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(40, 55).addBox(0.0F, -2.6182F, -0.5257F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.3F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body6.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(34, 53).addBox(0.0F, -3.3368F, -0.0265F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 5.4F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body6.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 53).addBox(0.0F, -4.5375F, 0.0349F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body6.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(16, 51).addBox(0.0F, -4.9F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -13.45F, 0.0F, -0.1745F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5055F, -1.3906F, -14.0456F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(46, 28).addBox(-0.8055F, -1.1306F, -14.2206F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(46, 28).mirror().addBox(-1.1945F, -1.1306F, -14.2206F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6F, -0.1F, 0.1838F, 0.0063F, -0.0024F));

		PartDefinition bone2 = lowerjaw.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.7306F, -12.9706F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -0.7F, -0.4F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6608F, 0.64F, 4.7019F, -0.0873F, 0.3054F, 0.0F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(5, 53).addBox(-0.3F, -0.5F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4991F, -0.0304F, -0.5604F, -0.1102F, 0.7137F, -0.046F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(18, 5).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6919F, 0.2296F, 2.18F, -0.0907F, 0.4097F, -0.0099F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(46, 23).addBox(2.6105F, -0.4518F, -1.8651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.0F, 1.65F, 12.95F, 0.192F, 0.3054F, 0.0F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 9).addBox(2.4F, -1.01F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 46).addBox(2.4F, -1.01F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.65F, 12.25F, -0.0873F, 0.3054F, 0.0F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(16, 38).addBox(-0.9149F, -2.0539F, -0.2261F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 2.35F, 3.95F, -0.2072F, 0.2877F, 0.0167F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(24, 40).addBox(-0.9149F, -2.1294F, -0.194F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9F, 2.35F, 3.95F, -0.0327F, 0.2877F, 0.0167F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(32, 40).addBox(-0.9829F, -0.6614F, -0.0381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.25F, -1.25F, -0.1367F, 0.5821F, -0.0226F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 14).addBox(-0.9212F, -0.4101F, -0.0738F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.25F, 0.45F, -0.1244F, 0.4091F, 0.0032F));

		PartDefinition bone4 = lowerjaw.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0055F, -0.7306F, -12.9706F));

		PartDefinition cube_r118 = bone4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -0.7F, -0.4F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6608F, 0.64F, 4.7019F, -0.0873F, -0.3054F, 0.0F));

		PartDefinition cube_r119 = bone4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(0.3F, -0.5F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4991F, -0.0304F, -0.5604F, -0.1102F, -0.7137F, 0.046F));

		PartDefinition cube_r120 = bone4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(18, 5).mirror().addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6919F, 0.2296F, 2.18F, -0.0907F, -0.4097F, 0.0099F));

		PartDefinition cube_r121 = bone4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-3.6105F, -0.4518F, -1.8651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.65F, 12.95F, 0.192F, -0.3054F, 0.0F));

		PartDefinition cube_r122 = bone4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(50, 9).mirror().addBox(-3.4F, -1.01F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 46).mirror().addBox(-3.4F, -1.01F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.65F, 12.25F, -0.0873F, -0.3054F, 0.0F));

		PartDefinition cube_r123 = bone4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(16, 38).mirror().addBox(-0.0851F, -2.0539F, -0.2261F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 2.35F, 3.95F, -0.2072F, -0.2877F, -0.0167F));

		PartDefinition cube_r124 = bone4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(24, 40).mirror().addBox(-0.0851F, -2.1294F, -0.194F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 2.35F, 3.95F, -0.0327F, -0.2877F, -0.0167F));

		PartDefinition cube_r125 = bone4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(32, 40).mirror().addBox(-0.0171F, -0.6614F, -0.0381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.25F, -1.25F, -0.1367F, -0.5821F, 0.0226F));

		PartDefinition cube_r126 = bone4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.0788F, -0.4101F, -0.0738F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.25F, 0.45F, -0.1244F, -0.4091F, -0.0032F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, -0.15F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r127 = upperjaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 40).addBox(-2.0F, -1.675F, 2.975F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.787F, -14.0289F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r128 = upperjaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(41, 17).addBox(-1.1F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(41, 17).addBox(-0.9F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6654F, -12.1903F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r129 = upperjaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-1.3F, -0.0048F, 2.1866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.213F, -2.8289F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r130 = upperjaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-1.3187F, -0.0048F, 1.1023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.213F, -2.8289F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r131 = upperjaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(30, 0).addBox(0.3187F, -0.0048F, 1.1023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -1.213F, -2.8289F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r132 = upperjaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(49, 50).addBox(-0.4629F, 0.3603F, -0.0095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(2.5F, -1.213F, -4.8289F, -0.0518F, 0.201F, 0.4095F));

		PartDefinition cube_r133 = upperjaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(41, 33).addBox(-2.0F, -0.0048F, -0.8134F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(28, 0).addBox(0.3F, -0.0048F, 2.1866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(19, 0).addBox(-1.5F, -0.0048F, 1.1866F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -1.213F, -2.8289F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r134 = upperjaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(15, 16).mirror().addBox(-2.0F, 0.055F, -3.0361F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(55, 4).mirror().addBox(-1.0F, 0.055F, -1.0361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.813F, -5.7289F, 0.1629F, 0.0842F, -0.4731F));

		PartDefinition cube_r135 = upperjaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(42, 6).mirror().addBox(-2.0F, 0.055F, -0.0361F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(0, 45).mirror().addBox(-2.0F, 0.055F, -0.0361F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.813F, -5.7289F, -0.1629F, -0.0842F, -0.4731F));

		PartDefinition cube_r136 = upperjaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(55, 4).addBox(0.0F, 0.055F, -1.0361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(15, 16).addBox(0.0F, 0.055F, -3.0361F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0F, -1.813F, -5.7289F, 0.1629F, -0.0842F, 0.4731F));

		PartDefinition cube_r137 = upperjaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 0.055F, -3.0361F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -1.813F, -5.7289F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r138 = upperjaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(42, 6).addBox(0.0F, 0.055F, -0.0361F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
				.texOffs(0, 45).addBox(0.0F, 0.055F, -0.0361F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.0F, -1.813F, -5.7289F, -0.1629F, 0.0842F, 0.4731F));

		PartDefinition cube_r139 = upperjaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(15, 21).addBox(-1.0F, -0.1048F, -3.0151F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -1.113F, -2.8289F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r140 = upperjaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(11, 30).addBox(-2.5F, -0.1048F, -6.0151F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -1.113F, -2.8289F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bone = upperjaw.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(57, 11).addBox(0.2F, 0.94F, 0.025F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.663F, -13.5289F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r141 = bone.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 28).addBox(3.0F, -0.51F, -12.0F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.65F, 12.25F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r142 = bone.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(53, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.647F, 0.3943F, 6.8356F, 0.111F, 0.0224F, 0.35F));

		PartDefinition cube_r143 = bone.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(50, 17).addBox(-3.3747F, -1.01F, 0.4159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 0).addBox(-2.3747F, -1.01F, -1.5841F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 1.65F, 6.15F, 0.1042F, 0.2783F, 0.3637F));

		PartDefinition cube_r144 = bone.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 11).addBox(-1.9351F, -1.01F, -0.0035F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 1.65F, 4.65F, 0.0F, 0.2967F, 0.0F));

		PartDefinition cube_r145 = bone.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 7).addBox(-1.6112F, -0.1103F, 0.1169F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 0.65F, 1.95F, 0.0548F, 0.4123F, 0.11F));

		PartDefinition cube_r146 = bone.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(37, 40).addBox(-2.0135F, -1.01F, 0.0269F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 1.65F, 0.95F, 0.0F, 0.4276F, 0.0F));

		PartDefinition cube_r147 = bone.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(30, 5).addBox(-1.8953F, -1.01F, 0.0083F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.35F, -0.55F, -0.1396F, 0.6545F, 0.0F));

		PartDefinition cube_r148 = bone.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(29, 33).addBox(-2.9992F, -0.01F, -0.0081F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1F, 0.65F, 8.45F, 0.0427F, 0.2846F, 0.3827F));

		PartDefinition cube_r149 = bone.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(36, 26).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4195F, 1.34F, 11.2774F, -0.0732F, 0.3047F, -0.022F));

		PartDefinition bone3 = upperjaw.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(57, 11).mirror().addBox(-1.2F, 0.94F, 0.025F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.663F, -13.5289F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r150 = bone3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-3.0F, -0.51F, -12.0F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.65F, 12.25F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r151 = bone3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(53, 54).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.647F, 0.3943F, 6.8356F, 0.111F, -0.0224F, -0.35F));

		PartDefinition cube_r152 = bone3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(50, 17).mirror().addBox(2.3747F, -1.01F, 0.4159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 0).mirror().addBox(0.3747F, -1.01F, -1.5841F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 1.65F, 6.15F, 0.1042F, -0.2783F, -0.3637F));

		PartDefinition cube_r153 = bone3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(41, 11).mirror().addBox(-0.0649F, -1.01F, -0.0035F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 1.65F, 4.65F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r154 = bone3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-0.3888F, -0.1103F, 0.1169F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.65F, 1.95F, 0.0548F, -0.4123F, -0.11F));

		PartDefinition cube_r155 = bone3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(37, 40).mirror().addBox(0.0135F, -1.01F, 0.0269F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.65F, 0.95F, 0.0F, -0.4276F, 0.0F));

		PartDefinition cube_r156 = bone3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-0.1047F, -1.01F, 0.0083F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.35F, -0.55F, -0.1396F, -0.6545F, 0.0F));

		PartDefinition cube_r157 = bone3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(-0.0008F, -0.01F, -0.0081F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1F, 0.65F, 8.45F, 0.0427F, -0.2846F, -0.3827F));

		PartDefinition cube_r158 = bone3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4195F, 1.34F, 11.2774F, -0.0732F, -0.3047F, 0.022F));

		PartDefinition forelegL = body.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(49, 44).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.25F, 2.3F, -9.8F, 1.1662F, 0.0901F, -1.0323F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create().texOffs(25, 47).addBox(-0.5765F, -0.2638F, -1.149F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0312F, 3.3369F, 0.2771F, -0.6202F, 0.0464F, -0.0763F));

		PartDefinition cube_r159 = forelegL2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(12, 42).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0755F, 1.5448F, -0.022F, 3.1329F, 0.0F, -3.1416F));

		PartDefinition cube_r160 = forelegL2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0765F, 4.6769F, 0.3921F, 2.9234F, 0.0F, 3.1416F));

		PartDefinition cube_r161 = forelegL2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(7, 14).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0765F, 2.7362F, -0.249F, 0.2182F, 0.0F, 0.0F));

		PartDefinition forelegL3 = body.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.25F, 2.3F, -9.8F, 0.9741F, 0.0937F, 1.0203F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-0.4235F, -0.2638F, -1.149F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0312F, 3.3369F, 0.2771F, -0.4749F, -0.3359F, 0.2245F));

		PartDefinition cube_r162 = forelegL4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(12, 42).mirror().addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0755F, 1.5448F, -0.022F, 3.1329F, 0.0F, 3.1416F));

		PartDefinition cube_r163 = forelegL4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(0.0F, -2.0F, -1.5F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 4.6769F, 0.3921F, 2.9234F, 0.0F, -3.1416F));

		PartDefinition cube_r164 = forelegL4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(7, 14).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 2.7362F, -0.249F, 0.218F, 0.0094F, -0.0426F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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