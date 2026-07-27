package fossils.fossils.client.blockentity.model.acrophyseter;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcrophyseterFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public AcrophyseterFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.leftarm = this.body6.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.body6.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone2 = this.body6.getChild("bone2");
		this.bone3 = this.body6.getChild("bone3");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.neck2 = this.chest.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -20.402F, -20.9275F, -0.04F, -0.2616F, 0.0104F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 101).addBox(0.0F, -2.7068F, -0.4181F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5854F, -2.0706F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 27).addBox(0.0F, -3.3521F, 0.0721F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2624F, -0.5632F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(-0.1534F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, 0.1741F, 0.1091F, 0.1266F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-9.0988F, -3.0263F, -0.311F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, -0.512F, 0.3731F, -1.297F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-5.876F, -0.7935F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, -0.3295F, 0.5396F, -0.8887F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(-2.9833F, -0.0221F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, -0.1649F, 0.6042F, -0.5865F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 70).mirror().addBox(0.4451F, -0.5F, -2.7319F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4451F, 7.7147F, 3.2464F, -0.4801F, 0.1664F, 0.1785F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 70).mirror().addBox(-1.2484F, -0.5F, -3.5884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4451F, 7.7147F, 3.2464F, -0.4967F, -0.2983F, 0.4226F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-3.4202F, -0.5F, -1.6546F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4451F, 7.7147F, 3.2464F, -0.8674F, -0.9307F, 1.022F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-1.8081F, -0.5F, 0.9236F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4451F, 7.7147F, 3.2464F, -2.2927F, -0.9186F, 2.6719F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(0.4451F, -0.5F, -0.3658F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4451F, 7.7147F, 3.2464F, -2.6615F, -0.1664F, -2.9631F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 72).mirror().addBox(-1.453F, -0.5F, -2.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4451F, 7.7147F, 3.2464F, -2.3554F, 0.8715F, -2.2231F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 22).mirror().addBox(-2.5F, -0.65F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.535F, 8.8089F, 5.3564F, -2.8796F, -0.1664F, -2.9631F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(49, 22).addBox(-2.5F, -0.65F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.535F, 8.8089F, 5.3564F, -2.8796F, 0.1664F, 2.9631F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 72).addBox(-0.547F, -0.5F, -2.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4451F, 7.7147F, 3.2464F, -2.3554F, -0.8715F, 2.2231F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 71).addBox(-2.4451F, -0.5F, -0.3658F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4451F, 7.7147F, 3.2464F, -2.6615F, 0.1664F, 2.9631F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(71, 4).addBox(-0.192F, -0.5F, 0.9236F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4451F, 7.7147F, 3.2464F, -2.2927F, 0.9186F, -2.6719F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(64, 21).addBox(0.4202F, -0.5F, -1.6546F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4451F, 7.7147F, 3.2464F, -0.8674F, 0.9307F, -1.022F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(48, 70).addBox(-0.7516F, -0.5F, -3.5884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4451F, 7.7147F, 3.2464F, -0.4967F, 0.2983F, -0.4226F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(23, 70).addBox(-2.4451F, -0.5F, -2.7319F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4451F, 7.7147F, 3.2464F, -0.4801F, -0.1664F, -0.1785F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 11).addBox(-0.0167F, -0.0221F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, -0.1649F, -0.6042F, 0.5865F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(74, 47).addBox(2.876F, -0.7935F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, -0.3295F, -0.5396F, 0.8887F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 55).addBox(5.0988F, -3.0263F, -0.311F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, -0.512F, -0.3731F, 1.297F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 58).addBox(-0.8466F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, 0.1741F, -0.1091F, -0.1266F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 65).addBox(-0.5F, -0.157F, 0.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7854F, -2.5206F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, 0.4829F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.4805F, 0.3903F, -0.8429F));

		PartDefinition cube_r27 = body6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 71).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.5576F, 0.2598F, -1.0827F));

		PartDefinition cube_r28 = body6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(49, 26).mirror().addBox(-12.3587F, -4.4854F, -1.3519F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.6083F, 0.0366F, -1.4209F));

		PartDefinition cube_r29 = body6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 14).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.385F, 5.5008F, -0.2111F, 0.1485F, -0.0282F));

		PartDefinition cube_r30 = body6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 93).mirror().addBox(-1.9081F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.2551F, 0.1517F, 0.0001F));

		PartDefinition cube_r31 = body6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 64).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.4948F, 0.379F, -0.8132F));

		PartDefinition cube_r32 = body6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.5681F, 0.2457F, -1.0503F));

		PartDefinition cube_r33 = body6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(49, 30).mirror().addBox(-11.3587F, -4.4854F, -1.3519F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.6133F, 0.0199F, -1.386F));

		PartDefinition cube_r34 = body6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-9.9055F, -3.0617F, -0.3482F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.6179F, -0.0148F, -1.3162F));

		PartDefinition cube_r35 = body6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 68).mirror().addBox(-5.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.5843F, 0.2144F, -0.9842F));

		PartDefinition cube_r36 = body6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(78, 75).mirror().addBox(-2.8528F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.519F, 0.3522F, -0.7521F));

		PartDefinition cube_r37 = body6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(101, 109).mirror().addBox(-1.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.2287F, 0.1498F, 0.0739F));

		PartDefinition cube_r38 = body6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(101, 109).addBox(0.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.2287F, -0.1498F, -0.0739F));

		PartDefinition cube_r39 = body6.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 75).addBox(-0.1472F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.519F, -0.3522F, 0.7521F));

		PartDefinition cube_r40 = body6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(78, 68).addBox(2.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.5843F, -0.2144F, 0.9842F));

		PartDefinition cube_r41 = body6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(61, 47).addBox(4.9055F, -3.0617F, -0.3482F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.6179F, 0.0148F, 1.3162F));

		PartDefinition cube_r42 = body6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(49, 30).addBox(5.3587F, -4.4854F, -1.3519F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.6133F, -0.0199F, 1.386F));

		PartDefinition cube_r43 = body6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 66).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.5681F, -0.2457F, 1.0503F));

		PartDefinition cube_r44 = body6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(78, 64).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.4948F, -0.379F, 0.8132F));

		PartDefinition cube_r45 = body6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 93).addBox(-0.0919F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.2551F, -0.1517F, -0.0001F));

		PartDefinition cube_r46 = body6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(93, 14).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.385F, 5.5008F, -0.2111F, -0.1485F, 0.0282F));

		PartDefinition cube_r47 = body6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.104F, 0.0109F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(87, 61).addBox(0.0F, -4.4786F, -0.1073F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1345F, 5.1082F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 26).addBox(5.3587F, -4.4854F, -1.3519F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.6083F, -0.0366F, 1.4209F));

		PartDefinition cube_r50 = body6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 71).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.5576F, -0.2598F, 1.0827F));

		PartDefinition cube_r51 = body6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(75, 13).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.4805F, -0.3903F, 0.8429F));

		PartDefinition cube_r52 = body6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(43, 91).addBox(0.0F, -3.5161F, -0.0338F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.9539F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(35, 84).addBox(0.0F, -4.1246F, -0.0282F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.9539F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftarm = body6.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2135F, 9.0289F, 0.9355F, 0.8061F, -0.0218F, -1.3537F));

		PartDefinition cube_r54 = leftarm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(99, 55).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0109F, 0.0204F, -0.2505F, -1.2567F, 0.0014F, -0.001F));

		PartDefinition cube_r55 = leftarm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(75, 25).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0085F, 0.8215F, 0.915F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition cube_r56 = leftarm.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(45, 99).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0065F, 3.6472F, 0.1149F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r57 = leftarm.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(33, 99).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 3.4651F, 1.0982F, -2.9584F, 0.0014F, -0.001F));

		PartDefinition cube_r58 = leftarm.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(75, 21).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0067F, 2.1248F, 0.9814F, 2.4957F, 0.0014F, -0.001F));

		PartDefinition cube_r59 = leftarm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(99, 28).addBox(-0.5F, -0.925F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0079F, 1.8027F, 0.637F, 2.0158F, 0.0014F, -0.001F));

		PartDefinition cube_r60 = leftarm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(28, 99).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0099F, 0.8427F, -0.0898F, 1.4922F, 0.0014F, -0.001F));

		PartDefinition cube_r61 = leftarm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(23, 99).addBox(-0.5F, -0.6F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0078F, 2.4814F, -0.0298F, -0.035F, 0.0014F, -0.001F));

		PartDefinition cube_r62 = leftarm.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(18, 99).addBox(-0.011F, 1.0254F, 0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5013F, 0.0619F, -1.2637F, 0.2268F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1618F, 3.9904F, 0.1568F, -0.0573F, 0.0F, 0.0F));

		PartDefinition cube_r63 = leftarm2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(99, 74).addBox(-0.325F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 0.3902F, 0.0915F, -1.5708F, -1.1694F, 1.5708F));

		PartDefinition cube_r64 = leftarm2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(99, 71).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1764F, 2.4602F, 1.1727F, -1.5708F, 0.6632F, 1.5708F));

		PartDefinition cube_r65 = leftarm2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(69, 101).addBox(-0.5F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.1764F, 0.1375F, 1.2916F, -1.5708F, -0.9948F, 1.5708F));

		PartDefinition cube_r66 = leftarm2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(74, 101).addBox(-0.35F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.1764F, 1.7577F, 2.1836F, 1.5708F, -0.925F, -1.5708F));

		PartDefinition cube_r67 = leftarm2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(10, 94).addBox(-0.425F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1764F, 1.4284F, 1.8728F, 1.5708F, -1.0996F, -1.5708F));

		PartDefinition cube_r68 = leftarm2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(80, 86).addBox(-0.8F, -2.325F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.1764F, 1.7577F, 2.1836F, 1.5708F, -1.2305F, -1.5708F));

		PartDefinition cube_r69 = leftarm2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(91, 83).addBox(-0.75F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1764F, 2.2901F, 0.5595F, -1.5708F, 1.0559F, 1.5708F));

		PartDefinition cube_r70 = leftarm2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(97, 6).addBox(0.175F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 68).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 2.0518F, 0.4689F, -1.5708F, -0.2531F, 1.5708F));

		PartDefinition cube_r71 = leftarm2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(91, 79).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1764F, 0.8993F, 0.1199F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.1637F, 0.7842F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftArm3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(15, 41).addBox(0.0F, 0.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition rightarm = body6.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2135F, 9.0289F, 0.9355F, 0.8985F, -0.0949F, 0.8918F));

		PartDefinition cube_r73 = rightarm.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(87, 104).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0109F, 0.0204F, -0.2505F, -1.2567F, -0.0014F, 0.001F));

		PartDefinition cube_r74 = rightarm.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(80, 4).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0085F, 0.8215F, 0.915F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition cube_r75 = rightarm.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(82, 104).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0065F, 3.6472F, 0.1149F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r76 = rightarm.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(104, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0053F, 3.4651F, 1.0982F, -2.9584F, -0.0014F, 0.001F));

		PartDefinition cube_r77 = rightarm.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(77, 79).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0067F, 2.1248F, 0.9814F, 2.4957F, -0.0014F, 0.001F));

		PartDefinition cube_r78 = rightarm.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(73, 104).addBox(-0.5F, -0.925F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0079F, 1.8027F, 0.637F, 2.0158F, -0.0014F, 0.001F));

		PartDefinition cube_r79 = rightarm.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(104, 70).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0099F, 0.8427F, -0.0898F, 1.4922F, -0.0014F, 0.001F));

		PartDefinition cube_r80 = rightarm.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(68, 104).addBox(-0.5F, -0.6F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0078F, 2.4814F, -0.0298F, -0.035F, -0.0014F, 0.001F));

		PartDefinition cube_r81 = rightarm.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(104, 67).addBox(-0.989F, 1.0254F, 0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5014F, 0.0619F, -1.2637F, 0.2268F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1618F, 3.9904F, 0.1568F, -0.0573F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightarm2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(105, 12).addBox(-0.675F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 0.3902F, 0.0915F, -1.5708F, 1.1694F, -1.5708F));

		PartDefinition cube_r83 = rightarm2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(11, 105).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1764F, 2.4602F, 1.1727F, -1.5708F, -0.6632F, -1.5708F));

		PartDefinition cube_r84 = rightarm2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 105).addBox(-0.5F, -0.825F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1764F, 0.1375F, 1.2916F, -1.5708F, 0.9948F, -1.5708F));

		PartDefinition cube_r85 = rightarm2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(97, 104).addBox(-0.65F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1764F, 1.7577F, 2.1836F, 1.5708F, 0.925F, 1.5708F));

		PartDefinition cube_r86 = rightarm2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(71, 94).addBox(-0.575F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1764F, 1.4284F, 1.8728F, 1.5708F, 1.0996F, 1.5708F));

		PartDefinition cube_r87 = rightarm2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(53, 87).addBox(-0.2F, -2.325F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.1764F, 1.7577F, 2.1836F, 1.5708F, 1.2305F, 1.5708F));

		PartDefinition cube_r88 = rightarm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(66, 94).addBox(-0.25F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1764F, 2.2901F, 0.5595F, -1.5708F, -1.0559F, -1.5708F));

		PartDefinition cube_r89 = rightarm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 98).addBox(-1.175F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(92, 104).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 2.0518F, 0.4689F, -1.5708F, 0.2531F, -1.5708F));

		PartDefinition cube_r90 = rightarm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(61, 94).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1764F, 0.8993F, 0.1199F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.1637F, 0.7842F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r91 = rightArm3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(37, 41).addBox(0.0F, 0.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = body6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5765F, 6.3662F, 1.2764F, -0.3743F, -0.0148F, -0.1301F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(100, 44).addBox(-0.4717F, -0.6892F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5464F, 1.503F, -0.5519F, 1.4308F, -0.0355F, -0.1838F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -0.375F, 0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4248F, 0.9504F, -1.9184F, 0.3233F, 0.0513F, -0.1801F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(55, 101).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.4179F, 1.1004F, -2.5734F, -0.1043F, 0.0513F, -0.1801F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(50, 101).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3534F, 0.638F, -2.1965F, 0.8906F, 0.0513F, -0.1801F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(100, 41).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.4248F, 0.9504F, -1.9184F, 1.5014F, 0.0513F, -0.1801F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(100, 38).addBox(-0.4717F, -0.7764F, -1.2764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5464F, 1.528F, -1.0519F, 0.1924F, 0.0513F, -0.1801F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(32, 76).addBox(-0.4717F, -0.9208F, -0.6614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5464F, 1.528F, -1.0519F, 0.4979F, 0.0513F, -0.1801F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(7, 76).addBox(-0.4717F, -1.0396F, -0.4754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5464F, 1.528F, -1.0519F, 0.716F, 0.0513F, -0.1801F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(46, 92).addBox(-0.4717F, -0.5351F, -0.9562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5464F, 1.503F, -0.5519F, 1.8671F, -0.0355F, -0.1838F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 75).addBox(-0.0968F, -0.4651F, -2.3363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, 0.2429F, -0.0456F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 92).addBox(-0.0968F, 0.2156F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, 0.2429F, -0.0456F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(101, 24).addBox(-0.5F, -0.9F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4754F, -0.8015F, 0.3876F, 0.1892F, 0.2429F, -0.0456F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 101).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4396F, 0.1458F, 0.069F, -0.6835F, 0.2429F, -0.0456F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 94).addBox(-0.5F, -0.625F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5556F, -0.5719F, 0.6686F, -0.3344F, 0.2429F, -0.0456F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(73, 57).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.56F, -1.1183F, 0.787F, -0.6835F, 0.2429F, -0.0456F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0599F, -2.0492F, -1.0581F, -0.4042F, 0.2429F, -0.0456F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(66, 25).addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0599F, -2.0492F, -1.0581F, -0.6224F, 0.2429F, -0.0456F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(101, 21).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0599F, -2.0492F, -1.0581F, 0.643F, 0.2429F, -0.0456F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 18).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(101, 15).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2837F, -3.6099F, 0.1311F, 1.4284F, 0.2429F, -0.0456F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(66, 11).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0027F, -2.51F, 2.8279F, 2.7548F, 0.2429F, -0.0456F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(64, 75).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.358F, -0.8682F, 3.9585F, 2.5367F, 0.2429F, -0.0456F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(101, 9).addBox(-0.5F, -0.225F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(38, 100).addBox(-0.5F, -0.225F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 12).addBox(-0.5F, -0.225F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2162F, -0.3449F, 3.2906F, -2.9437F, 0.2429F, -0.0456F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(57, 73).addBox(-0.5F, 0.075F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9077F, 0.3937F, 1.9107F, -2.7691F, 0.2429F, -0.0456F));

		PartDefinition bone3 = body6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5765F, 6.3662F, 1.2764F, -0.3743F, 0.0148F, 0.1301F));

		PartDefinition cube_r115 = bone3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(100, 44).mirror().addBox(-0.5283F, -0.6892F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5464F, 1.503F, -0.5519F, 1.4308F, 0.0355F, 0.1838F));

		PartDefinition cube_r116 = bone3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, -0.375F, 0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4248F, 0.9504F, -1.9184F, 0.3233F, -0.0513F, 0.1801F));

		PartDefinition cube_r117 = bone3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(55, 101).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.4179F, 1.1004F, -2.5734F, -0.1043F, -0.0513F, 0.1801F));

		PartDefinition cube_r118 = bone3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 101).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3534F, 0.638F, -2.1965F, 0.8906F, -0.0513F, 0.1801F));

		PartDefinition cube_r119 = bone3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(100, 41).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.4248F, 0.9504F, -1.9184F, 1.5014F, -0.0513F, 0.1801F));

		PartDefinition cube_r120 = bone3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(100, 38).mirror().addBox(-0.5283F, -0.7764F, -1.2764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5464F, 1.528F, -1.0519F, 0.1924F, -0.0513F, 0.1801F));

		PartDefinition cube_r121 = bone3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(32, 76).mirror().addBox(-0.5283F, -0.9208F, -0.6614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5464F, 1.528F, -1.0519F, 0.4979F, -0.0513F, 0.1801F));

		PartDefinition cube_r122 = bone3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-0.5283F, -1.0396F, -0.4754F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5464F, 1.528F, -1.0519F, 0.716F, -0.0513F, 0.1801F));

		PartDefinition cube_r123 = bone3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(46, 92).mirror().addBox(-0.5283F, -0.5351F, -0.9562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5464F, 1.503F, -0.5519F, 1.8671F, 0.0355F, 0.1838F));

		PartDefinition cube_r124 = bone3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(-0.9032F, -0.4651F, -2.3363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, -0.2429F, 0.0456F));

		PartDefinition cube_r125 = bone3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.9032F, 0.2156F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, -0.2429F, 0.0456F));

		PartDefinition cube_r126 = bone3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-0.5F, -0.9F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4754F, -0.8015F, 0.3876F, 0.1892F, -0.2429F, 0.0456F));

		PartDefinition cube_r127 = bone3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(60, 101).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4396F, 0.1458F, 0.069F, -0.6835F, -0.2429F, 0.0456F));

		PartDefinition cube_r128 = bone3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.5F, -0.625F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5556F, -0.5719F, 0.6686F, -0.3344F, -0.2429F, 0.0456F));

		PartDefinition cube_r129 = bone3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(73, 57).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.56F, -1.1183F, 0.787F, -0.6835F, -0.2429F, 0.0456F));

		PartDefinition cube_r130 = bone3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0599F, -2.0492F, -1.0581F, -0.4042F, -0.2429F, 0.0456F));

		PartDefinition cube_r131 = bone3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0599F, -2.0492F, -1.0581F, -0.6224F, -0.2429F, 0.0456F));

		PartDefinition cube_r132 = bone3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(101, 21).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0599F, -2.0492F, -1.0581F, 0.643F, -0.2429F, 0.0456F));

		PartDefinition cube_r133 = bone3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(101, 18).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(101, 15).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2837F, -3.6099F, 0.1311F, 1.4284F, -0.2429F, 0.0456F));

		PartDefinition cube_r134 = bone3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(66, 11).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0027F, -2.51F, 2.8279F, 2.7548F, -0.2429F, 0.0456F));

		PartDefinition cube_r135 = bone3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(64, 75).mirror().addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.358F, -0.8682F, 3.9585F, 2.5367F, -0.2429F, 0.0456F));

		PartDefinition cube_r136 = bone3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(101, 9).mirror().addBox(-0.5F, -0.225F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(38, 100).mirror().addBox(-0.5F, -0.225F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 12).mirror().addBox(-0.5F, -0.225F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2162F, -0.3449F, 3.2906F, -2.9437F, -0.2429F, 0.0456F));

		PartDefinition cube_r137 = bone3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(57, 73).mirror().addBox(-0.5F, 0.075F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9077F, 0.3937F, 1.9107F, -2.7691F, -0.2429F, 0.0456F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5957F, 5.8766F, -0.4459F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(38, 84).addBox(0.0F, -4.677F, -0.2081F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5296F, 1.1014F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(85, 86).addBox(0.0F, -4.604F, 0.038F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.996F, 4.843F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, 0.1921F, 0.1129F, 0.059F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(76, 73).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.2856F, 0.5992F, -0.9345F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(38, 20).mirror().addBox(-13.3587F, -4.4854F, -1.3519F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.5016F, 0.4426F, -1.3623F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.099F, 0.6498F, -0.6173F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 3.4356F, 0.2006F, 0.1103F, 0.0248F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.09F, 0.6545F, -0.6471F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-6.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.2791F, 0.6059F, -0.966F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(49, 28).mirror().addBox(-12.3587F, -4.4854F, -1.3519F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.4993F, 0.4509F, -1.3965F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(93, 38).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 5.4356F, 0.2269F, 0.1096F, 0.0277F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(-4.1343F, -0.9291F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 5.4356F, -0.0634F, 0.6701F, -0.6307F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 79).mirror().addBox(-6.753F, -1.9675F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 5.4356F, -0.2607F, 0.6274F, -0.9554F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(-11.4474F, -4.4497F, -1.3812F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 5.4356F, -0.4942F, 0.4767F, -1.3942F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(51, 11).addBox(5.4474F, -4.4497F, -1.3812F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 5.4356F, -0.4942F, -0.4767F, 1.3942F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(17, 79).addBox(3.753F, -1.9675F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 5.4356F, -0.2607F, -0.6274F, 0.9554F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(78, 77).addBox(1.1343F, -0.9291F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 5.4356F, -0.0634F, -0.6701F, 0.6307F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(93, 38).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 5.4356F, 0.2269F, -0.1096F, -0.0277F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(49, 28).addBox(5.3587F, -4.4854F, -1.3519F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.4993F, -0.4509F, 1.3965F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(77, 49).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.2791F, -0.6059F, 0.966F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(77, 17).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.09F, -0.6545F, 0.6471F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(91, 87).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 3.4356F, 0.2006F, -0.1103F, -0.0248F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(77, 15).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.099F, -0.6498F, 0.6173F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(38, 20).addBox(5.3587F, -4.4854F, -1.3519F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.5016F, -0.4426F, 1.3623F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(76, 73).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.2856F, -0.5992F, 0.9345F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(89, 26).addBox(-0.0919F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, 0.1921F, -0.1129F, -0.059F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(50, 85).addBox(0.0F, -4.7188F, 0.0287F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7473F, 2.846F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(21, 9).addBox(-0.5F, -0.0425F, -0.0704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3034F, 5.9565F, -0.1046F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(16, 87).addBox(0.0F, -5.0F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7767F, 7.0212F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(13, 87).addBox(0.0F, -4.9F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 4.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(87, 3).addBox(0.0F, -4.7F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(41, 84).addBox(0.0F, -4.5097F, -0.0421F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(51, 92).mirror().addBox(-2.1F, 0.5F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 51).mirror().addBox(-3.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 53).mirror().addBox(-3.3F, 0.5F, 7.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 53).addBox(0.3F, 0.5F, 7.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 51).addBox(0.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 92).addBox(0.1F, 0.5F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r171 = body5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 19).mirror().addBox(-10.4474F, -4.4497F, -1.3812F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4171F, 1.3791F, -0.4703F, 0.5882F, -1.3821F));

		PartDefinition cube_r172 = body5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(37, 52).mirror().addBox(-6.753F, -1.9675F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4171F, 1.3791F, -0.1738F, 0.7183F, -0.9012F));

		PartDefinition cube_r173 = body5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(70, 19).mirror().addBox(-4.1343F, -0.9291F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4171F, 1.3791F, 0.06F, 0.7334F, -0.5509F));

		PartDefinition cube_r174 = body5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(93, 53).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4171F, 1.3791F, 0.341F, 0.1058F, 0.0399F));

		PartDefinition cube_r175 = body5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(57, 19).addBox(5.4474F, -4.4497F, -1.3812F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4171F, 1.3791F, -0.4703F, -0.5882F, 1.3821F));

		PartDefinition cube_r176 = body5.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(37, 52).addBox(3.753F, -1.9675F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4171F, 1.3791F, -0.1738F, -0.7183F, 0.9012F));

		PartDefinition cube_r177 = body5.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(70, 19).addBox(1.1343F, -0.9291F, -1.3812F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4171F, 1.3791F, 0.06F, -0.7334F, 0.5509F));

		PartDefinition cube_r178 = body5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(93, 53).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.4171F, 1.3791F, 0.341F, -0.1058F, -0.0399F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7134F, 8.0024F, -0.2529F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(14, 76).addBox(0.0F, -5.3575F, -0.0873F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2244F, 4.929F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(53, 74).addBox(0.0F, -5.1575F, -0.0873F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 2.8896F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 84).addBox(0.0F, -5.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0002F, 0.7896F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r182 = body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(77, 55).mirror().addBox(-3.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 29).mirror().addBox(-3.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 31).mirror().addBox(-3.5F, 0.375F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 31).addBox(0.5F, 0.375F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 29).addBox(0.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 55).addBox(0.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(-0.5F, -0.125F, -5.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 5.0896F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.1187F, -0.0502F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(78, 33).addBox(0.3F, 0.3813F, -0.0502F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 78).addBox(0.0F, 0.3813F, 1.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 62).addBox(-0.2F, 0.3813F, 3.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 62).mirror().addBox(-2.8F, 0.3813F, 3.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 78).mirror().addBox(-3.0F, 0.3813F, 1.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 33).mirror().addBox(-3.3F, 0.3813F, -0.0502F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3504F, 6.8384F, 0.0627F, 0.0F, 0.0F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(10, 87).addBox(0.0F, -4.7F, 0.05F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0373F, 3.9008F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(47, 85).addBox(0.0F, -5.1F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, 1.8998F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(7, 87).addBox(0.0F, -5.2F, -0.05F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, -0.0002F, -0.3578F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2669F, 6.032F, 0.1056F, 0.0F, 0.0F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(22, 93).addBox(0.0F, -3.5945F, -0.1045F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6154F, 3.9881F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(15, 94).addBox(0.0F, -3.9298F, -0.043F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.048F, 1.9945F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(88, 82).addBox(0.0F, -4.1996F, 0.0072F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4077F, -0.0089F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(58, 92).mirror().addBox(-2.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 92).mirror().addBox(-2.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 70).mirror().addBox(-2.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 70).addBox(0.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 92).addBox(0.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 92).addBox(0.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 41).addBox(-0.5F, 0.7738F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9537F, -8.4029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9579F, 4.9196F, 0.1608F, 0.0F, 0.0F));

		PartDefinition cube_r190 = hips.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(100, 58).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1431F, 4.4359F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r191 = hips.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(15, 100).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2571F, 2.6119F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r192 = hips.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(84, 99).addBox(0.0F, 0.0F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7641F, 3.6532F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r193 = hips.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(19, 93).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2598F, 0.7937F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r194 = hips.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(72, 92).mirror().addBox(-1.8F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 30).mirror().addBox(-1.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 92).mirror().addBox(-1.6F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 92).addBox(-0.4F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 30).addBox(0.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 92).addBox(-0.2F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 25).addBox(-0.5F, -0.1165F, -0.0007F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.175F, -0.025F, -0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r195 = hips.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(39, 74).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5588F, 3.6564F, -1.2253F, -0.3927F, -0.1309F, 0.0F));

		PartDefinition cube_r196 = hips.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(56, 78).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6141F, 3.9401F, -0.8052F, -0.6981F, -0.1309F, 0.0F));

		PartDefinition cube_r197 = hips.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 78).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.6141F, 3.9401F, -0.8052F, -0.6981F, 0.1309F, 0.0F));

		PartDefinition cube_r198 = hips.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(39, 74).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5588F, 3.6564F, -1.2253F, -0.3927F, 0.1309F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9536F, 5.1845F, -0.4301F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(5, 101).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6122F, 2.849F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(79, 100).addBox(0.0F, -1.0F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.96F, 2.3953F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(100, 63).addBox(0.0F, -2.4F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6122F, 0.949F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r202 = tail.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(18, 72).mirror().addBox(-1.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 65).mirror().addBox(-1.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 65).addBox(0.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 72).addBox(0.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5128F, -0.026F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2646F, 4.8704F, 0.0968F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(109, 52).mirror().addBox(-1.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 54).mirror().addBox(-0.8F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 54).addBox(-0.2F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 52).addBox(0.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4973F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(38, 109).addBox(0.0F, -2.25F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 109).addBox(0.0F, -1.975F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4476F, 1.9786F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(52, 110).addBox(0.0F, 0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 55).addBox(-0.004F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 12).addBox(0.0F, 0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9357F, 3.2127F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(98, 107).addBox(0.0F, -0.3F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3004F, 1.1446F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(11, 101).addBox(0.0F, -2.05F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4476F, -0.0214F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2304F, 5.8944F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(49, 110).addBox(0.0F, 0.8F, 8.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 110).addBox(0.0F, 0.8F, 6.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 42).addBox(0.0F, 0.6F, 4.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1661F, -2.6817F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(15, 33).addBox(-0.5F, -0.55F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(110, 39).addBox(0.0F, -1.45F, 4.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 71).addBox(0.0F, -1.55F, 2.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 67).addBox(0.0F, -1.65F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5245F, -0.0218F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 5.95F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(30, 33).addBox(-0.5F, -0.55F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4805F, -2.1145F, 0.2863F, 0.0F, 0.0F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(84, 93).mirror().addBox(0.0F, -4.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.8581F, -5.7889F, -1.1039F, -0.3035F, -0.7363F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(81, 95).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.6581F, -6.0889F, -0.8231F, -0.2751F, -0.6502F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(84, 93).addBox(0.0F, -4.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.8581F, -5.7889F, -1.1039F, 0.3035F, 0.7363F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(66, 98).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2105F, 3.3961F, -3.972F, -0.8572F, -0.0191F, 0.3869F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(81, 95).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.6581F, -6.0889F, -0.8231F, 0.2751F, 0.6502F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(110, 36).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8581F, -5.7889F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(100, 88).addBox(-0.5F, 0.45F, 4.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0677F, -0.3018F, -0.1549F, -0.0135F, -0.0862F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(64, 0).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.8473F, -2.8959F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(101, 80).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 77).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.942F, -21.8631F, 2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(13, 52).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.1828F, -17.7756F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(29, 60).addBox(-1.0F, -1.0F, -0.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.9147F, -15.0842F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(66, 49).addBox(-1.5F, -0.025F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 1.7842F, -14.0927F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(66, 16).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 1.6536F, -13.1013F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(38, 22).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 2.6536F, -12.1013F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -0.525F, -1.5F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0968F, -8.4679F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(70, 79).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.1026F, -12.2995F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(63, 79).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4846F, -10.3974F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(36, 8).addBox(-3.0F, 2.0F, -0.625F, 6.0F, 5.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 55).addBox(-1.5F, -1.0F, -0.625F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.5185F, -9.7211F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(34, 25).addBox(-3.0F, -2.0137F, 0.0008F, 6.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.2534F, -10.8443F, 1.885F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(79, 39).addBox(-1.0F, -2.0137F, 0.0008F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.0221F, -9.2683F, 2.234F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(79, 35).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.9579F, -9.7899F, 2.8885F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(46, 50).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.3387F, -9.5588F, 2.9758F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(72, 89).addBox(-1.0F, -0.525F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5407F, -8.6943F, -2.3475F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(18, 60).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -5.046F, -8.2214F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(19, 18).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -5.1852F, -7.2312F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(66, 52).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -3.8402F, -6.7941F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(46, 45).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -4.5579F, -5.5756F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(59, 38).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -4.1833F, -4.6484F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(24, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -3.1985F, -2.9077F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -3.6F, -0.7F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0397F, -4.0473F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(45, 33).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5293F, -2.1646F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, -1.1F, -0.875F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.442F, -1.9136F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.8F, -1.1067F, -8.1002F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(35, 54).addBox(-1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.8F, 4.2895F, -9.6754F, -3.0273F, 0.1214F, 0.0139F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(62, 5).addBox(-0.925F, -0.1F, -2.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7615F, 2.8854F, -7.211F, 2.8057F, -0.0334F, -1.8046F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 69).addBox(-0.1F, -0.05F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2654F, 4.2542F, -9.7484F, 2.873F, 0.1019F, -1.77F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(64, 57).addBox(-0.925F, -0.7F, -0.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3F, 3.0214F, -6.984F, 2.82F, 0.1281F, -1.871F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(58, 68).addBox(-1.0F, -1.0F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.3F, 3.0214F, -6.984F, -2.9384F, 0.1539F, 0.0316F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(70, 39).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -4.0784F, 0.8691F, -1.4028F, 0.1687F, 0.3747F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(40, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -3.8514F, 1.3146F, -0.44F, 0.1746F, 0.3536F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(39, 70).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -3.5764F, 2.0405F, -1.8053F, 0.096F, 0.3814F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -3.2639F, 2.9882F, -0.3573F, 0.1439F, 0.3667F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 63).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -2.5842F, 4.3221F, -0.4816F, 0.1896F, 0.346F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(24, 54).addBox(0.0F, -0.5F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -1.7572F, 5.5641F, 0.8769F, 0.2589F, 0.2986F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(94, 28).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9716F, -0.2862F, 5.6332F, 0.7013F, 0.5391F, -0.2552F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(87, 101).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7803F, -0.0623F, 5.2292F, 0.3435F, 0.5391F, -0.2552F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(70, 35).addBox(0.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.8F, 0.9064F, 7.6069F, 0.5404F, 0.3413F, 0.1982F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(107, 3).addBox(-1.7279F, 0.7579F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0841F, 0.2916F, 1.5406F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(98, 85).addBox(0.1239F, 1.0511F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.1685F, -0.5814F, 1.0221F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(65, 89).addBox(-1.456F, 1.0949F, -0.7793F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.127F, -0.4717F, 1.1047F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(87, 94).addBox(-2.3133F, -2.0334F, -0.7793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.6645F, 1.0129F, 2.4036F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(26, 87).addBox(-1.7703F, 0.2275F, -0.5227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(106, 21).addBox(-0.246F, -1.104F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0485F, -0.3158F, 1.1653F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(107, 92).addBox(-0.3009F, 0.2321F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(74, 98).addBox(0.0991F, 0.2321F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 3).addBox(0.4452F, -1.1563F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(26, 105).addBox(0.0452F, -1.1563F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0726F, -0.4313F, 1.0992F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(79, 91).addBox(-1.3941F, -2.1125F, -0.5227F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.9572F, 1.1102F, 2.6902F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(31, 105).addBox(-1.2655F, -0.0404F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0812F, 0.4635F, 1.5699F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(96, 19).addBox(-0.0733F, -0.9482F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0266F, -0.1208F, 1.2657F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(86, 49).addBox(-1.6624F, -0.7457F, -0.4685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0364F, 0.2319F, 1.4396F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(102, 94).addBox(-0.255F, -0.7385F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0622F, 0.3869F, 1.5239F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(59, 83).addBox(-1.3391F, -0.9642F, -0.4685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0288F, 0.1537F, 1.4F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(83, 46).addBox(-1.4067F, -1.0505F, -0.4685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 2.0235F, -0.0423F, 1.3041F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(82, 19).addBox(-0.8787F, -2.0462F, -0.345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 1.9806F, 0.1241F, 1.3327F));

		PartDefinition cube_r272 = leftOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(82, 0).addBox(-0.6283F, -1.7656F, -0.345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 1.9952F, 0.2838F, 1.4048F));

		PartDefinition cube_r273 = leftOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(95, 65).addBox(-0.0418F, -2.2124F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 1.9825F, -0.1563F, 1.2111F));

		PartDefinition cube_r274 = leftOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(21, 105).addBox(0.103F, -2.282F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(16, 105).addBox(0.503F, -2.282F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 1.9942F, -0.2759F, 1.1568F));

		PartDefinition cube_r275 = leftOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(96, 16).addBox(0.366F, -1.9862F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5864F, 5.4443F, -3.8125F, 1.9776F, 0.044F, 1.2979F));

		PartDefinition cube_r276 = leftOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(102, 91).addBox(-0.3235F, 0.8711F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3261F, 6.1668F, -7.5936F, 1.8936F, 0.0204F, 1.2952F));

		PartDefinition cube_r277 = leftOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(102, 106).addBox(0.8323F, 0.6388F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 102).addBox(0.4323F, 0.6388F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-1.3261F, 6.1668F, -7.5936F, 1.9103F, -0.3101F, 1.1811F));

		PartDefinition cube_r278 = leftOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(33, 102).addBox(-0.0965F, 0.7264F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.3261F, 6.1668F, -7.5936F, 1.8994F, -0.1864F, 1.2253F));

		PartDefinition cube_r279 = leftOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(86, 38).addBox(-2.0338F, 0.8158F, -0.8537F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.3261F, 6.1668F, -7.5936F, 1.906F, 0.2683F, 1.3805F));

		PartDefinition cube_r280 = leftOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(86, 35).addBox(-1.8146F, 0.7401F, -0.8537F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3261F, 6.1668F, -7.5936F, 1.8953F, 0.1031F, 1.323F));

		PartDefinition cube_r281 = leftOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(86, 14).addBox(-1.7252F, -0.325F, -0.5935F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6261F, 6.1668F, -7.5936F, 1.8953F, 0.1031F, 1.323F));

		PartDefinition cube_r282 = leftOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 86).addBox(-1.7609F, -0.2175F, -0.5935F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.6261F, 6.1668F, -7.5936F, 1.906F, 0.2683F, 1.3805F));

		PartDefinition cube_r283 = leftOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(28, 102).addBox(-0.3315F, -0.3162F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.6261F, 6.1668F, -7.5936F, 1.8994F, -0.1864F, 1.2253F));

		PartDefinition cube_r284 = leftOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(23, 102).addBox(0.0632F, -0.3642F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(18, 102).addBox(0.4632F, -0.3642F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6261F, 6.1668F, -7.5936F, 1.9103F, -0.3101F, 1.1811F));

		PartDefinition cube_r285 = leftOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(102, 6).addBox(-0.3273F, -0.1977F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6261F, 6.1668F, -7.5936F, 1.8936F, 0.0204F, 1.2952F));

		PartDefinition cube_r286 = leftOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(103, 31).addBox(1.17F, -2.1248F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 108).addBox(0.83F, -1.3635F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.7898F, 0.7546F, 1.3547F));

		PartDefinition cube_r287 = leftOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(108, 33).addBox(0.8111F, -2.6872F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(20, 108).addBox(0.7519F, -1.8555F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.7444F, 0.412F, 1.2735F));

		PartDefinition cube_r288 = leftOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(83, 107).addBox(0.7132F, -2.5217F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(108, 46).addBox(0.546F, -1.7049F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.7565F, 0.5408F, 1.2998F));

		PartDefinition cube_r289 = leftOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(86, 52).addBox(0.1842F, -1.6914F, -0.2774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(87, 28).addBox(-0.3413F, -1.044F, -0.3627F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.872F, 1.0079F, 1.4603F));

		PartDefinition cube_r290 = leftOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(87, 31).addBox(-0.0656F, -2.1142F, -0.2774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 3).addBox(-0.4707F, -1.3855F, -0.3627F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.8101F, 0.8396F, 1.3831F));

		PartDefinition cube_r291 = leftOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 98).addBox(0.1862F, -0.5567F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.7633F, 0.8385F, 1.3509F));

		PartDefinition cube_r292 = leftOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(108, 30).addBox(0.4229F, -0.8771F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.7166F, 0.4942F, 1.2765F));

		PartDefinition cube_r293 = leftOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(108, 56).addBox(0.092F, -0.7778F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.729F, 0.6236F, 1.2999F));

		PartDefinition cube_r294 = leftOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(89, 23).addBox(-1.172F, -0.4313F, -0.3705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.8528F, 1.0933F, 1.4588F));

		PartDefinition cube_r295 = leftOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(90, 6).addBox(-1.1824F, -0.6378F, -0.3705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.2641F, 5.4434F, -12.2881F, 1.7846F, 0.924F, 1.3785F));

		PartDefinition cube_r296 = leftOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(84, 11).addBox(0.3236F, -2.5633F, -0.5609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9523F, 0.7678F, 1.4667F));

		PartDefinition cube_r297 = leftOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(89, 20).addBox(0.6455F, -2.0661F, -0.5609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 2.0336F, 0.9272F, 1.5746F));

		PartDefinition cube_r298 = leftOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(102, 100).addBox(0.9493F, -3.0671F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.8776F, 0.4798F, 1.3401F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(106, 24).addBox(0.974F, -3.2587F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(30, 108).addBox(1.374F, -3.2587F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.8605F, 0.3547F, 1.2981F));

		PartDefinition cube_r300 = leftOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(108, 59).addBox(1.5186F, -2.6061F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9244F, 0.6863F, 1.4247F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(87, 98).addBox(0.9547F, -1.89F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9569F, 0.5199F, 1.3979F));

		PartDefinition cube_r302 = leftOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(5, 98).addBox(1.0891F, -2.3929F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 95).addBox(0.6891F, -2.3929F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9103F, 0.193F, 1.2663F));

		PartDefinition cube_r303 = leftOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(102, 97).addBox(0.5538F, -2.2459F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9218F, 0.3162F, 1.3121F));

		PartDefinition cube_r304 = leftOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(7, 84).addBox(-0.0845F, -1.5203F, -0.57F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 2.0379F, 0.7586F, 1.5326F));

		PartDefinition cube_r305 = leftOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(80, 83).addBox(-0.3006F, -1.8991F, -0.57F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.978F, 0.6004F, 1.4377F));

		PartDefinition cube_r306 = leftOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(73, 83).addBox(-0.7942F, -1.0322F, -0.6684F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9992F, 0.4753F, 1.4147F));

		PartDefinition cube_r307 = leftOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(66, 83).addBox(-0.7212F, -0.7524F, -0.6684F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 2.0465F, 0.6324F, 1.5042F));

		PartDefinition cube_r308 = leftOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(97, 92).addBox(0.3437F, -1.2707F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9568F, 0.1944F, 1.287F));

		PartDefinition cube_r309 = leftOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(105, 40).addBox(0.608F, -1.3987F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(105, 37).addBox(1.008F, -1.3987F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9502F, 0.0729F, 1.2377F));

		PartDefinition cube_r310 = leftOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(107, 6).addBox(0.5385F, -0.9834F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2141F, 5.4434F, -8.8881F, 1.9827F, 0.3956F, 1.3754F));

		PartDefinition cube_r311 = leftOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(85, 70).addBox(-1.5F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-2.0891F, 5.978F, -8.4353F, 1.8175F, 0.2508F, 1.3578F));

		PartDefinition cube_r312 = leftOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 102).addBox(0.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 101).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-1.975F, 6.5367F, -8.6082F, 1.8246F, -0.3422F, 1.2085F));

		PartDefinition cube_r313 = leftOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(102, 3).addBox(-0.3F, -0.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1011F, 6.1668F, -8.6936F, 1.8096F, -0.0034F, 1.2945F));

		PartDefinition cube_r314 = leftOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(92, 101).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-2.1011F, 6.1668F, -8.6936F, 1.8154F, -0.2153F, 1.2421F));

		PartDefinition cube_r315 = leftOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(84, 79).addBox(-1.5F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0891F, 5.978F, -8.4353F, 1.8104F, 0.0814F, 1.3152F));

		PartDefinition cube_r316 = leftOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(109, 27).addBox(-0.8884F, -0.1406F, -0.5377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 91).addBox(-0.8884F, 0.3594F, -0.5377F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-3.1638F, 4.8763F, -14.329F, 1.4723F, 0.1448F, 0.0199F));

		PartDefinition cube_r317 = leftOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(33, 91).addBox(-0.5F, -2.9F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.0469F, 4.0424F, -10.9502F, 1.6905F, 0.1448F, 0.0199F));

		PartDefinition cube_r318 = leftOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(91, 9).addBox(-0.5F, -2.7F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(90, 61).addBox(-0.5F, -2.7F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.356F, 3.8805F, -8.5324F, 1.644F, 0.2751F, 0.0065F));

		PartDefinition cube_r319 = leftOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(90, 44).addBox(-1.3033F, 3.0816F, -0.8177F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.1638F, 4.8763F, -14.329F, 1.5568F, 0.2751F, 0.0065F));

		PartDefinition cube_r320 = leftOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(49, 64).addBox(-1.1893F, -0.1684F, -0.9774F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6334F, 4.8043F, -8.3498F, 1.7316F, 0.3187F, 0.0066F));

		PartDefinition cube_r321 = leftOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(18, 74).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0602F, 4.0003F, -2.4709F, 2.0121F, -0.0351F, -0.1664F));

		PartDefinition cube_r322 = leftOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(9, 58).addBox(-1.1893F, 2.4377F, -1.4384F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-2.6334F, 4.8043F, -8.3498F, 1.9061F, 0.3187F, 0.0066F));

		PartDefinition cube_r323 = leftOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(69, 63).addBox(-1.0776F, -0.4266F, -1.4791F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -0.3196F, 0.482F, -1.7422F));

		PartDefinition cube_r324 = leftOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(33, 80).addBox(-0.3842F, -0.4266F, -1.5141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.243F))
				.texOffs(107, 89).addBox(0.1158F, -0.4266F, -1.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(88, 107).addBox(0.1158F, -0.4266F, -0.5141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -2.7267F, -0.8086F, 1.2432F));

		PartDefinition cube_r325 = leftOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(46, 74).addBox(-1.3143F, -0.4266F, -1.416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -2.5199F, 1.0725F, 2.1133F));

		PartDefinition cube_r326 = leftOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(106, 15).addBox(-0.0698F, -0.4266F, -1.3524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -2.8565F, 0.1448F, 1.5939F));

		PartDefinition cube_r327 = leftOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(25, 108).addBox(-0.0979F, -0.4266F, 0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -0.2821F, 0.0228F, -1.5966F));

		PartDefinition cube_r328 = leftOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(88, 41).addBox(-1.8864F, -0.4266F, 0.0512F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -0.4567F, 0.8878F, -1.9541F));

		PartDefinition cube_r329 = leftOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(106, 9).addBox(-0.5979F, -0.4266F, 1.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -0.2898F, -0.2285F, -1.5225F));

		PartDefinition cube_r330 = leftOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(30, 96).addBox(1.789F, -0.4266F, -0.0419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -1.7865F, -1.2818F, 0.2055F));

		PartDefinition cube_r331 = leftOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(51, 5).addBox(0.486F, -0.4266F, -6.0566F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -2.8563F, -0.1485F, 1.5083F));

		PartDefinition cube_r332 = leftOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(80, 57).addBox(1.213F, 0.5354F, 2.0939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -0.1697F, 0.3389F, -1.9266F));

		PartDefinition cube_r333 = leftOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(71, 8).addBox(-2.2F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.3763F, -2.6599F, 0.3758F, -0.1766F, -0.4359F, -1.7945F));

		PartDefinition cube_r334 = leftOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(19, 90).addBox(0.1F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.0186F, -1.3543F, 0.3317F, -0.1657F, -0.2639F, -1.8261F));

		PartDefinition cube_r335 = leftOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(67, 68).addBox(-3.8F, -0.8F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.2688F, -0.6542F, -1.3475F, -0.3631F, -0.419F, -1.4059F));

		PartDefinition cube_r336 = leftOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 43).addBox(-1.8F, -0.5F, -1.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.183F)), PartPose.offsetAndRotation(0.0186F, -1.3543F, 0.3317F, -0.2014F, -0.6502F, -1.7467F));

		PartDefinition cube_r337 = leftOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(88, 89).addBox(-1.0F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.189F)), PartPose.offsetAndRotation(0.0186F, -1.3543F, 0.3317F, -0.1652F, 0.2529F, -1.9114F));

		PartDefinition cube_r338 = leftOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(58, 89).addBox(-0.1284F, 0.5354F, 3.1903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.183F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.765F, -0.1794F, 0.4678F, -1.9513F));

		PartDefinition cube_r339 = leftOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(106, 18).addBox(-1.7633F, 0.4663F, 3.085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.765F, -0.268F, 0.7476F, -2.0548F));

		PartDefinition cube_r340 = leftOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 83).addBox(-2.5215F, 0.5354F, 2.4849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.765F, -0.3607F, 1.1026F, -2.1944F));

		PartDefinition cube_r341 = leftOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(106, 79).addBox(-2.7481F, 0.4663F, 1.1319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -2.4514F, 1.2609F, 1.9376F));

		PartDefinition cube_r342 = leftOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(69, 98).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4784F, 0.0086F, -0.9774F, 2.2778F, 0.8334F, 1.9196F));

		PartDefinition cube_r343 = leftOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(61, 98).addBox(-2.9224F, -0.1847F, 0.3698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, -2.5219F, 0.8334F, 1.9196F));

		PartDefinition cube_r344 = leftOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(35, 96).addBox(-0.8F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2457F, 0.8516F, -1.481F, 2.481F, -0.7669F, 0.7947F));

		PartDefinition cube_r345 = leftOrbit.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(40, 60).addBox(-0.6274F, 0.7324F, -0.4413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, 2.6273F, 0.455F, 0.0569F));

		PartDefinition cube_r346 = leftOrbit.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(93, 49).addBox(-0.5215F, -0.153F, -0.4551F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2417F, 2.5113F, -1.89F, 2.6104F, 0.3692F, -0.0096F));

		PartDefinition cube_r347 = leftOrbit.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(53, 107).addBox(-0.5155F, -0.4176F, -2.7145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(55, 13).addBox(-0.5155F, -0.9176F, -2.7145F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.2645F, 1.7942F, 4.7308F, -0.1343F, -0.1297F, 2.8795F));

		PartDefinition cube_r348 = leftOrbit.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(38, 15).addBox(-2.1F, 0.2F, -1.3F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.8058F, 2.2272F, 4.9286F, -0.5402F, 0.5715F, -3.1401F));

		PartDefinition cube_r349 = leftOrbit.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(25, 74).addBox(-0.5155F, -1.158F, -0.1204F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(1.2645F, 1.7942F, 4.7308F, -0.5357F, -0.1297F, 2.8795F));

		PartDefinition cube_r350 = leftOrbit.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(40, 80).addBox(-0.0984F, -0.4592F, -0.5276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.8895F, 2.1942F, 5.9308F, 0.5972F, -0.0949F, 3.0979F));

		PartDefinition cube_r351 = leftOrbit.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(87, 73).addBox(0.949F, -2.0526F, 0.5909F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.8895F, 2.1942F, 5.9308F, -0.0829F, -0.0254F, -2.8835F));

		PartDefinition cube_r352 = leftOrbit.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(19, 87).addBox(-0.0984F, -1.606F, 0.5345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.8895F, 2.1942F, 5.9308F, -0.0573F, -0.0949F, 3.0979F));

		PartDefinition cube_r353 = leftOrbit.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(58, 64).addBox(-0.5109F, 1.0135F, -1.4705F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F))
				.texOffs(54, 82).addBox(-0.5155F, -2.4276F, -0.3639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(40, 97).addBox(-0.5155F, -0.8276F, 0.3361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.2645F, 1.7942F, 4.7308F, 1.3405F, -0.1297F, 2.8795F));

		PartDefinition cube_r354 = leftOrbit.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(51, 0).addBox(1.5875F, 0.1487F, -0.0228F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.8895F, 2.1942F, 5.9308F, 1.1326F, 0.1744F, -2.6841F));

		PartDefinition cube_r355 = leftOrbit.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(61, 43).addBox(-0.0984F, 0.0689F, -0.5055F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(1.8895F, 2.1942F, 5.9308F, 1.0772F, -0.0949F, 3.0979F));

		PartDefinition cube_r356 = leftOrbit.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(96, 25).addBox(-0.5155F, 0.8918F, -1.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.2645F, 1.7942F, 4.7308F, -1.452F, -0.1297F, 2.8795F));

		PartDefinition cube_r357 = leftOrbit.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(108, 49).addBox(-0.5155F, 0.3138F, -1.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.2645F, 1.7942F, 4.7308F, -1.2338F, -0.1297F, 2.8795F));

		PartDefinition cube_r358 = leftOrbit.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(5, 106).addBox(-0.103F, -0.4628F, -0.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.8895F, 2.1942F, 5.9308F, -3.1116F, -0.0949F, 3.0979F));

		PartDefinition cube_r359 = leftOrbit.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(26, 80).addBox(-0.475F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.5413F, 2.318F, 5.6199F, 2.8114F, -0.0467F, 2.9901F));

		PartDefinition cube_r360 = leftOrbit.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(101, 0).addBox(-0.5155F, -1.4949F, -0.8887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.2645F, 1.7942F, 4.7308F, 0.2061F, -0.1297F, 2.8795F));

		PartDefinition cube_r361 = leftOrbit.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(69, 30).addBox(-0.5155F, -0.1315F, -2.6459F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.2645F, 1.7942F, 4.7308F, -0.2303F, -0.1297F, 2.8795F));

		PartDefinition cube_r362 = leftOrbit.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(46, 57).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6732F, -2.3581F, -0.558F, -0.429F, 0.1281F, -0.1984F));

		PartDefinition cube_r363 = leftOrbit.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(7, 80).addBox(0.6106F, -0.5212F, 0.0576F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.8F, -3.7722F, -0.1386F, -0.1327F, 0.2275F, 0.8039F));

		PartDefinition cube_r364 = leftOrbit.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(93, 34).addBox(-0.077F, -0.0518F, -0.0468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.8F, -3.7722F, -0.1386F, -0.1718F, -0.003F, 0.2644F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.8F, -1.1067F, -8.1002F));

		PartDefinition cube_r365 = rightOrbit.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(35, 54).mirror().addBox(0.0F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.8F, 4.2895F, -9.6754F, -3.0273F, -0.1214F, -0.0139F));

		PartDefinition cube_r366 = rightOrbit.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(62, 5).mirror().addBox(-0.075F, -0.1F, -2.85F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7615F, 2.8854F, -7.211F, 2.8057F, 0.0334F, 1.8046F));

		PartDefinition cube_r367 = rightOrbit.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.9F, -0.05F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2654F, 4.2542F, -9.7484F, 2.873F, -0.1019F, 1.77F));

		PartDefinition cube_r368 = rightOrbit.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(64, 57).mirror().addBox(-0.075F, -0.7F, -0.05F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3F, 3.0214F, -6.984F, 2.82F, -0.1281F, 1.871F));

		PartDefinition cube_r369 = rightOrbit.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(58, 68).mirror().addBox(0.0F, -1.0F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.3F, 3.0214F, -6.984F, -2.9384F, -0.1539F, -0.0316F));

		PartDefinition cube_r370 = rightOrbit.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(70, 39).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -4.0784F, 0.8691F, -1.4028F, -0.1687F, -0.3747F));

		PartDefinition cube_r371 = rightOrbit.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -3.8514F, 1.3146F, -0.44F, -0.1746F, -0.3536F));

		PartDefinition cube_r372 = rightOrbit.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(39, 70).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -3.5764F, 2.0405F, -1.8053F, -0.096F, -0.3814F));

		PartDefinition cube_r373 = rightOrbit.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -3.2639F, 2.9882F, -0.3573F, -0.1439F, -0.3667F));

		PartDefinition cube_r374 = rightOrbit.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -2.5842F, 4.3221F, -0.4816F, -0.1896F, -0.346F));

		PartDefinition cube_r375 = rightOrbit.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(24, 54).mirror().addBox(-2.0F, -0.5F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -1.7572F, 5.5641F, 0.8769F, -0.2589F, -0.2986F));

		PartDefinition cube_r376 = rightOrbit.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9716F, -0.2862F, 5.6332F, 0.7013F, -0.5391F, 0.2552F));

		PartDefinition cube_r377 = rightOrbit.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(87, 101).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7803F, -0.0623F, 5.2292F, 0.3435F, -0.5391F, 0.2552F));

		PartDefinition cube_r378 = rightOrbit.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(70, 35).mirror().addBox(-3.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.8F, 0.9064F, 7.6069F, 0.5404F, -0.3413F, -0.1982F));

		PartDefinition cube_r379 = rightOrbit.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(107, 3).mirror().addBox(0.7279F, 0.7579F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0841F, -0.2916F, -1.5406F));

		PartDefinition cube_r380 = rightOrbit.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(98, 85).mirror().addBox(-1.1239F, 1.0511F, -0.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.1685F, 0.5814F, -1.0221F));

		PartDefinition cube_r381 = rightOrbit.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-0.544F, 1.0949F, -0.7793F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.127F, 0.4717F, -1.1047F));

		PartDefinition cube_r382 = rightOrbit.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(87, 94).mirror().addBox(1.3133F, -2.0334F, -0.7793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.6645F, -1.0129F, -2.4036F));

		PartDefinition cube_r383 = rightOrbit.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(26, 87).mirror().addBox(-0.2297F, 0.2275F, -0.5227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(106, 21).mirror().addBox(-0.754F, -1.104F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0485F, 0.3158F, -1.1653F));

		PartDefinition cube_r384 = rightOrbit.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(107, 92).mirror().addBox(-0.6991F, 0.2321F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(74, 98).mirror().addBox(-1.0991F, 0.2321F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 3).mirror().addBox(-1.4452F, -1.1563F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(26, 105).mirror().addBox(-1.0452F, -1.1563F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0726F, 0.4313F, -1.0992F));

		PartDefinition cube_r385 = rightOrbit.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(79, 91).mirror().addBox(0.3941F, -2.1125F, -0.5227F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.9572F, -1.1102F, -2.6902F));

		PartDefinition cube_r386 = rightOrbit.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(31, 105).mirror().addBox(0.2655F, -0.0404F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0812F, -0.4635F, -1.5699F));

		PartDefinition cube_r387 = rightOrbit.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-0.9267F, -0.9482F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0266F, 0.1208F, -1.2657F));

		PartDefinition cube_r388 = rightOrbit.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(86, 49).mirror().addBox(-0.3376F, -0.7457F, -0.4685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0364F, -0.2319F, -1.4396F));

		PartDefinition cube_r389 = rightOrbit.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(102, 94).mirror().addBox(-0.745F, -0.7385F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0622F, -0.3869F, -1.5239F));

		PartDefinition cube_r390 = rightOrbit.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(59, 83).mirror().addBox(-0.6609F, -0.9642F, -0.4685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0288F, -0.1537F, -1.4F));

		PartDefinition cube_r391 = rightOrbit.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-0.5933F, -1.0505F, -0.4685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 2.0235F, 0.0423F, -1.3041F));

		PartDefinition cube_r392 = rightOrbit.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(82, 19).mirror().addBox(-1.1214F, -2.0462F, -0.345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 1.9806F, -0.1241F, -1.3327F));

		PartDefinition cube_r393 = rightOrbit.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-1.3717F, -1.7656F, -0.345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 1.9952F, -0.2838F, -1.4048F));

		PartDefinition cube_r394 = rightOrbit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(95, 65).mirror().addBox(-0.9582F, -2.2124F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 1.9825F, 0.1563F, -1.2111F));

		PartDefinition cube_r395 = rightOrbit.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(21, 105).mirror().addBox(-1.103F, -2.282F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(16, 105).mirror().addBox(-1.503F, -2.282F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 1.9942F, 0.2759F, -1.1568F));

		PartDefinition cube_r396 = rightOrbit.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(96, 16).mirror().addBox(-1.366F, -1.9862F, -0.345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5864F, 5.4443F, -3.8125F, 1.9776F, -0.044F, -1.2979F));

		PartDefinition cube_r397 = rightOrbit.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(102, 91).mirror().addBox(-0.6765F, 0.8711F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3261F, 6.1668F, -7.5936F, 1.8936F, -0.0204F, -1.2952F));

		PartDefinition cube_r398 = rightOrbit.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(102, 106).mirror().addBox(-1.8323F, 0.6388F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(43, 102).mirror().addBox(-1.4323F, 0.6388F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(1.3261F, 6.1668F, -7.5936F, 1.9103F, 0.3101F, -1.1811F));

		PartDefinition cube_r399 = rightOrbit.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(33, 102).mirror().addBox(-0.9035F, 0.7264F, -0.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.3261F, 6.1668F, -7.5936F, 1.8994F, 0.1864F, -1.2253F));

		PartDefinition cube_r400 = rightOrbit.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(86, 38).mirror().addBox(0.0338F, 0.8158F, -0.8537F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.3261F, 6.1668F, -7.5936F, 1.906F, -0.2683F, -1.3805F));

		PartDefinition cube_r401 = rightOrbit.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(86, 35).mirror().addBox(-0.1854F, 0.7401F, -0.8537F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3261F, 6.1668F, -7.5936F, 1.8953F, -0.1031F, -1.323F));

		PartDefinition cube_r402 = rightOrbit.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(-0.2748F, -0.325F, -0.5935F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6261F, 6.1668F, -7.5936F, 1.8953F, -0.1031F, -1.323F));

		PartDefinition cube_r403 = rightOrbit.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.2391F, -0.2175F, -0.5935F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.6261F, 6.1668F, -7.5936F, 1.906F, -0.2683F, -1.3805F));

		PartDefinition cube_r404 = rightOrbit.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(28, 102).mirror().addBox(-0.6685F, -0.3162F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.6261F, 6.1668F, -7.5936F, 1.8994F, 0.1864F, -1.2253F));

		PartDefinition cube_r405 = rightOrbit.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(23, 102).mirror().addBox(-1.0632F, -0.3642F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(18, 102).mirror().addBox(-1.4632F, -0.3642F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6261F, 6.1668F, -7.5936F, 1.9103F, 0.3101F, -1.1811F));

		PartDefinition cube_r406 = rightOrbit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(102, 6).mirror().addBox(-0.6727F, -0.1977F, -0.5935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6261F, 6.1668F, -7.5936F, 1.8936F, -0.0204F, -1.2952F));

		PartDefinition cube_r407 = rightOrbit.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(103, 31).mirror().addBox(-2.17F, -2.1248F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 108).mirror().addBox(-1.83F, -1.3635F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.7898F, -0.7546F, -1.3547F));

		PartDefinition cube_r408 = rightOrbit.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(108, 33).mirror().addBox(-1.8111F, -2.6872F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(20, 108).mirror().addBox(-1.7519F, -1.8555F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.7444F, -0.412F, -1.2735F));

		PartDefinition cube_r409 = rightOrbit.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(83, 107).mirror().addBox(-1.7132F, -2.5217F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(108, 46).mirror().addBox(-1.546F, -1.7049F, -0.3627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.7565F, -0.5408F, -1.2998F));

		PartDefinition cube_r410 = rightOrbit.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(86, 52).mirror().addBox(-2.1842F, -1.6914F, -0.2774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(87, 28).mirror().addBox(-1.6587F, -1.044F, -0.3627F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.872F, -1.0079F, -1.4603F));

		PartDefinition cube_r411 = rightOrbit.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(87, 31).mirror().addBox(-1.9344F, -2.1142F, -0.2774F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 3).mirror().addBox(-1.5293F, -1.3855F, -0.3627F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.8101F, -0.8396F, -1.3831F));

		PartDefinition cube_r412 = rightOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-1.1862F, -0.5567F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.7633F, -0.8385F, -1.3509F));

		PartDefinition cube_r413 = rightOrbit.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(108, 30).mirror().addBox(-1.4229F, -0.8771F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.7166F, -0.4942F, -1.2765F));

		PartDefinition cube_r414 = rightOrbit.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(108, 56).mirror().addBox(-1.092F, -0.7778F, -0.3705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.729F, -0.6236F, -1.2999F));

		PartDefinition cube_r415 = rightOrbit.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(89, 23).mirror().addBox(-0.828F, -0.4313F, -0.3705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.8528F, -1.0933F, -1.4588F));

		PartDefinition cube_r416 = rightOrbit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-0.8176F, -0.6378F, -0.3705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.2641F, 5.4434F, -12.2881F, 1.7846F, -0.924F, -1.3785F));

		PartDefinition cube_r417 = rightOrbit.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-2.3236F, -2.5633F, -0.5609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9523F, -0.7678F, -1.4667F));

		PartDefinition cube_r418 = rightOrbit.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-2.6455F, -2.0661F, -0.5609F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 2.0336F, -0.9272F, -1.5746F));

		PartDefinition cube_r419 = rightOrbit.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(102, 100).mirror().addBox(-1.9493F, -3.0671F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.8776F, -0.4798F, -1.3401F));

		PartDefinition cube_r420 = rightOrbit.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(106, 24).mirror().addBox(-1.9741F, -3.2587F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(30, 108).mirror().addBox(-2.374F, -3.2587F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.8605F, -0.3547F, -1.2981F));

		PartDefinition cube_r421 = rightOrbit.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(108, 59).mirror().addBox(-2.5186F, -2.6061F, -0.5609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9244F, -0.6863F, -1.4247F));

		PartDefinition cube_r422 = rightOrbit.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(87, 98).mirror().addBox(-1.9547F, -1.89F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9569F, -0.5199F, -1.3979F));

		PartDefinition cube_r423 = rightOrbit.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-2.0891F, -2.3929F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 95).mirror().addBox(-1.6891F, -2.3929F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9103F, -0.193F, -1.2663F));

		PartDefinition cube_r424 = rightOrbit.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(102, 97).mirror().addBox(-1.5538F, -2.2459F, -0.57F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9218F, -0.3162F, -1.3121F));

		PartDefinition cube_r425 = rightOrbit.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-1.9155F, -1.5203F, -0.57F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 2.0379F, -0.7586F, -1.5326F));

		PartDefinition cube_r426 = rightOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-1.6994F, -1.8991F, -0.57F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.978F, -0.6004F, -1.4377F));

		PartDefinition cube_r427 = rightOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(73, 83).mirror().addBox(-1.2058F, -1.0322F, -0.6684F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9992F, -0.4753F, -1.4147F));

		PartDefinition cube_r428 = rightOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(66, 83).mirror().addBox(-1.2788F, -0.7524F, -0.6684F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 2.0465F, -0.6324F, -1.5042F));

		PartDefinition cube_r429 = rightOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(97, 92).mirror().addBox(-1.3437F, -1.2707F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9568F, -0.1944F, -1.287F));

		PartDefinition cube_r430 = rightOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(105, 40).mirror().addBox(-1.608F, -1.3987F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(105, 37).mirror().addBox(-2.008F, -1.3987F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9502F, -0.0729F, -1.2377F));

		PartDefinition cube_r431 = rightOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(107, 6).mirror().addBox(-1.5385F, -0.9834F, -0.6684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2142F, 5.4434F, -8.8881F, 1.9827F, -0.3956F, -1.3754F));

		PartDefinition cube_r432 = rightOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(85, 70).mirror().addBox(-0.5F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(2.0891F, 5.978F, -8.4353F, 1.8175F, -0.2508F, -1.3578F));

		PartDefinition cube_r433 = rightOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-1.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 101).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(1.975F, 6.5367F, -8.6082F, 1.8246F, 0.3422F, -1.2085F));

		PartDefinition cube_r434 = rightOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(102, 3).mirror().addBox(-0.7F, -0.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1011F, 6.1668F, -8.6936F, 1.8096F, 0.0034F, -1.2945F));

		PartDefinition cube_r435 = rightOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(92, 101).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(2.1011F, 6.1668F, -8.6936F, 1.8154F, 0.2153F, -1.2421F));

		PartDefinition cube_r436 = rightOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(84, 79).mirror().addBox(-0.5F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0891F, 5.978F, -8.4353F, 1.8104F, -0.0814F, -1.3152F));

		PartDefinition cube_r437 = rightOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(109, 27).mirror().addBox(-0.1116F, -0.1406F, -0.5377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(38, 91).mirror().addBox(-0.1116F, 0.3594F, -0.5377F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(3.1638F, 4.8763F, -14.329F, 1.4723F, -0.1448F, -0.0199F));

		PartDefinition cube_r438 = rightOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-0.5F, -2.9F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.0469F, 4.0424F, -10.9502F, 1.6905F, -0.1448F, -0.0199F));

		PartDefinition cube_r439 = rightOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(91, 9).mirror().addBox(-0.5F, -2.7F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(90, 61).mirror().addBox(-0.5F, -2.7F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.356F, 3.8805F, -8.5324F, 1.644F, -0.2751F, -0.0065F));

		PartDefinition cube_r440 = rightOrbit.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(90, 44).mirror().addBox(0.3033F, 3.0816F, -0.8177F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.1638F, 4.8763F, -14.329F, 1.5568F, -0.2751F, -0.0065F));

		PartDefinition cube_r441 = rightOrbit.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(49, 64).mirror().addBox(-0.8107F, -0.1684F, -0.9774F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.6334F, 4.8043F, -8.3498F, 1.7316F, -0.3187F, -0.0066F));

		PartDefinition cube_r442 = rightOrbit.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(18, 74).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0601F, 4.0003F, -2.4709F, 2.0121F, 0.0351F, 0.1664F));

		PartDefinition cube_r443 = rightOrbit.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-0.8107F, 2.4377F, -1.4384F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(2.6334F, 4.8043F, -8.3498F, 1.9061F, -0.3187F, -0.0066F));

		PartDefinition cube_r444 = rightOrbit.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(69, 63).mirror().addBox(-0.9224F, -0.4266F, -1.4791F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -0.3196F, -0.482F, 1.7422F));

		PartDefinition cube_r445 = rightOrbit.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(-0.6158F, -0.4266F, -1.5141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.243F)).mirror(false)
				.texOffs(107, 89).mirror().addBox(-1.1158F, -0.4266F, -1.0141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(88, 107).mirror().addBox(-1.1158F, -0.4266F, -0.5141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -2.7267F, 0.8086F, -1.2432F));

		PartDefinition cube_r446 = rightOrbit.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(46, 74).mirror().addBox(0.3143F, -0.4266F, -1.416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -2.5199F, -1.0725F, -2.1133F));

		PartDefinition cube_r447 = rightOrbit.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(106, 15).mirror().addBox(-0.9302F, -0.4266F, -1.3524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -2.8565F, -0.1448F, -1.5939F));

		PartDefinition cube_r448 = rightOrbit.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(25, 108).mirror().addBox(-0.9021F, -0.4266F, 0.3421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -0.2821F, -0.0228F, 1.5966F));

		PartDefinition cube_r449 = rightOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(88, 41).mirror().addBox(-0.1136F, -0.4266F, 0.0512F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -0.4567F, -0.8878F, 1.9541F));

		PartDefinition cube_r450 = rightOrbit.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(106, 9).mirror().addBox(-0.4021F, -0.4266F, 1.3771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -0.2898F, 0.2285F, 1.5225F));

		PartDefinition cube_r451 = rightOrbit.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(30, 96).mirror().addBox(-2.789F, -0.4266F, -0.0419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -1.7865F, 1.2818F, -0.2055F));

		PartDefinition cube_r452 = rightOrbit.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(51, 5).mirror().addBox(-1.486F, -0.4266F, -6.0566F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -2.8563F, 0.1485F, -1.5083F));

		PartDefinition cube_r453 = rightOrbit.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(80, 57).mirror().addBox(-2.213F, 0.5354F, 2.0939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -0.1697F, -0.3389F, 1.9266F));

		PartDefinition cube_r454 = rightOrbit.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-0.8F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.3763F, -2.6599F, 0.3758F, -0.1766F, 0.4359F, 1.7945F));

		PartDefinition cube_r455 = rightOrbit.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(19, 90).mirror().addBox(-2.1F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.0186F, -1.3543F, 0.3317F, -0.1657F, 0.2639F, 1.8261F));

		PartDefinition cube_r456 = rightOrbit.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-0.2F, -0.8F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.2688F, -0.6542F, -1.3475F, -0.3631F, 0.419F, 1.4059F));

		PartDefinition cube_r457 = rightOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(72, 43).mirror().addBox(-0.2F, -0.5F, -1.05F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.183F)).mirror(false), PartPose.offsetAndRotation(-0.0186F, -1.3543F, 0.3317F, -0.2014F, 0.6502F, 1.7467F));

		PartDefinition cube_r458 = rightOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-1.0F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.189F)).mirror(false), PartPose.offsetAndRotation(-0.0186F, -1.3543F, 0.3317F, -0.1652F, -0.2529F, 1.9114F));

		PartDefinition cube_r459 = rightOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-1.8716F, 0.5354F, 3.1903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.183F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.765F, -0.1794F, -0.4678F, 1.9513F));

		PartDefinition cube_r460 = rightOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(106, 18).mirror().addBox(0.7632F, 0.4663F, 3.085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.765F, -0.268F, -0.7476F, 2.0548F));

		PartDefinition cube_r461 = rightOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(0.5215F, 0.5354F, 2.4849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.765F, -0.3607F, -1.1026F, 2.1944F));

		PartDefinition cube_r462 = rightOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(1.7481F, 0.4663F, 1.1319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -2.4514F, -1.2609F, -1.9376F));

		PartDefinition cube_r463 = rightOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(69, 98).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4784F, 0.0086F, -0.9774F, 2.2778F, -0.8334F, -1.9196F));

		PartDefinition cube_r464 = rightOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(61, 98).mirror().addBox(1.9224F, -0.1847F, 0.3698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, -2.5219F, -0.8334F, -1.9196F));

		PartDefinition cube_r465 = rightOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(35, 96).mirror().addBox(-0.2F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2457F, 0.8516F, -1.481F, 2.481F, 0.7669F, -0.7947F));

		PartDefinition cube_r466 = rightOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-0.3726F, 0.7324F, -0.4413F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, 2.6273F, -0.455F, -0.0569F));

		PartDefinition cube_r467 = rightOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(93, 49).mirror().addBox(-0.4785F, -0.153F, -0.4551F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.2417F, 2.5113F, -1.89F, 2.6104F, -0.3692F, 0.0096F));

		PartDefinition cube_r468 = rightOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(53, 107).mirror().addBox(-0.4845F, -0.4176F, -2.7145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(55, 13).mirror().addBox(-0.4845F, -0.9176F, -2.7145F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.7942F, 4.7308F, -0.1343F, 0.1297F, -2.8795F));

		PartDefinition cube_r469 = rightOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(38, 15).mirror().addBox(-2.9F, 0.2F, -1.3F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.8058F, 2.2272F, 4.9286F, -0.5402F, -0.5715F, 3.1401F));

		PartDefinition cube_r470 = rightOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(25, 74).mirror().addBox(-0.4845F, -1.158F, -0.1204F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.7942F, 4.7308F, -0.5357F, 0.1297F, -2.8795F));

		PartDefinition cube_r471 = rightOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.9016F, -0.4592F, -0.5276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.8895F, 2.1942F, 5.9308F, 0.5972F, 0.0949F, -3.0979F));

		PartDefinition cube_r472 = rightOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(87, 73).mirror().addBox(-2.949F, -2.0526F, 0.5909F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.8895F, 2.1942F, 5.9308F, -0.0829F, 0.0254F, 2.8835F));

		PartDefinition cube_r473 = rightOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-1.9016F, -1.606F, 0.5345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.8895F, 2.1942F, 5.9308F, -0.0573F, 0.0949F, -3.0979F));

		PartDefinition cube_r474 = rightOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(58, 64).mirror().addBox(-2.4891F, 1.0135F, -1.4705F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(54, 82).mirror().addBox(-0.4845F, -2.4276F, -0.3639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(40, 97).mirror().addBox(-0.4845F, -0.8276F, 0.3361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.7942F, 4.7308F, 1.3405F, 0.1297F, -2.8795F));

		PartDefinition cube_r475 = rightOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-4.5875F, 0.1487F, -0.0228F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.8895F, 2.1942F, 5.9308F, 1.1326F, -0.1744F, 2.6841F));

		PartDefinition cube_r476 = rightOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-2.9016F, 0.0689F, -0.5055F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-1.8895F, 2.1942F, 5.9308F, 1.0772F, 0.0949F, -3.0979F));

		PartDefinition cube_r477 = rightOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(96, 25).mirror().addBox(-0.4845F, 0.8918F, -1.365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.7942F, 4.7308F, -1.452F, 0.1297F, -2.8795F));

		PartDefinition cube_r478 = rightOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(108, 49).mirror().addBox(-0.4845F, 0.3138F, -1.5737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.7942F, 4.7308F, -1.2338F, 0.1297F, -2.8795F));

		PartDefinition cube_r479 = rightOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-0.897F, -0.4628F, -0.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.8895F, 2.1942F, 5.9308F, -3.1116F, 0.0949F, -3.0979F));

		PartDefinition cube_r480 = rightOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(26, 80).mirror().addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.5413F, 2.318F, 5.6199F, 2.8114F, 0.0467F, -2.9901F));

		PartDefinition cube_r481 = rightOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.4845F, -1.4949F, -0.8887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.7942F, 4.7308F, 0.2061F, 0.1297F, -2.8795F));

		PartDefinition cube_r482 = rightOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.4845F, -0.1315F, -2.6459F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.2645F, 1.7942F, 4.7308F, -0.2303F, 0.1297F, -2.8795F));

		PartDefinition cube_r483 = rightOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(46, 57).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6732F, -2.3581F, -0.558F, -0.429F, -0.1281F, 0.1984F));

		PartDefinition cube_r484 = rightOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-2.6106F, -0.5212F, 0.0576F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.8F, -3.7722F, -0.1386F, -0.1327F, -0.2275F, -0.8039F));

		PartDefinition cube_r485 = rightOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(93, 34).mirror().addBox(-0.923F, -0.0518F, -0.0468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.8F, -3.7722F, -0.1386F, -0.1718F, 0.003F, -0.2644F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.9933F, -1.1665F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(60, 32).mirror().addBox(-0.5F, 0.0F, -2.875F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.616F, 0.1956F, -1.9744F, -1.8762F, -0.1745F, 0.0F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(57, 50).mirror().addBox(-0.5F, -1.5F, -2.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1266F, -2.2936F, -4.7502F, -1.5708F, -0.1745F, 0.0F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(32, 71).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3871F, -4.3936F, -3.273F, -1.9635F, -0.1745F, 0.0F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(32, 65).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7079F, -3.6282F, -1.4533F, -2.5307F, -0.1745F, 0.0F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.5F, -1.1F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.8102F, -0.9535F, -0.8733F, -2.5307F, -0.1745F, 0.0F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(55, 57).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.2783F, -0.2866F, -3.8899F, -1.946F, -0.1745F, 0.0F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(48, 78).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6095F, 0.3148F, -2.0114F, 2.9671F, -0.1745F, 0.0F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(16, 65).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7936F, -1.3861F, -6.6387F, -1.9897F, -0.1745F, 0.0F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(9, 65).mirror().addBox(-0.5F, -0.1F, -0.125F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9682F, -4.1965F, -5.6482F, -1.7017F, -0.1745F, 0.0F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(51, 94).mirror().addBox(-0.0076F, 0.0759F, -0.9579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(38, 103).mirror().addBox(-0.0076F, 1.8325F, -1.7765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, -2.0769F, -0.3491F, 0.0698F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(94, 72).mirror().addBox(-0.0076F, -0.0779F, -1.9578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, -1.9984F, -0.3491F, 0.0698F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(103, 34).mirror().addBox(-0.0076F, 2.0371F, -0.5981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, -2.2515F, -0.3491F, 0.0698F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(43, 105).mirror().addBox(-0.0076F, -0.3349F, -3.9905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, -0.7679F, -0.3491F, 0.0698F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(94, 55).mirror().addBox(-0.0076F, -5.9174F, -1.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.7156F, -0.3491F, 0.0698F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(56, 94).mirror().addBox(-0.0076F, -7.8325F, -1.4207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.6458F, -0.3491F, 0.0698F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(-0.9943F, -1.8449F, -0.9103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 40).mirror().addBox(-0.9943F, -1.8449F, -0.6103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -8.8131F, -14.7374F, 0.5545F, -0.2273F, -0.0209F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(105, 43).mirror().addBox(-0.9943F, -2.7103F, -1.1433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(105, 86).mirror().addBox(-0.9943F, -2.7103F, -0.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -8.8131F, -14.7374F, 0.4236F, -0.2273F, -0.0209F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(93, 107).mirror().addBox(-0.9943F, -1.4873F, 2.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -8.8131F, -14.7374F, 1.8635F, -0.2273F, -0.0209F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(103, 47).mirror().addBox(-0.0076F, -1.2624F, -3.9371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, -0.6807F, -0.3491F, 0.0698F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(90, 66).mirror().addBox(-0.0076F, -5.8995F, -0.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.8029F, -0.3491F, 0.0698F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(92, 94).mirror().addBox(-0.0076F, -7.853F, -0.7721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.6894F, -0.3491F, 0.0698F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.9943F, -0.4933F, 2.6264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -8.8131F, -14.7374F, 2.1253F, -0.2273F, -0.0209F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(41, 108).mirror().addBox(-1.0928F, -2.0192F, 3.2109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -8.8131F, -14.7374F, 1.7326F, -0.2273F, -0.0209F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(36, 106).mirror().addBox(-1.0928F, -0.2086F, 3.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -8.8131F, -14.7374F, 2.1689F, -0.2273F, -0.0209F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(87, 55).mirror().addBox(-0.2731F, -0.7428F, -0.5314F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.9628F, -8.783F, -13.3675F, 1.1378F, 0.1838F, 1.4577F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(87, 58).mirror().addBox(-0.31F, -0.6292F, -0.5314F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9628F, -8.783F, -13.3675F, 1.1454F, 0.0251F, 1.5306F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(76, 95).mirror().addBox(-0.5412F, -0.7142F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.9628F, -8.783F, -13.3675F, 1.0927F, 0.4586F, 1.3165F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(98, 32).mirror().addBox(-0.8851F, -0.7421F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 89).mirror().addBox(-1.2851F, -0.7421F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9628F, -8.783F, -13.3675F, 1.0573F, 0.5738F, 1.2449F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(58, 107).mirror().addBox(-0.6346F, -0.6137F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.9628F, -8.783F, -13.3675F, 1.1294F, 0.2629F, 1.4198F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(103, 50).mirror().addBox(-2.3617F, -6.175F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(103, 58).mirror().addBox(-1.9617F, -6.175F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(103, 64).mirror().addBox(-2.1099F, -5.0629F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(102, 103).mirror().addBox(-2.5099F, -5.0629F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(98, 35).mirror().addBox(-2.4565F, -4.0518F, -0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(107, 95).mirror().addBox(-2.765F, -3.1944F, -0.2945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.8096F, 0.764F, 1.0501F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-3.5045F, -5.3507F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(103, 83).mirror().addBox(-3.2634F, -4.255F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(63, 107).mirror().addBox(-3.2433F, -3.1863F, -0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(73, 107).mirror().addBox(-3.2399F, -2.2751F, -0.2945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.9707F, 0.4908F, 1.3209F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(103, 61).mirror().addBox(-2.3178F, -5.9601F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(96, 0).mirror().addBox(-2.3195F, -4.8381F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(104, 27).mirror().addBox(-2.5312F, -3.7904F, -0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(68, 107).mirror().addBox(-2.7252F, -2.9001F, -0.2945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.8849F, 0.6658F, 1.1649F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-4.3081F, -4.4621F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(47, 82).mirror().addBox(-3.7916F, -3.4661F, -0.6032F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(14, 84).mirror().addBox(-3.4956F, -2.439F, -0.4374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 86).mirror().addBox(-3.2566F, -1.5597F, -0.2945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 1.0276F, 0.2701F, 1.4732F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-3.5449F, -5.2116F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(82, 25).mirror().addBox(-3.2092F, -4.141F, -0.6032F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(21, 84).mirror().addBox(-3.096F, -3.0782F, -0.4374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(59, 86).mirror().addBox(-3.0133F, -2.1708F, -0.2945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.0131F, -10.2374F, 0.9943F, 0.4182F, 1.3748F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(78, 107).mirror().addBox(-0.7208F, -0.7006F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.4858F, -5.2382F, -9.5605F, 0.5633F, 1.1035F, 0.6303F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-1.2472F, -0.2831F, -0.5015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.4858F, -5.2382F, -9.5605F, 1.1508F, 0.3652F, 1.4451F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(107, 98).mirror().addBox(-0.3543F, -0.5034F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-3.4858F, -5.2382F, -9.5605F, -1.0608F, 0.6759F, -1.2195F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.7665F, -0.3079F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.4858F, -5.2382F, -9.5605F, -1.1363F, -0.4399F, -1.7513F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(98, 47).mirror().addBox(-0.1847F, -0.5062F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.4858F, -5.2382F, -9.5605F, 1.1363F, 0.4399F, 1.3903F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(-0.181F, -0.4981F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6911F, -5.023F, -8.6078F, 1.3271F, 0.4774F, 1.4502F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(98, 50).mirror().addBox(-0.7702F, -0.3159F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.6911F, -5.023F, -8.6078F, -1.3271F, -0.4774F, -1.6914F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(107, 101).mirror().addBox(-0.3631F, -0.5027F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-3.6911F, -5.023F, -8.6078F, -1.284F, 0.7113F, -1.3874F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(87, 76).mirror().addBox(-1.2429F, -0.2754F, -0.4997F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6911F, -5.023F, -8.6078F, 1.3367F, 0.3946F, 1.4894F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(107, 104).mirror().addBox(-0.7242F, -0.6924F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6911F, -5.023F, -8.6078F, 0.8493F, 1.2404F, 0.8699F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(108, 62).mirror().addBox(-0.7349F, -0.7142F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8234F, -4.8494F, -7.57F, 0.9609F, 1.2668F, 0.9759F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(26, 90).mirror().addBox(-1.0665F, -0.2801F, -0.5114F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8234F, -4.8494F, -7.57F, 1.3838F, 0.3977F, 1.5076F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(-0.3488F, -0.5222F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-3.8234F, -4.8494F, -7.57F, -1.341F, 0.7185F, -1.4248F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(48, 104).mirror().addBox(-0.7469F, -0.3091F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.8234F, -4.8494F, -7.57F, -1.376F, -0.4821F, -1.6688F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-0.2043F, -0.5049F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8234F, -4.8494F, -7.57F, 1.376F, 0.4821F, 1.4728F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(96, 9).mirror().addBox(-2.937F, -8.1867F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 96).mirror().addBox(-2.537F, -8.1867F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.2881F, -10.3124F, 0.9174F, 0.6213F, 1.1762F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(53, 104).mirror().addBox(-4.7331F, -7.0444F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.2881F, -10.3124F, 1.0206F, 0.3322F, 1.3979F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(15, 108).mirror().addBox(-3.1507F, -7.8795F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.2881F, -10.3124F, 0.9667F, 0.5153F, 1.2675F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(28, 84).mirror().addBox(-5.9333F, -5.78F, -0.7534F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.2881F, -10.3124F, 1.0505F, 0.1067F, 1.5344F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-4.9165F, -6.7918F, -0.7534F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-3.659F, -3.2881F, -10.3124F, 1.0343F, 0.2575F, 1.4451F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(17, 81).mirror().addBox(-1.5431F, -0.6366F, -1.2116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -9.1131F, -14.9374F, 1.1737F, 0.1057F, 1.4606F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(92, 98).mirror().addBox(-1.6315F, -1.2901F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -9.1131F, -14.9374F, 1.1048F, 0.5434F, 1.2505F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(104, 53).mirror().addBox(-1.8909F, -1.4554F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 98).mirror().addBox(-2.2909F, -1.4554F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -9.1131F, -14.9374F, 1.0627F, 0.6591F, 1.1762F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(107, 107).mirror().addBox(-1.8237F, -0.94F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.559F, -9.1131F, -14.9374F, 1.1496F, 0.3462F, 1.354F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(58, 104).mirror().addBox(-1.2122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 59).mirror().addBox(-0.8122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2881F, -11.2967F, -15.5287F, 1.0627F, 0.6591F, 1.1064F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-0.5743F, -0.6611F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.2881F, -11.2967F, -15.5287F, 1.1496F, 0.3462F, 1.2842F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(96, 79).mirror().addBox(-0.4721F, -0.7474F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.2881F, -11.2967F, -15.5287F, 1.1048F, 0.5434F, 1.1806F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(73, 86).mirror().addBox(-0.264F, -0.6906F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2881F, -11.2967F, -15.5287F, 1.1737F, 0.1057F, 1.3908F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(89, 17).mirror().addBox(-0.264F, -0.6906F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1429F, -12.2667F, -16.2275F, 1.1737F, 0.1057F, 1.4083F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(96, 22).mirror().addBox(-0.4721F, -0.7474F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1429F, -12.2667F, -16.2275F, 1.1048F, 0.5434F, 1.1981F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(95, 44).mirror().addBox(-0.8122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 62).mirror().addBox(-1.2122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1429F, -12.2667F, -16.2275F, 1.0627F, 0.6591F, 1.1238F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.5743F, -0.6611F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.1429F, -12.2667F, -16.2275F, 1.1496F, 0.3462F, 1.3017F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(63, 104).mirror().addBox(-1.2122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(96, 82).mirror().addBox(-0.8122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0235F, -12.7665F, -16.6973F, 1.324F, 0.2777F, 1.2929F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(94, 76).mirror().addBox(-0.5743F, -0.6611F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.0235F, -12.7665F, -16.6973F, 1.3332F, -0.0614F, 1.3767F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(48, 107).mirror().addBox(-0.4721F, -0.7474F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0235F, -12.7665F, -16.6973F, 1.3309F, 0.1506F, 1.3251F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.264F, -0.6906F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0235F, -12.7665F, -16.6973F, 1.3211F, -0.3156F, 1.4408F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(32, 65).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.5079F, -3.6282F, -1.4533F, -2.5307F, 0.1745F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(32, 71).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.187F, -4.3936F, -3.273F, -1.9635F, 0.1745F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(57, 50).addBox(-0.5F, -1.5F, -2.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9266F, -2.2936F, -4.7502F, -1.5708F, 0.1745F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5F, -1.1F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.6102F, -0.9535F, -0.8733F, -2.5307F, 0.1745F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(5, 109).addBox(-0.7957F, -0.5049F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.6234F, -4.8494F, -7.57F, 1.376F, -0.4821F, -1.4728F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(48, 104).addBox(-0.2531F, -0.3091F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.6234F, -4.8494F, -7.57F, -1.376F, 0.4821F, 1.6688F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(108, 82).addBox(-0.6513F, -0.5222F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.6234F, -4.8494F, -7.57F, -1.341F, -0.7185F, 1.4248F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(26, 90).addBox(-0.9335F, -0.2801F, -0.5114F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.6234F, -4.8494F, -7.57F, 1.3838F, -0.3977F, -1.5076F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(108, 62).addBox(-0.2651F, -0.7142F, -0.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.6234F, -4.8494F, -7.57F, 0.9609F, -1.2668F, -0.9759F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(107, 104).addBox(-0.2758F, -0.6924F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4911F, -5.023F, -8.6078F, 0.8493F, -1.2404F, -0.8699F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(87, 76).addBox(-0.7571F, -0.2754F, -0.4997F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4911F, -5.023F, -8.6078F, 1.3367F, -0.3946F, -1.4894F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(107, 101).addBox(-0.6369F, -0.5027F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.4911F, -5.023F, -8.6078F, -1.284F, -0.7113F, 1.3874F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(98, 50).addBox(-0.2298F, -0.3159F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.4911F, -5.023F, -8.6078F, -1.3271F, 0.4774F, 1.6914F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(106, 76).addBox(-0.819F, -0.4981F, -0.4983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4911F, -5.023F, -8.6078F, 1.3271F, -0.4774F, -1.4502F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(98, 47).addBox(-0.8153F, -0.5062F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2858F, -5.2382F, -9.5605F, 1.1363F, -0.4399F, -1.3903F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(89, 0).addBox(-0.7528F, -0.2831F, -0.5015F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2858F, -5.2382F, -9.5605F, 1.1508F, -0.3652F, -1.4451F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(0, 108).addBox(-0.2335F, -0.3079F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2858F, -5.2382F, -9.5605F, -1.1363F, 0.4399F, 1.7513F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(107, 98).addBox(-0.6457F, -0.5034F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.2858F, -5.2382F, -9.5605F, -1.0608F, -0.6759F, 1.2195F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(78, 107).addBox(-0.2792F, -0.7006F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2858F, -5.2382F, -9.5605F, 0.5633F, -1.1035F, -0.6303F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(73, 107).addBox(2.2399F, -2.2751F, -0.2945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(63, 107).addBox(2.2433F, -3.1863F, -0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(103, 83).addBox(2.2633F, -4.255F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(0, 96).addBox(2.5045F, -5.3507F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.9707F, -0.4908F, -1.3209F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(107, 95).addBox(1.765F, -3.1944F, -0.2945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(98, 35).addBox(1.4565F, -4.0518F, -0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(102, 103).addBox(1.5099F, -5.0629F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(103, 64).addBox(1.1099F, -5.0629F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(103, 58).addBox(0.9617F, -6.175F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(103, 50).addBox(1.3617F, -6.175F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.8096F, -0.764F, -1.0501F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(68, 107).addBox(1.7251F, -2.9001F, -0.2945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(104, 27).addBox(1.5312F, -3.7904F, -0.4374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(96, 0).addBox(1.3195F, -4.8381F, -0.6032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(103, 61).addBox(1.3178F, -5.9601F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.8849F, -0.6658F, -1.1649F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(66, 86).addBox(1.2565F, -1.5597F, -0.2945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(14, 84).addBox(1.4956F, -2.439F, -0.4374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(47, 82).addBox(1.7916F, -3.4661F, -0.6032F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 8).addBox(2.3081F, -4.4621F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 1.0276F, -0.2701F, -1.4732F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(59, 86).addBox(1.0133F, -2.1708F, -0.2945F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(21, 84).addBox(1.096F, -3.0782F, -0.4374F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(82, 25).addBox(1.2092F, -4.141F, -0.6032F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(82, 22).addBox(1.5449F, -5.2116F, -0.7488F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.9943F, -0.4182F, -1.3748F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(81, 43).addBox(-1.736F, -0.6906F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1765F, -12.7665F, -16.6973F, 1.3211F, 0.3156F, -1.4408F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(48, 107).addBox(-0.5279F, -0.7474F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1765F, -12.7665F, -16.6973F, 1.3309F, -0.1506F, -1.3251F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(96, 82).addBox(-0.1878F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(63, 104).addBox(0.2122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1765F, -12.7665F, -16.6973F, 1.324F, -0.2777F, -1.2929F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(94, 76).addBox(-0.4257F, -0.6611F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1765F, -12.7665F, -16.6973F, 1.3332F, 0.0614F, -1.3767F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(95, 62).addBox(0.2122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 44).addBox(-0.1878F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0571F, -12.2667F, -16.2275F, 1.0627F, -0.6591F, -1.1238F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(0, 99).addBox(-0.4257F, -0.6611F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0571F, -12.2667F, -16.2275F, 1.1496F, -0.3462F, -1.3017F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(96, 22).addBox(-0.5279F, -0.7474F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0571F, -12.2667F, -16.2275F, 1.1048F, -0.5434F, -1.1981F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(89, 17).addBox(-1.736F, -0.6906F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0571F, -12.2667F, -16.2275F, 1.1737F, -0.1057F, -1.4083F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(73, 86).addBox(-1.736F, -0.6906F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0881F, -11.2967F, -15.5287F, 1.1737F, -0.1057F, -1.3908F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(96, 79).addBox(-0.5279F, -0.7474F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0881F, -11.2967F, -15.5287F, 1.1048F, -0.5434F, -1.1806F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(95, 59).addBox(-0.1878F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 104).addBox(0.2122F, -0.766F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0881F, -11.2967F, -15.5287F, 1.0627F, -0.6591F, -1.1064F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(97, 98).addBox(-0.4257F, -0.6611F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0881F, -11.2967F, -15.5287F, 1.1496F, -0.3462F, -1.2842F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(51, 98).addBox(1.2909F, -1.4554F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(104, 53).addBox(0.8909F, -1.4554F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.641F, -9.1131F, -14.9374F, 1.0627F, -0.6591F, -1.1762F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(107, 107).addBox(0.8237F, -0.94F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.641F, -9.1131F, -14.9374F, 1.1496F, -0.3462F, -1.354F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(92, 98).addBox(0.6315F, -1.2901F, -1.2116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.641F, -9.1131F, -14.9374F, 1.1048F, -0.5434F, -1.2505F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(17, 81).addBox(-0.4569F, -0.6366F, -1.2116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.641F, -9.1131F, -14.9374F, 1.1737F, -0.1057F, -1.4606F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(0, 89).addBox(2.9165F, -6.7918F, -0.7534F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.459F, -3.2881F, -10.3124F, 1.0343F, -0.2575F, -1.4451F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(28, 84).addBox(3.9333F, -5.78F, -0.7534F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.459F, -3.2881F, -10.3124F, 1.0505F, -0.1067F, -1.5344F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(15, 108).addBox(2.1507F, -7.8795F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.459F, -3.2881F, -10.3124F, 0.9667F, -0.5153F, -1.2675F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(46, 96).addBox(1.537F, -8.1867F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(96, 9).addBox(1.937F, -8.1867F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.459F, -3.2881F, -10.3124F, 0.9174F, -0.6213F, -1.1762F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(53, 104).addBox(3.7331F, -7.0444F, -0.7534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.459F, -3.2881F, -10.3124F, 1.0206F, -0.3322F, -1.3979F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(87, 55).addBox(-1.7269F, -0.7428F, -0.5314F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7628F, -8.783F, -13.3675F, 1.1378F, -0.1838F, -1.4577F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(87, 58).addBox(-1.69F, -0.6292F, -0.5314F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7628F, -8.783F, -13.3675F, 1.1454F, -0.0251F, -1.5306F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(76, 95).addBox(-0.4588F, -0.7142F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.7628F, -8.783F, -13.3675F, 1.0927F, -0.4586F, -1.3165F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(98, 32).addBox(-0.1149F, -0.7421F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 89).addBox(0.2851F, -0.7421F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7628F, -8.783F, -13.3675F, 1.0573F, -0.5738F, -1.2449F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(58, 107).addBox(-0.3654F, -0.6137F, -0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7628F, -8.783F, -13.3675F, 1.1294F, -0.2629F, -1.4198F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(9, 65).addBox(-0.5F, -0.1F, -0.125F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7682F, -4.1965F, -5.6482F, -1.7017F, 0.1745F, 0.0F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(94, 72).addBox(-0.9924F, -0.0779F, -1.9578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, -1.9984F, 0.3491F, -0.0698F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(38, 103).addBox(-0.9924F, 1.8325F, -1.7765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(51, 94).addBox(-0.9924F, 0.0759F, -0.9579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, -2.0769F, 0.3491F, -0.0698F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(106, 0).addBox(-0.0057F, -0.4933F, 2.6264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.641F, -8.8131F, -14.7374F, 2.1253F, 0.2273F, 0.0209F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(36, 106).addBox(0.0928F, -0.2086F, 3.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.641F, -8.8131F, -14.7374F, 2.1689F, 0.2273F, 0.0209F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(41, 108).addBox(0.0928F, -2.0192F, 3.2109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.641F, -8.8131F, -14.7374F, 1.7326F, 0.2273F, 0.0209F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(93, 107).addBox(-0.0057F, -1.4873F, 2.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.641F, -8.8131F, -14.7374F, 1.8635F, 0.2273F, 0.0209F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(105, 86).addBox(-0.0057F, -2.7103F, -0.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 43).addBox(-0.0057F, -2.7103F, -1.1433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.641F, -8.8131F, -14.7374F, 0.4236F, 0.2273F, 0.0209F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(95, 40).addBox(-0.0057F, -1.8449F, -0.6103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(25, 95).addBox(-0.0057F, -1.8449F, -0.9103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.641F, -8.8131F, -14.7374F, 0.5545F, 0.2273F, 0.0209F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(92, 94).addBox(-0.9924F, -7.853F, -0.7721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.6894F, 0.3491F, -0.0698F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(56, 94).addBox(-0.9924F, -7.8325F, -1.4207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.6458F, 0.3491F, -0.0698F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(90, 66).addBox(-0.9924F, -5.8995F, -0.0818F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.8029F, 0.3491F, -0.0698F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(94, 55).addBox(-0.9924F, -5.9174F, -1.0104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, 0.7156F, 0.3491F, -0.0698F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(103, 47).addBox(-0.9924F, -1.2624F, -3.9371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, -0.6807F, 0.3491F, -0.0698F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(43, 105).addBox(-0.9924F, -0.3349F, -3.9905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, -0.7679F, 0.3491F, -0.0698F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(103, 34).addBox(-0.9924F, 2.0371F, -0.5981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.459F, -3.0131F, -10.2374F, -2.2515F, 0.3491F, -0.0698F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(16, 65).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5936F, -1.3861F, -6.6387F, -1.9897F, 0.1745F, 0.0F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.0783F, -0.2866F, -3.8899F, -1.946F, 0.1745F, 0.0F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(48, 78).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4095F, 0.3148F, -2.0114F, 2.9671F, 0.1745F, 0.0F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(60, 32).addBox(-0.5F, 0.0F, -2.875F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.416F, 0.1956F, -1.9744F, -1.8762F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 115, 115);
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