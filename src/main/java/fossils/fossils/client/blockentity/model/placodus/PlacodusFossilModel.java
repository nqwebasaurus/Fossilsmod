package fossils.fossils.client.blockentity.model.placodus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlacodusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body3;
	private final ModelPart body6;
	private final ModelPart body2;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail5;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body1;
	private final ModelPart chest;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;

	public PlacodusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body3 = this.body5.getChild("body3");
		this.body6 = this.body3.getChild("body6");
		this.body2 = this.body6.getChild("body2");
		this.legL = this.body2.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.body2.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.bone2 = this.body2.getChild("bone2");
		this.bone4 = this.body2.getChild("bone4");
		this.tail = this.body2.getChild("tail");
		this.tail5 = this.tail.getChild("tail5");
		this.tail2 = this.tail5.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail6 = this.tail4.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body1 = this.body.getChild("body1");
		this.chest = this.body1.getChild("chest");
		this.armL = this.chest.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.chest.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.3643F, 6.3696F, 0.4564F, 0.0776F, -0.1565F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 71).addBox(0.5F, -4.5F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4596F, -7.3133F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.1293F, -8.8221F, 0.1762F, -0.4488F, 1.1814F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.1293F, -8.8221F, 0.4659F, -0.1198F, 0.2333F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 91).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.1293F, -8.8221F, 0.3665F, -0.3172F, 0.6825F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 90).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.0293F, -6.8221F, 0.1617F, -0.4165F, 1.1875F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.0293F, -6.8221F, 0.3382F, -0.2951F, 0.691F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 68).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.0293F, -6.8221F, 0.4317F, -0.1117F, 0.2373F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 91).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.1293F, -8.8221F, 0.3665F, 0.3172F, -0.6825F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, 68).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.1293F, -8.8221F, 0.4659F, 0.1198F, -0.2333F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(90, 24).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.1293F, -8.8221F, 0.1762F, 0.4488F, -1.1814F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 90).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.0293F, -6.8221F, 0.1617F, 0.4165F, -1.1875F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 91).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.0293F, -6.8221F, 0.3382F, 0.2951F, -0.691F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(19, 15).addBox(-0.5F, -0.475F, -4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.1474F, -6.9195F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(24, 68).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.0293F, -6.8221F, 0.4317F, 0.1117F, -0.2373F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 68).addBox(0.5F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2679F, -9.3041F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 8.4739F, -5.1471F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(34, 14).addBox(0.0F, -1.0F, 0.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.9F, -11.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -5.3F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r18 = body4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(69, 51).addBox(0.0F, -4.9498F, -0.0719F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2114F, 2.0362F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(3, 68).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.3293F, 0.2779F, 0.4061F, -0.1055F, 0.1877F));

		PartDefinition cube_r20 = body4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(90, 82).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.3293F, 0.2779F, 0.3172F, -0.2784F, 0.6446F));

		PartDefinition cube_r21 = body4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.3293F, 0.2779F, 0.1511F, -0.3922F, 1.1393F));

		PartDefinition cube_r22 = body4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(11, 90).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.3293F, 2.2779F, 0.1442F, -0.376F, 1.1244F));

		PartDefinition cube_r23 = body4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.3293F, 2.2779F, 0.3891F, -0.1013F, 0.172F));

		PartDefinition cube_r24 = body4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(77, 90).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.3293F, 2.2779F, 0.3033F, -0.2671F, 0.6309F));

		PartDefinition cube_r25 = body4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(20, 90).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.3293F, 0.2779F, 0.1511F, 0.3922F, -1.1393F));

		PartDefinition cube_r26 = body4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 82).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.3293F, 0.2779F, 0.3172F, 0.2784F, -0.6446F));

		PartDefinition cube_r27 = body4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(3, 68).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.3293F, 0.2779F, 0.4061F, 0.1055F, -0.1877F));

		PartDefinition cube_r28 = body4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(11, 90).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.3293F, 2.2779F, 0.1442F, 0.376F, -1.1244F));

		PartDefinition cube_r29 = body4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 68).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.3293F, 2.2779F, 0.3891F, 0.1013F, -0.172F));

		PartDefinition cube_r30 = body4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(77, 90).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.3293F, 2.2779F, 0.3033F, 0.2671F, -0.6309F));

		PartDefinition cube_r31 = body4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(66, 69).addBox(0.0F, -4.8498F, -0.0469F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 0.0087F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.375F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -5.4314F, 5.1544F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -1.9875F, -3.9328F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1572F, 3.4038F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(47, 19).addBox(-0.5F, -0.2498F, -0.0469F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5075F, 0.4293F, 3.8779F, -0.1752F, -0.0859F, 0.0152F));

		PartDefinition cube_r35 = body5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(7, 63).addBox(0.0F, -5.3498F, -0.0469F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5075F, -0.185F, 2.0179F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(58, 67).addBox(0.0F, -5.0498F, -0.9469F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5075F, -0.4328F, 0.9277F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 31).addBox(-2.5F, -1.9717F, -2.9911F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5075F, 8.041F, 3.9899F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(47, 25).addBox(-0.5F, -0.2498F, 3.9531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5075F, -0.4467F, -3.9764F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.015F, 0.1F, 2.3F, 0.195F, -0.4891F, 1.0508F));

		PartDefinition cube_r40 = body5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.015F, 0.1F, 2.3F, 0.5087F, -0.1298F, 0.1058F));

		PartDefinition cube_r41 = body5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 42).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.015F, 0.1F, 2.3F, 0.4024F, -0.3446F, 0.5486F));

		PartDefinition cube_r42 = body5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.015F, 0.0F, 0.4F, 0.5516F, -0.1395F, 0.1175F));

		PartDefinition cube_r43 = body5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.015F, 0.0F, 0.4F, 0.2145F, -0.5293F, 1.0587F));

		PartDefinition cube_r44 = body5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 90).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.015F, 0.0F, 0.4F, 0.4391F, -0.3715F, 0.5532F));

		PartDefinition cube_r45 = body5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(90, 42).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.3F, 0.4024F, 0.3446F, -0.5486F));

		PartDefinition cube_r46 = body5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(82, 82).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.3F, 0.5087F, 0.1298F, -0.1058F));

		PartDefinition cube_r47 = body5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 89).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.3F, 0.195F, 0.4891F, -1.0508F));

		PartDefinition cube_r48 = body5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 68).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.5516F, 0.1395F, -0.1175F));

		PartDefinition cube_r49 = body5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 33).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.2145F, 0.5293F, -1.0587F));

		PartDefinition cube_r50 = body5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(30, 37).addBox(-0.5F, -0.325F, -2.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5075F, -5.8164F, 2.8217F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(32, 90).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.4391F, 0.3715F, -0.5532F));

		PartDefinition body3 = body5.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5075F, 0.1533F, 4.0201F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -1.9496F, -3.0019F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.1483F, 3.1783F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(53, 49).addBox(-0.5F, -0.5003F, -0.1655F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(15, 24).addBox(0.0F, -5.0002F, -0.9655F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3763F, 0.8651F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0075F, 0.1467F, 2.1799F, 0.4659F, -0.1198F, 0.0065F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(69, 90).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0075F, 0.1467F, 2.1799F, 0.3665F, -0.3172F, 0.4556F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(8, 90).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0075F, 0.1467F, 2.1799F, 0.1762F, -0.4488F, 0.9545F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2075F, 0.0467F, 0.1799F, 0.4024F, -0.3446F, 0.5137F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2075F, 0.0467F, 0.1799F, 0.195F, -0.4891F, 1.0159F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 91).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2075F, 0.0467F, 0.1799F, 0.5087F, -0.1298F, 0.0709F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(8, 90).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0075F, 0.1467F, 2.1799F, 0.1762F, 0.4488F, -0.9545F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(69, 90).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0075F, 0.1467F, 2.1799F, 0.3665F, 0.3172F, -0.4556F));

		PartDefinition cube_r63 = body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(93, 39).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0075F, 0.1467F, 2.1799F, 0.4659F, 0.1198F, -0.0065F));

		PartDefinition cube_r64 = body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(72, 91).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2075F, 0.0467F, 0.1799F, 0.5087F, 0.1298F, -0.0709F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(5, 90).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2075F, 0.0467F, 0.1799F, 0.195F, 0.4891F, -1.0159F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(58, 18).addBox(-0.5F, -0.5F, -2.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.1896F, 2.8282F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 90).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2075F, 0.0467F, 0.1799F, 0.4024F, 0.3446F, -0.5137F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(69, 69).addBox(0.0F, -4.8002F, 0.0345F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2285F, 1.8541F, -0.1658F, 0.0F, 0.0F));

		PartDefinition body6 = body3.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5075F, 0.3467F, 2.7764F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(9, 71).addBox(0.0F, -4.7003F, 0.0345F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5075F, -0.2795F, 1.0558F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(13, 46).addBox(-1.5F, -1.9531F, -2.9637F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5075F, 5.732F, 3.3929F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(9, 58).addBox(-0.5F, -0.5003F, 2.8345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5075F, -0.3467F, -2.7764F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body6.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(52, 44).addBox(-0.5F, -0.475F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5075F, -5.0611F, 3.4618F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body6.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(92, 32).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.215F, -0.0999F, 1.3035F, 0.3665F, -0.3172F, 0.3683F));

		PartDefinition cube_r74 = body6.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(0.0474F, 1.0134F, -0.4085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.215F, -0.0999F, 1.3035F, 0.1762F, -0.4488F, 0.8673F));

		PartDefinition cube_r75 = body6.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(93, 60).addBox(-0.0474F, 1.0134F, -0.4085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.0999F, 1.3035F, 0.1762F, 0.4488F, -0.8673F));

		PartDefinition cube_r76 = body6.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 32).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -0.0999F, 1.3035F, 0.3665F, 0.3172F, -0.3683F));

		PartDefinition body2 = body6.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5075F, 0.4398F, 2.9245F, -0.048F, -0.0872F, 0.0042F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 83).mirror().addBox(0.0F, -2.9253F, 0.0105F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.443F, 4.0397F, -0.2182F, 0.0F, -2.2864F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(0.0474F, 0.7134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2925F, -0.2398F, 2.179F, 0.1762F, -0.4488F, 0.8673F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 91).mirror().addBox(0.0474F, 1.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2925F, -0.4398F, 0.179F, 0.1762F, -0.4488F, 0.8673F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 83).addBox(0.0F, -2.9253F, 0.0105F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.443F, 4.0397F, -0.2182F, 0.0F, 2.2864F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 26).addBox(0.0F, -4.4253F, -0.9895F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.057F, 5.0397F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 64).addBox(0.0F, -4.6003F, -0.9895F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1965F, 3.0446F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(67, 62).addBox(0.0F, -4.7003F, 0.1105F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4127F, -0.0478F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 37).addBox(-0.5F, -0.5003F, -0.2895F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1139F, 0.3163F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(89, 91).addBox(-0.0474F, 0.7134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2925F, -0.2398F, 2.179F, 0.1762F, 0.4488F, -0.8673F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(86, 91).addBox(-0.0474F, 1.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2925F, -0.4398F, 0.179F, 0.1762F, 0.4488F, -0.8673F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.3F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.4066F, 2.7625F, -0.1222F, 0.0F, 0.0F));

		PartDefinition legL = body2.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(38, 79).addBox(-0.6F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6F, 1.8905F, 1.6315F, 0.4411F, 0.1137F, -0.704F));

		PartDefinition cube_r88 = legL.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(80, 25).addBox(0.0F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 79).addBox(0.0F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(79, 53).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 5.6715F, 1.2007F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r89 = legL.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(48, 67).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6F, 2.9526F, -0.0671F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r90 = legL.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(49, 72).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.0F, -0.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(33, 68).addBox(-0.6082F, -0.3597F, -0.5512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 41).addBox(-0.6082F, -0.2597F, 0.3487F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0869F, 6.4211F, 2.2439F, 1.3526F, 0.0F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(26, 51).addBox(-0.75F, -0.1F, -1.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(-0.0082F, 2.8403F, 0.6487F));

		PartDefinition legL4 = body2.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(80, 28).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.6F, 1.8905F, 1.6315F, -0.0494F, -0.1506F, 0.7838F));

		PartDefinition cube_r91 = legL4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(46, 80).addBox(-1.0F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 43).addBox(-1.0F, 0.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(80, 31).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 5.6715F, 1.2007F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r92 = legL4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(53, 67).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6F, 2.9526F, -0.0671F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r93 = legL4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(72, 51).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0F, -0.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(61, 68).addBox(-0.3918F, -0.3597F, -0.5512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 46).addBox(-0.3918F, -0.2597F, 0.3487F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0869F, 6.4211F, 2.2439F, 1.1345F, 0.0F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(35, 51).addBox(-0.25F, -0.1F, -1.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0082F, 2.8403F, 0.6487F));

		PartDefinition bone2 = body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.9457F, 2.6264F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(24, 64).addBox(-1.0F, 1.1494F, -1.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 63).addBox(-1.0F, -0.025F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 0.6366F, 0.3584F, 1.3766F, -0.2069F, 0.5357F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, 0.388F, -0.5088F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.6366F, 0.3584F, 0.5476F, -0.2069F, 0.5357F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(74, 18).addBox(-1.0F, 0.9262F, -0.6325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.6366F, 0.3584F, 0.504F, -0.2069F, 0.5357F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(74, 14).addBox(-1.0F, 0.8459F, -1.6174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.6366F, 0.3584F, 0.6349F, -0.2069F, 0.5357F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(31, 64).addBox(-1.0F, 0.1561F, 0.0447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, 1.4764F, -1.445F, -1.1421F, 0.0643F, 0.7863F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 83).addBox(-1.0F, 0.0259F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.4764F, -1.445F, -0.5748F, 0.0643F, 0.7863F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(83, 68).addBox(-1.0F, 1.2645F, -1.7834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, 1.4764F, -1.445F, 1.0832F, 0.0643F, 0.7863F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(83, 65).addBox(-1.0F, 1.6997F, -0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 1.4764F, -1.445F, 0.0797F, 0.0643F, 0.7863F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(83, 62).addBox(-1.0F, 1.6168F, -0.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(74, 46).addBox(-1.0F, -0.1832F, -0.36F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 1.4764F, -1.445F, -0.1821F, 0.0643F, 0.7863F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(74, 22).addBox(-1.0F, -0.1017F, -0.9547F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.4764F, -1.445F, 0.6469F, 0.0643F, 0.7863F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(83, 59).addBox(-1.0F, -0.025F, -1.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 83).addBox(-1.0F, -0.025F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.6366F, 0.3584F, 1.0276F, -0.2069F, 0.5357F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(48, 63).addBox(-0.5F, -0.025F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.3125F, 0.0962F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(79, 16).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(15, 79).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1404F, -1.7575F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(74, 10).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.7353F, -0.9536F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(54, 80).addBox(-0.5F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bone4 = body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.9457F, 2.6264F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r109 = bone4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(24, 64).mirror().addBox(0.0F, 1.1494F, -1.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 63).mirror().addBox(0.0F, -0.025F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6366F, 0.3584F, 1.3766F, 0.2069F, -0.5357F));

		PartDefinition cube_r110 = bone4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(0.0F, 0.388F, -0.5088F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6366F, 0.3584F, 0.5476F, 0.2069F, -0.5357F));

		PartDefinition cube_r111 = bone4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(0.0F, 0.9262F, -0.6325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6366F, 0.3584F, 0.504F, 0.2069F, -0.5357F));

		PartDefinition cube_r112 = bone4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(74, 14).mirror().addBox(0.0F, 0.8459F, -1.6174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6366F, 0.3584F, 0.6349F, 0.2069F, -0.5357F));

		PartDefinition cube_r113 = bone4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(31, 64).mirror().addBox(0.0F, 0.1561F, 0.0447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4764F, -1.445F, -1.1421F, -0.0643F, -0.7863F));

		PartDefinition cube_r114 = bone4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(62, 83).mirror().addBox(0.0F, 0.0259F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4764F, -1.445F, -0.5748F, -0.0643F, -0.7863F));

		PartDefinition cube_r115 = bone4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(0.0F, 1.2645F, -1.7834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4764F, -1.445F, 1.0832F, -0.0643F, -0.7863F));

		PartDefinition cube_r116 = bone4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(0.0F, 1.6997F, -0.06F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4764F, -1.445F, 0.0797F, -0.0643F, -0.7863F));

		PartDefinition cube_r117 = bone4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(83, 62).mirror().addBox(0.0F, 1.6168F, -0.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(74, 46).mirror().addBox(0.0F, -0.1832F, -0.36F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4764F, -1.445F, -0.1821F, -0.0643F, -0.7863F));

		PartDefinition cube_r118 = bone4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(0.0F, -0.1017F, -0.9547F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.4764F, -1.445F, 0.6469F, -0.0643F, -0.7863F));

		PartDefinition cube_r119 = bone4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(83, 59).mirror().addBox(0.0F, -0.025F, -1.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 83).mirror().addBox(0.0F, -0.025F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6366F, 0.3584F, 1.0276F, 0.2069F, -0.5357F));

		PartDefinition cube_r120 = bone4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(48, 63).mirror().addBox(-0.5F, -0.025F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3125F, 0.0962F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r121 = bone4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(79, 16).mirror().addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(15, 79).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1404F, -1.7575F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r122 = bone4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(74, 10).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7353F, -0.9536F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r123 = bone4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(-0.5F, -0.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(39, 44).addBox(-0.5F, -0.35F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2744F, 5.016F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition cube_r124 = tail.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(43, 28).addBox(0.0F, 0.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 36).addBox(0.0F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6674F, 1.5008F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 3.0F, 0.0F, 0.1745F, -0.6981F));

		PartDefinition cube_r126 = tail.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-2.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 1.0F, 0.0F, 0.1745F, -0.6981F));

		PartDefinition cube_r127 = tail.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(72, 55).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 3.0F, 0.0F, -0.1745F, 0.6981F));

		PartDefinition cube_r128 = tail.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(34, 28).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 1.0F, 0.0F, -0.1745F, 0.6981F));

		PartDefinition cube_r129 = tail.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(12, 71).addBox(0.0F, -3.8931F, 0.0506F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3327F, 2.9468F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(13, 39).addBox(-0.5F, -0.2F, 2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.681F, -2.2535F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(38, 68).addBox(0.0F, -4.2931F, -0.0494F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2659F, 1.0453F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail5 = tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(34, 21).addBox(-0.5F, -0.2893F, -0.1418F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0607F, 5.1418F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r132 = tail5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 75).addBox(0.0F, -3.4931F, 0.0506F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2371F, -0.1953F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 92).addBox(0.0F, 0.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 0).addBox(0.0F, 0.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 92).addBox(0.0F, 0.8F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7281F, -3.641F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(18, 57).mirror().addBox(-1.2F, 0.05F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2107F, 3.8582F, 0.0F, 0.1745F, -0.7418F));

		PartDefinition cube_r135 = tail5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(23, 75).mirror().addBox(-1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2107F, 1.8582F, 0.0F, 0.1309F, -0.7418F));

		PartDefinition cube_r136 = tail5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-1.8F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2107F, -0.1418F, 0.0F, 0.1309F, -0.7418F));

		PartDefinition cube_r137 = tail5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(18, 57).addBox(-0.8F, 0.05F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2107F, 3.8582F, 0.0F, -0.1745F, 0.7418F));

		PartDefinition cube_r138 = tail5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 75).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2107F, 1.8582F, 0.0F, -0.1309F, 0.7418F));

		PartDefinition cube_r139 = tail5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(73, 44).addBox(-0.2F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2107F, -0.1418F, 0.0F, -0.1309F, 0.7418F));

		PartDefinition cube_r140 = tail5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.125F, 0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.6941F, 0.1481F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(60, 89).addBox(0.0F, -2.6931F, -0.0494F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3655F, 3.9076F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(75, 61).addBox(0.0F, -2.9931F, -0.0494F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3005F, 1.9061F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail5.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3383F, 0.0343F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0607F, 4.7583F, 0.0474F, 0.3051F, 0.0142F));

		PartDefinition cube_r143 = tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(90, 86).mirror().addBox(-0.6F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1617F, 5.0343F, 0.0F, 0.2182F, -0.7854F));

		PartDefinition cube_r144 = tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1617F, 1.0343F, 0.0F, 0.1745F, -0.7854F));

		PartDefinition cube_r145 = tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1617F, 3.0343F, 0.0F, 0.1745F, -0.7854F));

		PartDefinition cube_r146 = tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(90, 55).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1617F, 1.0343F, 0.0F, -0.1745F, 0.7854F));

		PartDefinition cube_r147 = tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(90, 86).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1617F, 5.0343F, 0.0F, -0.2182F, 0.7854F));

		PartDefinition cube_r148 = tail2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(56, 42).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1617F, 3.0343F, 0.0F, -0.1745F, 0.7854F));

		PartDefinition cube_r149 = tail2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(47, 91).addBox(0.0F, -2.1931F, 15.6506F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.049F, -8.624F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(44, 91).addBox(0.0F, -1.893F, -0.0494F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3098F, 5.0827F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r151 = tail2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(93, 57).addBox(0.0F, 1.3F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 73).addBox(0.0F, 1.2F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 70).addBox(0.0F, 1.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6791F, -8.465F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r152 = tail2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(34, 7).addBox(-0.5F, -0.3F, 0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.389F, 0.3198F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(79, 82).addBox(0.0F, -2.193F, 0.0506F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3465F, 2.983F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(51, 82).addBox(0.0F, -2.4931F, -0.0494F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3796F, 1.0833F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.4578F, -0.0664F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1442F, 7.9128F, 0.1674F, 0.431F, 0.0705F));

		PartDefinition cube_r155 = tail3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(92, 91).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4578F, 4.9336F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(92, 88).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4578F, 2.9336F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(50, 91).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4578F, 0.9336F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 24).addBox(-0.7F, -0.5512F, 0.0433F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(93, 27).addBox(-0.2F, -0.8512F, 3.0433F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0747F, 5.7904F, 0.0804F, 0.4786F, 0.0371F));

		PartDefinition cube_r158 = tail4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(93, 24).addBox(-0.2F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5512F, 1.0433F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6 = tail4.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(15, 31).addBox(-0.7F, -0.5512F, 0.0433F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0156F, 5.9438F, -0.0945F, -0.4346F, 0.0399F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(47, 31).addBox(-0.7F, -0.5512F, 0.0433F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.007F, 5.9212F, -0.1869F, -0.3865F, 0.0712F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -10.3F, 0.0891F, 0.0869F, 0.0078F));

		PartDefinition cube_r159 = body1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(51, 76).addBox(0.0F, -3.8F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3197F, -0.9539F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(43, 76).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0919F, -2.9136F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r161 = body1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0075F, 0.5293F, -4.5221F, 0.4147F, -0.1075F, 0.117F));

		PartDefinition cube_r162 = body1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0075F, 0.5293F, -4.5221F, 0.3241F, -0.284F, 0.5729F));

		PartDefinition cube_r163 = body1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(29, 90).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0075F, 0.5293F, -4.5221F, 0.1546F, -0.4003F, 1.0681F));

		PartDefinition cube_r164 = body1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.1293F, -0.5221F, 0.1617F, -0.4165F, 1.1526F));

		PartDefinition cube_r165 = body1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(30, 68).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.1293F, -0.5221F, 0.4317F, -0.1117F, 0.2024F));

		PartDefinition cube_r166 = body1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5075F, 0.1293F, -0.5221F, 0.3382F, -0.2951F, 0.6561F));

		PartDefinition cube_r167 = body1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(26, 90).mirror().addBox(0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2075F, 0.3293F, -2.5221F, 0.1546F, -0.4003F, 1.1205F));

		PartDefinition cube_r168 = body1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(17, 91).mirror().addBox(-0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2075F, 0.3293F, -2.5221F, 0.3241F, -0.284F, 0.6252F));

		PartDefinition cube_r169 = body1.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-2.5416F, 2.9531F, -0.4085F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2075F, 0.3293F, -2.5221F, 0.4147F, -0.1075F, 0.1693F));

		PartDefinition cube_r170 = body1.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(35, 91).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.1293F, -0.5221F, 0.3382F, 0.2951F, -0.6561F));

		PartDefinition cube_r171 = body1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(30, 68).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.1293F, -0.5221F, 0.4317F, 0.1117F, -0.2024F));

		PartDefinition cube_r172 = body1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(90, 28).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5075F, 0.1293F, -0.5221F, 0.1617F, 0.4165F, -1.1526F));

		PartDefinition cube_r173 = body1.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(29, 90).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0075F, 0.5293F, -4.5221F, 0.1546F, 0.4003F, -1.0681F));

		PartDefinition cube_r174 = body1.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(38, 91).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0075F, 0.5293F, -4.5221F, 0.3241F, 0.284F, -0.5729F));

		PartDefinition cube_r175 = body1.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(45, 83).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0075F, 0.5293F, -4.5221F, 0.4147F, 0.1075F, -0.117F));

		PartDefinition cube_r176 = body1.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(26, 44).addBox(-0.5F, -0.6F, -4.775F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.2561F, -0.3757F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body1.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(74, 0).addBox(2.5416F, 2.9531F, -0.4085F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2075F, 0.3293F, -2.5221F, 0.4147F, 0.1075F, -0.1693F));

		PartDefinition cube_r178 = body1.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(17, 91).addBox(0.8882F, 1.8034F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2075F, 0.3293F, -2.5221F, 0.3241F, 0.284F, -0.6252F));

		PartDefinition cube_r179 = body1.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(26, 90).addBox(-0.0474F, 0.0134F, -0.4085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2075F, 0.3293F, -2.5221F, 0.1546F, 0.4003F, -1.1205F));

		PartDefinition cube_r180 = body1.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(20, 71).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.306F, -4.9046F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body1.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(47, 7).addBox(-1.5F, -1.95F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2625F, -3.4451F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r182 = body1.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(19, 0).addBox(-2.0F, -1.95F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.06F, 0.4746F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body1.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(19, 7).addBox(-0.5F, -0.3F, -1.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4772F, -4.0675F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest = body1.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1031F, -5.6709F, -0.2628F, 0.0843F, -0.0226F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(75, 67).addBox(0.0F, -4.1F, -2.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 4).addBox(-0.5F, -0.3F, -3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(91, 77).mirror().addBox(-2.5679F, 2.4551F, -0.3729F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3925F, 0.0262F, -0.3512F, 0.8042F, -0.1677F, -0.1152F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(41, 91).mirror().addBox(-1.1415F, 1.3738F, -0.3729F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3925F, 0.0262F, -0.3512F, 0.6797F, -0.4961F, 0.2576F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(93, 42).mirror().addBox(-0.3757F, 0.7493F, -0.3729F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3925F, 0.0262F, -0.3512F, 0.3767F, -0.7443F, 0.7677F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(91, 77).addBox(2.5679F, 2.4551F, -0.3729F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3925F, 0.0262F, -0.3512F, 0.8042F, 0.1677F, 0.1152F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(41, 91).addBox(1.1415F, 1.3738F, -0.3729F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3925F, 0.0262F, -0.3512F, 0.6797F, 0.4961F, -0.2576F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(62, 54).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.0366F, -1.993F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(93, 42).addBox(0.3757F, 0.7493F, -0.3729F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3925F, 0.0262F, -0.3512F, 0.3767F, 0.7443F, -0.7677F));

		PartDefinition armL = chest.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(25, 77).addBox(-0.626F, -0.0848F, -0.4652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7633F, 1.3104F, -1.2749F, -0.1492F, 0.6594F, -0.8229F));

		PartDefinition cube_r192 = armL.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(89, 9).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(89, 6).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.126F, 3.427F, 2.1234F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r193 = armL.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(75, 30).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.126F, 3.7278F, 0.38F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r194 = armL.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(66, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.126F, 1.9152F, -0.4652F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r195 = armL.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(46, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.126F, 1.9152F, -0.4652F, 0.4363F, 0.0F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(70, 26).addBox(-0.4528F, -0.1316F, -0.0624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 58).addBox(-0.4528F, -0.2316F, -0.9624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1451F, 4.3982F, 2.9708F, 1.8577F, -0.3725F, 0.1313F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(44, 51).addBox(-0.75F, 0.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2925F, 2.7694F, -0.0995F, -0.0426F, 0.0094F, 0.218F));

		PartDefinition armL4 = chest.addOrReplaceChild("armL4", CubeListBuilder.create().texOffs(33, 77).addBox(-0.374F, -0.0848F, -0.4652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7633F, 1.3104F, -1.2749F, -1.318F, -0.7395F, 1.2563F));

		PartDefinition cube_r196 = armL4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(89, 15).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(89, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.126F, 3.427F, 2.1234F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r197 = armL4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(75, 57).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.126F, 3.7278F, 0.38F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r198 = armL4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(20, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.126F, 1.9152F, -0.4652F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r199 = armL4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.126F, 1.9152F, -0.4652F, 0.4363F, 0.0F, 0.0F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create().texOffs(70, 31).addBox(-0.5472F, -0.1316F, -0.0624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 63).addBox(-0.5472F, -0.2316F, -0.9624F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1451F, 4.3982F, 2.9708F, 1.2768F, 0.1612F, -0.1781F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create().texOffs(0, 52).addBox(-0.25F, 0.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2925F, 2.7694F, -0.0995F, -0.0346F, -0.0266F, -0.654F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.4938F, -0.6261F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r200 = bone.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(47, 13).addBox(-0.5F, -1.7144F, -1.2598F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, -3.1067F, 0.0F, 0.829F));

		PartDefinition cube_r201 = bone.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(73, 40).addBox(-0.5F, -0.7981F, -0.0339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, 0.0698F, 0.0F, 0.829F));

		PartDefinition cube_r202 = bone.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(82, 37).addBox(-0.5F, 1.124F, 0.1357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, 0.5934F, 0.0F, 0.829F));

		PartDefinition cube_r203 = bone.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(82, 73).addBox(-0.5F, -1.3F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(82, 49).addBox(-0.5F, -0.35F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(40, 82).addBox(-0.5F, -0.35F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4008F, 2.3433F, 1.9675F, 1.2043F, 0.0F, 0.829F));

		PartDefinition cube_r204 = bone.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(17, 63).addBox(-0.5F, -1.0543F, 0.5983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, 0.0262F, 0.0F, 0.829F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(62, 50).addBox(-0.5F, -1.1398F, -1.7643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, 0.4189F, 0.0F, 0.829F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(74, 6).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 1.7486F, -0.7297F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(10, 63).addBox(-0.5F, -1.2556F, -1.4563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, -0.3229F, 0.0F, 0.829F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(62, 46).addBox(-0.5F, -1.878F, -1.9933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, 1.0734F, 0.0F, 0.829F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(61, 42).addBox(-0.5F, -2.2108F, -1.8106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 2.4342F, 0.0785F, 1.2479F, 0.0F, 0.829F));

		PartDefinition cube_r210 = bone.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(60, 8).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.1404F, -1.7575F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r211 = bone.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(79, 22).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7353F, -0.9536F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r212 = bone.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(79, 19).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.4938F, -0.6261F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r213 = bone3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(47, 13).mirror().addBox(-0.5F, -1.7144F, -1.2598F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, -3.1067F, 0.0F, -0.829F));

		PartDefinition cube_r214 = bone3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(73, 40).mirror().addBox(-0.5F, -0.7981F, -0.0339F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, 0.0698F, 0.0F, -0.829F));

		PartDefinition cube_r215 = bone3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-0.5F, 1.124F, 0.1357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, 0.5934F, 0.0F, -0.829F));

		PartDefinition cube_r216 = bone3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(-0.5F, -1.3F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(82, 49).mirror().addBox(-0.5F, -0.35F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(40, 82).mirror().addBox(-0.5F, -0.35F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4008F, 2.3433F, 1.9675F, 1.2043F, 0.0F, -0.829F));

		PartDefinition cube_r217 = bone3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-0.5F, -1.0543F, 0.5983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, 0.0262F, 0.0F, -0.829F));

		PartDefinition cube_r218 = bone3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(62, 50).mirror().addBox(-0.5F, -1.1398F, -1.7643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, 0.4189F, 0.0F, -0.829F));

		PartDefinition cube_r219 = bone3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(74, 6).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7486F, -0.7297F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r220 = bone3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(10, 63).mirror().addBox(-0.5F, -1.2556F, -1.4563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, -0.3229F, 0.0F, -0.829F));

		PartDefinition cube_r221 = bone3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(62, 46).mirror().addBox(-0.5F, -1.878F, -1.9933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, 1.0734F, 0.0F, -0.829F));

		PartDefinition cube_r222 = bone3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-0.5F, -2.2108F, -1.8106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4342F, 0.0785F, 1.2479F, 0.0F, -0.829F));

		PartDefinition cube_r223 = bone3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(60, 8).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1404F, -1.7575F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r224 = bone3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(79, 22).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7353F, -0.9536F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r225 = bone3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(79, 19).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(53, 54).addBox(-0.5F, -0.6884F, -3.0113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F))
				.texOffs(54, 72).addBox(0.0F, -4.3884F, -1.0113F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3592F, -1.9414F, 0.0343F, 0.0282F, 0.0316F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(57, 74).addBox(0.0F, -3.4822F, -1.0001F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6062F, -2.0113F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r227 = neck.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(58, 13).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.2801F, -1.9487F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r228 = neck.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(80, 91).mirror().addBox(0.0843F, -0.0084F, -0.5288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5575F, -0.233F, -2.7097F, 0.2965F, -0.2885F, 0.4937F));

		PartDefinition cube_r229 = neck.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(48, 83).mirror().addBox(0.0843F, -0.2084F, -0.5288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5575F, -0.233F, -0.7097F, 0.3814F, -0.2921F, 0.502F));

		PartDefinition cube_r230 = neck.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(80, 91).addBox(-0.0843F, -0.0084F, -0.5288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5575F, -0.233F, -2.7097F, 0.2965F, 0.2885F, -0.4937F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(48, 83).addBox(-0.0843F, -0.2084F, -0.5288F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5575F, -0.233F, -0.7097F, 0.3814F, 0.2921F, -0.502F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(56, 37).addBox(-0.5F, -0.6884F, -3.0114F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.0068F, -2.908F, -0.0483F, 0.1305F, -0.0701F));

		PartDefinition cube_r232 = neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(26, 39).addBox(0.0F, -3.3822F, -1.0001F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3062F, -1.0113F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(89, 18).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.4831F, -2.6584F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(83, 91).mirror().addBox(0.0843F, -0.4084F, -0.5287F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5575F, -0.2262F, -1.6017F, 0.1631F, -0.2275F, 0.6269F));

		PartDefinition cube_r235 = neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(83, 91).addBox(-0.0843F, -0.4084F, -0.5287F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5575F, -0.2262F, -1.6017F, 0.1631F, 0.2275F, -0.6269F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(79, 46).addBox(-0.5F, -0.45F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 40).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.8884F, -1.5114F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(58, 28).addBox(-0.5F, -0.6884F, -3.0113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0015F, -2.975F, -0.1302F, 0.3827F, 0.0694F));

		PartDefinition cube_r237 = neck3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(62, 62).addBox(0.0F, -2.0822F, -1.0001F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6062F, -1.0113F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(89, 52).addBox(-0.5F, -0.6F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 89).addBox(-0.5F, -0.6F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -2.6089F, -2.0137F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(92, 49).mirror().addBox(0.0843F, -0.0084F, -0.5287F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5575F, -0.2278F, -0.6267F, 0.2211F, -0.256F, 0.7492F));

		PartDefinition cube_r240 = neck3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(92, 49).addBox(-0.0843F, -0.0084F, -0.5287F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5575F, -0.2278F, -0.6267F, 0.2211F, 0.256F, -0.7492F));

		PartDefinition cube_r241 = neck3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(89, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9713F, -0.6614F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5611F, -2.8137F, 0.3631F, 0.1083F, -0.4095F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(72, 36).addBox(-1.0F, -0.075F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -1.233F, -2.9708F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(18, 52).addBox(0.0F, 0.0F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 52).addBox(-1.0F, 0.0F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.261F, -2.5718F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, 0.0F, -3.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.7662F, -1.054F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(67, 16).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.7662F, -1.054F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(65, 37).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.2255F, -0.5217F, -2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(34, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2255F, -0.5217F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-0.4F, -0.0448F, -0.9911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0463F, -5.3976F, 0.4396F, -0.1186F, -0.0556F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(55, 59).mirror().addBox(-0.075F, 0.05F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.7161F, -6.3546F, 0.8031F, -0.0212F, -0.022F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-0.5F, -0.1724F, -0.4868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(77, 73).addBox(0.1F, -0.1724F, -0.4868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 1.1415F, -7.8165F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.5F, -0.8275F, -0.4846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 77).addBox(0.1F, -0.8275F, -0.4846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 1.1415F, -7.8165F, 2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(82, 76).addBox(-1.0F, -0.0948F, -0.9911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0002F)), PartPose.offsetAndRotation(0.5F, -1.0463F, -5.3976F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(55, 59).addBox(-1.0F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -0.7161F, -6.3546F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(77, 73).addBox(-1.5F, -0.125F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.7906F, -8.1068F, 2.0769F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(18, 59).addBox(-1.4296F, -0.4971F, -1.5975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.4296F, 1.3714F, -8.4815F, -2.9845F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(67, 20).addBox(-1.0F, -0.725F, -0.775F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 1.1613F, -8.7011F, 2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(60, 77).addBox(-1.5F, -0.425F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.0764F, -8.3964F, 2.1642F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.775F, 0.1398F, -1.4189F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(78, 67).addBox(-0.525F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5658F, 1.2042F, -6.9076F, -3.053F, -0.4708F, 0.1169F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(77, 76).addBox(-0.3F, -0.225F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.625F, 1.4956F, -7.4408F, 2.7852F, -0.4287F, 0.1535F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.425F, 1.3224F, -6.696F, 1.3634F, 0.3851F, -0.0789F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(77, 50).addBox(-0.875F, -0.15F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0429F, 1.4512F, -6.5611F, 1.5455F, -0.4008F, 0.0902F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(67, 23).addBox(-1.875F, -0.15F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2306F, 1.7443F, -5.9135F, 1.9839F, -0.4014F, -0.0046F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(59, 80).addBox(-0.95F, -0.9446F, -0.9359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.3842F, 1.71F, -5.2937F, -0.5166F, 0.0832F, -0.108F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(58, 33).addBox(-2.0353F, -0.2312F, -0.0722F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.1F, 0.8549F, -3.5124F, 0.0873F, 0.2443F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(81, 79).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(0, 82).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.947F, 1.5381F, -2.6685F, -1.4856F, 0.1139F, -0.0115F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(69, 81).addBox(-0.3F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(30, 81).addBox(-0.3F, -1.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2597F, 1.6863F, -4.336F, -1.4835F, 0.2443F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(15, 85).addBox(-0.525F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.9692F, 1.6514F, -3.9977F, -1.4825F, 0.2878F, 0.004F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 85).addBox(-0.45F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0781F, 1.6775F, -4.2771F, -1.4856F, 0.1139F, -0.0115F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1251F, 1.7277F, -4.9319F, -1.4856F, 0.1139F, -0.0115F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(20, 81).addBox(-0.5F, -1.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 81).addBox(-0.5F, -0.8F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 81).addBox(-0.5F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 80).addBox(-0.5F, 0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.398F, 1.7241F, -4.1089F, -1.4835F, 0.2443F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(80, 56).addBox(-1.0F, 0.9554F, -0.9359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.075F, 1.6271F, -3.4519F, -1.5272F, 0.2443F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.075F, 0.143F, -3.5254F, 0.3727F, 0.2473F, 0.0907F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(67, 8).addBox(-0.5F, -0.55F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.2114F, 1.1732F, -3.6509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(74, 82).addBox(-1.0F, -0.9962F, -0.9628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.075F, 1.6271F, -3.4519F, 0.0873F, 0.2443F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0353F, -0.6869F, -0.0785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, 0.8549F, -3.5124F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(5, 84).addBox(-0.525F, -0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1434F, -0.6612F, -1.4214F, 0.095F, 0.1407F, -1.1374F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(72, 74).addBox(-0.9892F, -1.3763F, 0.9564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(38, 64).addBox(-1.9892F, -1.3763F, -0.0436F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.8549F, -1.8123F, 0.0087F, 0.096F, -0.0005F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(33, 73).addBox(-1.017F, -0.4461F, 0.3081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(35, 82).addBox(-1.017F, 0.5539F, 0.1331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7212F, 0.6036F, -0.0727F, -0.0387F, -0.09F, 0.0235F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 34).addBox(-1.0311F, 0.319F, -0.8234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7212F, 0.6036F, -0.0727F, 0.6133F, -0.0329F, 0.0638F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(89, 46).addBox(-0.375F, -0.4F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(89, 46).addBox(-0.375F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.617F, -0.5272F, 1.1002F, -1.0242F, 1.1537F, -1.0379F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(82, 88).addBox(-1.0274F, -0.0568F, 0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(72, 88).addBox(-1.0274F, -0.0568F, 0.0656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7616F, -1.0236F, -0.0982F, -0.0125F, -0.0813F, 0.0235F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(17, 67).addBox(-0.9836F, -1.6753F, 0.0327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.8549F, -1.8123F, 0.1302F, 0.1051F, -0.0057F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(88, 67).addBox(-1.0274F, -1.8463F, -1.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7212F, 0.6036F, -0.0727F, -1.5223F, -0.0813F, 0.0235F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(78, 61).addBox(-0.5F, -1.05F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(78, 40).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1F, 1.6828F, -7.5633F, 2.906F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(79, 4).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-1.1F, 1.653F, -7.2445F, 2.426F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 34).addBox(-0.5F, -0.8999F, -0.341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.35F, 1.7704F, -6.4028F, 2.8187F, -0.4363F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(58, 23).addBox(-1.0F, -0.1511F, -2.1108F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.9F, -0.3979F, -4.9519F, 0.5684F, 0.3567F, -0.4606F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(84, 21).addBox(-0.8F, -0.4761F, -0.6108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8F, -0.3979F, -4.9519F, 0.5684F, 0.3567F, -0.4606F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(25, 84).addBox(-0.8F, -0.3761F, -0.6858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8616F, -0.2811F, -5.2393F, 1.0483F, 0.3567F, -0.4606F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(30, 84).addBox(-0.8F, -0.3511F, -0.6358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(84, 46).addBox(-0.8F, -0.3511F, -0.8359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.77F, 0.0604F, -5.4263F, 1.5807F, 0.3567F, -0.4606F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(67, 84).addBox(-0.8F, -0.2761F, -0.8858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(84, 52).addBox(-0.8F, -0.2761F, -0.6858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.77F, 0.0604F, -5.4263F, 1.9035F, 0.3567F, -0.4606F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(84, 3).addBox(-1.0F, -0.4608F, 0.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(-0.9F, -0.3979F, -4.9519F, 0.1757F, 0.3567F, -0.4606F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(48, 59).addBox(-0.5F, -0.55F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(-0.79F, 0.4337F, -4.2476F, 0.132F, 0.3567F, -0.4606F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(27, 59).addBox(-1.0F, 0.0F, 0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -1.3327F, -3.1017F, 0.0331F, 0.1749F, -0.0071F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(84, 6).addBox(-0.4899F, -0.2237F, -0.2311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(10, 84).addBox(-0.4899F, -0.2237F, -0.9311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5116F, -0.4478F, -2.5266F, -0.0885F, 0.2308F, -0.4333F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(84, 12).addBox(-0.5375F, -0.844F, -1.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.4767F, -0.447F, -2.6804F, 0.5813F, 0.2951F, -0.4581F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(84, 15).addBox(-0.5375F, -1.2039F, -0.5356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4767F, -0.447F, -2.6804F, 1.1049F, 0.2951F, -0.4581F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(50, 88).addBox(-0.4899F, -0.9797F, -0.2165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(88, 58).addBox(-0.4899F, -0.5797F, -0.2165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5116F, -0.4478F, -2.5266F, 1.5259F, 0.2308F, -0.4333F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(84, 9).addBox(-0.4899F, -0.8193F, -0.3504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.5116F, -0.4478F, -2.5266F, -0.8303F, 0.2308F, -0.4333F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(44, 72).addBox(-0.95F, -0.05F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(44, 72).addBox(-0.95F, -0.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5662F, -1.2934F, -3.0341F, 0.1104F, 0.4018F, 0.0094F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(84, 18).addBox(-0.6519F, -0.8626F, -1.3236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(20, 84).addBox(-0.6519F, -0.1626F, -1.3236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.4767F, -0.447F, -2.6804F, -0.0462F, 0.2924F, -0.4718F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(67, 0).addBox(-0.6047F, -0.7784F, -0.5269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(67, 4).addBox(-0.6047F, -0.0784F, -0.5269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5116F, -0.4478F, -2.5266F, -0.0519F, 0.2285F, -0.4468F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(78, 70).addBox(-0.5F, -0.5718F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F))
				.texOffs(71, 78).addBox(-0.5F, -0.0718F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.35F, 1.7704F, -6.4028F, 2.3387F, -0.4363F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(10, 78).addBox(-0.5F, -0.6782F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.625F, 1.9441F, -7.1826F, 2.8187F, -0.2618F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(79, 7).addBox(-0.5F, -0.3219F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.625F, 1.9441F, -7.1826F, 2.3387F, -0.2618F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(88, 64).addBox(-1.0274F, -1.4852F, 0.1639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7212F, 0.6036F, -0.0727F, -0.6496F, -0.0813F, 0.0235F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(61, 73).addBox(-1.0274F, -1.1672F, 0.2045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7212F, 0.6036F, -0.0727F, 0.0485F, -0.0813F, 0.0235F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.775F, 0.1398F, -1.4189F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-0.475F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5658F, 1.2042F, -6.9076F, -3.053F, 0.4708F, -0.1169F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(77, 76).mirror().addBox(-0.7F, -0.225F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.625F, 1.4956F, -7.4408F, 2.7852F, 0.4287F, -0.1535F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.425F, 1.3224F, -6.696F, 1.3634F, -0.3851F, 0.0789F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.125F, -0.15F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0429F, 1.4512F, -6.5611F, 1.5455F, 0.4008F, -0.0902F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(67, 23).mirror().addBox(-0.125F, -0.15F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2306F, 1.7443F, -5.9135F, 1.9839F, 0.4014F, 0.0046F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(59, 80).mirror().addBox(-0.05F, -0.9446F, -0.9359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.3842F, 1.71F, -5.2937F, -0.5166F, -0.0832F, 0.108F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(58, 33).mirror().addBox(0.0353F, -0.2312F, -0.0722F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.8549F, -3.5124F, 0.0873F, -0.2443F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(81, 79).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(0, 82).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.947F, 1.5381F, -2.6685F, -1.4856F, -0.1139F, 0.0115F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(69, 81).mirror().addBox(-0.7F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(30, 81).mirror().addBox(-0.7F, -1.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2597F, 1.6863F, -4.336F, -1.4835F, -0.2443F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.475F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.9692F, 1.6514F, -3.9977F, -1.4825F, -0.2878F, -0.004F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.55F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0781F, 1.6775F, -4.2771F, -1.4856F, -0.1139F, 0.0115F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1251F, 1.7277F, -4.9319F, -1.4856F, -0.1139F, 0.0115F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-0.5F, -1.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 81).mirror().addBox(-0.5F, -0.8F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 81).mirror().addBox(-0.5F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 80).mirror().addBox(-0.5F, 0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.398F, 1.7241F, -4.1089F, -1.4835F, -0.2443F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(0.0F, 0.9554F, -0.9359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 1.6271F, -3.4519F, -1.5272F, -0.2443F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(0.0F, 0.025F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 0.143F, -3.5254F, 0.3727F, -0.2473F, -0.0907F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-0.5F, -0.55F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.2114F, 1.1732F, -3.6509F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(74, 82).mirror().addBox(0.0F, -0.9962F, -0.9628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 1.6271F, -3.4519F, 0.0873F, -0.2443F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(0.0353F, -0.6869F, -0.0785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.8549F, -3.5124F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.475F, -0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1434F, -0.6612F, -1.4214F, 0.095F, -0.1407F, 1.1374F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(72, 74).mirror().addBox(-0.0108F, -1.3763F, 0.9564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(38, 64).mirror().addBox(-0.0108F, -1.3763F, -0.0436F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8549F, -1.8123F, 0.0087F, -0.096F, 0.0005F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(33, 73).mirror().addBox(0.017F, -0.4461F, 0.3081F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(35, 82).mirror().addBox(0.017F, 0.5539F, 0.1331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7212F, 0.6036F, -0.0727F, -0.0387F, 0.09F, -0.0235F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(82, 34).mirror().addBox(0.0311F, 0.319F, -0.8234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7212F, 0.6036F, -0.0727F, 0.6133F, 0.0329F, -0.0638F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.625F, -0.4F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(89, 46).mirror().addBox(-0.625F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.617F, -0.5272F, 1.1002F, -1.0242F, -1.1537F, 1.0379F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(82, 88).mirror().addBox(0.0274F, -0.0568F, 0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(72, 88).mirror().addBox(0.0274F, -0.0568F, 0.0656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7616F, -1.0236F, -0.0982F, -0.0125F, 0.0813F, -0.0235F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(17, 67).mirror().addBox(-0.0164F, -1.6753F, 0.0327F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8549F, -1.8123F, 0.1302F, -0.1051F, 0.0057F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(0.0274F, -1.8463F, -1.3896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7212F, 0.6036F, -0.0727F, -1.5223F, 0.0813F, -0.0235F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-0.5F, -1.05F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(78, 40).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.1F, 1.6828F, -7.5633F, 2.906F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(1.1F, 1.653F, -7.2445F, 2.426F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.5F, -0.8999F, -0.341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.35F, 1.7704F, -6.4028F, 2.8187F, 0.4363F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(58, 23).mirror().addBox(0.0F, -0.1511F, -2.1108F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.9F, -0.3979F, -4.9519F, 0.5684F, -0.3567F, 0.4606F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(84, 21).mirror().addBox(-0.2F, -0.4761F, -0.6108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.3979F, -4.9519F, 0.5684F, -0.3567F, 0.4606F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.2F, -0.3761F, -0.6858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8616F, -0.2811F, -5.2393F, 1.0483F, -0.3567F, 0.4606F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.2F, -0.3511F, -0.6358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(84, 46).mirror().addBox(-0.2F, -0.3511F, -0.8359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.77F, 0.0604F, -5.4263F, 1.5807F, -0.3567F, 0.4606F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(-0.2F, -0.2761F, -0.8858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(84, 52).mirror().addBox(-0.2F, -0.2761F, -0.6858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.77F, 0.0604F, -5.4263F, 1.9035F, -0.3567F, 0.4606F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(0.0F, -0.4608F, 0.7552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(0.9F, -0.3979F, -4.9519F, 0.1757F, -0.3567F, 0.4606F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(48, 59).mirror().addBox(-0.5F, -0.55F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(0.79F, 0.4337F, -4.2476F, 0.132F, -0.3567F, 0.4606F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(27, 59).mirror().addBox(0.0F, 0.0F, 0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.525F, -1.3327F, -3.1017F, 0.0331F, -0.1749F, 0.0071F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-0.5101F, -0.2237F, -0.2311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(10, 84).mirror().addBox(-0.5101F, -0.2237F, -0.9311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.5116F, -0.4478F, -2.5266F, -0.0885F, -0.2308F, 0.4333F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-0.4626F, -0.844F, -1.0575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.4767F, -0.447F, -2.6804F, 0.5813F, -0.2951F, 0.4581F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-0.4626F, -1.2039F, -0.5356F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4767F, -0.447F, -2.6804F, 1.1049F, -0.2951F, 0.4581F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(50, 88).mirror().addBox(-0.5101F, -0.9797F, -0.2165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(88, 58).mirror().addBox(-0.5101F, -0.5797F, -0.2165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5116F, -0.4478F, -2.5266F, 1.5259F, -0.2308F, 0.4333F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(84, 9).mirror().addBox(-0.5101F, -0.8193F, -0.3504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.5116F, -0.4478F, -2.5266F, -0.8303F, -0.2308F, 0.4333F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(-0.05F, -0.05F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(44, 72).mirror().addBox(-0.05F, -0.05F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5662F, -1.2934F, -3.0341F, 0.1104F, -0.4018F, -0.0094F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(84, 18).mirror().addBox(-0.3481F, -0.8626F, -1.3236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(20, 84).mirror().addBox(-0.3481F, -0.1626F, -1.3236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.4767F, -0.447F, -2.6804F, -0.0462F, -0.2924F, 0.4718F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.3953F, -0.7784F, -0.5269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(67, 4).mirror().addBox(-0.3953F, -0.0784F, -0.5269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5116F, -0.4478F, -2.5266F, -0.0519F, -0.2285F, 0.4468F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(78, 70).mirror().addBox(-0.5F, -0.5718F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false)
				.texOffs(71, 78).mirror().addBox(-0.5F, -0.0718F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.35F, 1.7704F, -6.4028F, 2.3387F, 0.4363F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.5F, -0.6782F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.625F, 1.9441F, -7.1826F, 2.8187F, 0.2618F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(79, 7).mirror().addBox(-0.5F, -0.3219F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.625F, 1.9441F, -7.1826F, 2.3387F, 0.2618F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(88, 64).mirror().addBox(0.0274F, -1.4852F, 0.1639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7212F, 0.6036F, -0.0727F, -0.6496F, 0.0813F, -0.0235F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(61, 73).mirror().addBox(0.0274F, -1.1672F, 0.2045F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7212F, 0.6036F, -0.0727F, 0.0485F, 0.0813F, -0.0235F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.312F, -1.4527F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r358 = lowerjaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(88, 39).addBox(0.8624F, -1.6747F, -7.1989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.0262F, -0.1047F, 0.0F));

		PartDefinition cube_r359 = lowerjaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(30, 87).addBox(2.913F, 0.0439F, -6.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.2431F, 0.2168F, -0.0551F));

		PartDefinition cube_r360 = lowerjaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-1.2035F, 1.7309F, -5.0654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(72, 85).mirror().addBox(-1.2035F, 2.2309F, -5.0654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.48F, -0.3491F, 0.0F));

		PartDefinition cube_r361 = lowerjaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(1.0417F, -5.3125F, -6.0759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(79, 10).addBox(2.2673F, -5.3125F, -6.0759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r362 = lowerjaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(1.0417F, -5.9942F, -4.719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(82, 0).addBox(2.2673F, -5.9942F, -4.719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r363 = lowerjaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(45, 88).mirror().addBox(1.7417F, -1.2567F, -7.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 87).mirror().addBox(1.0417F, -1.2567F, -7.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(5, 87).addBox(2.2673F, -1.2567F, -7.0183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r364 = lowerjaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(86, 79).mirror().addBox(-0.1089F, 1.8681F, -6.587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(62, 86).mirror().addBox(-0.1089F, 1.1681F, -6.587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.4102F, -0.1745F, 0.0F));

		PartDefinition cube_r365 = lowerjaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(1.7417F, -0.7673F, -7.7584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(10, 87).mirror().addBox(1.0417F, -0.7673F, -7.7584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(10, 87).addBox(2.2673F, -0.7673F, -7.7584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r366 = lowerjaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(1.0417F, -1.6698F, -7.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 0).addBox(2.2673F, -1.6698F, -7.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r367 = lowerjaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.4392F, 1.4389F, -6.588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.4673F, -0.3213F, 0.0567F));

		PartDefinition cube_r368 = lowerjaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-1.0019F, -1.4156F, -4.8315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.0698F, -0.3927F, 0.0F));

		PartDefinition cube_r369 = lowerjaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-1.0019F, -0.6249F, -5.2203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.1047F, -0.3927F, 0.0F));

		PartDefinition cube_r370 = lowerjaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(77, 87).mirror().addBox(-0.3729F, 0.6274F, -6.111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.3734F, -0.2559F, 0.0323F));

		PartDefinition cube_r371 = lowerjaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(1.6973F, -1.9338F, -7.1184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.0258F, 0.0436F, 0.0057F));

		PartDefinition cube_r372 = lowerjaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(0.0911F, -0.1366F, -6.9856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.2356F, -0.1745F, 0.0F));

		PartDefinition cube_r373 = lowerjaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-0.4565F, 1.2348F, -5.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.4375F, -0.3132F, 0.0841F));

		PartDefinition cube_r374 = lowerjaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(-1.2035F, 1.1822F, -5.9195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(88, 61).mirror().addBox(-0.6285F, 1.8822F, -5.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(85, 85).mirror().addBox(-1.2035F, 1.8822F, -5.9195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.4102F, -0.3491F, 0.0F));

		PartDefinition cube_r375 = lowerjaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(87, 33).mirror().addBox(-1.2035F, 0.8621F, -5.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.3491F, -0.3491F, 0.0F));

		PartDefinition cube_r376 = lowerjaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-3.2631F, 1.6002F, -3.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(87, 88).mirror().addBox(-3.2631F, 0.9252F, -3.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.6739F, -0.9968F, 0.5187F));

		PartDefinition cube_r377 = lowerjaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(87, 49).mirror().addBox(-0.5385F, 1.6252F, -4.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 36).mirror().addBox(-0.5385F, 0.9252F, -4.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(85, 55).mirror().addBox(-0.5385F, 0.9252F, -5.4702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.3664F, -0.3307F, 0.052F));

		PartDefinition cube_r378 = lowerjaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(67, 87).mirror().addBox(-0.5385F, 2.0253F, -5.2411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.4537F, -0.3307F, 0.052F));

		PartDefinition cube_r379 = lowerjaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(85, 43).mirror().addBox(-1.2035F, 1.4069F, -4.564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.4363F, -0.3491F, 0.0F));

		PartDefinition cube_r380 = lowerjaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(40, 85).mirror().addBox(-1.2035F, 3.9644F, -0.6618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -1.597F, -0.3491F, 0.0F));

		PartDefinition cube_r381 = lowerjaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(85, 30).mirror().addBox(-0.4355F, 3.0301F, -2.2616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -1.2043F, -0.1745F, 0.0F));

		PartDefinition cube_r382 = lowerjaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.4355F, -0.1518F, -3.9095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(0, 75).mirror().addBox(-0.4355F, -0.1518F, -3.4095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.4189F, -0.1745F, 0.0F));

		PartDefinition cube_r383 = lowerjaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(41, 59).mirror().addBox(-0.4355F, 1.2276F, -2.323F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.9861F, -0.1745F, 0.0F));

		PartDefinition cube_r384 = lowerjaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(78, 64).mirror().addBox(-0.5F, -0.8999F, -0.341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3105F, -1.5468F, -6.3517F, 2.5927F, -0.1092F, 3.0858F));

		PartDefinition cube_r385 = lowerjaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(-0.5F, -0.5718F, -0.4564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.3105F, -1.5468F, -6.3517F, 2.1128F, -0.1092F, 3.0858F));

		PartDefinition cube_r386 = lowerjaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, -0.3218F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.8992F, -1.5755F, -6.3844F, 2.1632F, -0.3313F, 2.9446F));

		PartDefinition cube_r387 = lowerjaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.5F, -0.6782F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8992F, -1.5755F, -6.3844F, 2.6431F, -0.3313F, 2.9446F));

		PartDefinition cube_r388 = lowerjaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-0.1955F, 1.0908F, -1.6557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.7418F, -0.0524F, 0.0F));

		PartDefinition cube_r389 = lowerjaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(-0.1955F, 1.0193F, -0.7036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.3491F, -0.0524F, 0.0F));

		PartDefinition cube_r390 = lowerjaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-1.2035F, 2.4087F, -4.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.5236F, -0.3491F, 0.0F));

		PartDefinition cube_r391 = lowerjaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-0.4355F, 0.9702F, -4.1458F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, -0.3927F, -0.1745F, 0.0F));

		PartDefinition cube_r392 = lowerjaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(85, 27).mirror().addBox(-0.1955F, 0.0112F, -2.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(10, 67).mirror().addBox(-0.1955F, 0.7112F, -2.8548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.2182F, -0.0524F, 0.0F));

		PartDefinition cube_r393 = lowerjaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(-0.1955F, 0.9949F, -1.3351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.1545F, -0.2449F, 1.4601F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r394 = lowerjaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(79, 13).mirror().addBox(-2.2532F, -5.3725F, -6.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, 0.5934F, 0.0524F, 0.0F));

		PartDefinition cube_r395 = lowerjaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-1.8624F, -6.1367F, -4.843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, 0.8552F, 0.1047F, 0.0F));

		PartDefinition cube_r396 = lowerjaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(88, 39).mirror().addBox(-1.8624F, -1.6747F, -7.1989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, 0.0262F, 0.1047F, 0.0F));

		PartDefinition cube_r397 = lowerjaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-3.913F, 0.0439F, -6.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.2431F, -0.2168F, 0.0551F));

		PartDefinition cube_r398 = lowerjaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(85, 82).addBox(0.2035F, 1.7309F, -5.0654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(72, 85).addBox(0.2035F, 2.2309F, -5.0654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.48F, 0.3491F, 0.0F));

		PartDefinition cube_r399 = lowerjaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(87, 71).addBox(-0.5608F, 1.0469F, -6.893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.2928F, 0.3213F, -0.0567F));

		PartDefinition cube_r400 = lowerjaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(86, 79).addBox(-0.8911F, 1.8681F, -6.587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(62, 86).addBox(-0.8911F, 1.1681F, -6.587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.4102F, 0.1745F, 0.0F));

		PartDefinition cube_r401 = lowerjaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5608F, 1.4389F, -6.588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.4673F, 0.3213F, -0.0567F));

		PartDefinition cube_r402 = lowerjaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(15, 88).addBox(0.0019F, -1.4156F, -4.8315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, 0.0698F, 0.3927F, 0.0F));

		PartDefinition cube_r403 = lowerjaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 88).addBox(0.0019F, -0.6249F, -5.2203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.1047F, 0.3927F, 0.0F));

		PartDefinition cube_r404 = lowerjaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(77, 87).addBox(-0.6271F, 0.6274F, -6.111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.3734F, 0.2559F, -0.0323F));

		PartDefinition cube_r405 = lowerjaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(35, 88).addBox(-2.6973F, -1.9338F, -7.1184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, 0.0258F, -0.0436F, -0.0057F));

		PartDefinition cube_r406 = lowerjaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(87, 74).addBox(-1.0911F, -0.1366F, -6.9856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.2356F, 0.1745F, 0.0F));

		PartDefinition cube_r407 = lowerjaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5435F, 1.2348F, -5.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.4375F, 0.3132F, -0.0841F));

		PartDefinition cube_r408 = lowerjaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(57, 86).addBox(0.2035F, 1.1822F, -5.9195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(88, 61).addBox(-0.3715F, 1.8822F, -5.9695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(85, 85).addBox(0.2035F, 1.8822F, -5.9195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.4102F, 0.3491F, 0.0F));

		PartDefinition cube_r409 = lowerjaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(87, 33).addBox(0.2035F, 0.8621F, -5.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.3491F, 0.3491F, 0.0F));

		PartDefinition cube_r410 = lowerjaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(89, 3).addBox(2.2631F, 1.6002F, -3.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(87, 88).addBox(2.2631F, 0.9252F, -3.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.6739F, 0.9968F, -0.5187F));

		PartDefinition cube_r411 = lowerjaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(87, 49).addBox(-0.4615F, 1.6252F, -4.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(87, 36).addBox(-0.4615F, 0.9252F, -4.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(85, 55).addBox(-0.4615F, 0.9252F, -5.4702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.3664F, 0.3307F, -0.052F));

		PartDefinition cube_r412 = lowerjaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(67, 87).addBox(-0.4615F, 2.0253F, -5.2411F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.4537F, 0.3307F, -0.052F));

		PartDefinition cube_r413 = lowerjaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(85, 43).addBox(0.2035F, 1.4069F, -4.564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.4363F, 0.3491F, 0.0F));

		PartDefinition cube_r414 = lowerjaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(40, 85).addBox(0.2035F, 3.9644F, -0.6618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -1.597F, 0.3491F, 0.0F));

		PartDefinition cube_r415 = lowerjaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(85, 30).addBox(-0.5645F, 3.0301F, -2.2616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -1.2043F, 0.1745F, 0.0F));

		PartDefinition cube_r416 = lowerjaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(15, 75).addBox(-0.5645F, -0.1518F, -3.9095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(0, 75).addBox(-0.5645F, -0.1518F, -3.4095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.4189F, 0.1745F, 0.0F));

		PartDefinition cube_r417 = lowerjaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(41, 59).addBox(-0.5645F, 1.2276F, -2.323F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.9861F, 0.1745F, 0.0F));

		PartDefinition cube_r418 = lowerjaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(78, 64).addBox(-0.5F, -0.8999F, -0.341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3105F, -1.5468F, -6.3517F, 2.5927F, 0.1092F, -3.0858F));

		PartDefinition cube_r419 = lowerjaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(15, 71).addBox(-0.5F, -0.5718F, -0.4564F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.3105F, -1.5468F, -6.3517F, 2.1128F, 0.1092F, -3.0858F));

		PartDefinition cube_r420 = lowerjaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -0.3218F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.8992F, -1.5755F, -6.3844F, 2.1632F, 0.3313F, -2.9446F));

		PartDefinition cube_r421 = lowerjaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(77, 37).addBox(-0.5F, -0.6782F, -0.4564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8992F, -1.5755F, -6.3844F, 2.6431F, 0.3313F, -2.9446F));

		PartDefinition cube_r422 = lowerjaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(67, 12).addBox(-0.8045F, 1.0908F, -1.6557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.7418F, 0.0524F, 0.0F));

		PartDefinition cube_r423 = lowerjaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(85, 24).addBox(-0.8045F, 1.0193F, -0.7036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.3491F, 0.0524F, 0.0F));

		PartDefinition cube_r424 = lowerjaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(35, 85).addBox(0.2035F, 2.4087F, -4.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.5236F, 0.3491F, 0.0F));

		PartDefinition cube_r425 = lowerjaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(9, 52).addBox(-0.5645F, 0.9702F, -4.1458F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, -0.3927F, 0.1745F, 0.0F));

		PartDefinition cube_r426 = lowerjaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(85, 27).addBox(-0.8045F, 0.0112F, -2.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(10, 67).addBox(-0.8045F, 0.7112F, -2.8548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, 0.2182F, 0.0524F, 0.0F));

		PartDefinition cube_r427 = lowerjaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(62, 58).addBox(-0.8045F, 0.9949F, -1.3351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.1545F, -0.2449F, 1.4601F, 0.0F, 0.0524F, 0.0F));

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