package fossils.fossils.client.blockentity.model.caperea;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CapereaFossilModel extends SkullModelBase {
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
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public CapereaFossilModel(ModelPart root) {
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

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.277F, -20.9263F, -0.0038F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 98).addBox(0.0F, -1.6068F, -1.1181F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5854F, -2.0706F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 105).addBox(0.0F, -2.4521F, 0.0721F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2624F, -0.5632F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 62).addBox(-1.8307F, -0.1817F, -0.751F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8307F, 7.6842F, 0.2392F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(107, 95).mirror().addBox(-0.1534F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, 0.2089F, 0.1046F, 0.1303F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(47, 19).mirror().addBox(-12.0988F, -3.0263F, -0.311F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, -0.5018F, 0.4067F, -1.2931F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(87, 8).mirror().addBox(-5.876F, -0.7935F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, -0.3034F, 0.5666F, -0.875F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 88).mirror().addBox(-2.9833F, -0.0221F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.5474F, -0.0162F, -0.1291F, 0.6232F, -0.5659F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(75, 39).mirror().addBox(-3.1033F, 0.2263F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8307F, 7.6842F, 0.2392F, -0.0701F, -0.0704F, 0.9014F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(109, 97).mirror().addBox(-0.1534F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.9474F, -1.7163F, 0.2002F, 0.1057F, 0.1294F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(102, 51).mirror().addBox(-2.0413F, -0.0333F, -0.2303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.9474F, -1.8163F, -0.0137F, 0.4386F, -0.3335F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 53).mirror().addBox(-3.7499F, -0.9721F, -0.4626F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.9474F, -1.8163F, -0.2392F, 0.5075F, -0.8872F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(102, 97).mirror().addBox(-3.7646F, -0.9721F, -1.487F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.9474F, -1.8163F, -0.4271F, 1.0473F, -1.1447F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(75, 39).addBox(-0.8967F, 0.2263F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8307F, 7.6842F, 0.2392F, -0.0701F, 0.0704F, -0.9014F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(102, 97).addBox(1.7646F, -0.9721F, -1.487F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.9474F, -1.8163F, -0.4271F, -1.0473F, 1.1447F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(102, 53).addBox(1.7499F, -0.9721F, -0.4626F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.9474F, -1.8163F, -0.2392F, -0.5075F, 0.8872F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(102, 51).addBox(0.0413F, -0.0333F, -0.2303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.9474F, -1.8163F, -0.0137F, -0.4386F, 0.3335F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(109, 97).addBox(-0.8466F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.9474F, -1.7163F, 0.2002F, -0.1057F, -0.1294F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 88).addBox(-0.0167F, -0.0221F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, -0.1291F, -0.6232F, 0.5659F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(87, 8).addBox(2.876F, -0.7935F, -0.311F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, -0.3034F, -0.5666F, 0.875F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(47, 19).addBox(5.0988F, -3.0263F, -0.311F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, -0.5018F, -0.4067F, 1.2931F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(107, 95).addBox(-0.8466F, -0.0796F, -0.3667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.5474F, -0.0162F, 0.2089F, -0.1046F, -0.1303F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(73, 22).addBox(-0.5F, -0.157F, 0.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7854F, -2.5206F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, 0.4829F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(84, 37).mirror().addBox(-2.9175F, 0.0237F, -0.2697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.485F, 5.5008F, -0.311F, 0.5479F, -0.5565F));

		PartDefinition cube_r24 = body6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(85, 47).mirror().addBox(-5.8242F, -0.7322F, -0.2697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.485F, 5.5008F, -0.4446F, 0.4506F, -0.8337F));

		PartDefinition cube_r25 = body6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(47, 17).mirror().addBox(-12.0751F, -2.9497F, -0.2697F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.485F, 5.5008F, -0.5749F, 0.2523F, -1.2066F));

		PartDefinition cube_r26 = body6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(102, 36).mirror().addBox(-1.9081F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.0609F, 0.1489F, 0.0292F));

		PartDefinition cube_r27 = body6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(-2.9374F, -0.0783F, -0.3281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.485F, 3.5008F, -0.3436F, 0.5144F, -0.6604F));

		PartDefinition cube_r28 = body6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-5.817F, -0.8359F, -0.3281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.485F, 3.5008F, -0.4644F, 0.4107F, -0.9295F));

		PartDefinition cube_r29 = body6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(47, 23).mirror().addBox(-12.028F, -3.0423F, -0.3281F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.485F, 3.5008F, -0.5774F, 0.2086F, -1.2946F));

		PartDefinition cube_r30 = body6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(47, 25).mirror().addBox(-11.9055F, -3.0617F, -0.3482F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.56F, 0.2047F, -1.2409F));

		PartDefinition cube_r31 = body6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(89, 16).mirror().addBox(-5.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.4486F, 0.401F, -0.8731F));

		PartDefinition cube_r32 = body6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-2.8528F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.3306F, 0.5011F, -0.6039F));

		PartDefinition cube_r33 = body6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(109, 73).mirror().addBox(-1.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.0005F, 0.1294F, 0.1058F));

		PartDefinition cube_r34 = body6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 67).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4466F, 5.2477F, 0.0342F, -0.6978F, -0.022F));

		PartDefinition cube_r35 = body6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 104).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 104).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4466F, 5.2477F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(110, 69).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4533F, 5.2477F, 0.0387F, -0.8287F, -0.0286F));

		PartDefinition cube_r37 = body6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(109, 73).addBox(0.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.0005F, -0.1294F, -0.1058F));

		PartDefinition cube_r38 = body6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(89, 18).addBox(-0.1472F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.3306F, -0.5011F, 0.6039F));

		PartDefinition cube_r39 = body6.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(89, 16).addBox(2.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.4486F, -0.401F, 0.8731F));

		PartDefinition cube_r40 = body6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(47, 25).addBox(4.9055F, -3.0617F, -0.3482F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.56F, -0.2047F, 1.2409F));

		PartDefinition cube_r41 = body6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(47, 23).addBox(5.028F, -3.0423F, -0.3281F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.485F, 3.5008F, -0.5774F, -0.2086F, 1.2946F));

		PartDefinition cube_r42 = body6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(12, 89).addBox(2.817F, -0.8359F, -0.3281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.485F, 3.5008F, -0.4644F, -0.4107F, 0.9295F));

		PartDefinition cube_r43 = body6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(84, 88).addBox(-0.0626F, -0.0783F, -0.3281F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.485F, 3.5008F, -0.3436F, -0.5144F, 0.6604F));

		PartDefinition cube_r44 = body6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(102, 36).addBox(-0.0919F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.0609F, -0.1489F, -0.0292F));

		PartDefinition cube_r45 = body6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(110, 67).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4466F, 5.2477F, 0.0342F, 0.6978F, 0.022F));

		PartDefinition cube_r46 = body6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(110, 69).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4533F, 5.2477F, 0.0387F, 0.8287F, 0.0286F));

		PartDefinition cube_r47 = body6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(32, 10).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.104F, 0.0109F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(5, 109).addBox(0.0F, -3.0786F, -0.1073F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1345F, 5.1082F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(47, 17).addBox(5.0751F, -2.9497F, -0.2697F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.485F, 5.5008F, -0.5749F, -0.2523F, 1.2066F));

		PartDefinition cube_r50 = body6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(85, 47).addBox(2.8242F, -0.7322F, -0.2697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.485F, 5.5008F, -0.4446F, -0.4506F, 0.8337F));

		PartDefinition cube_r51 = body6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 37).addBox(-0.0825F, 0.0237F, -0.2697F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.485F, 5.5008F, -0.311F, -0.5479F, 0.5565F));

		PartDefinition cube_r52 = body6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(46, 108).addBox(0.0F, -2.6161F, -0.0338F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.9539F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(106, 108).addBox(0.0F, -2.9246F, -0.0282F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.9539F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftarm = body6.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1127F, 7.3958F, -0.7576F, 0.4787F, 0.1842F, -0.5917F));

		PartDefinition cube_r54 = leftarm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(78, 104).addBox(-0.5F, 0.0F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0109F, 0.0204F, -0.2505F, -1.0822F, 0.0014F, -0.001F));

		PartDefinition cube_r55 = leftarm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(32, 104).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0101F, 0.4756F, 0.0373F, -0.2095F, 0.0014F, -0.001F));

		PartDefinition cube_r56 = leftarm.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(46, 105).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.008F, 2.6522F, 0.0173F, 2.1903F, 0.0014F, -0.001F));

		PartDefinition cube_r57 = leftarm.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(95, 104).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0099F, 0.8427F, -0.0898F, 1.6667F, 0.0014F, -0.001F));

		PartDefinition cube_r58 = leftarm.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(107, 99).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0076F, 2.633F, 0.0149F, -0.3404F, 0.0014F, -0.001F));

		PartDefinition cube_r59 = leftarm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(104, 58).addBox(-0.011F, 1.0254F, 0.1689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5014F, 0.0619F, -1.2637F, 0.2268F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1618F, 3.9904F, 0.1568F, -0.0573F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftarm2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(105, 8).addBox(-0.15F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 4.5641F, 1.2827F, 1.5708F, -1.4923F, -1.5708F));

		PartDefinition cube_r61 = leftarm2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(45, 98).addBox(-0.625F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(33, 55).addBox(-0.15F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1764F, 2.0081F, 0.1024F, 1.5708F, -0.9687F, -1.5708F));

		PartDefinition cube_r62 = leftarm2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(98, 24).addBox(-0.3647F, -1.6017F, -0.5086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(17, 99).addBox(-0.8647F, -1.6017F, -0.5086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.185F, 0.8907F, -0.0636F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition cube_r63 = leftarm2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(36, 99).addBox(-0.4116F, -2.8229F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.1764F, 1.2487F, 1.7295F, -1.5708F, 1.0559F, 1.5708F));

		PartDefinition cube_r64 = leftarm2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(98, 29).addBox(-0.4149F, -0.1769F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1764F, 1.2487F, 1.7295F, -1.5708F, 1.1868F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 4.2529F, 2.6264F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftArm3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(27, 69).addBox(0.0F, 2.2F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.1F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition rightarm = body6.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1127F, 7.3958F, -0.7576F, 0.4787F, -0.1842F, 0.5917F));

		PartDefinition cube_r66 = rightarm.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(83, 104).addBox(-0.5F, 0.0F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0109F, 0.0204F, -0.2505F, -1.0822F, -0.0014F, 0.001F));

		PartDefinition cube_r67 = rightarm.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(104, 55).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0101F, 0.4756F, 0.0373F, -0.2095F, -0.0014F, 0.001F));

		PartDefinition cube_r68 = rightarm.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.008F, 2.6522F, 0.0173F, 2.1903F, -0.0014F, 0.001F));

		PartDefinition cube_r69 = rightarm.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 105).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0099F, 0.8427F, -0.0898F, 1.6667F, -0.0014F, 0.001F));

		PartDefinition cube_r70 = rightarm.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(15, 108).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0076F, 2.633F, 0.0149F, -0.3404F, -0.0014F, 0.001F));

		PartDefinition cube_r71 = rightarm.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(104, 73).addBox(-0.989F, 1.0254F, 0.1689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5014F, 0.0619F, -1.2637F, 0.2268F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1618F, 3.9904F, 0.1568F, -0.0573F, 0.0F, 0.0F));

		PartDefinition cube_r72 = rightarm2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(105, 21).addBox(-0.85F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 4.5641F, 1.2827F, 1.5708F, 1.4923F, 1.5708F));

		PartDefinition cube_r73 = rightarm2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(12, 99).addBox(-0.375F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(97, 94).addBox(-0.85F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1764F, 2.0081F, 0.1024F, 1.5708F, 0.9687F, 1.5708F));

		PartDefinition cube_r74 = rightarm2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(26, 98).addBox(-0.6353F, -1.6017F, -0.5086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(60, 99).addBox(-0.1353F, -1.6017F, -0.5086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.185F, 0.8907F, -0.0636F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition cube_r75 = rightarm2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(85, 99).addBox(-0.5884F, -2.8229F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.1764F, 1.2487F, 1.7295F, -1.5708F, -1.0559F, -1.5708F));

		PartDefinition cube_r76 = rightarm2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(55, 98).addBox(-0.5851F, -0.1769F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1764F, 1.2487F, 1.7295F, -1.5708F, -1.1868F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 4.2529F, 2.6264F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightArm3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(49, 69).addBox(0.0F, 2.2F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 0.1F, 3.0543F, 0.0F, -3.1416F));

		PartDefinition bone2 = body6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7897F, 5.3021F, -0.8525F, -0.3743F, -0.0148F, -0.1301F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(71, 62).addBox(-0.5F, -0.8F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2932F, -0.0712F, -0.4812F, 2.24F, 0.2429F, -0.0456F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(105, 76).addBox(-0.5F, -0.8F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(105, 61).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5713F, 0.8648F, -1.8499F, -0.4846F, -0.096F, -0.1609F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(70, 107).addBox(-0.4717F, -0.8708F, 0.1636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5463F, 1.128F, -1.4519F, 0.6499F, -0.096F, -0.1609F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(93, 86).addBox(-0.4717F, -0.9208F, -0.6614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.5463F, 1.128F, -1.4519F, -0.3101F, -0.096F, -0.1609F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 54).addBox(-0.0968F, -0.2651F, -1.8363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(87, 0).addBox(-0.0968F, -0.8651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, 0.2429F, -0.0456F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(74, 100).addBox(-0.0968F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, 0.2429F, -0.0456F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(82, 22).addBox(-0.5F, -0.4F, 0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.56F, -1.1183F, 0.787F, -0.6835F, 0.2429F, -0.0456F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(73, 27).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1204F, -1.4335F, -1.8986F, 2.4145F, 0.2429F, -0.0456F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 103).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1719F, 0.3374F, 2.9865F, -1.1983F, 0.2429F, -0.0456F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(22, 103).addBox(-0.5F, 0.0F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5032F, 0.2284F, 4.3424F, -1.5038F, 0.2429F, -0.0456F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(26, 89).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4707F, -2.2842F, -3.1547F, 0.7972F, 0.247F, -0.0411F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(71, 41).addBox(-0.5031F, 1.004F, -2.9023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4707F, -2.2842F, -3.1547F, 2.2863F, 0.2511F, -0.0402F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(102, 99).addBox(-0.5031F, -1.1429F, -2.814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4707F, -2.2842F, -3.1547F, -2.8188F, 0.2511F, -0.0402F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(9, 72).addBox(-0.5031F, -3.426F, -1.6637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4707F, -2.2842F, -3.1547F, -1.5534F, 0.2511F, -0.0402F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(64, 31).addBox(-0.5F, 0.2F, -0.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0302F, -2.6093F, 2.9572F, -1.8441F, 0.2429F, -0.0456F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(78, 96).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3381F, -1.5907F, 4.0114F, -2.8564F, 0.2429F, -0.0456F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(70, 78).addBox(-0.5F, -4.85F, 0.35F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5462F, -1.7831F, 4.8859F, 2.1614F, 0.2429F, -0.0456F));

		PartDefinition bone3 = body6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7897F, 5.3021F, -0.8525F, -0.3743F, 0.0148F, 0.1301F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-0.5F, -0.8F, -1.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2932F, -0.0712F, -0.4812F, 2.24F, -0.2429F, 0.0456F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(105, 76).mirror().addBox(-0.5F, -0.8F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(105, 61).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5713F, 0.8648F, -1.8499F, -0.4846F, 0.096F, 0.1609F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(70, 107).mirror().addBox(-0.5283F, -0.8708F, 0.1636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.128F, -1.4519F, 0.6499F, 0.096F, 0.1609F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(93, 86).mirror().addBox(-0.5283F, -0.9208F, -0.6614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.5463F, 1.128F, -1.4519F, -0.3101F, 0.096F, 0.1609F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(50, 54).mirror().addBox(-0.9032F, -0.2651F, -1.8363F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(87, 0).mirror().addBox(-0.9032F, -0.8651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, -0.2429F, 0.0456F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(74, 100).mirror().addBox(-0.9032F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, -0.2429F, 0.0456F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-0.5F, -0.4F, 0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.56F, -1.1183F, 0.787F, -0.6835F, -0.2429F, 0.0456F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 27).mirror().addBox(-0.5F, -0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1204F, -1.4335F, -1.8986F, 2.4145F, -0.2429F, 0.0456F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(55, 103).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1719F, 0.3374F, 2.9865F, -1.1983F, -0.2429F, 0.0456F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(22, 103).mirror().addBox(-0.5F, 0.0F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.5032F, 0.2284F, 4.3424F, -1.5038F, -0.2429F, 0.0456F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(26, 89).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4707F, -2.2842F, -3.1547F, 0.7972F, -0.247F, 0.0411F));

		PartDefinition cube_r106 = bone3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-0.4969F, 1.004F, -2.9023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4707F, -2.2842F, -3.1547F, 2.2863F, -0.2511F, 0.0402F));

		PartDefinition cube_r107 = bone3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(102, 99).mirror().addBox(-0.4969F, -1.1429F, -2.814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4707F, -2.2842F, -3.1547F, -2.8188F, -0.2511F, 0.0402F));

		PartDefinition cube_r108 = bone3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(9, 72).mirror().addBox(-0.4969F, -3.426F, -1.6637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4707F, -2.2842F, -3.1547F, -1.5534F, -0.2511F, 0.0402F));

		PartDefinition cube_r109 = bone3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-0.5F, 0.2F, -0.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0302F, -2.6093F, 2.9572F, -1.8441F, -0.2429F, 0.0456F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(78, 96).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3381F, -1.5907F, 4.0114F, -2.8564F, -0.2429F, 0.0456F));

		PartDefinition cube_r111 = bone3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-0.5F, -4.85F, 0.35F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5462F, -1.7831F, 4.8859F, 2.1614F, -0.2429F, 0.0456F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5957F, 5.8766F, -0.3062F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(88, 105).addBox(0.0F, -3.077F, -0.2081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5296F, 1.1014F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(105, 81).addBox(0.0F, -3.104F, 0.038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.996F, 4.843F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-5.753F, -0.7481F, -0.3104F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2206F, 1.4356F, -0.1764F, 0.7088F, -0.6934F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-13.0034F, -2.9366F, -0.3104F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2206F, 1.4356F, -0.4672F, 0.579F, -1.1709F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(86, 53).mirror().addBox(-2.8529F, -0.0101F, -0.3104F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2206F, 1.4356F, 0.0532F, 0.7252F, -0.346F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(86, 55).mirror().addBox(-2.9471F, -0.0098F, -0.3836F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.4206F, 3.4356F, 0.1695F, 0.7395F, -0.284F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(88, 59).mirror().addBox(-5.8441F, -0.7722F, -0.3836F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.4206F, 3.4356F, -0.074F, 0.7521F, -0.6408F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-12.0778F, -2.9943F, -0.3836F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.4206F, 3.4356F, -0.4102F, 0.6533F, -1.1537F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(47, 29).mirror().addBox(-12.044F, -2.8507F, -0.2463F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.5456F, 5.2676F, -0.0112F, 0.8104F, -1.0709F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(89, 24).mirror().addBox(-5.7569F, -0.6533F, -0.2463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 4).mirror().addBox(-5.7389F, -0.6262F, 0.3745F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.5456F, 5.2676F, 0.3809F, 0.7342F, -0.5167F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(93, 36).mirror().addBox(-2.832F, 0.0825F, -0.2463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.5456F, 5.2676F, 0.5682F, 0.6135F, -0.2184F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(47, 33).mirror().addBox(-11.9057F, -2.8434F, 0.8051F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.5456F, 5.2676F, -0.0103F, 0.7231F, -1.0696F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(85, 49).mirror().addBox(-3.046F, 0.0911F, -0.2181F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.5456F, 5.2676F, 0.6602F, 0.7707F, -0.0748F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(103, 71).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 71).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7241F, 5.371F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(110, 49).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7241F, 5.371F, 0.2039F, -0.6878F, -0.1305F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(106, 47).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7174F, 5.371F, 0.2303F, -0.8157F, -0.1691F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(54, 110).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5424F, 3.371F, 0.2303F, -0.8157F, -0.1691F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(103, 79).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 79).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.549F, 3.371F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(59, 110).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.549F, 3.371F, 0.2039F, -0.6878F, -0.1305F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(110, 61).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3491F, 1.371F, 0.2039F, -0.6878F, -0.1305F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(102, 103).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 103).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3491F, 1.371F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(67, 110).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3424F, 1.371F, 0.2303F, -0.8157F, -0.1691F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(85, 49).addBox(0.046F, 0.0911F, -0.2181F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.5456F, 5.2676F, 0.6602F, -0.7707F, 0.0748F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(93, 36).addBox(-0.168F, 0.0825F, -0.2463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.5456F, 5.2676F, 0.5682F, -0.6135F, 0.2184F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(87, 4).addBox(2.7389F, -0.6262F, 0.3745F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 24).addBox(2.7569F, -0.6533F, -0.2463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.5456F, 5.2676F, 0.3809F, -0.7342F, 0.5167F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 33).addBox(4.9057F, -2.8434F, 0.8051F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.5456F, 5.2676F, -0.0103F, -0.7231F, 1.0696F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(47, 29).addBox(5.044F, -2.8507F, -0.2463F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.5456F, 5.2676F, -0.0112F, -0.8104F, 1.0709F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(47, 21).addBox(5.0778F, -2.9943F, -0.3836F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.4206F, 3.4356F, -0.4102F, -0.6533F, 1.1537F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(88, 59).addBox(2.8441F, -0.7722F, -0.3836F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.4206F, 3.4356F, -0.074F, -0.7521F, 0.6408F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(86, 55).addBox(-0.0529F, -0.0098F, -0.3836F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.4206F, 3.4356F, 0.1695F, -0.7395F, 0.284F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(86, 53).addBox(-0.1471F, -0.0101F, -0.3104F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.2206F, 1.4356F, 0.0532F, -0.7252F, 0.346F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(34, 8).addBox(5.0034F, -2.9366F, -0.3104F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.2206F, 1.4356F, -0.4672F, -0.579F, 1.1709F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(88, 57).addBox(2.753F, -0.7481F, -0.3104F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.2206F, 1.4356F, -0.1764F, -0.7088F, 0.6934F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(51, 105).addBox(0.0F, -3.1188F, 0.0287F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7473F, 2.846F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(67, 110).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3424F, 1.371F, 0.2303F, 0.8157F, 0.1691F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(110, 61).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3491F, 1.371F, 0.2039F, 0.6878F, 0.1305F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(59, 110).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.549F, 3.371F, 0.2039F, 0.6878F, 0.1305F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(54, 110).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5424F, 3.371F, 0.2303F, 0.8157F, 0.1691F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(110, 49).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7241F, 5.371F, 0.2039F, 0.6878F, 0.1305F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(106, 47).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7174F, 5.371F, 0.2303F, 0.8157F, 0.1691F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(32, 26).addBox(-0.5F, -0.0425F, -0.0704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3034F, 5.9565F, 0.0001F, -0.0436F, 0.0F));

		PartDefinition cube_r153 = body5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(37, 104).addBox(0.0F, -2.8F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7767F, 7.0212F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(40, 105).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 4.9F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(100, 105).addBox(0.0F, -2.9F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(91, 105).addBox(0.0F, -3.0097F, -0.0421F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.9F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-5.6105F, -0.8463F, 0.5465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 20).mirror().addBox(-5.6286F, -0.8734F, -0.0743F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.0171F, 1.211F, 0.2179F, 0.74F, -0.6607F));

		PartDefinition cube_r158 = body5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(85, 45).mirror().addBox(-3.013F, -0.1547F, -0.0365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.0171F, 1.211F, 0.5073F, 0.8276F, -0.2189F));

		PartDefinition cube_r159 = body5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-2.7651F, -0.1633F, -0.0743F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.0171F, 1.211F, 0.4278F, 0.656F, -0.3362F));

		PartDefinition cube_r160 = body5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(47, 27).mirror().addBox(-11.6874F, -2.9959F, 0.9587F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.0171F, 1.211F, -0.1486F, 0.6657F, -1.1926F));

		PartDefinition cube_r161 = body5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-11.8399F, -3.0032F, -0.0743F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.0171F, 1.211F, -0.1602F, 0.7519F, -1.2103F));

		PartDefinition cube_r162 = body5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-11.7749F, -2.9509F, -0.2849F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 3.311F, -0.2365F, 0.7256F, -1.1967F));

		PartDefinition cube_r163 = body5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-11.641F, -2.9436F, 0.7432F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 3.311F, -0.2204F, 0.6406F, -1.1712F));

		PartDefinition cube_r164 = body5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(94, 49).mirror().addBox(-5.5483F, -0.8506F, -0.2849F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 67).mirror().addBox(-5.5303F, -0.8235F, 0.3359F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 3.311F, 0.1338F, 0.7469F, -0.6526F));

		PartDefinition cube_r165 = body5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(89, 43).mirror().addBox(-2.6817F, -0.1621F, -0.2849F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 3.311F, 0.356F, 0.6826F, -0.3157F));

		PartDefinition cube_r166 = body5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-2.891F, -0.1535F, -0.2273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 3.311F, 0.4275F, 0.8603F, -0.2136F));

		PartDefinition cube_r167 = body5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-5.5192F, -0.7664F, 0.1108F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 69).mirror().addBox(-5.5372F, -0.7935F, -0.4099F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 5.411F, 0.0982F, 0.7769F, -0.7131F));

		PartDefinition cube_r168 = body5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-2.8171F, -0.1012F, -0.4202F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 5.411F, 0.4112F, 0.8985F, -0.262F));

		PartDefinition cube_r169 = body5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 28).mirror().addBox(-2.6561F, -0.1098F, -0.4099F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 5.411F, 0.3374F, 0.7196F, -0.3636F));

		PartDefinition cube_r170 = body5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(33, 60).mirror().addBox(-10.6673F, -2.8866F, 0.5325F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 5.411F, -0.2672F, 0.6538F, -1.2353F));

		PartDefinition cube_r171 = body5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(56, 41).mirror().addBox(-10.7866F, -2.8939F, -0.4099F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0171F, 5.411F, -0.2872F, 0.7378F, -1.2664F));

		PartDefinition cube_r172 = body5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-2.8462F, 0.1097F, -0.3646F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.2171F, 7.211F, 0.178F, 0.6938F, -0.5075F));

		PartDefinition cube_r173 = body5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(89, 41).mirror().addBox(-3.0373F, 0.1182F, -0.412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.2171F, 7.211F, 0.2159F, 0.8822F, -0.4543F));

		PartDefinition cube_r174 = body5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(87, 94).mirror().addBox(-5.7776F, -0.6307F, -0.3646F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 55).mirror().addBox(-5.7596F, -0.6036F, 0.1562F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.2171F, 7.211F, -0.0449F, 0.7114F, -0.8505F));

		PartDefinition cube_r175 = body5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(48, 60).mirror().addBox(-10.9766F, -2.4378F, -0.7482F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.2171F, 7.211F, -0.4283F, 0.7981F, -1.3556F));

		PartDefinition cube_r176 = body5.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-10.9831F, -2.4451F, -1.7127F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.2171F, 7.211F, -0.4704F, 0.8767F, -1.4122F));

		PartDefinition cube_r177 = body5.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(103, 6).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 6).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3956F, 1.4145F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(109, 102).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3956F, 1.4145F, 0.1476F, -0.6927F, -0.0947F));

		PartDefinition cube_r179 = body5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(109, 108).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3889F, 1.4145F, 0.1671F, -0.822F, -0.1229F));

		PartDefinition cube_r180 = body5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(103, 28).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 28).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4706F, 3.4145F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r181 = body5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(110, 3).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4706F, 3.4145F, 0.1589F, -0.6919F, -0.1019F));

		PartDefinition cube_r182 = body5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(110, 5).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.464F, 3.4145F, 0.1798F, -0.8209F, -0.1322F));

		PartDefinition cube_r183 = body5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(110, 7).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3706F, 5.4145F, 0.1589F, -0.6919F, -0.1019F));

		PartDefinition cube_r184 = body5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(103, 30).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 30).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3706F, 5.4145F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r185 = body5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(110, 9).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3639F, 5.4145F, 0.1798F, -0.8209F, -0.1322F));

		PartDefinition cube_r186 = body5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(110, 14).mirror().addBox(-1.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3706F, 7.4145F, 0.1589F, -0.6919F, -0.1019F));

		PartDefinition cube_r187 = body5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(103, 32).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 32).addBox(0.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3706F, 7.4145F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r188 = body5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(110, 16).mirror().addBox(-0.5096F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3639F, 7.4145F, 0.1798F, -0.8209F, -0.1322F));

		PartDefinition cube_r189 = body5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(56, 41).addBox(4.7866F, -2.8939F, -0.4099F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 5.411F, -0.2872F, -0.7378F, 1.2664F));

		PartDefinition cube_r190 = body5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(33, 60).addBox(4.6673F, -2.8866F, 0.5325F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 5.411F, -0.2672F, -0.6538F, 1.2353F));

		PartDefinition cube_r191 = body5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(94, 69).addBox(2.5372F, -0.7935F, -0.4099F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 14).addBox(2.5192F, -0.7664F, 0.1108F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 5.411F, 0.0982F, -0.7769F, 0.7131F));

		PartDefinition cube_r192 = body5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(89, 28).addBox(-0.3439F, -0.1098F, -0.4099F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 5.411F, 0.3374F, -0.7196F, 0.3636F));

		PartDefinition cube_r193 = body5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(85, 67).addBox(-0.1829F, -0.1012F, -0.4202F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 5.411F, 0.4112F, -0.8985F, 0.262F));

		PartDefinition cube_r194 = body5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(94, 67).addBox(2.5303F, -0.8235F, 0.3359F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 49).addBox(2.5483F, -0.8506F, -0.2849F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 3.311F, 0.1338F, -0.7469F, 0.6526F));

		PartDefinition cube_r195 = body5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(87, 6).addBox(-0.109F, -0.1535F, -0.2273F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 3.311F, 0.4275F, -0.8603F, 0.2136F));

		PartDefinition cube_r196 = body5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(89, 43).addBox(-0.3183F, -0.1621F, -0.2849F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 3.311F, 0.356F, -0.6826F, 0.3157F));

		PartDefinition cube_r197 = body5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(47, 37).addBox(4.641F, -2.9436F, 0.7432F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 3.311F, -0.2204F, -0.6406F, 1.1712F));

		PartDefinition cube_r198 = body5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(47, 31).addBox(4.7749F, -2.9509F, -0.2849F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.0171F, 3.311F, -0.2365F, -0.7256F, 1.1967F));

		PartDefinition cube_r199 = body5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(96, 8).addBox(2.6105F, -0.8463F, 0.5465F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 20).addBox(2.6286F, -0.8734F, -0.0743F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.0171F, 1.211F, 0.2179F, -0.74F, 0.6607F));

		PartDefinition cube_r200 = body5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(85, 45).addBox(0.0131F, -0.1547F, -0.0365F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.0171F, 1.211F, 0.5073F, -0.8276F, 0.2189F));

		PartDefinition cube_r201 = body5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(89, 26).addBox(-0.2349F, -0.1633F, -0.0743F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.0171F, 1.211F, 0.4278F, -0.656F, 0.3362F));

		PartDefinition cube_r202 = body5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(47, 27).addBox(4.6874F, -2.9959F, 0.9587F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.0171F, 1.211F, -0.1486F, -0.6657F, 1.1926F));

		PartDefinition cube_r203 = body5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(47, 35).addBox(4.8399F, -3.0032F, -0.0743F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.0171F, 1.211F, -0.1602F, -0.7519F, 1.2103F));

		PartDefinition cube_r204 = body5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 34).addBox(-0.1538F, 0.1097F, -0.3646F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.2171F, 7.211F, 0.178F, -0.6938F, 0.5075F));

		PartDefinition cube_r205 = body5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(89, 41).addBox(0.0373F, 0.1182F, -0.412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.2171F, 7.211F, 0.2159F, -0.8822F, 0.4543F));

		PartDefinition cube_r206 = body5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(87, 94).addBox(2.7776F, -0.6307F, -0.3646F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 55).addBox(2.7596F, -0.6036F, 0.1562F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.2171F, 7.211F, -0.0449F, -0.7114F, 0.8505F));

		PartDefinition cube_r207 = body5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(48, 60).addBox(4.9766F, -2.4378F, -0.7482F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.2171F, 7.211F, -0.4283F, -0.7981F, 1.3556F));

		PartDefinition cube_r208 = body5.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(60, 15).addBox(4.9831F, -2.4451F, -1.7127F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.2171F, 7.211F, -0.4704F, -0.8767F, 1.4122F));

		PartDefinition cube_r209 = body5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(109, 102).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3956F, 1.4145F, 0.1476F, 0.6927F, 0.0947F));

		PartDefinition cube_r210 = body5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(109, 108).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3889F, 1.4145F, 0.1671F, 0.822F, 0.1229F));

		PartDefinition cube_r211 = body5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(110, 16).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3639F, 7.4145F, 0.1798F, 0.8209F, 0.1322F));

		PartDefinition cube_r212 = body5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(110, 14).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3706F, 7.4145F, 0.1589F, 0.6919F, 0.1019F));

		PartDefinition cube_r213 = body5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(110, 9).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3639F, 5.4145F, 0.1798F, 0.8209F, 0.1322F));

		PartDefinition cube_r214 = body5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(110, 7).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3706F, 5.4145F, 0.1589F, 0.6919F, 0.1019F));

		PartDefinition cube_r215 = body5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(110, 3).addBox(0.3298F, 0.0013F, -0.5322F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4706F, 3.4145F, 0.1589F, 0.6919F, 0.1019F));

		PartDefinition cube_r216 = body5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(110, 5).addBox(-0.4904F, 0.0013F, 0.2963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.464F, 3.4145F, 0.1798F, 0.8209F, 0.1322F));

		PartDefinition cube_r217 = body5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7134F, 8.0023F, -0.192F, -0.0428F, 0.0083F));

		PartDefinition cube_r218 = body4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(39, 50).addBox(0.0F, -2.0575F, -0.0873F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2244F, 4.929F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(103, 105).addBox(0.0F, -2.3574F, -0.0873F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 2.8896F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(85, 107).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0002F, 0.7896F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r221 = body4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(96, 22).mirror().addBox(-5.6366F, -0.7849F, 0.3148F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 96).mirror().addBox(-5.6547F, -0.812F, -0.206F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 1.2087F, 0.0146F, 0.8792F, -0.9115F));

		PartDefinition cube_r222 = body4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(94, 71).mirror().addBox(-2.943F, -0.0887F, -0.1703F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 1.2087F, 0.3954F, 0.9992F, -0.4156F));

		PartDefinition cube_r223 = body4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(91, 65).mirror().addBox(-2.7744F, -0.0973F, -0.206F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 1.2087F, 0.3158F, 0.8355F, -0.5155F));

		PartDefinition cube_r224 = body4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-11.4514F, -1.6234F, -0.468F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 1.2087F, -0.2315F, 1.0006F, -1.1899F));

		PartDefinition cube_r225 = body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-11.2813F, -1.6307F, -1.4576F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 1.2087F, -0.2685F, 1.0851F, -1.2327F));

		PartDefinition cube_r226 = body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(-2.9408F, -0.1557F, -0.0766F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 3.2087F, 0.5332F, 1.0567F, -0.3735F));

		PartDefinition cube_r227 = body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(89, 30).mirror().addBox(-2.7559F, -0.1643F, -0.1141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 3.2087F, 0.4144F, 0.901F, -0.5162F));

		PartDefinition cube_r228 = body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(53, 96).mirror().addBox(-5.6194F, -0.872F, -0.1141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 61).mirror().addBox(-5.6014F, -0.8449F, 0.4066F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 3.2087F, 0.0677F, 0.9648F, -0.9452F));

		PartDefinition cube_r229 = body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(53, 7).mirror().addBox(-11.4203F, -1.6802F, -0.3728F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 3.2087F, -0.2197F, 1.0918F, -1.2557F));

		PartDefinition cube_r230 = body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(47, 39).mirror().addBox(-11.2586F, -1.6876F, -1.36F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 3.2087F, -0.2646F, 1.1765F, -1.3052F));

		PartDefinition cube_r231 = body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-10.3035F, -1.6683F, -1.3497F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 5.1087F, -0.1782F, 1.2892F, -1.3929F));

		PartDefinition cube_r232 = body4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(62, 39).mirror().addBox(-10.368F, -1.6609F, -0.4457F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 5.1087F, -0.1374F, 1.203F, -1.35F));

		PartDefinition cube_r233 = body4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(96, 77).mirror().addBox(-5.6396F, -0.8191F, 0.326F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 63).mirror().addBox(-5.6576F, -0.8461F, -0.0947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 5.1087F, 0.1956F, 1.0594F, -1.0061F));

		PartDefinition cube_r234 = body4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-2.7861F, -0.1295F, -0.0947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 5.1087F, 0.5844F, 0.9574F, -0.5493F));

		PartDefinition cube_r235 = body4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(95, 38).mirror().addBox(-2.9122F, -0.1209F, -0.0675F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.6963F, 5.1087F, 0.7206F, 1.0687F, -0.3891F));

		PartDefinition cube_r236 = body4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(110, 18).mirror().addBox(-0.9704F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2491F, 1.3988F, 0.2707F, -0.6799F, -0.1727F));

		PartDefinition cube_r237 = body4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(103, 40).mirror().addBox(-0.8425F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 40).addBox(0.7575F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9575F, 0.2491F, 1.3988F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r238 = body4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(20, 110).mirror().addBox(-0.1908F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2491F, 1.3988F, 0.3048F, -0.8055F, -0.2231F));

		PartDefinition cube_r239 = body4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(110, 20).mirror().addBox(-0.9704F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.0741F, 3.3988F, 0.2707F, -0.6799F, -0.1727F));

		PartDefinition cube_r240 = body4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(110, 22).mirror().addBox(-0.1908F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.0741F, 3.3988F, 0.3048F, -0.8055F, -0.2231F));

		PartDefinition cube_r241 = body4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(41, 103).mirror().addBox(-0.8425F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 103).addBox(0.7575F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9575F, 0.0741F, 3.3988F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r242 = body4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(103, 42).mirror().addBox(-0.8425F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 42).addBox(0.7575F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9575F, -0.0509F, 5.3988F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r243 = body4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(25, 110).mirror().addBox(-0.1908F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, -0.0509F, 5.3988F, 0.2051F, -0.8185F, -0.1507F));

		PartDefinition cube_r244 = body4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(110, 27).mirror().addBox(-0.9704F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, -0.0509F, 5.3988F, 0.1814F, -0.69F, -0.1163F));

		PartDefinition cube_r245 = body4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(95, 38).addBox(-0.0878F, -0.1209F, -0.0675F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 5.1087F, 0.7206F, -1.0687F, 0.3891F));

		PartDefinition cube_r246 = body4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(85, 69).addBox(-0.2139F, -0.1295F, -0.0947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 5.1087F, 0.5844F, -0.9574F, 0.5493F));

		PartDefinition cube_r247 = body4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(96, 63).addBox(2.6576F, -0.8461F, -0.0947F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 77).addBox(2.6396F, -0.8191F, 0.326F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 5.1087F, 0.1956F, -1.0594F, 1.0061F));

		PartDefinition cube_r248 = body4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(62, 39).addBox(5.368F, -1.6609F, -0.4457F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 5.1087F, -0.1374F, -1.203F, 1.35F));

		PartDefinition cube_r249 = body4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(63, 60).addBox(5.3035F, -1.6683F, -1.3497F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 5.1087F, -0.1782F, -1.2892F, 1.3929F));

		PartDefinition cube_r250 = body4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 39).addBox(5.2586F, -1.6876F, -1.36F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 3.2087F, -0.2646F, -1.1765F, 1.3052F));

		PartDefinition cube_r251 = body4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(53, 7).addBox(5.4203F, -1.6802F, -0.3728F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 3.2087F, -0.2197F, -1.0918F, 1.2557F));

		PartDefinition cube_r252 = body4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(96, 61).addBox(2.6014F, -0.8449F, 0.4066F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 96).addBox(2.6194F, -0.872F, -0.1141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 3.2087F, 0.0677F, -0.9648F, 0.9452F));

		PartDefinition cube_r253 = body4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 30).addBox(-0.2441F, -0.1643F, -0.1141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 3.2087F, 0.4144F, -0.901F, 0.5162F));

		PartDefinition cube_r254 = body4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(78, 94).addBox(-0.0592F, -0.1557F, -0.0766F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 3.2087F, 0.5332F, -1.0567F, 0.3735F));

		PartDefinition cube_r255 = body4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(96, 22).addBox(2.6366F, -0.7849F, 0.3148F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 96).addBox(2.6547F, -0.812F, -0.206F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 1.2087F, 0.0146F, -0.8792F, 0.9115F));

		PartDefinition cube_r256 = body4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(94, 71).addBox(-0.057F, -0.0887F, -0.1703F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 1.2087F, 0.3954F, -0.9992F, 0.4156F));

		PartDefinition cube_r257 = body4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(91, 65).addBox(-0.2256F, -0.0973F, -0.206F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 1.2087F, 0.3158F, -0.8355F, 0.5155F));

		PartDefinition cube_r258 = body4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(56, 43).addBox(5.4514F, -1.6234F, -0.468F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 1.2087F, -0.2315F, -1.0006F, 1.1899F));

		PartDefinition cube_r259 = body4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(56, 45).addBox(5.2813F, -1.6307F, -1.4576F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.6963F, 1.2087F, -0.2685F, -1.0851F, 1.2327F));

		PartDefinition cube_r260 = body4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(110, 27).addBox(-0.0297F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, -0.0509F, 5.3988F, 0.1814F, 0.69F, 0.1163F));

		PartDefinition cube_r261 = body4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(25, 110).addBox(-0.8092F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, -0.0509F, 5.3988F, 0.2051F, 0.8185F, 0.1507F));

		PartDefinition cube_r262 = body4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(110, 22).addBox(-0.8092F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.0741F, 3.3988F, 0.3048F, 0.8055F, 0.2231F));

		PartDefinition cube_r263 = body4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(110, 20).addBox(-0.0297F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.0741F, 3.3988F, 0.2707F, 0.6799F, 0.1727F));

		PartDefinition cube_r264 = body4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(110, 18).addBox(-0.0297F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2491F, 1.3988F, 0.2707F, 0.6799F, 0.1727F));

		PartDefinition cube_r265 = body4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(20, 110).addBox(-0.8092F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2491F, 1.3988F, 0.3048F, 0.8055F, 0.2231F));

		PartDefinition cube_r266 = body4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(15, 10).addBox(-0.5F, -0.125F, -5.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 5.0896F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.1187F, -0.0502F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3504F, 6.8384F, -0.042F, 0.0F, 0.0F));

		PartDefinition cube_r267 = body3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(22, 99).addBox(0.0F, -1.7F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0373F, 3.9008F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r268 = body3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(74, 85).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, 1.8998F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r269 = body3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(56, 69).addBox(0.0F, -1.8F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, -0.0002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r270 = body3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(73, 37).mirror().addBox(-9.9706F, -1.8851F, -1.3161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5333F, 0.9306F, -0.5858F, -0.7549F, 1.2735F, -1.6848F));

		PartDefinition cube_r271 = body3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(-9.9334F, -1.8777F, -0.4413F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5333F, 0.9306F, -0.5858F, -0.5961F, 1.2051F, -1.517F));

		PartDefinition cube_r272 = body3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-5.2432F, -1.0836F, 0.2169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 86).mirror().addBox(-5.3613F, -1.1107F, -0.1289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2216F, 0.3703F, -0.129F, 1.1278F, -1.0329F));

		PartDefinition cube_r273 = body3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-2.5683F, -0.4617F, -0.1289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2216F, 0.3703F, 0.4017F, 1.0907F, -0.4436F));

		PartDefinition cube_r274 = body3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-2.5726F, -0.4532F, -0.0648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2216F, 0.3703F, 0.5006F, 1.1851F, -0.3348F));

		PartDefinition cube_r275 = body3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(-3.2698F, -0.4348F, -0.0904F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0466F, 1.9703F, 0.0312F, 1.2664F, -0.7815F));

		PartDefinition cube_r276 = body3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(-4.0458F, -1.2663F, -0.0904F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0466F, 1.9703F, -0.6711F, 1.1782F, -1.5241F));

		PartDefinition cube_r277 = body3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(48, 103).mirror().addBox(-0.8425F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 103).addBox(0.7575F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 0.5604F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r278 = body3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(110, 29).mirror().addBox(-0.9704F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 0.5604F, 0.2039F, -0.6878F, -0.1305F));

		PartDefinition cube_r279 = body3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(30, 110).mirror().addBox(-0.1908F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 0.5604F, 0.2303F, -0.8157F, -0.1691F));

		PartDefinition cube_r280 = body3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(110, 31).mirror().addBox(-0.1908F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 2.5604F, 0.1798F, -0.8209F, -0.1322F));

		PartDefinition cube_r281 = body3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(104, 38).mirror().addBox(-0.9704F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 2.5604F, 0.1589F, -0.6919F, -0.1019F));

		PartDefinition cube_r282 = body3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(103, 49).mirror().addBox(-0.8425F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 49).addBox(0.7575F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 2.5604F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r283 = body3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(103, 67).mirror().addBox(-0.8425F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 67).addBox(0.7575F, -0.0046F, -0.486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 4.5604F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r284 = body3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(110, 39).mirror().addBox(-0.9704F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 4.5604F, 0.1137F, -0.6949F, -0.073F));

		PartDefinition cube_r285 = body3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(40, 110).mirror().addBox(-0.1908F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.2995F, 4.5604F, 0.1288F, -0.8249F, -0.0948F));

		PartDefinition cube_r286 = body3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(64, 89).addBox(3.0458F, -1.2663F, -0.0904F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0466F, 1.9703F, -0.6711F, -1.1782F, 1.5241F));

		PartDefinition cube_r287 = body3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(86, 51).addBox(0.2698F, -0.4348F, -0.0904F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0466F, 1.9703F, 0.0312F, -1.2664F, 0.7815F));

		PartDefinition cube_r288 = body3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(73, 37).addBox(5.9706F, -1.8851F, -1.3161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5333F, 0.9306F, -0.5858F, -0.7549F, -1.2735F, 1.6848F));

		PartDefinition cube_r289 = body3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(80, 65).addBox(5.9334F, -1.8777F, -0.4413F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5333F, 0.9306F, -0.5858F, -0.5961F, -1.2051F, 1.517F));

		PartDefinition cube_r290 = body3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(85, 71).addBox(2.2433F, -1.0836F, 0.2169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 86).addBox(2.3613F, -1.1107F, -0.1289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.2216F, 0.3703F, -0.129F, -1.1278F, 1.0329F));

		PartDefinition cube_r291 = body3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(86, 39).addBox(-0.4317F, -0.4617F, -0.1289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.2216F, 0.3703F, 0.4017F, -1.0907F, 0.4436F));

		PartDefinition cube_r292 = body3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(89, 32).addBox(-0.4274F, -0.4532F, -0.0648F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.2216F, 0.3703F, 0.5006F, -1.1851F, 0.3348F));

		PartDefinition cube_r293 = body3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(40, 110).addBox(-0.8092F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2995F, 4.5604F, 0.1288F, 0.8249F, 0.0948F));

		PartDefinition cube_r294 = body3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(110, 39).addBox(-0.0297F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2995F, 4.5604F, 0.1137F, 0.6949F, 0.073F));

		PartDefinition cube_r295 = body3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(104, 38).addBox(-0.0297F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2995F, 2.5604F, 0.1589F, 0.6919F, 0.1019F));

		PartDefinition cube_r296 = body3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(110, 31).addBox(-0.8092F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2995F, 2.5604F, 0.1798F, 0.8209F, 0.1322F));

		PartDefinition cube_r297 = body3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(110, 29).addBox(-0.0297F, -0.0033F, -0.8155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2995F, 0.5604F, 0.2039F, 0.6878F, 0.1305F));

		PartDefinition cube_r298 = body3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(30, 110).addBox(-0.8092F, 0.0033F, -0.0321F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.2995F, 0.5604F, 0.2303F, 0.8157F, 0.1691F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2669F, 6.032F, 0.0625F, -0.1306F, -0.0081F));

		PartDefinition cube_r299 = body2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(72, 110).addBox(0.0F, -1.4945F, -0.1045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6154F, 3.9881F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r300 = body2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(64, 109).addBox(0.0F, -1.3298F, -0.043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.048F, 1.9945F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r301 = body2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(110, 86).addBox(0.0F, 0.2F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1265F, 4.5712F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r302 = body2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(109, 57).addBox(0.0F, -1.2996F, 0.0072F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4077F, -0.0089F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r303 = body2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(103, 4).mirror().addBox(-1.8F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 34).mirror().addBox(-1.8F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 34).addBox(-0.2F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 4).addBox(-0.2F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 10).addBox(-0.5F, 0.7738F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9537F, -8.4029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r304 = body2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(34, 73).mirror().addBox(-0.0117F, 10.0758F, 8.9231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.4167F, -11.8868F, 0.3491F, -0.1309F, 0.0F));

		PartDefinition cube_r305 = body2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(110, 41).mirror().addBox(-0.3185F, 0.0033F, -0.0311F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.1454F, 0.4683F, -0.1208F, -0.651F, 0.0734F));

		PartDefinition cube_r306 = body2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(103, 69).mirror().addBox(-0.8425F, -0.0046F, -0.4245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 69).addBox(0.7575F, -0.0046F, -0.4245F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9575F, 0.1454F, 0.4683F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r307 = body2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(49, 110).mirror().addBox(-0.9308F, -0.0033F, -0.7683F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9575F, 0.1454F, 0.4683F, -0.125F, -0.6943F, 0.0803F));

		PartDefinition cube_r308 = body2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(34, 73).addBox(-0.9883F, 10.0758F, 8.9231F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4167F, -11.8868F, 0.3491F, 0.1309F, 0.0F));

		PartDefinition cube_r309 = body2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(110, 41).addBox(-0.6815F, 0.0033F, -0.0311F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.1454F, 0.4683F, -0.1208F, 0.651F, -0.0734F));

		PartDefinition cube_r310 = body2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(49, 110).addBox(-0.0692F, -0.0033F, -0.7683F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9575F, 0.1454F, 0.4683F, -0.125F, 0.6943F, -0.0803F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9579F, 4.9196F, 0.05F, -0.0505F, 0.1284F));

		PartDefinition cube_r311 = hips.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(78, 110).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1431F, 4.4359F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r312 = hips.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(37, 109).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2571F, 2.6119F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r313 = hips.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(110, 75).addBox(0.0F, -0.3F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7641F, 3.6532F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r314 = hips.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(75, 110).addBox(0.0F, 0.7F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5064F, 0.751F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r315 = hips.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(41, 99).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2598F, 0.7937F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r316 = hips.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(100, 13).mirror().addBox(-1.6F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 84).mirror().addBox(-1.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 65).mirror().addBox(-1.6F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 65).addBox(-0.4F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 84).addBox(0.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 13).addBox(-0.4F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 0).addBox(-0.5F, -0.1165F, -0.0007F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.175F, -0.025F, -0.4843F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9536F, 5.1845F, -0.3352F, -0.0824F, 0.0287F));

		PartDefinition cube_r317 = tail.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(65, 99).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6122F, 2.849F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r318 = tail.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(81, 110).addBox(0.0F, -1.5F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.96F, 2.3953F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r319 = tail.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(71, 12).addBox(0.0F, -1.3F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5837F, 3.9536F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r320 = tail.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(110, 78).addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6122F, 0.949F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r321 = tail.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(109, 37).mirror().addBox(-1.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 51).mirror().addBox(-1.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 51).addBox(0.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 37).addBox(0.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 42).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5128F, -0.026F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2646F, 4.8704F, 0.2714F, 0.0F, 0.0F));

		PartDefinition cube_r322 = tail2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(109, 53).mirror().addBox(-1.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 55).mirror().addBox(-0.8F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 55).addBox(-0.2F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 53).addBox(0.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 36).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4973F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r323 = tail2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(76, 59).addBox(0.0F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9357F, 3.2127F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r324 = tail2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(68, 6).addBox(0.0F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3004F, 1.1446F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2304F, 5.8944F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r325 = tail3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.55F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4805F, -2.1145F, 0.2863F, 0.0F, 0.0F));

		PartDefinition cube_r326 = neck2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3581F, -4.1889F, -0.3431F, -0.2751F, -0.6502F));

		PartDefinition cube_r327 = neck2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(70, 102).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3581F, -4.1889F, -1.1039F, -0.3035F, -0.7363F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(70, 102).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3581F, -4.1889F, -1.1039F, 0.3035F, 0.7363F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(26, 44).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.3581F, -4.1889F, -0.3431F, 0.2751F, 0.6502F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(74, 97).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3581F, -4.1889F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(57, 88).addBox(-0.5F, 0.45F, 3.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.852F, -2.1912F, -0.4609F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(60, 104).addBox(-1.5F, -0.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 1.9119F, -13.2911F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(105, 86).addBox(-1.5F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 1.2962F, -12.5031F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(100, 85).addBox(-1.5F, -0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 0.9591F, -11.5448F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(84, 78).addBox(-1.5F, -4.025F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 0.8632F, -7.4166F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(31, 62).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.9128F, -4.1482F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r337 = head.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(76, 46).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8572F, 3.7167F, -3.1657F, 1.1436F, -1.29F, 1.2228F));

		PartDefinition cube_r338 = head.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(15, 28).addBox(-1.5F, -0.5F, -1.1F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.5139F, -2.0071F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r339 = head.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, 0.2F, -1.6F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0014F, -3.6388F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r340 = head.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(15, 44).addBox(-2.0F, -7.0F, 0.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.1018F, -5.1033F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r341 = head.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(32, 34).addBox(-1.9F, -2.2F, 1.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1F, 4.3378F, -4.1482F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r342 = head.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(22, 55).addBox(-0.5F, -0.425F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 19).addBox(-0.5F, 0.175F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 9.2881F, -18.9843F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r343 = head.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(60, 67).addBox(-0.5F, -0.8F, -2.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 7.8988F, -17.5457F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r344 = head.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(30, 42).addBox(-0.5F, 0.175F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.6044F, -15.0664F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r345 = head.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(34, 83).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.6347F, -13.3172F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r346 = head.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 61).addBox(-0.5F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.8213F, -11.4901F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r347 = head.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(43, 82).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.4426F, -9.7296F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r348 = head.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(64, 17).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.226F, -6.5276F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r349 = head.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(22, 61).addBox(-0.5F, -1.5F, -1.9F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.1465F, -5.2885F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r350 = head.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(50, 98).addBox(-1.0F, -3.025F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -1.2087F, -5.0276F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r351 = head.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(98, 10).addBox(-1.0F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.4959F, -2.8464F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(32, 107).addBox(-1.0F, -0.025F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(31, 92).addBox(-1.5F, -0.525F, -1.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.4959F, -2.8464F, 2.0462F, 0.7268F, 0.3295F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(97, 57).addBox(-1.0F, -0.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.4959F, -2.8464F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(98, 40).addBox(-1.0F, -0.025F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -1.2087F, -5.0276F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(106, 44).addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 106).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0237F, 13.3979F, -22.7347F, 1.2177F, -0.0004F, -0.005F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.021F, 12.8597F, -22.4695F, 1.113F, -0.0004F, -0.005F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(89, 78).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0137F, 11.4501F, -21.7127F, 1.0781F, -0.0004F, -0.005F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(74, 89).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0067F, 10.1117F, -20.8359F, 0.9908F, -0.0004F, -0.005F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5F, -0.15F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.807F, -15.0069F, 0.4803F, -0.0004F, -0.005F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(108, 24).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0069F, 6.9112F, -17.0024F, 0.8119F, -0.0004F, -0.005F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(48, 90).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0111F, 7.611F, -18.8437F, 0.7814F, -0.0004F, -0.005F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(65, 106).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0142F, 8.2103F, -19.3736F, 0.8468F, -0.0004F, -0.005F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(105, 15).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0175F, 8.8211F, -19.8903F, 0.8687F, -0.0004F, -0.005F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(89, 20).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 8.8211F, -19.8903F, 0.9385F, -0.0004F, -0.005F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, 2.2933F, -5.0002F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r365 = leftOrbit.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -3.6F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.2849F, 14.1484F, -12.264F, 2.9391F, -0.0934F, 0.1429F));

		PartDefinition cube_r366 = leftOrbit.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(97, 99).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.257F, 14.154F, -12.5671F, 2.9027F, -0.0892F, 0.16F));

		PartDefinition cube_r367 = leftOrbit.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(25, 84).addBox(-0.9F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.3264F, 10.4235F, -11.5221F, 2.7437F, -0.0765F, 0.1833F));

		PartDefinition cube_r368 = leftOrbit.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 15).addBox(-0.175F, -7.0F, -6.7F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9064F, 6.988F, -9.4907F, 2.2947F, 0.3945F, -0.0288F));

		PartDefinition cube_r369 = leftOrbit.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 0).addBox(-0.175F, -2.0F, -6.7F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5135F, 5.7503F, -7.9696F, 2.2116F, 0.3215F, -0.0935F));

		PartDefinition cube_r370 = leftOrbit.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(84, 11).addBox(-1.2001F, -1.3536F, 1.1857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.9276F, 9.1497F, -8.972F, 2.6109F, -0.0494F, 0.2185F));

		PartDefinition cube_r371 = leftOrbit.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(12, 104).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.8884F, 1.9185F, 1.9235F, 2.5585F, -0.0893F, -0.0298F));

		PartDefinition cube_r372 = leftOrbit.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(17, 104).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(2.6977F, 2.9033F, 0.677F, 2.2478F, 0.0316F, 0.152F));

		PartDefinition cube_r373 = leftOrbit.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(109, 34).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.753F, 2.5484F, 0.7078F, 2.0733F, 0.0316F, 0.152F));

		PartDefinition cube_r374 = leftOrbit.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(80, 107).addBox(-0.478F, 1.3173F, -0.7201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.6037F, 3.0782F, -2.3398F, 1.7162F, 0.0073F, 0.3759F));

		PartDefinition cube_r375 = leftOrbit.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(34, 78).addBox(-1.2F, -0.2F, -0.8F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0787F, 2.4032F, -3.8898F, 1.8475F, 0.4724F, 0.457F));

		PartDefinition cube_r376 = leftOrbit.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(34, 69).addBox(-1.3988F, -1.133F, -0.587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.6037F, 3.0782F, -2.3398F, 1.6574F, 0.8345F, 0.4397F));

		PartDefinition cube_r377 = leftOrbit.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(43, 73).addBox(-0.7503F, -0.2193F, -0.587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.6037F, 3.0782F, -2.3398F, 1.6299F, 0.1815F, 0.3861F));

		PartDefinition cube_r378 = leftOrbit.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(51, 62).addBox(-2.7F, -0.2F, -0.8F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.334F, 2.4276F, -4.0615F, 1.944F, -0.3639F, 0.9092F));

		PartDefinition cube_r379 = leftOrbit.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(60, 9).addBox(-2.0F, -2.0F, 0.025F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.6005F, 2.4255F, -5.1471F, 2.1596F, -0.0481F, 1.0592F));

		PartDefinition cube_r380 = leftOrbit.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 59).addBox(-3.0F, -2.5F, -0.275F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.69F, 3.0345F, -4.8296F, 2.1251F, 0.2152F, 0.6552F));

		PartDefinition cube_r381 = leftOrbit.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(77, 84).addBox(-0.05F, 0.05F, -0.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.4211F, 3.3602F, -6.1663F, 2.0593F, 0.3462F, 0.4191F));

		PartDefinition cube_r382 = leftOrbit.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(50, 83).addBox(-1.8F, -0.2F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.5108F, 5.3529F, -8.1553F, 2.2296F, 0.1564F, 0.3341F));

		PartDefinition cube_r383 = leftOrbit.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(82, 32).addBox(-0.925F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5457F, 6.1062F, -8.9168F, 2.4547F, -0.0382F, 0.2107F));

		PartDefinition cube_r384 = leftOrbit.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(103, 24).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.9203F, -0.9387F, 1.1361F, -3.1053F, -0.3088F, 1.7068F));

		PartDefinition cube_r385 = leftOrbit.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 88).addBox(-1.4906F, -3.4916F, 0.3235F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.243F, 0.4865F, -0.0375F, -2.9432F, 1.0336F, 1.9102F));

		PartDefinition cube_r386 = leftOrbit.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(71, 0).addBox(-0.2F, -3.825F, -1.825F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.6116F, 1.7697F, -1.2097F, 2.0432F, -0.7015F, 2.2748F));

		PartDefinition cube_r387 = leftOrbit.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(64, 83).addBox(-0.5F, -3.825F, -0.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.6176F, 2.0644F, -1.154F, 2.3769F, -0.187F, 1.5502F));

		PartDefinition cube_r388 = leftOrbit.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(5, 100).addBox(1.097F, -1.5556F, -0.1672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.183F)), PartPose.offsetAndRotation(2.243F, 0.3865F, -0.8375F, 3.0314F, -0.187F, 1.5502F));

		PartDefinition cube_r389 = leftOrbit.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(79, 100).addBox(0.7586F, -1.5556F, -0.3064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.243F, 0.3865F, -0.8375F, 3.033F, -0.0829F, 1.5387F));

		PartDefinition cube_r390 = leftOrbit.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(101, 0).addBox(0.2556F, -1.5556F, -0.5538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.183F)), PartPose.offsetAndRotation(2.243F, 0.3865F, -0.8375F, 3.032F, 0.16F, 1.5121F));

		PartDefinition cube_r391 = leftOrbit.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(69, 97).addBox(-0.3147F, -2.5556F, -0.6809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.243F, 0.3865F, -0.8375F, 3.0769F, 0.4984F, 1.5701F));

		PartDefinition cube_r392 = leftOrbit.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(92, 96).addBox(-0.3147F, -2.5556F, -0.6809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.243F, 0.3865F, -0.8375F, 3.023F, 0.4202F, 1.4811F));

		PartDefinition cube_r393 = leftOrbit.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(79, 51).addBox(-1.2332F, -3.4916F, 0.0195F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.183F)), PartPose.offsetAndRotation(2.243F, 0.4865F, -0.0375F, -3.0106F, 0.6889F, 1.8227F));

		PartDefinition cube_r394 = leftOrbit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(5, 92).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.3992F, -5.2049F, 3.3662F, -1.7791F, 0.7257F, -2.1957F));

		PartDefinition cube_r395 = leftOrbit.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(39, 91).addBox(-0.8F, 0.0F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4064F, -4.9121F, 3.0938F, -1.9972F, 0.7257F, -2.1957F));

		PartDefinition cube_r396 = leftOrbit.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(74, 73).addBox(-1.0011F, -2.9319F, -0.0232F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -2.3915F, 0.0448F, -3.1245F));

		PartDefinition cube_r397 = leftOrbit.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(91, 82).addBox(-0.8F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4255F, -4.0965F, 2.3564F, -2.0255F, 0.775F, -2.2011F));

		PartDefinition cube_r398 = leftOrbit.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(80, 61).addBox(-1.0011F, -1.4234F, -0.0849F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -2.4438F, 0.0448F, -3.1245F));

		PartDefinition cube_r399 = leftOrbit.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(64, 91).addBox(-0.8F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4337F, -3.6206F, 1.9921F, -2.1043F, 0.8431F, -2.2543F));

		PartDefinition cube_r400 = leftOrbit.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(80, 41).addBox(-1.0011F, -0.9705F, -0.1458F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -2.5311F, 0.0448F, -3.1245F));

		PartDefinition cube_r401 = leftOrbit.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(83, 73).addBox(-0.8F, -1.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4367F, -2.6227F, 1.5472F, -0.8567F, 1.0226F, -2.5039F));

		PartDefinition cube_r402 = leftOrbit.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(18, 74).addBox(-1.0011F, -0.2462F, -1.2072F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -1.2221F, 0.0448F, -3.1245F));

		PartDefinition cube_r403 = leftOrbit.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(79, 57).addBox(-1.0011F, -1.1518F, -2.0179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -0.0353F, 0.0448F, -3.1245F));

		PartDefinition cube_r404 = leftOrbit.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(60, 62).addBox(-1.0011F, -2.2351F, -0.463F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, 0.9246F, 0.0448F, -3.1245F));

		PartDefinition cube_r405 = leftOrbit.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(0, 82).addBox(-2.6F, -1.8F, 0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.734F, -1.7631F, 1.5767F, -1.6976F, 0.2269F, 2.999F));

		PartDefinition cube_r406 = leftOrbit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(43, 49).addBox(-2.0F, -1.8F, -0.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.734F, -1.7631F, 1.5767F, -1.6447F, 0.2488F, -3.0608F));

		PartDefinition cube_r407 = leftOrbit.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, -1.5F, -1.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.5269F, -2.3793F, 4.3897F, -0.3122F, -0.1816F, -2.877F));

		PartDefinition cube_r408 = leftOrbit.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(56, 47).addBox(-2.0617F, -2.0F, -0.7567F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.0595F, -1.5573F, 2.9085F, -0.6399F, -0.027F, -2.6643F));

		PartDefinition cube_r409 = leftOrbit.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(82, 27).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.8765F, -0.6925F, 4.1201F, -0.9531F, 0.0812F, -2.9501F));

		PartDefinition cube_r410 = leftOrbit.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(73, 17).addBox(-1.0011F, -1.9222F, -2.3321F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.178F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -0.969F, 0.0448F, -3.1245F));

		PartDefinition cube_r411 = leftOrbit.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(11, 60).addBox(-1.0011F, -0.2454F, -2.9873F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.178F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, 1.6489F, 0.0448F, -3.1245F));

		PartDefinition cube_r412 = leftOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(78, 0).addBox(-1.0011F, -0.705F, -0.6807F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, 0.7327F, 0.0448F, -3.1245F));

		PartDefinition cube_r413 = leftOrbit.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(73, 32).addBox(-1.0011F, -1.8865F, -0.669F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, 0.4709F, 0.0448F, -3.1245F));

		PartDefinition cube_r414 = leftOrbit.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(98, 82).addBox(-1.0011F, -1.6177F, -0.8667F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -0.0178F, 0.0448F, -3.1245F));

		PartDefinition cube_r415 = leftOrbit.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(85, 96).addBox(-1.0011F, -0.9513F, 0.0576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(96, 79).addBox(-1.0011F, -0.9513F, -0.4424F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.1604F, -2.2742F, 3.1125F, -0.2709F, 0.0448F, -3.1245F));

		PartDefinition cube_r416 = leftOrbit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(5, 88).addBox(-1.7732F, 0.007F, -1.0116F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 1.4647F, 0.6409F, 0.9826F));

		PartDefinition cube_r417 = leftOrbit.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(90, 101).addBox(-0.9476F, 0.007F, -1.0621F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 0.9436F, 0.1767F, -0.1741F));

		PartDefinition cube_r418 = leftOrbit.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(107, 89).addBox(-0.9644F, 0.0417F, -0.2256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 0.8551F, -0.3635F, -0.2818F));

		PartDefinition cube_r419 = leftOrbit.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(75, 107).addBox(-0.9091F, 0.0168F, -1.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 0.9512F, -0.1005F, 0.0241F));

		PartDefinition cube_r420 = leftOrbit.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(57, 83).addBox(-0.8604F, -0.0884F, -2.8683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 1.0594F, 0.2052F, -0.0854F));

		PartDefinition cube_r421 = leftOrbit.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(19, 95).addBox(-0.8587F, -0.1013F, -2.8683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 1.0697F, -0.0701F, 0.0668F));

		PartDefinition cube_r422 = leftOrbit.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(94, 45).addBox(0.3059F, -0.3802F, -3.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9894F, 4.7477F, -8.6591F, 1.1221F, 0.4285F, 0.3214F));

		PartDefinition cube_r423 = leftOrbit.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(38, 95).addBox(0.1659F, -0.7299F, -3.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9894F, 4.7477F, -8.6591F, 1.1603F, 0.1504F, 0.4537F));

		PartDefinition cube_r424 = leftOrbit.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(5, 96).addBox(-1.0F, -0.375F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5844F, 6.2427F, -9.8593F, 0.7594F, 0.9585F, -0.3204F));

		PartDefinition cube_r425 = leftOrbit.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(16, 85).addBox(-0.9F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4332F, 1.9255F, -2.3829F, -0.458F, 0.4907F, -2.0228F));

		PartDefinition cube_r426 = leftOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(39, 54).addBox(-0.9F, -0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8071F, 1.4575F, -2.5534F, 0.2631F, 0.6106F, -0.7757F));

		PartDefinition cube_r427 = leftOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(49, 0).addBox(0.0F, -1.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0242F, 0.5213F, -0.6194F, 0.1515F, 0.643F, -0.9656F));

		PartDefinition cube_r428 = leftOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(9, 66).addBox(-0.2F, -0.1F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3738F, -0.9246F, 0.1295F, 0.3841F, 0.7285F, -0.9429F));

		PartDefinition cube_r429 = leftOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(40, 67).addBox(-0.375F, -0.5F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7661F, -1.3833F, -0.1633F, 0.1703F, 0.6235F, -0.7378F));

		PartDefinition cube_r430 = leftOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(95, 90).addBox(-0.5F, -0.475F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5778F, 3.9434F, -6.5806F, -0.5402F, 0.1257F, -1.6834F));

		PartDefinition cube_r431 = leftOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(60, 0).addBox(-0.425F, -0.65F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9808F, 3.7423F, -6.8413F, -0.2043F, 0.5015F, -0.661F));

		PartDefinition cube_r432 = leftOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(43, 77).addBox(-0.8F, -0.8F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5528F, 4.1624F, -7.5243F, -0.201F, 0.8378F, -1.7459F));

		PartDefinition cube_r433 = leftOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(98, 16).addBox(-1.9F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4551F, 3.1098F, -6.6064F, 3.1055F, 0.987F, 1.3253F));

		PartDefinition cube_r434 = leftOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(55, 92).addBox(-1.9F, -1.5F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7788F, 2.939F, -6.7679F, 2.3201F, 0.987F, 1.3253F));

		PartDefinition cube_r435 = leftOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(56, 73).addBox(-1.075F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1957F, 4.7855F, -8.8767F, 0.5518F, 0.6921F, -0.711F));

		PartDefinition cube_r436 = leftOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(62, 95).addBox(-1.075F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5844F, 6.2427F, -9.8593F, 0.5578F, 0.8719F, -0.6263F));

		PartDefinition cube_r437 = leftOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(46, 94).addBox(-0.4913F, 0.7332F, -4.4439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 0.9116F, 0.4376F, -0.0123F));

		PartDefinition cube_r438 = leftOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(95, 51).addBox(-0.3959F, -0.1844F, -4.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 1.1253F, 0.2033F, 0.1111F));

		PartDefinition cube_r439 = leftOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(12, 95).addBox(-0.4262F, -0.2915F, -4.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.2793F, 2.0932F, -7.8697F, 1.1351F, 0.0058F, 0.2045F));

		PartDefinition cube_r440 = leftOrbit.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(91, 10).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.477F, 12.2149F, -12.7514F, 1.1986F, 0.833F, -0.159F));

		PartDefinition cube_r441 = leftOrbit.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(81, 90).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.4F, 10.7013F, -12.2384F, 1.0979F, 0.79F, -0.2978F));

		PartDefinition cube_r442 = leftOrbit.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(90, 73).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.4F, 10.7013F, -12.2384F, 1.2444F, 0.0179F, 0.0448F));

		PartDefinition cube_r443 = leftOrbit.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(78, 67).addBox(-1.4872F, -1.4343F, -0.4396F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6076F, -1.4711F, -1.639F, 2.1366F, 0.2124F, 0.0318F));

		PartDefinition cube_r444 = leftOrbit.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(105, 18).addBox(-1.05F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.1606F, 1.47F, -7.1728F, 2.4032F, -0.5027F, -0.6303F));

		PartDefinition cube_r445 = leftOrbit.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(73, 104).addBox(-1.1F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9636F, 0.8434F, -6.477F, 2.2891F, 0.1755F, 0.008F));

		PartDefinition cube_r446 = leftOrbit.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(77, 78).addBox(-2.075F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2657F, -0.3648F, -2.5972F, 2.1146F, 0.1755F, 0.008F));

		PartDefinition cube_r447 = leftOrbit.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(107, 64).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3825F, 10.7013F, -12.2384F, 1.0354F, 0.7115F, -0.3739F));

		PartDefinition cube_r448 = leftOrbit.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(106, 105).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3858F, 9.9634F, -11.9293F, 1.0007F, 0.7182F, -0.4036F));

		PartDefinition cube_r449 = leftOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(12, 91).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3889F, 9.2325F, -11.6042F, 0.9135F, 0.7051F, -0.4681F));

		PartDefinition cube_r450 = leftOrbit.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(0, 108).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3971F, 7.3014F, -10.6024F, 0.9453F, 0.7255F, -0.4512F));

		PartDefinition cube_r451 = leftOrbit.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -0.025F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, -3.3317F, -1.0792F, 1.7654F, 0.3931F, -1.0956F));

		PartDefinition cube_r452 = leftOrbit.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(18, 79).addBox(-1.0F, -3.025F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, -3.3317F, -1.0792F, 1.9116F, 0.6219F, -1.024F));

		PartDefinition cube_r453 = leftOrbit.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(69, 85).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, -0.3926F, -4.9797F, 1.8385F, 0.5063F, -1.0561F));

		PartDefinition cube_r454 = leftOrbit.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(41, 87).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4933F, 12.217F, -12.7521F, 1.2657F, 0.4451F, -0.1393F));

		PartDefinition cube_r455 = leftOrbit.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(27, 107).addBox(-0.8F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8462F, 2.4338F, -8.2409F, -1.0627F, 0.8655F, -0.9394F));

		PartDefinition cube_r456 = leftOrbit.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(107, 11).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, 0.9837F, -7.0523F, 0.2905F, 0.605F, -1.0868F));

		PartDefinition cube_r457 = leftOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(22, 107).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3F, 1.6967F, -7.7245F, -1.0627F, 0.8655F, -0.9394F));

		PartDefinition cube_r458 = leftOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(88, 90).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4863F, 13.7571F, -13.1858F, 1.4134F, 0.4654F, 0.0193F));

		PartDefinition cube_r459 = leftOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(80, 5).addBox(-1.729F, -3.0302F, -0.5322F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8592F, -4.4381F, 2.3068F, 2.7404F, 0.7779F, 1.1135F));

		PartDefinition cube_r460 = leftOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(27, 77).addBox(-1.5764F, -2.7471F, -0.5454F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8592F, -4.4381F, 2.3068F, 2.6081F, 0.6921F, 0.8418F));

		PartDefinition cube_r461 = leftOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(102, 93).addBox(0.1302F, 0.1602F, -0.5887F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(102, 89).addBox(0.1302F, -1.0398F, -0.5887F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8592F, -4.4381F, 2.3068F, 2.4422F, 0.6668F, 0.5872F));

		PartDefinition cube_r462 = leftOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(65, 102).addBox(-0.625F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3773F, -3.3149F, 0.9961F, 2.2831F, 0.3869F, 0.2663F));

		PartDefinition cube_r463 = leftOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(26, 50).addBox(-0.8894F, -1.0F, -0.9565F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(0.0595F, -1.5573F, 2.9085F, -0.6848F, 0.2488F, -3.0608F));

		PartDefinition cube_r464 = leftOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(0, 38).addBox(-0.7F, -0.15F, -1.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.1F, 5.4064F, -8.7877F, 0.7858F, 0.0011F, -0.0048F));

		PartDefinition cube_r465 = leftOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(75, 12).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3F, 1.4136F, 2.644F, 1.6799F, -0.4851F, 0.7574F));

		PartDefinition cube_r466 = leftOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(67, 47).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3F, 0.5005F, 3.834F, 2.029F, -0.4851F, 0.7574F));

		PartDefinition cube_r467 = leftOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(97, 73).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -4.5506F, 1.2915F, 2.2086F, -0.1582F, 0.2095F));

		PartDefinition cube_r468 = leftOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(65, 73).addBox(0.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8F, -4.2462F, 0.8949F, 0.856F, -0.1582F, 0.2095F));

		PartDefinition cube_r469 = leftOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(82, 17).addBox(-1.9955F, 1.3076F, -0.6377F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6076F, -1.4711F, -1.639F, 2.2429F, 0.1509F, 0.225F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, 2.2933F, -5.0002F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r470 = rightOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.5F, -3.6F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.2849F, 14.1484F, -12.264F, 2.9391F, 0.0934F, -0.1429F));

		PartDefinition cube_r471 = rightOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(97, 99).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.257F, 14.154F, -12.5671F, 2.9027F, 0.0892F, -0.16F));

		PartDefinition cube_r472 = rightOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-1.1F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.3264F, 10.4235F, -11.5221F, 2.7437F, 0.0765F, -0.1833F));

		PartDefinition cube_r473 = rightOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(0.175F, -7.0F, -6.7F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9064F, 6.988F, -9.4907F, 2.2947F, -0.3945F, 0.0288F));

		PartDefinition cube_r474 = rightOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.175F, -2.0F, -6.7F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5135F, 5.7503F, -7.9696F, 2.2116F, -0.3215F, 0.0935F));

		PartDefinition cube_r475 = rightOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-0.7999F, -1.3536F, 1.1857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.9276F, 9.1497F, -8.972F, 2.6109F, 0.0494F, -0.2185F));

		PartDefinition cube_r476 = rightOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(12, 104).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.8884F, 1.9185F, 1.9235F, 2.5585F, 0.0893F, 0.0298F));

		PartDefinition cube_r477 = rightOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(17, 104).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-2.6977F, 2.9033F, 0.677F, 2.2478F, -0.0316F, -0.152F));

		PartDefinition cube_r478 = rightOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(109, 34).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.753F, 2.5484F, 0.7078F, 2.0733F, -0.0316F, -0.152F));

		PartDefinition cube_r479 = rightOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(80, 107).mirror().addBox(-0.522F, 1.3173F, -0.7201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.6037F, 3.0782F, -2.3398F, 1.7162F, -0.0073F, -0.3759F));

		PartDefinition cube_r480 = rightOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(34, 78).mirror().addBox(-1.8F, -0.2F, -0.8F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.0787F, 2.4032F, -3.8898F, 1.8475F, -0.4724F, -0.457F));

		PartDefinition cube_r481 = rightOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(34, 69).mirror().addBox(0.3988F, -1.133F, -0.587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.6037F, 3.0782F, -2.3398F, 1.6574F, -0.8345F, -0.4397F));

		PartDefinition cube_r482 = rightOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(43, 73).mirror().addBox(-0.2497F, -0.2193F, -0.587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.6037F, 3.0782F, -2.3398F, 1.6299F, -0.1815F, -0.3861F));

		PartDefinition cube_r483 = rightOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-0.3F, -0.2F, -0.8F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.334F, 2.4276F, -4.0615F, 1.944F, 0.3639F, -0.9092F));

		PartDefinition cube_r484 = rightOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(60, 9).mirror().addBox(-2.0F, -2.0F, 0.025F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.6005F, 2.4255F, -5.1471F, 2.1596F, 0.0481F, -1.0592F));

		PartDefinition cube_r485 = rightOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.0F, -2.5F, -0.275F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.69F, 3.0345F, -4.8296F, 2.1251F, -0.2152F, -0.6552F));

		PartDefinition cube_r486 = rightOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(77, 84).mirror().addBox(-1.95F, 0.05F, -0.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.4211F, 3.3602F, -6.1663F, 2.0593F, -0.3462F, -0.4191F));

		PartDefinition cube_r487 = rightOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(-0.2F, -0.2F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.5108F, 5.3529F, -8.1553F, 2.2296F, -0.1564F, -0.3341F));

		PartDefinition cube_r488 = rightOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-1.075F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5457F, 6.1062F, -8.9168F, 2.4547F, 0.0382F, -0.2107F));

		PartDefinition cube_r489 = rightOrbit.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(103, 24).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.9203F, -0.9387F, 1.1361F, -3.1053F, 0.3088F, -1.7068F));

		PartDefinition cube_r490 = rightOrbit.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(0.4906F, -3.4916F, 0.3235F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.243F, 0.4865F, -0.0375F, -2.9432F, -1.0336F, -1.9102F));

		PartDefinition cube_r491 = rightOrbit.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.8F, -3.825F, -1.825F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.6116F, 1.7697F, -1.2097F, 2.0432F, 0.7015F, -2.2748F));

		PartDefinition cube_r492 = rightOrbit.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(64, 83).mirror().addBox(-0.5F, -3.825F, -0.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.6176F, 2.0644F, -1.154F, 2.3769F, 0.187F, -1.5502F));

		PartDefinition cube_r493 = rightOrbit.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-2.097F, -1.5556F, -0.1672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.183F)).mirror(false), PartPose.offsetAndRotation(-2.243F, 0.3865F, -0.8375F, 3.0314F, 0.187F, -1.5502F));

		PartDefinition cube_r494 = rightOrbit.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(79, 100).mirror().addBox(-1.7586F, -1.5556F, -0.3064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.243F, 0.3865F, -0.8375F, 3.033F, 0.0829F, -1.5387F));

		PartDefinition cube_r495 = rightOrbit.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-1.2556F, -1.5556F, -0.5538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.183F)).mirror(false), PartPose.offsetAndRotation(-2.243F, 0.3865F, -0.8375F, 3.032F, -0.16F, -1.5121F));

		PartDefinition cube_r496 = rightOrbit.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(69, 97).mirror().addBox(-0.6853F, -2.5556F, -0.6809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.243F, 0.3865F, -0.8375F, 3.0769F, -0.4984F, -1.5701F));

		PartDefinition cube_r497 = rightOrbit.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-0.6853F, -2.5556F, -0.6809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.243F, 0.3865F, -0.8375F, 3.023F, -0.4202F, -1.4811F));

		PartDefinition cube_r498 = rightOrbit.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(79, 51).mirror().addBox(-0.7668F, -3.4916F, 0.0195F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.183F)).mirror(false), PartPose.offsetAndRotation(-2.243F, 0.4865F, -0.0375F, -3.0106F, -0.6889F, -1.8227F));

		PartDefinition cube_r499 = rightOrbit.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.3992F, -5.2049F, 3.3662F, -1.7791F, -0.7257F, 2.1957F));

		PartDefinition cube_r500 = rightOrbit.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(39, 91).mirror().addBox(-0.2F, 0.0F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4064F, -4.9121F, 3.0938F, -1.9972F, -0.7257F, 2.1957F));

		PartDefinition cube_r501 = rightOrbit.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(74, 73).mirror().addBox(-0.9989F, -2.9319F, -0.0232F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -2.3915F, -0.0448F, 3.1245F));

		PartDefinition cube_r502 = rightOrbit.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(91, 82).mirror().addBox(-0.2F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4255F, -4.0965F, 2.3564F, -2.0255F, -0.775F, 2.2011F));

		PartDefinition cube_r503 = rightOrbit.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-0.9989F, -1.4234F, -0.0849F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -2.4438F, -0.0448F, 3.1245F));

		PartDefinition cube_r504 = rightOrbit.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(64, 91).mirror().addBox(-0.2F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4337F, -3.6206F, 1.9921F, -2.1043F, -0.8431F, 2.2543F));

		PartDefinition cube_r505 = rightOrbit.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(80, 41).mirror().addBox(-0.9989F, -0.9705F, -0.1458F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -2.5311F, -0.0448F, 3.1245F));

		PartDefinition cube_r506 = rightOrbit.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(83, 73).mirror().addBox(-0.2F, -1.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4367F, -2.6227F, 1.5472F, -0.8567F, -1.0226F, 2.5039F));

		PartDefinition cube_r507 = rightOrbit.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(18, 74).mirror().addBox(-0.9989F, -0.2462F, -1.2072F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -1.2221F, -0.0448F, 3.1245F));

		PartDefinition cube_r508 = rightOrbit.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-0.9989F, -1.1518F, -2.0179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -0.0353F, -0.0448F, 3.1245F));

		PartDefinition cube_r509 = rightOrbit.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-0.9989F, -2.2351F, -0.463F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, 0.9246F, -0.0448F, 3.1245F));

		PartDefinition cube_r510 = rightOrbit.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.4F, -1.8F, 0.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.734F, -1.7631F, 1.5767F, -1.6976F, -0.2269F, -2.999F));

		PartDefinition cube_r511 = rightOrbit.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(43, 49).mirror().addBox(-2.0F, -1.8F, -0.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.734F, -1.7631F, 1.5767F, -1.6447F, -0.2488F, 3.0608F));

		PartDefinition cube_r512 = rightOrbit.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5F, -1.5F, -1.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.5269F, -2.3793F, 4.3897F, -0.3122F, 0.1816F, 2.877F));

		PartDefinition cube_r513 = rightOrbit.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(56, 47).mirror().addBox(-0.9383F, -2.0F, -0.7567F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.0595F, -1.5573F, 2.9085F, -0.6399F, 0.027F, 2.6643F));

		PartDefinition cube_r514 = rightOrbit.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.8765F, -0.6925F, 4.1201F, -0.9531F, -0.0812F, 2.9501F));

		PartDefinition cube_r515 = rightOrbit.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(73, 17).mirror().addBox(-0.9989F, -1.9222F, -2.3321F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.178F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -0.969F, -0.0448F, 3.1245F));

		PartDefinition cube_r516 = rightOrbit.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(11, 60).mirror().addBox(-0.9989F, -0.2454F, -2.9873F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.178F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, 1.6489F, -0.0448F, 3.1245F));

		PartDefinition cube_r517 = rightOrbit.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.9989F, -0.705F, -0.6807F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, 0.7327F, -0.0448F, 3.1245F));

		PartDefinition cube_r518 = rightOrbit.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(73, 32).mirror().addBox(-0.9989F, -1.8865F, -0.669F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, 0.4709F, -0.0448F, 3.1245F));

		PartDefinition cube_r519 = rightOrbit.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(98, 82).mirror().addBox(-0.9989F, -1.6177F, -0.8667F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -0.0178F, -0.0448F, 3.1245F));

		PartDefinition cube_r520 = rightOrbit.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(85, 96).mirror().addBox(-0.9989F, -0.9513F, 0.0576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(96, 79).mirror().addBox(-0.9989F, -0.9513F, -0.4424F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.1604F, -2.2742F, 3.1125F, -0.2709F, -0.0448F, 3.1245F));

		PartDefinition cube_r521 = rightOrbit.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.2268F, 0.007F, -1.0116F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 1.4647F, -0.6409F, -0.9826F));

		PartDefinition cube_r522 = rightOrbit.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(90, 101).mirror().addBox(-0.0524F, 0.007F, -1.0621F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 0.9436F, -0.1767F, 0.1741F));

		PartDefinition cube_r523 = rightOrbit.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(107, 89).mirror().addBox(-0.0356F, 0.0417F, -0.2256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 0.8551F, 0.3635F, 0.2818F));

		PartDefinition cube_r524 = rightOrbit.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(75, 107).mirror().addBox(-0.0909F, 0.0168F, -1.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 0.9512F, 0.1005F, -0.0241F));

		PartDefinition cube_r525 = rightOrbit.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-0.1396F, -0.0884F, -2.8683F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 1.0594F, -0.2052F, 0.0854F));

		PartDefinition cube_r526 = rightOrbit.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(19, 95).mirror().addBox(-0.1413F, -0.1013F, -2.8683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 1.0697F, 0.0701F, -0.0668F));

		PartDefinition cube_r527 = rightOrbit.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(-1.3059F, -0.3802F, -3.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9894F, 4.7477F, -8.6591F, 1.1221F, -0.4285F, -0.3214F));

		PartDefinition cube_r528 = rightOrbit.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(38, 95).mirror().addBox(-1.1659F, -0.7299F, -3.3299F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9894F, 4.7477F, -8.6591F, 1.1603F, -0.1504F, -0.4537F));

		PartDefinition cube_r529 = rightOrbit.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(0.0F, -0.375F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.5844F, 6.2427F, -9.8593F, 0.7594F, -0.9585F, 0.3204F));

		PartDefinition cube_r530 = rightOrbit.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(16, 85).mirror().addBox(-0.1F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4332F, 1.9255F, -2.3829F, -0.458F, -0.4907F, 2.0228F));

		PartDefinition cube_r531 = rightOrbit.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(39, 54).mirror().addBox(-0.1F, -0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8071F, 1.4575F, -2.5534F, 0.2631F, -0.6106F, 0.7757F));

		PartDefinition cube_r532 = rightOrbit.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-1.0F, -1.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0242F, 0.5213F, -0.6194F, 0.1515F, -0.643F, 0.9656F));

		PartDefinition cube_r533 = rightOrbit.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(9, 66).mirror().addBox(-0.8F, -0.1F, -1.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3738F, -0.9246F, 0.1295F, 0.3841F, -0.7285F, 0.9429F));

		PartDefinition cube_r534 = rightOrbit.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(40, 67).mirror().addBox(-0.625F, -0.5F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7661F, -1.3833F, -0.1633F, 0.1703F, -0.6235F, 0.7378F));

		PartDefinition cube_r535 = rightOrbit.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(95, 90).mirror().addBox(-0.5F, -0.475F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 3.9434F, -6.5806F, -0.5402F, -0.1257F, 1.6834F));

		PartDefinition cube_r536 = rightOrbit.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.575F, -0.65F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9808F, 3.7423F, -6.8413F, -0.2043F, -0.5015F, 0.661F));

		PartDefinition cube_r537 = rightOrbit.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.2F, -0.8F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5528F, 4.1624F, -7.5243F, -0.201F, -0.8378F, 1.7459F));

		PartDefinition cube_r538 = rightOrbit.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(98, 16).mirror().addBox(-0.1F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4551F, 3.1098F, -6.6064F, 3.1055F, -0.987F, -1.3253F));

		PartDefinition cube_r539 = rightOrbit.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(-0.1F, -1.5F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7788F, 2.939F, -6.7679F, 2.3201F, -0.987F, -1.3253F));

		PartDefinition cube_r540 = rightOrbit.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(56, 73).mirror().addBox(0.075F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1957F, 4.7855F, -8.8767F, 0.5518F, -0.6921F, 0.711F));

		PartDefinition cube_r541 = rightOrbit.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(62, 95).mirror().addBox(0.075F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.5844F, 6.2427F, -9.8593F, 0.5578F, -0.8719F, 0.6263F));

		PartDefinition cube_r542 = rightOrbit.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(46, 94).mirror().addBox(-0.5087F, 0.7332F, -4.4439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 0.9116F, -0.4376F, 0.0123F));

		PartDefinition cube_r543 = rightOrbit.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(95, 51).mirror().addBox(-0.6041F, -0.1844F, -4.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 1.1253F, -0.2033F, -0.1111F));

		PartDefinition cube_r544 = rightOrbit.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(12, 95).mirror().addBox(-0.5738F, -0.2915F, -4.6211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.2793F, 2.0932F, -7.8697F, 1.1351F, -0.0058F, -0.2045F));

		PartDefinition cube_r545 = rightOrbit.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.477F, 12.2149F, -12.7514F, 1.1986F, -0.833F, 0.159F));

		PartDefinition cube_r546 = rightOrbit.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(81, 90).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.4F, 10.7013F, -12.2384F, 1.0979F, -0.79F, 0.2978F));

		PartDefinition cube_r547 = rightOrbit.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(90, 73).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.4F, 10.7013F, -12.2384F, 1.2444F, -0.0179F, -0.0448F));

		PartDefinition cube_r548 = rightOrbit.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-0.5128F, -1.4343F, -0.4396F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6076F, -1.4711F, -1.639F, 2.1366F, -0.2124F, -0.0318F));

		PartDefinition cube_r549 = rightOrbit.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(105, 18).mirror().addBox(0.05F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.1606F, 1.47F, -7.1728F, 2.4032F, 0.5027F, 0.6303F));

		PartDefinition cube_r550 = rightOrbit.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(73, 104).mirror().addBox(0.1F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9636F, 0.8434F, -6.477F, 2.2891F, -0.1755F, -0.008F));

		PartDefinition cube_r551 = rightOrbit.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(0.075F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2657F, -0.3648F, -2.5972F, 2.1146F, -0.1755F, -0.008F));

		PartDefinition cube_r552 = rightOrbit.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(107, 64).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3825F, 10.7013F, -12.2384F, 1.0354F, -0.7115F, 0.3739F));

		PartDefinition cube_r553 = rightOrbit.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(106, 105).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3858F, 9.9634F, -11.9293F, 1.0007F, -0.7182F, 0.4036F));

		PartDefinition cube_r554 = rightOrbit.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(12, 91).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3889F, 9.2325F, -11.6042F, 0.9135F, -0.7051F, 0.4681F));

		PartDefinition cube_r555 = rightOrbit.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.1F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3971F, 7.3014F, -10.6024F, 0.9453F, -0.7255F, 0.4512F));

		PartDefinition cube_r556 = rightOrbit.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(0.0F, -0.025F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3F, -3.3317F, -1.0792F, 1.7654F, -0.3931F, 1.0956F));

		PartDefinition cube_r557 = rightOrbit.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(18, 79).mirror().addBox(0.0F, -3.025F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3F, -3.3317F, -1.0792F, 1.9116F, -0.6219F, 1.024F));

		PartDefinition cube_r558 = rightOrbit.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(69, 85).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3F, -0.3926F, -4.9797F, 1.8385F, -0.5063F, 1.0561F));

		PartDefinition cube_r559 = rightOrbit.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(41, 87).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4933F, 12.217F, -12.7521F, 1.2657F, -0.4451F, 0.1393F));

		PartDefinition cube_r560 = rightOrbit.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(27, 107).mirror().addBox(-0.2F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8462F, 2.4338F, -8.2409F, -1.0627F, -0.8655F, 0.9394F));

		PartDefinition cube_r561 = rightOrbit.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(107, 11).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.9837F, -7.0523F, 0.2905F, -0.605F, 1.0868F));

		PartDefinition cube_r562 = rightOrbit.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(22, 107).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3F, 1.6967F, -7.7245F, -1.0627F, -0.8655F, 0.9394F));

		PartDefinition cube_r563 = rightOrbit.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(88, 90).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.4863F, 13.7571F, -13.1858F, 1.4134F, -0.4654F, -0.0193F));

		PartDefinition cube_r564 = rightOrbit.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(80, 5).mirror().addBox(-0.271F, -3.0302F, -0.5322F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8592F, -4.4381F, 2.3068F, 2.7404F, -0.7779F, -1.1135F));

		PartDefinition cube_r565 = rightOrbit.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(27, 77).mirror().addBox(-0.4236F, -2.7471F, -0.5454F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8592F, -4.4381F, 2.3068F, 2.6081F, -0.6921F, -0.8418F));

		PartDefinition cube_r566 = rightOrbit.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(102, 93).mirror().addBox(-1.1302F, 0.1602F, -0.5887F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(102, 89).mirror().addBox(-1.1302F, -1.0398F, -0.5887F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8592F, -4.4381F, 2.3068F, 2.4422F, -0.6668F, -0.5872F));

		PartDefinition cube_r567 = rightOrbit.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(65, 102).mirror().addBox(-0.375F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3773F, -3.3149F, 0.9961F, 2.2831F, -0.3869F, -0.2663F));

		PartDefinition cube_r568 = rightOrbit.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-3.1106F, -1.0F, -0.9565F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(-0.0595F, -1.5573F, 2.9085F, -0.6848F, -0.2488F, 3.0608F));

		PartDefinition cube_r569 = rightOrbit.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.3F, -0.15F, -1.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.1F, 5.4064F, -8.7877F, 0.7858F, -0.0011F, 0.0048F));

		PartDefinition cube_r570 = rightOrbit.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(75, 12).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.3F, 1.4136F, 2.644F, 1.6799F, 0.4851F, -0.7574F));

		PartDefinition cube_r571 = rightOrbit.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(67, 47).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.5005F, 3.834F, 2.029F, 0.4851F, -0.7574F));

		PartDefinition cube_r572 = rightOrbit.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(97, 73).mirror().addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -4.5506F, 1.2915F, 2.2086F, 0.1582F, -0.2095F));

		PartDefinition cube_r573 = rightOrbit.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8F, -4.2462F, 0.8949F, 0.856F, 0.1582F, -0.2095F));

		PartDefinition cube_r574 = rightOrbit.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(82, 17).mirror().addBox(-0.0045F, 1.3076F, -0.6377F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6076F, -1.4711F, -1.639F, 2.2429F, -0.1509F, -0.225F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 3.9489F, -1.6222F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(21, 89).mirror().addBox(-0.4015F, -1.1837F, -0.8441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -1.9209F, -0.1125F, -0.0319F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(27, 103).mirror().addBox(-0.4015F, -0.59F, -1.821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -2.7499F, -0.1125F, -0.0319F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(101, 45).mirror().addBox(-0.4015F, -1.1877F, -1.3377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -2.3572F, -0.1125F, -0.0319F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(107, 92).mirror().addBox(-0.4015F, 0.7991F, -0.8344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -3.099F, -0.1125F, -0.0319F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(52, 78).mirror().addBox(-0.4015F, 0.7853F, -0.1651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 2.7915F, -0.1125F, -0.0319F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(11, 53).mirror().addBox(-0.2408F, -0.5709F, 2.8307F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 2.6606F, -0.0427F, -0.0319F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(0.161F, -1.4344F, 6.7589F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 2.5297F, 0.0271F, -0.032F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(84, 84).mirror().addBox(-0.7144F, -1.2651F, 9.6473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 2.4434F, -0.0601F, 0.0029F));

		PartDefinition cube_r583 = jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.7211F, -2.0928F, 11.4866F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 2.5398F, -0.1344F, 0.0464F));

		PartDefinition cube_r584 = jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(94, 107).mirror().addBox(-1.7211F, 0.9921F, 12.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 2.627F, -0.1344F, 0.0464F));

		PartDefinition cube_r585 = jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(54, 107).mirror().addBox(-1.7211F, 2.7188F, 12.9857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 2.7579F, -0.1344F, 0.0464F));

		PartDefinition cube_r586 = jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(108, 81).mirror().addBox(-1.7211F, -14.6083F, 3.9236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 1.2744F, -0.1344F, 0.0464F));

		PartDefinition cube_r587 = jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(9, 82).mirror().addBox(-3.3169F, -7.3614F, -15.2447F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.1262F, -0.2391F, 0.0818F));

		PartDefinition cube_r588 = jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(18, 68).mirror().addBox(-3.3169F, -8.6621F, -17.5451F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.0389F, -0.2391F, 0.0818F));

		PartDefinition cube_r589 = jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-5.8337F, -9.881F, -19.1482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 0.0325F, -0.3779F, 0.1041F));

		PartDefinition cube_r590 = jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(32, 88).mirror().addBox(-5.8337F, -10.7069F, -20.699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, 0.0761F, -0.3779F, 0.1041F));

		PartDefinition cube_r591 = jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(9, 77).mirror().addBox(-5.8337F, -4.0333F, -22.6599F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.2293F, -0.3779F, 0.1041F));

		PartDefinition cube_r592 = jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(10, 108).mirror().addBox(-3.3169F, -2.3683F, -18.5719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.3007F, -0.2391F, 0.0818F));

		PartDefinition cube_r593 = jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-3.3169F, -2.5995F, -17.6585F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.3444F, -0.2391F, 0.0818F));

		PartDefinition cube_r594 = jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-1.7211F, -2.2527F, -15.0228F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.4273F, -0.1344F, 0.0464F));

		PartDefinition cube_r595 = jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(61, 53).mirror().addBox(-0.7144F, -1.561F, -12.0639F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.48F, -0.0601F, 0.0029F));

		PartDefinition cube_r596 = jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(69, 67).mirror().addBox(0.161F, -1.3418F, -9.1975F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.3937F, 0.0271F, -0.032F));

		PartDefinition cube_r597 = jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(61, 78).mirror().addBox(-0.4015F, -0.8476F, -3.3481F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.3064F, -0.1125F, -0.0319F));

		PartDefinition cube_r598 = jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(71, 93).mirror().addBox(-5.8337F, -7.436F, -18.948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.0548F, -0.3779F, 0.1041F));

		PartDefinition cube_r599 = jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(-0.2408F, -0.8638F, -6.2968F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.3064F, -0.0427F, -0.0319F));

		PartDefinition cube_r600 = jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-5.8337F, -2.3045F, -19.9366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5968F, 1.5191F, -0.949F, -0.3166F, -0.3779F, 0.1041F));

		PartDefinition cube_r601 = jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(101, 45).addBox(-0.5985F, -1.1877F, -1.3377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -2.3572F, 0.1125F, 0.0319F));

		PartDefinition cube_r602 = jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(21, 89).addBox(-0.5985F, -1.1837F, -0.8441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -1.9209F, 0.1125F, 0.0319F));

		PartDefinition cube_r603 = jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(71, 7).addBox(-0.7592F, -0.8638F, -6.2968F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.3064F, 0.0427F, 0.0319F));

		PartDefinition cube_r604 = jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(61, 78).addBox(-0.5985F, -0.8476F, -3.3481F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.3064F, 0.1125F, 0.0319F));

		PartDefinition cube_r605 = jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(69, 67).addBox(-1.161F, -1.3418F, -9.1975F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.3937F, -0.0271F, 0.032F));

		PartDefinition cube_r606 = jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(61, 53).addBox(-0.2856F, -1.561F, -12.0639F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.48F, 0.0601F, -0.0029F));

		PartDefinition cube_r607 = jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(64, 24).addBox(0.7211F, -2.2527F, -15.0228F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.4273F, 0.1344F, -0.0464F));

		PartDefinition cube_r608 = jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(70, 53).addBox(2.317F, -2.5995F, -17.6585F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.3444F, 0.2391F, -0.0818F));

		PartDefinition cube_r609 = jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(96, 4).addBox(4.8337F, -2.3045F, -19.9366F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.3166F, 0.3779F, -0.1041F));

		PartDefinition cube_r610 = jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(10, 108).addBox(2.317F, -2.3683F, -18.5719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.3007F, 0.2391F, -0.0818F));

		PartDefinition cube_r611 = jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(9, 77).addBox(4.8337F, -4.0333F, -22.6599F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.2293F, 0.3779F, -0.1041F));

		PartDefinition cube_r612 = jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(32, 88).addBox(4.8337F, -10.7069F, -20.699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 0.0761F, 0.3779F, -0.1041F));

		PartDefinition cube_r613 = jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(0, 77).addBox(4.8337F, -9.881F, -19.1482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 0.0325F, 0.3779F, -0.1041F));

		PartDefinition cube_r614 = jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(71, 93).addBox(4.8337F, -7.436F, -18.948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.0548F, 0.3779F, -0.1041F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(18, 68).addBox(2.317F, -8.6621F, -17.5451F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.0389F, 0.2391F, -0.0818F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(9, 82).addBox(2.317F, -7.3614F, -15.2447F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -0.1262F, 0.2391F, -0.0818F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(108, 81).addBox(0.7211F, -14.6083F, 3.9236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 1.2744F, 0.1344F, -0.0464F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(54, 107).addBox(0.7211F, 2.7188F, 12.9857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 2.7579F, 0.1344F, -0.0464F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(94, 107).addBox(0.7211F, 0.9921F, 12.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 2.627F, 0.1344F, -0.0464F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(0, 100).addBox(0.7211F, -2.0928F, 11.4866F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 2.5398F, 0.1344F, -0.0464F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(84, 84).addBox(-0.2856F, -1.2651F, 9.6473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 2.4434F, 0.0601F, -0.0029F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(0, 71).addBox(-1.161F, -1.4344F, 6.7589F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 2.5297F, -0.0271F, 0.032F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(11, 53).addBox(-0.7592F, -0.5709F, 2.8307F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 2.6606F, 0.0427F, 0.0319F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(52, 78).addBox(-0.5985F, 0.7853F, -0.1651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, 2.7915F, 0.1125F, 0.0319F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(107, 92).addBox(-0.5985F, 0.7991F, -0.8344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -3.099F, 0.1125F, 0.0319F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(27, 103).addBox(-0.5985F, -0.59F, -1.821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3968F, 1.5191F, -0.949F, -2.7499F, 0.1125F, 0.0319F));

		return LayerDefinition.create(meshdefinition, 114, 114);
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