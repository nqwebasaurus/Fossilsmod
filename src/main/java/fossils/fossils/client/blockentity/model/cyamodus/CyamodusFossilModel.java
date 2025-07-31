package fossils.fossils.client.blockentity.model.cyamodus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CyamodusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;
	private final ModelPart leftShell;
	private final ModelPart rightShell;
	private final ModelPart hips;
	private final ModelPart backleftleg;
	private final ModelPart frontleftleg3;
	private final ModelPart backrightleg;
	private final ModelPart frontrightleg3;
	private final ModelPart leftShell2;
	private final ModelPart rightShell2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;

	public CyamodusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.leftShell = this.body.getChild("leftShell");
		this.rightShell = this.body.getChild("rightShell");
		this.hips = this.body.getChild("hips");
		this.backleftleg = this.hips.getChild("backleftleg");
		this.frontleftleg3 = this.backleftleg.getChild("frontleftleg3");
		this.backrightleg = this.hips.getChild("backrightleg");
		this.frontrightleg3 = this.backrightleg.getChild("frontrightleg3");
		this.leftShell2 = this.hips.getChild("leftShell2");
		this.rightShell2 = this.hips.getChild("rightShell2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.frontleftleg = this.body.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontrightleg = this.body.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -9.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(68, 70).addBox(-1.0F, -1.5F, 4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(33, 28).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -2.4F, -0.0859F, 0.0151F, 0.1739F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-0.5F, 0.125F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2324F, 1.7F, 3.7604F, 0.2857F, 0.8314F, -0.2337F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-0.3F, 0.125F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2899F, 2.3F, 1.3851F, 0.095F, 0.4725F, -0.3434F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(-1.0F, -0.1F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8277F, 2.9F, -0.8944F, 0.1862F, 0.3418F, -0.5005F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 67).mirror().addBox(-0.8F, 0.1F, 0.2F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.9389F, 2.7F, -2.8874F, 0.0132F, -0.0214F, -0.6084F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(-0.6F, -0.2F, -0.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4595F, 2.2F, -4.7337F, -0.1718F, -0.3464F, -0.5511F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-0.5F, 0.125F, -0.15F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.221F, 0.2F, -8.4184F, 0.2059F, -0.9027F, -0.8204F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(71, 43).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0776F, 0.5F, -6.8426F, -0.2201F, -0.9324F, -0.5924F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.1933F, 0.0787F, -1.5054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(85, 79).mirror().addBox(0.0067F, 0.0787F, -1.5054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -0.4476F, 1.0471F, -0.394F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-0.9637F, 0.0787F, -1.4906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -2.7728F, 0.9269F, -2.8418F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-1.6637F, 0.0787F, -1.4906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.3507F, -2.7728F, 0.9269F, -2.8418F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(-1.5161F, 0.0787F, 0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -0.5251F, 1.1243F, -0.4815F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(-0.741F, 0.0787F, 0.2299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -0.2506F, 0.51F, -0.1243F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.637F, 0.0787F, 0.029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -0.2214F, -0.1704F, 0.0381F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-1.746F, 0.0787F, -0.2118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(89, 88).mirror().addBox(-1.746F, 0.0787F, 0.1883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -0.2355F, 0.3829F, -0.0894F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-2.0933F, 0.0787F, -0.2054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.3507F, -0.4476F, 1.0471F, -0.394F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(-0.571F, -1.4326F, -1.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -1.7175F, 0.6762F, -1.3297F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(75, 85).mirror().addBox(-0.0175F, 0.0787F, -1.7989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -0.2449F, 0.4677F, -0.1122F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 71).mirror().addBox(0.0409F, 0.0787F, -2.0493F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0409F, 1.8213F, -7.0507F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 2).mirror().addBox(-5.3799F, -2.0509F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 2.5F, -0.1686F, 0.1526F, -0.6849F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-3.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 2.5F, -0.0973F, 0.2053F, -0.2893F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 2.5F, -0.0301F, 0.2249F, 0.0228F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-6.3799F, -2.0509F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 0.5F, -0.0773F, 0.0707F, -0.6747F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(-3.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 0.5F, -0.0444F, 0.0949F, -0.2814F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(78, 53).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, 0.5F, -0.0137F, 0.1038F, 0.0255F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(63, 22).mirror().addBox(-7.3799F, -2.0509F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.5F, -0.0753F, 0.0726F, -0.6746F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-3.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.5F, -0.0418F, 0.0958F, -0.2811F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(78, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -1.5F, -0.011F, 0.104F, 0.0257F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 17).mirror().addBox(-7.4012F, -2.0344F, -0.4746F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.5F, -0.029F, 0.0975F, -0.6711F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-3.9208F, -0.578F, -0.4746F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.5F, 0.0107F, 0.1012F, -0.2764F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(-2.0057F, 0.0263F, -0.4746F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -3.5F, 0.0407F, 0.0933F, 0.0304F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-6.4243F, -2.0371F, -0.2732F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -5.7F, -0.0499F, 0.1256F, -0.6385F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(-3.9432F, -0.5716F, -0.2732F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -5.7F, 0.0023F, 0.1351F, -0.2425F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-2.0252F, 0.0392F, -0.2732F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -5.7F, 0.043F, 0.1281F, 0.0655F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 38).mirror().addBox(-4.9276F, -0.5706F, -0.47F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -7.5F, -0.0263F, 0.1803F, -0.1898F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-2.01F, 0.0355F, -0.47F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, -7.5F, 0.0297F, 0.1797F, 0.1207F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 2.5F, -0.0301F, -0.2249F, -0.0228F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(79, 0).addBox(1.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 2.5F, -0.0973F, -0.2053F, 0.2893F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(79, 2).addBox(3.3798F, -2.0509F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 2.5F, -0.1686F, -0.1526F, 0.6849F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 53).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 0.5F, -0.0137F, -0.1038F, -0.0255F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(57, 78).addBox(1.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 0.5F, -0.0444F, -0.0949F, 0.2814F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 28).addBox(3.3798F, -2.0509F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, 0.5F, -0.0773F, -0.0707F, 0.6747F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(78, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.5F, -0.011F, -0.104F, -0.0257F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 51).addBox(1.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.5F, -0.0418F, -0.0958F, 0.2811F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 22).addBox(3.3798F, -2.0509F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -1.5F, -0.0753F, -0.0726F, 0.6746F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(78, 45).addBox(0.0057F, 0.0263F, -0.4746F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.5F, 0.0407F, -0.0933F, -0.0304F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 47).addBox(1.9208F, -0.578F, -0.4746F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.5F, 0.0107F, -0.1012F, 0.2764F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(52, 17).addBox(3.4011F, -2.0344F, -0.4746F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.5F, -0.029F, -0.0975F, 0.6711F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(25, 78).addBox(0.0252F, 0.0392F, -0.2732F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -5.7F, 0.043F, -0.1281F, -0.0655F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 43).addBox(1.9432F, -0.5716F, -0.2732F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -5.7F, 0.0023F, -0.1351F, 0.2425F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(65, 8).addBox(3.4243F, -2.0371F, -0.2732F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -5.7F, -0.0499F, -0.1256F, 0.6385F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(63, 38).addBox(1.9276F, -0.5706F, -0.47F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -7.5F, -0.0263F, -0.1803F, 0.1898F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(75, 77).addBox(0.01F, 0.0355F, -0.47F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1F, -7.5F, 0.0297F, -0.1797F, -0.1207F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(85, 85).addBox(-0.0363F, 0.0787F, -1.4906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -2.7728F, -0.9269F, 2.8418F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(80, 85).addBox(0.6637F, 0.0787F, -1.4906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.3507F, -2.7728F, -0.9269F, 2.8418F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(40, 90).addBox(0.5161F, 0.0787F, 0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -0.5251F, -1.1243F, 0.4815F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(15, 90).addBox(-0.259F, 0.0787F, 0.2299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -0.2506F, -0.51F, 0.1243F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(5, 90).addBox(-0.363F, 0.0787F, 0.029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -0.2214F, 0.1704F, -0.0381F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 90).addBox(0.746F, 0.0787F, -0.2118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(89, 88).addBox(0.746F, 0.0787F, 0.1883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -0.2355F, -0.3829F, 0.0894F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(60, 89).addBox(1.0933F, 0.0787F, -0.2054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.3507F, -0.4476F, -1.0471F, 0.394F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(86, 0).addBox(-0.8067F, 0.0787F, -1.5054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(85, 79).addBox(-1.0067F, 0.0787F, -1.5054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -0.4476F, -1.0471F, 0.394F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(46, 77).addBox(-0.429F, -1.4326F, -1.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -1.7175F, -0.6762F, 1.3297F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 85).addBox(-0.9825F, 0.0787F, -1.7989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0409F, 1.8213F, -7.0507F, -0.2449F, -0.4677F, 0.1122F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(17, 46).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -3.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(71, 49).addBox(-0.5F, 0.125F, -0.15F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.221F, 0.2F, -8.4184F, 0.2059F, 0.9027F, 0.8204F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 60).addBox(-0.5F, 0.125F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2324F, 1.7F, 3.7604F, 0.2857F, -0.8314F, 0.2337F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(9, 64).addBox(-0.7F, 0.125F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2899F, 2.3F, 1.3851F, 0.095F, -0.4725F, 0.3434F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(18, 64).addBox(0.0F, -0.1F, -0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8277F, 2.9F, -0.8944F, 0.1862F, -0.3418F, 0.5005F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(68, 67).addBox(-0.2F, 0.1F, 0.2F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9389F, 2.7F, -2.8874F, 0.0132F, 0.0214F, 0.6084F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(63, 30).addBox(-0.4F, -0.2F, -0.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4595F, 2.2F, -4.7337F, -0.1718F, 0.3464F, 0.5511F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(71, 43).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0776F, 0.5F, -6.8426F, -0.2201F, 0.9324F, 0.5924F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1536F, -8.9865F, -0.329F, -0.1744F, -0.1587F));

		PartDefinition cube_r71 = neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-2.01F, 0.0355F, -0.47F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.325F, -0.0536F, -0.5135F, 0.058F, 0.3962F, 0.1288F));

		PartDefinition cube_r72 = neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(91, 83).mirror().addBox(-2.9276F, -0.5706F, -0.47F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.325F, -0.0536F, -0.5135F, -0.0705F, 0.3943F, -0.2024F));

		PartDefinition cube_r73 = neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 27).addBox(0.01F, 0.0355F, -0.47F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, -0.0536F, -0.5135F, 0.058F, -0.3962F, -0.1288F));

		PartDefinition cube_r74 = neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(91, 83).addBox(1.9276F, -0.5706F, -0.47F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, -0.0536F, -0.5135F, -0.0705F, -0.3943F, 0.2024F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(94, 11).addBox(0.0F, -0.99F, 2.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 67).addBox(-0.5F, -0.29F, 1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.1923F, -3.6998F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1923F, -1.8498F, -0.0847F, -0.0302F, -0.1719F));

		PartDefinition cube_r76 = neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.61F, 0.5105F, -0.47F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.325F, -0.2459F, -2.6637F, -0.0705F, 0.3943F, -0.2024F));

		PartDefinition cube_r77 = neck2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 93).addBox(-0.39F, 0.5105F, -0.47F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, -0.2459F, -2.6637F, -0.0705F, -0.3943F, 0.2024F));

		PartDefinition cube_r78 = neck2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-1.01F, 0.3105F, -0.47F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.325F, -0.2459F, -0.6637F, -0.0705F, 0.3943F, -0.2024F));

		PartDefinition cube_r79 = neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 93).addBox(0.01F, 0.3105F, -0.47F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, -0.2459F, -0.6637F, -0.0705F, -0.3943F, 0.2024F));

		PartDefinition cube_r80 = neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(94, 33).addBox(0.0F, -0.69F, 0.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 40).addBox(-0.5F, -0.29F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(90, 52).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1345F, -3.3815F, -0.1288F, -0.2173F, -0.0193F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(61, 71).addBox(-1.0F, -0.325F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2025F, -2.9606F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 85).addBox(-0.5F, -0.125F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.2781F, -3.7071F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(85, 68).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.2691F, -3.6186F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 55).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -1.5F, -1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 14).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.5F, -0.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(77, 39).addBox(-1.0F, -2.1F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -0.2342F, -2.2383F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(60, 83).addBox(-1.0F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0532F, -0.6492F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(55, 83).addBox(-1.0F, -0.225F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 1.0532F, -0.6492F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 67).addBox(-1.0F, -1.025F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 0.7303F, -2.1332F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 55).addBox(-3.0F, 0.0F, -0.975F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3437F, -2.0524F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(89, 9).addBox(-0.5F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.25F, -2.475F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(34, 83).addBox(-0.5F, -0.7F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(29, 83).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.0387F, -4.5146F, 0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(85, 47).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0F, 0.484F, -4.6963F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(85, 44).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.075F, -4.275F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(86, 19).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1144F, -3.828F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(39, 83).addBox(-0.5F, -0.925F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.9907F, -3.775F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(39, 83).addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.425F, -3.775F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.4372F, 0.4497F, -3.1709F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 3).addBox(-1.807F, -0.8728F, -0.8907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6483F, 0.3821F, -0.1668F, 0.6739F, 0.8703F, 1.0034F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(89, 34).addBox(-0.807F, -0.8728F, -0.8157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2324F, 0.4958F, 0.2505F, 0.4038F, 0.7133F, 0.8453F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 40).addBox(-1.857F, -0.2478F, -0.1657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9225F, -1.8152F, 1.5581F, -0.3453F, 1.4712F, -0.057F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(86, 25).addBox(-0.1F, -0.1F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(25, 86).addBox(-0.1F, -0.1F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9372F, -1.6909F, 0.705F, 0.2435F, -0.0971F, 0.3721F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(86, 22).addBox(-0.757F, -0.1478F, -0.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0407F, -1.5961F, 1.4015F, 0.5194F, 0.9762F, 0.6359F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(7, 68).addBox(-0.857F, -0.1478F, -1.8407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6917F, -1.2838F, 0.8813F, 0.5883F, 0.8378F, 0.73F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(56, 80).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2315F, -1.3827F, 0.5347F, 0.7411F, 0.8569F, 0.8946F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(19, 81).addBox(-0.7736F, -0.5149F, -0.2032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-1.4316F, -0.8261F, 0.1095F, 0.4262F, -0.1575F, 0.3197F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(25, 89).addBox(0.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9372F, -1.6997F, 0.6959F, 0.4118F, -0.1485F, 0.3267F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(80, 64).addBox(-0.35F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 61).addBox(-0.55F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-2.1365F, 0.3607F, -1.2963F, 2.3532F, 0.744F, 2.6993F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(80, 58).addBox(-0.0288F, -0.4924F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.082F, -0.9335F, 0.3824F, 1.4349F, 0.8153F, 1.8818F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(5, 81).addBox(-0.751F, -0.4924F, -0.7164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4316F, -0.8261F, 0.1095F, 0.7653F, -0.251F, 0.2444F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(85, 50).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9372F, -1.2915F, -0.1892F, 0.7815F, -0.1812F, 0.3173F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(49, 85).addBox(0.3295F, -0.6304F, -2.1052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2215F, 0.8382F, 2.6671F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(81, 25).addBox(-0.6122F, -0.4881F, -0.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0134F, -0.087F, -0.9775F, 2.2265F, 0.3995F, 2.4578F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(81, 20).addBox(-0.2691F, -0.314F, -1.2577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.3387F, -0.1676F, -1.2916F, 2.2108F, 0.4322F, 2.3713F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 84).addBox(-0.1691F, -0.2302F, -0.7572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(65, 83).addBox(-0.2691F, -0.2302F, -0.7572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-1.3387F, -0.1676F, -1.2916F, 2.144F, 0.3273F, 2.5666F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(54, 65).addBox(-0.75F, -0.75F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.255F))
				.texOffs(65, 24).addBox(-0.85F, -0.75F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.9331F, 0.5364F, -1.193F, 2.3856F, 0.5728F, 2.8261F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6774F, -0.5161F, 3.0086F, -0.3926F, 0.1333F, 0.0584F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 79).addBox(-0.4454F, -0.9392F, -0.1582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(21, 73).addBox(-0.4454F, -0.7392F, -0.1582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.7003F, 0.6196F, 3.1745F, -0.2747F, 1.4253F, 2.9056F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(80, 67).addBox(-0.5454F, -0.0918F, -0.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.7003F, 0.6196F, 3.1745F, -1.4027F, 0.7081F, 1.9508F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(66, 80).addBox(-0.5454F, -0.0918F, -0.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7003F, 0.6196F, 3.1745F, -0.5016F, 1.4253F, 2.9056F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(21, 68).addBox(-0.5454F, 0.2286F, -1.2765F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 67).addBox(-0.5454F, -0.2714F, -0.5765F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7003F, 0.6196F, 3.1745F, 1.1377F, 1.2982F, -2.9074F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(91, 6).addBox(-0.6194F, -0.5586F, -0.9461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7351F, 0.2698F, 2.8816F, -0.9162F, 0.1333F, 0.0584F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(79, 29).addBox(-0.5F, -0.575F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1728F, -1.4975F, 3.909F, 0.1572F, -1.4055F, -0.1968F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(79, 32).addBox(-0.4326F, -0.5F, -0.1086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2079F, -1.0549F, 3.5807F, 1.1404F, -0.6528F, -0.8401F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(90, 58).addBox(-0.825F, -0.5F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 31).addBox(-0.825F, -0.5F, -1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.3112F, -1.8094F, 4.3759F, 1.8069F, -0.7844F, -1.9013F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(76, 82).addBox(-0.671F, -0.5F, 0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4834F, -1.32F, 3.8559F, 0.8153F, -0.332F, -0.3353F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(75, 79).addBox(-0.4778F, -0.5F, -0.2538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4834F, -1.32F, 3.8559F, 0.7695F, -0.1476F, -0.1436F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(30, 80).addBox(-0.1599F, -0.5F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4834F, -1.32F, 3.8559F, 0.7598F, 0.0419F, 0.0376F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(79, 35).addBox(0.2372F, -0.5F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4834F, -1.32F, 3.8559F, 0.835F, 0.3807F, 0.3873F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(90, 49).addBox(-0.4295F, -0.5F, -0.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2079F, -1.0549F, 3.5807F, 0.9474F, -0.4751F, -0.483F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(45, 91).addBox(-0.6194F, -1.2384F, -0.3214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(91, 24).addBox(-0.6194F, -1.2384F, -0.9714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7351F, 0.2698F, 2.8816F, 0.2182F, 0.1333F, 0.0584F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(86, 16).addBox(-0.5878F, -0.5F, -0.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0159F, -0.271F, 0.5903F, 1.3521F, 1.0349F, 1.5455F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(91, 21).addBox(-0.7621F, 0.0054F, 0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3629F, -0.6183F, 0.9187F, 0.3689F, 0.4349F, 0.5787F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(91, 18).addBox(-0.9646F, -0.2196F, -0.0593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7887F, -0.2497F, 0.2902F, 0.5399F, 0.6382F, 0.6663F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(10, 86).addBox(-0.3569F, -0.5F, -0.4151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0159F, -0.271F, 0.5903F, 0.7886F, 0.7916F, 0.8491F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(72, 0).addBox(-1.807F, -0.5728F, -0.8407F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6656F, 0.7133F, 0.8453F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(85, 53).addBox(-0.85F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8385F, -0.5055F, -0.9957F, 2.5244F, 0.6181F, 2.9569F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(84, 88).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(86, 6).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1527F, -0.3064F, -0.3194F, 2.2215F, 0.8382F, 2.6671F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(30, 86).addBox(0.6F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 46).addBox(-1.4F, -0.55F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3372F, -0.0789F, 0.0528F, -0.034F, -0.612F, -0.0334F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5738F, -0.4139F, -0.5006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-2.0134F, -0.087F, -0.9775F, -0.7461F, 0.0F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(35, 86).addBox(-0.45F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1372F, 0.4753F, -0.9791F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 86).addBox(-0.45F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6949F, 0.5253F, -0.5705F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(59, 86).addBox(-0.2F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 28).addBox(-0.8F, -0.55F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.4735F, 0.4003F, -0.154F, 0.1833F, 1.0472F, 0.0F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(30, 89).addBox(-0.6F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(64, 86).addBox(-0.2F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.676F, 0.2964F, 0.7683F, 2.3208F, 1.459F, 2.3748F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(84, 10).addBox(-0.425F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-2.424F, 0.6753F, -1.3887F, -0.1309F, 0.6109F, 0.0F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(20, 59).addBox(-0.0609F, -1.0145F, -2.9569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1221F, -1.0582F, 4.4275F, 0.5087F, 1.0522F, -0.0065F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(11, 59).addBox(-0.0609F, -0.7145F, -3.1569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0303F, -1.3729F, 4.5156F, 0.0724F, 1.0522F, -0.0065F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(54, 69).addBox(-1.6912F, -0.6354F, -1.4846F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8927F, 0.8186F, 1.0353F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.4372F, 0.4497F, -3.1709F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(72, 3).mirror().addBox(-0.193F, -0.8728F, -0.8907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6483F, 0.3821F, -0.1668F, 0.6739F, -0.8703F, -1.0034F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-0.193F, -0.8728F, -0.8157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.2324F, 0.4958F, 0.2505F, 0.4038F, -0.7133F, -0.8453F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(70, 40).mirror().addBox(-0.143F, -0.2478F, -0.1657F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.9225F, -1.8152F, 1.5581F, -0.3453F, -1.4712F, 0.057F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(-0.9F, -0.1F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(25, 86).mirror().addBox(-0.9F, -0.1F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9372F, -1.6909F, 0.705F, 0.2435F, 0.0971F, -0.3721F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(86, 22).mirror().addBox(-0.243F, -0.1478F, -0.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0407F, -1.5961F, 1.4015F, 0.5194F, -0.9762F, -0.6359F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.143F, -0.1478F, -1.8407F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6917F, -1.2838F, 0.8813F, 0.5883F, -0.8378F, -0.73F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(56, 80).mirror().addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2315F, -1.3827F, 0.5347F, 0.7411F, -0.8569F, -0.8946F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(19, 81).mirror().addBox(-0.2264F, -0.5149F, -0.2032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(1.4316F, -0.8261F, 0.1095F, 0.4262F, 0.1575F, -0.3197F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-1.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9372F, -1.6997F, 0.6959F, 0.4118F, 0.1485F, -0.3267F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-0.65F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(80, 61).mirror().addBox(-0.45F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(2.1365F, 0.3607F, -1.2963F, 2.3532F, -0.744F, -2.6993F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(80, 58).mirror().addBox(-0.9712F, -0.4924F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.082F, -0.9335F, 0.3824F, 1.4349F, -0.8153F, -1.8818F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.249F, -0.4924F, -0.7164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4316F, -0.8261F, 0.1095F, 0.7653F, 0.251F, -0.2444F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9372F, -1.2915F, -0.1892F, 0.7815F, 0.1812F, -0.3173F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(49, 85).mirror().addBox(-1.3295F, -0.6304F, -2.1052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2215F, -0.8382F, -2.6671F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(81, 25).mirror().addBox(-0.3878F, -0.4881F, -0.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0134F, -0.087F, -0.9775F, 2.2265F, -0.3995F, -2.4578F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(81, 20).mirror().addBox(-0.7309F, -0.314F, -1.2577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.3387F, -0.1676F, -1.2916F, 2.2108F, -0.4322F, -2.3713F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.8309F, -0.2302F, -0.7572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(65, 83).mirror().addBox(-0.7309F, -0.2302F, -0.7572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(1.3387F, -0.1676F, -1.2916F, 2.144F, -0.3273F, -2.5666F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(54, 65).mirror().addBox(-0.25F, -0.75F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.255F)).mirror(false)
				.texOffs(65, 24).mirror().addBox(-0.15F, -0.75F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.9331F, 0.5364F, -1.193F, 2.3856F, -0.5728F, -2.8261F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6774F, -0.5161F, 3.0086F, -0.3926F, -0.1333F, -0.0584F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(51, 79).mirror().addBox(-0.5546F, -0.9392F, -0.1582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(21, 73).mirror().addBox(-0.5546F, -0.7392F, -0.1582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.7003F, 0.6196F, 3.1745F, -0.2747F, -1.4253F, -2.9056F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-0.4546F, -0.0918F, -0.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.7003F, 0.6196F, 3.1745F, -1.4027F, -0.7081F, -1.9508F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-0.4546F, -0.0918F, -0.4431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7003F, 0.6196F, 3.1745F, -0.5016F, -1.4253F, -2.9056F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-0.4546F, 0.2286F, -1.2765F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(41, 67).mirror().addBox(-0.4546F, -0.2714F, -0.5765F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7003F, 0.6196F, 3.1745F, 1.1377F, -1.2982F, 2.9074F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-0.3806F, -0.5586F, -0.9461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7351F, 0.2698F, 2.8816F, -0.9162F, -0.1333F, -0.0584F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(-0.5F, -0.575F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1728F, -1.4975F, 3.909F, 0.1572F, 1.4055F, 0.1968F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-0.5674F, -0.5F, -0.1086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2079F, -1.0549F, 3.5807F, 1.1404F, 0.6528F, 0.8401F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(90, 58).mirror().addBox(-0.175F, -0.5F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(84, 31).mirror().addBox(-0.175F, -0.5F, -1.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.3112F, -1.8094F, 4.3759F, 1.8069F, 0.7844F, 1.9013F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.329F, -0.5F, 0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4834F, -1.32F, 3.8559F, 0.8153F, 0.332F, 0.3353F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(75, 79).mirror().addBox(-0.5222F, -0.5F, -0.2538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4834F, -1.32F, 3.8559F, 0.7695F, 0.1476F, 0.1436F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.8401F, -0.5F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4834F, -1.32F, 3.8559F, 0.7598F, -0.0419F, -0.0376F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-1.2372F, -0.5F, -0.7669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4834F, -1.32F, 3.8559F, 0.835F, -0.3807F, -0.3873F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-0.5705F, -0.5F, -0.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2079F, -1.0549F, 3.5807F, 0.9474F, 0.4751F, 0.483F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-0.3806F, -1.2384F, -0.3214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(91, 24).mirror().addBox(-0.3806F, -1.2384F, -0.9714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7351F, 0.2698F, 2.8816F, 0.2182F, -0.1333F, -0.0584F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(86, 16).mirror().addBox(-0.4122F, -0.5F, -0.6414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0159F, -0.271F, 0.5903F, 1.3521F, -1.0349F, -1.5455F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(91, 21).mirror().addBox(-0.2379F, 0.0054F, 0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3629F, -0.6183F, 0.9187F, 0.3689F, -0.4349F, -0.5787F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(91, 18).mirror().addBox(-0.0354F, -0.2196F, -0.0593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7887F, -0.2497F, 0.2902F, 0.5399F, -0.6382F, -0.6663F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.6431F, -0.5F, -0.4151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0159F, -0.271F, 0.5903F, 0.7886F, -0.7916F, -0.8491F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.193F, -0.5728F, -0.8407F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6656F, -0.7133F, -0.8453F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(85, 53).mirror().addBox(-0.15F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.8385F, -0.5055F, -0.9957F, 2.5244F, -0.6181F, -2.9569F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(86, 6).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.1527F, -0.3064F, -0.3194F, 2.2215F, -0.8382F, -2.6671F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(-1.6F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 46).mirror().addBox(-0.6F, -0.55F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3372F, -0.0789F, 0.0528F, -0.034F, 0.612F, 0.0334F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.4262F, -0.4139F, -0.5006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(2.0134F, -0.087F, -0.9775F, -0.7461F, 0.0F, 0.0F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.55F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1372F, 0.4753F, -0.9791F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(54, 86).mirror().addBox(-0.55F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6949F, 0.5253F, -0.5705F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(59, 86).mirror().addBox(-0.8F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 28).mirror().addBox(-0.2F, -0.55F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.4735F, 0.4003F, -0.154F, 0.1833F, -1.0472F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.4F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(64, 86).mirror().addBox(-0.8F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.676F, 0.2964F, 0.7683F, 2.3208F, -1.459F, -2.3748F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-0.575F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(2.424F, 0.6753F, -1.3887F, -0.1309F, -0.6109F, 0.0F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-0.9391F, -1.0145F, -2.9569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1221F, -1.0582F, 4.4275F, 0.5087F, -1.0522F, 0.0065F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(11, 59).mirror().addBox(-0.9391F, -0.7145F, -3.1569F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0303F, -1.3729F, 4.5156F, 0.0724F, -1.0522F, 0.0065F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(54, 69).mirror().addBox(-0.3088F, -0.6354F, -1.4846F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8927F, -0.8186F, -1.0353F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3785F, -0.2983F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r198 = lowerjaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(0.0845F, -1.8781F, -1.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.8546F, 0.485F, -0.0694F, 0.9201F, -0.3391F, -0.0178F));

		PartDefinition cube_r199 = lowerjaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(45, 88).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2216F, 0.1562F, -2.3521F, 1.6354F, -0.3098F, 0.0127F));

		PartDefinition cube_r200 = lowerjaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6266F, -0.0256F, -3.4839F, 1.6839F, -0.484F, 0.0F));

		PartDefinition cube_r201 = lowerjaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.4732F, -0.8084F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5306F, 0.1442F, -3.7242F, 1.8236F, -0.484F, 0.0F));

		PartDefinition cube_r202 = lowerjaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.4732F, -0.7084F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5306F, 0.1442F, -3.7242F, 1.4745F, -0.484F, 0.0F));

		PartDefinition cube_r203 = lowerjaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(84, 13).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6967F, 0.2049F, -3.0423F, 1.1557F, -0.2305F, -0.0691F));

		PartDefinition cube_r204 = lowerjaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.5F, -0.4577F, -0.4344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.6967F, 0.2049F, -3.0423F, 1.7229F, -0.2305F, -0.0691F));

		PartDefinition cube_r205 = lowerjaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(87, 37).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9967F, 0.1799F, -3.2673F, 1.0303F, -0.9658F, 0.1812F));

		PartDefinition cube_r206 = lowerjaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(15, 87).mirror().addBox(-0.5F, -0.4577F, -0.4344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.9967F, 0.1799F, -3.2673F, 1.5976F, -0.9658F, 0.1812F));

		PartDefinition cube_r207 = lowerjaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(69, 88).mirror().addBox(-0.472F, -0.2918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5306F, 0.1442F, -3.7242F, 1.4813F, -0.3102F, -0.0514F));

		PartDefinition cube_r208 = lowerjaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.472F, -0.2918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-0.5306F, 0.1442F, -3.7242F, 1.4548F, -0.7443F, 0.0F));

		PartDefinition cube_r209 = lowerjaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(85, 65).mirror().addBox(-1.1084F, -0.2499F, -0.5596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(74, 88).mirror().addBox(-0.5084F, -0.2499F, -0.5596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(84, 28).mirror().addBox(-0.4988F, -0.8933F, -0.552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 0.3823F, -2.2633F, 1.3019F, -0.3211F, -0.0588F));

		PartDefinition cube_r210 = lowerjaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-0.95F, -0.6F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3978F, 0.7088F, -1.4118F, 1.5107F, -1.3853F, 0.0498F));

		PartDefinition cube_r211 = lowerjaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-1.0F, -0.6F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3978F, 0.7088F, -1.4118F, 0.558F, -1.277F, 0.8919F));

		PartDefinition cube_r212 = lowerjaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(79, 88).mirror().addBox(-1.1084F, -0.3113F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(50, 89).mirror().addBox(-0.5084F, -0.2863F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(55, 89).mirror().addBox(-0.4988F, -0.8723F, -0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 0.3823F, -2.2633F, 1.52F, -0.3211F, -0.0588F));

		PartDefinition cube_r213 = lowerjaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.1552F, -1.3699F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.33F, 0.2135F, -2.5777F, 1.3909F, -0.9308F, 0.1378F));

		PartDefinition cube_r214 = lowerjaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(85, 62).mirror().addBox(-0.1552F, -1.341F, -0.8314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.33F, 0.2135F, -2.5777F, 1.1727F, -0.9308F, 0.1378F));

		PartDefinition cube_r215 = lowerjaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(-0.1552F, -0.7571F, -0.5291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.455F, 0.2635F, -2.5027F, 1.3909F, -0.9308F, 0.1378F));

		PartDefinition cube_r216 = lowerjaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-0.1552F, -0.8512F, -0.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.455F, 0.2635F, -2.5027F, 1.1727F, -0.9308F, 0.1378F));

		PartDefinition cube_r217 = lowerjaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(0.0233F, -0.9682F, -0.3549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1546F, 0.485F, -1.8694F, 1.6711F, -0.7361F, -0.0227F));

		PartDefinition cube_r218 = lowerjaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(0.0233F, -1.0278F, -0.7332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1546F, 0.485F, -1.8694F, 1.3657F, -0.7361F, -0.0227F));

		PartDefinition cube_r219 = lowerjaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(0.0845F, -1.9112F, -1.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.8546F, 0.485F, -0.0694F, 1.3564F, -0.3391F, -0.0178F));

		PartDefinition cube_r220 = lowerjaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(47, 62).mirror().addBox(0.0845F, -1.129F, -0.8826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8546F, 0.485F, -0.0694F, 1.5746F, -0.3391F, -0.0178F));

		PartDefinition cube_r221 = lowerjaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(85, 56).mirror().addBox(-0.5F, -0.4484F, -0.6897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.1739F, 0.5902F, 0.2178F, 0.3889F, 0.0971F, -0.0169F));

		PartDefinition cube_r222 = lowerjaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-0.5F, -0.6147F, -0.4234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1739F, 0.5902F, 0.2178F, -0.0038F, 0.0971F, -0.0169F));

		PartDefinition cube_r223 = lowerjaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0845F, -1.8781F, -1.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.8546F, 0.485F, -0.0694F, 0.9201F, 0.3391F, 0.0178F));

		PartDefinition cube_r224 = lowerjaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(45, 88).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2216F, 0.1562F, -2.3521F, 1.6354F, 0.3098F, -0.0127F));

		PartDefinition cube_r225 = lowerjaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(87, 74).addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6266F, -0.0256F, -3.4839F, 1.6839F, 0.484F, 0.0F));

		PartDefinition cube_r226 = lowerjaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 87).addBox(-0.5268F, -0.8084F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5306F, 0.1442F, -3.7242F, 1.8236F, 0.484F, 0.0F));

		PartDefinition cube_r227 = lowerjaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.7F, -0.775F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 87).addBox(-0.1875F, -0.775F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0562F, 0.1241F, -3.7092F, 1.4745F, 0.0F, 0.0F));

		PartDefinition cube_r228 = lowerjaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5268F, -0.7084F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5306F, 0.1442F, -3.7242F, 1.4745F, 0.484F, 0.0F));

		PartDefinition cube_r229 = lowerjaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(84, 13).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6967F, 0.2049F, -3.0423F, 1.1557F, 0.2305F, 0.0691F));

		PartDefinition cube_r230 = lowerjaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(15, 84).addBox(-0.5F, -0.4577F, -0.4344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.6967F, 0.2049F, -3.0423F, 1.7229F, 0.2305F, 0.0691F));

		PartDefinition cube_r231 = lowerjaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(87, 37).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9967F, 0.1799F, -3.2673F, 1.0303F, 0.9658F, -0.1812F));

		PartDefinition cube_r232 = lowerjaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5F, -0.4577F, -0.4344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.9967F, 0.1799F, -3.2673F, 1.5976F, 0.9658F, -0.1812F));

		PartDefinition cube_r233 = lowerjaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(69, 88).addBox(-0.528F, -0.2918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5306F, 0.1442F, -3.7242F, 1.4813F, 0.3102F, 0.0514F));

		PartDefinition cube_r234 = lowerjaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 87).addBox(-0.528F, -0.2918F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.5306F, 0.1442F, -3.7242F, 1.4548F, 0.7443F, 0.0F));

		PartDefinition cube_r235 = lowerjaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(85, 65).addBox(0.1084F, -0.2499F, -0.5596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 88).addBox(-0.4916F, -0.2499F, -0.5596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(84, 28).addBox(-0.5012F, -0.8933F, -0.552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.1244F, 0.3823F, -2.2633F, 1.3019F, 0.3211F, 0.0588F));

		PartDefinition cube_r236 = lowerjaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(14, 79).addBox(-0.05F, -0.6F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3978F, 0.7088F, -1.4118F, 1.5107F, 1.3853F, -0.0498F));

		PartDefinition cube_r237 = lowerjaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(79, 10).addBox(0.0F, -0.6F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3978F, 0.7088F, -1.4118F, 0.558F, 1.277F, -0.8919F));

		PartDefinition cube_r238 = lowerjaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(79, 88).addBox(0.1084F, -0.3113F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(50, 89).addBox(-0.4916F, -0.2863F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(55, 89).addBox(-0.5012F, -0.8723F, -0.3946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1244F, 0.3823F, -2.2633F, 1.52F, 0.3211F, 0.0588F));

		PartDefinition cube_r239 = lowerjaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(35, 89).addBox(-0.8448F, -1.3699F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.33F, 0.2135F, -2.5777F, 1.3909F, 0.9308F, -0.1378F));

		PartDefinition cube_r240 = lowerjaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(85, 62).addBox(-0.8448F, -1.341F, -0.8314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.33F, 0.2135F, -2.5777F, 1.1727F, 0.9308F, -0.1378F));

		PartDefinition cube_r241 = lowerjaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(85, 59).addBox(-0.8448F, -0.7571F, -0.5291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.455F, 0.2635F, -2.5027F, 1.3909F, 0.9308F, -0.1378F));

		PartDefinition cube_r242 = lowerjaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 82).addBox(-0.8448F, -0.8512F, -0.8312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.455F, 0.2635F, -2.5027F, 1.1727F, 0.9308F, -0.1378F));

		PartDefinition cube_r243 = lowerjaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(71, 82).addBox(-1.0233F, -0.9682F, -0.3549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.1546F, 0.485F, -1.8694F, 1.6711F, 0.7361F, 0.0227F));

		PartDefinition cube_r244 = lowerjaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(45, 81).addBox(-1.0233F, -1.0278F, -0.7332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1546F, 0.485F, -1.8694F, 1.3657F, 0.7361F, 0.0227F));

		PartDefinition cube_r245 = lowerjaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(86, 82).addBox(-1.0845F, -1.9112F, -1.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.8546F, 0.485F, -0.0694F, 1.3564F, 0.3391F, 0.0178F));

		PartDefinition cube_r246 = lowerjaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(47, 62).addBox(-1.0845F, -1.129F, -0.8826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8546F, 0.485F, -0.0694F, 1.5746F, 0.3391F, 0.0178F));

		PartDefinition cube_r247 = lowerjaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(85, 56).addBox(-0.5F, -0.4484F, -0.6897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.1739F, 0.5902F, 0.2178F, 0.3889F, -0.0971F, 0.0169F));

		PartDefinition cube_r248 = lowerjaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 76).addBox(-0.5F, -0.6147F, -0.4234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1739F, 0.5902F, 0.2178F, -0.0038F, -0.0971F, 0.0169F));

		PartDefinition leftShell = body.addOrReplaceChild("leftShell", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.6F, -3.1F, 0.0F, 0.0F, 0.0524F));

		PartDefinition cube_r249 = leftShell.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(33, 54).addBox(-2.0907F, -0.3412F, 0.0109F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.8446F, 1.5151F, 5.7919F, 3.1359F, 1.0035F, 0.1001F));

		PartDefinition cube_r250 = leftShell.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(11, 54).addBox(-2.0232F, -0.2312F, -0.007F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(5.7446F, 1.5151F, 7.4919F, 3.1375F, 0.7242F, 0.1021F));

		PartDefinition cube_r251 = leftShell.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(54, 0).addBox(-2.1026F, 0.0363F, 0.0302F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.3446F, 1.6901F, 8.7919F, 3.1385F, -0.0873F, 0.1051F));

		PartDefinition cube_r252 = leftShell.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(50, 35).addBox(-0.0681F, -0.6877F, 0.0218F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.8626F, 1.4616F, -3.7274F, 0.0F, -1.1606F, 0.096F));

		PartDefinition cube_r253 = leftShell.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(54, 5).addBox(-0.0057F, -1.0373F, 0.0452F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.5626F, 1.6366F, -5.3274F, 0.0F, -0.9076F, 0.096F));

		PartDefinition cube_r254 = leftShell.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(50, 26).addBox(-5.0107F, -0.5846F, 0.0203F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1626F, 1.4616F, 3.8726F, -0.0039F, -0.1919F, 0.0966F));

		PartDefinition cube_r255 = leftShell.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(47, 51).addBox(-4.0772F, -0.5463F, -0.0726F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.3376F, 1.4616F, 1.9726F, 0.0F, -0.0524F, 0.096F));

		PartDefinition cube_r256 = leftShell.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(47, 46).addBox(-4.0747F, -0.5727F, -0.0198F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.0626F, 1.4616F, -1.0274F, 0.0F, 0.0873F, 0.096F));

		PartDefinition cube_r257 = leftShell.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(62, 50).addBox(-0.1196F, -0.522F, -0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F))
				.texOffs(62, 45).addBox(-0.0196F, -0.522F, -0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8549F, 0.8036F, -6.133F, -0.0226F, 0.062F, 0.0829F));

		PartDefinition cube_r258 = leftShell.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(57, 55).addBox(-0.133F, -0.669F, 0.0369F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0951F, 0.8036F, -5.908F, -0.0228F, 0.1318F, 0.0813F));

		PartDefinition cube_r259 = leftShell.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 31).addBox(0.3F, 0.0F, -4.0F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r260 = leftShell.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 16).addBox(-2.9746F, -1.0385F, 0.0274F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(4.4626F, 1.6366F, -5.3274F, 0.0F, 0.0F, 0.096F));

		PartDefinition cube_r261 = leftShell.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(22, 54).addBox(0.0383F, 0.068F, -2.9325F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3013F, 0.2802F, 8.575F, 1.2228F, 1.493F, 1.2717F));

		PartDefinition cube_r262 = leftShell.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(74, 13).addBox(-0.9423F, -0.4844F, -0.4923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(74, 6).addBox(-0.1423F, -0.4844F, -0.4923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.0141F, 1.2054F, 8.0131F, -1.6251F, -1.2305F, -3.039F));

		PartDefinition cube_r263 = leftShell.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(90, 77).addBox(-0.153F, -1.2689F, -0.4885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(5.0141F, 1.2054F, 8.0131F, -1.6129F, -1.2213F, -3.0449F));

		PartDefinition cube_r264 = leftShell.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(75, 65).addBox(-1.1453F, -0.5867F, -0.4885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(5.0141F, 1.2054F, 8.0131F, -1.5853F, -0.1176F, -3.0827F));

		PartDefinition cube_r265 = leftShell.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(47, 73).addBox(-0.0973F, -0.2276F, -0.4936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.4122F, 1.3197F, 6.42F, 2.0096F, -1.5129F, -0.3692F));

		PartDefinition cube_r266 = leftShell.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(91, 3).addBox(-0.1056F, -1.0125F, -0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(6.4122F, 1.3197F, 6.42F, 2.0684F, -1.5219F, -0.4214F));

		PartDefinition cube_r267 = leftShell.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(75, 73).addBox(-0.895F, -0.5136F, -0.4914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(6.4122F, 1.3197F, 6.42F, -1.5975F, -0.5097F, -3.0529F));

		PartDefinition cube_r268 = leftShell.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(31, 74).addBox(-0.1601F, -0.1968F, -0.4979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.9862F, 1.3947F, 4.6201F, 1.5289F, -1.253F, 0.1147F));

		PartDefinition cube_r269 = leftShell.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(65, 91).addBox(-0.1681F, -0.9812F, -0.496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(6.9862F, 1.3947F, 4.6201F, 1.5295F, -1.2622F, 0.121F));

		PartDefinition cube_r270 = leftShell.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(70, 76).addBox(-0.8952F, -0.4437F, -0.496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(6.9862F, 1.3947F, 4.6201F, -1.5533F, -0.7751F, -3.0722F));

		PartDefinition cube_r271 = leftShell.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(75, 69).addBox(-0.9134F, -0.3761F, -0.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(7.2032F, 1.4197F, 2.7012F, -1.5679F, -0.9057F, -3.0612F));

		PartDefinition cube_r272 = leftShell.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(75, 91).addBox(-0.2367F, -0.9671F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.2032F, 1.4197F, 2.7012F, 1.5666F, -1.132F, 0.0864F));

		PartDefinition cube_r273 = leftShell.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 75).addBox(-0.2287F, -0.1834F, -0.5013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.2032F, 1.4197F, 2.7012F, 1.5634F, -1.1228F, 0.0826F));

		PartDefinition cube_r274 = leftShell.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(52, 75).addBox(-0.3111F, -0.1987F, -0.5032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.1354F, 1.3697F, 0.9535F, 1.5831F, -0.9922F, 0.0654F));

		PartDefinition cube_r275 = leftShell.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(85, 91).addBox(-0.3191F, -0.9817F, -0.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.1354F, 1.3697F, 0.9535F, 1.5875F, -1.0015F, 0.0681F));

		PartDefinition cube_r276 = leftShell.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(41, 76).addBox(-0.9636F, -0.3091F, -0.5015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(7.1354F, 1.3697F, 0.9535F, -1.5885F, -1.036F, -3.0442F));

		PartDefinition cube_r277 = leftShell.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(60, 74).addBox(-0.3111F, -0.1987F, -0.5032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.8854F, 1.3697F, -0.7965F, 1.5962F, -0.8615F, 0.0549F));

		PartDefinition cube_r278 = leftShell.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(70, 91).addBox(-0.3191F, -0.9817F, -0.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(6.8854F, 1.3697F, -0.7965F, 1.6013F, -0.8708F, 0.0569F));

		PartDefinition cube_r279 = leftShell.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(75, 55).addBox(-0.9636F, -0.3091F, -0.5015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(6.8854F, 1.3697F, -0.7965F, -1.6207F, -1.1661F, -3.0154F));

		PartDefinition cube_r280 = leftShell.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(36, 76).addBox(-0.9652F, -0.3112F, -0.5339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(6.3354F, 1.2623F, -2.4965F, -1.6329F, -1.2008F, -3.0041F));

		PartDefinition cube_r281 = leftShell.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(80, 91).addBox(-0.3179F, -0.9841F, -0.5339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(6.3354F, 1.2623F, -2.4965F, 1.6043F, -0.836F, 0.0547F));

		PartDefinition cube_r282 = leftShell.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(15, 75).addBox(-0.3099F, -0.2009F, -0.5356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.3354F, 1.2623F, -2.4965F, 1.5991F, -0.8267F, 0.0528F));

		PartDefinition cube_r283 = leftShell.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(10, 75).addBox(-0.2165F, -0.7176F, -0.5185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.3168F, 1.1499F, -4.1052F, 1.5771F, -0.783F, 0.0862F));

		PartDefinition cube_r284 = leftShell.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(91, 80).addBox(0.0238F, -0.9684F, -0.5185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(5.3168F, 1.1499F, -4.1052F, 1.5753F, -0.1372F, 0.09F));

		PartDefinition cube_r285 = leftShell.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(65, 76).addBox(-0.9516F, -0.4744F, -0.5185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(5.3168F, 1.1499F, -4.1052F, -1.6267F, -1.4902F, -2.9952F));

		PartDefinition cube_r286 = leftShell.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(5, 75).addBox(-0.0583F, -0.6882F, -0.4908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.7881F, 1.0162F, -5.5528F, 1.5067F, 0.0567F, 0.1389F));

		PartDefinition cube_r287 = leftShell.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(26, 74).addBox(-0.9121F, -0.5233F, -0.4908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(3.7881F, 1.0162F, -5.5528F, 1.2598F, -1.3601F, 0.4471F));

		PartDefinition cube_r288 = leftShell.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(91, 15).addBox(-0.059F, -1.0122F, -0.4908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.7881F, 1.0162F, -5.5528F, 1.5053F, -0.2132F, 0.1564F));

		PartDefinition cube_r289 = leftShell.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(46, 70).addBox(-0.0351F, 0.0768F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.9013F, 0.2802F, -6.2F, -0.0752F, -0.4657F, 0.1662F));

		PartDefinition rightShell = body.addOrReplaceChild("rightShell", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.6F, -3.1F, 0.0F, 0.0F, -0.0524F));

		PartDefinition cube_r290 = rightShell.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(0.0907F, -0.3412F, 0.0109F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-6.8446F, 1.5151F, 5.7919F, 3.1359F, -1.0035F, -0.1001F));

		PartDefinition cube_r291 = rightShell.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(11, 54).mirror().addBox(0.0232F, -0.2312F, -0.007F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-5.7446F, 1.5151F, 7.4919F, 3.1375F, -0.7242F, -0.1021F));

		PartDefinition cube_r292 = rightShell.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(0.1026F, 0.0363F, 0.0302F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.3446F, 1.6901F, 8.7919F, 3.1385F, 0.0873F, -0.1051F));

		PartDefinition cube_r293 = rightShell.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(50, 35).mirror().addBox(-2.9319F, -0.6877F, 0.0218F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.8626F, 1.4616F, -3.7274F, 0.0F, 1.1606F, -0.096F));

		PartDefinition cube_r294 = rightShell.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(54, 5).mirror().addBox(-1.9943F, -1.0373F, 0.0452F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.5626F, 1.6366F, -5.3274F, 0.0F, 0.9076F, -0.096F));

		PartDefinition cube_r295 = rightShell.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(50, 26).mirror().addBox(0.0107F, -0.5846F, 0.0203F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.1626F, 1.4616F, 3.8726F, -0.0039F, 0.1919F, -0.0966F));

		PartDefinition cube_r296 = rightShell.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(47, 51).mirror().addBox(0.0772F, -0.5463F, -0.0726F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.3376F, 1.4616F, 1.9726F, 0.0F, 0.0524F, -0.096F));

		PartDefinition cube_r297 = rightShell.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(0.0747F, -0.5727F, -0.0198F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-7.0626F, 1.4616F, -1.0274F, 0.0F, -0.0873F, -0.096F));

		PartDefinition cube_r298 = rightShell.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(62, 50).mirror().addBox(-0.8804F, -0.522F, -0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(62, 45).mirror().addBox(-0.9804F, -0.522F, -0.0068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8549F, 0.8036F, -6.133F, -0.0226F, -0.062F, -0.0829F));

		PartDefinition cube_r299 = rightShell.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(57, 55).mirror().addBox(-1.867F, -0.669F, 0.0369F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0951F, 0.8036F, -5.908F, -0.0228F, -0.1318F, -0.0813F));

		PartDefinition cube_r300 = rightShell.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-3.3F, 0.0F, -4.0F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1F, -0.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r301 = rightShell.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.0254F, -1.0385F, 0.0274F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-4.4626F, 1.6366F, -5.3274F, 0.0F, 0.0F, -0.096F));

		PartDefinition cube_r302 = rightShell.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(22, 54).mirror().addBox(-2.0383F, 0.068F, -2.9325F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3013F, 0.2802F, 8.575F, 1.2228F, -1.493F, -1.2717F));

		PartDefinition cube_r303 = rightShell.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(74, 13).mirror().addBox(-0.0577F, -0.4844F, -0.4923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(74, 6).mirror().addBox(-0.8577F, -0.4844F, -0.4923F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.0141F, 1.2054F, 8.0131F, -1.6251F, 1.2305F, 3.039F));

		PartDefinition cube_r304 = rightShell.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(90, 77).mirror().addBox(-0.847F, -1.2689F, -0.4885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-5.0141F, 1.2054F, 8.0131F, -1.6129F, 1.2213F, 3.0449F));

		PartDefinition cube_r305 = rightShell.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(0.1453F, -0.5867F, -0.4885F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-5.0141F, 1.2054F, 8.0131F, -1.5853F, 0.1176F, 3.0827F));

		PartDefinition cube_r306 = rightShell.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(47, 73).mirror().addBox(-0.9027F, -0.2276F, -0.4936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.4122F, 1.3197F, 6.42F, 2.0096F, 1.5129F, 0.3692F));

		PartDefinition cube_r307 = rightShell.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(91, 3).mirror().addBox(-0.8944F, -1.0125F, -0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-6.4122F, 1.3197F, 6.42F, 2.0684F, 1.5219F, 0.4214F));

		PartDefinition cube_r308 = rightShell.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(-0.105F, -0.5136F, -0.4914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-6.4122F, 1.3197F, 6.42F, -1.5975F, 0.5097F, 3.0529F));

		PartDefinition cube_r309 = rightShell.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(31, 74).mirror().addBox(-0.8399F, -0.1968F, -0.4979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.9862F, 1.3947F, 4.6201F, 1.5289F, 1.253F, -0.1147F));

		PartDefinition cube_r310 = rightShell.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(65, 91).mirror().addBox(-0.8319F, -0.9812F, -0.496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-6.9862F, 1.3947F, 4.6201F, 1.5295F, 1.2622F, -0.121F));

		PartDefinition cube_r311 = rightShell.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(70, 76).mirror().addBox(-0.1048F, -0.4437F, -0.496F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-6.9862F, 1.3947F, 4.6201F, -1.5533F, 0.7751F, 3.0722F));

		PartDefinition cube_r312 = rightShell.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.0866F, -0.3761F, -0.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-7.2032F, 1.4197F, 2.7012F, -1.5679F, 0.9057F, 3.0612F));

		PartDefinition cube_r313 = rightShell.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(75, 91).mirror().addBox(-0.7633F, -0.9671F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-7.2032F, 1.4197F, 2.7012F, 1.5666F, 1.132F, -0.0864F));

		PartDefinition cube_r314 = rightShell.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.7713F, -0.1834F, -0.5013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.2032F, 1.4197F, 2.7012F, 1.5634F, 1.1228F, -0.0826F));

		PartDefinition cube_r315 = rightShell.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(52, 75).mirror().addBox(-0.6889F, -0.1987F, -0.5032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.1354F, 1.3697F, 0.9535F, 1.5831F, 0.9922F, -0.0654F));

		PartDefinition cube_r316 = rightShell.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(85, 91).mirror().addBox(-0.6809F, -0.9817F, -0.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-7.1354F, 1.3697F, 0.9535F, 1.5875F, 1.0015F, -0.0681F));

		PartDefinition cube_r317 = rightShell.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-0.0364F, -0.3091F, -0.5015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-7.1354F, 1.3697F, 0.9535F, -1.5885F, 1.036F, 3.0442F));

		PartDefinition cube_r318 = rightShell.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(-0.6889F, -0.1987F, -0.5032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.8854F, 1.3697F, -0.7965F, 1.5962F, 0.8615F, -0.0549F));

		PartDefinition cube_r319 = rightShell.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(70, 91).mirror().addBox(-0.6809F, -0.9817F, -0.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-6.8854F, 1.3697F, -0.7965F, 1.6013F, 0.8708F, -0.0569F));

		PartDefinition cube_r320 = rightShell.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(75, 55).mirror().addBox(-0.0364F, -0.3091F, -0.5015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-6.8854F, 1.3697F, -0.7965F, -1.6207F, 1.1661F, 3.0154F));

		PartDefinition cube_r321 = rightShell.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-0.0348F, -0.3112F, -0.5339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-6.3354F, 1.2623F, -2.4965F, -1.6329F, 1.2008F, 3.0041F));

		PartDefinition cube_r322 = rightShell.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(80, 91).mirror().addBox(-0.6821F, -0.9841F, -0.5339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-6.3354F, 1.2623F, -2.4965F, 1.6043F, 0.836F, -0.0547F));

		PartDefinition cube_r323 = rightShell.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.6901F, -0.2009F, -0.5356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.3354F, 1.2623F, -2.4965F, 1.5991F, 0.8267F, -0.0528F));

		PartDefinition cube_r324 = rightShell.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.7835F, -0.7176F, -0.5185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.3168F, 1.1499F, -4.1052F, 1.5771F, 0.783F, -0.0862F));

		PartDefinition cube_r325 = rightShell.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(91, 80).mirror().addBox(-1.0238F, -0.9684F, -0.5185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-5.3168F, 1.1499F, -4.1052F, 1.5753F, 0.1372F, -0.09F));

		PartDefinition cube_r326 = rightShell.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-0.0484F, -0.4744F, -0.5185F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-5.3168F, 1.1499F, -4.1052F, -1.6267F, 1.4902F, 2.9952F));

		PartDefinition cube_r327 = rightShell.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.9417F, -0.6882F, -0.4908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.7881F, 1.0162F, -5.5528F, 1.5067F, -0.0567F, -0.1389F));

		PartDefinition cube_r328 = rightShell.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(26, 74).mirror().addBox(-0.0879F, -0.5233F, -0.4908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-3.7881F, 1.0162F, -5.5528F, 1.2598F, 1.3601F, -0.4471F));

		PartDefinition cube_r329 = rightShell.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(91, 15).mirror().addBox(-0.941F, -1.0122F, -0.4908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.7881F, 1.0162F, -5.5528F, 1.5053F, 0.2132F, -0.1564F));

		PartDefinition cube_r330 = rightShell.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(46, 70).mirror().addBox(-1.9649F, 0.0768F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9013F, 0.2802F, -6.2F, -0.0752F, 0.4657F, -0.1662F));

		PartDefinition hips = body.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(38, 62).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 46).addBox(-1.0F, -1.2F, 2.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(26, 71).addBox(-1.0F, -1.2F, 7.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, 0.0949F, 0.0869F, 0.0876F));

		PartDefinition cube_r331 = hips.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.025F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7264F, 0.5F, 2.1711F, -0.0594F, 0.9658F, -0.392F));

		PartDefinition cube_r332 = hips.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(79, 8).mirror().addBox(-1.9015F, 0.0007F, -0.4828F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2F, 6.5F, -0.0216F, 0.0421F, -0.0106F));

		PartDefinition cube_r333 = hips.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-1.9015F, 0.0007F, -0.4828F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2F, 4.5F, -0.0208F, -0.0364F, -0.0106F));

		PartDefinition cube_r334 = hips.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-1.9015F, 0.0007F, -0.4828F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2F, 2.5F, -0.0221F, 0.0858F, -0.0106F));

		PartDefinition cube_r335 = hips.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-2.8137F, -0.5712F, -0.4828F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2F, 2.5F, -0.0469F, 0.0752F, -0.3168F));

		PartDefinition cube_r336 = hips.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(90, 67).mirror().addBox(0.3023F, 0.0787F, -1.4333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(90, 46).mirror().addBox(1.0023F, 0.0787F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(90, 43).mirror().addBox(0.4273F, 0.0787F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.1231F, 0.7816F, 0.0869F));

		PartDefinition cube_r337 = hips.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(90, 64).mirror().addBox(-0.507F, 0.0787F, -0.9756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition cube_r338 = hips.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(24, 83).mirror().addBox(-0.5407F, 0.0787F, -2.2122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.0988F, -0.4867F, -0.0463F));

		PartDefinition cube_r339 = hips.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.656F, 0.0787F, -2.2614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.0877F, -0.1043F, -0.0092F));

		PartDefinition cube_r340 = hips.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-0.299F, 0.0787F, -2.2529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.0983F, 0.478F, 0.0453F));

		PartDefinition cube_r341 = hips.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(89, 31).mirror().addBox(0.6711F, 0.0787F, -1.5641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.5905F, 1.4136F, 0.5848F));

		PartDefinition cube_r342 = hips.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.3707F, -1.2434F, -1.4513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1816F, 1.8667F, 4.2706F, -1.5903F, 0.9695F, -1.2354F));

		PartDefinition cube_r343 = hips.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-2.2571F, 0.0686F, -0.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.4667F, 1.3759F, 0.4591F));

		PartDefinition cube_r344 = hips.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-1.0626F, 0.0787F, 0.4738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.0944F, 0.3911F, 0.0361F));

		PartDefinition cube_r345 = hips.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-0.914F, 0.0787F, 0.1946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition cube_r346 = hips.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(0.0888F, 0.0787F, 0.0932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(10, 89).addBox(2.0743F, 0.0787F, 0.0932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r347 = hips.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-0.1006F, 0.0787F, 0.6023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.1007F, 0.5214F, 0.0503F));

		PartDefinition cube_r348 = hips.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-1.0769F, 0.0787F, 0.8174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.1873F, 1.0836F, 0.1659F));

		PartDefinition cube_r349 = hips.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-2.0983F, 0.0686F, -1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(90, 40).mirror().addBox(-1.3904F, 0.0787F, -0.8851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 2.9902F, 0.9545F, 3.0178F));

		PartDefinition cube_r350 = hips.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(90, 61).mirror().addBox(0.1437F, 0.0787F, -1.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5816F, 1.8667F, 4.2706F, 0.2831F, 1.2535F, 0.2697F));

		PartDefinition cube_r351 = hips.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(-3.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2F, 0.5F, -0.0744F, 0.158F, -0.3201F));

		PartDefinition cube_r352 = hips.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2F, 0.5F, -0.023F, 0.173F, -0.0107F));

		PartDefinition cube_r353 = hips.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 69).addBox(0.025F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7264F, 0.5F, 2.1711F, -0.0594F, -0.9658F, 0.392F));

		PartDefinition cube_r354 = hips.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(79, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2F, 0.5F, -0.023F, -0.173F, 0.0107F));

		PartDefinition cube_r355 = hips.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(74, 21).addBox(1.9074F, -0.6014F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2F, 0.5F, -0.0744F, -0.158F, 0.3201F));

		PartDefinition cube_r356 = hips.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(79, 8).addBox(-0.0985F, 0.0007F, -0.4828F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2F, 6.5F, -0.0216F, -0.0421F, 0.0106F));

		PartDefinition cube_r357 = hips.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(7, 79).addBox(-0.0985F, 0.0007F, -0.4828F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2F, 4.5F, -0.0208F, 0.0364F, 0.0106F));

		PartDefinition cube_r358 = hips.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(79, 6).addBox(-0.0985F, 0.0007F, -0.4828F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2F, 2.5F, -0.0221F, -0.0858F, 0.0106F));

		PartDefinition cube_r359 = hips.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(5, 93).addBox(1.8137F, -0.5712F, -0.4828F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2F, 2.5F, -0.0469F, -0.0752F, 0.3168F));

		PartDefinition cube_r360 = hips.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(90, 67).addBox(-1.3024F, 0.0787F, -1.4333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(90, 46).addBox(-2.0023F, 0.0787F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(90, 43).addBox(-1.4273F, 0.0787F, -0.7333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.1231F, -0.7816F, -0.0869F));

		PartDefinition cube_r361 = hips.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(90, 64).addBox(-0.493F, 0.0787F, -0.9756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition cube_r362 = hips.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(24, 83).addBox(-0.4593F, 0.0787F, -2.2122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.0988F, 0.4867F, 0.0463F));

		PartDefinition cube_r363 = hips.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(20, 89).addBox(-0.344F, 0.0787F, -2.2614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.0877F, 0.1043F, 0.0092F));

		PartDefinition cube_r364 = hips.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(89, 12).addBox(-0.701F, 0.0787F, -2.2529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.0983F, -0.478F, -0.0453F));

		PartDefinition cube_r365 = hips.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(89, 31).addBox(-1.6711F, 0.0787F, -1.5641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.5905F, -1.4136F, -0.5848F));

		PartDefinition cube_r366 = hips.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(20, 77).addBox(-0.6293F, -1.2434F, -1.4513F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1816F, 1.8667F, 4.2706F, -1.5903F, -0.9695F, 1.2354F));

		PartDefinition cube_r367 = hips.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(40, 80).addBox(1.2571F, 0.0686F, -0.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.4667F, -1.3759F, -0.4591F));

		PartDefinition cube_r368 = hips.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(10, 83).addBox(0.0626F, 0.0787F, 0.4738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.0944F, -0.3911F, -0.0361F));

		PartDefinition cube_r369 = hips.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(84, 34).addBox(-0.086F, 0.0787F, 0.1946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition cube_r370 = hips.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(86, 3).addBox(-0.8994F, 0.0787F, 0.6023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.1007F, -0.5214F, -0.0503F));

		PartDefinition cube_r371 = hips.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(90, 85).addBox(0.0769F, 0.0787F, 0.8174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.1873F, -1.0836F, -0.1659F));

		PartDefinition cube_r372 = hips.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(81, 82).addBox(1.0983F, 0.0686F, -1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(90, 40).addBox(0.3904F, 0.0787F, -0.8851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 2.9902F, -0.9545F, -3.0178F));

		PartDefinition cube_r373 = hips.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(90, 61).addBox(-1.1437F, 0.0787F, -1.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5816F, 1.8667F, 4.2706F, 0.2831F, -1.2535F, -0.2697F));

		PartDefinition cube_r374 = hips.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(50, 19).addBox(0.0F, -0.3043F, 0.1833F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 2.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(0, 54).addBox(-0.4985F, -0.4358F, -0.0877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.4529F, 2.1117F, 3.7748F, 0.1937F, 0.704F, 0.5378F));

		PartDefinition cube_r375 = backleftleg.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(85, 41).addBox(-0.45F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0015F, 0.0642F, 2.9123F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r376 = backleftleg.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(44, 84).addBox(-0.4F, -0.5F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0015F, 0.0642F, 2.9123F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r377 = backleftleg.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(34, 67).addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0015F, 0.0642F, 2.9123F, 0.0F, 0.2182F, 0.0F));

		PartDefinition frontleftleg3 = backleftleg.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4371F, -0.3058F, 4.7384F, -3.1158F, -0.6534F, -0.0553F));

		PartDefinition cube_r378 = frontleftleg3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(63, 34).addBox(-1.2F, -1.1F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6F, -0.05F, -3.2F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r379 = frontleftleg3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(35, 80).addBox(-0.75F, -0.5F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2F, -0.25F, -0.6F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r380 = frontleftleg3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(61, 80).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0453F, -0.25F, -1.3304F, 0.0F, 0.4189F, 0.0F));

		PartDefinition cube_r381 = frontleftleg3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(80, 79).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(80, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0017F, -0.25F, -1.6267F, 0.0F, -0.1571F, 0.0F));

		PartDefinition cube_r382 = frontleftleg3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(80, 55).addBox(-0.4F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1132F, -0.25F, -0.1076F, 0.0F, -0.3316F, 0.0F));

		PartDefinition cube_r383 = frontleftleg3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(91, 0).addBox(-0.125F, -0.5F, -2.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(14, 68).addBox(-0.125F, -0.5F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7628F, -0.25F, -0.1151F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r384 = frontleftleg3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(90, 70).addBox(-0.45F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3626F, -0.25F, -0.0473F, 0.0F, 0.5149F, 0.0F));

		PartDefinition cube_r385 = frontleftleg3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(47, 66).addBox(-0.625F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2637F, -0.25F, -0.3857F, 0.0F, 0.2007F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.5015F, -0.4358F, -0.0877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.4529F, 2.1117F, 3.7748F, 0.546F, -1.2843F, -0.9392F));

		PartDefinition cube_r386 = backrightleg.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-0.55F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0015F, 0.0642F, 2.9123F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r387 = backrightleg.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(44, 84).mirror().addBox(-0.6F, -0.5F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.0015F, 0.0642F, 2.9123F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r388 = backrightleg.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(34, 67).mirror().addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0015F, 0.0642F, 2.9123F, 0.0F, -0.2182F, 0.0F));

		PartDefinition frontrightleg3 = backrightleg.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4371F, -0.3058F, 4.7384F, -3.1202F, 0.3045F, 0.0461F));

		PartDefinition cube_r389 = frontrightleg3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-0.8F, -1.1F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.05F, -3.2F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r390 = frontrightleg3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.25F, -0.5F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.25F, -0.6F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r391 = frontrightleg3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 80).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0453F, -0.25F, -1.3304F, 0.0F, -0.4189F, 0.0F));

		PartDefinition cube_r392 = frontrightleg3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(80, 79).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(80, 73).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.0017F, -0.25F, -1.6267F, 0.0F, 0.1571F, 0.0F));

		PartDefinition cube_r393 = frontrightleg3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(80, 55).mirror().addBox(-0.6F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1132F, -0.25F, -0.1076F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r394 = frontrightleg3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.875F, -0.5F, -2.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(14, 68).mirror().addBox(-0.875F, -0.5F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.7628F, -0.25F, -0.1151F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r395 = frontrightleg3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(-0.55F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3626F, -0.25F, -0.0473F, 0.0F, -0.5149F, 0.0F));

		PartDefinition cube_r396 = frontrightleg3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(47, 66).mirror().addBox(-0.375F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2637F, -0.25F, -0.3857F, 0.0F, -0.2007F, 0.0F));

		PartDefinition leftShell2 = hips.addOrReplaceChild("leftShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, -1.3F, 7.9F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r397 = leftShell2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(68, 55).addBox(-1.0043F, 0.0523F, 0.0867F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.6446F, 1.5151F, 0.2919F, 3.1379F, 0.6021F, 0.1027F));

		PartDefinition cube_r398 = leftShell2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(61, 40).addBox(1.824F, -0.0239F, -0.7492F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.6376F, 0.4366F, -5.9274F, -0.1479F, -1.383F, 0.234F));

		PartDefinition cube_r399 = leftShell2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 60).addBox(0.8961F, 0.0023F, -0.4489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.6376F, 0.4366F, -5.9274F, -0.0674F, -1.2318F, 0.1542F));

		PartDefinition cube_r400 = leftShell2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(44, 58).addBox(-3.0354F, -0.8819F, -0.0518F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6626F, 1.4616F, -1.3274F, -0.0046F, -0.5846F, 0.0983F));

		PartDefinition cube_r401 = leftShell2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(63, 15).addBox(-2.2883F, 0.081F, 3.3555F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.6376F, 0.4366F, -5.9274F, 0.0093F, -0.1301F, 0.0944F));

		PartDefinition cube_r402 = leftShell2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(29, 59).addBox(-2.8501F, 0.081F, 2.6231F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.6376F, 0.4366F, -5.9274F, 0.0092F, 0.027F, 0.0958F));

		PartDefinition cube_r403 = leftShell2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(63, 10).addBox(3.0426F, -0.7355F, -0.2722F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3951F, 0.8036F, -5.708F, -0.0269F, 0.0098F, 0.0828F));

		PartDefinition cube_r404 = leftShell2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(32, 46).addBox(-0.5F, -0.55F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7767F, 0.9041F, -3.0059F, -0.0051F, 0.0098F, 0.0828F));

		PartDefinition cube_r405 = leftShell2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(50, 30).addBox(-0.3151F, -0.7234F, -0.0709F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3951F, 0.8036F, -5.708F, -0.027F, 0.0796F, 0.0809F));

		PartDefinition cube_r406 = leftShell2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(64, 64).addBox(0.0F, 0.0F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1F, 0.1F, 0.5F, 0.0F, -0.0654F, 0.0873F));

		PartDefinition cube_r407 = leftShell2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(33, 11).addBox(0.0F, 0.0F, -4.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1F, -0.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r408 = leftShell2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(90, 91).addBox(-0.6659F, -0.5666F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(0, 72).addBox(-1.4409F, -0.1666F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.4117F, 0.955F, 0.375F, 1.5037F, -0.6232F, 0.2759F));

		PartDefinition cube_r409 = leftShell2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(72, 10).addBox(-1.4761F, -0.6216F, -0.5009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(3.4117F, 0.955F, 0.375F, -0.2372F, -1.514F, 2.0444F));

		PartDefinition cube_r410 = leftShell2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(20, 92).addBox(-0.1088F, -0.6426F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(3.4117F, 0.955F, 0.375F, -1.0773F, -1.4468F, 2.8841F));

		PartDefinition cube_r411 = leftShell2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(25, 92).addBox(-0.6659F, -0.5666F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(7, 72).addBox(-1.4409F, -0.1666F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.0617F, 1.08F, -0.3249F, 1.6082F, -0.4114F, 0.1273F));

		PartDefinition cube_r412 = leftShell2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(72, 33).addBox(-1.4761F, -0.6216F, -0.5009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(4.0617F, 1.08F, -0.3249F, 1.7378F, -1.3688F, -0.0219F));

		PartDefinition cube_r413 = leftShell2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(30, 92).addBox(-0.1088F, -0.6426F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(4.0617F, 1.08F, -0.3249F, 1.8477F, -1.4632F, -0.136F));

		PartDefinition cube_r414 = leftShell2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(72, 18).addBox(-1.4409F, -0.1666F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.5617F, 1.13F, -1.375F, 1.5582F, -0.0582F, 0.0824F));

		PartDefinition cube_r415 = leftShell2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(72, 36).addBox(-1.4761F, -0.6216F, -0.5009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(4.5617F, 1.13F, -1.375F, 1.5449F, -1.0179F, 0.1036F));

		PartDefinition cube_r416 = leftShell2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(50, 92).addBox(-0.1088F, -0.6426F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(4.5617F, 1.13F, -1.375F, 1.5296F, -1.1136F, 0.1176F));

		PartDefinition cube_r417 = leftShell2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(60, 92).addBox(0.1264F, 3.1756F, -1.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(72, 24).addBox(-0.6486F, 3.5006F, -1.2056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.6376F, 0.3866F, -5.9274F, 1.5818F, 0.1254F, 0.0836F));

		PartDefinition cube_r418 = leftShell2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(68, 73).addBox(1.9829F, 0.8334F, -1.1995F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(3.6376F, 0.3866F, -5.9274F, 1.5855F, -0.8344F, 0.0714F));

		PartDefinition cube_r419 = leftShell2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(92, 73).addBox(3.4761F, 0.4768F, -1.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(3.6376F, 0.3866F, -5.9274F, 1.5795F, -0.9303F, 0.0752F));

		PartDefinition cube_r420 = leftShell2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(53, 72).addBox(-1.4804F, -0.6219F, -0.5036F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(4.8656F, 1.1318F, -3.478F, 1.5231F, -0.7426F, 0.1141F));

		PartDefinition cube_r421 = leftShell2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(35, 92).addBox(-0.1131F, -0.6425F, -0.5039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(4.8656F, 1.1318F, -3.478F, 1.5113F, -0.8381F, 0.1265F));

		PartDefinition cube_r422 = leftShell2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(92, 37).addBox(-0.6682F, -0.4703F, -0.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(14, 72).addBox(-1.4432F, -0.1703F, -0.5059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.8656F, 1.1318F, -3.478F, 1.5359F, 0.2165F, 0.0742F));

		PartDefinition cube_r423 = leftShell2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(72, 30).addBox(-1.5063F, -0.2844F, -0.5034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.553F, 1.0413F, -4.5595F, 1.4924F, 0.4975F, 0.0444F));

		PartDefinition cube_r424 = leftShell2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(40, 73).addBox(-1.5175F, -0.7086F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(4.553F, 1.0413F, -4.5595F, 1.4941F, -0.4862F, 0.1176F));

		PartDefinition cube_r425 = leftShell2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(10, 92).addBox(-0.2402F, -0.746F, -0.5034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(4.553F, 1.0413F, -4.5595F, 1.4754F, -0.7643F, 0.148F));

		PartDefinition cube_r426 = leftShell2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(73, 59).addBox(-1.4338F, -0.4205F, -0.5006F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.1927F, 0.9749F, -5.4265F, 1.4924F, 0.4975F, 0.0444F));

		PartDefinition cube_r427 = leftShell2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(73, 62).addBox(-1.3764F, -0.7472F, -0.5006F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(4.1927F, 0.9749F, -5.4265F, 1.5018F, -0.0683F, 0.0866F));

		PartDefinition cube_r428 = leftShell2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(55, 92).addBox(-0.3482F, -0.856F, -0.5006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(4.1927F, 0.9749F, -5.4265F, 1.4754F, -0.7643F, 0.148F));

		PartDefinition cube_r429 = leftShell2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(85, 71).addBox(-0.0199F, -0.0084F, -0.0703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.6376F, 0.4366F, -5.9274F, -0.0244F, -0.8258F, 0.1204F));

		PartDefinition rightShell2 = hips.addOrReplaceChild("rightShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, -1.3F, 7.9F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r430 = rightShell2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(0.0043F, 0.0523F, 0.0867F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.6446F, 1.5151F, 0.2919F, 3.1379F, -0.6021F, -0.1027F));

		PartDefinition cube_r431 = rightShell2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(61, 40).mirror().addBox(-2.824F, -0.0239F, -0.7492F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.4366F, -5.9274F, -0.1479F, 1.383F, -0.234F));

		PartDefinition cube_r432 = rightShell2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.8961F, 0.0023F, -0.4489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.4366F, -5.9274F, -0.0674F, 1.2318F, -0.1542F));

		PartDefinition cube_r433 = rightShell2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(44, 58).mirror().addBox(0.0354F, -0.8819F, -0.0518F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6626F, 1.4616F, -1.3274F, -0.0046F, 0.5846F, -0.0983F));

		PartDefinition cube_r434 = rightShell2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(63, 15).mirror().addBox(-1.7117F, 0.081F, 3.3555F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.4366F, -5.9274F, 0.0093F, 0.1301F, -0.0944F));

		PartDefinition cube_r435 = rightShell2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(29, 59).mirror().addBox(-1.1499F, 0.081F, 2.6231F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.4366F, -5.9274F, 0.0092F, -0.027F, -0.0958F));

		PartDefinition cube_r436 = rightShell2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(63, 10).mirror().addBox(-4.0426F, -0.7355F, -0.2722F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.3951F, 0.8036F, -5.708F, -0.0269F, -0.0098F, -0.0828F));

		PartDefinition cube_r437 = rightShell2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(32, 46).mirror().addBox(-0.5F, -0.55F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7767F, 0.9041F, -3.0059F, -0.0051F, -0.0098F, -0.0828F));

		PartDefinition cube_r438 = rightShell2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(50, 30).mirror().addBox(-2.6849F, -0.7234F, -0.0709F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3951F, 0.8036F, -5.708F, -0.027F, -0.0796F, -0.0809F));

		PartDefinition cube_r439 = rightShell2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(64, 64).mirror().addBox(-3.0F, 0.0F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, 0.5F, 0.0F, 0.0654F, -0.0873F));

		PartDefinition cube_r440 = rightShell2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(33, 11).mirror().addBox(-3.0F, 0.0F, -4.9F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, -0.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r441 = rightShell2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-0.3341F, -0.5666F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(0, 72).mirror().addBox(-0.5591F, -0.1666F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.4117F, 0.955F, 0.375F, 1.5037F, 0.6232F, -0.2759F));

		PartDefinition cube_r442 = rightShell2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(72, 10).mirror().addBox(-0.5239F, -0.6216F, -0.5009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.4117F, 0.955F, 0.375F, -0.2372F, 1.514F, -2.0444F));

		PartDefinition cube_r443 = rightShell2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(-0.8912F, -0.6426F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-3.4117F, 0.955F, 0.375F, -1.0773F, 1.4468F, -2.8841F));

		PartDefinition cube_r444 = rightShell2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-0.3341F, -0.5666F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(7, 72).mirror().addBox(-0.5591F, -0.1666F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.0617F, 1.08F, -0.3249F, 1.6082F, 0.4114F, -0.1273F));

		PartDefinition cube_r445 = rightShell2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(-0.5239F, -0.6216F, -0.5009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-4.0617F, 1.08F, -0.3249F, 1.7378F, 1.3688F, 0.0219F));

		PartDefinition cube_r446 = rightShell2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(30, 92).mirror().addBox(-0.8912F, -0.6426F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-4.0617F, 1.08F, -0.3249F, 1.8477F, 1.4632F, 0.136F));

		PartDefinition cube_r447 = rightShell2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(72, 18).mirror().addBox(-0.5591F, -0.1666F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.5617F, 1.13F, -1.375F, 1.5582F, 0.0582F, -0.0824F));

		PartDefinition cube_r448 = rightShell2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-0.5239F, -0.6216F, -0.5009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-4.5617F, 1.13F, -1.375F, 1.5449F, 1.0179F, -0.1036F));

		PartDefinition cube_r449 = rightShell2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(-0.8912F, -0.6426F, -0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-4.5617F, 1.13F, -1.375F, 1.5296F, 1.1136F, -0.1176F));

		PartDefinition cube_r450 = rightShell2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(60, 92).mirror().addBox(-1.1264F, 3.1756F, -1.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(72, 24).mirror().addBox(-1.3514F, 3.5006F, -1.2056F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.3866F, -5.9274F, 1.5818F, -0.1254F, -0.0836F));

		PartDefinition cube_r451 = rightShell2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(68, 73).mirror().addBox(-3.9829F, 0.8334F, -1.1995F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.3866F, -5.9274F, 1.5855F, 0.8344F, -0.0714F));

		PartDefinition cube_r452 = rightShell2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(-4.4761F, 0.4768F, -1.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.3866F, -5.9274F, 1.5795F, 0.9303F, -0.0752F));

		PartDefinition cube_r453 = rightShell2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(53, 72).mirror().addBox(-0.5196F, -0.6219F, -0.5036F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-4.8656F, 1.1318F, -3.478F, 1.5231F, 0.7426F, -0.1141F));

		PartDefinition cube_r454 = rightShell2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(-0.8869F, -0.6425F, -0.5039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-4.8656F, 1.1318F, -3.478F, 1.5113F, 0.8381F, -0.1265F));

		PartDefinition cube_r455 = rightShell2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(92, 37).mirror().addBox(-0.3318F, -0.4703F, -0.5059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(14, 72).mirror().addBox(-0.5568F, -0.1703F, -0.5059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.8656F, 1.1318F, -3.478F, 1.5359F, -0.2165F, -0.0742F));

		PartDefinition cube_r456 = rightShell2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(72, 30).mirror().addBox(-0.4937F, -0.2844F, -0.5034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.553F, 1.0413F, -4.5595F, 1.4924F, -0.4975F, -0.0444F));

		PartDefinition cube_r457 = rightShell2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.4825F, -0.7086F, -0.5031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-4.553F, 1.0413F, -4.5595F, 1.4941F, 0.4862F, -0.1176F));

		PartDefinition cube_r458 = rightShell2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.7598F, -0.746F, -0.5034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-4.553F, 1.0413F, -4.5595F, 1.4754F, 0.7643F, -0.148F));

		PartDefinition cube_r459 = rightShell2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-0.5662F, -0.4205F, -0.5006F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.1927F, 0.9749F, -5.4265F, 1.4924F, -0.4975F, -0.0444F));

		PartDefinition cube_r460 = rightShell2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(73, 62).mirror().addBox(-0.6236F, -0.7472F, -0.5006F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-4.1927F, 0.9749F, -5.4265F, 1.5018F, 0.0683F, -0.0866F));

		PartDefinition cube_r461 = rightShell2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(-0.6518F, -0.856F, -0.5006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-4.1927F, 0.9749F, -5.4265F, 1.4754F, 0.7643F, -0.148F));

		PartDefinition cube_r462 = rightShell2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-0.9801F, -0.0084F, -0.0703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.6376F, 0.4366F, -5.9274F, -0.0244F, 0.8258F, -0.1204F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.5262F, -0.1006F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(94, 27).addBox(0.0F, -1.3262F, -0.1006F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 75).addBox(0.0F, -1.0262F, 7.8994F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 18).addBox(-0.2F, -0.0262F, -0.1006F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 23).addBox(-0.4F, -0.0262F, 1.8994F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 93).addBox(0.4F, -0.0262F, 3.8994F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 9).addBox(0.2F, -0.0262F, 5.8994F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 93).addBox(0.0F, -0.0262F, 7.8994F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 18).mirror().addBox(-1.8F, -0.0262F, -0.1006F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 23).mirror().addBox(-1.6F, -0.0262F, 1.8994F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 93).mirror().addBox(-1.4F, -0.0262F, 3.8994F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 9).mirror().addBox(-1.2F, -0.0262F, 5.8994F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 93).mirror().addBox(-1.0F, -0.0262F, 7.8994F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4522F, 8.0454F, 0.0703F, 0.2221F, 0.1241F));

		PartDefinition cube_r463 = tail.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(71, 94).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6262F, 6.3994F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r464 = tail.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(40, 59).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7262F, 4.3994F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r465 = tail.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(94, 30).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5262F, 1.8994F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 19).addBox(-0.5F, -0.4813F, -0.3002F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0229F, -0.0599F, 9.1027F, 0.1334F, 0.2691F, 0.0127F));

		PartDefinition cube_r466 = tail2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(68, 94).addBox(0.0F, -0.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 94).addBox(0.0F, -0.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 94).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4813F, 0.6998F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0087F, 6.6998F, 0.1784F, -0.346F, -0.1392F));

		PartDefinition frontleftleg = body.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(52, 11).addBox(-0.4F, -0.2F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.4824F, 1.4728F, -7.643F, 0.7722F, -0.9132F, -0.3493F));

		PartDefinition cube_r467 = frontleftleg.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(29, 62).addBox(-1.0F, -0.5F, -2.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1F, 0.3F, -0.4F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r468 = frontleftleg.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(71, 52).addBox(-0.9F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6F, 0.3F, -3.4F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r469 = frontleftleg.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(82, 38).addBox(-0.525F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F))
				.texOffs(55, 60).addBox(-0.225F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.3F, -2.3F, 0.0F, -0.48F, 0.0F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5577F, 0.5F, -4.2044F, -0.2145F, 0.5293F, -0.4074F));

		PartDefinition cube_r470 = frontleftleg2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(63, 18).addBox(-0.9F, -0.2F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6F, -0.05F, -3.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r471 = frontleftleg2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(80, 70).addBox(-0.3475F, -0.5F, -0.0504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5875F, -0.25F, -0.964F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r472 = frontleftleg2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(25, 80).addBox(-0.2F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 4).addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9506F, -0.25F, -1.0744F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r473 = frontleftleg2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(0, 65).addBox(-0.4482F, -0.5F, -1.4719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5875F, -0.25F, -0.964F, 0.0F, 0.2618F, 0.0F));

		PartDefinition frontrightleg = body.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(52, 11).mirror().addBox(-0.6F, -0.2F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.4824F, 1.4728F, -7.643F, 2.0747F, 0.8659F, 1.6073F));

		PartDefinition cube_r474 = frontrightleg.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(29, 62).mirror().addBox(0.0F, -0.5F, -2.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3F, -0.4F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r475 = frontrightleg.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(71, 52).mirror().addBox(-1.1F, -0.5F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3F, -3.4F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r476 = frontrightleg.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-0.475F, -0.5F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(55, 60).mirror().addBox(-0.775F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3F, -2.3F, 0.0F, 0.48F, 0.0F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5577F, 0.5F, -4.2044F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r477 = frontrightleg2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(-1.1F, -0.2F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.05F, -3.2F, 0.2618F, -0.1745F, 0.0F));

		PartDefinition cube_r478 = frontrightleg2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(-0.6525F, -0.5F, -0.0504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5875F, -0.25F, -0.964F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r479 = frontrightleg2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.8F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 4).mirror().addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9506F, -0.25F, -1.0744F, 0.0F, -0.1658F, 0.0F));

		PartDefinition cube_r480 = frontrightleg2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5518F, -0.5F, -1.4719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5875F, -0.25F, -0.964F, 0.0F, -0.2618F, 0.0F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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