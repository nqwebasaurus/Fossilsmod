package fossils.fossils.client.blockentity.model.champsosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ChampsosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart forelegL5;
	private final ModelPart forelegL6;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public ChampsosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.hindlegL2 = this.bone.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL7 = this.hindlegL3.getChild("hindlegL7");
		this.hindlegL4 = this.bone.getChild("hindlegL4");
		this.hindlegL5 = this.hindlegL4.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.forelegL = this.body3.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.forelegL3 = this.forelegL2.getChild("forelegL3");
		this.forelegL4 = this.body3.getChild("forelegL4");
		this.forelegL5 = this.forelegL4.getChild("forelegL5");
		this.forelegL6 = this.forelegL5.getChild("forelegL6");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 1.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -11.4483F, -0.0261F, 0.4651F, 0.6771F, 0.1259F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 57).addBox(-0.8F, -0.6176F, 6.4432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 35).addBox(-0.5F, 0.4824F, 4.4432F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0F, -6.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-1.2F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.8738F, 0.5993F, -0.0141F, 0.0622F, -0.3211F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.5738F, -1.1757F, -0.1364F, 0.3888F, -0.3827F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-1.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.5738F, -1.1757F, -0.3083F, 0.3073F, -0.8772F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 70).addBox(0.2F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.8738F, 0.5993F, -0.0141F, -0.0622F, 0.3211F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 70).addBox(0.891F, -0.4534F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.5738F, -1.1757F, -0.3083F, -0.3073F, 0.8772F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.5738F, -1.1757F, -0.1364F, -0.3888F, 0.3827F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 57).addBox(-0.8F, -1.3176F, -0.1568F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2733F, -1.5392F, -0.192F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.3F, 0.9978F, 0.417F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 53).mirror().addBox(-1.5F, -0.1397F, -0.399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(28, 53).addBox(1.3F, -0.1397F, -0.399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.7F, 0.1022F, -0.017F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(0.0548F, -0.134F, 0.4646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8862F, 0.8484F, 0.0598F, -1.8768F, 0.0392F, -0.3962F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(0.0548F, 0.1173F, 0.0695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8862F, 0.8484F, 0.0598F, -1.4056F, 0.0392F, -0.3962F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(-0.1307F, 0.2548F, -0.5191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8862F, 0.8484F, 0.0598F, 0.3001F, 0.1445F, -0.4433F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(21, 53).mirror().addBox(0.0019F, 0.491F, -0.2584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8862F, 0.8484F, 0.0598F, -0.0666F, 0.0103F, -0.4197F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-0.0416F, -0.379F, -0.4683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8862F, 0.8484F, 0.0598F, -0.355F, 0.0431F, -0.3309F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(25, 67).addBox(-1.0548F, -0.134F, 0.4646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2862F, 0.8484F, 0.0598F, -1.8768F, -0.0392F, 0.3962F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(35, 55).addBox(-1.0548F, 0.1173F, 0.0695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2862F, 0.8484F, 0.0598F, -1.4056F, -0.0392F, 0.3962F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(61, 12).addBox(-0.8693F, 0.2548F, -0.5191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2862F, 0.8484F, 0.0598F, 0.3001F, -0.1445F, 0.4433F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 53).addBox(-1.0019F, 0.491F, -0.2584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2862F, 0.8484F, 0.0598F, -0.0666F, -0.0103F, 0.4197F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(64, 15).addBox(-0.9584F, -0.379F, -0.4683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2862F, 0.8484F, 0.0598F, -0.355F, -0.0431F, 0.3309F));

		PartDefinition hindlegL2 = bone.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(34, 16).addBox(0.0F, -0.25F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0685F, 1.3667F, 0.6606F, 0.2743F, -1.1105F, 0.6657F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(47, 0).addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 46).addBox(-0.0702F, -0.5F, 0.0473F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.3304F, 0.1662F, -0.1163F, 1.1982F, -0.7248F, 0.1211F));

		PartDefinition hindlegL7 = hindlegL3.addOrReplaceChild("hindlegL7", CubeListBuilder.create().texOffs(34, 0).addBox(0.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.9839F, -0.1812F, 0.0477F, -0.0732F, -0.0581F, -0.5061F));

		PartDefinition hindlegL4 = bone.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(45, 10).addBox(-4.0F, -0.25F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.5315F, 1.3667F, 0.6606F, -0.5284F, 0.2942F, -0.8759F));

		PartDefinition hindlegL5 = hindlegL4.addOrReplaceChild("hindlegL5", CubeListBuilder.create().texOffs(47, 3).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(29, 46).addBox(-2.9298F, -0.5F, 0.0473F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.3304F, 0.1662F, -0.1163F, 1.0413F, 1.0009F, -0.3254F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create().texOffs(34, 5).addBox(-3.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.9839F, -0.1812F, 0.0477F, -0.084F, 0.0409F, 0.2883F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.85F, -1.4F, -0.1063F, -0.1736F, 0.0184F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 57).addBox(-2.3F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -0.6468F, -1.8121F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(55, 55).addBox(-2.3F, -1.3F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -0.7384F, -3.9101F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2762F, -1.5007F, 0.0129F, 0.5309F, -0.3169F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(56, 4).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2762F, -1.5007F, -0.2583F, 0.4969F, -0.8583F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3762F, -3.5007F, -0.2876F, 0.3064F, -1.3477F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(53, 45).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3762F, -3.5007F, -0.0835F, 0.4092F, -0.7793F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.3762F, -3.5007F, 0.1153F, 0.3763F, -0.2696F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(56, 4).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2762F, -1.5007F, -0.2583F, -0.4969F, 0.8583F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2762F, -1.5007F, 0.0129F, -0.5309F, 0.3169F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(69, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3762F, -3.5007F, 0.1153F, -0.3763F, 0.2696F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(53, 45).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3762F, -3.5007F, -0.0835F, -0.4092F, 0.7793F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 30).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3762F, -3.5007F, -0.2876F, -0.3064F, 1.3477F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 27).addBox(-3.0F, -0.8F, -3.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 1.9294F, -0.1228F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(11, 35).addBox(-2.0F, 0.0F, 5.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(34, 10).addBox(-0.5F, -0.4F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4599F, -3.9985F, 0.0266F, -0.1745F, -0.0046F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(56, 9).addBox(-2.8F, -1.4F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -0.2F, -3.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 0).addBox(-0.8F, -1.3F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.55F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0164F, -1.3023F, -0.1139F, 0.2119F, -1.3083F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 8).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0164F, -1.3023F, 0.0135F, 0.2398F, -0.7535F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0164F, -1.3023F, 0.116F, 0.1837F, -0.2746F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(65, 68).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0164F, -3.3023F, -0.0679F, 0.2517F, -1.2877F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0164F, -3.3023F, 0.0743F, 0.2499F, -0.7287F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(66, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0164F, -3.3023F, 0.174F, 0.1655F, -0.2546F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(69, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0164F, -1.3023F, 0.116F, -0.1837F, 0.2746F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(26, 8).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0164F, -1.3023F, 0.0135F, -0.2398F, 0.7535F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 26).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0164F, -1.3023F, -0.1139F, -0.2119F, 1.3083F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(66, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0164F, -3.3023F, 0.174F, -0.1655F, 0.2546F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 8).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0164F, -3.3023F, 0.0743F, -0.2499F, 0.7287F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 68).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0164F, -3.3023F, -0.0679F, -0.2517F, 1.2877F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 41).addBox(-3.0F, -0.8F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, 3.0F, 0.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2123F, -3.9986F, -0.0983F, -0.2171F, 0.0212F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0286F, -2.9036F, 0.2613F, 0.2747F, -0.3252F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(59, 22).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0286F, -2.9036F, 0.101F, 0.386F, -0.8101F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2286F, -1.0036F, 0.3031F, 0.1971F, -0.2313F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2286F, -1.0036F, -0.0287F, 0.3771F, -1.2756F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2286F, -1.0036F, 0.1776F, 0.3357F, -0.6989F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 3).mirror().addBox(-0.5F, -0.541F, -0.316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(68, 3).addBox(3.3F, -0.541F, -0.316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.9F, 0.2087F, -2.1034F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.5F, -1.4463F, -1.3331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(65, 62).addBox(3.3F, -1.4463F, -1.3331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.9F, 0.2087F, -2.1034F, 2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-0.5F, -0.7751F, -1.9543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(53, 41).addBox(3.3F, -0.7751F, -1.9543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9F, 0.2087F, -2.1034F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 59).addBox(-0.5F, -7.8006F, 1.3123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.6663F, -2.6434F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 13).addBox(-1.0F, -0.9354F, -2.0049F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.8663F, -1.1434F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 57).addBox(-1.8F, -1.4F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.2979F, -3.2069F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(59, 22).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0286F, -2.9036F, 0.101F, -0.386F, 0.8101F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(5, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.0286F, -2.9036F, 0.2613F, -0.2747F, 0.3252F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2286F, -1.0036F, 0.3031F, -0.1971F, 0.2313F));

		PartDefinition cube_r63 = body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(69, 47).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2286F, -1.0036F, -0.0287F, -0.3771F, 1.2756F));

		PartDefinition cube_r64 = body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(59, 20).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2286F, -1.0036F, 0.1776F, -0.3357F, 0.6989F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 51).addBox(-1.8F, -1.4F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.4374F, -1.2118F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(22, 40).addBox(-1.5F, 0.0F, 5.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition forelegL = body3.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(45, 29).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.3379F, 1.8725F, -1.5966F, -0.8452F, 0.3584F, 0.9432F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create().texOffs(45, 17).addBox(0.0F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 20).addBox(0.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7486F, 0.0861F, 0.4872F, 2.0225F, 0.9938F, 0.4741F));

		PartDefinition forelegL3 = forelegL2.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(11, 41).addBox(-0.1F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5959F, 0.1274F, -0.2775F, 0.0894F, -0.0143F, 0.4774F));

		PartDefinition forelegL4 = body3.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.3379F, 1.8725F, -1.5966F, -0.6434F, 0.9152F, -1.081F));

		PartDefinition forelegL5 = forelegL4.addOrReplaceChild("forelegL5", CubeListBuilder.create().texOffs(45, 23).addBox(-3.0F, -0.5F, 0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 26).addBox(-3.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7486F, 0.0861F, 0.4872F, 1.9328F, -0.8333F, -0.3611F));

		PartDefinition forelegL6 = forelegL5.addOrReplaceChild("forelegL6", CubeListBuilder.create().texOffs(43, 33).addBox(-2.9F, -0.5F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.5959F, 0.1274F, -0.2775F, 0.0894F, 0.0143F, -0.4774F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(44, 42).addBox(-0.5F, -0.6F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1715F, -2.8889F, 0.1108F, -0.2545F, -0.1133F));

		PartDefinition cube_r67 = body4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 57).addBox(-1.3F, -1.675F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.425F, -1.95F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 24).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2002F, -1.7147F, 0.3512F, 0.4395F, -0.2977F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 24).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2002F, -1.7147F, 0.3512F, -0.4395F, 0.2977F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3913F, -3.0F, -0.2358F, -0.3456F, 0.0332F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(66, 6).addBox(-0.8F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9194F, -2.6746F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r71 = neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(10, 57).addBox(-0.8F, -1.45F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8607F, -0.5998F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r72 = neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(25, 70).addBox(-0.2F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.5915F, -2.3147F, 0.3066F, -0.5643F, 0.3123F));

		PartDefinition cube_r73 = neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-1.1F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.5915F, -0.3147F, 0.337F, 0.4811F, -0.301F));

		PartDefinition cube_r74 = neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(30, 70).addBox(0.1F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.5915F, -0.3147F, 0.337F, -0.4811F, 0.301F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(33, 40).addBox(-1.0F, -0.85F, 5.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -0.9846F, -3.4235F, -0.5782F, -0.1836F, 0.1186F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, -0.425F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 61).addBox(-0.5F, -0.425F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.1307F, 0.1335F, -3.4483F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(59, 47).addBox(-0.5F, -0.925F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1307F, -0.3709F, -1.1209F, 1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(7, 49).addBox(-0.5F, -0.1F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1307F, -0.1266F, -1.5571F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(53, 37).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1307F, -0.0896F, -1.4689F, -0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1307F, 0.1989F, -2.2918F, 0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(38, 47).addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.1307F, 0.4554F, -3.9723F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(5, 13).addBox(-0.5F, -0.6F, -3.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F))
				.texOffs(0, 10).addBox(-0.5F, -0.6F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1307F, 1.7059F, -6.4673F, 0.2487F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, 2.4936F, -9.5689F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(11, 45).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.034F, -1.8438F, 6.4474F, 0.3798F, 0.0338F, 0.0086F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(5, 64).addBox(-0.35F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 64).addBox(-0.35F, -0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 3).addBox(-0.35F, -0.3F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 62).addBox(-0.35F, -0.3F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 62).addBox(-0.35F, -0.3F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 62).addBox(-0.35F, -0.3F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 62).addBox(-0.35F, -0.3F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(17, 10).addBox(-0.35F, -0.6F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2489F, 0.0338F, 0.0086F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(15, 64).addBox(-0.35F, -0.4F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 64).addBox(-0.35F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 62).addBox(-0.35F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1501F, -0.9609F, 4.1898F, 0.3361F, 0.0338F, 0.0086F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(30, 57).addBox(-0.6851F, -1.4264F, -0.4575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(2.4104F, -2.7467F, 9.8681F, -1.1167F, -0.2589F, -0.4478F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 0).addBox(-0.4339F, -1.9714F, -0.2878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 55).addBox(-0.4339F, -1.6714F, -0.2878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.4121F, -3.384F, 9.3072F, 1.2962F, -0.2185F, -3.1126F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(40, 55).addBox(-0.6517F, -1.6962F, -0.2878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7104F, -3.2467F, 10.6681F, 1.6673F, -0.3749F, -3.128F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(20, 67).addBox(-0.7033F, -0.6987F, -0.323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9604F, -3.1467F, 10.9431F, 1.8488F, -0.833F, 2.9832F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(15, 67).addBox(-0.6707F, -0.752F, -0.3044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4104F, -3.1467F, 11.0181F, 1.3796F, -1.3299F, -2.9069F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(10, 67).addBox(-0.6819F, -1.1202F, -0.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 67).addBox(-0.6819F, -0.7202F, -0.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0604F, -3.1467F, 10.7181F, -1.0589F, -1.1612F, -0.5801F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 24).addBox(-0.6851F, -1.3297F, -0.8408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4104F, -2.7467F, 9.8681F, -1.4657F, -0.2589F, -0.4478F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(65, 65).addBox(-0.6374F, -1.4778F, -1.6444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(61, 50).addBox(-0.6374F, -1.1778F, -1.6444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5574F, -1.4719F, 9.1826F, -1.0222F, 0.3866F, -0.2465F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(45, 59).addBox(-0.6374F, -0.9952F, -1.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(2.5574F, -1.4719F, 9.1826F, -0.8477F, 0.3866F, -0.2465F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(5, 61).addBox(-0.6374F, -0.9896F, -1.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 32).addBox(-0.6374F, -1.2896F, -1.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(2.5574F, -1.4719F, 9.1826F, 0.1995F, 0.3866F, -0.2465F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(59, 29).addBox(-0.6374F, -0.7102F, -1.5053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(54, 16).addBox(-0.6374F, -1.7102F, -1.1053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(2.5574F, -1.4719F, 9.1826F, -0.7604F, 0.3866F, -0.2465F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(60, 58).addBox(-1.0462F, -0.2462F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 64).addBox(-1.0462F, -0.6462F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2821F, -2.0968F, 9.6114F, -0.5205F, 0.3402F, 0.4903F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 6).addBox(-2.46F, -0.0619F, -0.2628F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2821F, -2.0968F, 9.6114F, -0.6648F, -0.388F, 0.1011F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(64, 29).addBox(-0.5F, -0.45F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2084F, -1.6051F, 9.1872F, -0.0753F, -0.5464F, -1.0808F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(64, 26).addBox(-0.625F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.7163F, -1.5404F, 9.1286F, -0.2935F, -0.5464F, -1.0808F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(60, 61).addBox(-1.1694F, -0.0619F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 64).addBox(-1.1694F, -0.4619F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2821F, -2.0968F, 9.6114F, -0.6095F, -0.0708F, -0.1378F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(54, 13).addBox(-2.2945F, -0.7975F, -0.2608F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2821F, -2.0968F, 9.6114F, -0.5347F, -0.6321F, -0.2897F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(59, 16).addBox(-0.7894F, -0.9772F, -0.5869F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.2821F, -2.0968F, 9.6114F, -0.6085F, 0.0796F, 0.0767F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(54, 20).addBox(-0.7106F, -1.7102F, -0.7099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5574F, -1.4719F, 9.1826F, -0.7202F, 0.2543F, -0.1194F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(59, 26).addBox(0.9002F, -0.7162F, 0.8049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4725F, -1.4557F, 8.46F, 0.0F, 0.4189F, 0.0F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 61).addBox(0.7759F, -0.7162F, 0.5661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4725F, -1.4557F, 8.46F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 55).addBox(-0.3F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 44).addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -2.0703F, 5.5806F, 0.5779F, -0.4165F, 0.5552F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 61).addBox(-0.5F, -0.3F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1249F, -3.046F, 9.2496F, 0.0318F, 0.7561F, 0.5333F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(61, 9).addBox(-0.325F, -0.25F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 6).addBox(-0.325F, -0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4184F, -3.1569F, 8.7998F, 0.3853F, 0.7561F, 0.5333F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(52, 47).addBox(-0.325F, -0.25F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.5729F, -2.9336F, 7.7066F, 0.401F, 0.5582F, 0.4169F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(21, 49).addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, -2.2245F, 7.1857F, 0.7247F, 0.4451F, 0.3642F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 53).addBox(-0.7F, -0.325F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, -2.0383F, 5.5966F, 0.0695F, 0.0952F, -0.9392F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(47, 6).addBox(-0.6244F, -0.3662F, 1.1755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4725F, -1.8057F, 6.16F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(45, 47).addBox(-0.3501F, -0.3662F, -0.1901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.4725F, -1.8057F, 6.16F, 0.0F, 0.4276F, 0.0F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(59, 32).addBox(-0.3F, -0.7F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(28, 49).addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.2395F, 7.2651F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 35).addBox(-0.7F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(55, 59).addBox(-0.7F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 59).addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, -1.2395F, 7.2651F, -0.2186F, -0.7849F, -0.0305F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 28).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1794F, -2.3654F, 8.7641F, -1.2687F, 0.2504F, 0.0771F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 55).addBox(-0.475F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.5832F, 8.1F, -1.2687F, 0.2504F, 0.0771F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(25, 61).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5171F, -0.2504F, 0.5887F, 2.4141F, -1.192F, -2.4463F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(20, 61).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5031F, -0.1522F, 0.2012F, 1.4378F, -1.3201F, -1.4294F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(15, 61).addBox(-0.275F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.1462F, 0.1692F, 0.3107F, -0.6362F, -0.1844F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(44, 37).addBox(-0.3F, -0.7F, -0.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0F, -1.1708F, 5.0161F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(42, 51).addBox(-0.5F, -0.45F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3544F, -1.631F, 5.6097F, 0.294F, 0.1381F, 0.0117F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(35, 51).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.602F, -1.6438F, 6.0663F, 0.2606F, 0.3F, 0.0786F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1307F, 2.4936F, -9.5689F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(11, 45).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.034F, -1.8438F, 6.4474F, 0.3798F, -0.0338F, -0.0086F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.65F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(-0.65F, -0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(63, 3).mirror().addBox(-0.65F, -0.3F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(55, 62).mirror().addBox(-0.65F, -0.3F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 62).mirror().addBox(-0.65F, -0.3F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(45, 62).mirror().addBox(-0.65F, -0.3F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(40, 62).mirror().addBox(-0.65F, -0.3F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(17, 10).mirror().addBox(-0.65F, -0.6F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2489F, -0.0338F, -0.0086F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(-0.65F, -0.4F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 64).mirror().addBox(-0.65F, -0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 62).mirror().addBox(-0.65F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1501F, -0.9609F, 4.1898F, 0.3361F, -0.0338F, -0.0086F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 57).mirror().addBox(-0.3149F, -1.4264F, -0.4575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.4104F, -2.7467F, 9.8681F, -1.1167F, 0.2589F, 0.4478F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5661F, -1.9714F, -0.2878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 55).mirror().addBox(-0.5661F, -1.6714F, -0.2878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.4121F, -3.384F, 9.3072F, 1.2962F, 0.2185F, 3.1126F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-0.3482F, -1.6962F, -0.2878F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7104F, -3.2467F, 10.6681F, 1.6673F, 0.3749F, 3.128F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(-0.2967F, -0.6987F, -0.323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9604F, -3.1467F, 10.9431F, 1.8488F, 0.833F, -2.9832F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.3293F, -0.752F, -0.3044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4104F, -3.1467F, 11.0181F, 1.3796F, 1.3299F, 2.9069F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-0.3181F, -1.1202F, -0.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 67).mirror().addBox(-0.3181F, -0.7202F, -0.3223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -3.1467F, 10.7181F, -1.0589F, 1.1612F, 0.5801F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 24).mirror().addBox(-0.3149F, -1.3297F, -0.8408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4104F, -2.7467F, 9.8681F, -1.4657F, 0.2589F, 0.4478F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-0.3626F, -1.4778F, -1.6444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(61, 50).mirror().addBox(-0.3626F, -1.1778F, -1.6444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5574F, -1.4719F, 9.1826F, -1.0222F, -0.3866F, 0.2465F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(45, 59).mirror().addBox(-0.3626F, -0.9952F, -1.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.5574F, -1.4719F, 9.1826F, -0.8477F, -0.3866F, 0.2465F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.3626F, -0.9896F, -1.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 32).mirror().addBox(-0.3626F, -1.2896F, -1.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.5574F, -1.4719F, 9.1826F, 0.1995F, -0.3866F, 0.2465F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(59, 29).mirror().addBox(-0.3626F, -0.7102F, -1.5053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(54, 16).mirror().addBox(-0.3626F, -1.7102F, -1.1053F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-2.5574F, -1.4719F, 9.1826F, -0.7604F, -0.3866F, 0.2465F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(0.0462F, -0.2462F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 64).mirror().addBox(0.0462F, -0.6462F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2821F, -2.0968F, 9.6114F, -0.5205F, -0.3402F, -0.4903F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(54, 6).mirror().addBox(0.46F, -0.0619F, -0.2628F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2821F, -2.0968F, 9.6114F, -0.6648F, 0.388F, -0.1011F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-0.5F, -0.45F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2084F, -1.6051F, 9.1872F, -0.0753F, 0.5464F, 1.0808F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(64, 26).mirror().addBox(-0.375F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.7163F, -1.5404F, 9.1286F, -0.2935F, 0.5464F, 1.0808F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(0.1694F, -0.0619F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 64).mirror().addBox(0.1694F, -0.4619F, -0.5869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2821F, -2.0968F, 9.6114F, -0.6095F, 0.0708F, 0.1378F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(54, 13).mirror().addBox(0.2945F, -0.7975F, -0.2608F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2821F, -2.0968F, 9.6114F, -0.5347F, 0.6321F, 0.2897F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-0.2106F, -0.9772F, -0.5869F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.2821F, -2.0968F, 9.6114F, -0.6085F, -0.0796F, -0.0767F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(54, 20).mirror().addBox(-0.2894F, -1.7102F, -0.7099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5574F, -1.4719F, 9.1826F, -0.7202F, -0.2543F, 0.1194F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(59, 26).mirror().addBox(-1.9002F, -0.7162F, 0.8049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4725F, -1.4557F, 8.46F, 0.0F, -0.4189F, 0.0F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-1.7759F, -0.7162F, 0.5661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4725F, -1.4557F, 8.46F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(60, 55).mirror().addBox(-0.7F, -0.3F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 44).mirror().addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.0703F, 5.5806F, 0.5779F, 0.4165F, -0.5552F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(10, 61).mirror().addBox(-0.5F, -0.3F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1249F, -3.046F, 9.2496F, 0.0318F, -0.7561F, -0.5333F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(61, 9).mirror().addBox(-0.675F, -0.25F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 6).mirror().addBox(-0.675F, -0.25F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4184F, -3.1569F, 8.7998F, 0.3853F, -0.7561F, -0.5333F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-0.675F, -0.25F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.5729F, -2.9336F, 7.7066F, 0.401F, -0.5582F, -0.4169F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(21, 49).mirror().addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.2245F, 7.1857F, 0.7247F, -0.4451F, -0.3642F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.3F, -0.325F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.0383F, 5.5966F, 0.0695F, -0.0952F, 0.9392F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(47, 6).mirror().addBox(-0.3756F, -0.3662F, 1.1755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4725F, -1.8057F, 6.16F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 47).mirror().addBox(-0.6499F, -0.3662F, -0.1901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.4725F, -1.8057F, 6.16F, 0.0F, -0.4276F, 0.0F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(59, 32).mirror().addBox(-0.7F, -0.7F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(28, 49).mirror().addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2395F, 7.2651F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-0.3F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(55, 59).mirror().addBox(-0.3F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 59).mirror().addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.2395F, 7.2651F, -0.2186F, 0.7849F, 0.0305F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1794F, -2.3654F, 8.7641F, -1.2687F, -0.2504F, -0.0771F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(-0.525F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5832F, 8.1F, -1.2687F, -0.2504F, -0.0771F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(25, 61).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5171F, -0.2504F, 0.5887F, 2.4141F, 1.192F, 2.4463F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(20, 61).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.5031F, -0.1522F, 0.2012F, 1.4378F, 1.3201F, 1.4294F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.725F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1462F, 0.1692F, 0.3107F, 0.6362F, 0.1844F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-0.7F, -0.7F, -0.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1708F, 5.0161F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(-0.5F, -0.45F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3544F, -1.631F, 5.6097F, 0.294F, -0.1381F, -0.0117F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(35, 51).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.602F, -1.6438F, 6.0663F, 0.2606F, -0.3F, -0.0786F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 1.3317F, -0.5129F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(7, 53).mirror().addBox(-0.2998F, -0.9212F, -2.9474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.6908F, 0.2003F, 0.2685F, 0.5305F, -0.2F, -0.1562F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.4163F, -0.4698F, 0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 64).mirror().addBox(-0.4163F, -0.4698F, 0.0625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4997F, 5.71F, -6.9813F, 0.8227F, 0.1379F, 0.2149F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-0.3556F, -0.4882F, -0.0461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0931F, 5.8228F, -7.0646F, 0.8878F, -0.4713F, -0.4282F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5305F, 1.4771F, -2.8256F, 0.6723F, -0.2007F, -0.1183F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(55, 65).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3948F, 1.7833F, -3.3389F, 0.6579F, -0.0633F, -0.0097F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-0.3223F, -0.9104F, -1.0717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 65).mirror().addBox(-0.3223F, -0.9355F, -1.6717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(45, 65).mirror().addBox(-0.3223F, -0.9355F, -2.2717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 44).mirror().addBox(-0.3223F, -0.9355F, -2.8717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 41).mirror().addBox(-0.3223F, -0.9355F, -3.4717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(40, 65).mirror().addBox(-0.3223F, -0.9355F, -4.0717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 38).mirror().addBox(-0.3223F, -0.9355F, -4.6717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 35).mirror().addBox(-0.3223F, -0.9355F, -5.2717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(15, 27).mirror().addBox(-0.3223F, -0.7355F, -5.5717F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.584F, 2.1136F, -3.0613F, 0.7891F, -0.0614F, -0.0179F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.3222F, -0.6618F, -1.6926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0211F, 1.2135F, -2.082F, 0.7134F, -0.2443F, -0.2056F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(49, 51).mirror().addBox(-0.2998F, -1.3819F, -2.8684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6908F, 0.2003F, 0.2685F, 0.7051F, -0.2F, -0.1562F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(14, 49).mirror().addBox(-0.2998F, -0.6403F, -1.8495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6908F, 0.2003F, 0.2685F, 0.1815F, -0.2F, -0.1562F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(22, 35).mirror().addBox(-0.2998F, -0.6744F, -1.7832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6908F, 0.2003F, 0.2685F, 0.356F, -0.2F, -0.1562F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(7, 53).addBox(-0.7002F, -0.9212F, -2.9474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.6908F, 0.2003F, 0.2685F, 0.5305F, 0.2F, 0.1562F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(35, 65).addBox(-0.5837F, -0.4698F, 0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 64).addBox(-0.5837F, -0.4698F, 0.0625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4997F, 5.71F, -6.9813F, 0.8227F, -0.1379F, -0.2149F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(30, 64).addBox(-0.6444F, -0.4882F, -0.0461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0931F, 5.8228F, -7.0646F, 0.8878F, 0.4713F, 0.4282F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(65, 56).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5305F, 1.4771F, -2.8256F, 0.6723F, 0.2007F, 0.1183F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(55, 65).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3948F, 1.7833F, -3.3389F, 0.6579F, 0.0633F, 0.0097F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(65, 53).addBox(-0.6777F, -0.9104F, -1.0717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 65).addBox(-0.6777F, -0.9355F, -1.6717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 65).addBox(-0.6777F, -0.9355F, -2.2717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 44).addBox(-0.6777F, -0.9355F, -2.8717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 41).addBox(-0.6777F, -0.9355F, -3.4717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 65).addBox(-0.6777F, -0.9355F, -4.0717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 38).addBox(-0.6777F, -0.9355F, -4.6717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 35).addBox(-0.6777F, -0.9355F, -5.2717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 27).addBox(-0.6777F, -0.7355F, -5.5717F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.584F, 2.1136F, -3.0613F, 0.7891F, 0.0614F, 0.0179F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(14, 53).addBox(-0.6778F, -0.6618F, -1.6926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0211F, 1.2135F, -2.082F, 0.7134F, 0.2443F, 0.2056F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(49, 51).addBox(-0.7002F, -1.3819F, -2.8684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6908F, 0.2003F, 0.2685F, 0.7051F, 0.2F, 0.1562F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(14, 49).addBox(-0.7002F, -0.6403F, -1.8495F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6908F, 0.2003F, 0.2685F, 0.1815F, 0.2F, 0.1562F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(22, 35).addBox(-0.7002F, -0.6744F, -1.7832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6908F, 0.2003F, 0.2685F, 0.356F, 0.2F, 0.1562F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.1552F, -0.085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8338F, 2.0015F, 0.1072F, 0.217F, 0.0232F));

		PartDefinition cube_r187 = tail.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(53, 68).addBox(0.0F, 1.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 68).addBox(0.0F, 0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5534F, 1.4027F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(60, 38).addBox(-0.8F, -1.4F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(60, 41).addBox(-0.8F, -1.1F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 59).addBox(-0.8F, -1.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(35, 59).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0552F, 2.115F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(54, 32).addBox(-0.8F, -1.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0552F, 0.115F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3448F, 0.115F, 0.0004F, 0.0868F, 0.0091F));

		PartDefinition cube_r191 = tail.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.3448F, 0.115F, 0.0004F, -0.0868F, -0.0091F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, -0.1594F, 0.1708F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 47).addBox(-0.8F, -0.8094F, 4.1708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0113F, 5.4F, 0.263F, -0.4784F, -0.0408F));

		PartDefinition cube_r192 = tail2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(66, 12).addBox(-0.8F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0094F, 2.3208F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r193 = tail2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 67).addBox(-0.8F, -1.1F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(66, 9).addBox(-0.8F, -0.9F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0406F, 0.3208F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r194 = tail2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.3406F, 0.3708F, 0.0001F, 0.0698F, 0.0018F));

		PartDefinition cube_r195 = tail2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 27).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 0.3406F, 0.3708F, 0.0001F, -0.0698F, -0.0018F));

		PartDefinition cube_r196 = tail2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(70, 43).addBox(0.0F, 5.3F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 68).addBox(0.0F, 4.2F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 40).addBox(0.0F, 3.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5637F, -4.2714F, 0.5934F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 33).addBox(-0.5F, -0.4381F, -0.2468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 18).addBox(-0.8F, -1.0631F, -0.2468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 21).addBox(-0.8F, -1.0381F, 1.7532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 50).addBox(-0.8F, -0.9881F, 3.7532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2845F, 6.0979F, -0.1126F, -0.3054F, -0.0055F));

		PartDefinition cube_r197 = tail3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(70, 37).addBox(0.0F, 7.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 34).addBox(0.0F, 6.0F, 9.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.279F, -10.3832F, 0.5934F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(32, 19).addBox(-0.5F, -0.413F, -0.1774F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0103F, 4.6502F, -0.083F, -0.4796F, 0.0182F));

		PartDefinition cube_r198 = tail4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(60, 67).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.413F, 3.3226F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(30, 67).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.463F, 1.3226F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1322F, -0.0375F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 68).addBox(-0.8F, -0.5322F, 1.9625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2811F, 4.5269F, -0.2826F, -0.4281F, 0.0715F));

		PartDefinition cube_r200 = tail5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(45, 68).addBox(-0.8F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0322F, 4.4625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(35, 68).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0322F, 0.4625F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 75);
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