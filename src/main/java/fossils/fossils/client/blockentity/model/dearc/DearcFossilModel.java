package fossils.fossils.client.blockentity.model.dearc;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DearcFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4membrance;
	private final ModelPart leftwing3membrance;
	private final ModelPart leftwing1membrance;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart righthand2;
	private final ModelPart rightwing4membrance;
	private final ModelPart rightwing3membrance;
	private final ModelPart rightwing1membrance;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
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
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone7;
	private final ModelPart jaw;

	public DearcFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.leftwing1 = this.chest.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing7 = this.leftwing5.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.lefthand2 = this.leftwing4.getChild("lefthand2");
		this.leftwing4membrance = this.leftwing4.getChild("leftwing4membrance");
		this.leftwing3membrance = this.leftwing2.getChild("leftwing3membrance");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.chest.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing7 = this.rightwing5.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.righthand2 = this.rightwing4.getChild("righthand2");
		this.rightwing4membrance = this.rightwing4.getChild("rightwing4membrance");
		this.rightwing3membrance = this.rightwing2.getChild("rightwing3membrance");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.body3 = this.chest.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body1 = this.body.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
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
		this.bone = this.body1.getChild("bone");
		this.bone6 = this.body1.getChild("bone6");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.head.getChild("rightFace");
		this.bone7 = this.rightFace.getChild("bone7");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.6804F, 2.2668F, 0.699F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(108, 35).addBox(-0.8F, -0.8754F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck5_r1 = chest.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(90, 112).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.339F, 0.188F, -0.4595F));

		PartDefinition neck7_r1 = chest.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-3.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.0366F, 0.3675F, -1.4915F));

		PartDefinition neck6_r1 = chest.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(109, 101).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.2206F, 0.2985F, -0.9413F));

		PartDefinition neck4_r1 = chest.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(90, 112).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.339F, -0.188F, 0.4595F));

		PartDefinition neck6_r2 = chest.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(79, 61).addBox(0.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.0366F, -0.3675F, 1.4915F));

		PartDefinition neck5_r2 = chest.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(109, 101).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.2206F, -0.2985F, 0.9413F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(108, 38).addBox(-0.5F, 0.7785F, -2.5275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 4.6274F, 0.4229F, -0.5411F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(94, 47).addBox(-0.5F, 0.1004F, -2.283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.6274F, 0.4229F, -0.192F, 0.0F, 0.0F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(5, 91).addBox(-0.5F, -0.047F, -0.8298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F))
				.texOffs(26, 76).addBox(-1.5F, -1.272F, 0.7702F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F))
				.texOffs(13, 76).addBox(-1.5F, -0.572F, 0.7702F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F))
				.texOffs(74, 0).addBox(-1.0F, -0.422F, -1.8298F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.6274F, 0.4229F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(77, 68).addBox(-1.5F, -0.3338F, -0.4115F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 4.6274F, 0.4229F, 0.288F, 0.0F, 0.0F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(77, 64).addBox(-1.5F, -0.7169F, -0.5038F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.6274F, 0.4229F, 0.5934F, 0.0F, 0.0F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(9, 81).addBox(-0.5F, -0.7553F, -2.8856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.5F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(72, 80).addBox(-0.5F, -0.7553F, -2.8856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6239F, 1.1481F, -1.3634F, -0.2693F, -0.5634F, -0.2791F));

		PartDefinition upperwing11_r1 = leftwing1.addOrReplaceChild("upperwing11_r1", CubeListBuilder.create().texOffs(111, 19).addBox(-0.9F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(-0.1741F, 0.6179F, -1.1426F, -1.1556F, 0.3215F, 0.1384F));

		PartDefinition upperwing13_r1 = leftwing1.addOrReplaceChild("upperwing13_r1", CubeListBuilder.create().texOffs(100, 7).addBox(-0.3F, -1.175F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.9872F, 0.5434F, -0.9627F, -1.1779F, 0.0322F, 0.0134F));

		PartDefinition upperwing12_r1 = leftwing1.addOrReplaceChild("upperwing12_r1", CubeListBuilder.create().texOffs(21, 63).addBox(-0.625F, -0.875F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.086F)), PartPose.offsetAndRotation(1.9872F, 0.5434F, -0.9627F, -1.1776F, 0.0484F, 0.0201F));

		PartDefinition upperwing11_r2 = leftwing1.addOrReplaceChild("upperwing11_r2", CubeListBuilder.create().texOffs(31, 95).addBox(-1.0F, -1.275F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.44F, 0.3168F, -0.4157F, -1.1688F, -0.2094F, -0.0881F));

		PartDefinition upperwing10_r1 = leftwing1.addOrReplaceChild("upperwing10_r1", CubeListBuilder.create().texOffs(96, 89).addBox(-1.425F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.388F, 0.2643F, -0.2888F, -1.1356F, -0.4328F, -0.1926F));

		PartDefinition upperwing21_r1 = leftwing1.addOrReplaceChild("upperwing21_r1", CubeListBuilder.create().texOffs(107, 60).addBox(-0.2028F, -0.7112F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(107, 57).addBox(-0.8028F, -0.7112F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(7.4846F, 1.0665F, -2.2541F, 0.8863F, -0.9207F, -2.5655F));

		PartDefinition upperwing19_r1 = leftwing1.addOrReplaceChild("upperwing19_r1", CubeListBuilder.create().texOffs(15, 107).addBox(0.2125F, -0.2594F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(7.4846F, 1.0665F, -2.2541F, 1.1776F, 0.0484F, 3.1215F));

		PartDefinition upperwing18_r1 = leftwing1.addOrReplaceChild("upperwing18_r1", CubeListBuilder.create().texOffs(79, 94).addBox(-0.15F, -3.025F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(4.9065F, 0.1674F, -0.0549F, 0.968F, 0.8299F, 2.6717F));

		PartDefinition upperwing17_r1 = leftwing1.addOrReplaceChild("upperwing17_r1", CubeListBuilder.create().texOffs(40, 99).addBox(-0.65F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(4.0414F, 0.2976F, -0.3693F, 0.4975F, 1.1202F, 2.1136F));

		PartDefinition upperwing16_r1 = leftwing1.addOrReplaceChild("upperwing16_r1", CubeListBuilder.create().texOffs(101, 19).addBox(-0.675F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.7064F, 0.123F, 0.0523F, 0.8137F, 0.9798F, 2.4763F));

		PartDefinition upperwing15_r1 = leftwing1.addOrReplaceChild("upperwing15_r1", CubeListBuilder.create().texOffs(65, 101).addBox(-1.0F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.3741F, -0.0325F, 0.4278F, 0.9786F, 0.8154F, 2.6861F));

		PartDefinition upperwing14_r1 = leftwing1.addOrReplaceChild("upperwing14_r1", CubeListBuilder.create().texOffs(66, 96).addBox(-0.9F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(0.6495F, -0.7621F, 2.1892F, 1.1732F, 0.1531F, 3.0776F));

		PartDefinition upperwing13_r2 = leftwing1.addOrReplaceChild("upperwing13_r2", CubeListBuilder.create().texOffs(40, 113).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.1849F, -0.5129F, 1.5875F, 1.1001F, -0.5663F, -2.8751F));

		PartDefinition upperwing12_r2 = leftwing1.addOrReplaceChild("upperwing12_r2", CubeListBuilder.create().texOffs(113, 37).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.005F, -0.2146F, 0.8673F, -0.4975F, -1.1202F, -1.028F));

		PartDefinition upperwing11_r3 = leftwing1.addOrReplaceChild("upperwing11_r3", CubeListBuilder.create().texOffs(0, 99).addBox(-1.2F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.754F, -0.0527F, 0.4764F, 0.7954F, -0.9924F, -2.4544F));

		PartDefinition upperwing10_r2 = leftwing1.addOrReplaceChild("upperwing10_r2", CubeListBuilder.create().texOffs(110, 110).addBox(0.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.388F, 0.2643F, -0.2888F, -0.6279F, -1.0782F, -0.8816F));

		PartDefinition upperwing9_r1 = leftwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(94, 98).addBox(-1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.388F, 0.2643F, -0.2888F, -1.084F, -0.6128F, -0.2955F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(74, 7).addBox(-0.6789F, -0.0386F, -0.9429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.8956F, 1.2725F, -2.9097F, -1.6922F, 0.0476F, -2.2988F));

		PartDefinition wing9_r1 = leftwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9072F, -2.9026F, 0.0369F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2283F, 2.864F, -0.1798F, 0.0F, 0.0F, -0.0436F));

		PartDefinition wing9_r2 = leftwing2.addOrReplaceChild("wing9_r2", CubeListBuilder.create().texOffs(84, 98).addBox(-2.5548F, -1.0755F, 0.92F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0414F, 11.2822F, 1.3787F, 0.0F, -1.5708F, 0.3229F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(94, 101).addBox(-2.5548F, 1.7769F, 0.3196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.0414F, 11.2822F, 1.3787F, 0.0F, -1.5708F, 0.6283F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(18, 81).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.3217F, 14.0602F, -0.5822F, 0.3528F, -0.046F, 0.642F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3791F, 2.9475F, 1.0493F, -0.6456F, -0.9275F, -0.3011F));

		PartDefinition wingfingerbase8_r1 = leftwing4.addOrReplaceChild("wingfingerbase8_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0774F, 0.4648F, 8.2938F, 0.0F, 0.0698F, 0.0F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4796F, -0.2223F, -0.3165F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7428F, 0.146F, 17.5979F, 0.2811F, 0.1746F, 0.2374F));

		PartDefinition leftwing7 = leftwing5.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(39, 36).addBox(-0.5845F, -0.4416F, -0.2015F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0882F, 0.2661F, 15.3467F, 0.2781F, -0.0982F, 0.1593F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0153F, -0.5852F, -0.193F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4416F, 0.2233F, 14.6241F, 0.1909F, -0.1164F, 0.1604F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8201F, 0.4836F, 8.746F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition lefthand2 = leftwing4.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5543F, -0.3751F, -0.1647F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6067F, 0.3578F, 1.0692F, -0.0747F, 1.2055F, 1.2052F));

		PartDefinition leftwing4membrance = leftwing4.addOrReplaceChild("leftwing4membrance", CubeListBuilder.create(), PartPose.offset(-11.3799F, 3.7836F, 4.346F));

		PartDefinition leftwing3membrance = leftwing2.addOrReplaceChild("leftwing3membrance", CubeListBuilder.create(), PartPose.offset(0.8397F, 0.1609F, 0.9501F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3497F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6239F, 1.1481F, -1.3634F, -0.201F, 0.5376F, 0.0765F));

		PartDefinition upperwing12_r3 = rightwing1.addOrReplaceChild("upperwing12_r3", CubeListBuilder.create().texOffs(112, 6).addBox(-0.1F, -0.275F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(0.1741F, 0.6179F, -1.1426F, -1.1556F, -0.3215F, -0.1384F));

		PartDefinition upperwing14_r2 = rightwing1.addOrReplaceChild("upperwing14_r2", CubeListBuilder.create().texOffs(100, 10).addBox(-1.7F, -1.175F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.9872F, 0.5434F, -0.9627F, -1.1779F, -0.0322F, -0.0134F));

		PartDefinition upperwing13_r3 = rightwing1.addOrReplaceChild("upperwing13_r3", CubeListBuilder.create().texOffs(79, 20).addBox(-3.375F, -0.875F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.086F)), PartPose.offsetAndRotation(-1.9872F, 0.5434F, -0.9627F, -1.1776F, -0.0484F, -0.0201F));

		PartDefinition upperwing12_r4 = rightwing1.addOrReplaceChild("upperwing12_r4", CubeListBuilder.create().texOffs(38, 95).addBox(-1.0F, -1.275F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-1.44F, 0.3168F, -0.4157F, -1.1688F, 0.2094F, 0.0881F));

		PartDefinition upperwing11_r4 = rightwing1.addOrReplaceChild("upperwing11_r4", CubeListBuilder.create().texOffs(55, 98).addBox(-0.575F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.388F, 0.2643F, -0.2888F, -1.1356F, 0.4328F, 0.1926F));

		PartDefinition upperwing22_r1 = rightwing1.addOrReplaceChild("upperwing22_r1", CubeListBuilder.create().texOffs(107, 66).addBox(-0.7972F, -0.7112F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(107, 63).addBox(-0.1972F, -0.7112F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(-7.4846F, 1.0665F, -2.2541F, 0.8863F, 0.9207F, 2.5655F));

		PartDefinition upperwing20_r1 = rightwing1.addOrReplaceChild("upperwing20_r1", CubeListBuilder.create().texOffs(107, 16).addBox(-1.2125F, -0.2594F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(-7.4846F, 1.0665F, -2.2541F, 1.1776F, -0.0484F, -3.1215F));

		PartDefinition upperwing19_r2 = rightwing1.addOrReplaceChild("upperwing19_r2", CubeListBuilder.create().texOffs(96, 32).addBox(-0.85F, -3.025F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-4.9065F, 0.1674F, -0.0549F, 0.968F, -0.8299F, -2.6717F));

		PartDefinition upperwing18_r2 = rightwing1.addOrReplaceChild("upperwing18_r2", CubeListBuilder.create().texOffs(78, 99).addBox(-0.35F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-4.0414F, 0.2976F, -0.3693F, 0.4975F, -1.1202F, -2.1136F));

		PartDefinition upperwing17_r2 = rightwing1.addOrReplaceChild("upperwing17_r2", CubeListBuilder.create().texOffs(101, 27).addBox(-0.325F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-2.7064F, 0.123F, 0.0523F, 0.8137F, -0.9798F, -2.4763F));

		PartDefinition upperwing16_r2 = rightwing1.addOrReplaceChild("upperwing16_r2", CubeListBuilder.create().texOffs(70, 101).addBox(0.0F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.3741F, -0.0325F, 0.4278F, 0.9786F, -0.8154F, -2.6861F));

		PartDefinition upperwing15_r2 = rightwing1.addOrReplaceChild("upperwing15_r2", CubeListBuilder.create().texOffs(50, 98).addBox(-0.1F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(-0.6495F, -0.7621F, 2.1892F, 1.1732F, -0.1531F, -3.0776F));

		PartDefinition upperwing14_r3 = rightwing1.addOrReplaceChild("upperwing14_r3", CubeListBuilder.create().texOffs(50, 113).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.1849F, -0.5129F, 1.5875F, 1.1001F, 0.5663F, 2.8751F));

		PartDefinition upperwing13_r4 = rightwing1.addOrReplaceChild("upperwing13_r4", CubeListBuilder.create().texOffs(45, 113).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.005F, -0.2146F, 0.8673F, -0.4975F, 1.1202F, 1.028F));

		PartDefinition upperwing12_r5 = rightwing1.addOrReplaceChild("upperwing12_r5", CubeListBuilder.create().texOffs(28, 99).addBox(-0.8F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.754F, -0.0527F, 0.4764F, 0.7954F, 0.9924F, 2.4544F));

		PartDefinition upperwing11_r5 = rightwing1.addOrReplaceChild("upperwing11_r5", CubeListBuilder.create().texOffs(112, 3).addBox(-1.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.388F, 0.2643F, -0.2888F, -0.6279F, 1.0782F, 0.8816F));

		PartDefinition upperwing10_r3 = rightwing1.addOrReplaceChild("upperwing10_r3", CubeListBuilder.create().texOffs(7, 99).addBox(-0.6F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.388F, 0.2643F, -0.2888F, -1.084F, 0.6128F, 0.2955F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(57, 74).addBox(-0.3211F, -0.0386F, -0.9429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.8956F, 1.2725F, -2.9097F, -1.6922F, -0.0476F, 2.2988F));

		PartDefinition wing10_r1 = rightwing2.addOrReplaceChild("wing10_r1", CubeListBuilder.create().texOffs(67, 74).addBox(-0.0928F, -2.9026F, 0.0369F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2283F, 2.864F, -0.1798F, 0.0F, 0.0F, 0.0436F));

		PartDefinition wing10_r2 = rightwing2.addOrReplaceChild("wing10_r2", CubeListBuilder.create().texOffs(35, 99).addBox(1.5548F, -1.0755F, 0.92F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0414F, 11.2822F, 1.3787F, 0.0F, 1.5708F, -0.3229F));

		PartDefinition wing9_r3 = rightwing2.addOrReplaceChild("wing9_r3", CubeListBuilder.create().texOffs(101, 98).addBox(1.5548F, 1.7769F, 0.3196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-3.0414F, 11.2822F, 1.3787F, 0.0F, 1.5708F, -0.6283F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.1481F, 13.9428F, -0.7064F, 0.3528F, 0.046F, -0.642F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3791F, 2.9475F, 1.0493F, -0.6456F, 0.9275F, 0.3011F));

		PartDefinition wingfingerbase9_r1 = rightwing4.addOrReplaceChild("wingfingerbase9_r1", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 18.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0774F, 0.4648F, 8.2938F, 0.0F, -0.0698F, 0.0F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(39, 18).addBox(-0.5204F, -0.2223F, -0.3165F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7428F, 0.146F, 17.5979F, 0.2811F, -0.1746F, -0.2374F));

		PartDefinition rightwing7 = rightwing5.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(0, 40).addBox(-0.4155F, -0.4415F, -0.2015F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0882F, 0.2661F, 15.3467F, 0.2781F, 0.0982F, -0.1593F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create().texOffs(58, 53).addBox(0.0153F, -0.5852F, -0.193F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4416F, 0.2233F, 14.6241F, 0.1909F, 0.1164F, -0.1604F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8201F, 0.4836F, 8.746F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition righthand2 = rightwing4.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(72, 36).addBox(-2.4457F, -0.3751F, -0.1647F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.821F, 0.7955F, 1.1011F, -0.2942F, -1.1894F, -0.9696F));

		PartDefinition rightwing4membrance = rightwing4.addOrReplaceChild("rightwing4membrance", CubeListBuilder.create(), PartPose.offset(11.3799F, 3.7836F, 4.346F));

		PartDefinition rightwing3membrance = rightwing2.addOrReplaceChild("rightwing3membrance", CubeListBuilder.create(), PartPose.offset(-0.8397F, 0.1609F, 0.9501F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3497F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2719F, 1.4222F, -1.0716F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 104).addBox(-0.937F, -0.943F, -0.5762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8507F, -1.0418F, -0.6874F, 1.148F, -1.1057F, -1.1623F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 86).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0218F, 0.0892F, -1.2457F, 1.6188F, -0.9012F, -1.3058F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 105).addBox(-0.5824F, -1.1929F, -0.2042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1208F, -0.4364F, -0.7674F, -0.7676F, -1.3122F, 0.8107F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 59).addBox(1.4616F, -0.4618F, -0.0893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1041F, -1.4023F, -1.2333F, 0.4275F, 0.0453F, 0.0624F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 81).addBox(1.7276F, -1.056F, 2.4519F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1041F, -1.4023F, -1.2333F, 0.127F, -0.147F, 0.0255F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 51).addBox(1.7525F, -0.7373F, 0.914F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1041F, -1.4023F, -1.2333F, 0.2255F, -0.149F, -0.0071F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2719F, 1.4222F, -1.0716F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 104).mirror().addBox(-0.063F, -0.943F, -0.5762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8507F, -1.0418F, -0.6874F, 1.148F, 1.1057F, 1.1623F));

		PartDefinition cube_r8 = bone5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0218F, 0.0892F, -1.2457F, 1.6188F, 0.9012F, 1.3058F));

		PartDefinition cube_r9 = bone5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(65, 105).mirror().addBox(-0.4175F, -1.1929F, -0.2042F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1208F, -0.4364F, -0.7674F, -0.7676F, 1.3122F, -0.8107F));

		PartDefinition cube_r10 = bone5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-2.4617F, -0.4618F, -0.0893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1041F, -1.4023F, -1.2333F, 0.4275F, -0.0453F, -0.0624F));

		PartDefinition cube_r11 = bone5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 81).mirror().addBox(-2.7276F, -1.056F, 2.4519F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1041F, -1.4023F, -1.2333F, 0.127F, 0.147F, -0.0255F));

		PartDefinition cube_r12 = bone5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(95, 51).mirror().addBox(-2.7526F, -0.7373F, 0.914F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.1041F, -1.4023F, -1.2333F, 0.2255F, 0.149F, 0.0071F));

		PartDefinition body3 = chest.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7122F, 1.4007F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest_r9 = body3.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -0.6731F, -0.1837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, -0.3474F, 1.989F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest_r10 = body3.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(15, 113).addBox(-0.8F, -1.125F, 1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(81, 80).addBox(-0.5F, -0.575F, 1.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.3609F, -1.4963F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck7_r2 = body3.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(105, 109).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0109F, 2.0577F, 0.3231F, 0.1803F, -0.4624F));

		PartDefinition neck8_r1 = body3.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(109, 104).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0109F, 2.0577F, 0.2099F, 0.2843F, -0.9444F));

		PartDefinition neck9_r1 = body3.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(96, 37).mirror().addBox(-2.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0109F, 2.0577F, 0.0351F, 0.3501F, -1.492F));

		PartDefinition neck8_r2 = body3.addOrReplaceChild("neck8_r2", CubeListBuilder.create().texOffs(85, 76).mirror().addBox(-3.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1891F, 0.1577F, 0.0459F, 0.4718F, -1.4877F));

		PartDefinition neck6_r3 = body3.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(113, 81).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1891F, 0.1577F, 0.4355F, 0.2335F, -0.4393F));

		PartDefinition neck7_r3 = body3.addOrReplaceChild("neck7_r3", CubeListBuilder.create().texOffs(10, 113).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1891F, 0.1577F, 0.287F, 0.3825F, -0.9192F));

		PartDefinition neck6_r4 = body3.addOrReplaceChild("neck6_r4", CubeListBuilder.create().texOffs(105, 109).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0109F, 2.0577F, 0.3231F, -0.1803F, 0.4624F));

		PartDefinition neck7_r4 = body3.addOrReplaceChild("neck7_r4", CubeListBuilder.create().texOffs(109, 104).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0109F, 2.0577F, 0.2099F, -0.2843F, 0.9444F));

		PartDefinition neck8_r3 = body3.addOrReplaceChild("neck8_r3", CubeListBuilder.create().texOffs(96, 37).addBox(0.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0109F, 2.0577F, 0.0351F, -0.3501F, 1.492F));

		PartDefinition neck7_r5 = body3.addOrReplaceChild("neck7_r5", CubeListBuilder.create().texOffs(85, 76).addBox(0.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1891F, 0.1577F, 0.0459F, -0.4718F, 1.4877F));

		PartDefinition neck5_r3 = body3.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(113, 81).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1891F, 0.1577F, 0.4355F, -0.2335F, 0.4393F));

		PartDefinition neck6_r5 = body3.addOrReplaceChild("neck6_r5", CubeListBuilder.create().texOffs(10, 113).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1891F, 0.1577F, 0.287F, -0.3825F, 0.9192F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1672F, 2.5994F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body4_r1 = body2.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(85, 112).addBox(-0.8F, -0.5224F, -0.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1521F, 1.1045F, -0.1484F, 0.0F, 0.0F));

		PartDefinition neck11_r1 = body2.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(107, 51).mirror().addBox(-2.2696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(20, 107).mirror().addBox(-1.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2042F, 1.1629F, 0.0186F, 0.1412F, -1.496F));

		PartDefinition neck8_r4 = body2.addOrReplaceChild("neck8_r4", CubeListBuilder.create().texOffs(107, 10).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2042F, 1.1629F, 0.1353F, 0.0842F, -0.4873F));

		PartDefinition neck9_r2 = body2.addOrReplaceChild("neck9_r2", CubeListBuilder.create().texOffs(38, 107).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2042F, 1.1629F, 0.087F, 0.113F, -0.9688F));

		PartDefinition neck7_r6 = body2.addOrReplaceChild("neck7_r6", CubeListBuilder.create().texOffs(107, 10).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2042F, 1.1629F, 0.1353F, -0.0842F, 0.4873F));

		PartDefinition neck8_r5 = body2.addOrReplaceChild("neck8_r5", CubeListBuilder.create().texOffs(38, 107).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2042F, 1.1629F, 0.087F, -0.113F, 0.9688F));

		PartDefinition neck10_r1 = body2.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(107, 51).addBox(1.2696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(20, 107).addBox(0.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2042F, 1.1629F, 0.0186F, -0.1412F, 1.496F));

		PartDefinition body3_r1 = body2.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(79, 51).addBox(-0.5F, -0.9F, 0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4479F, -0.2954F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4479F, 2.7046F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body4_r2 = body.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(20, 110).addBox(-0.8F, -1.15F, 4.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 110).addBox(-0.8F, -1.225F, 2.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 57).addBox(-0.5F, -0.9F, 2.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck10_r2 = body.addOrReplaceChild("neck10_r2", CubeListBuilder.create().texOffs(35, 113).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1563F, 2.1584F, -0.1103F, -0.0203F, -0.2751F));

		PartDefinition neck10_r3 = body.addOrReplaceChild("neck10_r3", CubeListBuilder.create().texOffs(10, 110).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1687F, 0.1334F, 0.0523F, 0.0626F, -0.9718F));

		PartDefinition neck9_r3 = body.addOrReplaceChild("neck9_r3", CubeListBuilder.create().texOffs(113, 84).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1687F, 0.1334F, 0.0812F, 0.0555F, -0.4911F));

		PartDefinition neck11_r2 = body.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(5, 110).mirror().addBox(-1.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1687F, 0.1334F, 0.014F, 0.0803F, -1.4965F));

		PartDefinition neck9_r4 = body.addOrReplaceChild("neck9_r4", CubeListBuilder.create().texOffs(35, 113).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1563F, 2.1584F, -0.1103F, 0.0203F, 0.2751F));

		PartDefinition neck9_r5 = body.addOrReplaceChild("neck9_r5", CubeListBuilder.create().texOffs(10, 110).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.1687F, 0.1334F, 0.0523F, -0.0626F, 0.9718F));

		PartDefinition neck8_r6 = body.addOrReplaceChild("neck8_r6", CubeListBuilder.create().texOffs(113, 84).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.1687F, 0.1334F, 0.0812F, -0.0555F, 0.4911F));

		PartDefinition neck10_r4 = body.addOrReplaceChild("neck10_r4", CubeListBuilder.create().texOffs(5, 110).addBox(0.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.1687F, 0.1334F, 0.014F, -0.0803F, 1.4965F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3033F, 3.0022F, -0.0312F, 0.0F, 0.0F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(114, 100).addBox(-0.8F, -0.5053F, -0.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 109).addBox(-0.8F, -0.5303F, -2.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 7).addBox(-0.5F, -0.3303F, -2.7889F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1918F, 3.225F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck12_r1 = body1.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(114, 78).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.153F, 2.8562F, -0.1033F, -0.0437F, -0.1867F));

		PartDefinition neck11_r3 = body1.addOrReplaceChild("neck11_r3", CubeListBuilder.create().texOffs(30, 114).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.053F, 0.8562F, -0.1033F, -0.0437F, -0.274F));

		PartDefinition neck11_r4 = body1.addOrReplaceChild("neck11_r4", CubeListBuilder.create().texOffs(114, 78).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.153F, 2.8562F, -0.1033F, 0.0437F, 0.1867F));

		PartDefinition neck10_r5 = body1.addOrReplaceChild("neck10_r5", CubeListBuilder.create().texOffs(30, 114).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.053F, 0.8562F, -0.1033F, 0.0437F, 0.274F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(21, 96).addBox(-0.5F, -0.198F, -0.2471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.0779F, 3.1993F, -0.0094F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(33, 53).addBox(-0.5F, -0.5011F, -0.2011F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3087F, 1.6342F, 0.1859F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(58, 64).addBox(-0.5F, -0.575F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0675F, 10.598F, 0.1308F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(21, 66).addBox(-0.5F, -0.56F, -0.1002F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0075F, 7.6999F, 0.0599F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(72, 43).addBox(-0.5F, -0.5611F, -0.2001F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0121F, 7.7995F, 0.0217F, 0.0F, 0.0F));

		PartDefinition leftLeg = body1.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.721F, 0.7208F, 0.7197F, 0.8489F, 0.2219F, -0.7623F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -0.171F, -0.7295F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1987F)), PartPose.offsetAndRotation(0.1F, 1.8128F, 0.0938F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(112, 50).addBox(-0.5F, 5.0291F, -2.1422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1F, 1.8128F, 0.0938F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 103).addBox(-0.5F, -2.3F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1F, 2.3F, -0.3F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(106, 27).addBox(-0.5F, -1.9F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1F, 2.3F, -0.3F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 106).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 2.3F, -0.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, 1.2F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(33, 40).addBox(-0.4F, -0.2F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0119F, 7.788F, -0.3467F, 0.8731F, -0.3856F, -0.2847F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(74, 30).addBox(-1.0F, -0.6F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2161F, 10.6785F, -0.0072F, 1.3001F, 0.1525F, 0.0609F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0643F, -0.2724F, -0.0431F));

		PartDefinition cube_r18 = finger.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(80, 107).addBox(0.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 107).addBox(0.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8142F, 0.0542F, -1.3309F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r19 = finger.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 90).addBox(-0.4983F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 90).addBox(-0.4983F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2142F, 0.0542F, -0.3309F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r20 = finger.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(50, 107).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0858F, 0.0542F, 1.0691F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(5, 0).addBox(-1.5F, -1.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9899F, 0.0999F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rightLeg = body1.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.721F, 0.7208F, 0.7197F, 0.8489F, -0.2219F, 0.7623F));

		PartDefinition cube_r22 = rightLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(72, 85).addBox(-0.5F, -0.171F, -0.7295F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1987F)), PartPose.offsetAndRotation(-0.1F, 1.8128F, 0.0938F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(70, 112).addBox(-0.5F, 5.0291F, -2.1422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1F, 1.8128F, 0.0938F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(103, 82).addBox(-0.5F, -2.3F, -1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1F, 2.3F, -0.3F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(106, 43).addBox(-0.5F, -1.9F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.1F, 2.3F, -0.3F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(106, 31).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 2.3F, -0.3F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, 1.2F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(79, 7).addBox(-0.6F, -0.2F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0119F, 7.788F, -0.3467F, 0.8731F, 0.3856F, 0.2847F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(72, 74).addBox(-1.0F, -0.6F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2161F, 10.6785F, -0.0072F, 1.3001F, -0.1525F, -0.0609F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0643F, 0.2724F, 0.0431F));

		PartDefinition cube_r27 = finger2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 108).addBox(-1.0411F, -0.5F, -2.3422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(108, 0).addBox(-1.0411F, -0.5F, -1.9422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8142F, 0.0542F, -1.3309F, 0.0F, -1.0559F, 0.0F));

		PartDefinition cube_r28 = finger2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(90, 79).addBox(-0.5017F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 90).addBox(-0.5017F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2142F, 0.0542F, -0.3309F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r29 = finger2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(107, 54).addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0858F, 0.0542F, 1.0691F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, 0.0007F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -1.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9899F, 0.0999F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone = body1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0844F, 0.8759F, 0.4512F, 0.4203F, 0.0791F, 0.037F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(95, 115).addBox(-0.338F, -0.7503F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1171F, -0.3523F, -0.1921F, -0.498F, -0.1974F, 0.0934F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(95, 63).addBox(-0.2243F, -0.3379F, -1.7949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1171F, -0.9523F, -0.4921F, -0.6027F, -0.1974F, 0.0934F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(95, 67).addBox(-0.3332F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1171F, -0.0523F, -0.3921F, -0.4119F, -0.1886F, 0.1104F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 92).addBox(-0.5F, -0.825F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.2458F, 3.0182F, 0.5939F, -1.3761F, -0.2106F, 0.0573F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(105, 112).addBox(-0.675F, -1.225F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2066F, 2.1449F, -0.4476F, -0.6606F, -0.2106F, 0.0573F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(65, 109).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0555F, 2.0337F, 0.0054F, 1.1633F, -0.2106F, 0.0573F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(60, 109).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.13F, 2.5954F, 0.2028F, 0.343F, -0.2106F, 0.0573F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(108, 94).addBox(-0.9554F, -0.797F, -0.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2066F, 2.9949F, 0.7024F, -0.7478F, -0.2106F, 0.0573F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(96, 0).addBox(-0.3952F, -0.2378F, -0.4963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2731F, -0.4463F, 0.9792F, -0.2138F, -0.1575F, 0.1448F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(17, 92).addBox(-0.7748F, -0.7865F, -1.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, -0.3252F, -0.1825F, 0.0678F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(108, 91).addBox(-1.3796F, -0.1223F, -1.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(108, 88).addBox(-1.2796F, -0.1223F, -1.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(108, 85).addBox(-0.8796F, -0.1223F, -1.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 1.2095F, -1.5152F, -0.3605F, -0.2869F, 0.1063F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(31, 91).addBox(-0.3714F, -0.4743F, -2.2616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.2221F, 1.2095F, -1.5152F, -0.2376F, 0.1816F, 1.7718F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(109, 78).addBox(-0.0876F, -0.4743F, -1.6231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(70, 109).addBox(-0.0876F, -0.4743F, -1.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(108, 82).addBox(-0.0876F, -0.4743F, -2.1731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(-0.2221F, 1.2095F, -1.5152F, -0.2637F, 0.4777F, 1.692F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 89).addBox(-0.5773F, -0.4743F, -2.2554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(-0.2221F, 1.2095F, -1.5152F, -0.2339F, -0.0475F, 1.8268F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(79, 56).addBox(-0.3785F, -0.4733F, -2.33F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 1.2845F, -1.0402F, -0.0996F, -0.0744F, 0.1508F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(110, 107).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(80, 110).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1453F, -0.2172F, -0.5398F, 1.0848F, -0.2106F, 0.0573F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(45, 106).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.191F)), PartPose.offsetAndRotation(0.1453F, -0.2172F, -0.5398F, 0.6048F, -0.2106F, 0.0573F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(112, 53).addBox(-0.5F, -0.775F, -1.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 1.1284F, -0.2106F, 0.0573F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(93, 8).addBox(-0.5F, 0.3F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.5175F, -0.2106F, 0.0573F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(32, 86).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, -0.3551F, -0.2106F, 0.0573F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(5, 86).addBox(-0.7748F, -1.1921F, 0.536F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, 2.0223F, -0.1825F, 0.0678F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(75, 110).addBox(-0.7748F, 0.7293F, 0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, 2.6681F, -0.1825F, 0.0678F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(50, 110).addBox(-0.7748F, 0.7368F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, -2.8734F, -0.1825F, 0.0678F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(25, 110).addBox(-0.7748F, -0.3336F, -1.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, -1.7563F, -0.1825F, 0.0678F));

		PartDefinition bone6 = body1.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0844F, 0.8759F, 0.4512F, 0.4203F, -0.0791F, -0.037F));

		PartDefinition cube_r55 = bone6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(95, 115).mirror().addBox(-0.662F, -0.7503F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.3523F, -0.1921F, -0.498F, 0.1974F, -0.0934F));

		PartDefinition cube_r56 = bone6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-0.7757F, -0.3379F, -1.7949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.9523F, -0.4921F, -0.6027F, 0.1974F, -0.0934F));

		PartDefinition cube_r57 = bone6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-0.6668F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.0523F, -0.3921F, -0.4119F, 0.1886F, -0.1104F));

		PartDefinition cube_r58 = bone6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(24, 92).mirror().addBox(-0.5F, -0.825F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.2458F, 3.0182F, 0.5939F, -1.3761F, 0.2106F, -0.0573F));

		PartDefinition cube_r59 = bone6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(105, 112).mirror().addBox(-0.325F, -1.225F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 2.1449F, -0.4476F, -0.6606F, 0.2106F, -0.0573F));

		PartDefinition cube_r60 = bone6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(65, 109).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0555F, 2.0337F, 0.0054F, 1.1633F, 0.2106F, -0.0573F));

		PartDefinition cube_r61 = bone6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(60, 109).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.13F, 2.5954F, 0.2028F, 0.343F, 0.2106F, -0.0573F));

		PartDefinition cube_r62 = bone6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(108, 94).mirror().addBox(-0.0446F, -0.797F, -0.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 2.9949F, 0.7024F, -0.7478F, 0.2106F, -0.0573F));

		PartDefinition cube_r63 = bone6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.6048F, -0.2378F, -0.4963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4463F, 0.9792F, -0.2138F, 0.1575F, -0.1448F));

		PartDefinition cube_r64 = bone6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(17, 92).mirror().addBox(-0.2252F, -0.7865F, -1.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, -0.3252F, 0.1825F, -0.0678F));

		PartDefinition cube_r65 = bone6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(0.3796F, -0.1223F, -1.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(108, 88).mirror().addBox(0.2796F, -0.1223F, -1.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(108, 85).mirror().addBox(-0.1204F, -0.1223F, -1.8188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2095F, -1.5152F, -0.3605F, 0.2869F, -0.1063F));

		PartDefinition cube_r66 = bone6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(31, 91).mirror().addBox(-0.6286F, -0.4743F, -2.2616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2095F, -1.5152F, -0.2376F, -0.1816F, -1.7718F));

		PartDefinition cube_r67 = bone6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(109, 78).mirror().addBox(-0.9124F, -0.4743F, -1.6231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(70, 109).mirror().addBox(-0.9124F, -0.4743F, -1.8981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(108, 82).mirror().addBox(-0.9124F, -0.4743F, -2.1731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2095F, -1.5152F, -0.2637F, -0.4777F, -1.692F));

		PartDefinition cube_r68 = bone6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(46, 89).mirror().addBox(-0.4227F, -0.4743F, -2.2554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2095F, -1.5152F, -0.2339F, 0.0475F, -1.8268F));

		PartDefinition cube_r69 = bone6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-0.6215F, -0.4733F, -2.33F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2845F, -1.0402F, -0.0996F, 0.0744F, -0.1508F));

		PartDefinition cube_r70 = bone6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(110, 107).mirror().addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(80, 110).mirror().addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1453F, -0.2172F, -0.5398F, 1.0848F, 0.2106F, -0.0573F));

		PartDefinition cube_r71 = bone6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.191F)).mirror(false), PartPose.offsetAndRotation(-0.1453F, -0.2172F, -0.5398F, 0.6048F, 0.2106F, -0.0573F));

		PartDefinition cube_r72 = bone6.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(112, 53).mirror().addBox(-0.5F, -0.775F, -1.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 1.1284F, 0.2106F, -0.0573F));

		PartDefinition cube_r73 = bone6.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(93, 8).mirror().addBox(-0.5F, 0.3F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.5175F, 0.2106F, -0.0573F));

		PartDefinition cube_r74 = bone6.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(32, 86).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, -0.3551F, 0.2106F, -0.0573F));

		PartDefinition cube_r75 = bone6.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.2252F, -1.1921F, 0.536F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, 2.0223F, 0.1825F, -0.0678F));

		PartDefinition cube_r76 = bone6.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(75, 110).mirror().addBox(-0.2252F, 0.7293F, 0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, 2.6681F, 0.1825F, -0.0678F));

		PartDefinition cube_r77 = bone6.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(50, 110).mirror().addBox(-0.2252F, 0.7368F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, -2.8734F, 0.1825F, -0.0678F));

		PartDefinition cube_r78 = bone6.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(25, 110).mirror().addBox(-0.2252F, -0.3336F, -1.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, -1.7563F, 0.1825F, -0.0678F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(104, 102).addBox(-0.8F, -1.3011F, -2.8838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.2F, -0.0586F, 0.0F, 0.0F));

		PartDefinition cube_r79 = neck1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(70, 105).addBox(-0.8F, -0.9332F, -0.208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3316F, -0.6978F, 0.0785F, 0.0F, 0.0F));

		PartDefinition neck7_r7 = neck1.addOrReplaceChild("neck7_r7", CubeListBuilder.create().texOffs(100, 4).mirror().addBox(-1.9754F, -0.2807F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.591F, -2.4703F, 0.6682F, 1.0189F, -0.9101F));

		PartDefinition neck8_r7 = neck1.addOrReplaceChild("neck8_r7", CubeListBuilder.create().texOffs(96, 40).mirror().addBox(-2.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.091F, -0.4703F, 0.0518F, 0.5327F, -1.4848F));

		PartDefinition neck7_r8 = neck1.addOrReplaceChild("neck7_r8", CubeListBuilder.create().texOffs(35, 110).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.091F, -0.4703F, 0.3278F, 0.4307F, -0.903F));

		PartDefinition neck6_r6 = neck1.addOrReplaceChild("neck6_r6", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.091F, -0.4703F, 0.4927F, 0.2591F, -0.4254F));

		PartDefinition neck6_r7 = neck1.addOrReplaceChild("neck6_r7", CubeListBuilder.create().texOffs(100, 4).addBox(-0.0246F, -0.2807F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.591F, -2.4703F, 0.6682F, -1.0189F, 0.9101F));

		PartDefinition neck7_r9 = neck1.addOrReplaceChild("neck7_r9", CubeListBuilder.create().texOffs(96, 40).addBox(0.8696F, -1.1537F, -0.3551F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.091F, -0.4703F, 0.0518F, -0.5327F, 1.4848F));

		PartDefinition neck6_r8 = neck1.addOrReplaceChild("neck6_r8", CubeListBuilder.create().texOffs(35, 110).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.091F, -0.4703F, 0.3278F, -0.4307F, 0.903F));

		PartDefinition neck5_r4 = neck1.addOrReplaceChild("neck5_r4", CubeListBuilder.create().texOffs(0, 113).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.091F, -0.4703F, 0.4927F, -0.2591F, 0.4254F));

		PartDefinition cube_r80 = neck1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(41, 81).addBox(-0.5F, -0.475F, 0.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4684F, -3.1978F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(7, 95).addBox(-0.5F, -0.4536F, -1.8481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.372F, -2.5937F, -0.0453F, 0.0F, 0.0F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 102).addBox(-0.8F, -1.175F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4287F, -1.6481F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck8_r8 = neck2.addOrReplaceChild("neck8_r8", CubeListBuilder.create().texOffs(100, 13).mirror().addBox(-1.5815F, -0.2784F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.3191F, -1.6766F, 0.7801F, 1.0293F, -0.7804F));

		PartDefinition neck7_r10 = neck2.addOrReplaceChild("neck7_r10", CubeListBuilder.create().texOffs(100, 13).addBox(-0.4185F, -0.2784F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.3191F, -1.6766F, 0.7801F, -1.0293F, 0.7804F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.511F, -2.809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0595F, -1.7151F, -0.3508F, 0.0F, 0.0F));

		PartDefinition cube_r82 = neck3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(5, 102).addBox(-0.8F, -0.95F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.511F, -1.509F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck9_r6 = neck3.addOrReplaceChild("neck9_r6", CubeListBuilder.create().texOffs(71, 98).mirror().addBox(-1.5628F, -0.2844F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.2596F, -1.5614F, 0.5943F, 1.1127F, -0.9918F));

		PartDefinition neck8_r9 = neck3.addOrReplaceChild("neck8_r9", CubeListBuilder.create().texOffs(71, 98).addBox(-0.4372F, -0.2844F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.2596F, -1.5614F, 0.5943F, -1.1127F, 0.9918F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(74, 23).addBox(-0.5F, -0.6007F, -4.8472F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(103, 0).addBox(-0.8F, -1.9507F, -2.8472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0996F, -2.6108F, -0.0977F, 0.0F, 0.0F));

		PartDefinition cube_r83 = neck4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(28, 102).addBox(-0.8F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6757F, -4.2472F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = neck4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(103, 86).addBox(-0.8F, -1.225F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4757F, -0.6472F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck12_r2 = neck4.addOrReplaceChild("neck12_r2", CubeListBuilder.create().texOffs(21, 100).mirror().addBox(-1.5565F, -0.2859F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.16F, -4.6506F, 0.8058F, 1.2779F, -0.803F));

		PartDefinition neck11_r5 = neck4.addOrReplaceChild("neck11_r5", CubeListBuilder.create().texOffs(100, 16).mirror().addBox(-1.5565F, -0.2859F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.16F, -2.6506F, 0.7658F, 1.2655F, -0.8449F));

		PartDefinition neck10_r6 = neck4.addOrReplaceChild("neck10_r6", CubeListBuilder.create().texOffs(14, 100).mirror().addBox(-1.5565F, -0.2859F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.325F, 0.16F, -0.6507F, 0.7658F, 1.2655F, -0.8449F));

		PartDefinition neck11_r6 = neck4.addOrReplaceChild("neck11_r6", CubeListBuilder.create().texOffs(21, 100).addBox(-0.4435F, -0.2859F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.16F, -4.6506F, 0.8058F, -1.2779F, 0.803F));

		PartDefinition neck10_r7 = neck4.addOrReplaceChild("neck10_r7", CubeListBuilder.create().texOffs(100, 16).addBox(-0.4435F, -0.2859F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.16F, -2.6506F, 0.7658F, -1.2655F, 0.8449F));

		PartDefinition neck9_r7 = neck4.addOrReplaceChild("neck9_r7", CubeListBuilder.create().texOffs(14, 100).addBox(-0.4435F, -0.2859F, -0.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.325F, 0.16F, -0.6507F, 0.7658F, -1.2655F, 0.8449F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(95, 55).addBox(-0.5F, -0.3946F, -2.0725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2293F, -4.6907F, 0.2339F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2607F, -1.5169F, -0.228F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(80, 113).addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.006F, 8.5245F, -17.0323F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(75, 113).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.006F, 8.2609F, -16.8892F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(95, 112).addBox(-0.5F, -0.352F, -0.3484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.0F, 8.0424F, -16.687F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(103, 90).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 7.1424F, -15.612F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(89, 102).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.0967F, -14.3006F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(103, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9101F, -12.6887F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(20, 103).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7845F, -11.0355F, -0.973F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(15, 103).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7173F, -9.344F, -1.0079F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(10, 103).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6872F, -7.6297F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(102, 67).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7024F, -5.889F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(106, 71).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 71).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2443F, -4.1272F, -1.0777F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(-1.0F, -2.0F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(93, 16).addBox(1.0F, -2.0F, -1.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 2.6202F, -2.181F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(85, 72).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(85, 72).addBox(1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0F, -0.7057F, -3.2549F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(96, 83).mirror().addBox(-1.0F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 83).addBox(1.0F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.1504F, -2.6128F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(-1.0F, -0.4F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(85, 17).addBox(0.988F, -0.4F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.994F, 0.0497F, -2.425F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(85, 17).addBox(0.988F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.994F, -1.064F, -2.3263F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(83, 12).addBox(-2.5F, 0.475F, -0.075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(83, 12).addBox(-2.5F, -0.5F, -0.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -0.2817F, -1.5706F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(96, 79).addBox(-2.5F, 0.0049F, 0.9695F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(95, 95).addBox(-2.5F, 0.0049F, 0.2695F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7627F, -1.1411F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(95, 92).addBox(-2.5F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(95, 86).addBox(-2.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.006F, -1.5206F, -1.0406F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 12).addBox(-2.5F, -1.8F, -1.975F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(92, 12).addBox(-2.5F, -1.8F, -0.975F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 2.7798F, -1.273F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 85).addBox(-2.5F, -0.975F, -0.95F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -0.1352F, -0.0785F, -0.384F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.1553F, 5.3906F, -9.2811F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(70, 115).addBox(-0.5F, -0.2357F, -0.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0197F, -3.5277F, 8.0865F, -2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 115).addBox(-0.5F, -0.1566F, 0.0772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0197F, -3.4277F, 7.8115F, 2.8274F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(100, 115).addBox(-0.5F, -0.5012F, 0.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0197F, -3.4277F, 7.8115F, -3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(113, 34).addBox(-0.5F, -0.1417F, -1.5399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(25, 113).addBox(-0.5F, -0.1417F, -0.8399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0197F, -4.1616F, 8.4996F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(90, 115).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0197F, -4.7389F, 7.3886F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(85, 115).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0197F, -5.279F, 7.8339F, 2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(60, 115).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0197F, -5.71F, 8.3855F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(20, 113).addBox(-0.5F, -0.2417F, -0.8899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0197F, -3.5277F, 8.0865F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(55, 115).addBox(-0.5875F, -0.2764F, -0.9149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 103).addBox(-0.4125F, -0.2764F, -0.9149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4822F, -4.1729F, 5.8659F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(114, 103).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0553F, -6.9167F, 8.2182F, -1.5228F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(114, 103).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0553F, -6.4526F, 7.9995F, -1.1912F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(55, 112).addBox(-0.5125F, -0.9039F, -0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4822F, -4.3228F, 5.7159F, -2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(45, 93).addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.4697F, -3.017F, 5.0058F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(107, 4).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4697F, -3.3232F, 4.2667F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(104, 106).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4697F, -4.111F, 4.1278F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(99, 106).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4697F, -4.8361F, 4.4659F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(106, 98).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(0.4697F, -5.3231F, 5.1006F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(106, 75).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4697F, -5.6925F, 5.8102F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(104, 79).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(89, 89).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4697F, -5.1143F, 6.9528F, -2.714F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(85, 106).addBox(-0.5125F, -0.9814F, -1.2745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4822F, -4.3228F, 5.7159F, -1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(100, 112).addBox(-0.5125F, -0.9515F, -0.1314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4822F, -4.3228F, 5.7159F, -2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(50, 103).addBox(-0.765F, 0.3425F, 0.1554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.5486F, 0.1135F, 0.0174F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(95, 109).addBox(-0.765F, -0.367F, 0.4583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 2.6001F, 0.1135F, 0.0174F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(40, 103).addBox(-0.765F, -2.2014F, 0.4168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 1.5093F, 0.1135F, 0.0174F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(38, 91).addBox(-0.765F, -1.9774F, -1.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.242F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 0.113F, 0.1135F, 0.0174F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(90, 109).addBox(-0.765F, -0.9042F, -2.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.9342F, 0.1135F, 0.0174F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(85, 109).addBox(-0.765F, -0.1407F, -2.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F))
				.texOffs(111, 41).addBox(-0.765F, 0.3593F, -2.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.2833F, 0.1135F, 0.0174F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(94, 20).addBox(-0.765F, 1.6747F, 0.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.5923F, 0.1135F, 0.0174F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(89, 93).addBox(-0.765F, -2.2973F, 0.985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 2.2946F, 0.1135F, 0.0174F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(94, 28).addBox(-0.765F, -1.5199F, -3.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F))
				.texOffs(94, 24).addBox(-0.765F, -1.9199F, -3.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.243F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 0.4795F, 0.1135F, 0.0174F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(111, 31).addBox(-0.765F, -3.2575F, -2.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 0.8722F, 0.1135F, 0.0174F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 111).addBox(-0.765F, 1.3161F, -3.5801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.5241F, 0.1135F, 0.0174F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(111, 28).addBox(-0.765F, 3.0859F, 0.5525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.7458F, 0.1135F, 0.0174F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(14, 96).addBox(-0.765F, 0.0399F, 2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.793F, 0.1135F, 0.0174F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(39, 86).addBox(-0.765F, 0.1261F, 0.7116F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.244F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.7581F, 0.1135F, 0.0174F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(112, 59).addBox(-0.6405F, 2.7898F, 7.8655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(112, 56).addBox(-0.6405F, 2.7898F, 7.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(0, 95).addBox(-0.6405F, 2.7898F, 6.2905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.4528F, 0.1143F, 0.0158F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(112, 62).addBox(-0.6405F, 2.2072F, 3.0715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 112).addBox(-0.6405F, 2.2072F, 3.3715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.4877F, 0.1143F, 0.0158F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(112, 65).addBox(-0.6405F, 1.716F, 3.4245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.345F))
				.texOffs(65, 112).addBox(-0.6405F, 1.716F, 3.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.6273F, 0.1143F, 0.0158F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(94, 75).addBox(-0.6405F, 1.6478F, 6.7168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F))
				.texOffs(72, 94).addBox(-0.6905F, 1.6979F, 5.3685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.5924F, 0.1143F, 0.0158F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(94, 71).addBox(-0.6905F, 2.1844F, 3.7728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.5052F, 0.1143F, 0.0158F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(59, 94).addBox(-0.6905F, 1.7451F, 4.0102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.6099F, 0.1143F, 0.0158F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(52, 94).addBox(-0.6945F, 2.04F, 5.2745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -2.5574F, 0.1135F, 0.0174F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(101, 71).addBox(-1.0F, 0.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8244F, -5.6399F, 5.1746F, -1.0493F, 0.0137F, 0.0118F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(99, 102).addBox(-0.9481F, -2.0123F, -0.9773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7507F, -2.2654F, 4.5107F, -1.3197F, 0.0137F, 0.013F));

		PartDefinition head_r1 = leftFace.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(102, 59).addBox(-2.0979F, 9.6244F, -7.6881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.5931F, 0.1476F, -0.3373F));

		PartDefinition head_r2 = leftFace.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(110, 113).addBox(-2.0979F, 9.7865F, -9.7112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(113, 93).addBox(-2.0979F, 9.3865F, -9.7112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.4011F, 0.1476F, -0.3373F));

		PartDefinition head_r3 = leftFace.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(103, 94).addBox(-0.8229F, 6.8588F, -8.8017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.3809F, 0.2371F, -0.3174F));

		PartDefinition head_r4 = leftFace.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(55, 105).addBox(-0.8229F, 5.7667F, -10.7271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.1191F, 0.2371F, -0.3174F));

		PartDefinition head_r5 = leftFace.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(106, 47).addBox(-0.6664F, 4.511F, -9.3508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.0851F, 0.2478F, -0.3127F));

		PartDefinition head_r6 = leftFace.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(60, 105).addBox(-0.6664F, 5.2896F, -7.7972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.3469F, 0.2478F, -0.3127F));

		PartDefinition head_r7 = leftFace.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(113, 90).addBox(-0.6455F, 3.649F, -7.7903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(113, 87).addBox(-0.6455F, 3.249F, -7.7903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.0455F, 0.2418F, -0.3063F));

		PartDefinition head_r8 = leftFace.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(94, 105).addBox(-0.6455F, 3.6667F, -6.6165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.3073F, 0.2418F, -0.3063F));

		PartDefinition head_r9 = leftFace.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(106, 23).addBox(-0.6676F, -0.2362F, -5.4127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 0.1291F, 0.2418F, -0.3063F));

		PartDefinition head_r10 = leftFace.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(106, 19).addBox(-0.6426F, -1.0759F, -4.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 0.2687F, 0.2418F, -0.3063F));

		PartDefinition head_r11 = leftFace.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(5, 106).addBox(-0.6676F, -1.1701F, -2.3024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 106).addBox(-0.6926F, -1.3951F, -1.1024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, 0.1814F, 0.2418F, -0.3063F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(111, 44).addBox(7.3546F, 10.0593F, -1.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 109).addBox(7.3546F, 9.7593F, -1.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.8669F, 0.6726F, 0.4118F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(111, 25).addBox(-3.1062F, 12.011F, -1.6418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(111, 22).addBox(-3.1062F, 11.611F, -1.6418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.0635F, -0.0544F, -0.076F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(45, 102).addBox(-0.7445F, 10.4093F, -1.7936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.0604F, 0.1309F, 0.0174F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(45, 97).addBox(-0.8945F, 7.6105F, -1.7582F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.0779F, 0.1309F, 0.0174F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(67, 90).addBox(-1.0195F, 3.6932F, -1.3556F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.1306F, 0.1135F, 0.0174F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(84, 92).addBox(-1.0195F, -0.2073F, -1.0451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.2135F, 0.1135F, 0.0174F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(89, 97).addBox(-1.0195F, 4.4201F, -2.8886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.9778F, 0.1135F, 0.0174F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(112, 15).addBox(-9.4111F, 7.1782F, -6.0303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.6388F, -0.4053F, -0.7028F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(112, 12).addBox(-2.6489F, 11.2284F, -5.2501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.7945F, 0.0021F, -0.1134F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(102, 63).addBox(-2.3087F, 10.3073F, -4.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.8799F, 0.0168F, -0.0777F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(102, 51).addBox(-0.3134F, 10.4058F, -4.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.8704F, 0.1509F, 0.0345F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(75, 103).addBox(-0.7445F, 9.0159F, -3.685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.9077F, 0.1309F, 0.0174F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(103, 39).addBox(-0.8945F, 7.4188F, -2.8903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -0.9775F, 0.1309F, 0.0174F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(84, 85).addBox(-1.8195F, -0.3849F, -2.6507F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(84, 85).addBox(-1.0195F, -0.3849F, -2.6507F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.0302F, 0.1135F, 0.0174F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 85).addBox(-1.0F, -0.65F, 0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8686F, -6.4419F, 6.8349F, -0.7988F, -0.2403F, -0.0654F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(84, 85).addBox(-1.0F, -2.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8686F, -6.4419F, 6.8349F, -1.3224F, -0.2403F, -0.0654F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(12, 86).addBox(-1.0195F, -1.0811F, -1.8436F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8185F, -2.1614F, 4.447F, -1.0128F, 0.1135F, 0.0174F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1142F, -1.5543F, 2.2891F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.1553F, 5.3906F, -9.2811F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(70, 115).mirror().addBox(-0.5F, -0.2357F, -0.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -3.5277F, 8.0865F, -2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(65, 115).mirror().addBox(-0.5F, -0.1566F, 0.0772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -3.4277F, 7.8115F, 2.8274F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(100, 115).mirror().addBox(-0.5F, -0.5012F, 0.0091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -3.4277F, 7.8115F, -3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(113, 34).mirror().addBox(-0.5F, -0.1417F, -1.5399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(25, 113).mirror().addBox(-0.5F, -0.1417F, -0.8399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -4.1616F, 8.4996F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(90, 115).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -4.7389F, 7.3886F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(85, 115).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -5.279F, 7.8339F, 2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(60, 115).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -5.71F, 8.3855F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(20, 113).mirror().addBox(-0.5F, -0.2417F, -0.8899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, -3.5277F, 8.0865F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(55, 115).mirror().addBox(-0.4125F, -0.2764F, -0.9149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 103).mirror().addBox(-0.5875F, -0.2764F, -0.9149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4822F, -4.1729F, 5.8659F, -1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(114, 103).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0553F, -6.9167F, 8.2182F, -1.5228F, 0.0F, 0.0F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(114, 103).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0553F, -6.4526F, 7.9995F, -1.1912F, 0.0F, 0.0F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(55, 112).mirror().addBox(-0.4875F, -0.9039F, -0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4822F, -4.3228F, 5.7159F, -2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(45, 93).mirror().addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -3.017F, 5.0058F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(107, 4).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -3.3232F, 4.2667F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(104, 106).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -4.111F, 4.1278F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(99, 106).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -4.8361F, 4.4659F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(106, 98).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -5.3231F, 5.1006F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(106, 75).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -5.6925F, 5.8102F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(89, 89).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -5.1143F, 6.9528F, -2.714F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(85, 106).mirror().addBox(-0.4875F, -0.9814F, -1.2745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.4822F, -4.3228F, 5.7159F, -1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(100, 112).mirror().addBox(-0.4875F, -0.9515F, -0.1314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.4822F, -4.3228F, 5.7159F, -2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(50, 103).mirror().addBox(-0.235F, 0.3425F, 0.1554F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.5486F, -0.1135F, -0.0174F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(95, 109).mirror().addBox(-0.235F, -0.367F, 0.4583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 2.6001F, -0.1135F, -0.0174F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.235F, -2.2014F, 0.4168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 1.5093F, -0.1135F, -0.0174F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.235F, -1.9774F, -1.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.242F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 0.113F, -0.1135F, -0.0174F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(90, 109).mirror().addBox(-0.235F, -0.9042F, -2.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.9342F, -0.1135F, -0.0174F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(85, 109).mirror().addBox(-0.235F, -0.1407F, -2.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false)
				.texOffs(111, 41).mirror().addBox(-0.235F, 0.3593F, -2.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.2833F, -0.1135F, -0.0174F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(94, 20).mirror().addBox(-0.235F, 1.6747F, 0.2487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.5923F, -0.1135F, -0.0174F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(89, 93).mirror().addBox(-0.235F, -2.2973F, 0.985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 2.2946F, -0.1135F, -0.0174F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(-0.235F, -1.5199F, -3.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)).mirror(false)
				.texOffs(94, 24).mirror().addBox(-0.235F, -1.9199F, -3.5921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 0.4795F, -0.1135F, -0.0174F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(111, 31).mirror().addBox(-0.235F, -3.2575F, -2.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 0.8722F, -0.1135F, -0.0174F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(30, 111).mirror().addBox(-0.235F, 1.3161F, -3.5801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.5241F, -0.1135F, -0.0174F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(111, 28).mirror().addBox(-0.235F, 3.0859F, 0.5525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.7458F, -0.1135F, -0.0174F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(14, 96).mirror().addBox(-0.235F, 0.0399F, 2.2233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.793F, -0.1135F, -0.0174F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(39, 86).mirror().addBox(-0.235F, 0.1261F, 0.7116F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.244F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.7581F, -0.1135F, -0.0174F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(112, 59).mirror().addBox(-0.3595F, 2.7898F, 7.8655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(112, 56).mirror().addBox(-0.3595F, 2.7898F, 7.6155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(0, 95).mirror().addBox(-0.3595F, 2.7898F, 6.2905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.4528F, -0.1143F, -0.0158F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(112, 62).mirror().addBox(-0.3595F, 2.2072F, 3.0715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(60, 112).mirror().addBox(-0.3595F, 2.2072F, 3.3715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.4877F, -0.1143F, -0.0158F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(112, 65).mirror().addBox(-0.3595F, 1.716F, 3.4245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.345F)).mirror(false)
				.texOffs(65, 112).mirror().addBox(-0.3595F, 1.716F, 3.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.6273F, -0.1143F, -0.0158F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-0.3595F, 1.6478F, 6.7168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(72, 94).mirror().addBox(-0.3095F, 1.6979F, 5.3685F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.5924F, -0.1143F, -0.0158F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(94, 71).mirror().addBox(-0.3095F, 2.1844F, 3.7728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.5052F, -0.1143F, -0.0158F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(59, 94).mirror().addBox(-0.3095F, 1.7451F, 4.0102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.6099F, -0.1143F, -0.0158F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(52, 94).mirror().addBox(-0.3055F, 2.04F, 5.2745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -2.5574F, -0.1135F, -0.0174F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(101, 71).mirror().addBox(0.0F, 0.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8244F, -5.6399F, 5.1746F, -1.0493F, -0.0137F, -0.0118F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(99, 102).mirror().addBox(-0.0519F, -2.0123F, -0.9773F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7507F, -2.2654F, 4.5107F, -1.3197F, -0.0137F, -0.013F));

		PartDefinition head_r12 = rightFace.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(102, 59).mirror().addBox(1.0979F, 9.6244F, -7.6881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.5931F, -0.1476F, 0.3373F));

		PartDefinition head_r13 = rightFace.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(110, 113).mirror().addBox(1.0979F, 9.7865F, -9.7112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(113, 93).mirror().addBox(1.0979F, 9.3865F, -9.7112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.4011F, -0.1476F, 0.3373F));

		PartDefinition head_r14 = rightFace.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(103, 94).mirror().addBox(-0.1771F, 6.8588F, -8.8017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.3809F, -0.2371F, 0.3174F));

		PartDefinition head_r15 = rightFace.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(55, 105).mirror().addBox(-0.1771F, 5.7667F, -10.7271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.1191F, -0.2371F, 0.3174F));

		PartDefinition head_r16 = rightFace.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(106, 47).mirror().addBox(-0.3336F, 4.511F, -9.3508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.0851F, -0.2478F, 0.3127F));

		PartDefinition head_r17 = rightFace.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(60, 105).mirror().addBox(-0.3336F, 5.2896F, -7.7972F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.3469F, -0.2478F, 0.3127F));

		PartDefinition head_r18 = rightFace.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(113, 90).mirror().addBox(-0.3545F, 3.649F, -7.7903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(113, 87).mirror().addBox(-0.3545F, 3.249F, -7.7903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.0455F, -0.2418F, 0.3063F));

		PartDefinition head_r19 = rightFace.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(94, 105).mirror().addBox(-0.3545F, 3.6667F, -6.6165F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.3073F, -0.2418F, 0.3063F));

		PartDefinition head_r20 = rightFace.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(106, 23).mirror().addBox(-0.3324F, -0.2362F, -5.4127F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 0.1291F, -0.2418F, 0.3063F));

		PartDefinition head_r21 = rightFace.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(106, 19).mirror().addBox(-0.3574F, -1.0759F, -4.0504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 0.2687F, -0.2418F, 0.3063F));

		PartDefinition head_r22 = rightFace.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-0.3324F, -1.1701F, -2.3024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 106).mirror().addBox(-0.3074F, -1.3951F, -1.1024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, 0.1814F, -0.2418F, 0.3063F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(111, 44).mirror().addBox(-8.3546F, 10.0593F, -1.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(100, 109).mirror().addBox(-8.3546F, 9.7593F, -1.9455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.8669F, -0.6726F, -0.4118F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(111, 25).mirror().addBox(2.1062F, 12.011F, -1.6418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(111, 22).mirror().addBox(2.1062F, 11.611F, -1.6418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.0635F, 0.0544F, 0.076F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(45, 102).mirror().addBox(-0.2555F, 10.4093F, -1.7936F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.0604F, -0.1309F, -0.0174F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(45, 97).mirror().addBox(-0.1055F, 7.6105F, -1.7582F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.0779F, -0.1309F, -0.0174F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(67, 90).mirror().addBox(0.0195F, 3.6932F, -1.3556F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.1306F, -0.1135F, -0.0174F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(84, 92).mirror().addBox(0.0195F, -0.2073F, -1.0451F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.2135F, -0.1135F, -0.0174F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(89, 97).mirror().addBox(0.0195F, 4.4201F, -2.8886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.9778F, -0.1135F, -0.0174F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(112, 15).mirror().addBox(8.4111F, 7.1782F, -6.0303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.6388F, 0.4053F, 0.7028F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(112, 12).mirror().addBox(1.6489F, 11.2284F, -5.2501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.7945F, -0.0021F, 0.1134F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(102, 63).mirror().addBox(1.3087F, 10.3073F, -4.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.8799F, -0.0168F, 0.0777F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(102, 51).mirror().addBox(-0.6866F, 10.4058F, -4.212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.8704F, -0.1509F, -0.0345F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(75, 103).mirror().addBox(-0.2555F, 9.0159F, -3.685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.9077F, -0.1309F, -0.0174F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(103, 39).mirror().addBox(-0.1055F, 7.4188F, -2.8903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -0.9775F, -0.1309F, -0.0174F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(0.8195F, -0.3849F, -2.6507F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(84, 85).mirror().addBox(0.0195F, -0.3849F, -2.6507F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.0302F, -0.1135F, -0.0174F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(0.0F, -0.65F, 0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8686F, -6.4419F, 6.8349F, -0.7988F, 0.2403F, 0.0654F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(0.0F, -2.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8686F, -6.4419F, 6.8349F, -1.3224F, 0.2403F, 0.0654F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(0.0195F, -1.0811F, -1.8436F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8185F, -2.1614F, 4.447F, -1.0128F, -0.1135F, -0.0174F));

		PartDefinition bone7 = rightFace.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1142F, -1.5543F, 2.2891F, -0.0436F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(93, 4).addBox(1.175F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(93, 4).mirror().addBox(-2.175F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8206F, -1.726F, 0.4185F, 0.0F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-0.3139F, -0.7198F, -0.3803F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7851F, -6.8882F, 0.0859F, -0.2091F, 0.0099F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(94, 43).mirror().addBox(-1.0741F, -0.0172F, 5.9349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7851F, -6.8882F, 0.2006F, -0.0872F, 0.0012F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(89, 85).mirror().addBox(-1.0741F, 2.6735F, 6.5831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(107, 13).mirror().addBox(-1.0741F, 2.6735F, 7.9831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7851F, -6.8882F, 0.5671F, -0.0872F, 0.0012F));

		PartDefinition head_r23 = jaw.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(60, 101).mirror().addBox(-0.2539F, -10.1505F, -10.7229F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.9124F, -0.0544F, -0.2814F));

		PartDefinition head_r24 = jaw.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(101, 47).mirror().addBox(-0.2539F, -11.5578F, -7.6015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 1.2266F, -0.0544F, -0.2814F));

		PartDefinition head_r25 = jaw.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(102, 55).mirror().addBox(-0.7151F, -5.0065F, -11.3128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.489F, -0.0996F, -0.2539F));

		PartDefinition head_r26 = jaw.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(101, 31).mirror().addBox(-0.7151F, -6.8478F, -9.752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(101, 23).mirror().addBox(-0.5517F, -6.2717F, -8.196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.8031F, -0.0996F, -0.2539F));

		PartDefinition head_r27 = jaw.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(101, 75).mirror().addBox(-0.5517F, -5.8995F, -9.265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.5937F, -0.0996F, -0.2539F));

		PartDefinition head_r28 = jaw.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(101, 43).mirror().addBox(-0.386F, -3.2223F, -6.7294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.4955F, -0.0911F, -0.2537F));

		PartDefinition head_r29 = jaw.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(55, 101).mirror().addBox(-0.311F, -1.5284F, -5.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 107).mirror().addBox(-0.211F, -1.3284F, -3.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.2773F, -0.0911F, -0.2537F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(89, 39).mirror().addBox(-0.1907F, -1.397F, -9.7158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.3185F, -0.1178F, 0.0F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(89, 35).mirror().addBox(-0.1907F, -1.1547F, -8.1487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.288F, -0.1178F, 0.0F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.1365F, -1.0986F, -6.5544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.2793F, -0.1091F, 0.0F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-0.1365F, -0.9321F, -4.9828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.2443F, -0.1091F, 0.0F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(88, 63).mirror().addBox(-0.1365F, -0.7645F, -3.4168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.192F, -0.1091F, 0.0F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(111, 97).mirror().addBox(-1.0407F, 3.6916F, 10.9908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(111, 75).mirror().addBox(-1.0407F, 3.6916F, 11.3908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, -2.5348F, -0.1876F, -0.0025F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(112, 9).mirror().addBox(-1.0407F, 12.4149F, -1.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, -1.2302F, -0.1876F, -0.0025F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(5, 113).mirror().addBox(-1.0407F, 4.443F, -12.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(113, 0).mirror().addBox(-1.0407F, 4.443F, -13.1921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, -0.1132F, -0.1876F, -0.0025F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(111, 72).mirror().addBox(-1.0407F, -2.104F, -14.3403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(111, 69).mirror().addBox(-1.0407F, -2.104F, -13.9403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(111, 47).mirror().addBox(-0.9408F, -2.0051F, -13.444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.3668F, -0.1876F, -0.0025F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(88, 59).mirror().addBox(-0.9408F, -1.7847F, -12.8735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.3494F, -0.1876F, -0.0025F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(87, 31).mirror().addBox(-0.193F, -1.0142F, -11.3777F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.2794F, -0.1178F, -0.0024F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-0.193F, -0.9725F, -9.7811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.275F, -0.1178F, -0.0024F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(88, 51).mirror().addBox(-0.193F, -0.8336F, -8.1933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.2576F, -0.1178F, -0.0024F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(24, 88).mirror().addBox(-0.1365F, -0.7229F, -6.6008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.24F, -0.1091F, 0.0F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(17, 88).mirror().addBox(-0.1365F, -0.6395F, -5.0092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.2225F, -0.1091F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(87, 47).mirror().addBox(-0.1365F, -0.4583F, -1.8311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.1571F, -0.1091F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(105, 115).mirror().addBox(-2.0F, -0.25F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(115, 106).mirror().addBox(-2.0F, -0.25F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 115).addBox(1.35F, -0.25F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(115, 106).addBox(1.35F, -0.25F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.175F, -0.2822F, -1.5835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(45, 110).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(45, 110).addBox(2.858F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.679F, -0.3762F, -1.1778F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(107, 7).mirror().addBox(-2.0F, -0.325F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(107, 7).addBox(1.35F, -0.325F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.175F, -0.2299F, -0.9858F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(40, 110).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 110).addBox(2.85F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.675F, -0.0024F, -0.4216F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(87, 27).mirror().addBox(-0.1365F, -0.738F, -1.8324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(87, 43).mirror().addBox(-0.1365F, -0.4862F, -3.4264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0491F, 0.3487F, -2.4956F, 0.1745F, -0.1091F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(87, 23).mirror().addBox(-2.0F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(87, 23).addBox(1.35F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.175F, 0.5F, -0.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(87, 27).addBox(-0.8635F, -0.738F, -1.8324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F))
				.texOffs(87, 43).addBox(-0.8635F, -0.4862F, -3.4264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.1745F, 0.1091F, 0.0F));

		PartDefinition head_r30 = jaw.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(101, 47).addBox(-0.7461F, -11.5578F, -7.6015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 1.2266F, 0.0544F, 0.2814F));

		PartDefinition head_r31 = jaw.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(60, 101).addBox(-0.7461F, -10.1505F, -10.7229F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.9124F, 0.0544F, 0.2814F));

		PartDefinition head_r32 = jaw.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(101, 31).addBox(-0.2849F, -6.8478F, -9.752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(101, 23).addBox(-0.4483F, -6.2717F, -8.196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.8031F, 0.0996F, 0.2539F));

		PartDefinition head_r33 = jaw.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(102, 55).addBox(-0.2849F, -5.0065F, -11.3128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.489F, 0.0996F, 0.2539F));

		PartDefinition head_r34 = jaw.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(101, 75).addBox(-0.4483F, -5.8995F, -9.265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.5937F, 0.0996F, 0.2539F));

		PartDefinition head_r35 = jaw.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(101, 43).addBox(-0.614F, -3.2223F, -6.7294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.4955F, 0.0911F, 0.2537F));

		PartDefinition head_r36 = jaw.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(55, 101).addBox(-0.689F, -1.5284F, -5.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 107).addBox(-0.789F, -1.3284F, -3.9978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.2773F, 0.0911F, 0.2537F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(87, 47).addBox(-0.8635F, -0.4583F, -1.8311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.1571F, 0.1091F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(111, 97).addBox(0.0407F, 3.6916F, 10.9908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(111, 75).addBox(0.0407F, 3.6916F, 11.3908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, -2.5348F, 0.1876F, 0.0025F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(112, 9).addBox(0.0407F, 12.4149F, -1.3708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, -1.2302F, 0.1876F, 0.0025F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(5, 113).addBox(0.0407F, 4.443F, -12.7921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(113, 0).addBox(0.0407F, 4.443F, -13.1921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, -0.1132F, 0.1876F, 0.0025F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(111, 72).addBox(0.0407F, -2.104F, -14.3403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(111, 69).addBox(0.0407F, -2.104F, -13.9403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(111, 47).addBox(-0.0592F, -2.0051F, -13.444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.3668F, 0.1876F, 0.0025F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(88, 59).addBox(-0.0592F, -1.7847F, -12.8735F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.3494F, 0.1876F, 0.0025F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(87, 31).addBox(-0.807F, -1.0142F, -11.3777F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.2794F, 0.1178F, 0.0024F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(88, 55).addBox(-0.807F, -0.9725F, -9.7811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.275F, 0.1178F, 0.0024F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(88, 51).addBox(-0.807F, -0.8336F, -8.1933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.2576F, 0.1178F, 0.0024F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(24, 88).addBox(-0.8635F, -0.7229F, -6.6008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.24F, 0.1091F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(17, 88).addBox(-0.8635F, -0.6395F, -5.0092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.2225F, 0.1091F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(89, 39).addBox(-0.8093F, -1.397F, -9.7158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.3185F, 0.1178F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(89, 35).addBox(-0.8093F, -1.1547F, -8.1487F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.288F, 0.1178F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(89, 0).addBox(-0.8635F, -1.0986F, -6.5544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.2793F, 0.1091F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(88, 67).addBox(-0.8635F, -0.9321F, -4.9828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.2443F, 0.1091F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(88, 63).addBox(-0.8635F, -0.7645F, -3.4168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.0491F, 0.3487F, -2.4956F, 0.192F, 0.1091F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(107, 13).addBox(0.0741F, 2.6735F, 7.9831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 85).addBox(0.0741F, 2.6735F, 6.5831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7851F, -6.8882F, 0.5671F, 0.0872F, -0.0012F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 43).addBox(0.0741F, -0.0172F, 5.9349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7851F, -6.8882F, 0.2006F, 0.0872F, -0.0012F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(40, 66).addBox(-0.6861F, -0.7198F, -0.3803F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7851F, -6.8882F, 0.0859F, 0.2091F, -0.0099F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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