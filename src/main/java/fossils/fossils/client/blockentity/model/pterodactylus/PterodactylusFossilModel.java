package fossils.fossils.client.blockentity.model.pterodactylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PterodactylusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart tail;
	private final ModelPart chest;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;

	public PterodactylusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body1 = this.root.getChild("body1");
		this.leftLeg = this.body1.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.body1.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail = this.body1.getChild("tail");
		this.chest = this.root.getChild("chest");
		this.leftWing = this.chest.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.chest.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.05F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.55F, 2.25F, -0.2637F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(15, 66).addBox(0.0F, -0.525F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5189F, 0.8514F, -0.3534F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(37, 8).mirror().addBox(-1.2F, -0.15F, -0.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 8).addBox(0.2F, -0.15F, -0.3F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 0).addBox(-0.5F, -0.65F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.721F, 0.5779F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 9).mirror().addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(54, 40).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1454F, 1.4452F, 1.0088F, -0.5733F, 0.2106F, -0.0573F));

		PartDefinition cube_r2 = body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 49).mirror().addBox(-0.5891F, -0.3863F, -0.6666F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 1.7297F, 0.1686F, 0.0407F, 0.3052F, 0.0122F));

		PartDefinition cube_r3 = body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 64).mirror().addBox(-0.4994F, -0.7024F, -0.9274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(50, 64).mirror().addBox(-0.2244F, -0.7024F, -0.6524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(60, 64).mirror().addBox(-0.2244F, -0.7024F, -0.9274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 1.7297F, 0.1686F, -0.367F, 0.5656F, -1.9127F));

		PartDefinition cube_r4 = body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 30).mirror().addBox(-0.7737F, -0.4801F, -0.6015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.9233F, 1.7297F, 0.1686F, 0.3178F, 0.1253F, -0.1122F));

		PartDefinition cube_r5 = body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-0.5F, -0.425F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.0345F, 1.6419F, 1.474F, 0.8797F, 0.2106F, -0.0573F));

		PartDefinition cube_r6 = body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 6).mirror().addBox(-0.7236F, -0.7304F, -0.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0033F, 1.3929F, 0.6167F, -0.3988F, 0.2106F, -0.0573F));

		PartDefinition cube_r7 = body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 49).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0802F, 1.3826F, 1.3299F, 0.5612F, 0.2106F, -0.0573F));

		PartDefinition cube_r8 = body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 57).mirror().addBox(-0.6668F, -0.9139F, -1.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0283F, 1.3929F, 0.6167F, -0.8657F, 0.1886F, -0.1104F));

		PartDefinition cube_r9 = body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 52).mirror().addBox(-0.6668F, -1.1123F, -0.9131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.0283F, 1.3929F, 0.6167F, -0.5864F, 0.1886F, -0.1104F));

		PartDefinition cube_r10 = body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-0.6668F, -1.1141F, -0.2643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.0283F, 1.3929F, 0.6167F, -0.4119F, 0.1886F, -0.1104F));

		PartDefinition cube_r11 = body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-0.7152F, -0.8245F, 0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0283F, 1.3929F, 0.6167F, 0.0149F, 0.217F, -0.0232F));

		PartDefinition cube_r12 = body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(-0.5F, -0.375F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.9297F, 1.1207F, 2.0922F, -0.7268F, 0.217F, -0.0232F));

		PartDefinition cube_r13 = body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(51, 37).addBox(-0.5F, -0.375F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.9297F, 1.1207F, 2.0922F, -0.7268F, -0.217F, 0.0232F));

		PartDefinition cube_r14 = body1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 49).addBox(-0.2848F, -0.8245F, 0.4826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0283F, 1.3929F, 0.6167F, 0.0149F, -0.217F, 0.0232F));

		PartDefinition cube_r15 = body1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 64).addBox(-0.3332F, -1.1141F, -0.2643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.0283F, 1.3929F, 0.6167F, -0.4119F, -0.1886F, 0.1104F));

		PartDefinition cube_r16 = body1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 52).addBox(-0.3332F, -1.1123F, -0.9131F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0283F, 1.3929F, 0.6167F, -0.5864F, -0.1886F, 0.1104F));

		PartDefinition cube_r17 = body1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 57).addBox(-0.3332F, -0.9139F, -1.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0283F, 1.3929F, 0.6167F, -0.8657F, -0.1886F, 0.1104F));

		PartDefinition cube_r18 = body1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0802F, 1.3826F, 1.3299F, 0.5612F, -0.2106F, 0.0573F));

		PartDefinition cube_r19 = body1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(54, 6).addBox(-0.2764F, -0.7304F, -0.032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0033F, 1.3929F, 0.6167F, -0.3988F, -0.2106F, 0.0573F));

		PartDefinition cube_r20 = body1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 9).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(54, 40).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1454F, 1.4452F, 1.0088F, -0.5733F, -0.2106F, 0.0573F));

		PartDefinition cube_r21 = body1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(52, 16).addBox(-0.5F, -0.425F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.0345F, 1.6419F, 1.474F, 0.8797F, -0.2106F, 0.0573F));

		PartDefinition cube_r22 = body1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 30).addBox(-0.2263F, -0.4801F, -0.6015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.9233F, 1.7297F, 0.1686F, 0.3178F, -0.1253F, 0.1122F));

		PartDefinition cube_r23 = body1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 64).addBox(-0.7756F, -0.7024F, -0.9274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(50, 64).addBox(-0.7756F, -0.7024F, -0.6524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(55, 64).addBox(-0.5006F, -0.7024F, -0.9274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.9233F, 1.7297F, 0.1686F, -0.367F, -0.5656F, 1.9127F));

		PartDefinition cube_r24 = body1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(7, 49).addBox(-1.4109F, -0.3863F, -0.6666F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.9233F, 1.7297F, 0.1686F, 0.0407F, -0.3052F, -0.0122F));

		PartDefinition leftLeg = body1.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(21, 33).addBox(-0.4F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3244F, 0.9455F, 1.3029F, 0.2346F, -0.26F, -0.4185F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -0.3F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4162F, 4.21F, -0.32F, 0.8008F, -0.0413F, 0.3525F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5685F, 4.4632F, 0.326F, -0.5068F, 0.0984F, -0.0101F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, 0.4305F, 0.4302F, 0.0623F, -0.0982F, -0.0319F));

		PartDefinition cube_r25 = finger.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(64, 45).addBox(-0.5589F, -0.5F, -1.0422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 39).addBox(-0.5589F, -0.5F, -0.6422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8142F, 0.0542F, -1.3309F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r26 = finger.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(12, 45).addBox(-0.4983F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2142F, 0.0542F, -0.3309F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r27 = finger.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 42).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0858F, 0.0542F, 1.0691F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(27, 28).addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0111F, -2.5649F, -0.2175F, 0.0F, 0.0F));

		PartDefinition rightLeg = body1.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(21, 33).mirror().addBox(-0.6F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3244F, 0.9455F, 1.3029F, -0.1145F, 0.26F, 0.4185F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(32, 32).mirror().addBox(0.0F, -0.3F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4162F, 4.21F, -0.32F, 0.6263F, 0.0413F, -0.3525F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5685F, 4.4632F, 0.326F, -0.245F, -0.0984F, 0.0101F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, 0.4305F, 0.4302F, 0.0623F, 0.0982F, 0.0319F));

		PartDefinition cube_r28 = finger2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-0.4411F, -0.5F, -1.0422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 39).mirror().addBox(-0.4411F, -0.5F, -0.6422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8142F, 0.0542F, -1.3309F, 0.0F, -1.0559F, 0.0F));

		PartDefinition cube_r29 = finger2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 45).mirror().addBox(-0.5017F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2142F, 0.0542F, -0.3309F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r30 = finger2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 42).mirror().addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0858F, 0.0542F, 1.0691F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(27, 28).mirror().addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0111F, -2.5649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition tail = body1.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9824F, 2.0569F, -0.5742F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(21, 40).addBox(-0.5F, -0.195F, 0.4268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -0.3354F, -0.5949F, -0.1047F, 0.0F, 0.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 2.05F, -0.0892F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(66, 0).addBox(0.0F, -0.35F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3034F, -2.7298F, -0.3665F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(65, 64).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5179F, -4.0119F, -0.1658F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(66, 3).addBox(0.0F, -0.3494F, 0.873F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 28).addBox(-0.5F, -0.1744F, -0.127F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -0.9577F, -1.7499F, -0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(0.115F, -0.3893F, -0.6805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1719F, 0.5891F, -3.1567F, -0.2574F, 0.0338F, 0.2597F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(57, 15).mirror().addBox(0.4177F, -0.3893F, -0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1719F, 0.5891F, -3.1567F, -0.2871F, 0.4546F, 0.1396F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 8).mirror().addBox(-0.3951F, -2.47F, -0.9792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2719F, 0.5891F, -3.1567F, 0.7314F, 0.8579F, 0.08F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-1.6542F, -2.0724F, -1.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2719F, 0.5891F, -3.1567F, 0.1046F, -0.0628F, -0.0449F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-1.6261F, -2.21F, -0.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2719F, 0.5891F, -3.1567F, -0.1644F, 0.1193F, -0.0898F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(-1.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.3952F, -0.6204F, -0.0157F, -0.1701F, -1.305F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(20, 63).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.3952F, -0.6204F, -0.1218F, -0.12F, -0.6008F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(15, 57).mirror().addBox(-0.85F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.3952F, -0.6204F, -0.1549F, -0.0322F, -0.172F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-2.0824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(62, 15).mirror().addBox(-1.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.8952F, -2.2204F, 0.0413F, 0.0406F, -1.3087F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(15, 63).mirror().addBox(-0.85F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.8952F, -2.2204F, 0.06F, 0.0056F, -0.1749F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.8952F, -2.2204F, 0.0577F, 0.0046F, -0.6112F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-2.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -1.3952F, -4.0204F, 0.1368F, 0.3771F, -1.2886F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -1.3952F, -4.0204F, 0.3477F, 0.202F, -0.581F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.85F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -1.3952F, -4.0204F, 0.4042F, 0.0648F, -0.1627F));

		PartDefinition chest_r13 = chest.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(15, 57).addBox(-0.15F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -0.3952F, -0.6204F, -0.1549F, 0.0322F, 0.172F));

		PartDefinition chest_r14 = chest.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(20, 63).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -0.3952F, -0.6204F, -0.1218F, 0.12F, 0.6008F));

		PartDefinition chest_r15 = chest.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(63, 49).addBox(0.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -0.3952F, -0.6204F, -0.0157F, 0.1701F, 1.305F));

		PartDefinition chest_r16 = chest.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(56, 37).addBox(1.0824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(62, 15).addBox(0.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -0.8952F, -2.2204F, 0.0413F, -0.0406F, 1.3087F));

		PartDefinition chest_r17 = chest.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(62, 18).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -0.8952F, -2.2204F, 0.0577F, -0.0046F, 0.6112F));

		PartDefinition chest_r18 = chest.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(15, 63).addBox(-0.15F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -0.8952F, -2.2204F, 0.06F, -0.0056F, 0.1749F));

		PartDefinition chest_r19 = chest.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(60, 61).addBox(-0.15F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -1.3952F, -4.0204F, 0.4042F, -0.0648F, 0.1627F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(44, 38).addBox(0.6261F, -2.21F, -0.1862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2719F, 0.5891F, -3.1567F, -0.1644F, -0.1193F, 0.0898F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 44).addBox(0.6542F, -2.0724F, -1.0181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2719F, 0.5891F, -3.1567F, 0.1046F, 0.0628F, 0.0449F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(49, 8).addBox(-0.6049F, -2.47F, -0.9792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2719F, 0.5891F, -3.1567F, 0.7314F, -0.8579F, -0.08F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(57, 15).addBox(-1.4177F, -0.3893F, -0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1719F, 0.5891F, -3.1567F, -0.2871F, -0.4546F, -0.1396F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(30, 64).addBox(-1.6719F, -0.1854F, -0.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(35, 64).addBox(-1.6719F, -0.1854F, -1.3537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1719F, 0.5891F, -3.1567F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(40, 64).addBox(-1.115F, -0.3893F, -0.6805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1719F, 0.5891F, -3.1567F, -0.2574F, -0.0338F, -0.2597F));

		PartDefinition chest_r20 = chest.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(10, 62).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -1.3952F, -4.0204F, 0.3477F, -0.202F, 0.581F));

		PartDefinition chest_r21 = chest.addOrReplaceChild("chest_r21", CubeListBuilder.create().texOffs(0, 49).addBox(0.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, -1.3952F, -4.0204F, 0.1368F, -0.3771F, 1.2886F));

		PartDefinition chest_r22 = chest.addOrReplaceChild("chest_r22", CubeListBuilder.create().texOffs(9, 28).addBox(-0.5F, -0.1715F, -0.1857F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.7327F, -4.2749F, -0.2967F, 0.0F, 0.0F));

		PartDefinition chest_r23 = chest.addOrReplaceChild("chest_r23", CubeListBuilder.create().texOffs(45, 58).addBox(-0.5F, -0.8676F, -0.1679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -1.1327F, -5.0749F, -0.1265F, 0.0F, 0.0F));

		PartDefinition leftWing = chest.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(49, 12).addBox(-0.5F, 0.45F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 18).addBox(-0.5F, -0.15F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 58).addBox(-0.5F, -0.15F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.635F, -0.4849F, -3.7745F, 0.3003F, 0.2936F, -0.5626F));

		PartDefinition cube_r43 = leftWing.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(54, 43).addBox(-0.5F, -0.775F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 54).addBox(-0.5F, -1.375F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.45F, 0.4F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(30, 10).addBox(-0.7001F, -0.1808F, -0.3248F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(27, 32).addBox(-0.7001F, -0.1808F, -1.0248F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.3532F, 3.5246F, -0.2451F, -1.5554F, 0.3527F, -0.0295F));

		PartDefinition cube_r44 = leftWing2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 46).addBox(-0.5F, -0.4F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.2001F, 4.7376F, -1.6756F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r45 = leftWing2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(14, 49).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2001F, 5.4447F, -0.9685F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(7, 41).addBox(-0.9656F, -0.3774F, -0.1857F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2991F, 5.9384F, 0.0715F, 0.8465F, -0.3639F, -0.2091F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(0, 33).addBox(-0.6299F, -1.8109F, 0.1631F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.7943F, 3.8145F, -0.1429F, -0.0812F, -0.223F, 1.7533F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(15, 10).addBox(-0.3974F, -0.3279F, -0.4178F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4155F, 3.3442F, 0.3539F, 1.0485F, -0.0307F, 0.3393F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3545F, 0.1219F, 5.2798F, -0.0308F, -0.2075F, -0.0505F));

		PartDefinition cube_r46 = leftWing5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1816F, -0.9957F, 5.5005F, 0.7413F, -0.1455F, -0.0965F));

		PartDefinition rightWing = chest.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(49, 12).mirror().addBox(-0.5F, 0.45F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 18).mirror().addBox(-0.5F, -0.15F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 58).mirror().addBox(-0.5F, -0.15F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.635F, -0.4849F, -3.7745F, 0.7366F, -0.2936F, 0.5626F));

		PartDefinition cube_r47 = rightWing.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(-0.5F, -0.775F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 54).mirror().addBox(-0.5F, -1.375F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.45F, 0.4F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(30, 10).mirror().addBox(-0.2999F, -0.1808F, -0.3248F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(27, 32).mirror().addBox(-0.2999F, -0.1808F, -1.0248F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.3532F, 3.5246F, -0.2451F, -1.8609F, -0.3527F, 0.0295F));

		PartDefinition cube_r48 = rightWing2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-0.5F, -0.4F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.2001F, 4.7376F, -1.6756F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightWing2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(14, 49).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2001F, 5.4447F, -0.9685F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(7, 41).mirror().addBox(-0.0344F, -0.3774F, -0.1857F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2991F, 5.9384F, 0.0715F, 1.021F, 0.3639F, 0.2091F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.3701F, -1.8109F, 0.1631F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.7943F, 3.8145F, -0.1429F, -0.0793F, 0.049F, -1.7392F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(15, 10).mirror().addBox(-0.6026F, -0.3279F, -0.4178F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4155F, 3.3442F, 0.3539F, 0.8739F, 0.0307F, -0.3393F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3545F, 0.1219F, 5.2798F, -0.0308F, 0.2075F, 0.0505F));

		PartDefinition cube_r50 = rightWing5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1816F, -0.9957F, 5.5005F, 0.7413F, 0.1455F, 0.0965F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3391F, -4.4983F, -0.6257F, 0.2695F, 0.0711F));

		PartDefinition cube_r51 = neck.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(65, 24).addBox(0.0F, -0.3974F, 0.3693F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 18).addBox(-0.5F, -0.1974F, -0.2307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1372F, -2.0778F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0298F, -1.8319F, -0.4678F, 0.1337F, -0.017F));

		PartDefinition cube_r52 = neck2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(65, 21).addBox(0.0F, -0.7784F, 0.1716F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 37).addBox(-0.5F, -0.5784F, -0.2034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, 0.3846F, -1.7364F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4114F, -1.7254F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r53 = neck3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(65, 55).addBox(0.0F, -0.8372F, 1.1462F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 38).addBox(-0.5F, -0.6372F, 0.6462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.825F, -2.35F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.568F, -1.5819F, -0.1191F, 0.0361F, 0.1708F));

		PartDefinition cube_r54 = neck4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(65, 58).addBox(0.0F, -0.8371F, 1.1712F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 40).addBox(-0.5F, -0.6372F, 0.6712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -0.825F, -2.35F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5475F, -1.4938F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r55 = neck5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(18, 66).addBox(0.0F, -0.8372F, 0.0712F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 61).addBox(0.0F, -0.8372F, 1.2712F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(-0.5F, -0.6372F, -0.3288F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.825F, -2.35F, -0.3491F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create().texOffs(43, 26).addBox(-0.5F, -1.2763F, -11.0779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -1.9012F, -1.7621F, 0.7024F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 33).addBox(-0.5F, -0.7F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3497F)), PartPose.offsetAndRotation(0.0F, -0.6225F, -6.6351F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(36, 22).addBox(-0.5F, -0.6393F, -1.6448F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(0.0F, -1.0514F, -4.9382F, 0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(59, 46).addBox(-1.0F, -0.5998F, -0.8147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(59, 43).addBox(-1.0F, -0.5998F, -0.6147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(0.5F, -0.6764F, -10.6632F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-0.3343F, 0.7305F, -2.569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 56).mirror().addBox(-0.3422F, 0.829F, -2.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.6503F, 0.0721F, 0.4257F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.3449F, 0.1321F, -2.6083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(56, 3).mirror().addBox(-0.337F, 0.0336F, -2.6073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 60).mirror().addBox(-0.3483F, -0.0297F, -2.3732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.3448F, 0.0721F, 0.4257F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(40, 55).mirror().addBox(-0.3681F, -0.2841F, -2.1523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(35, 55).mirror().addBox(-0.3603F, -0.3826F, -2.1513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.1703F, 0.0721F, 0.4257F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-0.3851F, -0.4293F, -1.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(50, 55).mirror().addBox(-0.3772F, -0.5278F, -1.8562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 22).mirror().addBox(-0.3942F, -0.5502F, -1.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 58).mirror().addBox(-0.4021F, -0.4517F, -1.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.0961F, 0.0721F, 0.4257F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-0.5163F, -0.4699F, -1.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(25, 55).mirror().addBox(-0.5084F, -0.5684F, -1.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 55).mirror().addBox(-0.5275F, -0.5676F, -0.8776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 25).mirror().addBox(-0.5459F, -0.5701F, -0.5245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.0524F, 0.0024F, 0.4293F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(43, 49).mirror().addBox(-0.5834F, -0.5826F, 0.2806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 55).mirror().addBox(-0.5989F, -0.554F, 0.6801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.0647F, -0.001F, 0.4287F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(49, 42).mirror().addBox(-0.6172F, -0.7312F, 1.1626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 25).mirror().addBox(-0.6327F, -0.755F, 1.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 65).mirror().addBox(-0.6439F, -0.7542F, 1.9623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.1956F, -0.001F, 0.4287F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(35, 42).mirror().addBox(-0.35F, -0.515F, -0.3478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.15F, -0.8014F, -9.4882F, -0.0262F, -0.0785F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(35, 10).mirror().addBox(-0.35F, -0.5995F, 0.939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.15F, -0.8014F, -9.4882F, -0.0916F, -0.0785F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(20, 18).mirror().addBox(-0.375F, -0.3527F, -2.5898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -1.2014F, -6.4382F, 0.0612F, -0.0523F, -0.0032F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.4F, -0.4774F, -5.249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5264F, -1.5381F, 0.0916F, -0.0349F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.4F, -0.4545F, -2.9499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5264F, -1.5381F, 0.0829F, -0.0349F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.3546F, -0.3469F, -0.3551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5264F, -2.8382F, 0.0218F, -0.0305F, 0.0001F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(44, 4).mirror().addBox(-0.3546F, -0.3469F, -0.3551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -1.5264F, -2.8382F, 0.0225F, -0.253F, -0.0049F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(59, 12).mirror().addBox(-0.4647F, -0.5316F, 0.2759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(10, 59).mirror().addBox(-0.4647F, -0.5316F, 0.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.375F, -1.2765F, -2.6767F, -1.6833F, -0.2694F, 0.2053F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(59, 9).mirror().addBox(-0.4647F, -0.6375F, -0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(59, 6).mirror().addBox(-0.4647F, -0.6375F, -0.248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.375F, -1.2765F, -2.6767F, -1.8709F, -0.2694F, 0.2053F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-0.4647F, -0.5799F, -0.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.375F, -1.2765F, -2.6767F, -1.5654F, -0.2694F, 0.2053F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-0.3636F, -0.457F, -5.2105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.0514F, -2.1131F, -0.1353F, -0.1004F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(42, 12).mirror().addBox(-0.3636F, -0.535F, -2.9153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.0514F, -2.1131F, -0.1047F, -0.1004F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(42, 8).mirror().addBox(-0.3636F, -0.5851F, -1.6436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.825F, -0.0514F, -2.1131F, -0.0654F, -0.1004F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 65).addBox(-0.3561F, -0.7542F, 1.9623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 25).addBox(-0.3673F, -0.755F, 1.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 42).addBox(-0.3828F, -0.7312F, 1.1626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.1956F, 0.001F, -0.4287F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 55).addBox(-0.4011F, -0.554F, 0.6801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(43, 49).addBox(-0.4166F, -0.5826F, 0.2806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.0647F, 0.001F, -0.4287F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(55, 25).addBox(-0.4541F, -0.5701F, -0.5245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 55).addBox(-0.4725F, -0.5676F, -0.8776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 58).addBox(-0.4837F, -0.4699F, -1.2564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(25, 55).addBox(-0.4916F, -0.5684F, -1.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.0524F, -0.0024F, -0.4293F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(54, 52).mirror().addBox(-0.5623F, -0.7626F, -0.2466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.4839F, -8.6368F, -0.6319F, -0.001F, 0.4287F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(20, 60).mirror().addBox(-0.848F, 0.2731F, -3.6954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.7767F, -5.2911F, -0.6409F, -0.0206F, 0.4319F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(54, 52).addBox(-0.4377F, -0.7626F, -0.2466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.6319F, 0.001F, -0.4287F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(20, 60).addBox(-0.152F, 0.2731F, -3.6954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.475F, 0.7767F, -5.2911F, -0.6409F, 0.0206F, -0.4319F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5979F, -0.4517F, -1.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(55, 22).addBox(-0.6058F, -0.5502F, -1.5534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 55).addBox(-0.6149F, -0.4293F, -1.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(50, 55).addBox(-0.6228F, -0.5278F, -1.8562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.0961F, -0.0721F, -0.4257F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(10, 56).addBox(-0.6578F, 0.829F, -2.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(30, 55).addBox(-0.6657F, 0.7305F, -2.569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.6503F, -0.0721F, -0.4257F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(56, 0).addBox(-0.6551F, 0.1321F, -2.6083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(56, 3).addBox(-0.663F, 0.0336F, -2.6073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 60).addBox(-0.6517F, -0.0297F, -2.3732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.3448F, -0.0721F, -0.4257F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(40, 55).addBox(-0.6319F, -0.2841F, -2.1523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(35, 55).addBox(-0.6397F, -0.3826F, -2.1513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1358F, -0.4839F, -8.6368F, -0.1703F, -0.0721F, -0.4257F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(59, 52).addBox(-1.0F, -0.4036F, -0.7822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F))
				.texOffs(59, 40).addBox(-1.0F, -0.4036F, -0.5822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5F, -0.9514F, -10.6882F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(42, 42).addBox(-1.0F, -0.4005F, -1.5596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(0.5F, -1.0264F, -9.5131F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(43, 22).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -0.907F, -8.8394F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 18).addBox(-0.625F, -0.3527F, -2.5898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.25F, -1.2014F, -6.4382F, 0.0612F, 0.0523F, 0.0032F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(19, 5).addBox(-1.0F, -0.3527F, -2.5898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.5F, -1.2014F, -6.4382F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 28).addBox(-0.6F, -0.4774F, -5.249F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4F, -1.5264F, -1.5381F, 0.0916F, 0.0349F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(44, 0).addBox(-0.6F, -0.4545F, -2.9499F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4F, -1.5264F, -1.5381F, 0.0829F, 0.0349F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(19, 44).addBox(-0.6454F, -0.3469F, -0.3551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4F, -1.5264F, -2.8382F, 0.0218F, 0.0305F, -0.0001F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(44, 4).addBox(-0.6454F, -0.3469F, -0.3551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.4F, -1.5264F, -2.8382F, 0.0225F, 0.253F, 0.0049F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(27, 23).addBox(-1.0F, -0.3617F, -2.6235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -1.4014F, -4.1631F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -0.3469F, -1.6543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -1.5264F, -2.8382F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(35, 42).addBox(-0.65F, -0.515F, -0.3478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.15F, -0.8014F, -9.4882F, -0.0262F, 0.0785F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(35, 10).addBox(-0.65F, -0.5995F, 0.939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.15F, -0.8014F, -9.4882F, -0.0916F, 0.0785F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 23).addBox(-0.6364F, -0.457F, -5.2105F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.825F, -0.0514F, -2.1131F, -0.1353F, 0.1004F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(42, 12).addBox(-0.6364F, -0.535F, -2.9153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.825F, -0.0514F, -2.1131F, -0.1047F, 0.1004F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(42, 8).addBox(-0.6364F, -0.5851F, -1.6436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.825F, -0.0514F, -2.1131F, -0.0654F, 0.1004F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(59, 12).addBox(-0.5353F, -0.5316F, 0.2759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(10, 59).addBox(-0.5353F, -0.5316F, 0.1509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.375F, -1.2765F, -2.6767F, -1.6833F, 0.2694F, -0.2053F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(59, 9).addBox(-0.5353F, -0.6375F, -0.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(59, 6).addBox(-0.5353F, -0.6375F, -0.248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.375F, -1.2765F, -2.6767F, -1.8709F, 0.2694F, -0.2053F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(55, 58).addBox(-0.5353F, -0.5799F, -0.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.375F, -1.2765F, -2.6767F, -1.5654F, 0.2694F, -0.2053F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(12, 41).addBox(-1.0F, -0.3469F, -0.3543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.5F, -1.5264F, -2.8382F, 0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F, -0.247F, -1.6544F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.5264F, -0.1631F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(36, 26).addBox(-1.0F, -0.2681F, -0.7379F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -1.2726F, 0.34F, -0.528F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(35, 14).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.9226F, 0.34F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(45, 19).addBox(-1.0F, -0.2428F, -0.7675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -0.3886F, 0.644F, -1.741F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -0.2293F, -0.7735F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0864F, 0.469F, -1.9504F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 0).addBox(0.0F, -0.6F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, -0.1636F, -0.056F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(19, 48).addBox(-1.0F, -0.8564F, -0.1518F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.5177F, -0.6651F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-1.15F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 49).addBox(0.15F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.2144F, -1.293F, -1.0516F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(47, 46).addBox(-1.0F, -0.5F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0F, -0.1177F, -0.9151F, -1.3134F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 58).addBox(-0.5F, -0.9683F, -0.4556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6292F, -1.6789F, 0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(45, 16).addBox(-1.0F, -0.1529F, -0.1371F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7292F, 0.2711F, -1.357F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(33, 46).addBox(-1.0F, -0.1377F, -0.1223F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -1.1541F, -0.3039F, -0.6152F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(64, 9).mirror().addBox(-0.66F, -0.2496F, -0.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 64).mirror().addBox(-0.66F, -0.2496F, -1.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(64, 12).mirror().addBox(-0.66F, -0.2496F, -0.7252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 61).mirror().addBox(-0.475F, -0.8746F, -1.4502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(60, 58).mirror().addBox(-0.475F, -0.8746F, -0.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(0, 61).addBox(0.575F, -0.8746F, -1.4502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(25, 64).addBox(0.76F, -0.2496F, -1.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(64, 12).addBox(0.76F, -0.2496F, -0.7252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(64, 9).addBox(0.76F, -0.2496F, -0.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 58).addBox(0.575F, -0.8746F, -0.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.55F, -0.3888F, -0.3649F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 24).mirror().addBox(-0.5F, -0.1686F, -0.1394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)).mirror(false)
				.texOffs(60, 55).mirror().addBox(-0.5F, -0.1686F, 0.1606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 55).addBox(0.55F, -0.1686F, 0.1606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 24).addBox(0.55F, -0.1686F, -0.1394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)), PartPose.offsetAndRotation(-0.525F, -1.3888F, -1.2149F, -0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)).mirror(false)
				.texOffs(61, 0).addBox(0.55F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)), PartPose.offsetAndRotation(-0.525F, -0.4638F, -1.4303F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(61, 3).mirror().addBox(-0.5F, -0.8361F, -0.1764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(61, 3).addBox(0.55F, -0.8361F, -0.1764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.525F, -0.5888F, -1.9553F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.5F, -0.1578F, -0.8731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 21).addBox(0.55F, -0.1578F, -0.8731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.525F, -1.4138F, -1.1899F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.3875F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(25, 61).mirror().addBox(-0.4975F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 61).addBox(0.7225F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 61).addBox(0.6125F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6125F, -0.8426F, -1.1406F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(29, 18).addBox(-1.0F, -0.8433F, -0.5306F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F))
				.texOffs(26, 48).addBox(-1.0F, -0.1433F, -0.5306F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6292F, -1.6789F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(40, 46).addBox(-1.0F, -0.625F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, -0.2042F, -1.9539F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4704F, -1.242F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(33, 49).mirror().addBox(-0.372F, -1.4894F, -1.9427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 0.3063F, -4.0491F, 0.6676F, -0.0829F, -0.0004F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(11, 18).mirror().addBox(-0.372F, -0.5038F, -4.3798F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 0.3063F, -4.0491F, 0.0916F, -0.0829F, -0.0004F));

		PartDefinition cube_r132 = jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.429F, -0.2269F, -1.4376F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(51, 31).mirror().addBox(-0.429F, -0.2269F, -1.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, 0.074F, -0.0263F, -0.0046F));

		PartDefinition cube_r133 = jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.429F, -0.0561F, -1.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(39, 52).mirror().addBox(-0.429F, -0.0561F, -1.9748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, -0.0656F, -0.0263F, -0.0046F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-0.429F, -0.5156F, -2.0617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 52).mirror().addBox(-0.429F, -0.5156F, -1.8617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, 0.218F, -0.0263F, -0.0046F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(49, 52).mirror().addBox(-0.429F, -0.3442F, -0.665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(37, 34).mirror().addBox(-0.429F, -0.4442F, -1.665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, 0.1613F, -0.0263F, -0.0046F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(37, 30).mirror().addBox(-0.372F, -0.8513F, -4.5605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, 0.1353F, -0.0829F, -0.0004F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(14, 33).mirror().addBox(-0.372F, -0.5685F, -3.2943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, 0.0393F, -0.0829F, -0.0004F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.372F, -0.6321F, -2.6094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, 0.0785F, -0.0829F, -0.0004F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(18, 23).mirror().addBox(-0.3F, -0.7765F, -3.2202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2617F, -1.5495F, 0.0742F, -0.0611F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(14, 37).mirror().addBox(-1.0F, -0.3556F, -1.6575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(14, 37).addBox(0.0F, -0.3556F, -1.6575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.0F, -0.1844F, -0.844F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-0.486F, 0.1725F, 0.9575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(15, 54).mirror().addBox(-0.4781F, 0.074F, 0.9585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, -2.6605F, -0.0132F, -0.3186F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(38, 49).mirror().addBox(-0.256F, -0.3068F, 1.9434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2617F, -1.5495F, -3.1054F, -0.061F, -0.3149F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-0.3152F, -0.3114F, -0.1602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 55).mirror().addBox(-0.3201F, -0.3166F, 0.2181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 61).mirror().addBox(-0.3475F, -0.3538F, 2.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 61).mirror().addBox(-0.3363F, -0.309F, 2.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, -3.0986F, -0.0817F, -0.3157F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-0.325F, -0.227F, 0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, -3.0114F, -0.0817F, -0.3157F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-0.3369F, -0.2955F, 0.9961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 61).mirror().addBox(-0.3489F, -0.3073F, 1.4027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 61).mirror().addBox(-0.3559F, -0.3103F, 1.7067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, -3.0637F, -0.0817F, -0.3157F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(61, 36).mirror().addBox(-0.3012F, 0.174F, 2.6946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, -2.9396F, -0.0669F, -0.3152F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 61).mirror().addBox(-0.3235F, 0.254F, 3.0705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, -2.9134F, -0.0669F, -0.3152F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(61, 33).mirror().addBox(-0.3194F, -0.2133F, 3.4149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.3063F, -4.0491F, -3.0487F, -0.0669F, -0.3152F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-0.4175F, -0.4481F, -0.4101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(61, 30).mirror().addBox(-0.4254F, -0.3495F, -0.4111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(35, 58).mirror().addBox(-0.4201F, -0.4464F, -0.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(61, 27).mirror().addBox(-0.4279F, -0.3479F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, -3.0663F, -0.0132F, -0.3186F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-0.4315F, -0.2952F, 0.1611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(56, 31).mirror().addBox(-0.4236F, -0.3937F, 0.1621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, -2.9834F, -0.0132F, -0.3186F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-0.4272F, -0.3078F, 0.4262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 58).mirror().addBox(-0.4351F, -0.2093F, 0.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, -2.9136F, -0.0132F, -0.3186F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 53).mirror().addBox(-0.4616F, 0.0077F, 0.658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)).mirror(false)
				.texOffs(51, 3).mirror().addBox(-0.4537F, -0.0908F, 0.659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.4063F, -8.1741F, -2.739F, -0.0132F, -0.3186F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 28).mirror().addBox(-0.3F, -0.6717F, -2.9437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(9, 23).mirror().addBox(-0.3F, -0.6717F, -2.6437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2617F, -1.5495F, 0.0349F, -0.0611F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.6284F, -0.2877F, 1.7915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 64).mirror().addBox(-0.6284F, -0.2877F, 1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(-0.6284F, -0.2877F, 0.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3455F, -1.9259F, 0.1181F, -0.0541F, 0.0207F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3455F, -1.9259F, -0.1902F, -0.314F, -0.0113F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(33, 49).addBox(-0.628F, -1.4894F, -1.9427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(0.525F, 0.3063F, -4.0491F, 0.6676F, 0.0829F, 0.0004F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(11, 18).addBox(-0.628F, -0.5038F, -4.3798F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.525F, 0.3063F, -4.0491F, 0.0916F, 0.0829F, 0.0004F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 38).addBox(-0.571F, -0.2269F, -1.4376F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(51, 31).addBox(-0.571F, -0.2269F, -1.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, 0.074F, 0.0263F, 0.0046F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(44, 52).addBox(-0.571F, -0.0561F, -1.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(39, 52).addBox(-0.571F, -0.0561F, -1.9748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, -0.0656F, 0.0263F, 0.0046F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(5, 52).addBox(-0.571F, -0.5156F, -2.0617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 52).addBox(-0.571F, -0.5156F, -1.8617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, 0.218F, 0.0263F, 0.0046F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(49, 52).addBox(-0.571F, -0.3442F, -0.665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(37, 34).addBox(-0.571F, -0.4442F, -1.665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, 0.1613F, 0.0263F, 0.0046F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(37, 30).addBox(-0.628F, -0.8513F, -4.5605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, 0.1353F, 0.0829F, 0.0004F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(14, 33).addBox(-0.628F, -0.5685F, -3.2943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, 0.0393F, 0.0829F, 0.0004F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(19, 0).addBox(-0.628F, -0.6321F, -2.6094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, 0.0785F, 0.0829F, 0.0004F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(18, 23).addBox(-0.7F, -0.7765F, -3.2202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7F, 0.2617F, -1.5495F, 0.0742F, 0.0611F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(24, 51).mirror().addBox(-0.4F, -0.3238F, -0.5493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(19, 51).mirror().addBox(-0.4F, -0.3238F, -0.8493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -0.0594F, 0.231F, -0.0527F, -0.0957F, 0.0071F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(52, 19).mirror().addBox(-0.4F, -0.4054F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -0.0594F, 0.231F, -0.14F, -0.0957F, 0.0071F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(37, 4).mirror().addBox(-0.4F, -0.35F, -2.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -0.0594F, 0.231F, -0.0003F, -0.0957F, 0.0071F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(34, 52).mirror().addBox(-0.4F, -0.49F, -1.4314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -0.0594F, 0.231F, 0.0084F, -0.0957F, 0.0071F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(29, 52).mirror().addBox(-0.4F, -0.4561F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -0.0594F, 0.231F, -0.0352F, -0.0957F, 0.0071F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(34, 52).addBox(-0.6F, -0.49F, -1.4314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.775F, -0.0594F, 0.231F, 0.0084F, 0.0957F, -0.0071F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(29, 52).addBox(-0.6F, -0.4561F, -1.1364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.775F, -0.0594F, 0.231F, -0.0352F, 0.0957F, -0.0071F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(52, 19).addBox(-0.6F, -0.4054F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.775F, -0.0594F, 0.231F, -0.14F, 0.0957F, -0.0071F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(24, 51).addBox(-0.6F, -0.3238F, -0.5493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(19, 51).addBox(-0.6F, -0.3238F, -0.8493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.775F, -0.0594F, 0.231F, -0.0527F, 0.0957F, -0.0071F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(54, 12).addBox(-0.514F, 0.1725F, 0.9575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(15, 54).addBox(-0.5219F, 0.074F, 0.9585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, -2.6605F, 0.0132F, 0.3186F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(38, 49).addBox(-0.744F, -0.3068F, 1.9434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7F, 0.2617F, -1.5495F, -3.1054F, 0.061F, 0.3149F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(51, 34).addBox(-0.6848F, -0.3114F, -0.1602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 55).addBox(-0.6799F, -0.3166F, 0.2181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 61).addBox(-0.6525F, -0.3538F, 2.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 61).addBox(-0.6637F, -0.309F, 2.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, -3.0986F, 0.0817F, 0.3157F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(50, 22).addBox(-0.675F, -0.227F, 0.5766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, -3.0114F, 0.0817F, 0.3157F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(56, 34).addBox(-0.663F, -0.2955F, 0.9961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 61).addBox(-0.6511F, -0.3073F, 1.4027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 61).addBox(-0.6441F, -0.3103F, 1.7067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, -3.0637F, 0.0817F, 0.3157F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(61, 36).addBox(-0.6988F, 0.174F, 2.6946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, -2.9396F, 0.0669F, 0.3152F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(35, 61).addBox(-0.6765F, 0.254F, 3.0705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, -2.9134F, 0.0669F, 0.3152F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(61, 33).addBox(-0.6806F, -0.2133F, 3.4149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.475F, 0.3063F, -4.0491F, -3.0487F, 0.0669F, 0.3152F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(30, 61).addBox(-0.5825F, -0.4481F, -0.4101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(61, 30).addBox(-0.5746F, -0.3495F, -0.4111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(35, 58).addBox(-0.5799F, -0.4464F, -0.106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(61, 27).addBox(-0.5721F, -0.3479F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, -3.0663F, 0.0132F, 0.3186F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(40, 58).addBox(-0.5685F, -0.2952F, 0.1611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(56, 31).addBox(-0.5764F, -0.3937F, 0.1621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, -2.9834F, 0.0132F, 0.3186F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(56, 28).addBox(-0.5728F, -0.3078F, 0.4262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(30, 58).addBox(-0.565F, -0.2093F, 0.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, -2.9136F, 0.0132F, 0.3186F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(10, 53).addBox(-0.5384F, 0.0077F, 0.658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.405F))
				.texOffs(51, 3).addBox(-0.5463F, -0.0908F, 0.659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.125F, 0.4063F, -8.1741F, -2.739F, 0.0132F, 0.3186F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(51, 28).addBox(-0.7F, -0.6717F, -2.9437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(9, 23).addBox(-0.7F, -0.6717F, -2.6437F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.7F, 0.2617F, -1.5495F, 0.0349F, 0.0611F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(64, 6).addBox(-0.3716F, -0.2877F, 1.7915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 64).addBox(-0.3716F, -0.2877F, 1.3915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 64).addBox(-0.3716F, -0.2877F, 0.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.3455F, -1.9259F, 0.1181F, 0.0541F, -0.0207F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(44, 34).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.3455F, -1.9259F, -0.1902F, 0.314F, 0.0113F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(37, 4).addBox(-0.6F, -0.35F, -2.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(0.775F, -0.0594F, 0.231F, -0.0003F, 0.0957F, -0.0071F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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