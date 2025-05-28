package fossils.fossils.client.blockentity.model.edaphosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EdaphosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart body2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL1;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL6;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL8;
	private final ModelPart hindlegL9;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL4;
	private final ModelPart frontlegL;
	private final ModelPart frontlegL1;
	private final ModelPart frontlegL2;
	private final ModelPart frontlegL3;
	private final ModelPart frontlegL6;
	private final ModelPart frontlegL7;
	private final ModelPart frontlegL8;
	private final ModelPart frontlegL9;
	private final ModelPart frontlegL5;
	private final ModelPart frontlegL4;

	public EdaphosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.body2 = this.body.getChild("body2");
		this.tail = this.body2.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.hindlegL = this.body2.getChild("hindlegL");
		this.hindlegL1 = this.hindlegL.getChild("hindlegL1");
		this.hindlegL2 = this.hindlegL1.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL6 = this.body2.getChild("hindlegL6");
		this.hindlegL7 = this.hindlegL6.getChild("hindlegL7");
		this.hindlegL8 = this.hindlegL7.getChild("hindlegL8");
		this.hindlegL9 = this.hindlegL8.getChild("hindlegL9");
		this.hindlegL5 = this.body2.getChild("hindlegL5");
		this.hindlegL4 = this.body2.getChild("hindlegL4");
		this.frontlegL = this.body.getChild("frontlegL");
		this.frontlegL1 = this.frontlegL.getChild("frontlegL1");
		this.frontlegL2 = this.frontlegL1.getChild("frontlegL2");
		this.frontlegL3 = this.frontlegL2.getChild("frontlegL3");
		this.frontlegL6 = this.body.getChild("frontlegL6");
		this.frontlegL7 = this.frontlegL6.getChild("frontlegL7");
		this.frontlegL8 = this.frontlegL7.getChild("frontlegL8");
		this.frontlegL9 = this.frontlegL8.getChild("frontlegL9");
		this.frontlegL5 = this.body.getChild("frontlegL5");
		this.frontlegL4 = this.body.getChild("frontlegL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -1.15F, -1.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -14.4F, -9.75F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 21).mirror().addBox(-10.3476F, -1.7426F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 6.8F, -0.0577F, 0.1394F, -1.3754F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 0).mirror().addBox(-11.3476F, -1.7426F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 4.8F, -0.0421F, 0.2164F, -1.3727F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(78, 55).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 4.8F, 0.0641F, 0.211F, -0.8813F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 78).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 6.8F, 0.0136F, 0.1502F, -0.8904F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 67).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 6.8F, 0.0818F, 0.1268F, -0.4063F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 4.8F, 0.1548F, 0.1575F, -0.3959F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 15).mirror().addBox(-11.3476F, -1.7426F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 2.8F, -0.035F, 0.2506F, -1.371F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 2.8F, 0.087F, 0.2379F, -0.8762F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 2.8F, 0.1875F, 0.1709F, -0.3906F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(83, 82).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 0.8F, 0.2368F, 0.1906F, -0.3817F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(78, 59).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 0.8F, 0.1218F, 0.278F, -0.8673F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 11).mirror().addBox(-11.3476F, -1.7426F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, 0.8F, -0.0242F, 0.3019F, -1.3681F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 44).mirror().addBox(-10.3476F, -1.7426F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, -1.2F, -0.0148F, 0.3447F, -1.3651F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, -1.2F, 0.2782F, 0.2067F, -0.3735F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.65F, -1.2F, 0.1515F, 0.3111F, -0.8587F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.35F, -3.2F, 0.1879F, 0.3506F, -0.8469F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.35F, -3.2F, 0.3282F, 0.2256F, -0.3628F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(47, 23).mirror().addBox(-9.3476F, -1.7426F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.35F, -3.2F, -0.0032F, 0.3959F, -1.3609F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(27, 38).mirror().addBox(-7.3476F, -1.7426F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, -5.0F, 0.013F, 0.4641F, -1.3541F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(78, 42).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, -5.0F, 0.2381F, 0.4025F, -0.8284F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.05F, -5.0F, 0.3956F, 0.2498F, -0.3469F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 22).mirror().addBox(-5.3476F, -1.7426F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.65F, -7.0F, 0.0543F, 0.6172F, -1.3328F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(78, 13).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.65F, -7.0F, 0.36F, 0.5155F, -0.7743F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.65F, -7.0F, 0.5502F, 0.3002F, -0.3049F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(83, 67).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 6.8F, 0.0818F, -0.1268F, 0.4063F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(46, 78).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 6.8F, 0.0136F, -0.1502F, 0.8904F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(39, 21).addBox(2.3476F, -1.7426F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 6.8F, -0.0577F, -0.1394F, 1.3754F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 4.8F, 0.1548F, -0.1575F, 0.3959F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(78, 55).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 4.8F, 0.0641F, -0.211F, 0.8813F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 0).addBox(2.3476F, -1.7426F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 4.8F, -0.0421F, -0.2164F, 1.3727F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(83, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 2.8F, 0.1875F, -0.1709F, 0.3906F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(78, 57).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 2.8F, 0.087F, -0.2379F, 0.8762F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(14, 15).addBox(2.3476F, -1.7426F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 2.8F, -0.035F, -0.2506F, 1.371F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 82).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 0.8F, 0.2368F, -0.1906F, 0.3817F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 59).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 0.8F, 0.1218F, -0.278F, 0.8673F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(28, 11).addBox(2.3476F, -1.7426F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, 0.8F, -0.0242F, -0.3019F, 1.3681F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(78, 13).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.65F, -7.0F, 0.36F, -0.5155F, 0.7743F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 83).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.65F, -7.0F, 0.5502F, -0.3002F, 0.3049F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(14, 22).addBox(2.3476F, -1.7426F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.65F, -7.0F, 0.0543F, -0.6172F, 1.3328F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(35, 83).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, -5.0F, 0.3956F, -0.2498F, 0.3469F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(78, 42).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, -5.0F, 0.2381F, -0.4025F, 0.8284F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(27, 38).addBox(2.3476F, -1.7426F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.05F, -5.0F, 0.013F, -0.4641F, 1.3541F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 44).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.35F, -3.2F, 0.1879F, -0.3506F, 0.8469F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(47, 23).addBox(2.3476F, -1.7426F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.35F, -3.2F, -0.0032F, -0.3959F, 1.3609F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(83, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.35F, -3.2F, 0.3282F, -0.2256F, 0.3628F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(34, 44).addBox(2.3476F, -1.7426F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, -1.2F, -0.0148F, -0.3447F, 1.3651F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 61).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, -1.2F, 0.1515F, -0.3111F, 0.8587F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(84, 6).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.65F, -1.2F, 0.2782F, -0.2067F, 0.3735F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 63).addBox(-0.4F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0725F, -4.1744F, -6.5223F, 0.3253F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(45, 66).addBox(0.0F, -7.9484F, -0.7167F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4297F, -4.9669F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(5, 26).addBox(-0.2F, 1.1F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(33, 17).addBox(-0.2F, -0.5F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3081F, -11.3125F, -7.8757F, 0.1071F, 0.0051F, -0.032F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(56, 12).addBox(-0.3F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1748F, -7.2049F, -7.5449F, 0.3253F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 73).addBox(0.01F, -13.4921F, -2.5533F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4297F, -4.9669F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(66, 75).addBox(0.01F, -9.8159F, -1.7825F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 39).addBox(-0.5F, -7.4837F, -1.2078F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3297F, -6.2669F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(8, 75).addBox(0.0F, -5.1056F, -0.5446F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3297F, -6.2669F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(64, 45).addBox(-0.4703F, -3.5076F, -0.0847F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(58, 49).addBox(-0.4703F, -5.1076F, -0.0847F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3297F, -6.2669F, 0.4474F, 0.009F, -0.0312F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(84, 18).addBox(-0.5F, -6.2715F, -0.3281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(0.01F, -7.3037F, -0.9028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.55F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(0.1291F, 0.041F, -4.2122F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 8.658F, -3.7649F, 0.0029F, -0.3138F, -1.428F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(32, 25).mirror().addBox(-0.2457F, -0.0917F, -4.6019F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 6.658F, -3.7649F, -0.2951F, -0.1084F, -0.1897F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(0.0023F, 0.0377F, -0.2332F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 3.658F, -5.8649F, -0.1F, -0.3113F, -0.1187F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(14, 2).mirror().addBox(0.1F, 0.7F, -2.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.058F, -1.1649F, -0.4335F, -0.041F, 0.557F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(14, 2).addBox(-1.1F, 0.7F, -2.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.058F, -1.1649F, -0.4335F, 0.041F, -0.557F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0023F, 0.0377F, -0.2332F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 3.658F, -5.8649F, -0.1F, 0.3113F, 0.1187F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(32, 25).addBox(-0.7543F, -0.0917F, -4.6019F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 6.658F, -3.7649F, -0.2951F, 0.1084F, 0.1897F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(33, 35).addBox(-0.2F, -0.3F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.3698F, 8.0503F, -4.1893F, -0.244F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(40, 0).addBox(-1.1291F, 0.041F, -4.2122F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.3F, 8.658F, -3.7649F, 0.0029F, 0.3138F, 1.428F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(39, 13).addBox(-0.5F, -0.4872F, 0.0038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.65F, -7.5F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(3, 46).addBox(0.01F, -25.7538F, -1.182F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0341F, 2.1204F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(27, 52).addBox(0.0F, -11.8141F, -0.1598F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0341F, 2.1204F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 25).addBox(-0.5F, -11.5478F, 0.1543F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0341F, 2.1204F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -6.5F, -0.1F, 1.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.5633F, 3.1747F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(58, 37).addBox(-0.5F, -11.5495F, -0.0457F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0341F, 0.9204F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(24, 52).addBox(0.0F, -11.8211F, -0.3597F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0341F, 0.9204F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(18, 52).addBox(0.01F, -13.0908F, -0.1702F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.7341F, 0.3204F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(31, 44).addBox(0.01F, -26.1486F, -2.199F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2375F, 5.6192F, -0.2337F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -9.4413F, -0.5968F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2375F, 5.6192F, -0.0592F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 46).addBox(0.01F, -26.682F, -2.4468F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1087F, 3.6563F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(37, 53).addBox(0.0F, -11.9177F, -0.3975F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1087F, 3.6563F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(43, 53).addBox(0.0F, -11.0591F, -0.3878F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8502F, -0.3311F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(12, 61).addBox(-0.5F, -10.9692F, -0.1088F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8502F, -0.3311F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(12, 46).addBox(0.01F, -24.0724F, -1.1502F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8502F, -0.3311F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(34, 53).addBox(-0.5F, -13.4896F, 0.2118F, 1.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.05F, -3.15F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(9, 46).addBox(0.01F, -14.1075F, -0.0693F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.05F, -3.15F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(61, 36).addBox(0.0F, -8.2506F, -0.3724F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.15F, -1.55F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 77).addBox(-0.5F, -8.4301F, -0.0908F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.15F, -1.55F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(21, 52).addBox(0.01F, -12.9245F, -0.1987F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.55F, -4.65F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(40, 53).addBox(-0.5F, -12.3054F, 0.084F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.55F, -4.65F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(15, 63).addBox(0.0F, -8.0553F, -0.4157F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, -2.75F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(9, 62).addBox(0.01F, -8.9416F, -0.1147F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 67).addBox(-0.5F, -8.1973F, 0.4738F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.75F, -6.15F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(48, 66).addBox(0.0F, -7.557F, -0.4834F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 82).addBox(-0.5F, -7.8127F, 0.1051F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -3.95F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(75, 69).addBox(0.0F, -4.3436F, -0.3497F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.55F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(15, 45).addBox(-0.5F, -8.5F, -0.2F, 1.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.2378F, 8.1474F, -0.225F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(69, 77).addBox(-0.5F, -8.7741F, -0.027F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2375F, 5.6192F, -0.0417F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 59).addBox(-0.5F, -11.3055F, -0.1747F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1087F, 3.6563F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(6, 46).addBox(-0.5F, -25.9743F, -1.5547F, 1.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1087F, 3.6563F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(46, 53).addBox(-0.5F, -12.3787F, 0.4673F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.7341F, 0.3204F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(49, 53).addBox(-0.5F, -23.3758F, -0.8714F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8502F, -0.3311F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -8.2344F, -0.1324F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, -2.75F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(84, 49).addBox(-0.4616F, -4.05F, 0.1045F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.55F, 0.5521F, 0.0122F, -0.0301F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.65F, -7.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r91 = neck.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 59).addBox(-0.5F, -1.7377F, 0.1957F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7278F, -2.2929F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r92 = neck.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(84, 54).addBox(-0.5F, -2.5735F, 0.123F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.05F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r93 = neck.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 82).addBox(0.0F, -2.4209F, -0.5357F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7278F, -2.2929F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r94 = neck.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(55, 82).addBox(0.01F, -3.0498F, -0.0943F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, -2.85F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r95 = neck.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(43, 82).addBox(0.0F, -2.5815F, -0.3603F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.05F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(6, 62).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.75F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r97 = neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(0.0275F, -0.0064F, -0.6305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5201F, -0.0535F, -2.1495F, 0.0887F, -0.0964F, 0.8248F));

		PartDefinition cube_r98 = neck.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(42, 46).mirror().addBox(-0.4338F, 0.8917F, -0.6305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5201F, -0.0535F, -2.1495F, 0.1231F, -0.0447F, 0.3463F));

		PartDefinition cube_r99 = neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(48, 46).mirror().addBox(0.0F, -0.0043F, -1.4347F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2093F, -3.3411F, 0.1249F, -0.0393F, 0.303F));

		PartDefinition cube_r100 = neck.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(48, 46).addBox(0.0F, -0.0043F, -1.4347F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2093F, -3.3411F, 0.1249F, 0.0393F, -0.303F));

		PartDefinition cube_r101 = neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(42, 46).addBox(0.4338F, 0.8917F, -0.6305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5201F, -0.0535F, -2.1495F, 0.1231F, 0.0447F, -0.3463F));

		PartDefinition cube_r102 = neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(61, 54).addBox(-0.0275F, -0.0064F, -0.6305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5201F, -0.0535F, -2.1495F, 0.0887F, 0.0964F, -0.8248F));

		PartDefinition cube_r103 = neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(47, 46).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2389F, -2.7671F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -4.75F, 0.0005F, 0.0865F, 0.0114F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 7).addBox(-1.0F, -0.817F, -0.2373F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.05F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(-0.4F, -0.1F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.6488F, -1.9258F, -0.4935F, 0.1121F, 0.3772F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(34, 1).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 1).addBox(1.5F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 0.95F, -4.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(0.0F, -0.9421F, 0.0368F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 0).addBox(1.5F, -0.9421F, 0.0368F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 1.35F, -3.6F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-0.2953F, -0.4993F, -2.7534F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.3F, -0.25F, 0.0342F, -0.1832F, 0.0051F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.41F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(6, 13).addBox(0.21F, -4.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(78, 65).addBox(0.81F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7F, 0.6885F, -4.2784F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(82, 29).mirror().addBox(-1.02F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(82, 29).addBox(0.42F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2F, 0.0666F, -1.9533F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(81, 51).mirror().addBox(-1.02F, -0.254F, -0.8726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(81, 51).addBox(0.42F, -0.254F, -0.8726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2F, 0.5886F, -2.3274F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(82, 35).mirror().addBox(-1.02F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 35).addBox(0.42F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2F, 0.1056F, -2.4036F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-1.02F, -0.6286F, -0.5526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(82, 32).addBox(0.42F, -0.6286F, -0.5526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2F, 0.1886F, -2.2274F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(61, 54).addBox(-0.7047F, -0.4993F, -2.7534F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, 0.3F, -0.25F, 0.0342F, 0.1832F, -0.0051F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(66, 11).addBox(-1.5F, -0.4F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5F, 0.7F, -3.75F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(84, 71).addBox(-1.0F, -0.75F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -0.3825F, 0.2624F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 41).addBox(-1.0F, -0.1825F, -0.2376F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -0.0675F, -3.7569F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(76, 0).addBox(-1.5F, -0.1906F, -0.1674F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.2325F, -4.3569F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(76, 21).addBox(-1.5F, -0.161F, -0.2025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.5F, 0.6325F, -4.7569F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(76, 24).addBox(-1.0F, -0.2644F, 1.0357F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 45).addBox(-1.0F, -0.2644F, -0.3643F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.55F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(27, 74).addBox(-0.6F, -0.1F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 0.6488F, -1.9258F, -0.4935F, -0.1121F, -0.3772F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(74, 47).addBox(-0.5F, -0.9897F, -1.8803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2283F, -1.7052F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(71, 37).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0615F, -0.8155F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(49, 31).addBox(-0.5F, -0.9948F, -0.9853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.1283F, -0.7052F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 41).addBox(-0.5F, -0.9682F, -1.0204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.329F, -0.4931F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 27).addBox(-1.0F, -0.0583F, 0.0366F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.25F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(9, 37).addBox(-1.5F, -1.5F, -0.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.45F, -0.1745F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4F, -0.6F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r128 = lowerjaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(84, 40).addBox(-0.9F, -0.35F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3462F, -2.8674F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r129 = lowerjaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(20, 17).mirror().addBox(-0.5F, -0.7911F, -0.1962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(20, 17).addBox(1.5F, -0.7911F, -0.1962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.0F, 1.2574F, -0.4423F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r130 = lowerjaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 51).addBox(1.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.6034F, -0.1211F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r131 = lowerjaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(73, 13).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(73, 13).addBox(1.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.0F, 0.2447F, -0.9462F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r132 = lowerjaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-0.5F, -0.7911F, -1.7962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 9).addBox(1.5F, -0.7911F, -1.7962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 1.2574F, -0.4423F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r133 = lowerjaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.5F, -0.2513F, -1.7177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(72, 4).addBox(1.5F, -0.2513F, -1.7177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.0F, -0.2966F, -0.4211F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r134 = lowerjaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 18).addBox(0.5F, -0.4F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.3062F, -1.7844F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r135 = lowerjaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(6, 0).mirror().addBox(-0.5F, -0.1822F, -0.3571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)).mirror(false)
				.texOffs(6, 0).addBox(0.5F, -0.1822F, -0.3571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(-0.5F, 0.5885F, -3.4603F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r136 = lowerjaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(74, 17).mirror().addBox(-0.5F, -0.1758F, -0.674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(24, 28).mirror().addBox(-0.2F, -0.1758F, -0.774F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 28).addBox(1.2F, -0.1758F, -0.774F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 17).addBox(0.5F, -0.1758F, -0.674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5F, -0.2966F, -3.0211F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r137 = lowerjaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(48, 16).addBox(-1.5F, 0.0605F, -0.1535F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.2885F, -4.1603F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r138 = lowerjaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 76).addBox(-2.0F, -0.3404F, -0.0448F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.211F)), PartPose.offsetAndRotation(1.0F, -0.0966F, -4.0211F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 6.9F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(75, 82).addBox(0.0F, -1.7F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.639F, 19.203F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, -3.3386F, 5.3156F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 85).addBox(0.0F, -2.7717F, 3.7896F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3887F, 10.5616F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(83, 84).addBox(0.01F, -7.2866F, 3.4315F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 76).addBox(0.01F, -8.1379F, 2.278F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3887F, 10.5616F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, -6.4812F, 2.7864F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3887F, 10.5616F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.4819F, -0.2307F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9001F, 13.4721F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(67, 82).addBox(0.5F, -2.408F, -0.7064F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9001F, 13.4721F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(40, 76).addBox(0.0F, -8.0771F, -2.7253F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9001F, 13.4721F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(75, 55).addBox(0.5F, -8.7822F, -3.2981F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9001F, 13.4721F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(64, 82).addBox(0.51F, -4.6822F, -1.845F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9001F, 13.4721F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(42, 25).addBox(0.0F, -3.9896F, -1.315F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9001F, 13.4721F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(40, 82).addBox(0.0F, -2.9333F, -0.0706F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9001F, 12.0721F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(76, 30).addBox(0.5F, -3.8637F, -0.532F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9001F, 12.0721F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(43, 35).addBox(0.0F, -5.5679F, -1.5562F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9001F, 12.0721F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(18, 45).addBox(0.51F, -6.2625F, -2.0724F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9001F, 12.0721F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(54, 31).addBox(0.5F, -11.1959F, -4.04F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9001F, 12.0721F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 75).addBox(0.0F, -10.4843F, -3.4795F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9001F, 12.0721F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(71, 49).addBox(0.0F, -12.666F, -3.9881F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, 10.9721F, -1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(21, 2).addBox(0.5F, -13.382F, -4.5382F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, 10.9721F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(17, 76).addBox(0.5F, -4.2441F, -0.6896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, 10.9721F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(46, 80).addBox(0.51F, -7.6867F, -2.1306F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, 10.9721F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(34, 46).addBox(0.0F, -6.9915F, -1.6181F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, 10.9721F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = body2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.2542F, 0.1226F, -4.0783F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0286F, 6.1758F, 18.2659F, 0.0092F, 0.02F, -0.8679F));

		PartDefinition Hips_r2 = body2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.2542F, -0.2241F, 0.5926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.0286F, 6.1758F, 18.2659F, -0.0344F, 0.02F, -0.8679F));

		PartDefinition Hips_r3 = body2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(14, 17).mirror().addBox(-0.2542F, 0.7794F, 0.044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0286F, 6.1758F, 18.2659F, 0.3583F, 0.02F, -0.8679F));

		PartDefinition Hips_r4 = body2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(32, 28).mirror().addBox(-0.2542F, 1.6535F, 0.8034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0286F, 6.1758F, 18.2659F, 0.4805F, 0.02F, -0.8679F));

		PartDefinition Hips_r5 = body2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4273F, -0.1324F, -2.3388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0286F, 3.6758F, 18.2659F, -0.0344F, 0.02F, -0.0825F));

		PartDefinition Hips_r6 = body2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(18, 45).mirror().addBox(-0.4894F, -2.7949F, -3.4981F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 62).mirror().addBox(0.5106F, -2.1949F, -2.4981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0286F, 5.3758F, 19.2659F, -0.0344F, 0.02F, 0.0484F));

		PartDefinition Hips_r7 = body2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(0, 62).addBox(-1.5106F, -2.1949F, -2.4981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 45).addBox(-0.5106F, -2.7949F, -3.4981F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0286F, 5.3758F, 19.2659F, -0.0344F, -0.02F, -0.0484F));

		PartDefinition Hips_r8 = body2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5727F, -0.1324F, -2.3388F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0286F, 3.6758F, 18.2659F, -0.0344F, -0.02F, 0.0825F));

		PartDefinition Hips_r9 = body2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(0, 37).addBox(-0.7458F, 0.1226F, -4.0783F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0286F, 6.1758F, 18.2659F, 0.0092F, -0.02F, 0.8679F));

		PartDefinition Hips_r10 = body2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(69, 0).addBox(-0.7458F, -0.2241F, 0.5926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.0286F, 6.1758F, 18.2659F, -0.0344F, -0.02F, 0.8679F));

		PartDefinition Hips_r11 = body2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(32, 28).addBox(-0.7458F, 1.6535F, 0.8034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0286F, 6.1758F, 18.2659F, 0.4805F, -0.02F, 0.8679F));

		PartDefinition Hips_r12 = body2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(14, 17).addBox(-0.7458F, 0.7794F, 0.044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0286F, 6.1758F, 18.2659F, 0.3583F, -0.02F, 0.8679F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(34, 46).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.2666F, 17.0834F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 28).addBox(0.0F, -0.1681F, -6.9235F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.3001F, 14.6721F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(28, 15).addBox(0.0F, -0.1345F, -8.04F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 65).addBox(0.0F, -14.6218F, -4.5396F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2999F, 9.2721F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(60, 66).addBox(0.5F, -15.3426F, -5.0726F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2999F, 9.2721F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 76).addBox(0.0F, -8.9023F, -1.5326F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2999F, 9.2721F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(43, 76).addBox(0.0F, -4.205F, 0.1756F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2999F, 9.2721F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(37, 76).addBox(0.51F, -9.5967F, -2.0371F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2999F, 9.2721F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(68, 49).addBox(0.5F, -5.1418F, -0.293F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2999F, 9.2721F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(33, 67).addBox(0.0F, -16.689F, -5.3457F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(26, 66).addBox(0.5F, -17.4167F, -5.8694F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(11, 72).addBox(0.5F, -5.5402F, -1.1071F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(20, 75).addBox(0.51F, -10.6848F, -2.9392F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 66).addBox(0.5F, -19.323F, -8.6356F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(53, 76).addBox(0.0F, -4.6246F, -0.6278F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(63, 75).addBox(0.0F, -9.9825F, -2.4354F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(55, 41).addBox(0.0F, -17.7143F, -6.2008F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(59, 0).addBox(0.5F, -18.4495F, -6.7243F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(34, 76).addBox(0.0F, -9.9502F, -3.9876F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(75, 62).addBox(0.0F, -4.9407F, -2.4016F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(72, 57).addBox(0.51F, -10.666F, -4.4916F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 53).addBox(0.5F, -20.658F, -10.0361F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(69, 68).addBox(0.5F, -5.8101F, -2.8624F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(67, 30).addBox(0.0F, -18.5711F, -8.1285F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(30, 63).addBox(0.5F, -7.2887F, -4.4718F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(3, 67).addBox(0.51F, -12.9207F, -6.0127F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 67).addBox(0.0F, -6.4616F, -4.0242F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(73, 21).addBox(0.0F, -12.1916F, -5.5195F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(57, 65).addBox(0.0F, -19.8938F, -9.5231F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(73, 29).addBox(0.0F, -11.8322F, -7.0277F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(18, 67).addBox(0.0F, -6.5184F, -5.5735F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(70, 21).addBox(0.51F, -12.5745F, -7.5239F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(64, 30).addBox(0.5F, -7.3049F, -6.0221F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r191 = body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(23, 66).addBox(0.5F, -8.1847F, -7.4715F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r192 = body2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(58, 53).addBox(0.0F, -21.0345F, -11.2127F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(52, 53).addBox(0.5F, -21.8134F, -11.7244F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(70, 30).addBox(0.51F, -13.0917F, -9.1386F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(63, 66).addBox(0.0F, -7.4358F, -6.9993F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(14, 74).addBox(0.0F, -12.3352F, -8.6468F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(42, 66).addBox(0.51F, -14.3138F, -10.6946F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(66, 66).addBox(0.0F, -13.5438F, -10.2047F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(54, 65).addBox(0.5F, -22.8376F, -11.3059F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r200 = body2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(60, 25).addBox(0.5F, -8.764F, -8.9327F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r201 = body2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(-3.4477F, -2.7166F, -0.84F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6001F, 11.8721F, -0.1452F, -0.2972F, -1.3684F));

		PartDefinition cube_r202 = body2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(69, 4).mirror().addBox(-3.1322F, -1.7958F, -0.3741F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3501F, 13.3721F, -0.1545F, -0.3399F, -1.3654F));

		PartDefinition cube_r203 = body2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-2.7204F, -0.6083F, -0.3741F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3501F, 13.3721F, -0.2946F, -0.2308F, -0.8777F));

		PartDefinition cube_r204 = body2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-2.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8501F, 15.5721F, -0.1884F, -0.1022F, -0.8953F));

		PartDefinition cube_r205 = body2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(46, 76).mirror().addBox(-3.4255F, -1.2795F, -0.84F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6001F, 11.8721F, -0.2662F, -0.1971F, -0.8837F));

		PartDefinition cube_r206 = body2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 11).mirror().addBox(-1.8553F, -0.4767F, -0.84F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.6001F, 11.8721F, -0.3254F, -0.0546F, -0.4212F));

		PartDefinition cube_r207 = body2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 5).mirror().addBox(-0.9934F, -0.0548F, -0.3078F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3501F, 13.3721F, -0.2378F, -0.0152F, -0.4243F));

		PartDefinition cube_r208 = body2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8501F, 15.5721F, -0.214F, -0.0044F, -0.4245F));

		PartDefinition cube_r209 = body2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(77, 68).mirror().addBox(-4.5271F, -2.712F, -0.7111F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7001F, 9.8721F, -0.1135F, -0.1432F, -1.3753F));

		PartDefinition cube_r210 = body2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(78, 7).mirror().addBox(-3.4939F, -1.2387F, -0.7111F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7001F, 9.8721F, -0.1665F, -0.0749F, -0.8972F));

		PartDefinition cube_r211 = body2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-1.897F, -0.409F, -0.7111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.7001F, 9.8721F, -0.1822F, 0.01F, -0.4244F));

		PartDefinition cube_r212 = body2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(-1.8901F, -0.4864F, -0.4128F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1001F, 7.7721F, -0.0707F, 0.0601F, -0.4205F));

		PartDefinition cube_r213 = body2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(-3.4519F, -1.3042F, -0.4128F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1001F, 7.7721F, -0.0904F, 0.0207F, -0.8993F));

		PartDefinition cube_r214 = body2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-5.4597F, -2.7508F, -0.4128F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1001F, 7.7721F, -0.0898F, -0.0233F, -1.3773F));

		PartDefinition cube_r215 = body2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-6.5503F, -2.7152F, -0.6204F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1001F, 5.9721F, -0.0611F, 0.1223F, -1.3759F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(27, 40).mirror().addBox(-7.5541F, -2.7223F, -0.5285F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2001F, 3.8721F, -0.0508F, 0.1736F, -1.3744F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(-8.5585F, -2.7293F, -0.4364F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3001F, 1.7721F, -0.0404F, 0.225F, -1.3723F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(-3.5297F, -1.2396F, -0.4364F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3001F, 1.7721F, 0.0698F, 0.2178F, -0.8801F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-3.5226F, -1.2354F, -0.5285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2001F, 3.8721F, 0.0359F, 0.1773F, -0.8868F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-3.5159F, -1.2308F, -0.6204F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1001F, 5.9721F, 0.0026F, 0.1366F, -0.892F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-1.913F, -0.3918F, -0.6204F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1001F, 5.9721F, 0.0656F, 0.1199F, -0.4083F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-1.921F, -0.3928F, -0.5285F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2001F, 3.8721F, 0.1142F, 0.1406F, -0.4019F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(82, 23).mirror().addBox(-1.9292F, -0.3932F, -0.4364F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3001F, 1.7721F, 0.163F, 0.1609F, -0.3946F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(82, 38).addBox(0.897F, -0.409F, -0.7111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7001F, 9.8721F, -0.1822F, -0.01F, 0.4244F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(78, 7).addBox(1.4939F, -1.2387F, -0.7111F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7001F, 9.8721F, -0.1665F, 0.0749F, 0.8972F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(77, 68).addBox(2.5271F, -2.712F, -0.7111F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7001F, 9.8721F, -0.1135F, 0.1432F, 1.3753F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(77, 40).addBox(0.887F, -0.4617F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8501F, 15.5721F, -0.1884F, 0.1022F, 0.8953F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(82, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.8501F, 15.5721F, -0.214F, 0.0044F, 0.4245F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(79, 5).addBox(-0.0066F, -0.0548F, -0.3078F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3501F, 13.3721F, -0.2378F, 0.0152F, 0.4243F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(76, 37).addBox(0.7204F, -0.6083F, -0.3741F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3501F, 13.3721F, -0.2946F, 0.2308F, 0.8777F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 4).addBox(2.1322F, -1.7958F, -0.3741F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3501F, 13.3721F, -0.1545F, 0.3399F, 1.3654F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(80, 11).addBox(0.8553F, -0.4767F, -0.84F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6001F, 11.8721F, -0.3254F, 0.0546F, 0.4212F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(46, 76).addBox(1.4255F, -1.2795F, -0.84F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6001F, 11.8721F, -0.2662F, 0.1971F, 0.8837F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(82, 80).addBox(2.4477F, -2.7166F, -0.84F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6001F, 11.8721F, -0.1452F, 0.2972F, 1.3684F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(83, 4).addBox(0.8901F, -0.4864F, -0.4128F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1001F, 7.7721F, -0.0707F, -0.0601F, 0.4205F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(78, 9).addBox(1.4519F, -1.3042F, -0.4128F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1001F, 7.7721F, -0.0904F, -0.0207F, 0.8993F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 22).addBox(2.4597F, -2.7508F, -0.4128F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1001F, 7.7721F, -0.0898F, 0.0233F, 1.3773F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 20).addBox(2.5503F, -2.7152F, -0.6204F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1001F, 5.9721F, -0.0611F, -0.1223F, 1.3759F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 33).addBox(1.5159F, -1.2308F, -0.6204F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1001F, 5.9721F, 0.0026F, -0.1366F, 0.892F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(82, 20).addBox(0.913F, -0.3918F, -0.6204F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1001F, 5.9721F, 0.0656F, -0.1199F, 0.4083F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(27, 40).addBox(2.5541F, -2.7223F, -0.5285F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2001F, 3.8721F, -0.0508F, -0.1736F, 1.3744F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(78, 63).addBox(1.5226F, -1.2354F, -0.5285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2001F, 3.8721F, 0.0359F, -0.1773F, 0.8868F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(84, 8).addBox(0.921F, -0.3928F, -0.5285F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2001F, 3.8721F, 0.1142F, -0.1406F, 0.4019F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(48, 14).addBox(2.5585F, -2.7293F, -0.4364F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3001F, 1.7721F, -0.0404F, -0.225F, 1.3723F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(77, 3).addBox(1.5297F, -1.2396F, -0.4364F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3001F, 1.7721F, 0.0698F, -0.2178F, 0.8801F));

		PartDefinition cube_r246 = body2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(82, 23).addBox(0.9292F, -0.3932F, -0.4364F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3001F, 1.7721F, 0.163F, -0.1609F, 0.3946F));

		PartDefinition cube_r247 = body2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(6, 67).addBox(0.0F, -8.0531F, -8.4449F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r248 = body2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(51, 66).addBox(0.0F, -22.0622F, -10.8118F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3999F, 8.3721F, -0.2531F, 0.0F, 0.0F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5501F, 19.3221F, 0.1162F, -0.2167F, -0.0251F));

		PartDefinition cube_r249 = tail.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0817F, -0.8709F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r250 = tail.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(11, 80).addBox(0.0F, -3.2F, 7.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 78).addBox(0.0F, -2.7F, 5.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 81).addBox(0.0F, -1.9F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 9).addBox(0.0F, -1.7F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 81).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 1.9668F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r251 = tail.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(61, 82).addBox(0.0F, 0.0F, 2.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 45).addBox(0.0F, -1.5F, 0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4404F, 6.9083F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -0.4319F, -0.2026F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5817F, 11.0291F, -0.3894F, -0.4488F, 0.1762F));

		PartDefinition cube_r252 = tail2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(3, 79).addBox(0.0F, -4.3F, 7.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 78).addBox(0.0F, -4.2F, 5.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 30).addBox(0.0F, -3.9F, 3.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 70).addBox(0.0F, -3.5F, 1.9F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 76).addBox(0.0F, -3.3F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4319F, -0.1026F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r253 = tail2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(24, 84).addBox(0.0F, 1.5F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 80).addBox(0.0F, 0.1F, 5.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 82).addBox(0.0F, -0.5F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 82).addBox(0.0F, -1.3F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2975F, -0.0823F, 0.4276F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0319F, 8.9974F, -0.1064F, -0.6082F, 0.061F));

		PartDefinition cube_r254 = tail3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(81, 15).addBox(0.0F, -3.8982F, 7.8519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(81, 46).addBox(0.0F, -3.4982F, 5.8519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(81, 70).addBox(0.0F, -3.1982F, 3.8519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(72, 81).addBox(0.0F, -2.9982F, 1.8519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(81, 75).addBox(0.0F, -2.9982F, -0.1481F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4995F, 0.8782F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r255 = tail3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 1.1F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(9, 85).addBox(0.0F, 0.7F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(53, 25).addBox(0.0F, -0.7F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(84, 14).addBox(0.0F, -1.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(83, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.0254F, 0.9666F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r256 = tail3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(15, 3).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1005F, -0.2218F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2913F, -0.1416F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9995F, 9.7782F, -0.0935F, -0.609F, -0.2567F));

		PartDefinition cube_r257 = tail4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(14, 17).addBox(0.0F, -2.6F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 84).addBox(0.0F, -2.4F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 45).addBox(0.0F, -2.2F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 83).addBox(0.0F, -2.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 76).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2913F, 0.8584F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(16, 17).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.2087F, 10.7584F, 0.0436F, -0.5236F, 0.0F));

		PartDefinition hindlegL = body2.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 6.1001F, 7.2721F, 0.0F, 0.3491F, 0.0F));

		PartDefinition hindlegL1 = hindlegL.addOrReplaceChild("hindlegL1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8191F, 0.0F, 9.4739F, 0.3094F, 0.3725F, -1.1149F));

		PartDefinition cube_r258 = hindlegL1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(63, 23).addBox(0.0F, -2.0F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7214F, 1.7443F, 0.5F, 0.0F, 0.0F, 0.1309F));

		PartDefinition hindlegL2 = hindlegL1.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(73, 41).addBox(-0.49F, 0.0F, -0.89F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 13).addBox(-0.49F, 0.0F, 0.51F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7214F, 3.7443F, -0.1F, -0.3645F, 0.5945F, 1.113F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(15, 38).addBox(-1.5F, 0.0F, -3.9F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4753F, 3.9734F, 0.5618F, -0.0477F, -1.5134F, 0.0153F));

		PartDefinition hindlegL6 = body2.addOrReplaceChild("hindlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 6.1001F, 7.2721F, 0.0F, -0.3491F, 0.0F));

		PartDefinition hindlegL7 = hindlegL6.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8191F, 0.0F, 9.4739F, -0.7089F, -0.3089F, 1.393F));

		PartDefinition cube_r259 = hindlegL7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, -2.0F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7214F, 1.7443F, 0.5F, 0.0F, 0.0F, -0.1309F));

		PartDefinition hindlegL8 = hindlegL7.addOrReplaceChild("hindlegL8", CubeListBuilder.create().texOffs(0, 37).addBox(-0.51F, 0.0F, -0.89F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 27).addBox(-0.51F, 0.0F, 0.51F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7214F, 3.7443F, -0.1F, -0.1241F, -0.1058F, -1.0456F));

		PartDefinition hindlegL9 = hindlegL8.addOrReplaceChild("hindlegL9", CubeListBuilder.create().texOffs(12, 28).addBox(-1.5F, 0.0F, -3.9F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4753F, 3.9734F, 0.5618F, 0.4759F, 1.5134F, -0.0153F));

		PartDefinition hindlegL5 = body2.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 6.1001F, 7.2721F, 0.0F, -0.3491F, 0.0F));

		PartDefinition hindlegL4 = body2.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 6.1001F, 7.2721F, 0.0F, -0.3491F, 0.0F));

		PartDefinition frontlegL = body.addOrReplaceChild("frontlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 5.5F, -5.5F, 0.0F, -0.6981F, 0.0F));

		PartDefinition frontlegL1 = frontlegL.addOrReplaceChild("frontlegL1", CubeListBuilder.create().texOffs(67, 16).addBox(-0.753F, 0.9323F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(59, 8).addBox(-0.753F, -0.0677F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(60, 13).addBox(-0.753F, 2.9323F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9669F, 0.5F, -0.4626F, -0.774F, 0.4326F, -0.6756F));

		PartDefinition frontlegL2 = frontlegL1.addOrReplaceChild("frontlegL2", CubeListBuilder.create().texOffs(28, 2).addBox(-0.49F, 0.0F, -0.99F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 59).addBox(-1.79F, 0.0F, -0.99F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4172F, 4.5801F, -0.4785F, -0.481F, 0.0925F, 0.6746F));

		PartDefinition frontlegL3 = frontlegL2.addOrReplaceChild("frontlegL3", CubeListBuilder.create().texOffs(43, 35).addBox(-1.7F, 0.0023F, -2.8965F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5023F, 3.8214F, -0.0899F, 1.1421F, -0.0945F, -0.1006F));

		PartDefinition frontlegL6 = body.addOrReplaceChild("frontlegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5F, -5.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition frontlegL7 = frontlegL6.addOrReplaceChild("frontlegL7", CubeListBuilder.create().texOffs(28, 17).addBox(-0.247F, 0.9323F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 16).addBox(-0.247F, -0.0677F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 46).addBox(-0.247F, 2.9323F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9669F, 0.5F, -0.4626F, 0.3605F, -0.4326F, 0.6756F));

		PartDefinition frontlegL8 = frontlegL7.addOrReplaceChild("frontlegL8", CubeListBuilder.create().texOffs(0, 26).addBox(-0.51F, 0.0F, -0.99F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 47).addBox(0.79F, 0.0F, -0.99F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4172F, 4.5801F, -0.4785F, -0.6753F, -0.2851F, -0.5701F));

		PartDefinition frontlegL9 = frontlegL8.addOrReplaceChild("frontlegL9", CubeListBuilder.create().texOffs(42, 25).addBox(-1.3F, 0.0023F, -2.8965F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5023F, 3.8214F, -0.0899F, 0.1309F, 0.0F, 0.0F));

		PartDefinition frontlegL5 = body.addOrReplaceChild("frontlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5F, -5.5F, 0.0F, 0.6981F, 0.0F));

		PartDefinition frontlegL4 = body.addOrReplaceChild("frontlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5F, -5.5F, 0.0F, 0.6981F, 0.0F));

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