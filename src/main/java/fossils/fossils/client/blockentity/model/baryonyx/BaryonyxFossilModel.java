package fossils.fossils.client.blockentity.model.baryonyx;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BaryonyxFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart rightthigh;
	private final ModelPart rightshin;
	private final ModelPart rightankle;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart leftthigh;
	private final ModelPart leftshin;
	private final ModelPart leftankle;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart leftfingers;
	private final ModelPart leftclaw;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart rightfingers;
	private final ModelPart rightclaw;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftAngularSurangular;
	private final ModelPart leftDentary;
	private final ModelPart rightAngularSurangular;
	private final ModelPart rightDentary;

	public BaryonyxFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.rightthigh = this.hips.getChild("rightthigh");
		this.rightshin = this.rightthigh.getChild("rightshin");
		this.rightankle = this.rightshin.getChild("rightankle");
		this.rightfoot = this.rightankle.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.leftthigh = this.hips.getChild("leftthigh");
		this.leftshin = this.leftthigh.getChild("leftshin");
		this.leftankle = this.leftshin.getChild("leftankle");
		this.leftfoot = this.leftankle.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.leftfingers = this.lefthand.getChild("leftfingers");
		this.leftclaw = this.lefthand.getChild("leftclaw");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.rightfingers = this.righthand.getChild("rightfingers");
		this.rightclaw = this.righthand.getChild("rightclaw");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftAngularSurangular = this.jaw.getChild("leftAngularSurangular");
		this.leftDentary = this.leftAngularSurangular.getChild("leftDentary");
		this.rightAngularSurangular = this.jaw.getChild("rightAngularSurangular");
		this.rightDentary = this.rightAngularSurangular.getChild("rightDentary");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.9882F, 4.6534F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r1 = hips.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(39, 55).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5342F, -5.2121F, -0.136F, 0.0143F, -0.5809F));

		PartDefinition bodymiddle_r2 = hips.addOrReplaceChild("bodymiddle_r2", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5342F, -5.2121F, -0.1325F, -0.032F, -0.9709F));

		PartDefinition bodymiddle_r3 = hips.addOrReplaceChild("bodymiddle_r3", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(-4.8588F, -3.0866F, -0.7988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5342F, -5.2121F, -0.099F, -0.0939F, -1.4919F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.7561F, -0.8491F, -1.6887F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9438F, 4.9352F, 3.6955F, 1.2514F, 0.1713F, -0.288F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.7561F, -0.8491F, -0.3887F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9438F, 4.9352F, 3.6955F, 0.6754F, 0.1713F, -0.288F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(0.9F, 0.2F, -1.6F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 60).addBox(4.1F, 0.2F, -1.6F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0082F, 1.3466F, -0.1222F, 0.0F, 0.0F));

		PartDefinition hips_r4 = hips.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-0.7561F, -0.5491F, -0.8887F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9438F, 4.9352F, 3.6955F, 0.85F, 0.1713F, -0.288F));

		PartDefinition hips_r5 = hips.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.2959F, -4.4647F, -3.6093F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 5.0082F, 1.3466F, -0.1211F, -0.0159F, -0.1299F));

		PartDefinition hips_r6 = hips.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(0.1038F, -0.7849F, -0.8009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, -0.2096F, -0.0433F, 0.4417F));

		PartDefinition hips_r7 = hips.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(91, 81).mirror().addBox(0.0383F, -6.0105F, -0.2984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, -1.4927F, -0.0311F, 0.4669F));

		PartDefinition hips_r8 = hips.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(49, 60).mirror().addBox(0.1092F, -3.9417F, 2.5703F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, -0.5936F, -0.043F, 0.4439F));

		PartDefinition hips_r9 = hips.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(0.1045F, 0.0735F, -0.9201F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, -0.0351F, -0.0431F, 0.4432F));

		PartDefinition hips_r10 = hips.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(0.1262F, -3.3727F, -1.7504F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, -0.4014F, -0.0436F, 0.4356F));

		PartDefinition hips_r11 = hips.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(76, 9).mirror().addBox(1.5527F, -6.6419F, -8.258F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, 0.4576F, 0.2227F, 0.3923F));

		PartDefinition hips_r12 = hips.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(34, 55).mirror().addBox(1.439F, -4.8049F, -9.1141F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, 0.2457F, 0.2266F, 0.4484F));

		PartDefinition hips_r13 = hips.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(1.5026F, -4.6541F, -7.7813F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, 0.6444F, 0.2266F, 0.4243F));

		PartDefinition hips_r14 = hips.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(70, 51).mirror().addBox(1.5282F, -5.0112F, -6.9501F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, 0.189F, 0.2254F, 0.4102F));

		PartDefinition hips_r15 = hips.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(0.1F, -3.7509F, -4.7703F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, -0.1396F, 0.0F, 0.4363F));

		PartDefinition hips_r16 = hips.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(42, 21).mirror().addBox(0.1F, -1.7856F, -4.9747F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 21).mirror().addBox(0.1F, -0.9856F, -4.9747F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 0.0082F, 4.7466F, -0.1222F, 0.0F, 0.4363F));

		PartDefinition hips_r17 = hips.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(0, 18).addBox(-0.7041F, -4.4647F, -3.6093F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 5.0082F, 1.3466F, -0.1211F, 0.0159F, 0.1299F));

		PartDefinition hips_r18 = hips.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(85, 39).mirror().addBox(0.1566F, -13.4859F, -6.5835F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2763F, 16.6674F, -6.7688F, -0.8499F, -0.0499F, -0.1849F));

		PartDefinition hips_r19 = hips.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(85, 11).mirror().addBox(-0.2494F, -3.0187F, -0.734F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.486F, 4.2453F, -2.4798F, -0.7133F, 0.0704F, -0.149F));

		PartDefinition hips_r20 = hips.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(1.1055F, -13.4044F, 1.6188F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7263F, 16.6674F, -6.7688F, -0.1554F, -0.0248F, -0.2404F));

		PartDefinition hips_r21 = hips.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(47, 67).mirror().addBox(0.2698F, -2.8553F, -12.084F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2763F, 16.6674F, -6.7688F, -1.7475F, -0.1333F, -0.1565F));

		PartDefinition hips_r22 = hips.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(0.1727F, -11.9879F, -0.5471F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2763F, 16.6674F, -6.7688F, -0.3773F, -0.0621F, -0.1821F));

		PartDefinition hips_r23 = hips.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(0.1727F, -7.8029F, -1.725F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2763F, 16.6674F, -6.7688F, -0.5518F, -0.0621F, -0.1821F));

		PartDefinition hips_r24 = hips.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(0.1727F, -7.63F, -1.5108F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2763F, 16.6674F, -6.7688F, -0.6391F, -0.0621F, -0.1821F));

		PartDefinition hips_r25 = hips.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(85, 11).addBox(-0.7506F, -3.0187F, -0.734F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.486F, 4.2453F, -2.4798F, -0.7133F, -0.0704F, 0.149F));

		PartDefinition hips_r26 = hips.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(88, 85).addBox(-1.1727F, -11.9879F, -0.5471F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2763F, 16.6674F, -6.7688F, -0.3773F, 0.0621F, 0.1821F));

		PartDefinition hips_r27 = hips.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(34, 55).addBox(-2.439F, -4.8049F, -9.1141F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, 0.2457F, -0.2266F, -0.4484F));

		PartDefinition hips_r28 = hips.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(0, 65).addBox(-2.5026F, -4.6541F, -7.7813F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, 0.6444F, -0.2266F, -0.4243F));

		PartDefinition hips_r29 = hips.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(76, 9).addBox(-2.5527F, -6.6419F, -8.258F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, 0.4576F, -0.2227F, -0.3923F));

		PartDefinition hips_r30 = hips.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(70, 51).addBox(-2.5282F, -5.0112F, -6.9501F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, 0.189F, -0.2254F, -0.4102F));

		PartDefinition hips_r31 = hips.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(0, 73).addBox(-1.1F, -3.7509F, -4.7703F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, -0.1396F, 0.0F, -0.4363F));

		PartDefinition hips_r32 = hips.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(91, 75).addBox(-2.1055F, -13.4044F, 1.6188F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7263F, 16.6674F, -6.7688F, -0.1554F, 0.0248F, 0.2404F));

		PartDefinition hips_r33 = hips.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(85, 39).addBox(-1.1566F, -13.4859F, -6.5835F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2763F, 16.6674F, -6.7688F, -0.8499F, 0.0499F, 0.1849F));

		PartDefinition hips_r34 = hips.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(35, 59).addBox(-1.1045F, 0.0735F, -0.9201F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, -0.0351F, 0.0431F, -0.4432F));

		PartDefinition hips_r35 = hips.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(63, 61).addBox(-1.1038F, -0.7849F, -0.8009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, -0.2096F, 0.0433F, -0.4417F));

		PartDefinition hips_r36 = hips.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(49, 60).addBox(-1.1092F, -3.9417F, 2.5703F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, -0.5936F, 0.043F, -0.4439F));

		PartDefinition hips_r37 = hips.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(35, 0).addBox(-1.1262F, -3.3727F, -1.7504F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, -0.4014F, 0.0436F, -0.4356F));

		PartDefinition hips_r38 = hips.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(42, 21).addBox(-1.1F, -0.9856F, -4.9747F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(42, 21).addBox(-1.1F, -1.7856F, -4.9747F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, -0.1222F, 0.0F, -0.4363F));

		PartDefinition hips_r39 = hips.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(91, 81).addBox(-1.0383F, -6.0105F, -0.2984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.2F, 0.0082F, 4.7466F, -1.4927F, 0.0311F, -0.4669F));

		PartDefinition hips_r40 = hips.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(68, 0).addBox(-0.2439F, -0.8491F, -1.6887F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9438F, 4.9352F, 3.6955F, 1.2514F, -0.1713F, 0.288F));

		PartDefinition bodymiddle_r4 = hips.addOrReplaceChild("bodymiddle_r4", CubeListBuilder.create().texOffs(41, 57).addBox(3.8588F, -3.0866F, -0.7988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5342F, -5.2121F, -0.099F, 0.0939F, 1.4919F));

		PartDefinition bodymiddle_r5 = hips.addOrReplaceChild("bodymiddle_r5", CubeListBuilder.create().texOffs(54, 16).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5342F, -5.2121F, -0.1325F, 0.032F, 0.9709F));

		PartDefinition bodymiddle_r6 = hips.addOrReplaceChild("bodymiddle_r6", CubeListBuilder.create().texOffs(39, 55).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5342F, -5.2121F, -0.136F, -0.0143F, 0.5809F));

		PartDefinition hips_r41 = hips.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(76, 0).addBox(-0.2439F, -0.8491F, -0.3887F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9438F, 4.9352F, 3.6955F, 0.6754F, -0.1713F, 0.288F));

		PartDefinition hips_r42 = hips.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(87, 62).addBox(-0.2439F, -0.5491F, -0.8887F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9438F, 4.9352F, 3.6955F, 0.85F, -0.1713F, 0.288F));

		PartDefinition hips_r43 = hips.addOrReplaceChild("hips_r43", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.1827F, 4.3791F, -0.6371F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9438F, 4.9352F, 3.6955F, 0.8087F, 0.039F, -0.2286F));

		PartDefinition hips_r44 = hips.addOrReplaceChild("hips_r44", CubeListBuilder.create().texOffs(0, 18).addBox(-0.8173F, 4.3791F, -0.6371F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9438F, 4.9352F, 3.6955F, 0.8087F, -0.039F, 0.2286F));

		PartDefinition hips_r45 = hips.addOrReplaceChild("hips_r45", CubeListBuilder.create().texOffs(50, 81).addBox(-1.1727F, -7.8029F, -1.725F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2763F, 16.6674F, -6.7688F, -0.5518F, 0.0621F, 0.1821F));

		PartDefinition hips_r46 = hips.addOrReplaceChild("hips_r46", CubeListBuilder.create().texOffs(47, 67).addBox(-1.2698F, -2.8553F, -12.084F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2763F, 16.6674F, -6.7688F, -1.7475F, 0.1333F, 0.1565F));

		PartDefinition hips_r47 = hips.addOrReplaceChild("hips_r47", CubeListBuilder.create().texOffs(25, 81).addBox(-1.1727F, -7.63F, -1.5108F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2763F, 16.6674F, -6.7688F, -0.6391F, 0.0621F, 0.1821F));

		PartDefinition hips_r48 = hips.addOrReplaceChild("hips_r48", CubeListBuilder.create().texOffs(88, 55).addBox(-0.5668F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0668F, 15.5808F, -7.3445F, -0.6069F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -0.4F, -0.1F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -6.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 81).addBox(-1.0F, -5.2214F, -0.0136F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, 7.4F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(49, 43).addBox(-1.0F, -0.6408F, 0.1683F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.2F, -3.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 86).addBox(-1.0F, -5.0F, -0.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -6.2F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create().texOffs(44, 74).addBox(-1.0117F, -1.7658F, -2.0091F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.0F, 2.5082F, 1.9466F, 0.0322F, -0.0153F, 0.0899F));

		PartDefinition rightthigh_r1 = rightthigh.addOrReplaceChild("rightthigh_r1", CubeListBuilder.create().texOffs(26, 66).addBox(-1.0F, 4.0634F, -1.5978F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 6.7721F, -2.1336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightthigh_r2 = rightthigh.addOrReplaceChild("rightthigh_r2", CubeListBuilder.create().texOffs(69, 79).addBox(-0.6057F, -0.7616F, -0.8311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightthigh_r3 = rightthigh.addOrReplaceChild("rightthigh_r3", CubeListBuilder.create().texOffs(78, 65).addBox(-1.0243F, -4.5488F, -0.2813F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0098F, 11.2721F, -2.5336F, -0.0613F, 0.0092F, 0.0003F));

		PartDefinition rightthigh_r4 = rightthigh.addOrReplaceChild("rightthigh_r4", CubeListBuilder.create().texOffs(69, 69).addBox(-1.0971F, -0.3977F, -1.5327F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0941F, 0.8756F, 0.5047F, -0.2533F, 0.0092F, 0.0003F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create().texOffs(21, 18).addBox(-1.5134F, 3.0449F, 0.1212F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 40).addBox(-1.5134F, 0.0449F, -0.8788F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2618F, 13.8892F, -1.4228F, 1.0142F, 0.0F, 0.0424F));

		PartDefinition rightshin_r1 = rightshin.addOrReplaceChild("rightshin_r1", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(55, 74).addBox(-0.5F, 1.5F, -0.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2866F, 0.5449F, 1.2212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create().texOffs(48, 40).addBox(-1.471F, -0.3276F, -1.3743F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0524F, 14.1142F, 1.2396F, -0.7655F, -0.0605F, -0.0629F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(60, 44).addBox(-1.971F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4743F, -0.8039F, 0.8467F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(60, 36).addBox(-2.471F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6962F, -2.1762F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create().texOffs(22, 74).addBox(-0.9883F, -1.7658F, -2.0091F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.0F, 2.5082F, 1.9466F, -0.444F, -0.0454F, -0.0772F));

		PartDefinition leftthigh_r1 = leftthigh.addOrReplaceChild("leftthigh_r1", CubeListBuilder.create().texOffs(13, 65).addBox(-1.0F, 4.0634F, -1.5978F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0098F, 6.7721F, -2.1336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftthigh_r2 = leftthigh.addOrReplaceChild("leftthigh_r2", CubeListBuilder.create().texOffs(30, 19).addBox(-0.3943F, -0.7616F, -0.8311F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftthigh_r3 = leftthigh.addOrReplaceChild("leftthigh_r3", CubeListBuilder.create().texOffs(77, 44).addBox(-0.9757F, -4.5488F, -0.2813F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0098F, 11.2721F, -2.5336F, -0.0613F, -0.0092F, -0.0003F));

		PartDefinition leftthigh_r4 = leftthigh.addOrReplaceChild("leftthigh_r4", CubeListBuilder.create().texOffs(60, 69).addBox(-0.9029F, -0.3977F, -1.5327F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0941F, 0.8756F, 0.5047F, -0.2533F, -0.0092F, -0.0003F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4866F, 3.0449F, 0.1212F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(-0.4866F, 0.0449F, -0.8788F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2618F, 13.8892F, -1.4228F, 0.7952F, -0.0405F, -0.0027F));

		PartDefinition leftshin_r1 = leftshin.addOrReplaceChild("leftshin_r1", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.3F, -1.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(9, 0).addBox(-0.5F, 1.5F, -0.1F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2866F, 0.5449F, 1.2212F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create().texOffs(34, 40).addBox(-1.529F, -0.3276F, -1.3743F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0524F, 14.1142F, 1.2396F, -0.6783F, 0.0548F, 0.0679F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(14, 55).addBox(-2.029F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4743F, -0.8039F, 0.2794F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(58, 21).addBox(-2.529F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5559F, 9.5933F, 0.0054F, -0.1753F, -0.1299F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 92).addBox(0.0F, 2.5727F, 3.8126F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 93).addBox(0.0F, 1.2727F, 1.8126F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 96).addBox(0.0F, -0.2273F, -0.1874F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0646F, 0.4663F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 86).addBox(0.0F, -4.5771F, 2.9508F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 86).addBox(0.0F, -4.5771F, -0.0492F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0485F, 3.7448F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 86).addBox(0.0F, -4.9419F, 0.2064F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6485F, 0.5448F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, 2.7F, 1.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6485F, -1.2552F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6211F, 8.2251F, 0.0669F, 0.0063F, -0.0863F));

		PartDefinition cube_r9 = tail2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 22).addBox(0.0F, -4.9878F, 10.0442F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(86, 45).addBox(0.0F, -4.6878F, 7.0442F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 86).addBox(0.0F, -4.5878F, 4.0442F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(83, 84).addBox(0.0F, -4.4878F, 1.0442F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6306F, -0.0296F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 4).addBox(0.0F, 1.2368F, 5.3516F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 87).addBox(0.0F, 0.9368F, 3.3516F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 17).addBox(0.0F, 0.6368F, 1.3516F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 28).addBox(0.0F, 0.0368F, -0.6484F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1487F, 5.9168F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(95, 95).addBox(0.0F, 0.1338F, -0.6251F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9487F, 3.8168F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 96).addBox(0.0F, 0.0512F, -0.384F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9487F, 1.5168F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 53).addBox(0.0F, 0.0596F, -0.6783F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4319F, -0.5087F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.2F, -9.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2694F, 8.9704F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 22).addBox(-1.0F, -0.7F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.131F, 12.8007F, -0.0214F, -0.131F, 0.0021F));

		PartDefinition cube_r15 = tail3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 97).addBox(0.5F, -2.2198F, -0.2155F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3328F, 13.9964F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(2, 98).addBox(0.5F, -5.3035F, 10.3864F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 93).addBox(0.5F, -4.9553F, 8.5796F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 93).addBox(0.5F, -4.5601F, 6.7184F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 94).addBox(0.5F, -3.9894F, 4.8409F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 94).addBox(0.5F, -3.5153F, 2.9375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 94).addBox(0.5F, -3.1153F, 0.9375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 93).addBox(0.5F, -2.6705F, -0.8435F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 51).addBox(0.0F, 3.3368F, 19.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(0.0F, 3.0368F, 17.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 44).addBox(0.0F, 2.8368F, 15.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 35).addBox(0.0F, 2.7368F, 13.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 97).addBox(0.0F, 2.4368F, 11.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 94).addBox(0.0F, 1.4368F, 9.3516F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 94).addBox(0.0F, 1.2368F, 7.3516F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0177F, -6.9839F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.083F, 15.1036F, 0.02F, 0.1768F, -0.0824F));

		PartDefinition cube_r18 = tail4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(81, 17).addBox(0.0F, -1.9402F, 9.9197F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 98).addBox(0.0F, -1.8402F, 7.9197F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 98).addBox(0.0F, -1.8402F, 5.9197F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 98).addBox(0.0F, -1.8402F, 3.9197F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 83).addBox(0.0F, -1.7402F, 1.9197F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 93).addBox(0.0F, -1.6402F, -0.0803F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5683F, 0.8654F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(61, 36).addBox(0.0F, 6.5368F, 33.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 59).addBox(0.0F, 6.1368F, 31.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 37).addBox(0.0F, 4.7368F, 29.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 40).addBox(0.0F, 4.4368F, 27.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 55).addBox(0.0F, 4.0368F, 25.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 0).addBox(0.0F, 3.7368F, 23.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 44).addBox(0.0F, 3.4368F, 21.3516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1006F, -22.0875F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(42, 21).addBox(0.5F, -5.0F, -9.4F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.1974F, 8.7124F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.031F, 12.7266F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail5.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 74).addBox(0.5F, -2.5F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 74).addBox(0.5F, -2.7F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 26).addBox(0.5F, -2.8F, -8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 81).addBox(0.5F, -2.9F, -10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 0).addBox(0.5F, -2.9F, -12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 40).addBox(0.0F, -2.0F, -12.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0904F, 11.1196F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(6, 53).addBox(0.0F, 9.4368F, 41.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 36).addBox(0.0F, 8.5368F, 39.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 29).addBox(0.0F, 7.8368F, 37.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 9).addBox(0.0F, 7.1368F, 35.3516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0696F, -34.8142F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5454F, 10.1141F, -0.0477F, 0.2074F, 0.377F));

		PartDefinition cube_r23 = tail6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 40).addBox(-0.5F, -1.4F, -5.7F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8282F, 5.135F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0501F, -6.5075F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(63, 85).addBox(0.0F, -4.548F, 0.0009F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4499F, -5.6925F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 86).addBox(0.0F, -4.8231F, -0.0008F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5499F, -2.6925F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(58, 85).addBox(0.0F, -4.2647F, 0.0084F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -8.6925F, -0.0262F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r7 = body.addOrReplaceChild("bodymiddle_r7", CubeListBuilder.create().texOffs(66, 15).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -1.2047F, -0.1202F, 0.217F, -0.466F));

		PartDefinition bodymiddle_r8 = body.addOrReplaceChild("bodymiddle_r8", CubeListBuilder.create().texOffs(60, 51).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -1.2047F, -0.1956F, 0.1613F, -0.862F));

		PartDefinition bodymiddle_r9 = body.addOrReplaceChild("bodymiddle_r9", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-6.8588F, -3.0866F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -1.2047F, -0.2493F, 0.0431F, -1.3751F));

		PartDefinition bodymiddle_r10 = body.addOrReplaceChild("bodymiddle_r10", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4843F, -4.2047F, -0.0818F, 0.2245F, -0.8587F));

		PartDefinition bodymiddle_r11 = body.addOrReplaceChild("bodymiddle_r11", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(-8.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4843F, -4.2047F, -0.1834F, 0.1536F, -1.3872F));

		PartDefinition bodymiddle_r12 = body.addOrReplaceChild("bodymiddle_r12", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4843F, -4.2047F, 0.0106F, 0.2317F, -0.4555F));

		PartDefinition bodymiddle_r13 = body.addOrReplaceChild("bodymiddle_r13", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-10.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -7.2047F, -0.0285F, 0.2481F, -1.3643F));

		PartDefinition bodymiddle_r14 = body.addOrReplaceChild("bodymiddle_r14", CubeListBuilder.create().texOffs(8, 65).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -7.2047F, 0.1017F, 0.2284F, -0.8254F));

		PartDefinition bodymiddle_r15 = body.addOrReplaceChild("bodymiddle_r15", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -7.2047F, 0.1802F, 0.1657F, -0.43F));

		PartDefinition bodymiddle_r16 = body.addOrReplaceChild("bodymiddle_r16", CubeListBuilder.create().texOffs(43, 2).mirror().addBox(-10.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -10.2047F, -0.0076F, 0.342F, -1.3582F));

		PartDefinition bodymiddle_r17 = body.addOrReplaceChild("bodymiddle_r17", CubeListBuilder.create().texOffs(8, 67).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -10.2047F, 0.1698F, 0.2984F, -0.8077F));

		PartDefinition bodymiddle_r18 = body.addOrReplaceChild("bodymiddle_r18", CubeListBuilder.create().texOffs(77, 7).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -10.2047F, 0.2693F, 0.205F, -0.4135F));

		PartDefinition bodymiddle_r19 = body.addOrReplaceChild("bodymiddle_r19", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -12.7047F, 0.302F, 0.2189F, -0.4066F));

		PartDefinition bodymiddle_r20 = body.addOrReplaceChild("bodymiddle_r20", CubeListBuilder.create().texOffs(68, 7).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -12.7047F, 0.1952F, 0.3236F, -0.7999F));

		PartDefinition bodymiddle_r21 = body.addOrReplaceChild("bodymiddle_r21", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-10.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5843F, -12.7047F, 0.0003F, 0.3761F, -1.3554F));

		PartDefinition bodymiddle_r22 = body.addOrReplaceChild("bodymiddle_r22", CubeListBuilder.create().texOffs(7, 75).addBox(3.8588F, -3.0866F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -1.2047F, -0.0781F, -0.0087F, 1.3707F));

		PartDefinition bodymiddle_r23 = body.addOrReplaceChild("bodymiddle_r23", CubeListBuilder.create().texOffs(60, 51).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -1.2047F, -0.0633F, -0.0466F, 0.8482F));

		PartDefinition bodymiddle_r24 = body.addOrReplaceChild("bodymiddle_r24", CubeListBuilder.create().texOffs(66, 15).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -1.2047F, -0.042F, -0.0606F, 0.4552F));

		PartDefinition bodymiddle_r25 = body.addOrReplaceChild("bodymiddle_r25", CubeListBuilder.create().texOffs(67, 31).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4843F, -4.2047F, 0.0684F, -0.1138F, 0.4455F));

		PartDefinition bodymiddle_r26 = body.addOrReplaceChild("bodymiddle_r26", CubeListBuilder.create().texOffs(18, 48).addBox(3.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4843F, -4.2047F, -0.0537F, -0.1285F, 1.369F));

		PartDefinition bodymiddle_r27 = body.addOrReplaceChild("bodymiddle_r27", CubeListBuilder.create().texOffs(64, 29).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4843F, -4.2047F, 0.0182F, -0.138F, 0.8407F));

		PartDefinition bodymiddle_r28 = body.addOrReplaceChild("bodymiddle_r28", CubeListBuilder.create().texOffs(72, 65).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -7.2047F, 0.1802F, -0.1657F, 0.43F));

		PartDefinition bodymiddle_r29 = body.addOrReplaceChild("bodymiddle_r29", CubeListBuilder.create().texOffs(8, 65).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -7.2047F, 0.1017F, -0.2284F, 0.8254F));

		PartDefinition bodymiddle_r30 = body.addOrReplaceChild("bodymiddle_r30", CubeListBuilder.create().texOffs(43, 0).addBox(3.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -7.2047F, -0.0285F, -0.2481F, 1.3643F));

		PartDefinition bodymiddle_r31 = body.addOrReplaceChild("bodymiddle_r31", CubeListBuilder.create().texOffs(77, 7).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -10.2047F, 0.2693F, -0.205F, 0.4135F));

		PartDefinition bodymiddle_r32 = body.addOrReplaceChild("bodymiddle_r32", CubeListBuilder.create().texOffs(8, 67).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -10.2047F, 0.1698F, -0.2984F, 0.8077F));

		PartDefinition bodymiddle_r33 = body.addOrReplaceChild("bodymiddle_r33", CubeListBuilder.create().texOffs(43, 2).addBox(3.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -10.2047F, -0.0076F, -0.342F, 1.3582F));

		PartDefinition bodymiddle_r34 = body.addOrReplaceChild("bodymiddle_r34", CubeListBuilder.create().texOffs(54, 12).addBox(3.8588F, -3.0866F, -0.7988F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -12.7047F, 0.0003F, -0.3761F, 1.3554F));

		PartDefinition bodymiddle_r35 = body.addOrReplaceChild("bodymiddle_r35", CubeListBuilder.create().texOffs(68, 7).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -12.7047F, 0.1952F, -0.3236F, 0.7999F));

		PartDefinition bodymiddle_r36 = body.addOrReplaceChild("bodymiddle_r36", CubeListBuilder.create().texOffs(77, 52).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5843F, -12.7047F, 0.302F, -0.2189F, 0.4066F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(87, 69).addBox(0.0F, -3.7815F, 0.0028F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -11.6925F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(96, 75).addBox(0.0F, -3.0594F, -0.001F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -13.6925F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.6869F, -13.7431F, 10.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.5616F, -1.9491F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 4).addBox(-1.0F, -0.0594F, -0.001F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -13.6925F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6382F, -13.6459F, 0.0528F, -0.1307F, -0.0069F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(96, 89).addBox(1.0F, -2.8704F, -0.106F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3F, -1.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 97).addBox(1.0F, -2.6382F, 0.0151F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -4.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(90, 96).addBox(1.0F, -5.5F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 0).addBox(0.0F, -3.1F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.1F, -4.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(97, 8).addBox(1.0F, -2.4038F, 0.0753F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7F, -8.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = chest.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(-0.0254F, -0.0296F, 0.019F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 7.7005F, -5.8712F, 2.0869F, -0.2217F, -1.3947F));

		PartDefinition bodyfront_r2 = chest.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(0.0299F, -0.0861F, 0.0716F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 7.7005F, -5.8712F, 2.0337F, -0.2253F, -1.4459F));

		PartDefinition bodyfront_r3 = chest.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(46, 54).mirror().addBox(0.0844F, 0.0627F, -0.4729F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 7.7005F, -5.8712F, 2.0398F, -0.2085F, -1.4625F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(18, 81).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4694F, 6.7282F, -6.9732F, 1.2721F, -0.4842F, -1.02F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.3F, -2.5F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1544F, 4.5754F, -6.5933F, 1.0716F, -0.352F, -0.5639F));

		PartDefinition bodyfront_r6 = chest.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(23, 55).mirror().addBox(-4.0F, -0.2584F, -0.2592F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 55).addBox(5.2F, -0.2584F, -0.2592F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 3.4586F, -6.847F, 0.829F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r37 = chest.addOrReplaceChild("bodymiddle_r37", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-5.8588F, -3.0866F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.046F, -7.0588F, 0.0582F, 0.4589F, -1.5896F));

		PartDefinition bodymiddle_r38 = chest.addOrReplaceChild("bodymiddle_r38", CubeListBuilder.create().texOffs(68, 19).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.046F, -7.0588F, 0.2896F, 0.3657F, -1.0257F));

		PartDefinition bodymiddle_r39 = chest.addOrReplaceChild("bodymiddle_r39", CubeListBuilder.create().texOffs(92, 13).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.046F, -7.0588F, 0.4026F, 0.2242F, -0.6422F));

		PartDefinition bodymiddle_r40 = chest.addOrReplaceChild("bodymiddle_r40", CubeListBuilder.create().texOffs(34, 49).mirror().addBox(-7.8588F, -3.0866F, -0.7988F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.946F, -5.0588F, 0.0291F, 0.4251F, -1.4824F));

		PartDefinition bodymiddle_r41 = chest.addOrReplaceChild("bodymiddle_r41", CubeListBuilder.create().texOffs(42, 68).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.946F, -5.0588F, 0.2466F, 0.3511F, -0.9211F));

		PartDefinition bodymiddle_r42 = chest.addOrReplaceChild("bodymiddle_r42", CubeListBuilder.create().texOffs(92, 15).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.946F, -5.0588F, 0.3587F, 0.2259F, -0.5324F));

		PartDefinition bodymiddle_r43 = chest.addOrReplaceChild("bodymiddle_r43", CubeListBuilder.create().texOffs(54, 14).mirror().addBox(-8.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.546F, -3.0588F, 0.0051F, 0.3752F, -1.4059F));

		PartDefinition bodymiddle_r44 = chest.addOrReplaceChild("bodymiddle_r44", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.546F, -3.0588F, 0.1987F, 0.3204F, -0.851F));

		PartDefinition bodymiddle_r45 = chest.addOrReplaceChild("bodymiddle_r45", CubeListBuilder.create().texOffs(92, 35).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.546F, -3.0588F, 0.3039F, 0.2147F, -0.4585F));

		PartDefinition bodymiddle_r46 = chest.addOrReplaceChild("bodymiddle_r46", CubeListBuilder.create().texOffs(92, 41).mirror().addBox(-2.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -1.0588F, 0.2693F, 0.205F, -0.4135F));

		PartDefinition bodymiddle_r47 = chest.addOrReplaceChild("bodymiddle_r47", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-4.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -1.0588F, 0.1698F, 0.2984F, -0.8077F));

		PartDefinition bodymiddle_r48 = chest.addOrReplaceChild("bodymiddle_r48", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-9.8588F, -3.0866F, -0.7988F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -1.0588F, -0.0076F, 0.342F, -1.3582F));

		PartDefinition bodymiddle_r49 = chest.addOrReplaceChild("bodymiddle_r49", CubeListBuilder.create().texOffs(92, 13).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.046F, -7.0588F, 0.4026F, -0.2242F, 0.6422F));

		PartDefinition bodymiddle_r50 = chest.addOrReplaceChild("bodymiddle_r50", CubeListBuilder.create().texOffs(68, 19).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.046F, -7.0588F, 0.2896F, -0.3657F, 1.0257F));

		PartDefinition bodymiddle_r51 = chest.addOrReplaceChild("bodymiddle_r51", CubeListBuilder.create().texOffs(92, 43).addBox(3.8588F, -3.0866F, -0.7988F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.046F, -7.0588F, 0.0582F, -0.4589F, 1.5896F));

		PartDefinition bodymiddle_r52 = chest.addOrReplaceChild("bodymiddle_r52", CubeListBuilder.create().texOffs(92, 15).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.946F, -5.0588F, 0.3587F, -0.2259F, 0.5324F));

		PartDefinition bodymiddle_r53 = chest.addOrReplaceChild("bodymiddle_r53", CubeListBuilder.create().texOffs(42, 68).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.946F, -5.0588F, 0.2466F, -0.3511F, 0.9211F));

		PartDefinition bodymiddle_r54 = chest.addOrReplaceChild("bodymiddle_r54", CubeListBuilder.create().texOffs(34, 49).addBox(3.8588F, -3.0866F, -0.7988F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.946F, -5.0588F, 0.0291F, -0.4251F, 1.4824F));

		PartDefinition bodymiddle_r55 = chest.addOrReplaceChild("bodymiddle_r55", CubeListBuilder.create().texOffs(92, 35).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.546F, -3.0588F, 0.3039F, -0.2147F, 0.4585F));

		PartDefinition bodymiddle_r56 = chest.addOrReplaceChild("bodymiddle_r56", CubeListBuilder.create().texOffs(42, 70).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.546F, -3.0588F, 0.1987F, -0.3204F, 0.851F));

		PartDefinition bodymiddle_r57 = chest.addOrReplaceChild("bodymiddle_r57", CubeListBuilder.create().texOffs(54, 14).addBox(3.8588F, -3.0866F, -0.7988F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.546F, -3.0588F, 0.0051F, -0.3752F, 1.4059F));

		PartDefinition bodymiddle_r58 = chest.addOrReplaceChild("bodymiddle_r58", CubeListBuilder.create().texOffs(0, 32).addBox(3.8588F, -3.0866F, -0.7988F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -1.0588F, -0.0076F, -0.342F, 1.3582F));

		PartDefinition bodymiddle_r59 = chest.addOrReplaceChild("bodymiddle_r59", CubeListBuilder.create().texOffs(7, 73).addBox(1.8852F, -0.7437F, -0.7988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -1.0588F, 0.1698F, -0.2984F, 0.8077F));

		PartDefinition bodymiddle_r60 = chest.addOrReplaceChild("bodymiddle_r60", CubeListBuilder.create().texOffs(92, 41).addBox(0.0282F, 0.0346F, -0.7852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -1.0588F, 0.2693F, -0.205F, 0.4135F));

		PartDefinition bodyfront_r7 = chest.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(0, 53).addBox(-0.7F, -2.5F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1544F, 4.5754F, -6.5933F, 1.0716F, 0.352F, 0.5639F));

		PartDefinition bodyfront_r8 = chest.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(18, 81).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4694F, 6.7282F, -6.9732F, 1.2721F, 0.4842F, 1.02F));

		PartDefinition bodyfront_r9 = chest.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(46, 54).addBox(-0.0844F, 0.0627F, -0.4729F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3089F, 7.7005F, -5.8712F, 2.0398F, 0.2085F, 1.4625F));

		PartDefinition bodyfront_r10 = chest.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(47, 86).addBox(-0.0299F, -0.0861F, 0.0716F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3089F, 7.7005F, -5.8712F, 2.0337F, 0.2253F, 1.4459F));

		PartDefinition bodyfront_r11 = chest.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(18, 37).addBox(0.0254F, -0.0296F, 0.019F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3089F, 7.7005F, -5.8712F, 2.0869F, 0.2217F, 1.3947F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8967F, 6.3379F, -5.3737F, -0.6554F, -0.0405F, -0.2632F));

		PartDefinition cube_r35 = leftarm.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 21).addBox(-0.7399F, 0.0255F, -0.2487F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, 2.0924F, 1.1316F, 1.3958F, 0.0357F, -0.025F));

		PartDefinition cube_r36 = leftarm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(64, 60).addBox(-0.8532F, -0.2766F, -0.1556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0076F, -0.5684F, 0.6453F, 0.0357F, -0.025F));

		PartDefinition cube_r37 = leftarm.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 65).addBox(3.9285F, -1.4857F, 0.0409F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.4261F, 1.0797F, 0.3519F, 0.8199F, 0.0357F, -0.025F));

		PartDefinition cube_r38 = leftarm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(24, 90).addBox(4.1251F, -3.3643F, -1.1075F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4261F, 2.0797F, 5.1519F, 1.2736F, 0.0357F, -0.025F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4739F, 3.2058F, 6.1726F, 0.3264F, -0.1243F, 0.3734F));

		PartDefinition cube_r39 = leftarm2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(29, 90).addBox(3.5F, -1.6F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 87).addBox(3.5F, -1.6F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, 1.9025F, 1.0115F, -0.2618F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9727F, 3.9738F, -1.9538F, -0.0865F, 0.0114F, 0.1304F));

		PartDefinition cube_r40 = lefthand.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(35, 84).addBox(-1.3F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7727F, 2.9553F, -0.277F, -0.1265F, 0.0338F, 0.2597F));

		PartDefinition leftfingers = lefthand.addOrReplaceChild("leftfingers", CubeListBuilder.create(), PartPose.offset(0.7727F, 2.9553F, -0.277F));

		PartDefinition cube_r41 = leftfingers.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(9, 80).addBox(-1.9452F, -0.0569F, -0.3825F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5904F, 0.8753F, 0.2706F, -0.1106F, 0.0702F, 0.5633F));

		PartDefinition leftclaw = lefthand.addOrReplaceChild("leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6951F, 1.2493F, -0.3833F, 0.0455F, -0.0035F, -0.1314F));

		PartDefinition cube_r42 = leftclaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(82, 92).addBox(-0.3F, -3.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5723F, 1.8839F, -1.6548F, -0.453F, 0.0969F, 0.4691F));

		PartDefinition cube_r43 = leftclaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 81).addBox(-3.1419F, -0.04F, -0.3231F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7723F, 2.2839F, -1.1548F, -0.398F, 0.2422F, 0.7914F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8967F, 6.3379F, -5.3737F, -0.2429F, -0.1966F, 0.2699F));

		PartDefinition cube_r44 = rightarm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 0).addBox(-0.2601F, 0.0255F, -0.2487F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3F, 2.0924F, 1.1316F, 1.3958F, -0.0357F, 0.025F));

		PartDefinition cube_r45 = rightarm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(42, 21).addBox(-0.1468F, -0.2766F, -0.1556F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.0076F, -0.5684F, 0.6453F, -0.0357F, 0.025F));

		PartDefinition cube_r46 = rightarm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(50, 21).addBox(-4.9285F, -1.4857F, 0.0409F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.4261F, 1.0797F, 0.3519F, 0.8199F, -0.0357F, 0.025F));

		PartDefinition cube_r47 = rightarm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 17).addBox(-5.1251F, -3.3643F, -1.1075F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4261F, 2.0797F, 5.1519F, 1.2736F, -0.0357F, 0.025F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4739F, 3.2058F, 6.1726F, 0.5096F, 0.1167F, -0.281F));

		PartDefinition cube_r48 = rightarm2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(90, 28).addBox(-4.5F, -1.6F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(86, 78).addBox(-4.5F, -1.6F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 1.9025F, 1.0115F, -0.2618F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9727F, 3.9738F, -1.9538F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition cube_r49 = righthand.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 18).addBox(0.3F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7727F, 2.9553F, -0.277F, -0.1265F, -0.0338F, -0.2597F));

		PartDefinition rightfingers = righthand.addOrReplaceChild("rightfingers", CubeListBuilder.create(), PartPose.offset(-0.7727F, 2.9553F, -0.277F));

		PartDefinition cube_r50 = rightfingers.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 79).addBox(-0.0548F, -0.0569F, -0.3825F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5904F, 0.8753F, 0.2706F, -0.1106F, -0.0702F, -0.5633F));

		PartDefinition rightclaw = righthand.addOrReplaceChild("rightclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6951F, 1.2493F, -0.3833F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightclaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(92, 60).addBox(-0.7F, -3.3F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5723F, 1.8839F, -1.6548F, -0.453F, -0.0969F, -0.4691F));

		PartDefinition cube_r52 = rightclaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 4).addBox(0.1419F, -0.04F, -0.3231F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7723F, 2.2839F, -1.1548F, -0.398F, -0.2422F, -0.7914F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4391F, -8.8957F, -0.0311F, -0.0868F, -0.0446F));

		PartDefinition bodymiddle_r61 = neck.addOrReplaceChild("bodymiddle_r61", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4905F, -2.2131F, 0.4244F, 0.5422F, -1.2604F));

		PartDefinition bodymiddle_r62 = neck.addOrReplaceChild("bodymiddle_r62", CubeListBuilder.create().texOffs(92, 65).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4905F, -2.2131F, 0.588F, 0.3433F, -0.8842F));

		PartDefinition bodymiddle_r63 = neck.addOrReplaceChild("bodymiddle_r63", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4905F, -0.3131F, 0.4573F, 0.6251F, -1.2423F));

		PartDefinition bodymiddle_r64 = neck.addOrReplaceChild("bodymiddle_r64", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4905F, -0.3131F, 0.6483F, 0.4102F, -0.862F));

		PartDefinition bodymiddle_r65 = neck.addOrReplaceChild("bodymiddle_r65", CubeListBuilder.create().texOffs(92, 65).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4905F, -2.2131F, 0.588F, -0.3433F, 0.8842F));

		PartDefinition bodymiddle_r66 = neck.addOrReplaceChild("bodymiddle_r66", CubeListBuilder.create().texOffs(89, 45).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4905F, -2.2131F, 0.4244F, -0.5422F, 1.2604F));

		PartDefinition bodymiddle_r67 = neck.addOrReplaceChild("bodymiddle_r67", CubeListBuilder.create().texOffs(92, 73).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4905F, -0.3131F, 0.6483F, -0.4102F, 0.862F));

		PartDefinition bodymiddle_r68 = neck.addOrReplaceChild("bodymiddle_r68", CubeListBuilder.create().texOffs(90, 2).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4905F, -0.3131F, 0.4573F, -0.6251F, 1.2423F));

		PartDefinition cube_r53 = neck.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -0.8974F, 0.0222F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7814F, -3.933F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r54 = neck.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, -1.8369F, -0.1161F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9814F, -0.733F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r55 = neck.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(42, 98).addBox(0.0F, -1.6922F, -0.0178F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9814F, -2.633F, -0.6981F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0115F, -3.733F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r56 = neck2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 98).addBox(-0.5F, -1.4842F, -0.2891F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.55F, -0.1938F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r57 = neck2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(34, 98).addBox(-0.5F, -1.7821F, 1.9454F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 69).addBox(-1.0F, 0.0179F, 0.9454F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.25F, -2.3938F, -1.0297F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r69 = neck2.addOrReplaceChild("bodymiddle_r69", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-2.2873F, -0.464F, -1.069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.279F, -0.9801F, 0.3912F, 0.2643F, -1.1871F));

		PartDefinition bodymiddle_r70 = neck2.addOrReplaceChild("bodymiddle_r70", CubeListBuilder.create().texOffs(48, 49).mirror().addBox(-3.0654F, -0.4961F, -1.2533F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.579F, 0.2199F, 0.433F, 0.3611F, -1.1742F));

		PartDefinition bodymiddle_r71 = neck2.addOrReplaceChild("bodymiddle_r71", CubeListBuilder.create().texOffs(35, 82).addBox(-0.7127F, -0.464F, -1.069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.279F, -0.9801F, 0.3912F, -0.2643F, 1.1871F));

		PartDefinition bodymiddle_r72 = neck2.addOrReplaceChild("bodymiddle_r72", CubeListBuilder.create().texOffs(48, 49).addBox(-0.9346F, -0.4961F, -1.2533F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.579F, 0.2199F, 0.433F, -0.3611F, 1.1742F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.1855F, -2.2293F, 0.1667F, -0.2508F, -0.076F));

		PartDefinition cube_r58 = neck3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(91, 90).addBox(-0.5F, -2.6F, 0.0213F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 35).addBox(-1.0F, -0.2F, 0.0213F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2293F, -2.4464F, -0.8901F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r73 = neck3.addOrReplaceChild("bodymiddle_r73", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4935F, -1.8508F, 0.4043F, 0.3608F, -1.1445F));

		PartDefinition bodymiddle_r74 = neck3.addOrReplaceChild("bodymiddle_r74", CubeListBuilder.create().texOffs(87, 52).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3935F, -0.3508F, 0.3971F, 0.3126F, -1.1662F));

		PartDefinition bodymiddle_r75 = neck3.addOrReplaceChild("bodymiddle_r75", CubeListBuilder.create().texOffs(87, 0).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4935F, -1.8508F, 0.4043F, -0.3608F, 1.1445F));

		PartDefinition bodymiddle_r76 = neck3.addOrReplaceChild("bodymiddle_r76", CubeListBuilder.create().texOffs(87, 52).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3935F, -0.3508F, 0.3971F, -0.3126F, 1.1662F));

		PartDefinition cube_r59 = neck3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(97, 21).addBox(-0.5F, -2.5561F, -0.1025F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8293F, -0.4464F, -1.0123F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8459F, -2.5399F, 0.0873F, -0.0873F, 0.0F));

		PartDefinition cube_r60 = neck4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(31, 26).addBox(-0.5F, -2.6888F, 0.9513F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(82, 6).addBox(-1.0F, -0.1888F, 0.9513F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.509F, -3.6302F, -0.2967F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r77 = neck4.addOrReplaceChild("bodymiddle_r77", CubeListBuilder.create().texOffs(83, 37).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8476F, -2.0108F, 0.369F, -0.8287F, 1.1385F));

		PartDefinition bodymiddle_r78 = neck4.addOrReplaceChild("bodymiddle_r78", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8476F, -2.0108F, 0.369F, 0.8287F, -1.1385F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1472F, -2.7625F, 0.1309F, -0.1745F, 0.0F));

		PartDefinition cube_r61 = neck5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(23, 97).addBox(1.0F, -3.0716F, 0.8049F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.4F, -2.85F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r79 = neck5.addOrReplaceChild("bodymiddle_r79", CubeListBuilder.create().texOffs(92, 71).addBox(0.844F, 0.1579F, -0.6549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2004F, -2.4484F, 0.335F, -1.1385F, 1.0997F));

		PartDefinition bodymiddle_r80 = neck5.addOrReplaceChild("bodymiddle_r80", CubeListBuilder.create().texOffs(92, 71).mirror().addBox(-2.844F, 0.1579F, -0.6549F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2004F, -2.4484F, 0.335F, 1.1385F, -1.0997F));

		PartDefinition cube_r62 = neck5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(58, 29).addBox(0.5F, -0.4776F, 0.5313F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -3.45F, -0.0611F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, -1.147F, -1.9432F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(90, 67).addBox(0.4F, -1.1589F, -2.0086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 67).mirror().addBox(-1.4F, -1.1589F, -2.0086F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0536F, -2.6396F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(98, 26).addBox(0.3F, -4.6557F, -5.9843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 3.8752F, -7.3889F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 94).mirror().addBox(-1.4F, -1.523F, -1.0187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(49, 94).addBox(-1.2F, -1.523F, -1.0187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 8.2752F, -12.5889F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-1.6F, -0.8795F, -1.0112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 57).addBox(-1.0F, -0.8795F, -1.0112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8F, 7.5752F, -9.2889F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(17, 73).mirror().addBox(-1.6F, -0.9819F, -2.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(17, 73).addBox(-1.0F, -0.9819F, -2.0252F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 7.8752F, -10.1889F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-1.6F, -0.9939F, -2.525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(81, 17).addBox(-1.0F, -0.9939F, -2.525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8F, 5.9752F, -7.3889F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(96, 80).mirror().addBox(-1.4F, 2.119F, -7.2542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(96, 80).addBox(-1.2F, 2.119F, -7.2542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8F, 3.8752F, -7.3889F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(45, 9).mirror().addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 9).addBox(1.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.7497F, -12.9468F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(81, 41).mirror().addBox(0.2661F, -0.1916F, -0.0315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9219F, 7.6538F, -11.9648F, 0.4882F, -0.0266F, 0.0346F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(47, 81).mirror().addBox(0.2F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9219F, 7.9538F, -9.8648F, 0.5231F, -0.0266F, 0.0346F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(24, 26).mirror().addBox(0.2F, -0.6F, -1.6F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8312F, 6.7938F, -7.9818F, 0.6889F, -0.0266F, 0.0346F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(83, 32).addBox(0.3F, 0.2889F, -6.8113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 3.8752F, -7.3889F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(71, 29).addBox(-0.2F, -1.0301F, -2.9427F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8F, 4.5752F, -4.9889F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(81, 41).addBox(-0.2661F, -0.1916F, -0.0315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9219F, 7.6538F, -11.9648F, 0.4882F, 0.0266F, -0.0346F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(47, 81).addBox(-0.2F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9219F, 7.9538F, -9.8648F, 0.5231F, 0.0266F, -0.0346F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(24, 26).addBox(-0.2F, -0.6F, -1.6F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8312F, 6.7938F, -7.9818F, 0.6889F, 0.0266F, -0.0346F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(80, 26).addBox(0.3F, -0.0689F, -2.9201F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 3.4752F, -7.3889F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(17, 88).addBox(0.3F, -0.0799F, -1.7805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8F, 5.2752F, -9.6889F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 97).addBox(-0.5F, 0.0462F, 0.0291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.447F, -3.9432F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(50, 90).addBox(-0.5F, 0.0061F, -1.9592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.347F, -3.9432F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(93, 54).mirror().addBox(-1.5F, 1.9231F, 0.7425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 4).mirror().addBox(-1.5F, -0.0769F, 0.0425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 54).addBox(-0.5F, 1.9231F, 0.7425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 4).addBox(-0.5F, -0.0769F, 0.0425F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.553F, -5.2432F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(74, 19).addBox(0.0F, -0.0075F, -3.0295F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 1.453F, -5.2432F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(16, 93).mirror().addBox(-1.52F, -0.0636F, -0.4878F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(16, 93).addBox(-1.08F, -0.0636F, -0.4878F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 4.8752F, -8.3889F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(61, 93).mirror().addBox(-2.01F, -0.0267F, -0.6861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 93).addBox(0.01F, -0.0267F, -0.6861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2574F, -0.5699F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-2.01F, 0.3727F, -0.7071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(93, 85).addBox(0.01F, 0.3727F, -0.7071F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.6574F, -0.5699F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(78, 97).mirror().addBox(-1.92F, -0.1418F, -0.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(97, 60).mirror().addBox(-1.92F, 0.3582F, -0.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(97, 60).addBox(0.12F, 0.3582F, -0.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(78, 97).addBox(0.12F, -0.1418F, -0.3417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 0.4656F, -2.0513F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(97, 37).mirror().addBox(-2.13F, -0.5792F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 67).mirror().addBox(-1.92F, -0.5792F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 32).mirror().addBox(-2.24F, -0.5792F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 32).addBox(0.44F, -0.5792F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 37).addBox(0.33F, -0.5792F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 67).addBox(0.12F, -0.5792F, -0.4804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4656F, -2.0513F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(98, 3).mirror().addBox(-0.25F, 0.5688F, -0.5729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(34, 94).mirror().addBox(-0.75F, -1.2312F, -0.5729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(98, 3).addBox(-0.21F, 0.5688F, -0.5729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(34, 94).addBox(0.29F, -1.2312F, -0.5729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.27F, 1.66F, -4.0088F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(56, 93).mirror().addBox(-0.25F, -0.8413F, -0.396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 94).mirror().addBox(-0.75F, -1.2413F, -0.396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(7, 94).addBox(0.29F, -1.2413F, -0.396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(56, 93).addBox(-0.21F, -0.8413F, -0.396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.27F, 1.66F, -4.0088F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(6, 98).mirror().addBox(-0.75F, -1.4794F, -0.066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 98).addBox(0.29F, -1.4794F, -0.066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.27F, 1.66F, -4.0088F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(33, 76).mirror().addBox(-0.8F, -1.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0522F, -2.7849F, 0.8794F, -0.2237F, -0.1371F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(35, 9).addBox(-0.5F, -0.9611F, -3.0095F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 2.653F, -1.9432F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(72, 59).addBox(0.0F, -2.0457F, -2.837F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 1.653F, 0.5568F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(42, 29).addBox(0.0F, 1.0F, -1.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(33, 76).addBox(0.0F, 1.0F, -1.6F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.647F, -3.0432F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(33, 76).addBox(-0.2F, -1.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.0522F, -2.7849F, 0.8794F, 0.2237F, 0.1371F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(22, 66).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2384F, -1.3025F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(83, 97).mirror().addBox(-2.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(83, 97).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0F, 1.153F, 0.3568F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-2.5F, 0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(98, 0).addBox(-0.5F, 0.4F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.647F, -0.0432F, -0.6109F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.853F, 1.0568F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(39, 92).mirror().addBox(-0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 1.0759F, -0.1031F, 0.0259F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(57, 36).mirror().addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 0.7654F, -0.2236F, -0.2099F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(39, 92).addBox(0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 1.0759F, 0.1031F, -0.0259F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(57, 36).addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2882F, -0.9956F, 0.7654F, 0.2236F, 0.2099F));

		PartDefinition leftAngularSurangular = jaw.addOrReplaceChild("leftAngularSurangular", CubeListBuilder.create(), PartPose.offset(0.5F, -0.1091F, -0.4042F));

		PartDefinition cube_r104 = leftAngularSurangular.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(41, 81).addBox(0.0F, -0.0339F, -2.4404F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.3F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftAngularSurangular.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(81, 52).addBox(0.0F, -0.0329F, -2.9683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.8F, -3.4F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftAngularSurangular.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(97, 46).addBox(0.0F, -1.0468F, -0.9591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7021F, 0.2879F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftAngularSurangular.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 97).addBox(0.0F, -0.5152F, 0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1021F, -0.4121F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftAngularSurangular.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(34, 90).addBox(0.0F, -0.953F, -2.1848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2021F, -0.3121F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftAngularSurangular.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(77, 93).addBox(-0.57F, -0.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 2.584F, -2.1901F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftAngularSurangular.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(81, 73).addBox(0.5F, -0.9952F, -2.989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 3.6F, -2.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftAngularSurangular.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(55, 67).addBox(0.0F, 0.7751F, -0.0903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(90, 37).addBox(0.0F, 0.0751F, -0.0903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.4F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftDentary = leftAngularSurangular.addOrReplaceChild("leftDentary", CubeListBuilder.create().texOffs(90, 9).addBox(-1.5F, -1.0384F, -5.71F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.1F, -4.9F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftDentary.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(98, 29).addBox(-0.7F, 4.6755F, -4.8235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8F, -0.8811F, -1.1618F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftDentary.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 53).addBox(0.2F, -0.2F, 2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 81).addBox(0.2F, -0.9F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -2.4922F, -9.7978F, -0.1349F, 0.036F, 0.2594F));

		PartDefinition cube_r114 = leftDentary.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(96, 51).addBox(-0.7F, -1.0104F, -0.9174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8F, -0.2811F, -7.1618F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r115 = leftDentary.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(14, 98).addBox(-0.5F, -0.0059F, -1.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -2.1992F, -7.4084F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftDentary.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(98, 16).addBox(-0.5F, -0.0059F, -1.0189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.4992F, -6.7084F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftDentary.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(91, 24).addBox(-0.5F, 0.0165F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, -1.0992F, -5.9084F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r118 = leftDentary.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 57).addBox(-0.5F, -0.9458F, -0.1517F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -0.2992F, -7.0084F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r119 = leftDentary.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(91, 47).addBox(0.0F, -0.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.6992F, -6.6084F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r120 = leftDentary.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(11, 73).addBox(-0.2F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.9957F, -3.7682F, -0.1486F, 0.0281F, -0.0208F));

		PartDefinition cube_r121 = leftDentary.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(68, 12).addBox(0.0F, -1.0614F, -2.9576F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 0.7189F, -1.4618F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r122 = leftDentary.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(74, 75).addBox(0.0F, -0.0071F, -0.0166F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -0.9811F, -3.7618F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightAngularSurangular = jaw.addOrReplaceChild("rightAngularSurangular", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.1091F, -0.4042F));

		PartDefinition cube_r123 = rightAngularSurangular.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(41, 81).mirror().addBox(-1.0F, -0.0339F, -2.4404F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.3F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r124 = rightAngularSurangular.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-1.0F, -0.0329F, -2.9683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8F, -3.4F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightAngularSurangular.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(-1.0F, -1.0468F, -0.9591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7021F, 0.2879F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r126 = rightAngularSurangular.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(60, 97).mirror().addBox(-1.0F, -0.5152F, 0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1021F, -0.4121F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r127 = rightAngularSurangular.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(34, 90).mirror().addBox(-1.0F, -0.953F, -2.1848F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2021F, -0.3121F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r128 = rightAngularSurangular.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(77, 93).mirror().addBox(-0.43F, -0.1F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.584F, -2.1901F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightAngularSurangular.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(81, 73).mirror().addBox(-1.5F, -0.9952F, -2.989F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.6F, -2.0F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r130 = rightAngularSurangular.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(55, 67).mirror().addBox(-1.0F, 0.7751F, -0.0903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(90, 37).mirror().addBox(-1.0F, 0.0751F, -0.0903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -3.4F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightDentary = rightAngularSurangular.addOrReplaceChild("rightDentary", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(0.5F, -1.0384F, -5.71F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1F, -4.9F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r131 = rightDentary.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(98, 29).mirror().addBox(-0.3F, 4.6755F, -4.8235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.8811F, -1.1618F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r132 = rightDentary.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.2F, -0.2F, 2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 81).mirror().addBox(-0.2F, -0.9F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, -2.4922F, -9.7978F, -0.1349F, -0.036F, -0.2594F));

		PartDefinition cube_r133 = rightDentary.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(96, 51).mirror().addBox(-0.3F, -1.0104F, -0.9174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.2811F, -7.1618F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r134 = rightDentary.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(14, 98).mirror().addBox(-0.5F, -0.0059F, -1.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.1992F, -7.4084F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightDentary.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(98, 16).mirror().addBox(-0.5F, -0.0059F, -1.0189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.4992F, -6.7084F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightDentary.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-0.5F, 0.0165F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0992F, -5.9084F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightDentary.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-0.5F, -0.9458F, -0.1517F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.2992F, -7.0084F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightDentary.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-1.0F, -0.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.6992F, -6.6084F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightDentary.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(11, 73).mirror().addBox(0.2F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9957F, -3.7682F, -0.1486F, -0.0281F, 0.0208F));

		PartDefinition cube_r140 = rightDentary.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-1.0F, -1.0614F, -2.9576F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.7189F, -1.4618F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightDentary.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-1.0F, -0.0071F, -0.0166F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.9811F, -3.7618F, -0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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