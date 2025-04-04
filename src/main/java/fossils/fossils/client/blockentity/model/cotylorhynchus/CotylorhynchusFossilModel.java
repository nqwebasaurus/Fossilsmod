package fossils.fossils.client.blockentity.model.cotylorhynchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CotylorhynchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart bodyCentreFront;
	private final ModelPart shoulder;
	private final ModelPart legFrontL;
	private final ModelPart legFrontLLower;
	private final ModelPart legFrontLFoot;
	private final ModelPart legFrontL2;
	private final ModelPart legFrontLLower2;
	private final ModelPart legFrontLFoot2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart skullTop;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart skullJaw;
	private final ModelPart rump;
	private final ModelPart bodyBack;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart legBackL3;
	private final ModelPart legBackLLower3;
	private final ModelPart legBackLFoot3;
	private final ModelPart legBackL2;
	private final ModelPart legBackLLower2;
	private final ModelPart legBackLFoot2;

	public CotylorhynchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.bodyCentreFront = this.main.getChild("bodyCentreFront");
		this.shoulder = this.bodyCentreFront.getChild("shoulder");
		this.legFrontL = this.shoulder.getChild("legFrontL");
		this.legFrontLLower = this.legFrontL.getChild("legFrontLLower");
		this.legFrontLFoot = this.legFrontLLower.getChild("legFrontLFoot");
		this.legFrontL2 = this.shoulder.getChild("legFrontL2");
		this.legFrontLLower2 = this.legFrontL2.getChild("legFrontLLower2");
		this.legFrontLFoot2 = this.legFrontLLower2.getChild("legFrontLFoot2");
		this.neck = this.shoulder.getChild("neck");
		this.head = this.neck.getChild("head");
		this.skullTop = this.head.getChild("skullTop");
		this.leftFace = this.skullTop.getChild("leftFace");
		this.rightFace = this.skullTop.getChild("rightFace");
		this.skullJaw = this.skullTop.getChild("skullJaw");
		this.rump = this.bodyCentreFront.getChild("rump");
		this.bodyBack = this.rump.getChild("bodyBack");
		this.tail1 = this.bodyBack.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.legBackL3 = this.bodyBack.getChild("legBackL3");
		this.legBackLLower3 = this.legBackL3.getChild("legBackLLower3");
		this.legBackLFoot3 = this.legBackLLower3.getChild("legBackLFoot3");
		this.legBackL2 = this.bodyBack.getChild("legBackL2");
		this.legBackLLower2 = this.legBackL2.getChild("legBackLLower2");
		this.legBackLFoot2 = this.legBackLLower2.getChild("legBackLFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -2.0F, -4.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront = main.addOrReplaceChild("bodyCentreFront", CubeListBuilder.create(), PartPose.offset(0.5F, -17.4581F, 8.7919F));

		PartDefinition bodyCentreFront_r1 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r1", CubeListBuilder.create().texOffs(114, 27).addBox(-1.2F, -2.9492F, 0.019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.7839F, -0.4494F, -0.0698F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r2 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r2", CubeListBuilder.create().texOffs(114, 19).addBox(-1.2F, -2.8114F, 3.0331F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 114).addBox(-1.2F, -2.8114F, 1.0331F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(-1.7F, -0.0114F, 0.0331F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 0.3839F, -5.4494F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r3 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r3", CubeListBuilder.create().texOffs(114, 14).addBox(-1.2F, -2.7591F, 0.0317F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.3839F, -6.4494F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r4 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r4", CubeListBuilder.create().texOffs(12, 114).addBox(-1.2F, -2.8542F, 0.0394F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5839F, -8.4494F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r5 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r5", CubeListBuilder.create().texOffs(9, 114).addBox(-1.2F, -2.7495F, 0.0367F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5839F, -10.4494F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r6 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r6", CubeListBuilder.create().texOffs(87, 7).addBox(-1.7F, 0.0505F, 0.0367F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 0.5839F, -10.4494F, 0.0524F, 0.0F, 0.0F));

		PartDefinition shoulderU_r1 = bodyCentreFront.addOrReplaceChild("shoulderU_r1", CubeListBuilder.create().texOffs(94, 47).mirror().addBox(-8.435F, -1.7803F, -0.5022F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0796F, 0.1114F, -0.0051F, -0.0071F, -1.021F));

		PartDefinition shoulderU_r2 = bodyCentreFront.addOrReplaceChild("shoulderU_r2", CubeListBuilder.create().texOffs(104, 14).mirror().addBox(-3.0161F, 0.0436F, -0.5022F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0796F, 0.1114F, -0.0083F, -0.0026F, -0.3752F));

		PartDefinition shoulderU_r3 = bodyCentreFront.addOrReplaceChild("shoulderU_r3", CubeListBuilder.create().texOffs(108, 88).mirror().addBox(-8.3318F, -6.6721F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.6796F, -1.8886F, 0.0002F, 0.0262F, -1.4923F));

		PartDefinition shoulderU_r4 = bodyCentreFront.addOrReplaceChild("shoulderU_r4", CubeListBuilder.create().texOffs(98, 25).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.6796F, -1.8886F, 0.0152F, 0.0213F, -0.8812F));

		PartDefinition shoulderU_r5 = bodyCentreFront.addOrReplaceChild("shoulderU_r5", CubeListBuilder.create().texOffs(103, 59).mirror().addBox(-4.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.6796F, -1.8886F, 0.025F, 0.0079F, -0.2355F));

		PartDefinition shoulderU_r6 = bodyCentreFront.addOrReplaceChild("shoulderU_r6", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-9.9774F, -5.6556F, -0.4667F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0796F, -3.8886F, 0.0008F, 0.096F, -1.37F));

		PartDefinition shoulderU_r7 = bodyCentreFront.addOrReplaceChild("shoulderU_r7", CubeListBuilder.create().texOffs(100, 10).mirror().addBox(-7.3212F, -1.7779F, -0.4667F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0796F, -3.8886F, 0.0559F, 0.0781F, -0.757F));

		PartDefinition shoulderU_r8 = bodyCentreFront.addOrReplaceChild("shoulderU_r8", CubeListBuilder.create().texOffs(107, 86).mirror().addBox(-2.9237F, -0.0229F, -0.4667F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0796F, -3.8886F, 0.0916F, 0.0288F, -0.1121F));

		PartDefinition shoulderU_r9 = bodyCentreFront.addOrReplaceChild("shoulderU_r9", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(-11.3318F, -6.6721F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8796F, -5.8886F, 0.0015F, 0.1658F, -1.4223F));

		PartDefinition shoulderU_r10 = bodyCentreFront.addOrReplaceChild("shoulderU_r10", CubeListBuilder.create().texOffs(9, 100).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8796F, -5.8886F, 0.0969F, 0.1348F, -0.805F));

		PartDefinition shoulderU_r11 = bodyCentreFront.addOrReplaceChild("shoulderU_r11", CubeListBuilder.create().texOffs(103, 49).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8796F, -5.8886F, 0.1583F, 0.0497F, -0.1619F));

		PartDefinition shoulderU_r12 = bodyCentreFront.addOrReplaceChild("shoulderU_r12", CubeListBuilder.create().texOffs(87, 14).mirror().addBox(-12.3318F, -6.6721F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9796F, -7.8886F, 0.0021F, 0.2356F, -1.3698F));

		PartDefinition shoulderU_r13 = bodyCentreFront.addOrReplaceChild("shoulderU_r13", CubeListBuilder.create().texOffs(100, 8).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9796F, -7.8886F, 0.1385F, 0.1912F, -0.7459F));

		PartDefinition shoulderU_r14 = bodyCentreFront.addOrReplaceChild("shoulderU_r14", CubeListBuilder.create().texOffs(103, 22).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9796F, -7.8886F, 0.2251F, 0.0703F, -0.1055F));

		PartDefinition shoulderU_r15 = bodyCentreFront.addOrReplaceChild("shoulderU_r15", CubeListBuilder.create().texOffs(103, 20).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9796F, -9.8886F, 0.2753F, 0.0855F, -0.0841F));

		PartDefinition shoulderU_r16 = bodyCentreFront.addOrReplaceChild("shoulderU_r16", CubeListBuilder.create().texOffs(100, 6).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9796F, -9.8886F, 0.1703F, 0.2333F, -0.7218F));

		PartDefinition shoulderU_r17 = bodyCentreFront.addOrReplaceChild("shoulderU_r17", CubeListBuilder.create().texOffs(79, 26).mirror().addBox(-13.3318F, -6.6721F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9796F, -9.8886F, 0.0026F, 0.288F, -1.3523F));

		PartDefinition shoulderU_r18 = bodyCentreFront.addOrReplaceChild("shoulderU_r18", CubeListBuilder.create().texOffs(20, 103).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2796F, -11.7886F, 0.3089F, 0.0956F, -0.0637F));

		PartDefinition shoulderU_r19 = bodyCentreFront.addOrReplaceChild("shoulderU_r19", CubeListBuilder.create().texOffs(100, 4).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2796F, -11.7886F, 0.1919F, 0.2613F, -0.699F));

		PartDefinition shoulderU_r20 = bodyCentreFront.addOrReplaceChild("shoulderU_r20", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-14.3318F, -6.6721F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2796F, -11.7886F, 0.0029F, 0.3229F, -1.3347F));

		PartDefinition shoulderU_r21 = bodyCentreFront.addOrReplaceChild("shoulderU_r21", CubeListBuilder.create().texOffs(103, 18).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5796F, -13.7886F, 0.3425F, 0.1055F, -0.0428F));

		PartDefinition shoulderU_r22 = bodyCentreFront.addOrReplaceChild("shoulderU_r22", CubeListBuilder.create().texOffs(100, 2).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5796F, -13.7886F, 0.2138F, 0.2891F, -0.6756F));

		PartDefinition shoulderU_r23 = bodyCentreFront.addOrReplaceChild("shoulderU_r23", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-15.3318F, -6.6721F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5796F, -13.7886F, 0.0033F, 0.3578F, -1.3171F));

		PartDefinition shoulderU_r24 = bodyCentreFront.addOrReplaceChild("shoulderU_r24", CubeListBuilder.create().texOffs(103, 16).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.9796F, -15.7886F, 0.3587F, 0.1146F, -0.0411F));

		PartDefinition shoulderU_r25 = bodyCentreFront.addOrReplaceChild("shoulderU_r25", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.9796F, -15.7886F, 0.2217F, 0.306F, -0.6734F));

		PartDefinition shoulderU_r26 = bodyCentreFront.addOrReplaceChild("shoulderU_r26", CubeListBuilder.create().texOffs(71, 46).mirror().addBox(-15.3318F, -6.6721F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.9796F, -15.7886F, -0.0011F, 0.3758F, -1.3188F));

		PartDefinition shoulderU_r27 = bodyCentreFront.addOrReplaceChild("shoulderU_r27", CubeListBuilder.create().texOffs(104, 14).addBox(0.0161F, 0.0436F, -0.5022F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0796F, 0.1114F, -0.0083F, 0.0026F, 0.3752F));

		PartDefinition shoulderU_r28 = bodyCentreFront.addOrReplaceChild("shoulderU_r28", CubeListBuilder.create().texOffs(94, 47).addBox(2.435F, -1.7803F, -0.5022F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0796F, 0.1114F, -0.0051F, 0.0071F, 1.021F));

		PartDefinition shoulderU_r29 = bodyCentreFront.addOrReplaceChild("shoulderU_r29", CubeListBuilder.create().texOffs(103, 59).addBox(1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.6796F, -1.8886F, 0.025F, -0.0079F, 0.2355F));

		PartDefinition shoulderU_r30 = bodyCentreFront.addOrReplaceChild("shoulderU_r30", CubeListBuilder.create().texOffs(98, 25).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.6796F, -1.8886F, 0.0152F, -0.0213F, 0.8812F));

		PartDefinition shoulderU_r31 = bodyCentreFront.addOrReplaceChild("shoulderU_r31", CubeListBuilder.create().texOffs(108, 88).addBox(5.3318F, -6.6721F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.6796F, -1.8886F, 0.0002F, -0.0262F, 1.4923F));

		PartDefinition shoulderU_r32 = bodyCentreFront.addOrReplaceChild("shoulderU_r32", CubeListBuilder.create().texOffs(107, 86).addBox(-0.0763F, -0.0229F, -0.4667F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0796F, -3.8886F, 0.0916F, -0.0288F, 0.1121F));

		PartDefinition shoulderU_r33 = bodyCentreFront.addOrReplaceChild("shoulderU_r33", CubeListBuilder.create().texOffs(100, 10).addBox(2.3212F, -1.7779F, -0.4667F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0796F, -3.8886F, 0.0559F, -0.0781F, 0.757F));

		PartDefinition shoulderU_r34 = bodyCentreFront.addOrReplaceChild("shoulderU_r34", CubeListBuilder.create().texOffs(100, 12).addBox(4.9774F, -5.6556F, -0.4667F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0796F, -3.8886F, 0.0008F, -0.096F, 1.37F));

		PartDefinition shoulderU_r35 = bodyCentreFront.addOrReplaceChild("shoulderU_r35", CubeListBuilder.create().texOffs(103, 49).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8796F, -5.8886F, 0.1583F, -0.0497F, 0.1619F));

		PartDefinition shoulderU_r36 = bodyCentreFront.addOrReplaceChild("shoulderU_r36", CubeListBuilder.create().texOffs(9, 100).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8796F, -5.8886F, 0.0969F, -0.1348F, 0.805F));

		PartDefinition shoulderU_r37 = bodyCentreFront.addOrReplaceChild("shoulderU_r37", CubeListBuilder.create().texOffs(94, 45).addBox(5.3318F, -6.6721F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8796F, -5.8886F, 0.0015F, -0.1658F, 1.4223F));

		PartDefinition shoulderU_r38 = bodyCentreFront.addOrReplaceChild("shoulderU_r38", CubeListBuilder.create().texOffs(103, 22).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9796F, -7.8886F, 0.2251F, -0.0703F, 0.1055F));

		PartDefinition shoulderU_r39 = bodyCentreFront.addOrReplaceChild("shoulderU_r39", CubeListBuilder.create().texOffs(100, 8).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9796F, -7.8886F, 0.1385F, -0.1912F, 0.7459F));

		PartDefinition shoulderU_r40 = bodyCentreFront.addOrReplaceChild("shoulderU_r40", CubeListBuilder.create().texOffs(87, 14).addBox(5.3318F, -6.6721F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9796F, -7.8886F, 0.0021F, -0.2356F, 1.3698F));

		PartDefinition shoulderU_r41 = bodyCentreFront.addOrReplaceChild("shoulderU_r41", CubeListBuilder.create().texOffs(79, 26).addBox(5.3318F, -6.6721F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9796F, -9.8886F, 0.0026F, -0.288F, 1.3523F));

		PartDefinition shoulderU_r42 = bodyCentreFront.addOrReplaceChild("shoulderU_r42", CubeListBuilder.create().texOffs(100, 6).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9796F, -9.8886F, 0.1703F, -0.2333F, 0.7218F));

		PartDefinition shoulderU_r43 = bodyCentreFront.addOrReplaceChild("shoulderU_r43", CubeListBuilder.create().texOffs(103, 20).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9796F, -9.8886F, 0.2753F, -0.0855F, 0.0841F));

		PartDefinition shoulderU_r44 = bodyCentreFront.addOrReplaceChild("shoulderU_r44", CubeListBuilder.create().texOffs(73, 60).addBox(5.3318F, -6.6721F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2796F, -11.7886F, 0.0029F, -0.3229F, 1.3347F));

		PartDefinition shoulderU_r45 = bodyCentreFront.addOrReplaceChild("shoulderU_r45", CubeListBuilder.create().texOffs(100, 4).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2796F, -11.7886F, 0.1919F, -0.2613F, 0.699F));

		PartDefinition shoulderU_r46 = bodyCentreFront.addOrReplaceChild("shoulderU_r46", CubeListBuilder.create().texOffs(20, 103).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2796F, -11.7886F, 0.3089F, -0.0956F, 0.0637F));

		PartDefinition shoulderU_r47 = bodyCentreFront.addOrReplaceChild("shoulderU_r47", CubeListBuilder.create().texOffs(71, 48).addBox(5.3318F, -6.6721F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5796F, -13.7886F, 0.0033F, -0.3578F, 1.3171F));

		PartDefinition shoulderU_r48 = bodyCentreFront.addOrReplaceChild("shoulderU_r48", CubeListBuilder.create().texOffs(100, 2).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5796F, -13.7886F, 0.2138F, -0.2891F, 0.6756F));

		PartDefinition shoulderU_r49 = bodyCentreFront.addOrReplaceChild("shoulderU_r49", CubeListBuilder.create().texOffs(103, 18).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5796F, -13.7886F, 0.3425F, -0.1055F, 0.0428F));

		PartDefinition shoulderU_r50 = bodyCentreFront.addOrReplaceChild("shoulderU_r50", CubeListBuilder.create().texOffs(71, 46).addBox(5.3318F, -6.6721F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9796F, -15.7886F, -0.0011F, -0.3758F, 1.3188F));

		PartDefinition shoulderU_r51 = bodyCentreFront.addOrReplaceChild("shoulderU_r51", CubeListBuilder.create().texOffs(100, 0).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9796F, -15.7886F, 0.2217F, -0.306F, 0.6734F));

		PartDefinition shoulderU_r52 = bodyCentreFront.addOrReplaceChild("shoulderU_r52", CubeListBuilder.create().texOffs(103, 16).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9796F, -15.7886F, 0.3587F, -0.1146F, 0.0411F));

		PartDefinition bodyCentreFront_r7 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r7", CubeListBuilder.create().texOffs(6, 114).addBox(0.0F, -2.8489F, 0.0091F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -12.4F, 0.1222F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r8 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r8", CubeListBuilder.create().texOffs(3, 114).addBox(0.0F, -2.9129F, -0.0503F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -14.2999F, 0.1396F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r9 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r9", CubeListBuilder.create().texOffs(0, 114).addBox(0.0F, -2.9595F, -0.0113F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -16.2999F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r10 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r10", CubeListBuilder.create().texOffs(60, 30).addBox(-3.5F, -0.9468F, -0.0342F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.6F, 2.5F, 0.4974F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r11 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r11", CubeListBuilder.create().texOffs(39, 13).addBox(-4.5F, -0.9733F, 0.0259F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.3F, -1.2F, 0.4276F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r12 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r12", CubeListBuilder.create().texOffs(0, 33).addBox(-5.5F, -1.0311F, -0.1042F, 11.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.9F, -5.7999F, 0.3229F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r13 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -0.9693F, -0.0827F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.5F, -14.5999F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bodyCentreFront_r14 = bodyCentreFront.addOrReplaceChild("bodyCentreFront_r14", CubeListBuilder.create().texOffs(72, 75).addBox(-0.5F, -0.9806F, -0.0519F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, -16.0999F, 0.1745F, 0.0F, 0.0F));

		PartDefinition shoulder = bodyCentreFront.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.369F, -18.517F, 0.0F, 0.0436F, 0.0F));

		PartDefinition shoulderU_r53 = shoulder.addOrReplaceChild("shoulderU_r53", CubeListBuilder.create().texOffs(78, 115).addBox(0.0F, -2.3538F, -0.0446F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3461F, -5.4278F, 0.2531F, 0.0F, 0.0F));

		PartDefinition shoulderU_r54 = shoulder.addOrReplaceChild("shoulderU_r54", CubeListBuilder.create().texOffs(113, 9).addBox(0.0F, -2.1324F, -0.0213F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0461F, -7.3278F, 0.2967F, 0.0F, 0.0F));

		PartDefinition shoulderU_r55 = shoulder.addOrReplaceChild("shoulderU_r55", CubeListBuilder.create().texOffs(116, 103).addBox(0.0F, -2.0159F, -0.0289F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6461F, -9.2278F, 0.3142F, 0.0F, 0.0F));

		PartDefinition shoulderU_r56 = shoulder.addOrReplaceChild("shoulderU_r56", CubeListBuilder.create().texOffs(42, 110).addBox(0.0F, -2.9506F, -0.9901F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6461F, 1.2722F, 0.2007F, 0.0F, 0.0F));

		PartDefinition shoulderU_r57 = shoulder.addOrReplaceChild("shoulderU_r57", CubeListBuilder.create().texOffs(23, 52).addBox(0.0F, -2.8617F, -1.0286F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1461F, -0.6278F, 0.2356F, 0.0F, 0.0F));

		PartDefinition shoulderU_r58 = shoulder.addOrReplaceChild("shoulderU_r58", CubeListBuilder.create().texOffs(113, 96).addBox(0.0F, -2.5695F, -0.0473F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8461F, -3.5278F, 0.2443F, 0.0F, 0.0F));

		PartDefinition shoulderU_r59 = shoulder.addOrReplaceChild("shoulderU_r59", CubeListBuilder.create().texOffs(0, 11).addBox(-5.5F, -0.8603F, -7.9662F, 11.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 14.0461F, 3.8722F, 0.0436F, 0.0F, 0.0F));

		PartDefinition shoulderU_r60 = shoulder.addOrReplaceChild("shoulderU_r60", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -0.0128F, -0.029F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 2.0461F, -4.5278F, 0.2531F, 0.0F, 0.0F));

		PartDefinition shoulder_r1 = shoulder.addOrReplaceChild("shoulder_r1", CubeListBuilder.create().texOffs(40, 99).mirror().addBox(-0.5F, -1.7F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0165F, 12.1406F, -8.7911F, -0.2717F, -0.4919F, -0.3554F));

		PartDefinition shoulder_r2 = shoulder.addOrReplaceChild("shoulder_r2", CubeListBuilder.create().texOffs(98, 82).mirror().addBox(-0.5F, -1.7F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.6031F, 11.9705F, -6.1258F, 0.3828F, -0.4919F, -0.3554F));

		PartDefinition shoulder_r3 = shoulder.addOrReplaceChild("shoulder_r3", CubeListBuilder.create().texOffs(49, 104).mirror().addBox(-0.5F, -0.7F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6031F, 11.9705F, -6.1258F, 0.3257F, -0.3822F, -0.4176F));

		PartDefinition shoulder_r4 = shoulder.addOrReplaceChild("shoulder_r4", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.1341F, -2.9712F, -0.0754F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7686F, 11.8465F, -1.6257F, 0.9305F, 0.0334F, -0.1552F));

		PartDefinition shoulder_r5 = shoulder.addOrReplaceChild("shoulder_r5", CubeListBuilder.create().texOffs(100, 27).mirror().addBox(-0.1F, -1.4F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.7689F, 11.9626F, -3.2663F, 0.4157F, -0.0676F, -0.2233F));

		PartDefinition shoulder_r6 = shoulder.addOrReplaceChild("shoulder_r6", CubeListBuilder.create().texOffs(52, 95).mirror().addBox(0.1F, -1.3F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.372F, 9.9591F, -3.8519F, 0.1443F, -0.0076F, -0.0937F));

		PartDefinition shoulder_r7 = shoulder.addOrReplaceChild("shoulder_r7", CubeListBuilder.create().texOffs(7, 104).mirror().addBox(-0.5F, -1.7404F, -0.8909F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8505F, 9.2274F, -6.6493F, 0.6415F, -0.5114F, 0.0449F));

		PartDefinition shoulder_r8 = shoulder.addOrReplaceChild("shoulder_r8", CubeListBuilder.create().texOffs(31, 95).mirror().addBox(-0.5F, -0.9627F, -0.979F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8505F, 9.2274F, -6.6493F, -0.2361F, -0.529F, -0.0329F));

		PartDefinition shoulder_r9 = shoulder.addOrReplaceChild("shoulder_r9", CubeListBuilder.create().texOffs(102, 103).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.8635F, 6.6076F, -8.0637F, -0.0549F, -0.4765F, 0.0964F));

		PartDefinition shoulder_r10 = shoulder.addOrReplaceChild("shoulder_r10", CubeListBuilder.create().texOffs(22, 95).mirror().addBox(-0.4F, -1.4F, -1.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4529F, 8.2975F, -9.1708F, -0.0532F, -0.4831F, -0.0017F));

		PartDefinition shoulder_r11 = shoulder.addOrReplaceChild("shoulder_r11", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.3114F, 4.1796F, -8.8037F, 0.1064F, -0.1763F, 0.6618F));

		PartDefinition shoulder_r12 = shoulder.addOrReplaceChild("shoulder_r12", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.5F, -1.1F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.1712F, 4.2807F, -9.7733F, 0.4118F, -0.1763F, 0.6618F));

		PartDefinition shoulder_r13 = shoulder.addOrReplaceChild("shoulder_r13", CubeListBuilder.create().texOffs(31, 102).mirror().addBox(-0.5F, -1.5F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.3304F, 3.8607F, -7.6196F, 0.1064F, -0.1763F, 0.6618F));

		PartDefinition shoulderU_r61 = shoulder.addOrReplaceChild("shoulderU_r61", CubeListBuilder.create().texOffs(73, 58).mirror().addBox(-14.3318F, -6.6721F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0106F, 0.8285F, -0.0042F, 0.3935F, -1.355F));

		PartDefinition shoulderU_r62 = shoulder.addOrReplaceChild("shoulderU_r62", CubeListBuilder.create().texOffs(90, 99).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0106F, 0.8285F, 0.2305F, 0.3219F, -0.7058F));

		PartDefinition shoulderU_r63 = shoulder.addOrReplaceChild("shoulderU_r63", CubeListBuilder.create().texOffs(102, 80).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0106F, 0.8285F, 0.3749F, 0.1225F, -0.0743F));

		PartDefinition shoulderU_r64 = shoulder.addOrReplaceChild("shoulderU_r64", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5106F, -1.0716F, 0.4082F, 0.134F, -0.1053F));

		PartDefinition shoulderU_r65 = shoulder.addOrReplaceChild("shoulderU_r65", CubeListBuilder.create().texOffs(77, 99).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5106F, -1.0716F, 0.2516F, 0.3506F, -0.7341F));

		PartDefinition shoulderU_r66 = shoulder.addOrReplaceChild("shoulderU_r66", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-13.3318F, -6.6721F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5106F, -1.0716F, -0.006F, 0.4285F, -1.3911F));

		PartDefinition shoulderU_r67 = shoulder.addOrReplaceChild("shoulderU_r67", CubeListBuilder.create().texOffs(9, 102).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0106F, -3.0716F, 0.4937F, 0.1533F, -0.1656F));

		PartDefinition shoulderU_r68 = shoulder.addOrReplaceChild("shoulderU_r68", CubeListBuilder.create().texOffs(99, 70).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0106F, -3.0716F, 0.3135F, 0.4156F, -0.7834F));

		PartDefinition shoulderU_r69 = shoulder.addOrReplaceChild("shoulderU_r69", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(-11.3318F, -6.6721F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0106F, -3.0716F, -0.0005F, 0.515F, -1.4611F));

		PartDefinition shoulderU_r70 = shoulder.addOrReplaceChild("shoulderU_r70", CubeListBuilder.create().texOffs(101, 96).mirror().addBox(-9.3318F, -6.6721F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6106F, -4.8716F, 0.0056F, 0.5672F, -1.543F));

		PartDefinition shoulderU_r71 = shoulder.addOrReplaceChild("shoulderU_r71", CubeListBuilder.create().texOffs(95, 101).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6106F, -4.8716F, 0.546F, 0.1623F, -0.2425F));

		PartDefinition shoulderU_r72 = shoulder.addOrReplaceChild("shoulderU_r72", CubeListBuilder.create().texOffs(99, 68).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.6106F, -4.8716F, 0.3543F, 0.4527F, -0.8513F));

		PartDefinition shoulderU_r73 = shoulder.addOrReplaceChild("shoulderU_r73", CubeListBuilder.create().texOffs(108, 94).mirror().addBox(-7.3318F, -6.6721F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.3106F, -6.7715F, -0.058F, 0.6449F, -1.6862F));

		PartDefinition shoulderU_r74 = shoulder.addOrReplaceChild("shoulderU_r74", CubeListBuilder.create().texOffs(99, 66).mirror().addBox(-8.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.3106F, -6.7715F, 0.3672F, 0.5457F, -0.9521F));

		PartDefinition shoulderU_r75 = shoulder.addOrReplaceChild("shoulderU_r75", CubeListBuilder.create().texOffs(101, 43).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.3106F, -6.7715F, 0.6098F, 0.2319F, -0.3369F));

		PartDefinition neck_r1 = shoulder.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(65, 112).mirror().addBox(-1.7066F, 3.5449F, -0.6091F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.8149F, -8.6323F, 0.686F, -0.3218F, 0.269F));

		PartDefinition neck_r2 = shoulder.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(0.1018F, 0.0341F, -0.6091F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.8149F, -8.6323F, 0.4851F, -0.592F, 0.7141F));

		PartDefinition shoulder_r14 = shoulder.addOrReplaceChild("shoulder_r14", CubeListBuilder.create().texOffs(27, 40).mirror().addBox(-0.5394F, -3.0654F, -0.3521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 12.8576F, -11.2933F, -0.1183F, -0.4396F, -0.5178F));

		PartDefinition shoulder_r15 = shoulder.addOrReplaceChild("shoulder_r15", CubeListBuilder.create().texOffs(44, 57).mirror().addBox(-2.0739F, -7.2024F, -0.3855F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 12.8576F, -11.2933F, -0.3408F, -0.3064F, 0.0761F));

		PartDefinition shoulder_r16 = shoulder.addOrReplaceChild("shoulder_r16", CubeListBuilder.create().texOffs(68, 99).mirror().addBox(-1.346F, 1.5349F, -2.1187F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 4.3576F, -6.6933F, -0.4039F, -0.4765F, 0.0964F));

		PartDefinition shoulder_r17 = shoulder.addOrReplaceChild("shoulder_r17", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-0.1324F, -2.0142F, -1.8187F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 4.3576F, -6.6933F, -0.5918F, -0.1763F, 0.6618F));

		PartDefinition shoulderU_r76 = shoulder.addOrReplaceChild("shoulderU_r76", CubeListBuilder.create().texOffs(102, 80).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0106F, 0.8285F, 0.3749F, -0.1225F, 0.0743F));

		PartDefinition shoulderU_r77 = shoulder.addOrReplaceChild("shoulderU_r77", CubeListBuilder.create().texOffs(90, 99).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0106F, 0.8285F, 0.2305F, -0.3219F, 0.7058F));

		PartDefinition shoulderU_r78 = shoulder.addOrReplaceChild("shoulderU_r78", CubeListBuilder.create().texOffs(73, 58).addBox(5.3318F, -6.6721F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0106F, 0.8285F, -0.0042F, -0.3935F, 1.355F));

		PartDefinition shoulderU_r79 = shoulder.addOrReplaceChild("shoulderU_r79", CubeListBuilder.create().texOffs(39, 19).addBox(5.3318F, -6.6721F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5106F, -1.0716F, -0.006F, -0.4285F, 1.3911F));

		PartDefinition shoulderU_r80 = shoulder.addOrReplaceChild("shoulderU_r80", CubeListBuilder.create().texOffs(77, 99).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5106F, -1.0716F, 0.2516F, -0.3506F, 0.7341F));

		PartDefinition shoulderU_r81 = shoulder.addOrReplaceChild("shoulderU_r81", CubeListBuilder.create().texOffs(49, 102).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5106F, -1.0716F, 0.4082F, -0.134F, 0.1053F));

		PartDefinition shoulderU_r82 = shoulder.addOrReplaceChild("shoulderU_r82", CubeListBuilder.create().texOffs(87, 80).addBox(5.3318F, -6.6721F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0106F, -3.0716F, -0.0005F, -0.515F, 1.4611F));

		PartDefinition shoulderU_r83 = shoulder.addOrReplaceChild("shoulderU_r83", CubeListBuilder.create().texOffs(99, 70).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0106F, -3.0716F, 0.3135F, -0.4156F, 0.7834F));

		PartDefinition shoulderU_r84 = shoulder.addOrReplaceChild("shoulderU_r84", CubeListBuilder.create().texOffs(9, 102).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0106F, -3.0716F, 0.4937F, -0.1533F, 0.1656F));

		PartDefinition shoulderU_r85 = shoulder.addOrReplaceChild("shoulderU_r85", CubeListBuilder.create().texOffs(99, 68).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6106F, -4.8716F, 0.3543F, -0.4527F, 0.8513F));

		PartDefinition shoulderU_r86 = shoulder.addOrReplaceChild("shoulderU_r86", CubeListBuilder.create().texOffs(95, 101).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6106F, -4.8716F, 0.546F, -0.1623F, 0.2425F));

		PartDefinition shoulderU_r87 = shoulder.addOrReplaceChild("shoulderU_r87", CubeListBuilder.create().texOffs(101, 96).addBox(5.3318F, -6.6721F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.6106F, -4.8716F, 0.0056F, -0.5672F, 1.543F));

		PartDefinition shoulderU_r88 = shoulder.addOrReplaceChild("shoulderU_r88", CubeListBuilder.create().texOffs(108, 94).addBox(5.3318F, -6.6721F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.3106F, -6.7715F, -0.058F, -0.6449F, 1.6862F));

		PartDefinition shoulderU_r89 = shoulder.addOrReplaceChild("shoulderU_r89", CubeListBuilder.create().texOffs(99, 66).addBox(3.1945F, -2.4073F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.3106F, -6.7715F, 0.3672F, -0.5457F, 0.9521F));

		PartDefinition shoulderU_r90 = shoulder.addOrReplaceChild("shoulderU_r90", CubeListBuilder.create().texOffs(101, 43).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.3106F, -6.7715F, 0.6098F, -0.2319F, 0.3369F));

		PartDefinition shoulderU_r91 = shoulder.addOrReplaceChild("shoulderU_r91", CubeListBuilder.create().texOffs(52, 89).addBox(-0.5F, -0.9501F, 0.0867F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 14.2734F, -7.9113F, -0.0611F, 0.0F, 0.0F));

		PartDefinition shoulderU_r92 = shoulder.addOrReplaceChild("shoulderU_r92", CubeListBuilder.create().texOffs(17, 78).addBox(-1.5F, 0.3F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 12.6734F, -8.9113F, -0.288F, 0.0F, 0.0F));

		PartDefinition shoulderU_r93 = shoulder.addOrReplaceChild("shoulderU_r93", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -0.8926F, -0.0949F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.4461F, -8.9278F, 0.3229F, 0.0F, 0.0F));

		PartDefinition shoulder_r18 = shoulder.addOrReplaceChild("shoulder_r18", CubeListBuilder.create().texOffs(44, 57).addBox(1.0739F, -7.2024F, -0.3855F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 12.8576F, -11.2933F, -0.3408F, 0.3064F, -0.0761F));

		PartDefinition shoulder_r19 = shoulder.addOrReplaceChild("shoulder_r19", CubeListBuilder.create().texOffs(27, 40).addBox(-0.4606F, -3.0654F, -0.3521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 12.8576F, -11.2933F, -0.1183F, 0.4396F, 0.5178F));

		PartDefinition shoulder_r20 = shoulder.addOrReplaceChild("shoulder_r20", CubeListBuilder.create().texOffs(0, 103).addBox(-0.8659F, -2.9712F, -0.0754F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7686F, 11.8465F, -1.6257F, 0.9305F, -0.0334F, 0.1552F));

		PartDefinition shoulder_r21 = shoulder.addOrReplaceChild("shoulder_r21", CubeListBuilder.create().texOffs(40, 99).addBox(-0.5F, -1.7F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0165F, 12.1406F, -8.7911F, -0.2717F, 0.4919F, 0.3554F));

		PartDefinition shoulder_r22 = shoulder.addOrReplaceChild("shoulder_r22", CubeListBuilder.create().texOffs(98, 82).addBox(-0.5F, -1.7F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6031F, 11.9705F, -6.1258F, 0.3828F, 0.4919F, 0.3554F));

		PartDefinition shoulder_r23 = shoulder.addOrReplaceChild("shoulder_r23", CubeListBuilder.create().texOffs(49, 104).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6031F, 11.9705F, -6.1258F, 0.3257F, 0.3822F, 0.4176F));

		PartDefinition shoulder_r24 = shoulder.addOrReplaceChild("shoulder_r24", CubeListBuilder.create().texOffs(100, 27).addBox(-0.9F, -1.4F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7689F, 11.9626F, -3.2663F, 0.4157F, 0.0676F, 0.2233F));

		PartDefinition shoulder_r25 = shoulder.addOrReplaceChild("shoulder_r25", CubeListBuilder.create().texOffs(52, 95).addBox(-1.1F, -1.3F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.372F, 9.9591F, -3.8519F, 0.1443F, 0.0076F, 0.0937F));

		PartDefinition shoulder_r26 = shoulder.addOrReplaceChild("shoulder_r26", CubeListBuilder.create().texOffs(31, 95).addBox(-0.5F, -0.9627F, -0.979F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8505F, 9.2274F, -6.6493F, -0.2361F, 0.529F, 0.0329F));

		PartDefinition shoulder_r27 = shoulder.addOrReplaceChild("shoulder_r27", CubeListBuilder.create().texOffs(22, 95).addBox(-0.6F, -1.4F, -1.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4529F, 8.2975F, -9.1708F, -0.0532F, 0.4831F, 0.0017F));

		PartDefinition shoulder_r28 = shoulder.addOrReplaceChild("shoulder_r28", CubeListBuilder.create().texOffs(7, 104).addBox(-0.5F, -1.7404F, -0.8909F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8505F, 9.2274F, -6.6493F, 0.6415F, 0.5114F, -0.0449F));

		PartDefinition shoulder_r29 = shoulder.addOrReplaceChild("shoulder_r29", CubeListBuilder.create().texOffs(102, 103).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.8635F, 6.6076F, -8.0637F, -0.0549F, 0.4765F, -0.0964F));

		PartDefinition shoulder_r30 = shoulder.addOrReplaceChild("shoulder_r30", CubeListBuilder.create().texOffs(68, 99).addBox(0.346F, 1.5349F, -2.1187F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 4.3576F, -6.6933F, -0.4039F, 0.4765F, -0.0964F));

		PartDefinition neck_r3 = shoulder.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(65, 112).addBox(1.7066F, 3.5449F, -0.6091F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.8149F, -8.6323F, 0.686F, 0.3218F, -0.269F));

		PartDefinition neck_r4 = shoulder.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(9, 94).addBox(-0.1018F, 0.0341F, -0.6091F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.8149F, -8.6323F, 0.4851F, 0.592F, -0.7141F));

		PartDefinition shoulder_r31 = shoulder.addOrReplaceChild("shoulder_r31", CubeListBuilder.create().texOffs(5, 109).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.3114F, 4.1796F, -8.8037F, 0.1064F, 0.1763F, -0.6618F));

		PartDefinition shoulder_r32 = shoulder.addOrReplaceChild("shoulder_r32", CubeListBuilder.create().texOffs(0, 109).addBox(-0.5F, -1.1F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.1712F, 4.2807F, -9.7733F, 0.4118F, 0.1763F, -0.6618F));

		PartDefinition shoulder_r33 = shoulder.addOrReplaceChild("shoulder_r33", CubeListBuilder.create().texOffs(31, 102).addBox(-0.5F, -1.5F, -1.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.3304F, 3.8607F, -7.6196F, 0.1064F, 0.1763F, -0.6618F));

		PartDefinition shoulder_r34 = shoulder.addOrReplaceChild("shoulder_r34", CubeListBuilder.create().texOffs(94, 54).addBox(-0.8676F, -2.0142F, -1.8187F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.4F, 4.3576F, -6.6933F, -0.5918F, 0.1763F, -0.6618F));

		PartDefinition legFrontL = shoulder.addOrReplaceChild("legFrontL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.9653F, 10.6954F, -4.0368F, 0.0538F, -0.4353F, -0.0895F));

		PartDefinition upperLegFrontL_r1 = legFrontL.addOrReplaceChild("upperLegFrontL_r1", CubeListBuilder.create().texOffs(68, 83).addBox(4.5F, -0.5F, -1.8F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(88, 33).addBox(1.5F, -0.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(73, 50).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, -0.6109F, 0.1309F));

		PartDefinition upperLegFrontL_r2 = legFrontL.addOrReplaceChild("upperLegFrontL_r2", CubeListBuilder.create().texOffs(87, 106).addBox(-0.7F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4289F, 0.2932F, 2.8249F, 0.1075F, 0.0827F, 0.2152F));

		PartDefinition upperLegFrontL_r3 = legFrontL.addOrReplaceChild("upperLegFrontL_r3", CubeListBuilder.create().texOffs(94, 108).addBox(-0.0203F, -0.9949F, 0.0388F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5221F, 1.1612F, -1.1369F, 0.2513F, -1.1262F, -0.0214F));

		PartDefinition legFrontLLower = legFrontL.addOrReplaceChild("legFrontLLower", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3294F, 1.2591F, 4.2973F, -0.15F, 0.1062F, -0.0407F));

		PartDefinition lowerLegFrontL_r1 = legFrontLLower.addOrReplaceChild("lowerLegFrontL_r1", CubeListBuilder.create().texOffs(43, 89).addBox(0.0F, -5.0F, 0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(83, 90).addBox(0.0F, -4.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1296F, 4.4815F, 0.1958F, 0.1309F, 0.0F, -0.0873F));

		PartDefinition legFrontLFoot = legFrontLLower.addOrReplaceChild("legFrontLFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6716F, 5.9642F, 0.4576F, 0.1745F, -0.0873F, 0.0436F));

		PartDefinition legFrontLFootb_r1 = legFrontLFoot.addOrReplaceChild("legFrontLFootb_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-2.0F, -1.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9204F, 1.5576F, -0.4762F, 0.5672F, -0.0873F, 0.0F));

		PartDefinition legFrontLFootb_r2 = legFrontLFoot.addOrReplaceChild("legFrontLFootb_r2", CubeListBuilder.create().texOffs(0, 61).addBox(-2.0F, -1.01F, -9.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0947F, 1.5676F, 1.5161F, 0.0F, -0.0873F, 0.0F));

		PartDefinition legFrontLFoota_r1 = legFrontLFoot.addOrReplaceChild("legFrontLFoota_r1", CubeListBuilder.create().texOffs(84, 68).addBox(-2.5F, -1.1F, 0.1F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8383F, 1.5676F, -0.8319F, 0.5236F, -0.5236F, 0.0F));

		PartDefinition legFrontLFoota_r2 = legFrontLFoot.addOrReplaceChild("legFrontLFoota_r2", CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -1.0F, -9.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0947F, 1.5676F, 1.5161F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legFrontL2 = shoulder.addOrReplaceChild("legFrontL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.9653F, 10.6954F, -4.0368F, -0.1797F, -1.3359F, 0.3496F));

		PartDefinition upperLegFrontL_r4 = legFrontL2.addOrReplaceChild("upperLegFrontL_r4", CubeListBuilder.create().texOffs(83, 83).addBox(-7.5F, -0.5F, -1.8F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(88, 39).addBox(-4.5F, -0.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(40, 74).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.6109F, -0.1309F));

		PartDefinition upperLegFrontL_r5 = legFrontL2.addOrReplaceChild("upperLegFrontL_r5", CubeListBuilder.create().texOffs(106, 98).addBox(-1.3F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4289F, 0.2932F, 2.8249F, 0.1075F, -0.0827F, -0.2152F));

		PartDefinition upperLegFrontL_r6 = legFrontL2.addOrReplaceChild("upperLegFrontL_r6", CubeListBuilder.create().texOffs(101, 108).addBox(-1.9797F, -0.9949F, 0.0388F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5221F, 1.1612F, -1.1369F, 0.2513F, 1.1262F, 0.0214F));

		PartDefinition legFrontLLower2 = legFrontL2.addOrReplaceChild("legFrontLLower2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3294F, 1.2591F, 4.2973F, -0.0613F, 0.3052F, 0.3973F));

		PartDefinition lowerLegFrontL_r2 = legFrontLLower2.addOrReplaceChild("lowerLegFrontL_r2", CubeListBuilder.create().texOffs(13, 90).addBox(-2.0F, -5.0F, 0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 90).addBox(-2.0F, -4.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1296F, 4.4815F, 0.1958F, 0.1309F, 0.0F, 0.0873F));

		PartDefinition legFrontLFoot2 = legFrontLLower2.addOrReplaceChild("legFrontLFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6716F, 5.9642F, 0.4576F, 0.4829F, 0.6521F, -0.4931F));

		PartDefinition legFrontLFootb_r3 = legFrontLFoot2.addOrReplaceChild("legFrontLFootb_r3", CubeListBuilder.create().texOffs(101, 38).addBox(0.0F, -1.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9204F, 1.5576F, -0.4762F, 0.5672F, 0.0873F, 0.0F));

		PartDefinition legFrontLFootb_r4 = legFrontLFoot2.addOrReplaceChild("legFrontLFootb_r4", CubeListBuilder.create().texOffs(44, 65).addBox(-2.0F, -1.01F, -9.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0947F, 1.5676F, 1.5161F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legFrontLFoota_r3 = legFrontLFoot2.addOrReplaceChild("legFrontLFoota_r3", CubeListBuilder.create().texOffs(85, 28).addBox(-2.5F, -1.1F, 0.1F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8383F, 1.5676F, -0.8319F, 0.5236F, 0.5236F, 0.0F));

		PartDefinition legFrontLFoota_r4 = legFrontLFoot2.addOrReplaceChild("legFrontLFoota_r4", CubeListBuilder.create().texOffs(50, 56).addBox(-3.0F, -1.0F, -9.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0947F, 1.5676F, 1.5161F, 0.0F, 0.5236F, 0.0F));

		PartDefinition neck = shoulder.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 3.9186F, -9.9167F, 0.0F, 0.3491F, 0.0F));

		PartDefinition neck_r5 = neck.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.079F, -0.2156F, -0.2671F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7658F, -0.8073F, 0.9054F, -0.572F, 0.4496F));

		PartDefinition neck_r6 = neck.addOrReplaceChild("neck_r6", CubeListBuilder.create().texOffs(90, 54).mirror().addBox(0.0787F, -0.0305F, 0.2037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5658F, -3.9073F, 1.0013F, -0.2282F, 0.2212F));

		PartDefinition neck_r7 = neck.addOrReplaceChild("neck_r7", CubeListBuilder.create().texOffs(40, 95).addBox(0.079F, -0.2156F, -0.2671F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7658F, -0.8073F, 0.9054F, 0.572F, -0.4496F));

		PartDefinition neck_r8 = neck.addOrReplaceChild("neck_r8", CubeListBuilder.create().texOffs(90, 54).addBox(-0.0787F, -0.0305F, 0.2037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5658F, -3.9073F, 1.0013F, 0.2282F, -0.2212F));

		PartDefinition neck_r9 = neck.addOrReplaceChild("neck_r9", CubeListBuilder.create().texOffs(100, 115).addBox(0.5F, -2.7741F, 0.9729F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 115).addBox(0.5F, -2.7741F, 2.9729F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 0).addBox(0.0F, -1.074F, -0.0271F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.5658F, -3.9073F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck_r10 = neck.addOrReplaceChild("neck_r10", CubeListBuilder.create().texOffs(94, 115).addBox(0.5F, -1.7602F, -0.912F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4658F, -3.5073F, 0.3491F, 0.0F, 0.0F));

		PartDefinition neck_r11 = neck.addOrReplaceChild("neck_r11", CubeListBuilder.create().texOffs(107, 76).addBox(0.0F, -1.1177F, -3.0261F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5658F, -2.9073F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, 0.6536F, -5.1125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition skullTop = head.addOrReplaceChild("skullTop", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -0.2F, 0.6F, 0.132F, 0.2618F, 0.0F));

		PartDefinition skullT5_r1 = skullTop.addOrReplaceChild("skullT5_r1", CubeListBuilder.create().texOffs(15, 110).addBox(-0.5F, -0.0163F, -0.0509F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.8718F, -6.8379F, 0.3578F, 0.0F, 0.0F));

		PartDefinition skullT7_r1 = skullTop.addOrReplaceChild("skullT7_r1", CubeListBuilder.create().texOffs(28, 108).addBox(-1.0F, 0.5895F, 0.0121F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(108, 108).addBox(-1.0F, 0.5895F, -0.0879F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(68, 112).addBox(-0.5F, -0.0105F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.1718F, -7.6379F, 0.5498F, 0.0F, 0.0F));

		PartDefinition skullT4_r1 = skullTop.addOrReplaceChild("skullT4_r1", CubeListBuilder.create().texOffs(60, 112).addBox(-0.5F, -0.0105F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1718F, -7.6379F, 0.7243F, 0.0F, 0.0F));

		PartDefinition skullT3_r1 = skullTop.addOrReplaceChild("skullT3_r1", CubeListBuilder.create().texOffs(22, 90).addBox(-0.5F, -0.0262F, -0.0266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1836F, -5.9729F, 0.1396F, 0.0F, 0.0F));

		PartDefinition skullT4_r2 = skullTop.addOrReplaceChild("skullT4_r2", CubeListBuilder.create().texOffs(73, 62).addBox(-1.0F, 0.0097F, 0.0313F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.8F, -0.3927F, 0.0F, 0.0F));

		PartDefinition skullT4_r3 = skullTop.addOrReplaceChild("skullT4_r3", CubeListBuilder.create().texOffs(10, 110).addBox(0.5F, 0.0219F, -0.0469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(99, 62).addBox(-1.0F, 0.0262F, -0.0469F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, -1.7F, -2.7F, -0.2007F, 0.0F, 0.0F));

		PartDefinition skullT2_r1 = skullTop.addOrReplaceChild("skullT2_r1", CubeListBuilder.create().texOffs(77, 101).addBox(-0.5F, 0.0F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.1F, 0.1396F, 0.0F, 0.0F));

		PartDefinition skullT1_r1 = skullTop.addOrReplaceChild("skullT1_r1", CubeListBuilder.create().texOffs(90, 50).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4F, -3.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftFace = skullTop.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -1.1F, -0.9F));

		PartDefinition skullT4_r4 = leftFace.addOrReplaceChild("skullT4_r4", CubeListBuilder.create().texOffs(55, 115).addBox(1.5F, 0.0281F, 0.0247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9687F, 0.0F, 0.0F));

		PartDefinition skullT6_r1 = leftFace.addOrReplaceChild("skullT6_r1", CubeListBuilder.create().texOffs(78, 112).addBox(0.52F, -0.5F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.6F, -3.1697F, -0.0175F, 0.0F, 0.0F));

		PartDefinition skullT7_r2 = leftFace.addOrReplaceChild("skullT7_r2", CubeListBuilder.create().texOffs(88, 112).addBox(0.52F, -0.0686F, 0.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 0.2F, -1.3697F, -0.7156F, 0.0F, 0.0F));

		PartDefinition skullT7_r3 = leftFace.addOrReplaceChild("skullT7_r3", CubeListBuilder.create().texOffs(83, 112).addBox(0.52F, -0.986F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 1.1F, -2.3697F, -0.2269F, 0.0F, 0.0F));

		PartDefinition skullT6_r2 = leftFace.addOrReplaceChild("skullT6_r2", CubeListBuilder.create().texOffs(93, 112).addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.9923F, -5.1728F, 0.4282F, 0.3666F, 0.1441F));

		PartDefinition skullT7_r4 = leftFace.addOrReplaceChild("skullT7_r4", CubeListBuilder.create().texOffs(68, 115).addBox(-0.5F, -0.434F, -0.2747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.62F, 1.0172F, -5.5265F, 0.334F, 0.3978F, 0.0553F));

		PartDefinition skullT8_r1 = leftFace.addOrReplaceChild("skullT8_r1", CubeListBuilder.create().texOffs(73, 115).addBox(-0.5F, -0.4687F, -0.7327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.62F, 1.0172F, -5.5265F, -0.0848F, 0.3978F, 0.0553F));

		PartDefinition skullT4_r5 = leftFace.addOrReplaceChild("skullT4_r5", CubeListBuilder.create().texOffs(86, 101).addBox(-2.0F, -0.0605F, -1.9657F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -0.236F, -3.7421F, 0.2188F, 0.3414F, 0.0901F));

		PartDefinition skullT3_r2 = leftFace.addOrReplaceChild("skullT3_r2", CubeListBuilder.create().texOffs(95, 103).addBox(-0.9519F, -0.0301F, -2.0259F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9214F, -0.5288F, -1.8248F, 0.1198F, 0.05F, 0.0337F));

		PartDefinition skullT7_r5 = leftFace.addOrReplaceChild("skullT7_r5", CubeListBuilder.create().texOffs(73, 112).addBox(-0.9686F, 0.5123F, -0.7616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8F, -0.236F, -3.7421F, -0.0603F, 0.3325F, 0.0756F));

		PartDefinition skullT6_r3 = leftFace.addOrReplaceChild("skullT6_r3", CubeListBuilder.create().texOffs(112, 68).addBox(-0.9686F, 0.2699F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -0.236F, -3.7421F, 0.1666F, 0.3325F, 0.0756F));

		PartDefinition skullT5_r2 = leftFace.addOrReplaceChild("skullT5_r2", CubeListBuilder.create().texOffs(60, 115).addBox(-0.8862F, 0.5944F, -1.9348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9214F, -0.5288F, -1.8248F, -0.0275F, 0.0526F, 0.0509F));

		PartDefinition skullT5_r3 = leftFace.addOrReplaceChild("skullT5_r3", CubeListBuilder.create().texOffs(55, 112).addBox(-0.6F, -0.4374F, -0.1049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(103, 98).addBox(0.2F, -0.0374F, -0.3049F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 112).addBox(-0.6F, -0.4374F, -0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.4165F, -4.2504F, 0.1571F, 0.0259F, 0.0041F));

		PartDefinition skullT4_r6 = leftFace.addOrReplaceChild("skullT4_r6", CubeListBuilder.create().texOffs(28, 105).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 1.476F, -2.8654F, 0.4189F, 0.0F, 0.0F));

		PartDefinition skullT3_r3 = leftFace.addOrReplaceChild("skullT3_r3", CubeListBuilder.create().texOffs(107, 82).addBox(1.4F, -1.0068F, -1.0268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5F, -2.3F, 0.3316F, 0.0F, 0.0F));

		PartDefinition skullT5_r4 = leftFace.addOrReplaceChild("skullT5_r4", CubeListBuilder.create().texOffs(112, 65).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8257F, 1.5941F, -5.3169F, 0.101F, 0.5833F, 0.0415F));

		PartDefinition skullT7_r6 = leftFace.addOrReplaceChild("skullT7_r6", CubeListBuilder.create().texOffs(49, 99).addBox(0.0F, -0.5F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3857F, 2.0446F, -4.8037F, 0.3192F, 0.5833F, 0.0415F));

		PartDefinition skullT6_r4 = leftFace.addOrReplaceChild("skullT6_r4", CubeListBuilder.create().texOffs(98, 112).addBox(-0.68F, -0.3549F, 0.8774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 1.5086F, -5.9908F, 0.101F, 0.5833F, 0.0415F));

		PartDefinition skullT3_r4 = leftFace.addOrReplaceChild("skullT3_r4", CubeListBuilder.create().texOffs(113, 0).addBox(1.0F, 0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(103, 112).addBox(1.0F, 0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 1.2745F, 0.338F, -1.3963F, 0.0F, 0.0F));

		PartDefinition skullT2_r2 = leftFace.addOrReplaceChild("skullT2_r2", CubeListBuilder.create().texOffs(75, 106).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 1.387F, -2.2351F, -0.3295F, 0.1172F, 0.3295F));

		PartDefinition rightFace = skullTop.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(1.5F, -1.1F, -0.9F));

		PartDefinition skullT5_r5 = rightFace.addOrReplaceChild("skullT5_r5", CubeListBuilder.create().texOffs(55, 115).mirror().addBox(-2.5F, 0.0281F, 0.0247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9687F, 0.0F, 0.0F));

		PartDefinition skullT7_r7 = rightFace.addOrReplaceChild("skullT7_r7", CubeListBuilder.create().texOffs(78, 112).mirror().addBox(-1.52F, -0.5F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6F, -3.1697F, -0.0175F, 0.0F, 0.0F));

		PartDefinition skullT8_r2 = rightFace.addOrReplaceChild("skullT8_r2", CubeListBuilder.create().texOffs(88, 112).mirror().addBox(-1.52F, -0.0686F, 0.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2F, -1.3697F, -0.7156F, 0.0F, 0.0F));

		PartDefinition skullT8_r3 = rightFace.addOrReplaceChild("skullT8_r3", CubeListBuilder.create().texOffs(83, 112).mirror().addBox(-1.52F, -0.986F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.1F, -2.3697F, -0.2269F, 0.0F, 0.0F));

		PartDefinition skullT7_r8 = rightFace.addOrReplaceChild("skullT7_r8", CubeListBuilder.create().texOffs(93, 112).mirror().addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.9923F, -5.1728F, 0.4282F, -0.3666F, -0.1441F));

		PartDefinition skullT8_r4 = rightFace.addOrReplaceChild("skullT8_r4", CubeListBuilder.create().texOffs(68, 115).mirror().addBox(-0.5F, -0.434F, -0.2747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.62F, 1.0172F, -5.5265F, 0.334F, -0.3978F, -0.0553F));

		PartDefinition skullT9_r1 = rightFace.addOrReplaceChild("skullT9_r1", CubeListBuilder.create().texOffs(73, 115).mirror().addBox(-0.5F, -0.4687F, -0.7327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.62F, 1.0172F, -5.5265F, -0.0848F, -0.3978F, -0.0553F));

		PartDefinition skullT5_r6 = rightFace.addOrReplaceChild("skullT5_r6", CubeListBuilder.create().texOffs(86, 101).mirror().addBox(0.0F, -0.0605F, -1.9657F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -0.236F, -3.7421F, 0.2188F, -0.3414F, -0.0901F));

		PartDefinition skullT4_r7 = rightFace.addOrReplaceChild("skullT4_r7", CubeListBuilder.create().texOffs(95, 103).mirror().addBox(-0.0481F, -0.0301F, -2.0259F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9214F, -0.5288F, -1.8248F, 0.1198F, -0.05F, -0.0337F));

		PartDefinition skullT8_r5 = rightFace.addOrReplaceChild("skullT8_r5", CubeListBuilder.create().texOffs(73, 112).mirror().addBox(-0.0314F, 0.5123F, -0.7616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -0.236F, -3.7421F, -0.0603F, -0.3325F, -0.0756F));

		PartDefinition skullT7_r9 = rightFace.addOrReplaceChild("skullT7_r9", CubeListBuilder.create().texOffs(112, 68).mirror().addBox(-0.0314F, 0.2699F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -0.236F, -3.7421F, 0.1666F, -0.3325F, -0.0756F));

		PartDefinition skullT6_r5 = rightFace.addOrReplaceChild("skullT6_r5", CubeListBuilder.create().texOffs(60, 115).mirror().addBox(-0.1138F, 0.5944F, -1.9348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9214F, -0.5288F, -1.8248F, -0.0275F, -0.0526F, -0.0509F));

		PartDefinition skullT6_r6 = rightFace.addOrReplaceChild("skullT6_r6", CubeListBuilder.create().texOffs(55, 112).mirror().addBox(-0.4F, -0.4374F, -0.1049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(103, 98).mirror().addBox(-0.2F, -0.0374F, -0.3049F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 112).mirror().addBox(-0.4F, -0.4374F, -0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.4165F, -4.2504F, 0.1571F, -0.0259F, -0.0041F));

		PartDefinition skullT5_r7 = rightFace.addOrReplaceChild("skullT5_r7", CubeListBuilder.create().texOffs(28, 105).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.476F, -2.8654F, 0.4189F, 0.0F, 0.0F));

		PartDefinition skullT4_r8 = rightFace.addOrReplaceChild("skullT4_r8", CubeListBuilder.create().texOffs(107, 82).mirror().addBox(-2.4F, -1.0068F, -1.0268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5F, -2.3F, 0.3316F, 0.0F, 0.0F));

		PartDefinition skullT6_r7 = rightFace.addOrReplaceChild("skullT6_r7", CubeListBuilder.create().texOffs(112, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8257F, 1.5941F, -5.3169F, 0.101F, -0.5833F, -0.0415F));

		PartDefinition skullT8_r6 = rightFace.addOrReplaceChild("skullT8_r6", CubeListBuilder.create().texOffs(49, 99).mirror().addBox(0.0F, -0.5F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3857F, 2.0446F, -4.8037F, 0.3192F, -0.5833F, -0.0415F));

		PartDefinition skullT7_r10 = rightFace.addOrReplaceChild("skullT7_r10", CubeListBuilder.create().texOffs(98, 112).mirror().addBox(-0.32F, -0.3549F, 0.8774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 1.5086F, -5.9908F, 0.101F, -0.5833F, -0.0415F));

		PartDefinition skullT4_r9 = rightFace.addOrReplaceChild("skullT4_r9", CubeListBuilder.create().texOffs(113, 0).mirror().addBox(-2.0F, 0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(103, 112).mirror().addBox(-2.0F, 0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2745F, 0.338F, -1.3963F, 0.0F, 0.0F));

		PartDefinition skullT3_r5 = rightFace.addOrReplaceChild("skullT3_r5", CubeListBuilder.create().texOffs(75, 106).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.387F, -2.2351F, -0.3295F, -0.1172F, -0.3295F));

		PartDefinition skullJaw = skullTop.addOrReplaceChild("skullJaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5012F, 0.8717F, -0.6978F, 0.2356F, 0.0F, 0.0F));

		PartDefinition skullJ5_r1 = skullJaw.addOrReplaceChild("skullJ5_r1", CubeListBuilder.create().texOffs(68, 109).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0012F, 1.1833F, -4.7652F, 0.6283F, 0.0F, 0.0F));

		PartDefinition skullJ5_r2 = skullJaw.addOrReplaceChild("skullJ5_r2", CubeListBuilder.create().texOffs(109, 102).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0012F, 0.3488F, -5.1024F, 0.192F, 0.0F, 0.0F));

		PartDefinition skullJ4_r1 = skullJaw.addOrReplaceChild("skullJ4_r1", CubeListBuilder.create().texOffs(109, 45).addBox(-1.0F, -0.5356F, -0.1542F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0012F, 0.9749F, -5.2224F, 0.384F, 0.0F, 0.0F));

		PartDefinition skullJ6_r1 = skullJaw.addOrReplaceChild("skullJ6_r1", CubeListBuilder.create().texOffs(45, 112).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(112, 42).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.0171F, 0.9988F, -4.4834F, 0.6905F, -0.8058F, -0.3344F));

		PartDefinition skullJ6_r2 = skullJaw.addOrReplaceChild("skullJ6_r2", CubeListBuilder.create().texOffs(35, 112).mirror().addBox(-0.1886F, -0.195F, -1.3389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(30, 112).mirror().addBox(-0.1886F, -0.195F, -0.8389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.6512F, 0.3628F, -4.5403F, 0.4811F, -0.8058F, -0.3344F));

		PartDefinition skullJ4_r2 = skullJaw.addOrReplaceChild("skullJ4_r2", CubeListBuilder.create().texOffs(25, 112).mirror().addBox(-0.15F, -0.1461F, -0.8711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7512F, 0.1628F, -3.8403F, 0.2094F, -0.0873F, 0.0F));

		PartDefinition skullJ4_r3 = skullJaw.addOrReplaceChild("skullJ4_r3", CubeListBuilder.create().texOffs(20, 112).mirror().addBox(-0.6F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0469F, 0.3563F, -4.4333F, 0.1939F, -0.8137F, -0.0984F));

		PartDefinition skullJ4_r4 = skullJaw.addOrReplaceChild("skullJ4_r4", CubeListBuilder.create().texOffs(117, 48).mirror().addBox(-1.1F, 0.0141F, -0.8148F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 48).addBox(1.9F, 0.0141F, -0.8148F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4012F, -0.1277F, -3.244F, 0.0698F, 0.0F, 0.0F));

		PartDefinition skullJ5_r3 = skullJaw.addOrReplaceChild("skullJ5_r3", CubeListBuilder.create().texOffs(81, 115).mirror().addBox(-0.5F, -0.8746F, -0.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(81, 115).addBox(2.3F, -0.8746F, -0.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4012F, 1.0402F, -3.5926F, 0.2269F, 0.0F, 0.0F));

		PartDefinition skullJ4_r5 = skullJaw.addOrReplaceChild("skullJ4_r5", CubeListBuilder.create().texOffs(111, 111).mirror().addBox(-0.15F, 0.0368F, -0.9187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1505F)).mirror(false), PartPose.offsetAndRotation(-1.7512F, 0.1628F, -3.8403F, 0.2967F, -0.0873F, 0.0F));

		PartDefinition skullJ4_r6 = skullJaw.addOrReplaceChild("skullJ4_r6", CubeListBuilder.create().texOffs(45, 109).mirror().addBox(-1.0F, -0.554F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 109).addBox(-1.0F, -0.554F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0012F, 1.0298F, -4.5078F, 0.5236F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r1 = skullJaw.addOrReplaceChild("skullJ1b_r1", CubeListBuilder.create().texOffs(115, 90).mirror().addBox(-1.81F, -0.901F, -0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(115, 90).addBox(0.995F, -0.901F, -0.8856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.0937F, 0.8055F, -2.344F, 0.1396F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r2 = skullJaw.addOrReplaceChild("skullJ1b_r2", CubeListBuilder.create().texOffs(86, 115).mirror().addBox(-1.81F, -0.1672F, -0.1267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(86, 115).addBox(0.995F, -0.1672F, -0.1267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0937F, 0.1055F, -3.244F, 0.6109F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r3 = skullJaw.addOrReplaceChild("skullJ1b_r3", CubeListBuilder.create().texOffs(113, 6).mirror().addBox(-0.1F, -0.3648F, -2.6832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0037F, 0.2553F, 0.1401F, 0.0F, -0.0698F, 0.0F));

		PartDefinition skullJ1b_r4 = skullJaw.addOrReplaceChild("skullJ1b_r4", CubeListBuilder.create().texOffs(113, 3).mirror().addBox(-0.1F, -0.7134F, -2.9057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.0037F, 0.2553F, 0.1401F, -0.0349F, -0.0698F, 0.0F));

		PartDefinition skullJ1b_r5 = skullJaw.addOrReplaceChild("skullJ1b_r5", CubeListBuilder.create().texOffs(38, 106).mirror().addBox(-0.1F, -0.4279F, -1.8995F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0037F, 0.2553F, 0.1401F, 0.0349F, -0.0698F, 0.0F));

		PartDefinition skullJ1b_r6 = skullJaw.addOrReplaceChild("skullJ1b_r6", CubeListBuilder.create().texOffs(34, 78).mirror().addBox(-0.4941F, -1.0332F, -1.8748F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0063F, 1.4055F, -0.044F, -0.2224F, -0.2509F, 0.0337F));

		PartDefinition skullJ1b_r7 = skullJaw.addOrReplaceChild("skullJ1b_r7", CubeListBuilder.create().texOffs(68, 105).mirror().addBox(-0.1F, -0.32F, -2.1795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-2.0037F, 0.2553F, 0.1401F, -0.2269F, -0.0698F, 0.0F));

		PartDefinition skullJ3_r1 = skullJaw.addOrReplaceChild("skullJ3_r1", CubeListBuilder.create().texOffs(111, 24).mirror().addBox(-1.5F, -0.2023F, -0.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1505F)).mirror(false)
				.texOffs(111, 24).addBox(1.3F, -0.2023F, -0.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1505F)), PartPose.offsetAndRotation(-0.4012F, 0.0723F, -3.144F, 0.2094F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r8 = skullJaw.addOrReplaceChild("skullJ1b_r8", CubeListBuilder.create().texOffs(34, 78).addBox(0.4941F, -1.0332F, -1.8748F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0088F, 1.4055F, -0.044F, -0.2224F, 0.2509F, -0.0337F));

		PartDefinition skullJ3_r2 = skullJaw.addOrReplaceChild("skullJ3_r2", CubeListBuilder.create().texOffs(111, 111).addBox(-0.85F, 0.0368F, -0.9187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1505F)), PartPose.offsetAndRotation(1.7488F, 0.1628F, -3.8403F, 0.2967F, 0.0873F, 0.0F));

		PartDefinition skullJ3_r3 = skullJaw.addOrReplaceChild("skullJ3_r3", CubeListBuilder.create().texOffs(20, 112).addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0444F, 0.3563F, -4.4333F, 0.1939F, 0.8137F, 0.0984F));

		PartDefinition skullJ6_r3 = skullJaw.addOrReplaceChild("skullJ6_r3", CubeListBuilder.create().texOffs(112, 42).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(45, 112).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0146F, 0.9988F, -4.4834F, 0.6905F, 0.8058F, 0.3344F));

		PartDefinition skullJ5_r4 = skullJaw.addOrReplaceChild("skullJ5_r4", CubeListBuilder.create().texOffs(35, 112).addBox(-0.8114F, -0.195F, -1.3389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 112).addBox(-0.8114F, -0.195F, -0.8389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.6488F, 0.3628F, -4.5403F, 0.4811F, 0.8058F, 0.3344F));

		PartDefinition skullJ3_r4 = skullJaw.addOrReplaceChild("skullJ3_r4", CubeListBuilder.create().texOffs(25, 112).addBox(-0.85F, -0.1461F, -0.8711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7488F, 0.1628F, -3.8403F, 0.2094F, 0.0873F, 0.0F));

		PartDefinition skullJ1b_r9 = skullJaw.addOrReplaceChild("skullJ1b_r9", CubeListBuilder.create().texOffs(113, 6).addBox(-0.9F, -0.3648F, -2.6832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0013F, 0.2553F, 0.1401F, 0.0F, 0.0698F, 0.0F));

		PartDefinition skullJ1b_r10 = skullJaw.addOrReplaceChild("skullJ1b_r10", CubeListBuilder.create().texOffs(38, 106).addBox(-0.9F, -0.4279F, -1.8995F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0013F, 0.2553F, 0.1401F, 0.0349F, 0.0698F, 0.0F));

		PartDefinition skullJ1b_r11 = skullJaw.addOrReplaceChild("skullJ1b_r11", CubeListBuilder.create().texOffs(113, 3).addBox(-0.9F, -0.7134F, -2.9057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.0013F, 0.2553F, 0.1401F, -0.0349F, 0.0698F, 0.0F));

		PartDefinition skullJ1b_r12 = skullJaw.addOrReplaceChild("skullJ1b_r12", CubeListBuilder.create().texOffs(68, 105).addBox(-0.9F, -0.32F, -2.1795F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(2.0013F, 0.2553F, 0.1401F, -0.2269F, 0.0698F, 0.0F));

		PartDefinition rump = bodyCentreFront.addOrReplaceChild("rump", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1442F, 1.7994F, 0.0F, -0.2182F, 0.0F));

		PartDefinition rump_r1 = rump.addOrReplaceChild("rump_r1", CubeListBuilder.create().texOffs(111, 114).addBox(5.5F, -3.0131F, -1.0167F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 1.197F, 6.6544F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rump_r2 = rump.addOrReplaceChild("rump_r2", CubeListBuilder.create().texOffs(114, 81).addBox(5.5F, -2.9882F, -1.0069F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 0.997F, 4.6544F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rump_r3 = rump.addOrReplaceChild("rump_r3", CubeListBuilder.create().texOffs(114, 76).addBox(5.5F, -3.0629F, -1.0058F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 0.897F, 2.6544F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rump_r4 = rump.addOrReplaceChild("rump_r4", CubeListBuilder.create().texOffs(114, 48).addBox(5.5F, -2.9379F, -0.996F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 0.697F, 0.6544F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rump_r5 = rump.addOrReplaceChild("rump_r5", CubeListBuilder.create().texOffs(21, 68).addBox(5.0F, -1.0129F, -0.1778F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 1.597F, -0.2456F, -0.0873F, 0.0F, 0.0F));

		PartDefinition shoulderU_r94 = rump.addOrReplaceChild("shoulderU_r94", CubeListBuilder.create().texOffs(110, 40).mirror().addBox(-3.0161F, 0.0436F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.0354F, 6.212F, -0.1453F, -0.0797F, -0.5092F));

		PartDefinition shoulderU_r95 = rump.addOrReplaceChild("shoulderU_r95", CubeListBuilder.create().texOffs(39, 11).mirror().addBox(-3.435F, -1.7803F, -0.5022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.0354F, 6.212F, -0.0682F, -0.151F, -1.1556F));

		PartDefinition shoulderU_r96 = rump.addOrReplaceChild("shoulderU_r96", CubeListBuilder.create().texOffs(87, 16).mirror().addBox(-4.435F, -1.7803F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.0354F, 4.212F, -0.0682F, -0.151F, -1.1556F));

		PartDefinition shoulderU_r97 = rump.addOrReplaceChild("shoulderU_r97", CubeListBuilder.create().texOffs(110, 38).mirror().addBox(-3.0161F, 0.0436F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.0354F, 4.212F, -0.1453F, -0.0797F, -0.5092F));

		PartDefinition shoulderU_r98 = rump.addOrReplaceChild("shoulderU_r98", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(-4.435F, -1.7803F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2354F, 2.212F, -0.1599F, -0.0342F, -1.1517F));

		PartDefinition shoulderU_r99 = rump.addOrReplaceChild("shoulderU_r99", CubeListBuilder.create().texOffs(107, 74).mirror().addBox(-3.0161F, 0.0436F, -0.5022F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2354F, 2.212F, -0.1486F, 0.0685F, -0.5138F));

		PartDefinition shoulderU_r100 = rump.addOrReplaceChild("shoulderU_r100", CubeListBuilder.create().texOffs(107, 72).mirror().addBox(-3.0161F, 0.0436F, -0.5022F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9354F, 0.212F, -0.1019F, 0.1449F, -0.4676F));

		PartDefinition shoulderU_r101 = rump.addOrReplaceChild("shoulderU_r101", CubeListBuilder.create().texOffs(103, 51).mirror().addBox(-6.435F, -1.7803F, -0.5022F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9354F, 0.212F, -0.1683F, 0.0548F, -1.1106F));

		PartDefinition shoulderU_r102 = rump.addOrReplaceChild("shoulderU_r102", CubeListBuilder.create().texOffs(39, 11).addBox(2.435F, -1.7803F, -0.5022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0354F, 6.212F, -0.0682F, 0.151F, 1.1556F));

		PartDefinition shoulderU_r103 = rump.addOrReplaceChild("shoulderU_r103", CubeListBuilder.create().texOffs(110, 40).addBox(1.0161F, 0.0436F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0354F, 6.212F, -0.1453F, 0.0797F, 0.5092F));

		PartDefinition shoulderU_r104 = rump.addOrReplaceChild("shoulderU_r104", CubeListBuilder.create().texOffs(110, 38).addBox(1.0161F, 0.0436F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0354F, 4.212F, -0.1453F, 0.0797F, 0.5092F));

		PartDefinition shoulderU_r105 = rump.addOrReplaceChild("shoulderU_r105", CubeListBuilder.create().texOffs(87, 16).addBox(2.435F, -1.7803F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0354F, 4.212F, -0.0682F, 0.151F, 1.1556F));

		PartDefinition shoulderU_r106 = rump.addOrReplaceChild("shoulderU_r106", CubeListBuilder.create().texOffs(107, 74).addBox(0.0161F, 0.0436F, -0.5022F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2354F, 2.212F, -0.0194F, 0.1594F, 0.5197F));

		PartDefinition shoulderU_r107 = rump.addOrReplaceChild("shoulderU_r107", CubeListBuilder.create().texOffs(110, 36).addBox(2.435F, -1.7803F, -0.5022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2354F, 2.212F, 0.0811F, 0.1388F, 1.1726F));

		PartDefinition shoulderU_r108 = rump.addOrReplaceChild("shoulderU_r108", CubeListBuilder.create().texOffs(103, 51).addBox(2.435F, -1.7803F, -0.5022F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9354F, 0.212F, 0.1448F, 0.1004F, 1.1179F));

		PartDefinition shoulderU_r109 = rump.addOrReplaceChild("shoulderU_r109", CubeListBuilder.create().texOffs(107, 72).addBox(0.0161F, 0.0436F, -0.5022F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9354F, 0.212F, 0.0551F, 0.1672F, 0.4694F));

		PartDefinition bodyBack = rump.addOrReplaceChild("bodyBack", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.397F, 8.2544F));

		PartDefinition rump_r6 = bodyBack.addOrReplaceChild("rump_r6", CubeListBuilder.create().texOffs(17, 70).addBox(5.5F, -3.246F, -0.9088F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.5F, 4.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rump_r7 = bodyBack.addOrReplaceChild("rump_r7", CubeListBuilder.create().texOffs(40, 68).addBox(5.5F, -3.279F, -0.9986F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.3F, 2.3F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rump_r8 = bodyBack.addOrReplaceChild("rump_r8", CubeListBuilder.create().texOffs(114, 114).addBox(5.5F, -3.025F, -0.9769F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, 0.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rump_r9 = bodyBack.addOrReplaceChild("rump_r9", CubeListBuilder.create().texOffs(110, 32).mirror().addBox(-8.0F, 0.4646F, 3.9285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 110).mirror().addBox(-8.0F, 0.4646F, 1.9285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 105).mirror().addBox(-8.0F, 0.4646F, -0.0715F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 32).addBox(-5.0F, 0.4646F, 3.9285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 110).addBox(-5.0F, 0.4646F, 1.9285F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 105).addBox(-5.0F, 0.4646F, -0.0715F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 75).addBox(-6.0F, -0.0354F, -0.0715F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -0.1F, -0.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rump_r10 = bodyBack.addOrReplaceChild("rump_r10", CubeListBuilder.create().texOffs(109, 27).mirror().addBox(0.0F, -5.2681F, -3.0831F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(82, 106).mirror().addBox(0.0F, -6.2681F, -2.1831F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6F, 1.7F, 1.9755F, 0.2079F, -0.3124F));

		PartDefinition rump_r11 = bodyBack.addOrReplaceChild("rump_r11", CubeListBuilder.create().texOffs(56, 104).mirror().addBox(0.0F, -5.0996F, -5.1219F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6F, 1.7F, 1.5566F, 0.2079F, -0.3124F));

		PartDefinition rump_r12 = bodyBack.addOrReplaceChild("rump_r12", CubeListBuilder.create().texOffs(103, 53).mirror().addBox(0.0F, 2.357F, -5.4855F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6F, 1.7F, 1.6439F, 0.2079F, -0.3124F));

		PartDefinition rump_r13 = bodyBack.addOrReplaceChild("rump_r13", CubeListBuilder.create().texOffs(61, 99).mirror().addBox(0.0F, -2.9925F, -5.1571F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6F, 1.7F, 1.5217F, 0.2079F, -0.3124F));

		PartDefinition rump_r14 = bodyBack.addOrReplaceChild("rump_r14", CubeListBuilder.create().texOffs(100, 72).mirror().addBox(0.0F, 1.935F, -3.1913F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6F, 1.7F, 1.2773F, 0.2079F, -0.3124F));

		PartDefinition rump_r15 = bodyBack.addOrReplaceChild("rump_r15", CubeListBuilder.create().texOffs(108, 90).mirror().addBox(0.0F, 2.6795F, 0.4203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.6F, 1.7F, 0.3698F, 0.2079F, -0.3124F));

		PartDefinition rump_r16 = bodyBack.addOrReplaceChild("rump_r16", CubeListBuilder.create().texOffs(50, 115).mirror().addBox(0.0F, -0.0833F, -1.3013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.6F, 1.7F, -0.0666F, 0.2079F, -0.1815F));

		PartDefinition rump_r17 = bodyBack.addOrReplaceChild("rump_r17", CubeListBuilder.create().texOffs(60, 37).mirror().addBox(0.0F, 0.3534F, -0.7297F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.6F, 1.7F, -0.5989F, 0.2079F, -0.1815F));

		PartDefinition rump_r18 = bodyBack.addOrReplaceChild("rump_r18", CubeListBuilder.create().texOffs(101, 89).mirror().addBox(0.0F, -0.6466F, -0.7297F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.6F, 1.7F, 0.7537F, 0.2079F, -0.1815F));

		PartDefinition rump_r19 = bodyBack.addOrReplaceChild("rump_r19", CubeListBuilder.create().texOffs(21, 105).mirror().addBox(-0.5F, -1.0985F, -1.7794F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2486F, 1.5239F, 0.9076F, 0.1745F, -0.1309F));

		PartDefinition rump_r20 = bodyBack.addOrReplaceChild("rump_r20", CubeListBuilder.create().texOffs(61, 108).mirror().addBox(-0.5F, -1.1002F, -2.1094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2486F, 1.5239F, 0.384F, 0.1745F, -0.1309F));

		PartDefinition rump_r21 = bodyBack.addOrReplaceChild("rump_r21", CubeListBuilder.create().texOffs(45, 115).mirror().addBox(-0.5F, -0.9907F, -0.4695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2486F, 1.5239F, 0.0349F, 0.1745F, -0.1309F));

		PartDefinition rump_r22 = bodyBack.addOrReplaceChild("rump_r22", CubeListBuilder.create().texOffs(14, 105).mirror().addBox(-0.5F, -1.0907F, 0.2721F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.2486F, 1.5239F, -0.2269F, 0.1745F, -0.1309F));

		PartDefinition rump_r23 = bodyBack.addOrReplaceChild("rump_r23", CubeListBuilder.create().texOffs(50, 115).addBox(-1.0F, -0.0833F, -1.3013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 1.6F, 1.7F, -0.0666F, -0.2079F, 0.1815F));

		PartDefinition rump_r24 = bodyBack.addOrReplaceChild("rump_r24", CubeListBuilder.create().texOffs(21, 105).addBox(-0.5F, -1.0985F, -1.7794F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9F, 0.2486F, 1.5239F, 0.9076F, -0.1745F, 0.1309F));

		PartDefinition rump_r25 = bodyBack.addOrReplaceChild("rump_r25", CubeListBuilder.create().texOffs(61, 108).addBox(-0.5F, -1.1002F, -2.1094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.2486F, 1.5239F, 0.384F, -0.1745F, 0.1309F));

		PartDefinition rump_r26 = bodyBack.addOrReplaceChild("rump_r26", CubeListBuilder.create().texOffs(45, 115).addBox(-0.5F, -0.9907F, -0.4695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9F, 0.2486F, 1.5239F, 0.0349F, -0.1745F, 0.1309F));

		PartDefinition rump_r27 = bodyBack.addOrReplaceChild("rump_r27", CubeListBuilder.create().texOffs(60, 37).addBox(-1.0F, 0.3534F, -0.7297F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.2F, 1.6F, 1.7F, -0.5989F, -0.2079F, 0.1815F));

		PartDefinition rump_r28 = bodyBack.addOrReplaceChild("rump_r28", CubeListBuilder.create().texOffs(103, 53).addBox(-1.0F, 2.357F, -5.4855F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.6F, 1.7F, 1.6439F, -0.2079F, 0.3124F));

		PartDefinition rump_r29 = bodyBack.addOrReplaceChild("rump_r29", CubeListBuilder.create().texOffs(109, 27).addBox(-1.0F, -5.2681F, -3.0831F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(82, 106).addBox(-1.0F, -6.2681F, -2.1831F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.6F, 1.7F, 1.9755F, -0.2079F, 0.3124F));

		PartDefinition rump_r30 = bodyBack.addOrReplaceChild("rump_r30", CubeListBuilder.create().texOffs(56, 104).addBox(-1.0F, -5.0996F, -5.1219F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5F, 1.6F, 1.7F, 1.5566F, -0.2079F, 0.3124F));

		PartDefinition rump_r31 = bodyBack.addOrReplaceChild("rump_r31", CubeListBuilder.create().texOffs(61, 99).addBox(-1.0F, -2.9925F, -5.1571F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.5F, 1.6F, 1.7F, 1.5217F, -0.2079F, 0.3124F));

		PartDefinition rump_r32 = bodyBack.addOrReplaceChild("rump_r32", CubeListBuilder.create().texOffs(100, 72).addBox(-1.0F, 1.935F, -3.1913F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.5F, 1.6F, 1.7F, 1.2773F, -0.2079F, 0.3124F));

		PartDefinition rump_r33 = bodyBack.addOrReplaceChild("rump_r33", CubeListBuilder.create().texOffs(108, 90).addBox(-1.0F, 2.6795F, 0.4203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.6F, 1.7F, 0.3698F, -0.2079F, 0.3124F));

		PartDefinition rump_r34 = bodyBack.addOrReplaceChild("rump_r34", CubeListBuilder.create().texOffs(101, 89).addBox(-1.0F, -0.6466F, -0.7297F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.2F, 1.6F, 1.7F, 0.7537F, -0.2079F, 0.1815F));

		PartDefinition rump_r35 = bodyBack.addOrReplaceChild("rump_r35", CubeListBuilder.create().texOffs(14, 105).addBox(-0.5F, -1.0907F, 0.2721F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.2486F, 1.5239F, -0.2269F, -0.1745F, 0.1309F));

		PartDefinition tail1 = bodyBack.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, 5.4F, 0.0F, -0.3054F, 0.0F));

		PartDefinition tail5_r1 = tail1.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(33, 115).addBox(0.5F, 0.4129F, -0.1714F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.4F, 8.3F, 0.4974F, 0.0F, 0.0F));

		PartDefinition tail4_r1 = tail1.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(66, 13).addBox(0.5F, -0.0439F, -0.0629F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.4F, 5.8F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail1.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(108, 111).addBox(0.5F, -2.4649F, -1.0012F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 8.8F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail5_r2 = tail1.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(27, 115).addBox(0.5F, -2.5947F, 5.9932F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 115).addBox(0.5F, -2.6947F, 3.9932F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 115).addBox(0.5F, -2.9947F, 1.9932F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 115).addBox(0.5F, -2.9947F, -0.0068F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 110).mirror().addBox(-1.5F, 0.5053F, 7.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 55).mirror().addBox(-1.6F, 0.5053F, 5.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 53).mirror().addBox(-1.7F, 0.5053F, 3.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 110).mirror().addBox(-1.8F, 0.5053F, 1.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 34).mirror().addBox(-2.0F, 0.5053F, -0.0068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 110).addBox(0.5F, 0.5053F, 7.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 55).addBox(0.6F, 0.5053F, 5.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 53).addBox(0.7F, 0.5053F, 3.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 110).addBox(0.8F, 0.5053F, 1.9932F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 57).addBox(0.0F, 0.0053F, -0.0068F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, -0.1484F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(110, 34).addBox(1.0F, 0.5053F, -0.0068F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, -0.1506F, 0.1726F, -0.0261F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.1633F, 8.4496F, 0.0F, 0.3054F, 0.0F));

		PartDefinition tail7_r1 = tail2.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(106, 116).addBox(0.0F, -1.4748F, -0.9672F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 10.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail6_r2 = tail2.addOrReplaceChild("tail6_r2", CubeListBuilder.create().texOffs(117, 17).addBox(0.0F, -1.762F, -0.9467F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 8.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail5_r3 = tail2.addOrReplaceChild("tail5_r3", CubeListBuilder.create().texOffs(117, 13).addBox(0.0F, -1.9319F, -1.0053F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 6.2F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail4_r2 = tail2.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(116, 99).addBox(0.0F, -2.0381F, -0.8867F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 4.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail9_r1 = tail2.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(115, 107).addBox(0.5F, 5.8129F, 7.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(42, 115).addBox(0.5F, 3.9129F, 5.8286F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(39, 115).addBox(0.5F, 2.8129F, 3.8286F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.2367F, -0.1496F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail6_r3 = tail2.addOrReplaceChild("tail6_r3", CubeListBuilder.create().texOffs(36, 115).addBox(0.5F, 0.3056F, -0.1331F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.8367F, 2.2504F, 0.48F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail2.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(30, 115).addBox(0.0F, -2.327F, -0.8471F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail8_r1 = tail2.addOrReplaceChild("tail8_r1", CubeListBuilder.create().texOffs(87, 110).mirror().addBox(-1.7F, 0.6203F, 9.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 110).mirror().addBox(-1.7F, 0.6203F, 7.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 63).mirror().addBox(-1.8F, 0.6203F, 5.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 61).mirror().addBox(-1.8F, 0.6203F, 3.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 110).addBox(-0.3F, 0.6203F, 9.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 110).addBox(-0.3F, 0.6203F, 7.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 63).addBox(-0.2F, 0.6203F, 5.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 61).addBox(-0.2F, 0.6203F, 3.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 57).addBox(-0.1F, 0.6203F, 1.0153F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 45).addBox(-0.5F, 0.1203F, 0.0153F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail4_r3 = tail2.addOrReplaceChild("tail4_r3", CubeListBuilder.create().texOffs(110, 57).mirror().addBox(-1.9F, 0.6203F, 1.0153F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.1965F, -0.2141F, 0.0423F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3543F, 10.0111F, -0.1396F, 0.3927F, 0.0F));

		PartDefinition tail7_r2 = tail3.addOrReplaceChild("tail7_r2", CubeListBuilder.create().texOffs(116, 111).addBox(0.0F, -3.7F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 45).addBox(0.0F, -3.8F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 106).addBox(0.0F, -4.0F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 115).addBox(0.0F, -4.4F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 24).mirror().addBox(-1.1F, -2.5F, 6.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 93).mirror().addBox(-1.2F, -2.5F, 4.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 59).mirror().addBox(-1.3F, -2.5F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 24).addBox(0.1F, -2.5F, 6.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 93).addBox(0.2F, -2.5F, 4.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 59).addBox(0.3F, -2.5F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 28).addBox(0.5F, -2.5F, 0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 19).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail13_r1 = tail3.addOrReplaceChild("tail13_r1", CubeListBuilder.create().texOffs(91, 115).addBox(0.5F, 9.5129F, 15.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(116, 71).addBox(0.5F, 8.6129F, 13.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(116, 9).addBox(0.5F, 7.8129F, 11.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(116, 95).addBox(0.5F, 6.7129F, 9.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.1176F, -10.1607F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail5_r4 = tail3.addOrReplaceChild("tail5_r4", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(-1.5F, -2.5F, 0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, 0.3F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(65, 65).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(117, 21).addBox(0.0F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 26).addBox(0.0F, -0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 29).addBox(0.0F, -0.8F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 32).addBox(0.0F, -0.7F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7824F, 8.9393F, -0.0175F, 0.2182F, 0.0F));

		PartDefinition tail16_r1 = tail4.addOrReplaceChild("tail16_r1", CubeListBuilder.create().texOffs(30, 84).addBox(0.5F, 11.8129F, 21.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(85, 33).addBox(0.5F, 10.9129F, 19.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(61, 95).addBox(0.5F, 10.3129F, 17.8286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.9F, -19.1F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, 7.8654F, 0.0873F, 0.3054F, 0.0F));

		PartDefinition tail5_r5 = tail5.addOrReplaceChild("tail5_r5", CubeListBuilder.create().texOffs(50, 45).addBox(-0.5F, -3.3995F, -0.514F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 3.0523F, 0.5977F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail19_r1 = tail5.addOrReplaceChild("tail19_r1", CubeListBuilder.create().texOffs(117, 41).addBox(0.5F, 14.1129F, 27.8286F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(117, 38).addBox(0.5F, 13.7129F, 25.8286F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(117, 35).addBox(0.5F, 13.3129F, 23.8286F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.8256F, -26.9654F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3477F, 8.7977F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail5_r6 = tail6.addOrReplaceChild("tail5_r6", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -0.5156F, -0.0533F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legBackL3 = bodyBack.addOrReplaceChild("legBackL3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1551F, 4.5722F, 2.5434F, 0.1026F, -0.0051F, -0.006F));

		PartDefinition upperLegBackL_r1 = legBackL3.addOrReplaceChild("upperLegBackL_r1", CubeListBuilder.create().texOffs(15, 84).addBox(-2.2465F, -0.3902F, -10.1991F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.016F))
				.texOffs(0, 79).addBox(-1.2465F, -0.3902F, -7.4991F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(34, 82).addBox(-2.7465F, -0.3902F, -2.4991F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0948F, 0.102F, -0.834F, 0.4363F, -0.6981F, 0.0F));

		PartDefinition upperLegBackL_r2 = legBackL3.addOrReplaceChild("upperLegBackL_r2", CubeListBuilder.create().texOffs(70, 9).addBox(-2.12F, -1.7614F, -6.1327F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9191F, 2.3448F, -0.5073F, 0.3691F, -0.4569F, 0.1222F));

		PartDefinition upperLegBackL_r3 = legBackL3.addOrReplaceChild("upperLegBackL_r3", CubeListBuilder.create().texOffs(87, 73).addBox(0.2204F, -2.0948F, -3.8478F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0965F, 2.7675F, -4.0299F, 0.9821F, -1.171F, -0.6524F));

		PartDefinition legBackLLower3 = legBackL3.addOrReplaceChild("legBackLLower3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8629F, 4.5938F, -7.1683F, -0.3923F, -0.0057F, -0.1308F));

		PartDefinition lowerLegBackL_r1 = legBackLLower3.addOrReplaceChild("lowerLegBackL_r1", CubeListBuilder.create().texOffs(0, 94).addBox(0.0F, -0.5F, -0.4F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(65, 90).addBox(0.0F, -0.5F, -3.4F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0436F, 0.999F, 0.0873F, 0.829F, 0.0F));

		PartDefinition legBackLFoot3 = legBackLLower3.addOrReplaceChild("legBackLFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6311F, 5.4518F, 0.7962F, 0.4726F, -0.3884F, -0.0542F));

		PartDefinition legFrontLFootb_r5 = legBackLFoot3.addOrReplaceChild("legFrontLFootb_r5", CubeListBuilder.create().texOffs(33, 33).addBox(-2.0F, -0.5231F, -9.0F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1729F, -0.538F, -0.2516F, 0.0F, -0.0873F, 0.0F));

		PartDefinition legFrontLFoota_r5 = legBackLFoot3.addOrReplaceChild("legFrontLFoota_r5", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -0.5131F, -9.0F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1729F, -0.538F, -0.2516F, 0.0F, -0.5236F, 0.0F));

		PartDefinition legBackL2 = bodyBack.addOrReplaceChild("legBackL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1551F, 4.5722F, 2.5434F, 0.079F, 0.9138F, 0.0752F));

		PartDefinition upperLegBackL_r4 = legBackL2.addOrReplaceChild("upperLegBackL_r4", CubeListBuilder.create().texOffs(84, 62).addBox(-1.7535F, -0.3902F, -10.1991F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.016F))
				.texOffs(79, 18).addBox(-0.7535F, -0.3902F, -7.4991F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(51, 83).addBox(-2.2535F, -0.3902F, -2.4991F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.0948F, 0.102F, -0.834F, 0.4363F, 0.6981F, 0.0F));

		PartDefinition upperLegBackL_r5 = legBackL2.addOrReplaceChild("upperLegBackL_r5", CubeListBuilder.create().texOffs(71, 37).addBox(0.12F, -1.7614F, -6.1327F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9191F, 2.3448F, -0.5073F, 0.3691F, 0.4569F, -0.1222F));

		PartDefinition upperLegBackL_r6 = legBackL2.addOrReplaceChild("upperLegBackL_r6", CubeListBuilder.create().texOffs(30, 88).addBox(-2.2204F, -2.0948F, -3.8478F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0965F, 2.7675F, -4.0299F, 0.9821F, 1.171F, 0.6524F));

		PartDefinition legBackLLower2 = legBackL2.addOrReplaceChild("legBackLLower2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8629F, 4.5938F, -7.1683F, 0.7854F, 0.0F, 0.0F));

		PartDefinition lowerLegBackL_r2 = legBackLLower2.addOrReplaceChild("lowerLegBackL_r2", CubeListBuilder.create().texOffs(94, 16).addBox(-2.0F, -0.5F, -0.4F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 90).addBox(-2.0F, -0.5F, -3.4F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0436F, 0.999F, 0.0873F, -0.829F, 0.0F));

		PartDefinition legBackLFoot2 = legBackLLower2.addOrReplaceChild("legBackLFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6311F, 5.4518F, 0.7962F, -0.4928F, 0.079F, -0.0687F));

		PartDefinition legFrontLFootb_r6 = legBackLFoot2.addOrReplaceChild("legFrontLFootb_r6", CubeListBuilder.create().texOffs(0, 40).addBox(-2.0F, -0.5231F, -9.0F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1729F, -0.538F, -0.2516F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legFrontLFoota_r6 = legBackLFoot2.addOrReplaceChild("legFrontLFoota_r6", CubeListBuilder.create().texOffs(29, 21).addBox(-3.0F, -0.5131F, -9.0F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1729F, -0.538F, -0.2516F, 0.0F, 0.5236F, 0.0F));

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