package fossils.fossils.client.blockentity.model.cycnorhamphus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CycnorhamphusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart leftwing1membrance;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart righthand2;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart rightwing1membrance;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
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
	private final ModelPart bone3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public CycnorhamphusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.leftwing1 = this.chest.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.lefthand2 = this.leftwing3.getChild("lefthand2");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing7 = this.leftwing5.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.chest.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.righthand2 = this.rightwing3.getChild("righthand2");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing7 = this.rightwing5.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.body3 = this.chest.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body1 = this.body.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
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
		this.bone3 = this.body1.getChild("bone3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.5F, -8.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.693F, 9.1613F, -0.4005F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(104, 49).addBox(-0.8F, -0.4754F, -0.136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck5_r1 = chest.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(107, 61).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.26F, 0.1488F, -0.4728F));

		PartDefinition neck7_r1 = chest.addOrReplaceChild("neck7_r1", CubeListBuilder.create().texOffs(75, 25).mirror().addBox(-4.8696F, -1.1537F, -0.3551F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.0294F, 0.2805F, -1.4937F));

		PartDefinition neck6_r1 = chest.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(5, 105).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.359F, -0.0453F, 0.168F, 0.2276F, -0.9551F));

		PartDefinition neck4_r1 = chest.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(107, 61).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.26F, -0.1488F, 0.4728F));

		PartDefinition neck6_r2 = chest.addOrReplaceChild("neck6_r2", CubeListBuilder.create().texOffs(75, 25).addBox(0.8696F, -1.1537F, -0.3551F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.0294F, -0.2805F, 1.4937F));

		PartDefinition neck5_r2 = chest.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(5, 105).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.359F, -0.0453F, 0.168F, -0.2276F, 0.9551F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(101, 89).addBox(-0.5F, 0.7785F, -2.5275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 5.7274F, -0.3771F, -0.5411F, 0.0F, 0.0F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(79, 90).addBox(-0.5F, 0.1004F, -2.283F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.7274F, -0.3771F, -0.192F, 0.0F, 0.0F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(52, 51).addBox(-0.5F, -0.047F, -0.8298F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.153F))
				.texOffs(64, 28).addBox(-1.5F, -0.572F, 0.7702F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 5.7274F, -0.3771F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(50, 71).addBox(-1.5F, -0.3338F, -0.4115F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 5.7274F, -0.3771F, 0.288F, 0.0F, 0.0F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(34, 69).addBox(-1.5F, -0.7169F, -0.8038F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.7274F, -0.3771F, 0.3752F, 0.0F, 0.0F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(64, 33).addBox(-1.5F, -0.275F, -1.625F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 5.0593F, 1.8433F, -0.0785F, 0.0F, 0.0F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(13, 62).addBox(-1.0F, -0.622F, -2.6298F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.7274F, -0.3771F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(68, 77).addBox(-0.5F, -0.7553F, -2.8856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6239F, 1.9768F, -1.0125F, 0.3113F, -0.5206F, 0.6983F));

		PartDefinition upperwing11_r1 = leftwing1.addOrReplaceChild("upperwing11_r1", CubeListBuilder.create().texOffs(80, 100).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(0.8427F, 0.444F, -0.7226F, -1.1778F, -0.0403F, -0.0167F));

		PartDefinition upperwing12_r1 = leftwing1.addOrReplaceChild("upperwing12_r1", CubeListBuilder.create().texOffs(39, 66).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.086F)), PartPose.offsetAndRotation(3.4375F, 0.0073F, 0.3316F, -1.1657F, 0.2415F, 0.1022F));

		PartDefinition upperwing11_r2 = leftwing1.addOrReplaceChild("upperwing11_r2", CubeListBuilder.create().texOffs(91, 39).addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.087F)), PartPose.offsetAndRotation(2.1932F, 0.0343F, 0.2664F, -1.163F, -0.2655F, -0.1129F));

		PartDefinition upperwing10_r1 = leftwing1.addOrReplaceChild("upperwing10_r1", CubeListBuilder.create().texOffs(56, 81).addBox(-1.3F, -0.825F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8855F, 0.23F, -0.206F, -1.0031F, -0.7789F, -0.4212F));

		PartDefinition upperwing21_r1 = leftwing1.addOrReplaceChild("upperwing21_r1", CubeListBuilder.create().texOffs(60, 90).addBox(-0.7F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(9.5089F, 0.6631F, -1.2597F, -0.7763F, -1.0047F, -0.71F));

		PartDefinition upperwing20_r1 = leftwing1.addOrReplaceChild("upperwing20_r1", CubeListBuilder.create().texOffs(55, 99).addBox(-0.4028F, 1.7638F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(7.4846F, 1.0665F, -2.2541F, 0.8863F, -0.9207F, -2.5655F));

		PartDefinition upperwing19_r1 = leftwing1.addOrReplaceChild("upperwing19_r1", CubeListBuilder.create().texOffs(91, 42).addBox(-1.5F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(8.0748F, 0.3566F, -0.5197F, 1.1665F, -0.2334F, -3.0429F));

		PartDefinition upperwing17_r1 = leftwing1.addOrReplaceChild("upperwing17_r1", CubeListBuilder.create().texOffs(13, 53).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(3.2582F, -0.1054F, 0.6037F, 0.573F, 1.098F, 2.1979F));

		PartDefinition upperwing15_r1 = leftwing1.addOrReplaceChild("upperwing15_r1", CubeListBuilder.create().texOffs(92, 3).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(2.5012F, -0.2652F, 0.9894F, 0.8478F, 0.954F, 2.5178F));

		PartDefinition upperwing14_r1 = leftwing1.addOrReplaceChild("upperwing14_r1", CubeListBuilder.create().texOffs(35, 92).addBox(-0.9F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.088F)), PartPose.offsetAndRotation(0.6495F, -0.7621F, 2.1892F, 1.1732F, 0.1531F, 3.0776F));

		PartDefinition upperwing13_r1 = leftwing1.addOrReplaceChild("upperwing13_r1", CubeListBuilder.create().texOffs(106, 82).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.1849F, -0.5129F, 1.5875F, 1.1001F, -0.5663F, -2.8751F));

		PartDefinition upperwing12_r2 = leftwing1.addOrReplaceChild("upperwing12_r2", CubeListBuilder.create().texOffs(20, 107).addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.005F, -0.2146F, 0.8673F, -0.4975F, -1.1202F, -1.028F));

		PartDefinition upperwing11_r3 = leftwing1.addOrReplaceChild("upperwing11_r3", CubeListBuilder.create().texOffs(92, 8).addBox(-1.2F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.754F, -0.0527F, 0.4764F, 0.7954F, -0.9924F, -2.4544F));

		PartDefinition upperwing9_r1 = leftwing1.addOrReplaceChild("upperwing9_r1", CubeListBuilder.create().texOffs(91, 36).addBox(-0.2F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.388F, 0.2643F, -0.2888F, -0.7763F, -1.0047F, -0.71F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create().texOffs(47, 7).addBox(-0.6789F, -0.0386F, -0.1429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 51).addBox(-0.6789F, -0.0386F, -0.9429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(10.4669F, 0.3964F, -0.9368F, -1.6694F, 0.4635F, -1.6052F));

		PartDefinition wing8_r1 = leftwing2.addOrReplaceChild("wing8_r1", CubeListBuilder.create().texOffs(77, 94).addBox(-2.5548F, 1.7769F, 0.3196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.0414F, 11.2822F, 1.3787F, 0.0F, -1.5708F, 0.6283F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create().texOffs(19, 43).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(24, 43).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.5456F, 13.6746F, -0.0815F, 0.7354F, 0.4748F, 0.6638F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5543F, -0.3751F, -0.1647F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1066F, 16.2342F, 0.8308F, -0.3936F, 0.5357F, 0.3398F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1831F, 16.2114F, 0.6579F, 1.2486F, -0.1983F, -0.2533F));

		PartDefinition wingfingerbase9_r1 = leftwing4.addOrReplaceChild("wingfingerbase9_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0774F, 0.4648F, 8.2938F, 0.0F, 0.1571F, 0.0F));

		PartDefinition wingfingerbase8_r1 = leftwing4.addOrReplaceChild("wingfingerbase8_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0774F, 0.4648F, 8.2938F, 0.0F, 0.0698F, 0.0F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create().texOffs(0, 24).addBox(-0.4796F, -0.2223F, -0.3165F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0028F, 0.1649F, 21.3633F, 0.2767F, -0.0101F, 0.1844F));

		PartDefinition leftwing7 = leftwing5.addOrReplaceChild("leftwing7", CubeListBuilder.create().texOffs(37, 24).addBox(-0.5845F, -0.4415F, -0.2015F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1189F, 0.1901F, 16.3617F, 0.2781F, -0.0982F, 0.1593F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create().texOffs(37, 38).addBox(-0.5153F, -0.5852F, -0.193F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0788F, 0.1381F, 11.3834F, 0.3209F, 0.0636F, 0.1951F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8201F, 0.4836F, 8.746F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3497F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6239F, 2.9768F, -1.0125F, 1.8494F, 1.2822F, 1.094F));

		PartDefinition upperwing12_r3 = rightwing1.addOrReplaceChild("upperwing12_r3", CubeListBuilder.create().texOffs(80, 100).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)).mirror(false), PartPose.offsetAndRotation(-0.8427F, 0.444F, -0.7226F, -1.1778F, 0.0403F, 0.0167F));

		PartDefinition upperwing13_r2 = rightwing1.addOrReplaceChild("upperwing13_r2", CubeListBuilder.create().texOffs(39, 66).mirror().addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.086F)).mirror(false), PartPose.offsetAndRotation(-3.4375F, 0.0073F, 0.3316F, -1.1657F, -0.2415F, -0.1022F));

		PartDefinition upperwing12_r4 = rightwing1.addOrReplaceChild("upperwing12_r4", CubeListBuilder.create().texOffs(91, 39).mirror().addBox(-1.0F, -0.425F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.087F)).mirror(false), PartPose.offsetAndRotation(-2.1932F, 0.0343F, 0.2664F, -1.163F, 0.2655F, 0.1129F));

		PartDefinition upperwing11_r4 = rightwing1.addOrReplaceChild("upperwing11_r4", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(-1.7F, -0.825F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8855F, 0.23F, -0.206F, -1.0031F, 0.7789F, 0.4212F));

		PartDefinition upperwing22_r1 = rightwing1.addOrReplaceChild("upperwing22_r1", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(-0.3F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-9.5089F, 0.6631F, -1.2597F, -0.7763F, 1.0047F, 0.71F));

		PartDefinition upperwing21_r2 = rightwing1.addOrReplaceChild("upperwing21_r2", CubeListBuilder.create().texOffs(55, 99).mirror().addBox(-0.5972F, 1.7638F, -0.4922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-7.4846F, 1.0665F, -2.2541F, 0.8863F, 0.9207F, 2.5655F));

		PartDefinition upperwing20_r2 = rightwing1.addOrReplaceChild("upperwing20_r2", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(-0.5F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.088F)).mirror(false), PartPose.offsetAndRotation(-8.0748F, 0.3566F, -0.5197F, 1.1665F, 0.2334F, 3.0429F));

		PartDefinition upperwing18_r1 = rightwing1.addOrReplaceChild("upperwing18_r1", CubeListBuilder.create().texOffs(13, 53).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-3.2582F, -0.1054F, 0.6037F, 0.573F, -1.098F, -2.1979F));

		PartDefinition upperwing16_r1 = rightwing1.addOrReplaceChild("upperwing16_r1", CubeListBuilder.create().texOffs(92, 3).mirror().addBox(-0.6F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-2.5012F, -0.2652F, 0.9894F, 0.8478F, -0.954F, -2.5178F));

		PartDefinition upperwing15_r2 = rightwing1.addOrReplaceChild("upperwing15_r2", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(-0.1F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.088F)).mirror(false), PartPose.offsetAndRotation(-0.6495F, -0.7621F, 2.1892F, 1.1732F, -0.1531F, -3.0776F));

		PartDefinition upperwing14_r2 = rightwing1.addOrReplaceChild("upperwing14_r2", CubeListBuilder.create().texOffs(106, 82).mirror().addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.1849F, -0.5129F, 1.5875F, 1.1001F, 0.5663F, 2.8751F));

		PartDefinition upperwing13_r3 = rightwing1.addOrReplaceChild("upperwing13_r3", CubeListBuilder.create().texOffs(20, 107).mirror().addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.005F, -0.2146F, 0.8673F, -0.4975F, 1.1202F, 1.028F));

		PartDefinition upperwing12_r5 = rightwing1.addOrReplaceChild("upperwing12_r5", CubeListBuilder.create().texOffs(92, 8).mirror().addBox(-0.8F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.754F, -0.0527F, 0.4764F, 0.7954F, 0.9924F, 2.4544F));

		PartDefinition upperwing10_r2 = rightwing1.addOrReplaceChild("upperwing10_r2", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(-1.8F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.388F, 0.2643F, -0.2888F, -0.7763F, 1.0047F, 0.71F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create().texOffs(47, 7).mirror().addBox(-0.3211F, -0.0386F, -0.1429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(34, 51).mirror().addBox(-0.3211F, -0.0386F, -0.9429F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-10.4669F, 0.3964F, -0.9368F, -2.1057F, -0.4635F, 1.6052F));

		PartDefinition wing9_r1 = rightwing2.addOrReplaceChild("wing9_r1", CubeListBuilder.create().texOffs(77, 94).mirror().addBox(1.5548F, 1.7769F, 0.3196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.0414F, 11.2822F, 1.3787F, 0.0F, 1.5708F, -0.6283F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create().texOffs(19, 43).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(24, 43).mirror().addBox(-0.5F, 0.0F, 0.2F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.5456F, 13.6746F, -0.0815F, 0.7044F, -0.5592F, -0.7091F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-1.3797F, -0.0379F, -0.1717F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1066F, 16.2342F, 0.3308F, -0.1431F, -0.5041F, -0.1419F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1831F, 16.2114F, 0.6579F, 1.2486F, 0.1983F, 0.2533F));

		PartDefinition wingfingerbase10_r1 = rightwing4.addOrReplaceChild("wingfingerbase10_r1", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0774F, 0.4648F, 8.2938F, 0.0F, -0.1571F, 0.0F));

		PartDefinition wingfingerbase9_r2 = rightwing4.addOrReplaceChild("wingfingerbase9_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 22.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0774F, 0.4648F, 8.2938F, 0.0F, -0.0698F, 0.0F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-0.5204F, -0.2223F, -0.3165F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0028F, 0.1649F, 21.3633F, 0.2767F, 0.0101F, -0.1844F));

		PartDefinition rightwing7 = rightwing5.addOrReplaceChild("rightwing7", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(-0.4155F, -0.4415F, -0.2015F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1189F, 0.1901F, 16.3617F, 0.2781F, 0.0982F, -0.1593F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create().texOffs(37, 38).mirror().addBox(-0.4847F, -0.5851F, -0.193F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0788F, 0.1381F, 11.3834F, 0.3209F, -0.0636F, -0.1951F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8201F, 0.4836F, 8.746F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3497F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2719F, 1.4222F, -1.0716F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 105).addBox(-1.2F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 105).addBox(-1.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8506F, -1.0749F, -0.0367F, 0.4165F, -1.3714F, -0.3816F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 83).addBox(0.5805F, -0.258F, -0.1954F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.9218F, 0.0892F, -1.2457F, 1.6281F, -1.0232F, -1.3869F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 81).addBox(0.0412F, -0.1251F, -0.1954F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9218F, 0.0892F, -1.2457F, 1.6188F, -0.9012F, -1.3757F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 108).addBox(-0.9F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(86, 106).addBox(-0.9F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7566F, -0.9835F, -0.1055F, -1.2791F, -0.8896F, 1.384F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 11).addBox(-0.35F, -1.6F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7566F, -0.9835F, -0.1055F, -1.476F, -0.9199F, 1.6339F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(86, 32).addBox(-0.3061F, -0.6051F, -4.3158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8692F, -2.9885F, 2.5541F, 0.5146F, 0.0397F, 0.0662F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 76).addBox(1.7276F, -1.0561F, 2.4519F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1041F, -1.4023F, -1.2333F, 0.127F, -0.147F, 0.0255F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(91, 19).addBox(-0.6388F, -0.2704F, -1.8463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8692F, -2.4885F, 1.6791F, 0.3137F, -0.1478F, -0.0202F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2719F, 1.4222F, -1.0716F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 105).mirror().addBox(0.2F, 0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 105).mirror().addBox(0.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8506F, -1.0749F, -0.0367F, 0.4165F, 1.3714F, 0.3816F));

		PartDefinition cube_r10 = bone4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 83).mirror().addBox(-1.5805F, -0.258F, -0.1954F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.9218F, 0.0892F, -1.2457F, 1.6281F, 1.0232F, 1.3869F));

		PartDefinition cube_r11 = bone4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 81).mirror().addBox(-1.0412F, -0.1251F, -0.1954F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9218F, 0.0892F, -1.2457F, 1.6188F, 0.9012F, 1.3757F));

		PartDefinition cube_r12 = bone4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(86, 106).mirror().addBox(-0.1F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7566F, -0.9835F, -0.1055F, -1.2791F, 0.8896F, -1.384F));

		PartDefinition cube_r13 = bone4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(92, 11).mirror().addBox(-0.65F, -1.6F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7566F, -0.9835F, -0.1055F, -1.476F, 0.9199F, -1.6339F));

		PartDefinition cube_r14 = bone4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(86, 32).mirror().addBox(-0.6939F, -0.6051F, -4.3158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8692F, -2.9885F, 2.5541F, 0.5146F, -0.0397F, -0.0662F));

		PartDefinition cube_r15 = bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(59, 76).mirror().addBox(-2.7276F, -1.0561F, 2.4519F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1041F, -1.4023F, -1.2333F, 0.127F, 0.147F, -0.0255F));

		PartDefinition cube_r16 = bone4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-0.3612F, -0.2704F, -1.8463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.8692F, -2.4885F, 1.6791F, 0.3137F, 0.1478F, 0.0202F));

		PartDefinition body3 = chest.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7122F, 1.4007F, -0.2269F, 0.0F, 0.0F));

		PartDefinition chest_r10 = body3.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(101, 92).addBox(-0.5F, -0.5731F, -0.1837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, -0.3474F, 1.989F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest_r11 = body3.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(30, 107).addBox(-0.8F, -1.025F, 1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(76, 61).addBox(-0.5F, -0.575F, 1.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.3609F, -1.4963F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck7_r2 = body3.addOrReplaceChild("neck7_r2", CubeListBuilder.create().texOffs(15, 105).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0109F, 2.0577F, 0.4355F, 0.2335F, -0.4393F));

		PartDefinition neck8_r1 = body3.addOrReplaceChild("neck8_r1", CubeListBuilder.create().texOffs(106, 88).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0109F, 2.0577F, 0.287F, 0.3825F, -0.9192F));

		PartDefinition neck9_r1 = body3.addOrReplaceChild("neck9_r1", CubeListBuilder.create().texOffs(76, 53).mirror().addBox(-4.8696F, -1.1537F, -0.3551F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0109F, 2.0577F, 0.0459F, 0.4718F, -1.4877F));

		PartDefinition neck8_r2 = body3.addOrReplaceChild("neck8_r2", CubeListBuilder.create().texOffs(52, 21).mirror().addBox(-4.8696F, -1.1537F, -0.3551F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1891F, 0.1577F, 0.0509F, 0.524F, -1.4853F));

		PartDefinition neck6_r3 = body3.addOrReplaceChild("neck6_r3", CubeListBuilder.create().texOffs(5, 108).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1891F, 0.1577F, 0.4845F, 0.2555F, -0.4275F));

		PartDefinition neck7_r3 = body3.addOrReplaceChild("neck7_r3", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1891F, 0.1577F, 0.3219F, 0.4239F, -0.9055F));

		PartDefinition neck6_r4 = body3.addOrReplaceChild("neck6_r4", CubeListBuilder.create().texOffs(15, 105).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0109F, 2.0577F, 0.4355F, -0.2335F, 0.4393F));

		PartDefinition neck7_r4 = body3.addOrReplaceChild("neck7_r4", CubeListBuilder.create().texOffs(106, 88).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0109F, 2.0577F, 0.287F, -0.3825F, 0.9192F));

		PartDefinition neck8_r3 = body3.addOrReplaceChild("neck8_r3", CubeListBuilder.create().texOffs(76, 53).addBox(0.8696F, -1.1537F, -0.3551F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.0109F, 2.0577F, 0.0459F, -0.4718F, 1.4877F));

		PartDefinition neck7_r5 = body3.addOrReplaceChild("neck7_r5", CubeListBuilder.create().texOffs(52, 21).addBox(0.8696F, -1.1537F, -0.3551F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1891F, 0.1577F, 0.0509F, -0.524F, 1.4853F));

		PartDefinition neck5_r3 = body3.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(5, 108).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1891F, 0.1577F, 0.4845F, -0.2555F, 0.4275F));

		PartDefinition neck6_r5 = body3.addOrReplaceChild("neck6_r5", CubeListBuilder.create().texOffs(10, 105).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1891F, 0.1577F, 0.3219F, -0.4239F, 0.9055F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1672F, 2.5994F, 0.1612F, 0.0793F, 0.0569F));

		PartDefinition body4_r1 = body2.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(107, 44).addBox(-0.8F, -0.5224F, -0.1847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1521F, 1.1046F, -0.1484F, 0.0F, 0.0F));

		PartDefinition neck8_r4 = body2.addOrReplaceChild("neck8_r4", CubeListBuilder.create().texOffs(107, 41).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2042F, 1.1629F, 0.3231F, 0.1803F, -0.4624F));

		PartDefinition neck9_r2 = body2.addOrReplaceChild("neck9_r2", CubeListBuilder.create().texOffs(71, 104).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2042F, 1.1629F, 0.2099F, 0.2843F, -0.9444F));

		PartDefinition neck10_r1 = body2.addOrReplaceChild("neck10_r1", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-3.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2042F, 1.1629F, 0.0351F, 0.3501F, -1.492F));

		PartDefinition neck7_r6 = body2.addOrReplaceChild("neck7_r6", CubeListBuilder.create().texOffs(107, 41).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2042F, 1.1629F, 0.3231F, -0.1803F, 0.4624F));

		PartDefinition neck8_r5 = body2.addOrReplaceChild("neck8_r5", CubeListBuilder.create().texOffs(71, 104).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2042F, 1.1629F, 0.2099F, -0.2843F, 0.9444F));

		PartDefinition neck9_r3 = body2.addOrReplaceChild("neck9_r3", CubeListBuilder.create().texOffs(65, 82).addBox(0.8696F, -1.1537F, -0.3551F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2042F, 1.1629F, 0.0351F, -0.3501F, 1.492F));

		PartDefinition body3_r1 = body2.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(75, 43).addBox(-0.5F, -0.9F, 0.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4479F, -0.2954F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4479F, 2.7046F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body4_r2 = body.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(85, 100).addBox(-0.8F, -1.15F, 4.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 100).addBox(-0.8F, -1.225F, 2.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 65).addBox(-0.5F, -0.9F, 2.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck12_r1 = body.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(70, 100).mirror().addBox(-2.5696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 100).mirror().addBox(-1.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1687F, 0.1334F, 0.0301F, 0.2892F, -1.4935F));

		PartDefinition neck10_r2 = body.addOrReplaceChild("neck10_r2", CubeListBuilder.create().texOffs(85, 103).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1563F, 2.1584F, -0.1103F, -0.0203F, -0.2751F));

		PartDefinition neck10_r3 = body.addOrReplaceChild("neck10_r3", CubeListBuilder.create().texOffs(80, 103).mirror().addBox(-1.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1687F, 0.1334F, 0.1731F, 0.2347F, -0.9539F));

		PartDefinition neck9_r4 = body.addOrReplaceChild("neck9_r4", CubeListBuilder.create().texOffs(106, 85).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.1687F, 0.1334F, 0.2678F, 0.1527F, -0.4716F));

		PartDefinition neck9_r5 = body.addOrReplaceChild("neck9_r5", CubeListBuilder.create().texOffs(85, 103).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1563F, 2.1584F, -0.1103F, 0.0203F, 0.2751F));

		PartDefinition neck9_r6 = body.addOrReplaceChild("neck9_r6", CubeListBuilder.create().texOffs(80, 103).addBox(0.5297F, -0.5F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.1687F, 0.1334F, 0.1731F, -0.2347F, 0.9539F));

		PartDefinition neck8_r6 = body.addOrReplaceChild("neck8_r6", CubeListBuilder.create().texOffs(106, 85).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.1687F, 0.1334F, 0.2678F, -0.1527F, 0.4716F));

		PartDefinition neck11_r1 = body.addOrReplaceChild("neck11_r1", CubeListBuilder.create().texOffs(70, 100).addBox(1.5696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 100).addBox(0.8696F, -1.1537F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -0.1687F, 0.1334F, 0.0301F, -0.2892F, 1.4935F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3033F, 3.6022F, -0.0138F, 0.0F, 0.0F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(107, 67).addBox(-0.8F, -0.5053F, -0.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 105).addBox(-0.8F, -0.5303F, -2.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 62).addBox(-0.5F, -0.3303F, -2.7889F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2105F, 2.6253F, -0.0785F, 0.0F, 0.0F));

		PartDefinition neck12_r2 = body1.addOrReplaceChild("neck12_r2", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1717F, 2.2565F, -0.1033F, -0.0437F, -0.1867F));

		PartDefinition neck11_r2 = body1.addOrReplaceChild("neck11_r2", CubeListBuilder.create().texOffs(90, 103).mirror().addBox(-0.9265F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0717F, 0.2565F, -0.1033F, -0.0437F, -0.274F));

		PartDefinition neck11_r3 = body1.addOrReplaceChild("neck11_r3", CubeListBuilder.create().texOffs(90, 100).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.1717F, 2.2565F, -0.1033F, 0.0437F, 0.1867F));

		PartDefinition neck10_r4 = body1.addOrReplaceChild("neck10_r4", CubeListBuilder.create().texOffs(90, 103).addBox(-0.0735F, -0.1392F, -0.3766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.0717F, 0.2565F, -0.1033F, 0.0437F, 0.274F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(85, 3).addBox(-0.5F, -0.198F, -0.2471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.1685F, 3.7018F, -0.1665F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(85, 7).addBox(-0.5F, -0.5011F, -0.2011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3087F, 1.6342F, 0.1423F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(85, 11).addBox(-0.5F, -0.575F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0969F, 1.5027F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg = body1.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3329F, 0.6193F, 2.6502F, 0.4392F, -0.1363F, -0.2469F));

		PartDefinition cube_r17 = leftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, -0.371F, -0.7295F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1987F)), PartPose.offsetAndRotation(0.1F, 1.8128F, 0.0938F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 99).addBox(-0.5F, 6.8291F, -2.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1F, 1.8128F, 0.0938F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1F, 0.3901F, -0.254F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(94, 49).addBox(-0.5F, -1.9F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1F, 2.3F, -0.3F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(21, 94).addBox(-0.5F, -1.875F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 2.3F, -0.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, 1.2F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(29, 43).addBox(-0.4F, -0.2F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 61).addBox(0.3F, -0.2F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2038F, 9.8737F, 0.1566F, 0.7477F, -0.0588F, 0.0776F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -0.6F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3373F, 15.92F, -0.2614F, -0.1092F, 0.1435F, -0.0268F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0643F, -0.2724F, -0.0431F));

		PartDefinition cube_r22 = finger.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(53, 84).addBox(-0.4983F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 28).addBox(-0.4983F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2142F, 0.0542F, -0.3309F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r23 = finger.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(103, 73).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0858F, 0.0542F, 1.0691F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(62, 44).addBox(-1.0F, -0.0101F, -3.9001F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, -0.5229F, 0.0F, 0.0F));

		PartDefinition rightLeg = body1.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3329F, 0.6193F, 2.6502F, -0.0844F, 0.1363F, 0.2469F));

		PartDefinition cube_r24 = rightLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.5F, -0.371F, -0.7295F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1987F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.8128F, 0.0938F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.5F, 6.8291F, -2.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.8128F, 0.0938F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.5F, -0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3901F, -0.254F, -2.33F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(94, 49).mirror().addBox(-0.5F, -1.9F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.3F, -0.3F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(21, 94).mirror().addBox(-0.5F, -1.875F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.3F, -0.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, 1.2F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(29, 43).mirror().addBox(-0.6F, -0.2F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 61).mirror().addBox(-1.3F, -0.2F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2038F, 9.8737F, 0.1566F, 0.5295F, 0.0588F, -0.0776F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.0F, -0.6F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3373F, 15.92F, -0.2614F, 0.3838F, -0.1525F, -0.0609F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0643F, 0.2724F, 0.0431F));

		PartDefinition cube_r29 = finger2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 84).mirror().addBox(-0.5017F, -0.5F, -2.9238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 28).mirror().addBox(-0.5017F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2142F, 0.0542F, -0.3309F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r30 = finger2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(103, 73).mirror().addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0858F, 0.0542F, 1.0691F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(-1.0F, -0.0101F, -3.9001F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, -0.2611F, 0.0F, 0.0F));

		PartDefinition bone = body1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0844F, 1.0436F, 1.2034F, 0.4552F, 0.0791F, 0.037F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(108, 27).addBox(-0.338F, -0.7503F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.1171F, -0.3523F, -0.1921F, -0.498F, -0.1974F, 0.0934F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(14, 87).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6224F, -1.9664F, -2.2939F, -1.006F, -0.1741F, 0.116F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(90, 60).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2949F, -0.8701F, -1.1754F, -0.7772F, -0.1974F, 0.0934F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(107, 64).addBox(-0.2243F, -0.3379F, -0.7948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1171F, -0.9523F, -0.4921F, -0.6027F, -0.1974F, 0.0934F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(7, 91).addBox(-0.3332F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1171F, -0.0523F, -0.3921F, -0.4119F, -0.1886F, 0.1104F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(86, 76).addBox(-0.5F, -0.825F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.2458F, 3.0182F, 0.5939F, -1.3761F, -0.2106F, 0.0573F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(15, 102).addBox(-0.675F, -1.225F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2066F, 2.1449F, -0.4476F, -0.6606F, -0.2106F, 0.0573F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(102, 14).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0555F, 2.0337F, 0.0054F, 1.1633F, -0.2106F, 0.0573F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(102, 11).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.13F, 2.5954F, 0.2028F, 0.343F, -0.2106F, 0.0573F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 102).addBox(-0.9554F, -0.797F, -0.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2066F, 2.9949F, 0.7024F, -0.7478F, -0.2106F, 0.0573F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(108, 15).addBox(-0.5F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 108).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.4043F, -0.2231F, 2.2618F, -0.6851F, -0.1575F, 0.1448F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(28, 91).addBox(-0.3952F, -0.2378F, -0.4963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2731F, -0.4463F, 0.9792F, -0.2138F, -0.1575F, 0.1448F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(86, 72).addBox(-0.7748F, -0.7865F, -1.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, -0.3252F, -0.1825F, 0.0678F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 104).addBox(-1.0417F, -0.5601F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(20, 104).addBox(-0.9417F, -0.5601F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(104, 6).addBox(-0.5417F, -0.5601F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 1.7845F, -2.6402F, -0.1787F, -0.3009F, 0.0535F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 86).addBox(-0.775F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F))
				.texOffs(86, 24).addBox(-0.6F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5632F, 1.0891F, -3.9856F, -0.3309F, 0.5957F, 1.581F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(65, 85).addBox(-0.625F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5385F, 1.3666F, -4.0968F, -0.2937F, 0.3796F, 1.6598F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 56).addBox(-0.65F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.4867F, 1.6607F, -4.1251F, -0.2735F, 0.0946F, 1.7449F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(85, 46).addBox(-0.6199F, -0.7459F, -1.9881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.2221F, 1.7845F, -2.6402F, -0.2723F, 0.0106F, 1.7685F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(36, 100).addBox(-1.025F, -0.5F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.3015F, 1.7068F, -3.5079F, -0.3309F, 0.5957F, 1.581F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(85, 15).addBox(-0.7007F, -0.7459F, -1.6807F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(-0.1836F, 1.96F, -2.9005F, -0.2747F, -0.1323F, 1.8086F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(75, 38).addBox(-0.3711F, -0.4832F, -2.2307F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2221F, 1.2845F, -1.1402F, 0.248F, -0.1213F, 0.1165F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(97, 99).addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(97, 62).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1453F, -0.2172F, -0.5398F, 1.0848F, -0.2106F, 0.0573F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 76).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.191F)), PartPose.offsetAndRotation(0.1453F, -0.2172F, -0.5398F, 0.6048F, -0.2106F, 0.0573F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 102).addBox(-0.5F, -0.775F, -1.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 1.1284F, -0.2106F, 0.0573F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5F, 0.3F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.5175F, -0.2106F, 0.0573F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 72).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, -0.3551F, -0.2106F, 0.0573F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(9, 82).addBox(-0.7748F, -1.1921F, 0.536F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, 2.0223F, -0.1825F, 0.0678F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(102, 3).addBox(-0.7748F, 0.7293F, 0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, 2.6681F, -0.1825F, 0.0678F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(102, 0).addBox(-0.7748F, 0.7368F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, -2.8734F, -0.1825F, 0.0678F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 102).addBox(-0.7748F, -0.3336F, -1.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.1296F, 2.4177F, 1.5464F, -1.7563F, -0.1825F, 0.0678F));

		PartDefinition bone3 = body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0844F, 1.0436F, 1.2034F, 0.4552F, -0.0791F, -0.037F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(108, 27).mirror().addBox(-0.662F, -0.7503F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.3523F, -0.1921F, -0.498F, 0.1974F, -0.0934F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(14, 87).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6224F, -1.9664F, -2.2939F, -1.006F, 0.1741F, -0.116F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(90, 60).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2949F, -0.8701F, -1.1754F, -0.7772F, 0.1974F, -0.0934F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(107, 64).mirror().addBox(-0.7757F, -0.3379F, -0.7948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.9523F, -0.4921F, -0.6027F, 0.1974F, -0.0934F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(7, 91).mirror().addBox(-0.6668F, -1.1141F, -0.2643F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.1171F, -0.0523F, -0.3921F, -0.4119F, 0.1886F, -0.1104F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(86, 76).mirror().addBox(-0.5F, -0.825F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.2458F, 3.0182F, 0.5939F, -1.3761F, 0.2106F, -0.0573F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(15, 102).mirror().addBox(-0.325F, -1.225F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 2.1449F, -0.4476F, -0.6606F, 0.2106F, -0.0573F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(102, 14).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0555F, 2.0337F, 0.0054F, 1.1633F, 0.2106F, -0.0573F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(102, 11).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.13F, 2.5954F, 0.2028F, 0.343F, 0.2106F, -0.0573F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(10, 102).mirror().addBox(-0.0446F, -0.797F, -0.7613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2066F, 2.9949F, 0.7024F, -0.7478F, 0.2106F, -0.0573F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(108, 15).mirror().addBox(-0.5F, -0.2F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 108).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.4043F, -0.2231F, 2.2618F, -0.6851F, 0.1575F, -0.1448F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(28, 91).mirror().addBox(-0.6048F, -0.2378F, -0.4963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4463F, 0.9792F, -0.2138F, 0.1575F, -0.1448F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-0.2252F, -0.7865F, -1.7498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, -0.3252F, 0.1825F, -0.0678F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(30, 104).mirror().addBox(0.0417F, -0.5601F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(20, 104).mirror().addBox(-0.0583F, -0.5601F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(104, 6).mirror().addBox(-0.4583F, -0.5601F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.7845F, -2.6402F, -0.1787F, 0.3009F, -0.0535F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.225F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(86, 24).mirror().addBox(-0.4F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5632F, 1.0891F, -3.9856F, -0.3309F, -0.5957F, -1.581F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(65, 85).mirror().addBox(-0.375F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5385F, 1.3666F, -4.0968F, -0.2937F, -0.3796F, -1.6598F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(85, 56).mirror().addBox(-0.35F, -0.5F, -0.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.4867F, 1.6607F, -4.1251F, -0.2735F, -0.0946F, -1.7449F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(-0.3801F, -0.7459F, -1.9881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.7845F, -2.6402F, -0.2723F, -0.0106F, -1.7685F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(36, 100).mirror().addBox(0.025F, -0.5F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.3015F, 1.7068F, -3.5079F, -0.3309F, -0.5957F, -1.581F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(85, 15).mirror().addBox(-0.2992F, -0.7459F, -1.6807F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.1836F, 1.96F, -2.9005F, -0.2747F, 0.1323F, -1.8086F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(75, 38).mirror().addBox(-0.6289F, -0.4832F, -2.2307F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2221F, 1.2845F, -1.1402F, 0.248F, 0.1213F, -0.1165F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(97, 99).mirror().addBox(-0.5F, 0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(97, 62).mirror().addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1453F, -0.2172F, -0.5398F, 1.0848F, 0.2106F, -0.0573F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(93, 76).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.191F)).mirror(false), PartPose.offsetAndRotation(-0.1453F, -0.2172F, -0.5398F, 0.6048F, 0.2106F, -0.0573F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.5F, -0.775F, -1.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 1.1284F, 0.2106F, -0.0573F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.5F, 0.3F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.5175F, 0.2106F, -0.0573F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, -0.3551F, 0.2106F, -0.0573F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(9, 82).mirror().addBox(-0.2252F, -1.1921F, 0.536F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, 2.0223F, 0.1825F, -0.0678F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(102, 3).mirror().addBox(-0.2252F, 0.7293F, 0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, 2.6681F, 0.1825F, -0.0678F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-0.2252F, 0.7368F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, -2.8734F, 0.1825F, -0.0678F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.2252F, -0.3336F, -1.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(0.1296F, 2.4177F, 1.5464F, -1.7563F, 0.1825F, -0.0678F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2503F, -1.2088F, -0.1148F, -0.1838F, -0.0654F));

		PartDefinition cube_r91 = neck1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(97, 15).addBox(-0.8F, -0.7332F, -0.908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3316F, -0.6978F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck6_r6 = neck1.addOrReplaceChild("neck6_r6", CubeListBuilder.create().texOffs(106, 91).mirror().addBox(-1.3634F, -0.6155F, -0.5879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2913F, -0.9365F, 0.5815F, 0.6717F, -0.7686F));

		PartDefinition neck5_r4 = neck1.addOrReplaceChild("neck5_r4", CubeListBuilder.create().texOffs(10, 108).mirror().addBox(-0.8266F, -0.3197F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2913F, -0.9365F, 0.809F, 0.3786F, -0.3253F));

		PartDefinition neck4_r2 = neck1.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(10, 108).addBox(-0.1734F, -0.3197F, -0.606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2913F, -0.9365F, 0.809F, -0.3786F, 0.3253F));

		PartDefinition neck5_r5 = neck1.addOrReplaceChild("neck5_r5", CubeListBuilder.create().texOffs(106, 91).addBox(0.3634F, -0.6155F, -0.5879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.2913F, -0.9365F, 0.5815F, -0.6717F, 0.7686F));

		PartDefinition cube_r92 = neck1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 33).addBox(-0.5F, -0.475F, 0.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4684F, -3.1978F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(76, 56).addBox(-0.5F, -0.4537F, -2.8481F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.372F, -2.5937F, -0.119F, -0.184F, -0.0647F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(96, 88).addBox(-0.8F, -0.85F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4287F, -1.6481F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(76, 48).addBox(-0.5F, -0.511F, -2.809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.057F, -2.6323F, -0.2897F, 0.0F, 0.0F));

		PartDefinition cube_r94 = neck3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(97, 4).addBox(-0.8F, -0.75F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.511F, -1.509F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(77, 28).addBox(-0.5F, -0.6007F, -2.8472F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(107, 52).addBox(-0.8F, -1.1507F, -2.3472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0996F, -2.6108F, -0.2548F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(76, 15).addBox(-0.5F, -0.3946F, -3.0726F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(107, 55).addBox(-0.8F, -0.9479F, -2.0132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2028F, -2.4339F, 0.2339F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(14, 91).addBox(-0.5F, -0.3946F, -2.0725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.2583F, -2.6867F, 0.8011F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1321F, -1.1163F, 0.7096F, -0.1423F, -0.1014F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -1.2793F, -0.8537F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -2.2118F, -2.0862F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(96, 92).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0F, -1.3975F, 4.2453F, -2.6398F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(102, 46).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -1.6569F, 4.6728F, 2.1162F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(102, 43).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0F, -1.956F, 5.0734F, 0.6414F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(25, 102).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -2.4509F, 5.1451F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(91, 92).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0F, -2.8297F, 4.8188F, -0.8596F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(86, 92).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -3.0965F, 4.3959F, -0.5629F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 92).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2494F)), PartPose.offsetAndRotation(0.0F, -3.2447F, 3.9184F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(92, 54).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -3.3423F, 3.428F, -0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 92).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2494F)), PartPose.offsetAndRotation(0.0F, -3.4226F, 2.9345F, -0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(92, 45).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(0.0F, -3.451F, 2.4353F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.275F, -0.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2494F)), PartPose.offsetAndRotation(0.0F, -3.1255F, -0.5471F, 0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(9, 78).addBox(-1.0F, -1.5934F, 0.0245F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.5F, -2.2118F, -2.0862F, -0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(81, 69).addBox(-1.0F, -0.2404F, -0.2539F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -2.3806F, -0.3606F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(77, 77).addBox(-1.0F, -1.7655F, 0.0711F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -2.2118F, -2.0862F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(11, 68).addBox(-1.0F, -0.2928F, -1.7425F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.5F, -0.8886F, 0.644F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(29, 78).addBox(-1.0F, -0.5793F, -0.6985F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -0.4136F, 0.469F, -1.3395F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(62, 38).addBox(-1.0F, -0.15F, -2.175F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.5F, 0.1174F, -1.4405F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, -0.15F, -0.15F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -2.1366F, -0.3547F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(16, 84).addBox(-1.5F, -0.15F, -0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.0F, -2.5705F, -0.8717F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(84, 0).addBox(-1.5F, -0.175F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -2.7265F, -1.3736F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 68).addBox(-1.5F, -0.325F, -1.55F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.0F, -2.6196F, -1.7718F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -0.15F, -2.975F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, -1.8084F, -0.4911F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(39, 59).addBox(-1.0F, -0.7F, -2.45F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.4536F, -0.1867F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(47, 80).addBox(-1.0F, -0.15F, -0.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.5F, 1.3044F, -3.0069F, 2.5787F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(38, 79).addBox(-1.0F, -0.9366F, -0.5769F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.5F, 0.5152F, -3.2725F, -2.4827F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.1521F, -0.1239F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.4498F, -2.395F, -0.4145F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(102, 52).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -0.8374F, -16.5876F, -3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(105, 101).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8069F, -15.8882F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(100, 105).addBox(-0.5F, -0.1271F, -0.8739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -0.7477F, -15.1664F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(95, 105).addBox(-0.5F, -0.8271F, -0.8739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0681F, -14.6057F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5F, -0.8271F, -0.8739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, 0.1474F, -13.9102F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(51, 102).addBox(-0.5F, -0.8271F, -0.8739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1657F, -13.2104F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(90, 64).addBox(-0.5F, -0.8271F, -1.8739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.0856F, -11.5291F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(102, 61).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 88).addBox(-0.5F, -0.1F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0F, -4.5597F, -2.0327F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(34, 82).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -3.6238F, -1.1372F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(39, 88).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -4.0093F, -1.2441F, -2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(102, 64).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -4.3349F, -1.4764F, 2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0F, -4.4034F, -2.4009F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(39, 51).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -2.6312F, -6.3989F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(65, 7).addBox(-0.5F, -0.75F, -0.45F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.9338F, -9.4195F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(26, 95).addBox(-0.5F, -2.9F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.1815F, -13.9698F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0F, -1.1815F, -13.9698F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(102, 67).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.576F, -13.9038F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(15, 95).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -1.8563F, -13.6185F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(10, 95).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.9899F, -13.2415F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(5, 95).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -2.0559F, -12.847F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(64, 21).addBox(-0.5F, -0.75F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, -1.7709F, -11.1117F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(87, 50).addBox(-0.5F, -0.8271F, -1.8739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5112F, -9.8833F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(52, 58).addBox(-0.5F, -0.1271F, -4.8739F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -2.5921F, -5.6113F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(53, 88).addBox(-1.0F, -0.825F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5F, -1.6685F, -4.8923F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(102, 95).addBox(-0.5F, -1.6021F, -1.2489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.3401F, -3.7902F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(95, 102).addBox(0.0F, -0.4021F, -0.4739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.3401F, -3.7902F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(32, 87).addBox(-0.5F, -0.8271F, -1.8739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, -2.3401F, -3.7902F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(50, 75).addBox(-0.5F, -1.4271F, -1.7739F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.2118F, -2.0862F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(18, 81).addBox(-1.0F, -0.3529F, 0.0629F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.5F, -1.2291F, 0.2711F, -1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, -0.1351F, -0.833F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.0064F, -3.4913F, -0.3709F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(75, 98).addBox(-0.4311F, -0.495F, -0.3554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0689F, -0.1962F, -18.3739F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(98, 34).addBox(-0.4311F, -0.495F, -0.6196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.0689F, -0.1962F, -18.3739F, -2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(81, 66).addBox(-1.0F, -0.4812F, -0.5792F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.5F, 0.5152F, -3.2725F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(107, 3).addBox(-0.3582F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(107, 94).addBox(-0.3582F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1418F, 0.0494F, -18.7152F, 2.4918F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.1125F, -1.3426F, -2.6406F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 42).addBox(-0.8946F, -0.3803F, -1.8153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -7.3429F, 0.0218F, 0.0393F, 0.0F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(52, 14).addBox(-0.4499F, -0.5108F, -7.0974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.154F))
				.texOffs(84, 20).addBox(-0.4499F, -0.5108F, -2.3974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -1.3429F, 0.0218F, 0.0742F, 0.0F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(97, 11).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.9885F, 1.1849F, 3.6353F, -1.7586F, -0.0634F, 0.0617F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(92, 96).addBox(-0.857F, -0.4404F, 2.2918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F))
				.texOffs(11, 72).addBox(-0.857F, -0.4404F, -0.2082F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.7375F, 0.0162F, 6.4615F, -2.8058F, -0.0634F, 0.0617F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(85, 60).addBox(-1.0196F, -6.8596F, -1.6768F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -7.3429F, 1.357F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(41, 83).addBox(-0.882F, -0.4154F, -0.2082F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.7375F, 0.0162F, 6.4615F, -2.7794F, -0.2269F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(82, 81).addBox(-0.882F, -0.4959F, 1.281F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.7375F, 0.0162F, 6.4615F, -2.8318F, -0.2269F, 0.0F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(27, 81).addBox(-0.882F, 2.252F, -0.0216F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.7375F, 0.0162F, 6.4615F, -1.7846F, -0.2269F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(22, 68).addBox(-0.882F, -0.1876F, -1.6693F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-0.7375F, 0.0162F, 6.4615F, -1.5228F, -0.2269F, 0.0F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(103, 70).addBox(-0.75F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7625F, 0.5357F, -13.2476F, -1.6629F, -0.0179F, -0.4203F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(81, 106).addBox(-0.75F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7575F, 0.8157F, -15.4109F, -1.1509F, 0.1827F, -0.3639F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(106, 79).addBox(-0.75F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7648F, 0.6713F, -14.9322F, -1.2956F, 0.103F, -0.3997F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(76, 106).addBox(-0.75F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7511F, 0.5735F, -14.4421F, -1.4004F, 0.103F, -0.3997F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(65, 106).addBox(-0.75F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7625F, 0.5052F, -13.9469F, -1.4361F, 0.0341F, -0.4115F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(60, 106).addBox(-0.75F, -0.15F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(66, 103).addBox(-0.75F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7625F, 0.5314F, -13.3475F, -1.6107F, -0.0177F, -0.4185F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(63, 68).addBox(-0.882F, 0.0874F, -1.6693F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.7375F, 0.0162F, 6.4615F, -1.5238F, -0.1049F, 0.0059F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(107, 12).addBox(-0.375F, -0.325F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(105, 107).addBox(-0.375F, -0.525F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.4764F, 1.5809F, -15.4659F, -3.1284F, -0.2408F, -0.2175F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(107, 58).addBox(-0.45F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(108, 21).addBox(-0.45F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.674F, 1.5351F, -15.8054F, 2.4756F, 0.967F, -0.6339F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(98, 74).addBox(-0.641F, -0.5161F, -0.6464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7221F, 1.217F, -15.9307F, 2.9384F, 1.1068F, -0.181F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(108, 24).addBox(-0.375F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 107).addBox(-0.375F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5495F, 1.5734F, -15.6091F, 2.7163F, 0.5675F, -0.4414F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(45, 106).addBox(-0.6526F, -0.835F, -0.6432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 106).addBox(-0.6526F, -0.635F, -0.6432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.9971F, 1.217F, -15.9807F, 1.7096F, 1.2601F, -1.3403F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(98, 71).addBox(-0.65F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9971F, 1.217F, -15.9807F, 2.3758F, 1.3908F, -0.7244F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(98, 40).addBox(-0.6613F, -0.531F, -0.5995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.4221F, 1.217F, -15.7807F, -3.1323F, 0.7265F, -0.0382F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(98, 77).addBox(-0.6737F, -0.2763F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(97, 65).addBox(-0.6737F, -0.1763F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2664F, 1.1428F, -15.5953F, 1.4841F, -0.1558F, 0.0302F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(31, 97).addBox(-1.0198F, -0.359F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2664F, 1.1428F, -15.5953F, 1.4847F, 0.105F, 0.0076F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(93, 72).addBox(-0.7283F, 0.0412F, -0.5541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2664F, 1.1428F, -15.5953F, 1.4851F, -0.0341F, 0.0196F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(97, 45).addBox(-0.7283F, -0.1298F, -0.5286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.2664F, 1.1428F, -15.5953F, 1.6596F, -0.0341F, 0.0196F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(102, 98).addBox(-0.8946F, 0.3815F, -3.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -7.3429F, -0.1178F, 0.0393F, 0.0F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(21, 90).addBox(-1.0492F, -0.1452F, 0.0451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3503F, 1.2921F, -9.2614F, 0.0933F, 0.0003F, 0.9142F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(65, 56).addBox(-1.0881F, -0.2713F, -3.87F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -7.3429F, 0.0657F, -0.021F, 0.9145F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(75, 20).addBox(-0.5132F, 0.2972F, -6.2721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -7.3429F, -0.1134F, 0.1273F, 0.8651F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(76, 5).addBox(-1.0465F, 0.3893F, -6.2721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -7.3429F, -0.1702F, -0.0044F, 0.0F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 10).addBox(-0.8946F, -0.4115F, -3.77F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F))
				.texOffs(20, 76).addBox(-0.8946F, -0.0615F, -2.77F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -7.3429F, 0.0567F, 0.0393F, 0.0F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(65, 50).addBox(-0.4499F, -0.7098F, -6.0594F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1623F, 1.4494F, -1.3429F, 0.1091F, 0.0742F, 0.0F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(52, 7).addBox(-0.85F, -0.175F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5892F, -0.8553F, -3.977F, 0.3001F, 0.0417F, -0.0137F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 75).addBox(-0.85F, -0.175F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3372F, -1.315F, -2.4653F, 0.2949F, 0.1587F, 0.0219F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(34, 73).addBox(-0.85F, -0.175F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1375F, -1.9533F, 0.1149F, 0.243F, 0.1761F, 0.0243F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(97, 68).addBox(-0.5639F, -0.2748F, 0.7716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.1149F, 1.8392F, -2.134F, 0.8504F, 0.0174F, 0.0254F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(98, 19).addBox(-0.5639F, -0.7987F, 0.2781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1149F, 1.8392F, -2.134F, 0.3704F, 0.0174F, 0.0254F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(97, 96).addBox(-0.5558F, -0.8834F, -0.1036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.1149F, 1.8392F, -2.134F, 0.0218F, 0.0218F, 0.0F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(7, 87).addBox(-0.5353F, -0.6375F, -0.2481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(-0.2125F, -0.4338F, -1.736F, -1.7023F, 0.2923F, -0.1706F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(89, 88).addBox(-0.5F, -0.575F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(-0.2518F, -0.2876F, -1.8246F, -1.3096F, 0.2923F, -0.1706F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(65, 89).addBox(-0.5F, -0.575F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(-0.2518F, -0.2876F, -1.8246F, -1.1351F, 0.2923F, -0.1706F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(72, 88).addBox(-0.5F, -0.475F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2518F, -0.2876F, -1.8246F, -0.9606F, 0.2923F, -0.1706F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(82, 86).addBox(-0.5353F, -0.5799F, -1.3771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.2125F, -0.4338F, -1.736F, -1.4405F, 0.2923F, -0.1706F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(97, 59).addBox(-0.45F, -0.25F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 97).addBox(-0.5F, -0.55F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0975F, 0.0984F, 2.7118F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(108, 18).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0975F, 1.3706F, 0.4183F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(105, 104).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0975F, 0.9713F, 0.7192F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(103, 20).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0975F, 0.6635F, 1.1132F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(103, 17).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0975F, 0.3731F, 1.5202F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(100, 102).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0975F, 0.1119F, 1.9465F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(97, 56).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0975F, -0.0091F, 2.4317F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0975F, 0.8575F, 1.7033F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(103, 29).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0875F, -1.2413F, 1.5929F, -1.933F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(103, 26).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0875F, -1.3357F, 0.8993F, 3.0063F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(103, 23).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0875F, -0.0921F, 1.5245F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(89, 84).addBox(-0.5F, -1.15F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F))
				.texOffs(89, 80).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0875F, 0.8647F, 0.1193F, 0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(35, 106).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0875F, 0.5301F, -0.8124F, 2.0115F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(98, 25).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0875F, -0.1539F, -0.6639F, 2.9278F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(98, 37).addBox(-0.4311F, -0.495F, -0.3554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.9814F, 1.1465F, -15.7332F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(98, 31).addBox(-0.4311F, -0.495F, -0.6446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9814F, 1.1465F, -15.7332F, -2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(102, 55).addBox(-0.45F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1125F, 0.5966F, -14.6409F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(102, 58).addBox(-0.4F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1125F, 0.7518F, -15.2205F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(25, 99).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0875F, -0.7706F, -0.3325F, -2.0639F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(15, 99).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0875F, -1.1795F, 0.2356F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(98, 22).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.0875F, -0.8704F, 0.6679F, 0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(46, 100).addBox(-0.655F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 100).addBox(-0.445F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0575F, -0.4802F, 0.5958F, -0.0785F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.1125F, -1.3426F, -2.6406F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-0.1054F, -0.3803F, -1.8153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -7.3429F, 0.0218F, -0.0393F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(52, 14).mirror().addBox(-0.5501F, -0.5108F, -7.0974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(84, 20).mirror().addBox(-0.5501F, -0.5108F, -2.3974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -1.3429F, 0.0218F, -0.0742F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(97, 11).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.9885F, 1.1849F, 3.6353F, -1.7586F, 0.0634F, -0.0617F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-0.143F, -0.4404F, 2.2918F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false)
				.texOffs(11, 72).mirror().addBox(-0.143F, -0.4404F, -0.2082F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.7375F, 0.0162F, 6.4615F, -2.8058F, 0.0634F, -0.0617F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(85, 60).mirror().addBox(0.0196F, -6.8596F, -1.6768F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -7.3429F, 1.357F, 0.0F, 0.0F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(-0.118F, -0.4154F, -0.2082F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.7375F, 0.0162F, 6.4615F, -2.7794F, 0.2269F, 0.0F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(82, 81).mirror().addBox(-0.118F, -0.4959F, 1.281F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.7375F, 0.0162F, 6.4615F, -2.8318F, 0.2269F, 0.0F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(27, 81).mirror().addBox(-0.118F, 2.252F, -0.0216F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.7375F, 0.0162F, 6.4615F, -1.7846F, 0.2269F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(22, 68).mirror().addBox(-0.118F, -0.1876F, -1.6693F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(0.7375F, 0.0162F, 6.4615F, -1.5228F, 0.2269F, 0.0F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(103, 70).mirror().addBox(-0.25F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.7625F, 0.5357F, -13.2476F, -1.6629F, 0.0179F, 0.4203F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(81, 106).mirror().addBox(-0.25F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.7575F, 0.8157F, -15.4109F, -1.1509F, -0.1827F, 0.3639F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(-0.25F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.7648F, 0.6713F, -14.9322F, -1.2956F, -0.103F, 0.3997F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(76, 106).mirror().addBox(-0.25F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.7511F, 0.5735F, -14.4421F, -1.4004F, -0.103F, 0.3997F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(65, 106).mirror().addBox(-0.25F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.7625F, 0.5052F, -13.9469F, -1.4361F, -0.0341F, 0.4115F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(-0.25F, -0.15F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(66, 103).mirror().addBox(-0.25F, -0.35F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.7625F, 0.5314F, -13.3475F, -1.6107F, 0.0177F, 0.4185F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(63, 68).mirror().addBox(-0.118F, 0.0874F, -1.6693F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.7375F, 0.0162F, 6.4615F, -1.5238F, 0.1049F, -0.0059F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(107, 12).mirror().addBox(-0.625F, -0.325F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(105, 107).mirror().addBox(-0.625F, -0.525F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.4764F, 1.5809F, -15.4659F, -3.1284F, 0.2408F, 0.2175F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(107, 58).mirror().addBox(-0.55F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(108, 21).mirror().addBox(-0.55F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.674F, 1.5351F, -15.8054F, 2.4756F, -0.967F, 0.6339F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(98, 74).mirror().addBox(-0.359F, -0.5161F, -0.6464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7221F, 1.217F, -15.9307F, 2.9384F, -1.1068F, 0.181F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(108, 24).mirror().addBox(-0.625F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 107).mirror().addBox(-0.625F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.5495F, 1.5734F, -15.6091F, 2.7163F, -0.5675F, 0.4414F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.3474F, -0.835F, -0.6432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 106).mirror().addBox(-0.3474F, -0.635F, -0.6432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.9971F, 1.217F, -15.9807F, 1.7096F, -1.2601F, 1.3403F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(98, 71).mirror().addBox(-0.35F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9971F, 1.217F, -15.9807F, 2.3758F, -1.3908F, 0.7244F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(98, 40).mirror().addBox(-0.3387F, -0.531F, -0.5995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.4221F, 1.217F, -15.7807F, -3.1323F, -0.7265F, 0.0382F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(98, 77).mirror().addBox(-0.3263F, -0.2763F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(97, 65).mirror().addBox(-0.3263F, -0.1763F, -0.5535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2664F, 1.1428F, -15.5953F, 1.4841F, 0.1558F, -0.0302F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(31, 97).mirror().addBox(0.0198F, -0.359F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2664F, 1.1428F, -15.5953F, 1.4847F, -0.105F, -0.0076F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(93, 72).mirror().addBox(-0.2717F, 0.0412F, -0.5541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2664F, 1.1428F, -15.5953F, 1.4851F, 0.0341F, -0.0196F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(97, 45).mirror().addBox(-0.2717F, -0.1298F, -0.5286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.2664F, 1.1428F, -15.5953F, 1.6596F, 0.0341F, -0.0196F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(102, 98).mirror().addBox(-0.1054F, 0.3815F, -3.2933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -7.3429F, -0.1178F, -0.0393F, 0.0F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(21, 90).mirror().addBox(0.0492F, -0.1452F, 0.0451F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.3503F, 1.2921F, -9.2614F, 0.0933F, -0.0003F, -0.9142F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(0.0881F, -0.2713F, -3.87F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -7.3429F, 0.0657F, 0.021F, -0.9145F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(-0.4868F, 0.2972F, -6.2721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -7.3429F, -0.1134F, -0.1273F, -0.8651F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(76, 5).mirror().addBox(0.0465F, 0.3893F, -6.2721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -7.3429F, -0.1702F, 0.0044F, 0.0F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(76, 10).mirror().addBox(-0.1054F, -0.4115F, -3.77F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(20, 76).mirror().addBox(-0.1054F, -0.0615F, -2.77F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -7.3429F, 0.0567F, -0.0393F, 0.0F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(65, 50).mirror().addBox(-0.5501F, -0.7098F, -6.0594F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1623F, 1.4494F, -1.3429F, 0.1091F, -0.0742F, 0.0F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(52, 7).mirror().addBox(-0.15F, -0.175F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5892F, -0.8553F, -3.977F, 0.3001F, -0.0417F, 0.0137F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.15F, -0.175F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3372F, -1.315F, -2.4653F, 0.2949F, -0.1587F, -0.0219F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(34, 73).mirror().addBox(-0.15F, -0.175F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1375F, -1.9533F, 0.1149F, 0.243F, -0.1761F, -0.0243F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(97, 68).mirror().addBox(-0.436F, -0.2748F, 0.7716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.1149F, 1.8392F, -2.134F, 0.8504F, -0.0174F, -0.0254F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(98, 19).mirror().addBox(-0.436F, -0.7987F, 0.2781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1149F, 1.8392F, -2.134F, 0.3704F, -0.0174F, -0.0254F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(97, 96).mirror().addBox(-0.4442F, -0.8834F, -0.1036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.1149F, 1.8392F, -2.134F, 0.0218F, -0.0218F, 0.0F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(7, 87).mirror().addBox(-0.4647F, -0.6375F, -0.2481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(0.2125F, -0.4338F, -1.736F, -1.7023F, -0.2923F, 0.1706F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(89, 88).mirror().addBox(-0.5F, -0.575F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(0.2518F, -0.2876F, -1.8246F, -1.3096F, -0.2923F, 0.1706F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-0.5F, -0.575F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(0.2518F, -0.2876F, -1.8246F, -1.1351F, -0.2923F, 0.1706F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(72, 88).mirror().addBox(-0.5F, -0.475F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2518F, -0.2876F, -1.8246F, -0.9606F, -0.2923F, 0.1706F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(82, 86).mirror().addBox(-0.4647F, -0.5799F, -1.3771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(0.2125F, -0.4338F, -1.736F, -1.4405F, -0.2923F, 0.1706F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(97, 59).mirror().addBox(-0.55F, -0.25F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 97).mirror().addBox(-0.5F, -0.55F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, 0.0984F, 2.7118F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(108, 18).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, 1.3706F, 0.4183F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(105, 104).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, 0.9713F, 0.7192F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(103, 20).mirror().addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, 0.6635F, 1.1132F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(103, 17).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, 0.3731F, 1.5202F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(100, 102).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, 0.1119F, 1.9465F, -1.021F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(97, 56).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, -0.0091F, 2.4317F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.5F, -0.425F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0975F, 0.8575F, 1.7033F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(103, 29).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -1.2413F, 1.5929F, -1.933F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(103, 26).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -1.3357F, 0.8993F, 3.0063F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(103, 23).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -0.0921F, 1.5245F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-0.5F, -1.15F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(89, 80).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0875F, 0.8647F, 0.1193F, 0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(35, 106).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0875F, 0.5301F, -0.8124F, 2.0115F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(98, 25).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -0.1539F, -0.6639F, 2.9278F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-0.5689F, -0.495F, -0.3554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.9814F, 1.1465F, -15.7332F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(98, 31).mirror().addBox(-0.5689F, -0.495F, -0.6446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9814F, 1.1465F, -15.7332F, -2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(102, 55).mirror().addBox(-0.55F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.1125F, 0.5966F, -14.6409F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(102, 58).mirror().addBox(-0.6F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.1125F, 0.7518F, -15.2205F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(25, 99).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -0.7706F, -0.3325F, -2.0639F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -1.1795F, 0.2356F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0875F, -0.8704F, 0.6679F, 0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(46, 100).mirror().addBox(-0.345F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 100).mirror().addBox(-0.555F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0575F, -0.4802F, 0.5958F, -0.0785F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(30, 101).addBox(-1.0F, 3.6713F, -16.2798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 101).mirror().addBox(-1.0F, 3.6713F, -16.2798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.8888F, -2.4789F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.9855F, 0.5878F, 2.7921F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6106F, -4.0859F, 0.298F, -0.0098F, 0.0651F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(101, 86).mirror().addBox(-0.4798F, -0.6017F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(101, 83).mirror().addBox(-0.8798F, -0.6017F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7464F, 4.3405F, -15.4677F, -1.8898F, 1.405F, -1.9678F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(101, 80).mirror().addBox(-0.9F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7006F, 4.2364F, -15.4926F, -1.6656F, 0.9922F, -1.7323F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(75, 101).mirror().addBox(-0.427F, -0.4968F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.7464F, 4.3405F, -15.4677F, -1.6656F, 0.9922F, -1.7323F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(103, 76).mirror().addBox(1.9352F, -1.7283F, -3.0023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, -0.2075F, 0.8269F, -0.2285F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(20, 101).mirror().addBox(-0.1642F, -0.596F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7464F, 4.2655F, -15.4177F, 2.2449F, 1.4603F, 2.1736F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(87, 96).mirror().addBox(-0.4479F, -1.0272F, -0.8781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7464F, 4.2655F, -15.4177F, 0.2608F, -0.018F, -0.0759F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(96, 84).mirror().addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9888F, 4.3036F, -15.6012F, 0.3672F, -0.7696F, -0.3326F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(82, 96).mirror().addBox(-0.7479F, -0.846F, -0.2148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(96, 80).mirror().addBox(-0.7479F, -0.921F, -0.6148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7464F, 4.2655F, -15.4177F, 0.0863F, -0.018F, -0.0759F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(61, 103).mirror().addBox(-0.9333F, 0.1341F, -3.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, -0.6637F, -0.0346F, -0.0699F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(56, 103).mirror().addBox(-0.9333F, -1.7283F, -3.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(45, 103).mirror().addBox(-0.9333F, -1.7283F, -3.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, -0.1401F, -0.0346F, -0.0699F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(29, 75).mirror().addBox(-0.6F, -0.4F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(97, 53).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(92, 16).mirror().addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)).mirror(false)
				.texOffs(97, 53).addBox(1.4137F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 75).addBox(1.5137F, -0.4F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(92, 16).addBox(1.4137F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1498F)), PartPose.offsetAndRotation(-1.4568F, 0.0165F, -0.3136F, -0.1836F, 0.0F, 0.0F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(107, 9).mirror().addBox(-0.7833F, -3.1353F, -1.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, 0.7195F, -0.0346F, -0.0699F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.7833F, -2.6776F, -1.0499F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, 0.929F, -0.0346F, -0.0699F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.7833F, -0.0179F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, -0.5633F, -0.0346F, -0.0699F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(98, 28).mirror().addBox(-0.7833F, -0.321F, -0.1785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, -1.6978F, -0.0346F, -0.0699F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.2545F, -1.3033F, 2.4358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, -2.8313F, -0.087F, -0.0176F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(99, 8).mirror().addBox(-0.1199F, -2.9656F, -0.459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, 2.1902F, -0.0347F, -0.0176F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(20, 98).mirror().addBox(-0.1199F, -0.7266F, -2.2845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, 0.7066F, -0.0347F, -0.0176F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(99, 49).mirror().addBox(-0.1199F, 0.5402F, -1.2247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, -0.5151F, -0.0347F, -0.0176F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-0.1199F, -0.3791F, -0.9998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, -0.8205F, -0.0347F, -0.0176F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(93, 31).mirror().addBox(-1.0043F, 4.8127F, 0.4713F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.6568F, -0.3961F, -4.8184F, -0.9908F, -0.0349F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(46, 90).mirror().addBox(-1.0043F, 0.9295F, 1.3236F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6568F, -0.3961F, -4.8184F, -1.1653F, -0.0349F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(70, 96).mirror().addBox(-0.2F, 3.1541F, -0.2057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(40, 96).mirror().addBox(-0.2F, 3.228F, -0.5349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7568F, -0.3961F, -0.6184F, -1.1959F, -0.0698F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(50, 96).mirror().addBox(-0.2F, 1.4546F, -0.0899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7568F, -0.3961F, -0.6184F, -1.2308F, -0.0698F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(72, 85).mirror().addBox(-0.5F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(72, 85).addBox(1.4137F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.4568F, 0.0165F, -0.3136F, 0.1218F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-0.2F, -0.15F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.7568F, -0.3961F, -0.6184F, -1.353F, -0.0698F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(107, 97).mirror().addBox(-0.7833F, -3.1585F, -0.9377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false)
				.texOffs(55, 106).mirror().addBox(-0.7833F, -2.4585F, -0.9377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, 0.9071F, -0.0346F, -0.0699F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(93, 23).mirror().addBox(-0.7833F, -2.3562F, -0.727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, 1.038F, -0.0346F, -0.0699F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(103, 38).mirror().addBox(-0.7833F, -0.5203F, -0.2135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.5568F, 5.9039F, -12.4184F, 2.9143F, -0.0346F, -0.0699F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(103, 35).mirror().addBox(-0.2545F, 2.3487F, -0.9225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, -1.0118F, -0.087F, -0.0176F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-0.1199F, 1.5687F, -1.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, -0.7813F, -0.0347F, -0.0176F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(90, 68).mirror().addBox(-0.1199F, -1.4202F, -1.9258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.3568F, 4.5039F, -9.6184F, 0.7459F, -0.0347F, -0.0176F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(35, 103).mirror().addBox(-1.0043F, -7.1892F, -0.3328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6568F, -0.3961F, -4.8184F, 2.2599F, -0.0349F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(25, 108).mirror().addBox(-1.0043F, -1.1646F, 5.5025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6568F, -0.3961F, -4.8184F, -2.5834F, -0.0349F, 0.0F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(103, 32).mirror().addBox(-1.0043F, 4.7834F, 0.4109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6568F, -0.3961F, -4.8184F, -1.0563F, -0.0349F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(60, 84).mirror().addBox(-1.0043F, 0.9782F, 1.0079F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.6568F, -0.3961F, -4.8184F, -1.1784F, -0.0349F, 0.0F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(93, 27).mirror().addBox(-0.2F, 1.5497F, -0.1797F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.7568F, -0.3961F, -0.6184F, -1.3006F, -0.0698F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(56, 95).mirror().addBox(-0.2F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7568F, -0.3961F, -0.6184F, -1.3181F, -0.0698F, 0.0F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-0.3F, -0.4242F, -0.2922F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6106F, -4.0859F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(40, 96).addBox(-0.8F, 3.228F, -0.5349F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 96).addBox(-0.8F, 3.1541F, -0.2057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7568F, -0.3961F, -0.6184F, -1.1959F, 0.0698F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(56, 103).addBox(-0.0667F, -1.7283F, -3.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(45, 103).addBox(-0.0667F, -1.7283F, -3.7493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, -0.1401F, 0.0346F, 0.0699F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(61, 103).addBox(-0.0667F, 0.1341F, -3.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, -0.6637F, 0.0346F, 0.0699F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(87, 96).addBox(-0.5521F, -1.0272F, -0.8781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2536F, 4.2655F, -15.4177F, 0.2608F, 0.018F, 0.0759F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(96, 84).addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0112F, 4.3036F, -15.6012F, 0.3672F, 0.7696F, 0.3326F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(82, 96).addBox(-0.2521F, -0.846F, -0.2148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(96, 80).addBox(-0.2521F, -0.921F, -0.6148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2536F, 4.2655F, -15.4177F, 0.0863F, 0.018F, 0.0759F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(103, 76).addBox(-2.9353F, -1.7283F, -3.0023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, -0.2075F, -0.8269F, 0.2285F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(101, 83).addBox(-0.1202F, -0.6017F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(101, 86).addBox(-0.5202F, -0.6017F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2536F, 4.3405F, -15.4677F, -1.8898F, -1.405F, 1.9678F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 80).addBox(-0.1F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2994F, 4.2364F, -15.4926F, -1.6656F, -0.9922F, 1.7323F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(75, 101).addBox(-0.573F, -0.4968F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2536F, 4.3405F, -15.4677F, -1.6656F, -0.9922F, 1.7323F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(20, 101).addBox(-0.8358F, -0.596F, -0.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2536F, 4.2655F, -15.4177F, 2.2449F, -1.4603F, -2.1736F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(107, 97).addBox(-0.2167F, -3.1585F, -0.9377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F))
				.texOffs(55, 106).addBox(-0.2167F, -2.4585F, -0.9377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, 0.9071F, 0.0346F, 0.0699F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(93, 23).addBox(-0.2167F, -2.3562F, -0.727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, 1.038F, 0.0346F, 0.0699F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(103, 38).addBox(-0.2167F, -0.5203F, -0.2135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, 2.9143F, 0.0346F, 0.0699F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(103, 35).addBox(-0.7455F, 2.3487F, -0.9225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, -1.0118F, 0.087F, 0.0176F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(5, 99).addBox(-0.8801F, 1.5687F, -1.4964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, -0.7813F, 0.0347F, 0.0176F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(90, 68).addBox(-0.8801F, -1.4202F, -1.9258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, 0.7459F, 0.0347F, 0.0176F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(35, 103).addBox(0.0043F, -7.1892F, -0.3328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3432F, -0.3961F, -4.8184F, 2.2599F, 0.0349F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(25, 108).addBox(0.0043F, -1.1646F, 5.5025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3432F, -0.3961F, -4.8184F, -2.5834F, 0.0349F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(103, 32).addBox(0.0043F, 4.7834F, 0.4109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3432F, -0.3961F, -4.8184F, -1.0563F, 0.0349F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(60, 84).addBox(0.0043F, 0.9782F, 1.0079F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.3432F, -0.3961F, -4.8184F, -1.1784F, 0.0349F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(93, 27).addBox(-0.8F, 1.5497F, -0.1797F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.7568F, -0.3961F, -0.6184F, -1.3006F, 0.0698F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(107, 9).addBox(-0.2167F, -3.1353F, -1.5557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, 0.7195F, 0.0346F, 0.0699F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(40, 92).addBox(-0.2167F, -2.6776F, -1.0499F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, 0.929F, 0.0346F, 0.0699F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(40, 103).addBox(-0.2167F, -0.0179F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, -0.5633F, 0.0346F, 0.0699F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(98, 28).addBox(-0.2167F, -0.321F, -0.1785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.4432F, 5.9039F, -12.4184F, -1.6978F, 0.0346F, 0.0699F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 99).addBox(-0.7455F, -1.3033F, 2.4358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, -2.8313F, 0.087F, 0.0176F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(99, 8).addBox(-0.8801F, -2.9656F, -0.459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, 2.1902F, 0.0347F, 0.0176F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(20, 98).addBox(-0.8801F, -0.7266F, -2.2845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, 0.7066F, 0.0347F, 0.0176F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(99, 49).addBox(-0.8801F, 0.5402F, -1.2247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, -0.5151F, 0.0347F, 0.0176F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(65, 93).addBox(-0.8801F, -0.3791F, -0.9998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3568F, 4.5039F, -9.6184F, -0.8205F, 0.0347F, 0.0176F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(93, 31).addBox(0.0043F, 4.8127F, 0.4713F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.3432F, -0.3961F, -4.8184F, -0.9908F, 0.0349F, 0.0F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(46, 90).addBox(0.0043F, 0.9295F, 1.3236F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3432F, -0.3961F, -4.8184F, -1.1653F, 0.0349F, 0.0F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(50, 96).addBox(-0.8F, 1.4546F, -0.0899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7568F, -0.3961F, -0.6184F, -1.2308F, 0.0698F, 0.0F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(45, 96).addBox(-0.8F, -0.15F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7568F, -0.3961F, -0.6184F, -1.353F, 0.0698F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(56, 95).addBox(-0.8F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7568F, -0.3961F, -0.6184F, -1.3181F, 0.0698F, 0.0F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(70, 72).addBox(-0.0145F, 0.5878F, 2.7921F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.6106F, -4.0859F, 0.298F, 0.0098F, -0.0651F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(65, 14).addBox(-0.7F, -0.4242F, -0.2922F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.6106F, -4.0859F, 0.0F, 0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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