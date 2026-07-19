package fossils.fossils.client.blockentity.model.messapicetus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MessapicetusFossilModel extends SkullModelBase {
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

	public MessapicetusFossilModel(ModelPart root) {
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

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -50.977F, -5.9275F, -0.3705F, -1.1787F, -0.3578F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 92).addBox(0.0F, -1.5068F, -0.4181F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5854F, -2.0706F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 91).addBox(0.0F, -2.1521F, 0.0721F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2624F, -0.5632F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(49, 5).addBox(-1.8307F, -0.1817F, -0.751F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8307F, 6.6842F, 1.2392F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 50).mirror().addBox(-3.1033F, 0.2263F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8307F, 6.6842F, 1.2392F, -0.0701F, -0.0704F, 0.9014F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-2.9833F, -0.0221F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0163F, -0.4916F, 0.376F, -0.7424F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(70, 39).mirror().addBox(-5.876F, -0.7935F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0163F, -0.5644F, 0.2434F, -0.9797F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(41, 71).mirror().addBox(-8.0988F, -3.0263F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0163F, -0.6091F, 0.019F, -1.3162F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 92).mirror().addBox(-0.1534F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0163F, -0.1935F, 0.1471F, 0.0791F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 50).addBox(-0.8967F, 0.2263F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8307F, 6.6842F, 1.2392F, -0.0701F, 0.0704F, -0.9014F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, 4).addBox(-0.0167F, -0.0221F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0163F, -0.4916F, -0.376F, 0.7424F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(70, 39).addBox(2.876F, -0.7935F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0163F, -0.5644F, -0.2434F, 0.9797F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 71).addBox(5.0988F, -3.0263F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0163F, -0.6091F, -0.019F, 1.3162F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 92).addBox(-0.8466F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0163F, -0.1935F, -0.1471F, -0.0791F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 15).addBox(-0.5F, -0.157F, 0.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7854F, -2.5206F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, 0.4829F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.4805F, 0.3903F, -0.8429F));

		PartDefinition cube_r16 = body6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 29).mirror().addBox(-6.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.5576F, 0.2598F, -1.0827F));

		PartDefinition cube_r17 = body6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 59).mirror().addBox(-9.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.6083F, 0.0366F, -1.4209F));

		PartDefinition cube_r18 = body6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(63, 82).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.385F, 5.5008F, -0.2111F, 0.1485F, -0.0282F));

		PartDefinition cube_r19 = body6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-1.9081F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.2551F, 0.1517F, 0.0001F));

		PartDefinition cube_r20 = body6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(69, 52).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.4948F, 0.379F, -0.8132F));

		PartDefinition cube_r21 = body6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.5681F, 0.2457F, -1.0503F));

		PartDefinition cube_r22 = body6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 54).mirror().addBox(-9.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.6133F, 0.0199F, -1.386F));

		PartDefinition cube_r23 = body6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(59, 39).mirror().addBox(-8.9055F, -3.0617F, -0.3481F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.6267F, -0.0485F, -1.3159F));

		PartDefinition cube_r24 = body6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-5.7118F, -0.9016F, -0.3481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.604F, 0.1853F, -0.9881F));

		PartDefinition cube_r25 = body6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(65, 69).mirror().addBox(-2.8528F, -0.169F, -0.3481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.5459F, 0.3283F, -0.7611F));

		PartDefinition cube_r26 = body6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(66, 92).mirror().addBox(-1.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.2639F, 0.1523F, 0.0686F));

		PartDefinition cube_r27 = body6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(66, 92).addBox(0.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.2639F, -0.1523F, -0.0686F));

		PartDefinition cube_r28 = body6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(65, 69).addBox(-0.1472F, -0.169F, -0.3481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.5459F, -0.3283F, 0.7611F));

		PartDefinition cube_r29 = body6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(56, 69).addBox(2.7118F, -0.9016F, -0.3481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.604F, -0.1853F, 0.9881F));

		PartDefinition cube_r30 = body6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 39).addBox(4.9055F, -3.0617F, -0.3481F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.6267F, 0.0485F, 1.3159F));

		PartDefinition cube_r31 = body6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(58, 54).addBox(5.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.6133F, -0.0199F, 1.386F));

		PartDefinition cube_r32 = body6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(69, 54).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.5681F, -0.2457F, 1.0503F));

		PartDefinition cube_r33 = body6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(69, 52).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.4948F, -0.379F, 0.8132F));

		PartDefinition cube_r34 = body6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(82, 75).addBox(-0.0919F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.2551F, -0.1517F, -0.0001F));

		PartDefinition cube_r35 = body6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(63, 82).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.385F, 5.5008F, -0.2111F, -0.1485F, 0.0282F));

		PartDefinition cube_r36 = body6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(30, 19).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.104F, 0.0109F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 86).addBox(0.0F, -3.0786F, -0.1073F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1345F, 5.1082F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 59).addBox(5.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.6083F, -0.0366F, 1.4209F));

		PartDefinition cube_r39 = body6.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(65, 29).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.5576F, -0.2598F, 1.0827F));

		PartDefinition cube_r40 = body6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 48).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.4805F, -0.3903F, 0.8429F));

		PartDefinition cube_r41 = body6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(35, 83).addBox(0.0F, -2.7161F, -0.0338F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.9539F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(31, 53).addBox(0.0F, -2.8246F, -0.0282F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.9539F, -0.2007F, 0.0F, 0.0F));

		PartDefinition leftarm = body6.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5755F, 3.1588F, 0.0843F, -0.2082F, 0.247F, -0.9434F));

		PartDefinition cube_r43 = leftarm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0109F, 0.0204F, -0.2505F, -1.2567F, 0.0014F, -0.001F));

		PartDefinition cube_r44 = leftarm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0085F, 0.8215F, 0.915F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition cube_r45 = leftarm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0065F, 3.6472F, 0.1149F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r46 = leftarm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 3.4651F, 1.0982F, -2.9584F, 0.0014F, -0.001F));

		PartDefinition cube_r47 = leftarm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(72, 25).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0067F, 2.1248F, 0.9814F, 2.4957F, 0.0014F, -0.001F));

		PartDefinition cube_r48 = leftarm.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(90, 83).addBox(-0.5F, -0.925F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0079F, 1.8027F, 0.637F, 2.0158F, 0.0014F, -0.001F));

		PartDefinition cube_r49 = leftarm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(85, 52).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0099F, 0.8426F, -0.0898F, 1.4922F, 0.0014F, -0.001F));

		PartDefinition cube_r50 = leftarm.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 87).addBox(-0.5F, -0.6F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0078F, 2.4814F, -0.0298F, -0.035F, 0.0014F, -0.001F));

		PartDefinition cube_r51 = leftarm.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 86).addBox(-0.011F, 1.0254F, 0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5013F, 0.0619F, -1.2637F, 0.2268F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1618F, 3.9904F, 0.1568F, -0.0632F, -0.4356F, 0.0267F));

		PartDefinition cube_r52 = leftarm2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(27, 79).addBox(0.2665F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 83).addBox(-0.4335F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.3177F, -1.5708F));

		PartDefinition cube_r53 = leftarm2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(90, 43).addBox(-0.95F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(90, 40).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1764F, 2.2901F, 0.5595F, -1.5708F, 1.0559F, 1.5708F));

		PartDefinition cube_r54 = leftarm2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(79, 25).addBox(-0.85F, -2.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.1764F, 1.7577F, 2.1835F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r55 = leftarm2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 86).addBox(-0.95F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 1.5223F, 2.7941F, -1.5708F, -0.2531F, 1.5708F));

		PartDefinition cube_r56 = leftarm2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(79, 56).addBox(0.125F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(25, 87).addBox(0.825F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1764F, -0.4405F, 2.5116F, -1.5708F, 0.4451F, 1.5708F));

		PartDefinition cube_r57 = leftarm2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(83, 81).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(84, 25).addBox(0.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1764F, -0.3902F, 1.7431F, -1.5708F, 0.8814F, 1.5708F));

		PartDefinition cube_r58 = leftarm2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(80, 85).addBox(-0.75F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 2.3892F, -0.0323F, -1.5708F, -0.1658F, 1.5708F));

		PartDefinition cube_r59 = leftarm2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(89, 13).addBox(-0.15F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1764F, 1.91F, -0.3934F, -1.5708F, -0.6458F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.6074F, 0.5595F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftArm3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(26, 35).addBox(0.0F, 0.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4F, 3.0583F, -0.0262F, 2.8373F));

		PartDefinition rightarm = body6.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5755F, 3.1588F, 0.0843F, 0.1298F, -0.2529F, 0.988F));

		PartDefinition cube_r61 = rightarm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0109F, 0.0204F, -0.2505F, -1.2567F, -0.0014F, 0.001F));

		PartDefinition cube_r62 = rightarm.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(15, 87).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0085F, 0.8215F, 0.915F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition cube_r63 = rightarm.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0065F, 3.6472F, 0.1149F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r64 = rightarm.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0053F, 3.4651F, 1.0982F, -2.9584F, -0.0014F, 0.001F));

		PartDefinition cube_r65 = rightarm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(72, 25).mirror().addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0067F, 2.1248F, 0.9814F, 2.4957F, -0.0014F, 0.001F));

		PartDefinition cube_r66 = rightarm.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(90, 83).mirror().addBox(-0.5F, -0.925F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0079F, 1.8027F, 0.637F, 2.0158F, -0.0014F, 0.001F));

		PartDefinition cube_r67 = rightarm.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(85, 52).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0099F, 0.8426F, -0.0898F, 1.4922F, -0.0014F, 0.001F));

		PartDefinition cube_r68 = rightarm.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-0.5F, -0.6F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0078F, 2.4814F, -0.0298F, -0.035F, -0.0014F, 0.001F));

		PartDefinition cube_r69 = rightarm.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(68, 86).mirror().addBox(-0.989F, 1.0254F, 0.0689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.0619F, -1.2637F, 0.2268F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1618F, 3.9904F, 0.1568F, -0.0593F, 0.2614F, -0.0153F));

		PartDefinition cube_r70 = rightarm2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 79).mirror().addBox(-1.2665F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 83).mirror().addBox(-0.5665F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.3177F, 1.5708F));

		PartDefinition cube_r71 = rightarm2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(90, 43).mirror().addBox(-0.05F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(90, 40).mirror().addBox(-0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 2.2901F, 0.5595F, -1.5708F, -1.0559F, -1.5708F));

		PartDefinition cube_r72 = rightarm2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(-0.15F, -2.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.7577F, 2.1835F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r73 = rightarm2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.05F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.5223F, 2.7941F, -1.5708F, 0.2531F, -1.5708F));

		PartDefinition cube_r74 = rightarm2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-1.125F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(25, 87).mirror().addBox(-1.825F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.4405F, 2.5116F, -1.5708F, -0.4451F, -1.5708F));

		PartDefinition cube_r75 = rightarm2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(83, 81).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(84, 25).mirror().addBox(-1.2F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1764F, -0.3902F, 1.7431F, -1.5708F, -0.8814F, -1.5708F));

		PartDefinition cube_r76 = rightarm2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-0.25F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 2.3892F, -0.0323F, -1.5708F, 0.1658F, -1.5708F));

		PartDefinition cube_r77 = rightarm2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(89, 13).mirror().addBox(-0.85F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.91F, -0.3934F, -1.5708F, 0.6458F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.6074F, 0.5595F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightArm3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(26, 35).mirror().addBox(0.0F, 0.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4F, 3.0596F, 0.0298F, -2.7938F));

		PartDefinition bone2 = body6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5478F, 1.4829F, -0.7875F, -0.1125F, -0.0148F, -0.1301F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(22, 53).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2932F, -0.0712F, -0.4812F, 2.24F, 0.2429F, -0.0456F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(14, 67).addBox(-0.4717F, -0.6892F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, 1.4308F, -0.0355F, -0.1838F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(84, 72).addBox(-0.4717F, -1.4663F, -0.3941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, 0.9072F, -0.0355F, -0.1838F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(84, 69).addBox(-0.4717F, -1.5098F, -1.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, 0.4709F, -0.0355F, -0.1838F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(84, 66).addBox(-0.4717F, -0.7764F, -1.2764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, -0.2709F, -0.0355F, -0.1838F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(65, 59).addBox(-0.4717F, -0.9208F, -0.6614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, 0.0345F, -0.0355F, -0.1838F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(63, 84).addBox(-0.4717F, -0.9396F, -0.1754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, 0.2527F, -0.0355F, -0.1838F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 0).addBox(-0.4717F, 0.5568F, -0.6315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, 1.2563F, -0.0355F, -0.1838F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(79, 13).addBox(-0.4717F, -0.9351F, -1.0562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5463F, 1.003F, -0.9519F, 1.8671F, -0.0355F, -0.1838F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(65, 25).addBox(-0.0968F, -0.2651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, 0.2429F, -0.0456F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(12, 79).addBox(-0.0968F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, 0.2429F, -0.0456F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.56F, -1.1183F, 0.787F, -0.6835F, 0.2429F, -0.0456F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0943F, -1.9051F, -1.7064F, 2.5454F, 0.2429F, -0.0456F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(84, 62).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1021F, -2.3503F, -0.8328F, -2.6906F, 0.2429F, -0.0456F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(67, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3332F, -2.5061F, 0.1276F, -1.4252F, 0.2429F, -0.0456F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(75, 78).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.577F, -2.4011F, 1.0917F, -0.1162F, 0.2429F, -0.0456F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(91, 19).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8215F, -2.21F, 2.0423F, 1.3673F, 0.2429F, -0.0456F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(84, 56).addBox(-0.5F, -2.0F, 1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(56, 65).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.358F, -0.8682F, 3.9585F, 2.5367F, 0.2429F, -0.0456F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(85, 29).addBox(-0.5F, -1.1F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(85, 10).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0181F, -0.92F, 2.5977F, -3.1182F, 0.2429F, -0.0456F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(60, 7).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0995F, -0.1461F, 2.7835F, -2.9F, 0.2429F, -0.0456F));

		PartDefinition bone3 = body6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5478F, 1.4829F, -0.7875F, -0.1125F, 0.0148F, 0.1301F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(22, 53).mirror().addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2932F, -0.0712F, -0.4812F, 2.24F, -0.2429F, 0.0456F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.5283F, -0.6892F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, 1.4308F, 0.0355F, 0.1838F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 72).mirror().addBox(-0.5283F, -1.4663F, -0.3941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, 0.9072F, 0.0355F, 0.1838F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(-0.5283F, -1.5098F, -1.0095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, 0.4709F, 0.0355F, 0.1838F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 66).mirror().addBox(-0.5283F, -0.7764F, -1.2764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, -0.2709F, 0.0355F, 0.1838F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-0.5283F, -0.9208F, -0.6614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, 0.0345F, 0.0355F, 0.1838F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(63, 84).mirror().addBox(-0.5283F, -0.9396F, -0.1754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, 0.2527F, 0.0355F, 0.1838F));

		PartDefinition cube_r106 = bone3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.5283F, 0.5568F, -0.6315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, 1.2563F, 0.0355F, 0.1838F));

		PartDefinition cube_r107 = bone3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(79, 13).mirror().addBox(-0.5283F, -0.9351F, -1.0562F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.003F, -0.9519F, 1.8671F, 0.0355F, 0.1838F));

		PartDefinition cube_r108 = bone3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(65, 25).mirror().addBox(-0.9032F, -0.2651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, -0.2429F, 0.0456F));

		PartDefinition cube_r109 = bone3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(12, 79).mirror().addBox(-0.9032F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, -0.2429F, 0.0456F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.56F, -1.1183F, 0.787F, -0.6835F, -0.2429F, 0.0456F));

		PartDefinition cube_r111 = bone3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0943F, -1.9051F, -1.7064F, 2.5454F, -0.2429F, 0.0456F));

		PartDefinition cube_r112 = bone3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1021F, -2.3503F, -0.8328F, -2.6906F, -0.2429F, 0.0456F));

		PartDefinition cube_r113 = bone3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(67, 19).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3332F, -2.5061F, 0.1276F, -1.4252F, -0.2429F, 0.0456F));

		PartDefinition cube_r114 = bone3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(75, 78).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.577F, -2.4011F, 1.0917F, -0.1162F, -0.2429F, 0.0456F));

		PartDefinition cube_r115 = bone3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8215F, -2.21F, 2.0423F, 1.3673F, -0.2429F, 0.0456F));

		PartDefinition cube_r116 = bone3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(84, 56).mirror().addBox(-0.5F, -2.0F, 1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(56, 65).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.358F, -0.8682F, 3.9585F, 2.5367F, -0.2429F, 0.0456F));

		PartDefinition cube_r117 = bone3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(85, 29).mirror().addBox(-0.5F, -1.1F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(85, 10).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0181F, -0.92F, 2.5977F, -3.1182F, -0.2429F, 0.0456F));

		PartDefinition cube_r118 = bone3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(60, 7).mirror().addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0995F, -0.1461F, 2.7835F, -2.9F, -0.2429F, 0.0456F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5957F, 5.8766F, -0.2539F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 80).addBox(0.0F, -3.277F, -0.2082F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5296F, 1.1014F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(45, 80).addBox(0.0F, -3.504F, 0.038F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.996F, 4.843F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(79, 17).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, 0.1044F, 0.1176F, 0.0489F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(65, 63).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.3456F, 0.5282F, -0.9666F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-10.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.5209F, 0.3571F, -1.3698F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(67, 23).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.1851F, 0.5974F, -0.6676F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 3.4356F, 0.1567F, 0.1113F, 0.0199F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(69, 11).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.1331F, 0.6277F, -0.6728F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(-6.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.3086F, 0.5698F, -0.9824F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(58, 52).mirror().addBox(-9.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.5076F, 0.4079F, -1.4F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(90, 86).mirror().addBox(-1.0206F, 0.2035F, -0.4011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9206F, 5.4356F, 0.1654F, 0.1102F, 0.0034F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(90, 86).addBox(0.0206F, 0.2035F, -0.4011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.9206F, 5.4356F, 0.1654F, -0.1102F, -0.0034F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(58, 52).addBox(5.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.5076F, -0.4079F, 1.4F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(69, 13).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.3086F, -0.5698F, 0.9824F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(69, 11).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.1331F, -0.6277F, 0.6728F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(79, 38).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 3.4356F, 0.1567F, -0.1113F, -0.0199F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(67, 23).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.1851F, -0.5974F, 0.6676F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(19, 8).addBox(5.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.5209F, -0.3571F, 1.3698F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(65, 63).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.3456F, -0.5282F, 0.9666F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(79, 17).addBox(-0.0919F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, 0.1044F, -0.1176F, -0.0489F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(7, 80).addBox(0.0F, -3.5188F, 0.0287F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7473F, 2.846F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.0425F, -0.0704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3034F, 5.9565F, 0.0263F, 0.0F, 0.0F));

		PartDefinition cube_r141 = body5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(60, 82).addBox(0.0F, -4.0F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7767F, 7.0212F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(57, 82).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 4.9F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 78).addBox(0.0F, -3.8F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(51, 80).addBox(0.0F, -3.6097F, -0.0421F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.9F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(51, 91).mirror().addBox(-1.2F, 0.5F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 60).mirror().addBox(-2.1F, 0.5F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 31).mirror().addBox(-3.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 33).mirror().addBox(-3.3F, 0.5F, 7.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 33).addBox(0.3F, 0.5F, 7.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 31).addBox(0.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 60).addBox(0.1F, 0.5F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 91).addBox(0.2F, 0.5F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(54, 75).addBox(0.0F, -4.3998F, 0.7896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7134F, 8.0023F, -0.2006F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(60, 75).addBox(0.0F, -4.7574F, -0.0873F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2244F, 4.929F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 75).addBox(0.0F, -4.5575F, -0.0873F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 2.8896F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r148 = body4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-3.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 37).mirror().addBox(-3.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 41).mirror().addBox(-3.5F, 0.375F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 41).addBox(0.5F, 0.375F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 37).addBox(0.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 35).addBox(0.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-0.5F, -0.125F, -5.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 5.0896F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -0.1187F, -0.0502F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(69, 43).addBox(0.3F, 0.3813F, -0.0502F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 45).addBox(0.0F, 0.3813F, 1.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 50).addBox(-0.2F, 0.3813F, 3.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 50).mirror().addBox(-2.8F, 0.3813F, 3.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 45).mirror().addBox(-3.0F, 0.3813F, 1.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 43).mirror().addBox(-3.3F, 0.3813F, -0.0502F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3504F, 6.8384F, 0.1936F, 0.0F, 0.0F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(69, 75).addBox(0.0F, -4.5F, 0.05F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0374F, 3.9008F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(66, 75).addBox(0.0F, -4.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, 1.8998F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(63, 75).addBox(0.0F, -4.6F, -0.05F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, -0.0002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-0.3F, 0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.8813F, 3.9498F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 26).addBox(-0.7F, 0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.8813F, 3.9498F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2669F, 6.032F, 0.2641F, 0.1289F, 0.023F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(54, 82).addBox(0.0F, -3.7945F, -0.1045F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6154F, 3.9881F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(42, 82).addBox(0.0F, -3.9298F, -0.043F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.048F, 1.9945F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(14, 93).addBox(0.0F, -0.3F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1265F, 4.5712F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(72, 75).addBox(0.0F, -4.0996F, 0.0072F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4077F, -0.0089F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(-2.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 81).mirror().addBox(-2.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 6).mirror().addBox(-2.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 6).addBox(0.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 81).addBox(0.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 47).addBox(0.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 35).addBox(-0.5F, 0.7738F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9537F, -8.4029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9579F, 4.9196F, 0.4092F, 0.1679F, 0.0477F));

		PartDefinition cube_r159 = hips.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(63, 87).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1431F, 4.4359F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r160 = hips.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 87).addBox(0.0F, -3.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2571F, 2.6119F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r161 = hips.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(79, 91).addBox(0.0F, -0.1F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7641F, 3.6532F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r162 = hips.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(92, 91).addBox(0.0F, 0.4F, 1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5064F, 0.751F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r163 = hips.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(39, 82).addBox(0.0F, -3.5F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2598F, 0.7938F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r164 = hips.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-1.8F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 91).mirror().addBox(-1.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 19).mirror().addBox(-1.6F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 19).addBox(-0.4F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 91).addBox(0.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 8).addBox(-0.2F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 19).addBox(-0.5F, -0.1165F, -0.0007F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.175F, -0.025F, -0.4843F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9536F, 5.1845F, -0.5522F, 0.0F, 0.0F));

		PartDefinition cube_r165 = tail.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 92).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6122F, 2.849F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r166 = tail.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(22, 49).addBox(0.0F, -1.4F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.96F, 2.3953F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r167 = tail.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(8, 93).addBox(0.0F, -1.0F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 93).addBox(0.0F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5837F, 3.9536F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(73, 87).addBox(0.0F, -2.2F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6122F, 0.949F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(82, 91).mirror().addBox(-1.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 91).mirror().addBox(-1.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 91).addBox(0.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 91).addBox(0.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 35).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5128F, -0.026F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2646F, 4.8704F, -0.0332F, -0.1303F, -0.0127F));

		PartDefinition cube_r170 = tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-1.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 92).mirror().addBox(-0.8F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 92).addBox(-0.2F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 46).addBox(0.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4973F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r171 = tail2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(45, 32).addBox(0.0F, -1.45F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 92).addBox(0.0F, -1.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4476F, 1.9786F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(23, 93).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 6).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9357F, 3.2127F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(93, 22).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3004F, 1.1446F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(30, 92).addBox(0.0F, -1.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4476F, -0.0214F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2304F, 5.8944F, -0.1036F, -0.1741F, -0.0123F));

		PartDefinition cube_r175 = tail3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.55F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(17, 93).addBox(0.0F, -0.75F, 2.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 93).addBox(0.0F, -0.65F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5245F, -0.0218F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 5.95F, 0.0975F, -0.1737F, -0.0169F));

		PartDefinition cube_r177 = tail4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -0.55F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4805F, -2.1145F, 0.2863F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(76, 87).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.3581F, -2.1889F, -0.3431F, -0.2751F, -0.6502F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(88, 17).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.3581F, -2.1889F, -1.1039F, -0.3035F, -0.7363F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(88, 17).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.3581F, -2.1889F, -1.1039F, 0.3035F, 0.7363F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 87).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.3581F, -2.1889F, -0.3431F, 0.2751F, 0.6502F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(20, 93).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3581F, -2.1889F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition cube_r183 = neck2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(87, 46).addBox(-0.5F, 0.45F, 4.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4617F, -0.988F, -0.81F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(51, 56).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5181F, -2.4485F, 2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(62, 56).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5808F, -4.2997F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(41, 61).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -2.5808F, -4.2997F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(60, 12).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -2.5965F, -3.4454F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(40, 56).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5965F, -3.4454F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0028F, 0.2633F, -4.7646F, -0.2178F, -0.0023F, -0.0044F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(34, 8).addBox(-1.0F, -0.5F, 2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 27).addBox(-0.6F, -0.5F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.037F, 5.6848F, -11.7672F, 0.5807F, -0.0023F, -0.0044F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(17, 10).addBox(-0.533F, -0.2F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.033F, 5.1331F, -11.0919F, 0.572F, -0.0023F, -0.0044F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(45, 26).addBox(-0.533F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.033F, 5.1331F, -11.0919F, 0.3974F, -0.0023F, -0.0044F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(74, 6).addBox(-0.5395F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0395F, 5.8786F, -12.5076F, 0.4847F, -0.0023F, -0.0044F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(48, 44).addBox(-0.5566F, -0.8F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0566F, 8.3785F, -15.1666F, 0.5894F, -0.0023F, -0.0044F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(58, 20).addBox(-0.5675F, -0.8F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0674F, 9.6694F, -17.4235F, 0.5196F, -0.0023F, -0.0044F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(48, 38).addBox(-0.5821F, -0.8F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0821F, 11.3467F, -20.6088F, 0.4847F, -0.0023F, -0.0044F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5821F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0821F, 11.3467F, -20.6088F, 0.5196F, -0.0023F, -0.0044F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(48, 32).addBox(-0.5669F, -0.8F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0669F, 9.505F, -17.5156F, 0.537F, -0.0023F, -0.0044F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(35, 42).addBox(-0.547F, -0.8F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0469F, 6.9481F, -13.6918F, 0.5894F, -0.0023F, -0.0044F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(13, 42).addBox(-0.5294F, -0.5F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0295F, 4.4834F, -10.784F, 0.6243F, -0.0023F, -0.0044F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(20, 58).addBox(-0.5F, 0.1F, -1.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(11, 54).addBox(-0.5139F, -0.2F, -2.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0139F, 2.2113F, -8.3607F, 0.6723F, -0.0023F, -0.0044F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(65, 15).addBox(-0.5079F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0079F, 1.6275F, -6.8477F, 0.2185F, -0.0023F, -0.0044F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(63, 65).addBox(-0.5042F, -0.2F, -2.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0042F, 1.277F, -5.9111F, 0.3582F, -0.0023F, -0.0044F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, -0.6F, -0.725F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0381F, -4.525F, -0.7414F, -0.0023F, -0.0044F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -1.0F, -0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.1007F, -4.1234F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(45, 15).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.17F, -4.7972F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(49, 10).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5965F, -3.4454F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(76, 22).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.8034F, -0.3588F, -2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(75, 75).addBox(-1.0F, 0.2F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.8374F, -0.0607F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(74, 19).addBox(-1.0F, -0.3F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4997F, 0.3997F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(26, 46).addBox(-1.0F, -1.025F, -1.05F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.442F, -1.9136F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(45, 22).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.3791F, -0.8544F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(34, 15).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.0675F, -1.5798F, 0.8814F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.8F, 1.8933F, -5.1002F));

		PartDefinition cube_r214 = leftOrbit.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(45, 77).addBox(-1.056F, -0.7329F, -0.6195F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, 1.4395F, 0.1305F, 0.0701F));

		PartDefinition cube_r215 = leftOrbit.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(40, 73).addBox(-1.056F, -0.2859F, -0.2439F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, 2.5303F, 0.1305F, 0.0701F));

		PartDefinition cube_r216 = leftOrbit.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(78, 53).addBox(-1.056F, -0.1623F, -0.7661F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, -2.7493F, 0.1305F, 0.0701F));

		PartDefinition cube_r217 = leftOrbit.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(79, 3).addBox(-1.056F, -0.7639F, -0.2624F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, -1.2222F, 0.1305F, 0.0701F));

		PartDefinition cube_r218 = leftOrbit.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(7, 71).addBox(-1.056F, -0.452F, -0.0627F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, -0.7422F, 0.1305F, 0.0701F));

		PartDefinition cube_r219 = leftOrbit.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(70, 65).addBox(-1.056F, -0.3999F, -0.5747F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, -0.524F, 0.1305F, 0.0701F));

		PartDefinition cube_r220 = leftOrbit.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(83, 77).addBox(-0.2F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.9695F, 1.5036F, -3.7014F, 1.7193F, -0.5317F, 1.515F));

		PartDefinition cube_r221 = leftOrbit.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(75, 83).addBox(-0.7399F, -1.8642F, -0.0941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5981F, 1.8074F, -2.5584F, 2.1161F, -0.0763F, 0.3561F));

		PartDefinition cube_r222 = leftOrbit.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(24, 63).addBox(-0.2F, -2.5F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.3209F, 3.9155F, -7.6016F, 1.7193F, -0.5317F, 1.515F));

		PartDefinition cube_r223 = leftOrbit.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(5, 86).addBox(-0.575F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 3).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7261F, 3.3049F, -4.8965F, 2.0198F, -0.4641F, 0.6542F));

		PartDefinition cube_r224 = leftOrbit.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(85, 85).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7347F, 3.736F, -5.5745F, 2.0109F, -0.4247F, 0.675F));

		PartDefinition cube_r225 = leftOrbit.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(77, 72).addBox(-1.325F, 1.9F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 69).addBox(-1.3F, 1.1F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 66).addBox(-1.3F, 0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 63).addBox(-1.3F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7356F, 5.1195F, -8.4752F, 1.9961F, -0.3455F, 0.7145F));

		PartDefinition cube_r226 = leftOrbit.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(85, 49).addBox(-0.0321F, -9.2076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8819F, 4.9096F, -8.6672F, 2.0113F, -0.256F, 0.6987F));

		PartDefinition cube_r227 = leftOrbit.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(85, 43).addBox(0.0679F, -8.4076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 40).addBox(0.0679F, -7.6076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 35).addBox(0.0679F, -6.8076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 32).addBox(0.0679F, -6.0076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8819F, 4.9096F, -8.6672F, 2.0228F, -0.2426F, 0.6958F));

		PartDefinition cube_r228 = leftOrbit.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(72, 60).addBox(-1.1016F, -5.2378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(73, 47).addBox(-1.0516F, -4.4378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 0).addBox(-1.0516F, -3.6378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(78, 29).addBox(-1.0016F, -2.8378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(78, 10).addBox(-1.0016F, -2.0378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8819F, 4.9096F, -8.6672F, 2.0315F, -0.3053F, 0.6639F));

		PartDefinition cube_r229 = leftOrbit.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0016F, -1.2378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8819F, 4.9096F, -8.6672F, 2.0082F, -0.3323F, 0.7104F));

		PartDefinition cube_r230 = leftOrbit.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(35, 49).addBox(-0.8705F, -8.4378F, -0.714F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.8819F, 4.9096F, -8.6672F, 2.1101F, -0.0934F, 0.2738F));

		PartDefinition cube_r231 = leftOrbit.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(19, 63).addBox(-0.8399F, -4.7892F, -0.3941F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5848F, 3.2926F, -5.3915F, 2.1161F, -0.0763F, 0.3561F));

		PartDefinition cube_r232 = leftOrbit.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(22, 79).addBox(-0.2F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.0544F, 2.3491F, -5.0438F, 1.6011F, -0.5816F, 1.5098F));

		PartDefinition cube_r233 = leftOrbit.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(17, 79).addBox(-0.1399F, -1.8642F, -0.0941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.3504F, 2.413F, -3.9681F, 2.1252F, -0.1879F, 0.2871F));

		PartDefinition cube_r234 = leftOrbit.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(58, 59).addBox(0.3678F, -2.3601F, -0.7679F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.6599F, -0.2136F, -1.41F, 2.0866F, -0.4814F, 0.9907F));

		PartDefinition cube_r235 = leftOrbit.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(34, 78).addBox(0.9159F, -2.3601F, -0.4226F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.6599F, -0.2136F, -1.41F, 2.2598F, -0.046F, 0.3618F));

		PartDefinition cube_r236 = leftOrbit.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(72, 15).addBox(-0.4419F, -0.7975F, -2.3836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2139F, -0.9289F, -1.5275F, -3.076F, -0.1857F, 1.7141F));

		PartDefinition cube_r237 = leftOrbit.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 50).addBox(-1.8431F, -0.853F, -3.1197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)), PartPose.offsetAndRotation(0.4139F, -0.9289F, 0.6725F, 3.1114F, -0.303F, 1.6808F));

		PartDefinition cube_r238 = leftOrbit.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(78, 44).addBox(-3.0165F, -0.853F, -2.1258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4139F, -0.9289F, 0.6725F, 3.1123F, 0.1767F, 1.6666F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 41).addBox(-2.6652F, -0.853F, -0.6973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.4139F, -0.9289F, 0.6725F, 3.0911F, 0.9616F, 1.6304F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(78, 35).addBox(-2.7409F, -0.853F, -0.5966F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4139F, -0.9289F, 0.6725F, 3.0526F, 1.2402F, 1.5876F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(25, 90).addBox(-0.7937F, -0.853F, -1.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F))
				.texOffs(20, 90).addBox(-0.7937F, -0.853F, -0.621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4139F, -0.9289F, 0.6725F, 3.1127F, 0.0633F, 1.67F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(49, 0).addBox(-0.2F, -0.2F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-1.0738F, -0.6982F, -1.0571F, 2.4348F, -0.3957F, 3.1058F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 50).addBox(-0.4F, -0.1F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-1.081F, -1.2036F, -0.1605F, 2.7283F, -0.288F, 3.0114F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(11, 49).addBox(0.1023F, -0.7694F, -3.3836F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2139F, -0.9289F, -1.5275F, 3.0399F, -0.1688F, 2.6015F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(47, 73).addBox(-0.8313F, -0.5876F, -2.2554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2139F, -0.9289F, -1.5275F, 2.4242F, 0.9541F, 1.8174F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(90, 28).addBox(-0.8313F, -0.7975F, -0.8219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.2139F, -0.9289F, -1.5275F, -3.03F, 0.9541F, 1.8174F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(29, 66).addBox(-0.65F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.3578F, -0.7058F, -1.7649F, 2.1414F, 0.7262F, 1.4553F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(90, 31).addBox(-0.65F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(15, 90).addBox(-0.525F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.483F, -0.4862F, -1.5732F, 2.9704F, 0.7262F, 1.4553F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(70, 71).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-2.5383F, 0.4628F, 2.1205F, -2.8328F, 0.7262F, 1.4553F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(10, 90).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.483F, -0.4862F, -1.5732F, 2.8082F, 0.3625F, 1.0409F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(88, 80).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(79, 88).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9844F, 0.1504F, -1.9648F, 2.684F, 0.1742F, 0.5819F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(70, 82).addBox(-0.8F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.6692F, 0.152F, -1.9394F, 2.6615F, 0.138F, 0.4123F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(88, 77).addBox(-0.5186F, -0.1726F, -1.4721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(28, 70).addBox(-0.5186F, -0.3726F, -1.4721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.4672F, -0.5008F, 2.6888F, -0.4921F, -0.1297F, 3.0715F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(49, 50).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.5785F, 0.7146F, 2.7439F, -0.5357F, -0.1297F, 3.0715F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(67, 7).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.8035F, 1.027F, 4.2969F, 0.5988F, -0.1297F, 3.0715F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(7, 67).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.8035F, 1.027F, 4.2969F, 1.0787F, -0.1297F, 3.0715F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(63, 71).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.5785F, 0.7146F, 2.7439F, 0.2061F, -0.1297F, 3.0715F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(84, 88).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4922F, 0.5468F, 2.1744F, 0.2933F, -0.1297F, 3.0715F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(58, 88).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4041F, 0.2586F, 1.6556F, 0.5115F, -0.1297F, 3.0715F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(53, 88).addBox(-0.5186F, -0.7167F, -0.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4672F, -0.5008F, 2.6888F, -0.0208F, -0.1297F, 3.0715F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(38, 88).addBox(-0.5186F, -0.1497F, 0.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(33, 88).addBox(-0.5186F, -0.1497F, 0.0565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4672F, -0.5008F, 2.6888F, -0.2739F, -0.1297F, 3.0715F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(21, 70).addBox(-0.5186F, -0.1166F, -1.5523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4672F, -0.5008F, 2.6888F, -0.143F, -0.1297F, 3.0715F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(72, 56).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3F, -3.7765F, 0.9539F, 0.4061F, 0.7029F, -0.9837F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(14, 70).addBox(-0.3919F, -0.7092F, -0.2922F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, 0.8406F, -0.153F, 0.207F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(88, 22).addBox(-0.4889F, -0.2897F, -0.6864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8072F, -2.5802F, 1.3464F, 0.0432F, -0.1556F, 0.1879F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(78, 32).addBox(-1.4423F, 1.6805F, 1.5227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.8167F, 0.2148F, -0.1787F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(34, 61).addBox(-1.8423F, -2.2357F, 2.0886F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.2284F, 0.4172F, -0.7874F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 35).addBox(-0.7F, -0.3F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-2.6F, 0.0423F, 2.0307F, -2.5399F, -0.1766F, 0.2505F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(40, 50).addBox(-0.8F, -1.8F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4959F, 1.3043F, 1.6238F, -0.3033F, -0.1294F, 0.0367F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 43).addBox(-0.8F, -1.8F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4797F, 2.4987F, -1.8201F, 0.3074F, -0.0421F, 0.1203F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 65).addBox(-0.8F, -1.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4782F, 2.5878F, -2.312F, 0.1775F, -0.0255F, 0.1244F));

		PartDefinition cube_r272 = leftOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(56, 71).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6295F, -2.0818F, 0.1502F, -0.1236F, 0.5492F, 0.1465F));

		PartDefinition cube_r273 = leftOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(15, 83).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.177F, -2.8742F, 0.4191F, 0.4797F, 0.2723F, 0.9662F));

		PartDefinition cube_r274 = leftOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(10, 83).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, -2.9722F, -0.1886F, 0.3081F, 0.3621F, 0.3594F));

		PartDefinition cube_r275 = leftOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(51, 59).addBox(-1.4423F, -2.2357F, 2.0886F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.424F, 0.2148F, -0.1787F));

		PartDefinition cube_r276 = leftOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 6).addBox(-1.6629F, -2.1187F, -0.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.0318F, -0.003F, 0.2124F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.8F, 1.8933F, -5.1002F));

		PartDefinition cube_r277 = rightOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(45, 77).mirror().addBox(-0.944F, -0.7329F, -0.6195F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, 1.4395F, -0.1305F, -0.0701F));

		PartDefinition cube_r278 = rightOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.944F, -0.2859F, -0.2439F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, 2.5303F, -0.1305F, -0.0701F));

		PartDefinition cube_r279 = rightOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(78, 53).mirror().addBox(-0.944F, -0.1623F, -0.7661F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, -2.7493F, -0.1305F, -0.0701F));

		PartDefinition cube_r280 = rightOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.944F, -0.7639F, -0.2624F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, -1.2222F, -0.1305F, -0.0701F));

		PartDefinition cube_r281 = rightOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-0.944F, -0.452F, -0.0627F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, -0.7422F, -0.1305F, -0.0701F));

		PartDefinition cube_r282 = rightOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(70, 65).mirror().addBox(-0.944F, -0.3999F, -0.5747F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, -0.524F, -0.1305F, -0.0701F));

		PartDefinition cube_r283 = rightOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-0.8F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.9695F, 1.5036F, -3.7014F, 1.7193F, 0.5317F, -1.515F));

		PartDefinition cube_r284 = rightOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.2601F, -1.8642F, -0.0941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5981F, 1.8074F, -2.5584F, 2.1161F, 0.0763F, -0.3561F));

		PartDefinition cube_r285 = rightOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(24, 63).mirror().addBox(-0.8F, -2.5F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.3209F, 3.9155F, -7.6016F, 1.7193F, 0.5317F, -1.515F));

		PartDefinition cube_r286 = rightOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.425F, 0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 3).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7261F, 3.3049F, -4.8965F, 2.0198F, 0.4641F, -0.6542F));

		PartDefinition cube_r287 = rightOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7347F, 3.736F, -5.5745F, 2.0109F, 0.4247F, -0.675F));

		PartDefinition cube_r288 = rightOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.675F, 1.9F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 69).mirror().addBox(-0.7F, 1.1F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 66).mirror().addBox(-0.7F, 0.3F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 63).mirror().addBox(-0.7F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7356F, 5.1195F, -8.4752F, 1.9961F, 0.3455F, -0.7145F));

		PartDefinition cube_r289 = rightOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(85, 49).mirror().addBox(-0.9679F, -9.2076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8819F, 4.9096F, -8.6672F, 2.0113F, 0.256F, -0.6987F));

		PartDefinition cube_r290 = rightOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(85, 43).mirror().addBox(-1.0679F, -8.4076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 40).mirror().addBox(-1.0679F, -7.6076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 35).mirror().addBox(-1.0679F, -6.8076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 32).mirror().addBox(-1.0679F, -6.0076F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8819F, 4.9096F, -8.6672F, 2.0228F, 0.2426F, -0.6958F));

		PartDefinition cube_r291 = rightOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(72, 60).mirror().addBox(-0.8984F, -5.2378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(73, 47).mirror().addBox(-0.9484F, -4.4378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 0).mirror().addBox(-0.9484F, -3.6378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 29).mirror().addBox(-0.9984F, -2.8378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 10).mirror().addBox(-0.9984F, -2.0378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8819F, 4.9096F, -8.6672F, 2.0315F, 0.3053F, -0.6639F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.9984F, -1.2378F, -0.897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8819F, 4.9096F, -8.6672F, 2.0082F, 0.3323F, -0.7104F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(35, 49).mirror().addBox(-0.1295F, -8.4378F, -0.714F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.8819F, 4.9096F, -8.6672F, 2.1101F, 0.0934F, -0.2738F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(19, 63).mirror().addBox(-0.1601F, -4.7892F, -0.3941F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5848F, 3.2926F, -5.3915F, 2.1161F, 0.0763F, -0.3561F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(22, 79).mirror().addBox(-0.8F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.0544F, 2.3491F, -5.0438F, 1.6011F, 0.5816F, -1.5098F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(17, 79).mirror().addBox(-0.8601F, -1.8642F, -0.0941F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.3504F, 2.413F, -3.9681F, 2.1252F, 0.1879F, -0.2871F));

		PartDefinition cube_r297 = rightOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(58, 59).mirror().addBox(-1.3678F, -2.3601F, -0.7679F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.6599F, -0.2136F, -1.41F, 2.0866F, 0.4814F, -0.9907F));

		PartDefinition cube_r298 = rightOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(34, 78).mirror().addBox(-1.9159F, -2.3601F, -0.4226F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.6599F, -0.2136F, -1.41F, 2.2598F, 0.046F, -0.3618F));

		PartDefinition cube_r299 = rightOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(72, 15).mirror().addBox(-0.5581F, -0.7975F, -2.3836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.2139F, -0.9289F, -1.5275F, -3.076F, 0.1857F, -1.7141F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(-0.1569F, -0.853F, -3.1197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false), PartPose.offsetAndRotation(-0.4139F, -0.9289F, 0.6725F, 3.1114F, 0.303F, -1.6808F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(1.0165F, -0.853F, -2.1258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4139F, -0.9289F, 0.6725F, 3.1123F, -0.1767F, -1.6666F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(78, 41).mirror().addBox(0.6652F, -0.853F, -0.6973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.4139F, -0.9289F, 0.6725F, 3.0911F, -0.9616F, -1.6304F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(78, 35).mirror().addBox(0.7409F, -0.853F, -0.5966F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4139F, -0.9289F, 0.6725F, 3.0526F, -1.2402F, -1.5876F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-0.2063F, -0.853F, -1.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false)
				.texOffs(20, 90).mirror().addBox(-0.2063F, -0.853F, -0.621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4139F, -0.9289F, 0.6725F, 3.1127F, -0.0633F, -1.67F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-1.8F, -0.2F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(1.0738F, -0.6982F, -1.0571F, 2.4348F, 0.3957F, -3.1058F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.6F, -0.1F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(1.081F, -1.2036F, -0.1605F, 2.7283F, 0.288F, -3.0114F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(11, 49).mirror().addBox(-2.1023F, -0.7694F, -3.3836F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.2139F, -0.9289F, -1.5275F, 3.0399F, 0.1688F, -2.6015F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(47, 73).mirror().addBox(-0.1687F, -0.5876F, -2.2554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.2139F, -0.9289F, -1.5275F, 2.4242F, -0.9541F, -1.8174F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-0.1687F, -0.7975F, -0.8219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.2139F, -0.9289F, -1.5275F, -3.03F, -0.9541F, -1.8174F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(29, 66).mirror().addBox(-0.35F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.3578F, -0.7058F, -1.7649F, 2.1414F, -0.7262F, -1.4553F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(90, 31).mirror().addBox(-0.35F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(15, 90).mirror().addBox(-0.475F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false), PartPose.offsetAndRotation(0.483F, -0.4862F, -1.5732F, 2.9704F, -0.7262F, -1.4553F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(2.5383F, 0.4628F, 2.1205F, -2.8328F, -0.7262F, -1.4553F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.483F, -0.4862F, -1.5732F, 2.8082F, -0.3625F, -1.0409F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(79, 88).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9844F, 0.1504F, -1.9648F, 2.684F, -0.1742F, -0.5819F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-0.2F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.6692F, 0.152F, -1.9394F, 2.6615F, -0.138F, -0.4123F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(88, 77).mirror().addBox(-0.4814F, -0.1726F, -1.4721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(28, 70).mirror().addBox(-0.4814F, -0.3726F, -1.4721F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.4672F, -0.5008F, 2.6888F, -0.4921F, 0.1297F, -3.0715F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(49, 50).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.5785F, 0.7146F, 2.7439F, -0.5357F, 0.1297F, -3.0715F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(67, 7).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.8035F, 1.027F, 4.2969F, 0.5988F, 0.1297F, -3.0715F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.8035F, 1.027F, 4.2969F, 1.0787F, 0.1297F, -3.0715F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(63, 71).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.5785F, 0.7146F, 2.7439F, 0.2061F, 0.1297F, -3.0715F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4922F, 0.5468F, 2.1744F, 0.2933F, 0.1297F, -3.0715F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(58, 88).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4041F, 0.2586F, 1.6556F, 0.5115F, 0.1297F, -3.0715F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(53, 88).mirror().addBox(-0.4814F, -0.7167F, -0.5844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4672F, -0.5008F, 2.6888F, -0.0208F, 0.1297F, -3.0715F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(38, 88).mirror().addBox(-0.4814F, -0.1497F, 0.5565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(33, 88).mirror().addBox(-0.4814F, -0.1497F, 0.0565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4672F, -0.5008F, 2.6888F, -0.2739F, 0.1297F, -3.0715F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(-0.4814F, -0.1166F, -1.5523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4672F, -0.5008F, 2.6888F, -0.143F, 0.1297F, -3.0715F));

		PartDefinition cube_r326 = rightOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.3F, -3.7765F, 0.9539F, 0.4061F, -0.7029F, 0.9837F));

		PartDefinition cube_r327 = rightOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-0.6081F, -0.7092F, -0.2922F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, 0.8406F, 0.153F, -0.207F));

		PartDefinition cube_r328 = rightOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(88, 22).mirror().addBox(-0.5111F, -0.2897F, -0.6864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.8072F, -2.5802F, 1.3464F, 0.0432F, 0.1556F, -0.1879F));

		PartDefinition cube_r329 = rightOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(78, 32).mirror().addBox(-0.5577F, 1.6805F, 1.5227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.8167F, -0.2148F, 0.1787F));

		PartDefinition cube_r330 = rightOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(34, 61).mirror().addBox(-0.1577F, -2.2357F, 2.0886F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.2284F, -0.4172F, 0.7874F));

		PartDefinition cube_r331 = rightOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.3F, -0.3F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(2.6F, 0.0423F, 2.0307F, -2.5399F, 0.1766F, -0.2505F));

		PartDefinition cube_r332 = rightOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(40, 50).mirror().addBox(-0.2F, -1.8F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4959F, 1.3043F, 1.6238F, -0.3033F, 0.1294F, -0.0367F));

		PartDefinition cube_r333 = rightOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.2F, -1.8F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4797F, 2.4987F, -1.8201F, 0.3074F, 0.0421F, -0.1203F));

		PartDefinition cube_r334 = rightOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.2F, -1.8F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4782F, 2.5878F, -2.312F, 0.1775F, 0.0255F, -0.1244F));

		PartDefinition cube_r335 = rightOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(56, 71).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6295F, -2.0818F, 0.1502F, -0.1236F, -0.5492F, -0.1465F));

		PartDefinition cube_r336 = rightOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.177F, -2.8742F, 0.4191F, 0.4797F, -0.2723F, -0.9662F));

		PartDefinition cube_r337 = rightOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3F, -2.9722F, -0.1886F, 0.3081F, -0.3621F, -0.3594F));

		PartDefinition cube_r338 = rightOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(51, 59).mirror().addBox(-0.5577F, -2.2357F, 2.0886F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.424F, -0.2148F, 0.1787F));

		PartDefinition cube_r339 = rightOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(0.6629F, -2.1187F, -0.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.0318F, 0.003F, -0.2124F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.4176F, -1.7322F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(-0.5076F, -1.5004F, -0.5141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8135F, -2.3453F, -7.7095F, -1.9897F, -0.1745F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(-0.5076F, -0.7615F, -0.4183F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8135F, -2.3453F, -7.7095F, -1.8151F, -0.1745F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(36, 66).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1608F, -3.0335F, -5.7833F, -1.6406F, -0.1745F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(41, 64).mirror().addBox(-0.28F, -0.24F, -0.0348F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.9025F, -2.9794F, -9.8061F, -1.7017F, -0.1222F, 0.0F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-0.28F, -0.2746F, -0.6244F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.9025F, -2.9794F, -9.8061F, -1.6712F, -0.1222F, 0.0F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(19, 74).mirror().addBox(-0.6101F, -0.2082F, -0.6029F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(24, 74).mirror().addBox(-0.6101F, -0.2082F, -0.8029F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.7842F, -0.078F, -0.0064F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(-0.333F, 1.9682F, -1.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 0).mirror().addBox(-0.333F, 1.1682F, -1.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.6963F, -0.1109F, -0.4038F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.3073F, 2.0796F, -3.6514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.1525F, 1.0204F, -1.176F, -1.6581F, -0.1745F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6582F, -2.7983F, -2.8694F, -2.0508F, -0.1745F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-0.5F, -2.0F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9511F, -1.7237F, -1.2082F, -2.2253F, -0.1745F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(84, 13).mirror().addBox(-0.5F, -1.225F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.97F, -0.2225F, -1.1014F, -1.789F, -0.1745F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-0.5F, 0.0F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 0).mirror().addBox(-0.5F, -0.8F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.816F, 0.1956F, -1.9744F, -1.9024F, -0.1745F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-0.28F, -0.2331F, -0.3745F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9025F, -2.9794F, -9.8061F, -1.6886F, -0.1222F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(29, 58).mirror().addBox(-0.6101F, 2.1813F, -0.451F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.8453F, -0.078F, -0.0064F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(51, 65).mirror().addBox(-0.6492F, -0.1963F, -1.051F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.7584F, -0.0436F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-0.6492F, 4.2176F, -0.8173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.8108F, -0.0436F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(91, 16).mirror().addBox(-0.308F, 0.3612F, -1.4377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.6876F, -0.1109F, -0.4038F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(90, 34).mirror().addBox(-0.475F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 37).mirror().addBox(-0.475F, -1.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2587F, -3.9736F, -14.0507F, -1.6563F, -0.183F, -0.4083F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.2534F, -0.7193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 55).mirror().addBox(-0.2534F, -1.5193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 58).mirror().addBox(-0.2534F, -2.3193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 61).mirror().addBox(-0.2534F, -3.1193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 64).mirror().addBox(-0.2534F, -3.9193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5432F, -3.5177F, -12.7423F, -1.6036F, -0.1482F, -0.4101F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(66, 89).mirror().addBox(-0.2534F, -0.7193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 67).mirror().addBox(-0.2534F, -1.5193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 70).mirror().addBox(-0.2534F, -2.3193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 73).mirror().addBox(-0.2534F, -3.1193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 88).mirror().addBox(-0.2534F, -3.9193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0321F, -3.162F, -8.7883F, -1.6211F, -0.1482F, -0.4101F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-0.4253F, 2.6499F, -1.4501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(91, 3).mirror().addBox(-0.4253F, 3.4499F, -1.4501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.7054F, -0.1457F, -0.4009F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.4753F, 4.2715F, -1.4971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 90).mirror().addBox(-0.4753F, 5.0715F, -1.5721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.6967F, -0.1457F, -0.4009F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(33, 91).mirror().addBox(-1.6757F, 3.4631F, -6.7908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -0.7477F, -0.4131F, -1.0381F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(89, 25).mirror().addBox(-1.6757F, 6.9838F, -0.9485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, -1.664F, -0.4131F, -1.0381F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-1.6757F, -4.487F, -6.5075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -2.9794F, -14.1061F, 0.4304F, -0.4131F, -1.0381F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(9, 59).mirror().addBox(-0.5F, -5.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -5.0716F, -21.6911F, -1.8445F, -0.0107F, -0.0253F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(29, 74).mirror().addBox(-0.45F, -1.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(59, 41).mirror().addBox(-0.45F, -1.3F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 31).mirror().addBox(-0.625F, -1.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.6215F, -3.4538F, -15.2994F, -1.7836F, -0.0268F, -0.0175F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(46, 64).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0066F, -2.8131F, -12.0148F, -1.7011F, -0.0789F, -0.0057F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.65F, -1.525F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.6215F, -3.4538F, -15.2994F, -1.7841F, -0.0694F, -0.0082F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(-0.475F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0066F, -2.8131F, -12.0148F, -1.7025F, -0.1654F, 0.0058F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -0.8F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(64, 31).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.616F, 0.1956F, -1.9744F, -1.9024F, 0.1745F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(84, 13).addBox(-0.5F, -1.225F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.77F, -0.2225F, -1.1014F, -1.789F, 0.1745F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(83, 21).addBox(-0.5F, -2.0F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7511F, -1.7237F, -1.2082F, -2.2253F, 0.1745F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4582F, -2.7983F, -2.8694F, -2.0508F, 0.1745F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(40, 77).addBox(-0.6927F, 2.0796F, -3.6514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, -1.176F, -1.6581F, 0.1745F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(89, 88).addBox(-0.7466F, -3.9193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 73).addBox(-0.7466F, -3.1193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 70).addBox(-0.7466F, -2.3193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 67).addBox(-0.7466F, -1.5193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 89).addBox(-0.7466F, -0.7193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8321F, -3.162F, -8.7883F, -1.6211F, 0.1482F, 0.4101F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(89, 64).addBox(-0.7466F, -3.9193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 61).addBox(-0.7466F, -3.1193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 58).addBox(-0.7466F, -2.3193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 55).addBox(-0.7466F, -1.5193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 89).addBox(-0.7466F, -0.7193F, -0.636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3432F, -3.5177F, -12.7423F, -1.6036F, 0.1482F, 0.4101F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(90, 37).addBox(-0.525F, -1.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 34).addBox(-0.525F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0587F, -3.9736F, -14.0507F, -1.6563F, 0.183F, 0.4083F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(91, 16).addBox(-0.692F, 0.3612F, -1.4377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.6876F, 0.1109F, 0.4038F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(89, 0).addBox(-0.667F, 1.1682F, -1.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 89).addBox(-0.667F, 1.9682F, -1.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.6963F, 0.1109F, 0.4038F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(89, 25).addBox(0.6757F, 6.9838F, -0.9485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.664F, 0.4131F, 1.0381F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(90, 9).addBox(0.6757F, -4.487F, -6.5075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, 0.4304F, 0.4131F, 1.0381F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(33, 91).addBox(0.6757F, 3.4631F, -6.7908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -0.7477F, 0.4131F, 1.0381F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5247F, 5.0715F, -1.5721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 91).addBox(-0.5247F, 4.2715F, -1.4971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.6967F, 0.1457F, 0.4009F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(91, 3).addBox(-0.5747F, 3.4499F, -1.4501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 49).addBox(-0.5747F, 2.6499F, -1.4501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.7054F, 0.1457F, 0.4009F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(9, 59).addBox(-0.5F, -5.7F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6663F, -5.0716F, -21.6911F, -1.8445F, 0.0107F, 0.0253F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(29, 58).addBox(-0.3899F, 2.1813F, -0.451F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.8453F, 0.078F, 0.0064F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(59, 31).addBox(-0.375F, -1.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(59, 41).addBox(-0.55F, -1.3F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(29, 74).addBox(-0.55F, -1.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5785F, -3.4538F, -15.2994F, -1.7836F, 0.0268F, 0.0175F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(7, 75).addBox(-0.35F, -1.525F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.5785F, -3.4538F, -15.2994F, -1.7841F, 0.0694F, 0.0082F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(24, 74).addBox(-0.3899F, -0.2082F, -0.8029F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(19, 74).addBox(-0.3899F, -0.2082F, -0.6029F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.7842F, 0.078F, 0.0064F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(35, 72).addBox(-0.3508F, 4.2176F, -0.8173F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.8108F, 0.0436F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(51, 65).addBox(-0.3508F, -0.1963F, -1.051F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1975F, -2.9794F, -14.1061F, -1.7584F, 0.0436F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(64, 41).addBox(-0.72F, -0.2746F, -0.6244F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.7025F, -2.9794F, -9.8061F, -1.6712F, 0.1222F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(65, 0).addBox(-0.72F, -0.2331F, -0.3745F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7025F, -2.9794F, -9.8061F, -1.6886F, 0.1222F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(14, 59).addBox(-0.525F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1934F, -2.8131F, -12.0148F, -1.7025F, 0.1654F, -0.0058F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(46, 64).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1934F, -2.8131F, -12.0148F, -1.7011F, 0.0789F, 0.0057F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(41, 64).addBox(-0.72F, -0.24F, -0.0348F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.7025F, -2.9794F, -9.8061F, -1.7017F, 0.1222F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(36, 66).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9608F, -3.0335F, -5.7833F, -1.6406F, 0.1745F, 0.0F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(14, 74).addBox(-0.4924F, -0.7615F, -0.4183F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6135F, -2.3453F, -7.7095F, -1.8151F, 0.1745F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(30, 83).addBox(-0.4924F, -1.5004F, -0.5141F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6135F, -2.3453F, -7.7095F, -1.9897F, 0.1745F, 0.0F));

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