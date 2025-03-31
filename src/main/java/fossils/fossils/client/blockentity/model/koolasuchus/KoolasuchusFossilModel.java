package fossils.fossils.client.blockentity.model.koolasuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KoolasuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart front;
	private final ModelPart front2;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart forelegL5;
	private final ModelPart forelegL6;
	private final ModelPart neck;
	private final ModelPart wholehead;
	private final ModelPart headbase;
	private final ModelPart headdonotmove;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public KoolasuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.hindlegL = this.body.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL4 = this.body.getChild("hindlegL4");
		this.hindlegL5 = this.hindlegL4.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.front = this.body.getChild("front");
		this.front2 = this.front.getChild("front2");
		this.forelegL = this.front2.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.forelegL2.getChild("forelegL3");
		this.forelegL4 = this.front2.getChild("forelegL4");
		this.forelegL5 = this.forelegL4.getChild("forelegL5");
		this.forelegL6 = this.forelegL5.getChild("forelegL6");
		this.neck = this.front2.getChild("neck");
		this.wholehead = this.neck.getChild("wholehead");
		this.headbase = this.wholehead.getChild("headbase");
		this.headdonotmove = this.headbase.getChild("headdonotmove");
		this.leftFace = this.headdonotmove.getChild("leftFace");
		this.rightFace = this.headdonotmove.getChild("rightFace");
		this.jaw = this.wholehead.getChild("jaw");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.9F, 16.0F, -0.3043F, -0.0262F, -0.0832F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, 0.15F, 2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 79).addBox(0.0F, 0.15F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 56).addBox(-0.5F, 1.15F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.5F, 0.8689F, -1.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(77, 9).mirror().addBox(-0.5F, 0.0689F, -0.3837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -2.4896F, 1.6925F, -0.1745F, 0.0F, -0.3142F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-0.2F, -0.8152F, -0.8371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -1.4896F, 1.6925F, -0.4363F, 0.0F, -0.3142F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-0.5F, -0.589F, -0.5981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -2.4896F, 1.6925F, -0.0873F, 0.0F, -0.3142F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-0.8F, -0.85F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0894F, -0.1973F, -0.9169F, -0.3384F, -0.8262F, 0.2532F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 25).mirror().addBox(-2.4F, 5.15F, -2.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 25).addBox(0.8F, 5.15F, -2.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -6.0F, 1.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 66).mirror().addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0398F, -0.1732F, 2.891F, -0.1186F, -0.8708F, 0.4412F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-1.5F, 5.15F, 0.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 5).addBox(0.7F, 5.15F, 0.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -6.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 79).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.0278F, 4.139F, 0.083F, 0.6361F, -0.1837F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 79).mirror().addBox(-1.7593F, -0.4313F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.0278F, 4.139F, -0.2776F, 0.6124F, -0.7885F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(33, 79).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.2278F, 2.139F, 0.083F, 0.6361F, -0.1837F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.2278F, 2.139F, -0.2776F, 0.6124F, -0.7885F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.5278F, 0.139F, 0.083F, 0.6361F, -0.1837F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.5278F, 0.139F, -0.2776F, 0.6124F, -0.7885F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.7278F, -1.661F, 0.1062F, 0.4834F, -0.1862F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 73).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.7278F, -1.661F, -0.1509F, 0.4979F, -0.7216F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(77, 55).mirror().addBox(-3.5823F, -1.0635F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.7278F, -1.661F, -0.2695F, 0.4484F, -0.9806F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.9278F, -3.561F, 0.1286F, 0.3718F, -0.1768F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.9278F, -3.561F, -0.0693F, 0.4113F, -0.6857F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(-3.5823F, -1.0635F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -3.9278F, -3.561F, -0.1679F, 0.3833F, -0.9395F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(18, 66).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0398F, -0.1732F, 2.891F, -0.1186F, 0.8708F, -0.4412F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 65).addBox(-1.2F, -0.85F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0894F, -0.1973F, -0.9169F, -0.3384F, 0.8262F, -0.2532F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, 0.8689F, -1.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(77, 9).addBox(-0.5F, 0.0689F, -0.3837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -2.4896F, 1.6925F, -0.1745F, 0.0F, 0.3142F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(77, 6).addBox(-0.8F, -0.8152F, -0.8371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8F, -1.4896F, 1.6925F, -0.4363F, 0.0F, 0.3142F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(70, 16).addBox(-0.5F, -0.589F, -0.5981F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8F, -2.4896F, 1.6925F, -0.0873F, 0.0F, 0.3142F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 79).addBox(-0.5F, 0.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 79).addBox(-0.5F, 0.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 79).addBox(-0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(-1.0F, 1.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -6.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 79).addBox(0.7593F, -0.4313F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.0278F, 4.139F, -0.2776F, -0.6124F, 0.7885F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(43, 79).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.0278F, 4.139F, 0.083F, -0.6361F, 0.1837F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(76, 44).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.2278F, 2.139F, -0.2776F, -0.6124F, 0.7885F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(33, 79).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.2278F, 2.139F, 0.083F, -0.6361F, 0.1837F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 42).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.5278F, 0.139F, -0.2776F, -0.6124F, 0.7885F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 78).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.5278F, 0.139F, 0.083F, -0.6361F, 0.1837F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(77, 55).addBox(2.5823F, -1.0635F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.7278F, -1.661F, -0.2695F, -0.4484F, 0.9806F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(74, 73).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.7278F, -1.661F, -0.1509F, -0.4979F, 0.7216F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(10, 78).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.7278F, -1.661F, 0.1062F, -0.4834F, 0.1862F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 78).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.9278F, -3.561F, 0.1286F, -0.3718F, 0.1768F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(74, 66).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.9278F, -3.561F, -0.0693F, -0.4113F, 0.6857F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(53, 77).addBox(2.5823F, -1.0635F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -3.9278F, -3.561F, -0.1679F, -0.3833F, 0.9395F));

		PartDefinition hindlegL = body.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.736F, -1.3F, 1.6918F, 0.5169F, -0.7135F, 1.0664F));

		PartDefinition cube_r39 = hindlegL.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(70, 4).addBox(3.0F, -0.4F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 70).addBox(-1.0F, -0.4F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 66).addBox(0.0F, -0.4F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.0334F, 0.0013F, -0.0806F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(23, 17).addBox(-0.25F, -1.0F, 0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 22).addBox(-0.25F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.25F, 0.0F, 0.0F, 0.1381F, 0.1855F, 1.3171F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(32, 39).addBox(-0.5F, -1.0F, -1.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9152F, -0.3068F, 0.7339F, 0.2182F, 0.3491F, -1.2654F));

		PartDefinition hindlegL4 = body.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.736F, -1.3F, 1.6918F, 1.2052F, 0.7948F, 0.0402F));

		PartDefinition cube_r40 = hindlegL4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(70, 12).addBox(-4.0F, -0.4F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 8).addBox(0.0F, -0.4F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 67).addBox(-3.0F, -0.4F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.0334F, -0.0013F, 0.0806F));

		PartDefinition hindlegL5 = hindlegL4.addOrReplaceChild("hindlegL5", CubeListBuilder.create().texOffs(66, 29).addBox(-2.75F, -1.0F, 0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 32).addBox(-2.75F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.25F, 0.0F, 0.0F, 0.1381F, -0.1855F, -1.3171F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create().texOffs(0, 40).addBox(-3.5F, -1.0F, -1.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9152F, -0.3068F, 0.7339F, 0.2182F, -0.3491F, 1.2654F));

		PartDefinition front = body.addOrReplaceChild("front", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -4.2F, 0.0078F, 0.218F, 0.0446F));

		PartDefinition cube_r41 = front.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(77, 23).addBox(-0.5F, -1.35F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4049F, -1.7644F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r42 = front.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(24, 77).addBox(-0.5F, -1.45F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 31).addBox(-0.5F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7266F, -5.8518F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r43 = front.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2278F, -3.361F, 0.1523F, 0.2428F, -0.1696F));

		PartDefinition cube_r44 = front.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(73, 69).mirror().addBox(-4.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2278F, -3.361F, -0.0573F, 0.304F, -0.9022F));

		PartDefinition cube_r45 = front.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2278F, -3.361F, 0.0176F, 0.3087F, -0.6551F));

		PartDefinition cube_r46 = front.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2278F, -1.361F, 0.1399F, 0.3116F, -0.173F));

		PartDefinition cube_r47 = front.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2278F, -1.361F, -0.0279F, 0.3637F, -0.6701F));

		PartDefinition cube_r48 = front.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(67, 73).mirror().addBox(-4.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2278F, -1.361F, -0.1155F, 0.3468F, -0.9208F));

		PartDefinition cube_r49 = front.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(77, 61).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3278F, -5.261F, 0.1431F, 0.2944F, -0.1721F));

		PartDefinition cube_r50 = front.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3278F, -5.261F, -0.0163F, 0.35F, -0.666F));

		PartDefinition cube_r51 = front.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-4.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3278F, -5.261F, -0.1008F, 0.3362F, -0.9159F));

		PartDefinition cube_r52 = front.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 59).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.5278F, -7.261F, 0.127F, 0.3804F, -0.1774F));

		PartDefinition cube_r53 = front.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.5278F, -7.261F, -0.0753F, 0.4181F, -0.6882F));

		PartDefinition cube_r54 = front.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(-4.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.5278F, -7.261F, -0.1755F, 0.3884F, -0.9424F));

		PartDefinition cube_r55 = front.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(73, 71).mirror().addBox(-4.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.5278F, -9.261F, -0.1755F, 0.3884F, -0.9424F));

		PartDefinition cube_r56 = front.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.5278F, -9.261F, -0.0753F, 0.4181F, -0.6882F));

		PartDefinition cube_r57 = front.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.5278F, -9.261F, 0.127F, 0.3804F, -0.1774F));

		PartDefinition cube_r58 = front.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(74, 64).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2278F, -3.361F, 0.0176F, -0.3087F, 0.6551F));

		PartDefinition cube_r59 = front.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(73, 69).addBox(2.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2278F, -3.361F, -0.0573F, -0.304F, 0.9022F));

		PartDefinition cube_r60 = front.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 78).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2278F, -3.361F, 0.1523F, -0.2428F, 0.1696F));

		PartDefinition cube_r61 = front.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(67, 73).addBox(2.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2278F, -1.361F, -0.1155F, -0.3468F, 0.9208F));

		PartDefinition cube_r62 = front.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(14, 74).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2278F, -1.361F, -0.0279F, -0.3637F, 0.6701F));

		PartDefinition cube_r63 = front.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(75, 77).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2278F, -1.361F, 0.1399F, -0.3116F, 0.173F));

		PartDefinition cube_r64 = front.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(60, 73).addBox(2.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3278F, -5.261F, -0.1008F, -0.3362F, 0.9159F));

		PartDefinition cube_r65 = front.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(7, 74).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3278F, -5.261F, -0.0163F, -0.35F, 0.666F));

		PartDefinition cube_r66 = front.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(77, 61).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3278F, -5.261F, 0.1431F, -0.2944F, 0.1721F));

		PartDefinition cube_r67 = front.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(14, 76).addBox(2.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.5278F, -7.261F, -0.1755F, -0.3884F, 0.9424F));

		PartDefinition cube_r68 = front.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 74).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.5278F, -7.261F, -0.0753F, -0.4181F, 0.6882F));

		PartDefinition cube_r69 = front.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(77, 59).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.5278F, -7.261F, 0.127F, -0.3804F, 0.1774F));

		PartDefinition cube_r70 = front.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(73, 71).addBox(2.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.5278F, -9.261F, -0.1755F, -0.3884F, 0.9424F));

		PartDefinition cube_r71 = front.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(7, 76).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.5278F, -9.261F, -0.0753F, -0.4181F, 0.6882F));

		PartDefinition cube_r72 = front.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(43, 77).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.5278F, -9.261F, 0.127F, -0.3804F, 0.1774F));

		PartDefinition cube_r73 = front.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(21, 77).addBox(-0.5F, -0.35F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 19).addBox(-0.5F, -0.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-1.0F, 1.05F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, -9.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition front2 = front.addOrReplaceChild("front2", CubeListBuilder.create().texOffs(21, 30).addBox(-0.5F, -0.6F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(18, 63).addBox(0.0F, -1.6F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 35).addBox(0.0F, -1.8F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 15).addBox(0.0F, -1.9F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 17).addBox(-3.5F, 3.5F, -7.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 63).addBox(-1.0F, 3.5F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 69).addBox(-0.5F, 3.5F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 17).addBox(-1.0F, 3.5F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 63).addBox(-1.0F, 3.5F, -9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -9.8F, 0.0474F, 0.0872F, 0.0438F));

		PartDefinition cube_r74 = front2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(31, 62).mirror().addBox(0.4F, 0.3F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(31, 62).addBox(6.2933F, 0.3F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.8467F, -0.4698F, -2.7227F, -0.0977F, 0.0F, 0.0F));

		PartDefinition cube_r75 = front2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 2.1102F, -3.9258F, -0.4293F, 0.0807F, 0.1744F));

		PartDefinition cube_r76 = front2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(0.0F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 1.8559F, -4.7102F, -0.5516F, -0.0921F, -0.1484F));

		PartDefinition cube_r77 = front2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(55, 29).mirror().addBox(0.1F, -2.0F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6498F, 5.5F, -4.7854F, 0.0F, 0.2967F, 0.0F));

		PartDefinition cube_r78 = front2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(55, 35).mirror().addBox(-1.6F, -2.0F, -0.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 5.5F, -7.0F, 0.0F, 0.5847F, 0.0F));

		PartDefinition cube_r79 = front2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 73).mirror().addBox(-4.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -1.461F, -0.2776F, 0.4532F, -0.9841F));

		PartDefinition cube_r80 = front2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -1.461F, -0.1575F, 0.5044F, -0.7248F));

		PartDefinition cube_r81 = front2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -1.461F, 0.1043F, 0.4919F, -0.187F));

		PartDefinition cube_r82 = front2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(-4.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -3.461F, -0.3604F, 0.5002F, -1.0222F));

		PartDefinition cube_r83 = front2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(72, 75).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -3.461F, -0.2261F, 0.5688F, -0.7599F));

		PartDefinition cube_r84 = front2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -3.461F, 0.085F, 0.5776F, -0.1969F));

		PartDefinition cube_r85 = front2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(-3.5823F, -1.0635F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -5.461F, -0.4402F, 0.5537F, -0.9314F));

		PartDefinition cube_r86 = front2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 75).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -5.461F, -0.29F, 0.6384F, -0.6653F));

		PartDefinition cube_r87 = front2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(33, 77).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, -0.1278F, -5.461F, 0.0777F, 0.6647F, -0.0702F));

		PartDefinition cube_r88 = front2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(55, 35).addBox(-2.4F, -2.0F, -0.8F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5F, 5.5F, -7.0F, 0.0F, -0.5847F, 0.0F));

		PartDefinition cube_r89 = front2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(55, 29).addBox(-1.1F, -2.0F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6498F, 5.5F, -4.7854F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r90 = front2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(33, 72).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.4F, 2.1102F, -3.9258F, -0.4293F, -0.0807F, -0.1744F));

		PartDefinition cube_r91 = front2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 71).addBox(-1.0F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 1.8559F, -4.7102F, -0.5516F, 0.0921F, 0.1484F));

		PartDefinition cube_r92 = front2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 36).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -1.461F, 0.1043F, -0.4919F, 0.187F));

		PartDefinition cube_r93 = front2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 76).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -1.461F, -0.1575F, -0.5044F, 0.7248F));

		PartDefinition cube_r94 = front2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(48, 73).addBox(2.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -1.461F, -0.2776F, -0.4532F, 0.9841F));

		PartDefinition cube_r95 = front2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(77, 34).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -3.461F, 0.085F, -0.5776F, 0.1969F));

		PartDefinition cube_r96 = front2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 75).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -3.461F, -0.2261F, -0.5688F, 0.7599F));

		PartDefinition cube_r97 = front2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(70, 20).addBox(2.5823F, -1.0635F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -3.461F, -0.3604F, -0.5002F, 1.0222F));

		PartDefinition cube_r98 = front2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(33, 77).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -5.461F, 0.0777F, -0.6647F, 0.0702F));

		PartDefinition cube_r99 = front2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 75).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -5.461F, -0.29F, -0.6384F, 0.6653F));

		PartDefinition cube_r100 = front2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(77, 57).addBox(2.5823F, -1.0635F, -0.5213F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, -0.1278F, -5.461F, -0.4402F, -0.5537F, 0.9314F));

		PartDefinition forelegL = front2.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(60, 44).addBox(3.0F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(47, 66).addBox(0.0F, -0.15F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.7739F, 2.2054F, -3.7736F, 0.0F, -0.7854F, 0.2618F));

		PartDefinition cube_r101 = forelegL.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.35F, 0.0F, 0.0F, 0.4887F, 0.0F));

		PartDefinition cube_r102 = forelegL.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(59, 69).addBox(0.0F, -0.15F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -1.5F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r103 = forelegL.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(66, 69).addBox(0.0F, -0.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 1.5F, 0.0F, 0.5236F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create().texOffs(68, 22).addBox(-0.25F, -1.3F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 25).addBox(-0.25F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(68, 35).addBox(-0.65F, -0.1F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(27, 68).addBox(-0.65F, -0.1F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.8067F, 0.6634F, -0.25F, 0.0F, -0.0436F, 0.8727F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(13, 47).addBox(-0.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9247F, 0.1297F, 0.2784F, 1.5996F, 0.4781F, 0.1976F));

		PartDefinition forelegL4 = front2.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(59, 60).addBox(-4.0F, -0.15F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(0, 67).addBox(-3.0F, -0.15F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.7739F, 2.2054F, -3.7736F, 0.0F, -0.0436F, -0.2618F));

		PartDefinition cube_r104 = forelegL4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(77, 3).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.35F, 0.0F, 0.0F, -0.4887F, 0.0F));

		PartDefinition cube_r105 = forelegL4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, -0.15F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -1.5F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r106 = forelegL4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -0.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 1.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition forelegL5 = forelegL4.addOrReplaceChild("forelegL5", CubeListBuilder.create().texOffs(68, 55).addBox(-2.75F, -1.3F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 58).addBox(-2.75F, -1.3F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(68, 61).addBox(-2.35F, -0.1F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(36, 69).addBox(-2.35F, -0.1F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.8067F, 0.6634F, -0.25F, -0.115F, -0.8893F, -0.0894F));

		PartDefinition forelegL6 = forelegL5.addOrReplaceChild("forelegL6", CubeListBuilder.create().texOffs(47, 45).addBox(-2.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9247F, 0.1297F, 0.2784F, 1.2602F, 0.0198F, 0.0638F));

		PartDefinition neck = front2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0151F, -6.9553F, 0.0894F, 0.2173F, 0.0193F));

		PartDefinition cube_r107 = neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(26, 47).addBox(0.0F, -7.7F, -8.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 62).addBox(0.0F, -7.7F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 39).addBox(-0.5F, -6.8F, -10.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3F, 4.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(70, 77).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.1278F, -2.361F, 0.0616F, 0.8213F, -0.0812F));

		PartDefinition cube_r109 = neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(75, 28).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.1278F, -2.361F, -0.4234F, 0.7579F, -0.7513F));

		PartDefinition cube_r110 = neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(21, 75).mirror().addBox(-2.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.1278F, -0.361F, -0.346F, 0.6926F, -0.6999F));

		PartDefinition cube_r111 = neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4064F, -0.1278F, -0.361F, 0.0711F, 0.7343F, -0.0745F));

		PartDefinition cube_r112 = neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(70, 77).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4064F, -0.1278F, -2.361F, 0.0616F, -0.8213F, 0.0812F));

		PartDefinition cube_r113 = neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(75, 28).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4064F, -0.1278F, -2.361F, -0.4234F, -0.7579F, 0.7513F));

		PartDefinition cube_r114 = neck.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(65, 77).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4064F, -0.1278F, -0.361F, 0.0711F, -0.7343F, 0.0745F));

		PartDefinition cube_r115 = neck.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(21, 75).addBox(0.7593F, -0.4313F, -0.5213F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4064F, -0.1278F, -0.361F, -0.346F, -0.6926F, 0.6999F));

		PartDefinition wholehead = neck.addOrReplaceChild("wholehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2949F, -4.8217F, 0.1464F, 0.0184F, 0.1356F));

		PartDefinition headbase = wholehead.addOrReplaceChild("headbase", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6F, 0.0F));

		PartDefinition headdonotmove = headbase.addOrReplaceChild("headdonotmove", CubeListBuilder.create().texOffs(40, 21).addBox(-3.5F, -0.975F, 3.55F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 12).addBox(-3.0F, -0.97F, 1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(38, 62).addBox(-1.0F, -0.95F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 71).addBox(-0.5F, -0.475F, 0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -11.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r116 = headdonotmove.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(38, 72).addBox(0.0F, -0.7F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1225F, 1.1661F, 4.0481F, -0.4008F, 0.4568F, -0.0451F));

		PartDefinition cube_r117 = headdonotmove.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 76).addBox(-0.5F, -1.2F, -1.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6947F, 1.3927F, 2.987F, -0.2351F, 0.667F, 0.0402F));

		PartDefinition cube_r118 = headdonotmove.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(21, 20).addBox(0.0F, -0.9F, -8.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1982F, 7.9909F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r119 = headdonotmove.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(40, 25).addBox(-2.5F, 1.9F, 2.95F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 8).addBox(-4.5F, 0.9F, 4.95F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 52).addBox(0.0F, -0.11F, 3.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-3.5F, -0.1F, -0.05F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, 5.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftFace = headdonotmove.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(38, 76).addBox(-0.6368F, 0.1F, -0.1495F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.9368F, -0.975F, 0.1495F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(76, 49).addBox(0.1817F, -0.055F, 0.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(69, 47).addBox(-0.1183F, 0.05F, -0.0074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2531F, 0.0F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(59, 18).addBox(-0.6939F, 0.0F, 0.1325F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8831F, 0.0651F, 2.8846F, -0.2503F, 0.8037F, 0.0144F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(24, 57).addBox(-1.6939F, -1.4F, 2.8325F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1868F, 0.975F, 0.8505F, -0.1745F, 0.7941F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(58, 50).addBox(-2.0183F, 0.05F, -0.0074F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5723F, 0.0F, 1.3391F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(77, 12).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(3.0362F, 0.775F, 4.0271F, 0.0253F, 0.2369F, 0.2515F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(59, 14).addBox(-3.0939F, 0.2F, -0.0675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(4.1106F, 0.4471F, 2.6914F, -0.3514F, 0.5355F, 0.0523F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0939F, 0.0F, -0.0675F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1106F, 0.4471F, 2.6914F, -0.1769F, 0.5355F, 0.0523F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(11, 58).addBox(-1.9901F, -0.1171F, -2.9521F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.1768F, 4.0934F, 10.9031F, -0.5519F, 0.2397F, 0.0246F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(59, 0).addBox(-1.9901F, -0.9171F, 0.0479F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(6.4366F, 4.2545F, 7.8921F, -0.2028F, 0.2397F, 0.0246F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(14, 70).addBox(-1.9901F, 0.1829F, 0.0479F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4373F, 1.94F, 7.6621F, -0.3424F, 0.2397F, 0.0246F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(47, 62).addBox(-1.9901F, -0.9171F, 0.0479F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.519F, 2.7985F, 5.5197F, -0.6096F, 0.4199F, -0.0457F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(46, 6).addBox(-1.9901F, 0.6829F, -0.1521F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(46, 0).addBox(-1.9901F, 0.1829F, -0.1521F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9298F, 0.65F, 4.4212F, -0.3653F, 0.4199F, -0.0457F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(60, 75).addBox(0.2F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 75).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.7685F, 1.537F, 3.6332F, -0.4772F, -1.0093F, 0.6044F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(75, 30).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4611F, 1.0F, 1.7913F, -0.2018F, -0.8008F, 0.2777F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(76, 38).addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8632F, 1.1F, 1.2505F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(59, 10).addBox(0.0F, 0.0F, -1.775F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0632F, -0.025F, 6.8505F, 0.1745F, 0.0F, 0.6109F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(69, 51).addBox(1.1821F, -0.2045F, -0.913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9109F, 0.4058F, 10.8038F, -0.0032F, -0.2784F, 0.2439F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(21, 81).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2668F, 1.125F, 0.805F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(24, 81).addBox(1.7817F, 0.625F, -0.2574F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9368F, 0.0F, -0.2495F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(69, 43).addBox(-0.5106F, -0.2045F, 0.0215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9984F, 0.6486F, 11.6514F, -0.2007F, 0.888F, 0.2119F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(65, 65).addBox(-0.3695F, -0.1045F, -1.578F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8263F, 0.6356F, 11.6978F, 0.17F, 0.8125F, 0.2397F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(42, 12).addBox(-0.2F, -0.8F, -1.55F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9515F, 3.2809F, 9.822F, -0.7447F, 1.2257F, -0.7839F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(32, 45).addBox(-1.0F, 0.0F, -1.775F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.131F, 0.4696F, 8.7019F, 0.0179F, -0.0787F, -0.0756F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(29, 0).addBox(-4.0F, 0.0F, -1.775F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3398F, 2.2693F, 8.8505F, 0.0F, 0.0F, 0.5411F));

		PartDefinition rightFace = headdonotmove.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(38, 76).mirror().addBox(-0.3632F, 0.1F, -0.1495F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(-0.9368F, -0.975F, 0.1495F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-1.1817F, -0.055F, 0.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 47).mirror().addBox(-0.8817F, 0.05F, -0.0074F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2531F, 0.0F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(59, 18).mirror().addBox(-2.3061F, 0.0F, 0.1325F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8831F, 0.0651F, 2.8846F, -0.2503F, -0.8037F, -0.0144F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-2.3061F, -1.4F, 2.8325F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1868F, 0.975F, 0.8505F, -0.1745F, -0.7941F, 0.0F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(58, 50).mirror().addBox(0.0183F, 0.05F, -0.0074F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5723F, 0.0F, 1.3391F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0362F, 0.775F, 4.0271F, 0.0253F, -0.2369F, -0.2515F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(59, 14).mirror().addBox(0.0939F, 0.2F, -0.0675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-4.1106F, 0.4471F, 2.6914F, -0.3514F, -0.5355F, -0.0523F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(0.0939F, 0.0F, -0.0675F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1106F, 0.4471F, 2.6914F, -0.1769F, -0.5355F, -0.0523F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(11, 58).mirror().addBox(-0.0099F, -0.1171F, -2.9521F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.1768F, 4.0934F, 10.9031F, -0.5519F, -0.2397F, -0.0246F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.0099F, -0.9171F, 0.0479F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.4366F, 4.2545F, 7.8921F, -0.2028F, -0.2397F, -0.0246F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-0.0099F, 0.1829F, 0.0479F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4373F, 1.94F, 7.6621F, -0.3424F, -0.2397F, -0.0246F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(47, 62).mirror().addBox(-0.0099F, -0.9171F, 0.0479F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.519F, 2.7985F, 5.5197F, -0.6096F, -0.4199F, 0.0457F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(46, 6).mirror().addBox(-0.0099F, 0.6829F, -0.1521F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(46, 0).mirror().addBox(-0.0099F, 0.1829F, -0.1521F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9298F, 0.65F, 4.4212F, -0.3653F, -0.4199F, 0.0457F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-1.2F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 75).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.7685F, 1.537F, 3.6332F, -0.4772F, 1.0093F, -0.6044F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(75, 30).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4611F, 1.0F, 1.7913F, -0.2018F, 0.8008F, -0.2777F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(76, 38).mirror().addBox(-0.5F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8632F, 1.1F, 1.2505F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-3.0F, 0.0F, -1.775F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0632F, -0.025F, 6.8505F, 0.1745F, 0.0F, -0.6109F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-2.1821F, -0.2045F, -0.913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9109F, 0.4058F, 10.8038F, -0.0032F, 0.2784F, -0.2439F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 81).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2668F, 1.125F, 0.805F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(24, 81).mirror().addBox(-2.7817F, 0.625F, -0.2574F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9368F, 0.0F, -0.2495F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-0.4894F, -0.2045F, 0.0215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9984F, 0.6486F, 11.6514F, -0.2007F, -0.888F, -0.2119F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-1.6305F, -0.1045F, -1.578F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8263F, 0.6356F, 11.6978F, 0.17F, -0.8125F, -0.2397F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(42, 12).mirror().addBox(-5.8F, -0.8F, -1.55F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9515F, 3.2809F, 9.822F, -0.7447F, -1.2257F, 0.7839F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(32, 45).mirror().addBox(-2.0F, 0.0F, -1.775F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.131F, 0.4696F, 8.7019F, 0.0179F, 0.0787F, 0.0756F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(0.0F, 0.0F, -1.775F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3398F, 2.2693F, 8.8505F, 0.0F, 0.0F, -0.5411F));

		PartDefinition jaw = wholehead.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.5F, 0.35F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.2F, -0.65F, 2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2F, -10.425F, -0.2531F, -0.7854F, 0.2182F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(37, 51).mirror().addBox(0.3F, -0.475F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -11.35F, -0.2618F, -0.9599F, 0.1745F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(59, 55).mirror().addBox(0.4F, -0.475F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -11.35F, -0.1047F, -1.0908F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4538F, -0.05F, -6.4777F, -0.1222F, -0.3054F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(69, 38).mirror().addBox(0.2F, -0.3F, -1.6F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2069F, -0.45F, -8.2749F, -0.2856F, -0.7033F, 0.2986F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(43, 73).mirror().addBox(0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.077F, -0.425F, -9.9989F, -0.3301F, -0.9882F, 0.2872F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(48, 56).mirror().addBox(-0.2F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8781F, 0.1175F, -9.4696F, -0.0686F, -0.768F, -0.0017F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-0.9677F, -2.0615F, 2.5602F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.395F, 1.0907F, -4.1542F, -0.1571F, 0.0524F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(47, 50).mirror().addBox(0.8264F, -0.6115F, 2.6915F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.395F, 1.0907F, -4.1542F, 0.0535F, -0.2091F, -0.0138F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(26, 51).mirror().addBox(-0.9677F, -0.6115F, 2.9362F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-6.395F, 1.0907F, -4.1542F, 0.0524F, 0.0524F, 0.0F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(22, 61).mirror().addBox(0.1F, -0.075F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.6089F, -0.5046F, -4.127F, 0.1658F, -0.2967F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(60, 39).mirror().addBox(-0.101F, -1.6713F, 0.0036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.395F, 1.0907F, -4.1542F, -0.0349F, -0.2443F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(0.1F, -0.975F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.314F, 1.3F, -5.0918F, -0.1745F, -0.2967F, 0.0F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(13, 52).mirror().addBox(-0.101F, -0.7657F, -0.9495F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.395F, 1.0907F, -4.1542F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(-0.9F, -6.05F, -21.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(27, 66).mirror().addBox(-1.1F, -5.15F, -21.65F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 46).mirror().addBox(-1.1F, -4.875F, -21.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 73).addBox(-0.1F, -6.05F, -21.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(27, 66).addBox(0.1F, -5.15F, -21.65F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(76, 46).addBox(0.1F, -4.875F, -21.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.8F, 10.65F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 57).addBox(0.2F, -0.65F, 2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.2F, -10.425F, -0.2531F, 0.7854F, -0.2182F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(37, 51).addBox(-1.3F, -0.475F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.2F, -11.35F, -0.2618F, 0.9599F, -0.1745F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(59, 55).addBox(-1.4F, -0.475F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.2F, -11.35F, -0.1047F, 1.0908F, 0.0F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(80, 75).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4538F, -0.05F, -6.4777F, -0.1222F, 0.3054F, 0.0F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(69, 38).addBox(-0.2F, -0.3F, -1.6F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2069F, -0.45F, -8.2749F, -0.2856F, 0.7033F, -0.2986F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(43, 73).addBox(-0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.077F, -0.425F, -9.9989F, -0.3301F, 0.9882F, -0.2872F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(48, 56).addBox(-0.8F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8781F, 0.1175F, -9.4696F, -0.0686F, 0.768F, 0.0017F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(49, 39).addBox(-0.0323F, -2.0615F, 2.5602F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.395F, 1.0907F, -4.1542F, -0.1571F, -0.0524F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(47, 50).addBox(-1.8264F, -0.6115F, 2.6915F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.395F, 1.0907F, -4.1542F, 0.0535F, 0.2091F, 0.0138F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(26, 51).addBox(-0.0323F, -0.6115F, 2.9362F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.395F, 1.0907F, -4.1542F, 0.0524F, -0.0524F, 0.0F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(22, 61).addBox(-1.1F, -0.075F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.6089F, -0.5046F, -4.127F, 0.1658F, 0.2967F, 0.0F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(60, 39).addBox(-0.899F, -1.6713F, 0.0036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.395F, 1.0907F, -4.1542F, -0.0349F, 0.2443F, 0.0F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(21, 71).addBox(-1.1F, -0.975F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.314F, 1.3F, -5.0918F, -0.1745F, 0.2967F, 0.0F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(13, 52).addBox(-0.899F, -0.7657F, -0.9495F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(7.395F, 1.0907F, -4.1542F, 0.0F, 0.2443F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 30).addBox(-0.5F, -0.35F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(3, 80).addBox(0.0F, -1.35F, 1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 80).addBox(0.0F, -1.35F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 21).addBox(0.0F, -1.35F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1315F, 4.5556F, 0.0011F, -0.2275F, -0.2311F));

		PartDefinition cube_r197 = tail.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(9, 80).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.15F, 5.6F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(53, 79).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3064F, 0.1037F, 3.5834F, 0.0499F, 0.7646F, -0.2051F));

		PartDefinition cube_r199 = tail.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(48, 79).mirror().addBox(-0.8726F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.1037F, 1.5834F, 0.083F, 0.6361F, -0.1837F));

		PartDefinition cube_r200 = tail.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(53, 79).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3064F, 0.1037F, 3.5834F, 0.0499F, -0.7646F, 0.2051F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(48, 79).addBox(-0.1274F, -0.0401F, -0.5008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.1037F, 1.5834F, 0.083F, -0.6361F, 0.1837F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(12, 80).addBox(0.0F, -1.5F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 80).addBox(0.0F, -1.5F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 15).addBox(0.0F, -1.4F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 80).addBox(0.0F, -1.3F, 6.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 18).addBox(0.0F, -1.2F, 8.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1691F, 6.9348F, 0.0365F, 0.3911F, -0.0361F));

		PartDefinition cube_r202 = tail2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(80, 30).addBox(0.0F, 1.2F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 80).addBox(0.0F, 0.9F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 68).addBox(0.0F, 0.8F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 80).addBox(0.0F, 0.3F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 24).addBox(0.0F, -0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9809F, -1.3348F, 0.2182F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(75, 79).addBox(0.0F, -1.2F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 79).addBox(0.0F, -0.9F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1943F, 9.1299F, 0.2691F, 0.7395F, 0.0638F));

		PartDefinition cube_r203 = tail3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(38, 80).addBox(0.0F, 1.4F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7865F, -10.4647F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 83, 83);
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