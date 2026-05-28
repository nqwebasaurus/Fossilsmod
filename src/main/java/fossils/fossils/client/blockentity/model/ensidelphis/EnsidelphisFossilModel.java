package fossils.fossils.client.blockentity.model.ensidelphis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EnsidelphisFossilModel extends SkullModelBase {
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

	public EnsidelphisFossilModel(ModelPart root) {
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

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9898F, -25.5841F, -20.6614F, -0.0467F, 0.0082F, 0.1743F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 117).addBox(0.0F, -2.0068F, -0.4181F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5854F, -2.0706F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 69).addBox(0.0F, -1.3521F, 0.0721F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2624F, -0.5632F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-0.1693F, -0.1817F, -0.751F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8307F, 7.9842F, 1.2392F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 55).mirror().addBox(-3.1033F, 0.2263F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8307F, 7.9842F, 1.2392F, -0.3168F, 0.2366F, 0.8806F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 55).addBox(-0.8967F, 0.2263F, -0.7898F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8307F, 7.9842F, 1.2392F, -0.3168F, -0.2366F, -0.8806F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.157F, 0.068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7854F, -2.5206F, 0.2531F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0624F, 0.4829F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 35).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.4805F, 0.3903F, -0.8429F));

		PartDefinition cube_r8 = body6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.5576F, 0.2598F, -1.0827F));

		PartDefinition cube_r9 = body6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 35).mirror().addBox(-10.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.485F, 5.5008F, -0.6083F, 0.0366F, -1.4209F));

		PartDefinition cube_r10 = body6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 91).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.385F, 5.5008F, -0.2111F, 0.1485F, -0.0282F));

		PartDefinition cube_r11 = body6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(6, 96).mirror().addBox(-1.9081F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.185F, 3.5008F, -0.2551F, 0.1517F, 0.0001F));

		PartDefinition cube_r12 = body6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 17).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.533F, 0.3407F, -0.8267F));

		PartDefinition cube_r13 = body6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-6.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.5947F, 0.2002F, -1.0562F));

		PartDefinition cube_r14 = body6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-10.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.485F, 3.5008F, -0.6229F, -0.0315F, -1.3859F));

		PartDefinition cube_r15 = body6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 7).mirror().addBox(-8.9055F, -3.0617F, -0.3482F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.6601F, -0.1752F, -1.3122F));

		PartDefinition cube_r16 = body6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 23).mirror().addBox(-5.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.676F, 0.0756F, -0.9975F));

		PartDefinition cube_r17 = body6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-2.8528F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.585F, 1.5008F, -0.6433F, 0.2366F, -0.7883F));

		PartDefinition cube_r18 = body6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(117, 29).mirror().addBox(-1.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.085F, 1.5008F, -0.2639F, 0.1523F, 0.0686F));

		PartDefinition cube_r19 = body6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(117, 29).addBox(0.9081F, 0.3986F, -0.5165F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.085F, 1.5008F, -0.2639F, -0.1523F, -0.0686F));

		PartDefinition cube_r20 = body6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(76, 25).addBox(-0.1472F, -0.169F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.6433F, -0.2366F, 0.7883F));

		PartDefinition cube_r21 = body6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(76, 23).addBox(2.7118F, -0.9016F, -0.3482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.676F, -0.0756F, 0.9975F));

		PartDefinition cube_r22 = body6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(67, 7).addBox(4.9055F, -3.0617F, -0.3482F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.585F, 1.5008F, -0.6601F, 0.1752F, 1.3122F));

		PartDefinition cube_r23 = body6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(40, 62).addBox(5.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.6229F, 0.0315F, 1.3859F));

		PartDefinition cube_r24 = body6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(76, 19).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.5947F, -0.2002F, 1.0562F));

		PartDefinition cube_r25 = body6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(76, 17).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.485F, 3.5008F, -0.533F, -0.3407F, 0.8267F));

		PartDefinition cube_r26 = body6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(6, 96).addBox(-0.0919F, 0.2986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.185F, 3.5008F, -0.2551F, -0.1517F, -0.0001F));

		PartDefinition cube_r27 = body6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(95, 91).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.385F, 5.5008F, -0.2111F, -0.1485F, 0.0282F));

		PartDefinition cube_r28 = body6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(41, 16).addBox(-0.5F, -0.1F, -0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.104F, 0.0109F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(9, 65).addBox(0.0F, -2.9786F, -0.1073F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1345F, 5.1082F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(60, 35).addBox(5.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.6083F, -0.0366F, 1.4209F));

		PartDefinition cube_r31 = body6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 30).addBox(3.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.5576F, -0.2598F, 1.0827F));

		PartDefinition cube_r32 = body6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(73, 35).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.485F, 5.5008F, -0.4805F, -0.3903F, 0.8429F));

		PartDefinition cube_r33 = body6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(20, 63).addBox(0.0F, -2.4161F, -0.0338F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.9539F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(26, 49).addBox(0.0F, -3.0246F, -0.0282F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 2.9539F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftarm = body6.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8714F, 4.6703F, 4.0048F, -0.3489F, -0.1909F, -0.8742F));

		PartDefinition cube_r35 = leftarm.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0109F, 1.0204F, -0.2505F, -1.2567F, 0.0014F, -0.001F));

		PartDefinition cube_r36 = leftarm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(106, 58).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0085F, 1.8215F, 0.915F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition cube_r37 = leftarm.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(25, 107).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0065F, 5.0472F, 0.1149F, -1.6494F, 0.0014F, -0.001F));

		PartDefinition cube_r38 = leftarm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0053F, 4.8651F, 1.0982F, -2.9584F, 0.0014F, -0.001F));

		PartDefinition cube_r39 = leftarm.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 27).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0067F, 3.5248F, 0.9814F, 2.4957F, 0.0014F, -0.001F));

		PartDefinition cube_r40 = leftarm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(116, 55).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0079F, 2.8027F, 0.637F, 2.0158F, 0.0014F, -0.001F));

		PartDefinition cube_r41 = leftarm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(38, 76).addBox(-0.5F, -0.2F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0099F, 1.8426F, -0.0898F, 1.4922F, 0.0014F, -0.001F));

		PartDefinition cube_r42 = leftarm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(106, 77).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0078F, 3.8814F, -0.0298F, -0.1659F, 0.0014F, -0.001F));

		PartDefinition cube_r43 = leftarm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(19, 96).addBox(-0.011F, 1.0254F, 0.0689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5013F, 1.0619F, -1.2637F, 0.2268F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1618F, 5.6009F, 0.3221F, -0.057F, -0.0796F, 0.1357F));

		PartDefinition cube_r44 = leftarm2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(58, 93).addBox(0.2665F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 93).addBox(-0.4335F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.3177F, -1.5708F));

		PartDefinition cube_r45 = leftarm2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(107, 34).addBox(-0.95F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(107, 31).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1764F, 2.2901F, 0.5595F, -1.5708F, 1.0559F, 1.5708F));

		PartDefinition cube_r46 = leftarm2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(24, 97).addBox(-0.85F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.1764F, 1.7577F, 2.1836F, 1.5708F, -1.405F, -1.5708F));

		PartDefinition cube_r47 = leftarm2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(107, 37).addBox(-0.775F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 1.5223F, 2.7941F, -1.5708F, -0.2531F, 1.5708F));

		PartDefinition cube_r48 = leftarm2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 43).addBox(-0.175F, -1.35F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1764F, -0.4405F, 2.5116F, -1.5708F, 0.4451F, 1.5708F));

		PartDefinition cube_r49 = leftarm2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(76, 39).addBox(-0.8F, -1.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1764F, -0.3902F, 1.7431F, -1.5708F, 0.8814F, 1.5708F));

		PartDefinition cube_r50 = leftarm2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(20, 105).addBox(-0.75F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 2.3892F, -0.0323F, -1.5708F, -0.1658F, 1.5708F));

		PartDefinition cube_r51 = leftarm2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(107, 28).addBox(-0.15F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1764F, 1.91F, -0.3934F, -1.5708F, -0.6458F, 1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.7198F, 0.2813F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftArm3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, 0.0F, -4.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition rightarm = body6.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8715F, 4.6703F, 4.0048F, -0.2833F, 0.0457F, 0.7472F));

		PartDefinition cube_r53 = rightarm.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(102, 46).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0109F, 1.0204F, -0.2505F, -1.2567F, -0.0014F, 0.001F));

		PartDefinition cube_r54 = rightarm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 115).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0085F, 1.8215F, 0.915F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition cube_r55 = rightarm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(110, 114).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0065F, 5.0472F, 0.1149F, -1.6494F, -0.0014F, 0.001F));

		PartDefinition cube_r56 = rightarm.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(105, 114).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0053F, 4.8651F, 1.0982F, -2.9584F, -0.0014F, 0.001F));

		PartDefinition cube_r57 = rightarm.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 31).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0067F, 3.5248F, 0.9814F, 2.4957F, -0.0014F, 0.001F));

		PartDefinition cube_r58 = rightarm.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(116, 58).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0079F, 2.8027F, 0.637F, 2.0158F, -0.0014F, 0.001F));

		PartDefinition cube_r59 = rightarm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -0.2F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0099F, 1.8426F, -0.0898F, 1.4922F, -0.0014F, 0.001F));

		PartDefinition cube_r60 = rightarm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(100, 114).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0078F, 3.8814F, -0.0298F, -0.1659F, -0.0014F, 0.001F));

		PartDefinition cube_r61 = rightarm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(102, 101).addBox(-0.989F, 1.0254F, 0.0689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5013F, 1.0619F, -1.2637F, 0.2268F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1618F, 5.6009F, 0.3221F, -0.0573F, 0.0821F, -0.0921F));

		PartDefinition cube_r62 = rightarm2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(94, 0).addBox(-1.2665F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(93, 93).addBox(-0.5665F, -0.4622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.3177F, 1.5708F));

		PartDefinition cube_r63 = rightarm2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(115, 114).addBox(-0.05F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(115, 24).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1764F, 2.2901F, 0.5595F, -1.5708F, -1.0559F, -1.5708F));

		PartDefinition cube_r64 = rightarm2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(103, 4).addBox(-0.15F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.1764F, 1.7577F, 2.1836F, 1.5708F, 1.405F, 1.5708F));

		PartDefinition cube_r65 = rightarm2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(40, 115).addBox(-0.225F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 1.5223F, 2.7941F, -1.5708F, 0.2531F, -1.5708F));

		PartDefinition cube_r66 = rightarm2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(69, 89).addBox(-1.825F, -1.35F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1764F, -0.4405F, 2.5116F, -1.5708F, -0.4451F, -1.5708F));

		PartDefinition cube_r67 = rightarm2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(87, 59).addBox(-1.2F, -1.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1764F, -0.3902F, 1.7431F, -1.5708F, -0.8814F, -1.5708F));

		PartDefinition cube_r68 = rightarm2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(31, 105).addBox(-0.25F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 2.3892F, -0.0323F, -1.5708F, 0.1658F, -1.5708F));

		PartDefinition cube_r69 = rightarm2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 115).addBox(-0.85F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1764F, 1.91F, -0.3934F, -1.5708F, 0.6458F, -1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 2.7198F, 0.2813F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightArm3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(13, 10).addBox(0.0F, -4.0F, -3.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8976F, 2.7448F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone2 = body6.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0829F, 3.6662F, 2.7884F, -0.1096F, -0.0293F, -0.2602F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(71, 51).addBox(-0.0968F, -0.2651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, 0.2429F, -0.0456F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(48, 93).addBox(-0.0968F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, 0.2429F, -0.0456F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(13, 63).addBox(-0.5F, -2.5F, -0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.56F, -1.1183F, 0.787F, -0.6835F, 0.2429F, -0.0456F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(5, 106).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0995F, -0.1461F, 2.7835F, -2.7255F, 0.2429F, -0.0456F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(24, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.5602F, -0.4748F, 4.7017F, -2.9873F, 0.2429F, -0.0456F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(102, 105).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5986F, -2.053F, 5.1466F, 1.9433F, 0.2429F, -0.0456F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(97, 105).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(92, 105).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2745F, -2.9762F, 4.0097F, 0.8961F, 0.2429F, -0.0456F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(87, 105).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0453F, -3.4837F, 3.179F, -0.5438F, 0.2429F, -0.0456F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 105).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8031F, -3.7929F, 2.2594F, -1.8965F, 0.2429F, -0.0456F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(96, 79).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5594F, -3.8892F, 1.2944F, 3.0341F, 0.2429F, -0.0456F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(60, 64).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3203F, -3.8549F, 0.324F, 1.5942F, 0.2429F, -0.0456F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(38, 90).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0938F, -3.6477F, -0.6277F, 0.1979F, 0.2429F, -0.0456F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(64, 59).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1075F, -3.2339F, -1.5156F, -1.1547F, 0.2429F, -0.0456F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.274F, -2.6331F, -2.2974F, -2.5073F, 0.2429F, -0.0456F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(26, 103).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0023F, 1.8304F, -2.0043F, -0.7009F, 0.2429F, -0.0456F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(106, 55).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 106).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2428F, 0.1808F, -2.6889F, -0.186F, 0.2429F, -0.0456F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(55, 116).addBox(-0.5F, -0.075F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0551F, 0.0814F, -1.9139F, 0.2067F, 0.2429F, -0.0456F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(50, 116).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0617F, -0.5129F, -1.8313F, 1.4284F, 0.2429F, -0.0456F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 69).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1181F, -1.0981F, -1.9508F, 1.7775F, 0.2429F, -0.0456F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1582F, -1.2395F, -2.0865F, 2.3447F, 0.2429F, -0.0456F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(56, 14).addBox(-0.0968F, -0.2038F, -0.6103F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.5105F, 0.2429F, -0.0456F));

		PartDefinition bone3 = body6.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0829F, 3.6662F, 2.7884F, -0.1096F, 0.0293F, 0.2602F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-0.9032F, -0.2651F, -1.8363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8473F, -0.2429F, 0.0456F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 93).mirror().addBox(-0.9032F, -0.3844F, 0.5673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0028F, -0.2429F, 0.0456F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(13, 63).mirror().addBox(-0.5F, -2.5F, -0.2F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.56F, -1.1183F, 0.787F, -0.6835F, -0.2429F, 0.0456F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0995F, -0.1461F, 2.7835F, -2.7255F, -0.2429F, 0.0456F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(24, 62).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.5602F, -0.4748F, 4.7017F, -2.9873F, -0.2429F, 0.0456F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(102, 105).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5986F, -2.053F, 5.1466F, 1.9433F, -0.2429F, 0.0456F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(97, 105).mirror().addBox(-0.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(92, 105).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2745F, -2.9762F, 4.0097F, 0.8961F, -0.2429F, 0.0456F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(87, 105).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0453F, -3.4837F, 3.179F, -0.5438F, -0.2429F, 0.0456F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(82, 105).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8032F, -3.7929F, 2.2594F, -1.8965F, -0.2429F, 0.0456F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(96, 79).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5594F, -3.8892F, 1.2944F, 3.0341F, -0.2429F, 0.0456F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(60, 64).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3203F, -3.8549F, 0.324F, 1.5942F, -0.2429F, 0.0456F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(38, 90).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0938F, -3.6477F, -0.6277F, 0.1979F, -0.2429F, 0.0456F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(64, 59).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1075F, -3.2339F, -1.5156F, -1.1547F, -0.2429F, 0.0456F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.274F, -2.6331F, -2.2974F, -2.5073F, -0.2429F, 0.0456F));

		PartDefinition cube_r106 = bone3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(26, 103).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0023F, 1.8304F, -2.0043F, -0.7009F, -0.2429F, 0.0456F));

		PartDefinition cube_r107 = bone3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(106, 55).mirror().addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 106).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2428F, 0.1808F, -2.6889F, -0.186F, -0.2429F, 0.0456F));

		PartDefinition cube_r108 = bone3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(55, 116).mirror().addBox(-0.5F, -0.075F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0551F, 0.0814F, -1.9139F, 0.2067F, -0.2429F, 0.0456F));

		PartDefinition cube_r109 = bone3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(50, 116).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0617F, -0.5129F, -1.8313F, 1.4284F, -0.2429F, 0.0456F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.118F, -1.0981F, -1.9508F, 1.7775F, -0.2429F, 0.0456F));

		PartDefinition cube_r111 = bone3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1582F, -1.2395F, -2.0865F, 2.3447F, -0.2429F, 0.0456F));

		PartDefinition cube_r112 = bone3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 14).mirror().addBox(-0.9032F, -0.2038F, -0.6103F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.5105F, -0.2429F, 0.0456F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5957F, 5.8766F, -0.3586F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(53, 105).addBox(0.0F, -2.777F, -0.2081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5296F, 1.1014F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(50, 105).addBox(0.0F, -2.604F, 0.038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.996F, 4.843F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(78, 21).mirror().addBox(-1.9081F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, 0.1044F, 0.1176F, 0.0489F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-6.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.3456F, 0.5282F, -0.9666F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-10.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.5209F, 0.3571F, -1.3698F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 74).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4206F, 1.4356F, -0.1851F, 0.5974F, -0.6676F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(-1.9081F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.7206F, 3.4356F, 0.1567F, 0.1113F, 0.0199F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(74, 63).mirror().addBox(-4.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.1331F, 0.6277F, -0.6728F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(-6.6854F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.3086F, 0.5698F, -0.9824F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(66, 57).mirror().addBox(-9.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6206F, 3.4356F, -0.5076F, 0.4079F, -1.4F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(14, 82).mirror().addBox(-1.0206F, 0.2035F, -0.4011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9206F, 5.4356F, 0.1654F, 0.1102F, 0.0034F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(74, 67).mirror().addBox(-2.8454F, -0.0194F, -0.3168F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.6456F, 5.5356F, -0.1246F, 0.6331F, -0.5806F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-5.7435F, -0.7552F, -0.3168F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.6456F, 5.5356F, -0.3028F, 0.577F, -0.892F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(64, 5).mirror().addBox(-8.9918F, -2.9393F, -0.3168F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.6456F, 5.5356F, -0.506F, 0.4164F, -1.3121F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 5).addBox(4.9918F, -2.9393F, -0.3168F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.6456F, 5.5356F, -0.506F, -0.4164F, 1.3121F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(74, 69).addBox(2.7435F, -0.7552F, -0.3168F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.6456F, 5.5356F, -0.3028F, -0.577F, 0.892F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(74, 67).addBox(-0.1546F, -0.0194F, -0.3168F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.6456F, 5.5356F, -0.1246F, -0.6331F, 0.5806F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(14, 82).addBox(0.0206F, 0.2035F, -0.4011F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.9206F, 5.4356F, 0.1654F, -0.1102F, -0.0034F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(66, 57).addBox(5.3587F, -4.4854F, -1.3519F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.5076F, -0.4079F, 1.4F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(74, 65).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.3086F, -0.5698F, 0.9824F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(74, 63).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6206F, 3.4356F, -0.1331F, -0.6277F, 0.6728F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 87).addBox(-0.0919F, 0.0986F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7206F, 3.4356F, 0.1567F, -0.1113F, -0.0199F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(53, 74).addBox(1.0865F, -1.0119F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.1851F, -0.5974F, 0.6676F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 63).addBox(5.3587F, -4.4854F, -1.3519F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.5209F, -0.3571F, 1.3698F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 32).addBox(3.6853F, -2.035F, -1.3519F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, -0.3456F, -0.5282F, 0.9666F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(78, 21).addBox(-0.0919F, -0.0014F, -0.5165F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4206F, 1.4356F, 0.1044F, -0.1176F, -0.0489F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(47, 105).addBox(0.0F, -2.7188F, -0.3713F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.796F, 3.243F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, -0.0425F, -0.0704F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3017F, 6.1651F, 0.0263F, -0.0436F, -0.0011F));

		PartDefinition cube_r141 = body5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(97, 27).addBox(0.0F, -3.0F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2233F, 6.8212F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(3, 96).addBox(0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(59, 105).addBox(0.0F, -2.9F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 2.8F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(56, 105).addBox(0.0F, -2.8097F, -0.0421F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.7F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r145 = body5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(85, 27).mirror().addBox(-1.2F, 0.5F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 12).mirror().addBox(-2.1F, 0.5F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 5).mirror().addBox(-3.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 47).mirror().addBox(-3.3F, 0.5F, 7.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 47).addBox(0.3F, 0.5F, 7.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 5).addBox(0.3F, 0.5F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 12).addBox(0.1F, 0.5F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 27).addBox(0.2F, 0.5F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -0.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(-3.0327F, -0.1907F, -0.4768F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7811F, 0.9705F, -0.0373F, 0.6865F, -0.6317F));

		PartDefinition cube_r147 = body5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-5.88F, -0.9691F, -0.4768F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7811F, 0.9705F, -0.2434F, 0.6495F, -0.9625F));

		PartDefinition cube_r148 = body5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-8.0339F, -3.1896F, -0.4768F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7811F, 0.9705F, -0.4907F, 0.5026F, -1.41F));

		PartDefinition cube_r149 = body5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(76, 27).addBox(0.0327F, -0.1907F, -0.4768F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.7811F, 0.9705F, -0.0373F, -0.6865F, 0.6317F));

		PartDefinition cube_r150 = body5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(76, 37).addBox(2.88F, -0.9691F, -0.4768F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.7811F, 0.9705F, -0.2434F, -0.6495F, 0.9625F));

		PartDefinition cube_r151 = body5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(69, 21).addBox(5.0339F, -3.1896F, -0.4768F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.7811F, 0.9705F, -0.4907F, -0.5026F, 1.41F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2866F, 7.8023F, -0.1726F, -0.0505F, -0.0354F));

		PartDefinition cube_r152 = body4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(29, 97).addBox(0.0F, -3.3575F, -0.0873F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2244F, 4.929F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(24, 90).addBox(0.0F, -3.1575F, -0.0873F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 2.8896F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r154 = body4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(10, 90).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0002F, 0.7896F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(29, 75).mirror().addBox(-3.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 71).mirror().addBox(-3.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 49).mirror().addBox(-3.5F, 0.375F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 49).addBox(0.5F, 0.375F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 71).addBox(0.5F, 0.375F, -2.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 75).addBox(0.5F, 0.375F, -4.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(-0.5F, -0.125F, -5.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1998F, 5.0896F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, -0.1187F, -0.0502F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(75, 73).addBox(0.3F, 0.3813F, -0.0502F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 75).addBox(0.0F, 0.3813F, 1.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 15).addBox(-0.2F, 0.3813F, 3.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 15).mirror().addBox(-2.8F, 0.3813F, 3.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 75).mirror().addBox(-3.0F, 0.3813F, 1.9498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 73).mirror().addBox(-3.3F, 0.3813F, -0.0502F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 4).addBox(0.0F, 0.4063F, 5.0498F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3504F, 6.8384F, 0.0713F, 0.0031F, -0.0435F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(16, 94).addBox(0.0F, -3.6F, -0.95F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, 4.8998F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(13, 94).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, 1.8998F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(79, 93).addBox(0.0F, -3.4F, -0.05F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0063F, -0.0002F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-0.3F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.8813F, 3.9498F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(40, 64).addBox(-0.7F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.8813F, 3.9498F, 0.0F, 0.1309F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2669F, 6.032F, 0.2437F, -0.064F, -0.1055F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(85, 95).addBox(0.0F, -3.1945F, -0.1045F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6154F, 3.9881F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(82, 95).addBox(0.0F, -3.2298F, -1.043F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3153F, 2.9582F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(117, 38).addBox(0.0F, 1.0004F, 3.5072F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 117).addBox(0.0F, 0.8004F, 1.8072F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 35).addBox(0.0F, 0.7004F, -0.1928F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1743F, 0.9635F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, -3.2996F, -0.9928F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1743F, 0.9635F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(94, 58).mirror().addBox(-2.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 60).mirror().addBox(-2.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 95).mirror().addBox(-2.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 95).addBox(0.0F, 1.2738F, 12.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 60).addBox(0.3F, 1.2738F, 10.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 58).addBox(0.5F, 1.2738F, 8.7474F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 41).addBox(-0.5F, 0.7738F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9537F, -8.4029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9579F, 4.9196F, 0.4503F, -0.0786F, -0.0379F));

		PartDefinition cube_r166 = hips.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(68, 105).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1431F, 4.4359F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r167 = hips.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(65, 105).addBox(0.0F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5033F, 3.0471F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r168 = hips.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(117, 31).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7641F, 3.6532F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r169 = hips.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(48, 82).addBox(0.0F, -0.2F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 70).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5064F, 0.751F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r170 = hips.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(62, 105).addBox(0.0F, -2.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5136F, 1.2246F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r171 = hips.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(34, 95).mirror().addBox(-1.8F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 37).mirror().addBox(-1.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 89).mirror().addBox(-1.6F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 89).addBox(-0.4F, 0.3835F, 2.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 37).addBox(0.4F, 0.3835F, 4.9993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 95).addBox(-0.2F, 0.3835F, 0.9993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 25).addBox(-0.5F, -0.1165F, -0.0007F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.175F, -0.025F, -0.4843F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(65, 116).addBox(0.0F, -2.5122F, 0.849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 110).addBox(0.0F, -2.2122F, 2.849F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9536F, 5.1845F, -0.449F, -0.0787F, 0.0378F));

		PartDefinition cube_r172 = tail.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(33, 117).addBox(0.0F, -0.6F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 11).addBox(0.0F, -0.8F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 116).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2878F, 0.449F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(86, 79).mirror().addBox(-1.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 116).mirror().addBox(-1.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 116).addBox(0.1F, -0.475F, 2.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 79).addBox(0.3F, -0.475F, 0.975F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5128F, -0.026F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(10, 117).addBox(0.0F, -1.7976F, -0.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 117).addBox(0.0F, -1.6976F, 1.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2646F, 4.8704F, 0.1405F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(116, 76).mirror().addBox(-1.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 27).mirror().addBox(-0.8F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(117, 27).addBox(-0.2F, -0.5F, 2.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 76).addBox(0.0F, -0.5F, 0.025F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 25).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.4973F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(117, 44).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 41).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4024F, 0.4786F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2304F, 5.8944F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(17, 33).addBox(-0.5F, -0.55F, 0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4805F, -2.1145F, 0.4208F, 0.155F, -0.0264F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(79, 105).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3581F, -2.1889F, -1.1039F, -0.3035F, -0.7363F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(76, 105).mirror().addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3581F, -2.1889F, -0.3431F, -0.2751F, -0.6502F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 105).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3581F, -2.1889F, -1.1039F, 0.3035F, 0.7363F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(76, 105).addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3581F, -2.1889F, -0.3431F, 0.2751F, 0.6502F));

		PartDefinition cube_r181 = neck2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(117, 61).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3581F, -2.1889F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition cube_r182 = neck2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(71, 105).addBox(-0.5F, 0.45F, 4.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4781F, -1.1117F, -0.7614F, -0.0188F, -0.1219F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(65, 27).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.518F, -2.4485F, 2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(65, 24).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.5965F, -3.4454F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(112, 28).addBox(-0.1F, -0.275F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 112).addBox(-0.1F, -0.35F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 112).addBox(-0.075F, -0.375F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(102, 42).addBox(-0.1F, -0.55F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(104, 0).addBox(-0.125F, -0.65F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6911F, 10.2095F, -15.7166F, -2.6609F, -0.2118F, 0.3591F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(42, 102).addBox(0.5374F, -1.5174F, 0.8446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(102, 38).addBox(0.4625F, -1.5674F, 1.3446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(102, 34).addBox(0.4625F, -1.6174F, 1.8446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(102, 30).addBox(0.4625F, -1.7174F, 2.3446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1F, 7.6301F, -13.347F, -2.6897F, -0.2927F, 0.3059F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(108, 89).addBox(-0.65F, -0.375F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(87, 108).addBox(-0.65F, -0.45F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(108, 83).addBox(-0.65F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 18).addBox(-0.675F, -0.55F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(103, 69).addBox(-0.675F, -0.65F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6911F, 10.2095F, -15.7166F, -2.6609F, 0.2118F, -0.3591F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(99, 14).addBox(-1.2624F, -1.5174F, 0.8446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(99, 0).addBox(-1.2624F, -1.5674F, 1.3446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 97).addBox(-1.2624F, -1.6174F, 1.8446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 93).addBox(-1.2624F, -1.7174F, 2.3446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 74).addBox(-1.2624F, -1.8174F, 2.8446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1F, 7.6301F, -13.347F, -2.6897F, 0.2927F, -0.3059F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 70).addBox(-1.2624F, -2.0625F, 3.3058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 66).addBox(-1.2624F, -2.1375F, 3.8058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1F, 7.6301F, -13.347F, -2.7334F, 0.2927F, -0.3059F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(98, 83).addBox(-0.7198F, -0.8365F, -0.4171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(42, 98).addBox(-0.8198F, -0.8365F, 0.0829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(103, 65).addBox(-0.8448F, -0.9365F, 0.5829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(88, 93).addBox(-0.8448F, -1.0365F, 1.0829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 11.0457F, -16.798F, -2.7678F, 0.2655F, -0.3235F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(93, 75).addBox(-0.8698F, -1.4419F, 1.5516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 93).addBox(-0.8948F, -1.5669F, 2.0516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 7).addBox(-0.8948F, -1.6669F, 2.5516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(69, 93).addBox(-0.8698F, -1.8169F, 3.0516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 11.0457F, -16.798F, -2.8987F, 0.2655F, -0.3235F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(6, 98).addBox(-0.9198F, -2.3234F, 3.4669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 11.0457F, -16.798F, -2.986F, 0.2655F, -0.3235F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(93, 97).addBox(-0.656F, -0.8518F, -0.2311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(88, 97).addBox(-0.681F, -1.0518F, 0.2689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(73, 97).addBox(-0.681F, -1.1518F, 0.7689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 13.6411F, -20.4741F, -3.0039F, 0.3199F, -0.2884F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(68, 97).addBox(-0.681F, -1.507F, 1.2611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 97).addBox(-0.681F, -1.707F, 1.7611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 62).addBox(-0.681F, -1.907F, 2.2611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(58, 97).addBox(-0.681F, -2.157F, 2.7611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(53, 97).addBox(-0.656F, -2.357F, 3.2611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 13.6411F, -20.4741F, -3.0476F, 0.3199F, -0.2884F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(48, 97).addBox(-0.6005F, -0.5688F, -0.4294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 45).addBox(-0.6005F, -0.8688F, 0.0706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 41).addBox(-0.6343F, -1.0688F, 0.5794F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -3.0579F, 0.3542F, -0.2666F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(97, 37).addBox(-0.7624F, -1.3688F, 1.0837F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(37, 97).addBox(-0.8185F, -1.4938F, 1.5905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -3.0592F, 0.3107F, -0.2705F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(97, 33).addBox(-1.0999F, -1.6688F, 2.0657F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(82, 108).addBox(-1.2249F, -1.8938F, 2.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(108, 80).addBox(-1.325F, -2.1188F, 3.0657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(108, 73).addBox(-1.425F, -2.3188F, 3.5657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -3.0611F, 0.2237F, -0.2778F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(5, 102).addBox(-0.5001F, -0.9203F, -1.2148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1586F, 10.5929F, -16.2488F, -2.6806F, -0.2655F, 0.3235F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5001F, -0.9892F, -0.7107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 101).addBox(-0.5001F, -1.0642F, -0.2107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1586F, 10.5929F, -16.2488F, -2.7242F, -0.2655F, 0.3235F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(92, 101).addBox(-0.396F, -1.067F, 0.2088F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1586F, 10.5929F, -16.2488F, -2.7155F, -0.1326F, 0.4139F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(87, 101).addBox(-1.0955F, -1.2365F, 0.0359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(82, 101).addBox(-1.0705F, -1.3365F, 0.5359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(103, 95).addBox(-1.0705F, -1.4365F, 1.0359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 11.0457F, -16.798F, -2.7268F, -0.1588F, 0.3954F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(103, 91).addBox(-1.0455F, -1.8324F, 1.4527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(103, 82).addBox(-1.0205F, -1.9574F, 1.9527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(103, 73).addBox(-1.0205F, -2.0574F, 2.4527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 78).addBox(-1.0455F, -2.2074F, 2.9527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 11.0457F, -16.798F, -2.8577F, -0.1588F, 0.3954F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(77, 101).addBox(-0.9955F, -2.7037F, 3.3344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 11.0457F, -16.798F, -2.945F, -0.1588F, 0.3954F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(72, 101).addBox(-0.9209F, -1.0916F, -0.3146F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(67, 101).addBox(-0.8959F, -1.2916F, 0.1854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 101).addBox(-0.8959F, -1.3916F, 0.6854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 13.6411F, -20.4741F, -2.9218F, -0.1066F, 0.4327F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(101, 57).addBox(-0.8959F, -1.7429F, 1.1672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(57, 101).addBox(-0.8959F, -1.9429F, 1.6672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(52, 101).addBox(-0.8959F, -2.1429F, 2.1672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(47, 101).addBox(-0.8959F, -2.3929F, 2.6672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(37, 101).addBox(-0.9209F, -2.5929F, 3.1672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 13.6411F, -20.4741F, -2.9655F, -0.1066F, 0.4327F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(32, 101).addBox(-1.0857F, -0.8391F, -0.537F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(21, 101).addBox(-1.0607F, -1.1391F, -0.037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(100, 26).addBox(-1.0268F, -1.3391F, 0.4718F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -2.9501F, -0.0744F, 0.4564F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(16, 100).addBox(-0.9278F, -1.6391F, 1.005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(11, 100).addBox(-0.8717F, -1.7641F, 1.5118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -2.9505F, -0.0316F, 0.4647F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(99, 53).addBox(-0.5696F, -1.9391F, 2.0453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 111).addBox(-0.4446F, -2.1641F, 2.5453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(106, 111).addBox(-0.3696F, -2.3891F, 3.0453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(101, 111).addBox(-0.2696F, -2.5891F, 3.5453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -2.9503F, 0.0541F, 0.4813F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(107, 43).addBox(-0.8612F, 0.0311F, 4.0894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -2.4617F, 0.1494F, 0.1065F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.6F, -5.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 7.7701F, -12.2035F, -2.5351F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(41, 8).addBox(-1.0F, 0.3F, -7.7F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.304F))
				.texOffs(56, 7).addBox(-0.5F, -0.7F, -2.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.298F))
				.texOffs(0, 25).addBox(-1.0F, -0.7F, -7.7F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 4.9232F, -7.6138F, -2.6922F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.6F, -5.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 7.7701F, -12.2035F, -2.6049F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(32, 33).addBox(-0.5F, -0.325F, -15.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 16.2212F, -24.3564F, -2.5525F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 41).addBox(-0.8151F, -0.3127F, -1.0625F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 13.6411F, -20.4741F, -2.5479F, 0.1139F, 0.0809F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(53, 38).addBox(-0.8151F, -0.3127F, -4.6624F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0556F, 13.4212F, -20.1447F, -2.5517F, 0.0415F, 0.0321F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(51, 0).addBox(-0.8612F, -0.1935F, -0.3037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 16.2942F, -24.2319F, -2.514F, 0.1494F, 0.1065F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(40, 55).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6658F, 15.7088F, -24.6692F, -2.4595F, 0.1664F, 0.1204F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(13, 49).addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.2558F, 15.6457F, -24.5799F, -2.4632F, 0.1358F, 0.0954F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 49).addBox(-0.8151F, -0.1285F, -0.1212F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 13.6411F, -20.4741F, -2.5348F, 0.1139F, 0.0809F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 45).addBox(-1.0F, -0.2257F, -0.1977F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 11.0457F, -16.798F, -2.547F, 0.057F, 0.0403F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 56).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3995F, 10.4474F, -17.2246F, -2.5116F, 0.0676F, 0.048F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 48).addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3985F, 10.4152F, -17.179F, -2.5126F, 0.0429F, 0.03F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(53, 52).addBox(-0.5F, -0.075F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1045F)), PartPose.offsetAndRotation(0.0F, 8.4391F, -12.7592F, -2.5482F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(47, 31).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 8.2773F, -12.8768F, -2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(47, 24).addBox(-0.35F, 0.0F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 8.4978F, -12.8401F, -2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(65, 30).addBox(-1.0F, -0.1F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 4.8641F, -7.9425F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(60, 76).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0381F, -4.525F, -0.7414F, -0.0023F, -0.0044F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(107, 40).addBox(-0.5F, -0.1F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.2701F, -4.8394F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(13, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.17F, -4.8472F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(88, 89).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, -1.8833F, -4.1463F, 0.4061F, -0.7029F, 0.9837F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(83, 63).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, -1.8833F, -4.1463F, 0.4061F, 0.7029F, -0.9837F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(53, 59).addBox(-1.5F, -0.55F, -1.4F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.7831F, -3.4737F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(50, 90).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.8034F, -0.3588F, -2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(90, 44).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8374F, -0.0607F, -1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(43, 90).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.4997F, 0.3997F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(90, 41).addBox(-1.0F, 0.875F, 0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.442F, -1.9136F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(56, 20).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.3791F, -0.8544F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(49, 64).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.0675F, -1.5798F, 0.8116F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(2.8F, 1.8933F, -5.1002F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(91, 55).addBox(-0.9078F, -1.1373F, 1.249F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 1.4284F, 0.1304F, -0.088F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(77, 55).addBox(-0.9078F, 1.1847F, 0.9775F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 2.5193F, 0.1304F, -0.088F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(90, 66).addBox(-0.9078F, 1.658F, -1.3501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -2.7604F, 0.1304F, -0.088F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(90, 63).addBox(-0.9078F, -1.268F, -2.1064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -1.2332F, 0.1304F, -0.088F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(29, 77).addBox(-0.9078F, -1.7506F, -1.4657F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(79, 11).addBox(0.0922F, -1.9535F, 0.5789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.7532F, 0.1304F, -0.088F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(5, 77).addBox(-0.9078F, -1.9713F, -1.6633F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.5351F, 0.1304F, -0.088F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(65, 76).addBox(-0.9078F, -0.5983F, -1.6175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.9278F, 0.1304F, -0.088F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(92, 52).addBox(-0.9078F, 1.2526F, -1.0497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -1.3205F, 0.1304F, -0.088F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(86, 12).addBox(-0.7325F, 1.0002F, 0.9607F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -2.3105F, 0.2228F, -0.0182F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(91, 69).addBox(-0.7325F, -0.9527F, 1.7059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 90).addBox(-0.7325F, -0.5527F, 1.7059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -3.0086F, 0.2228F, -0.0182F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(10, 104).addBox(0.5837F, -0.1705F, 1.5058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -2.5057F, 0.3557F, 0.6539F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(63, 69).addBox(0.1954F, -7.1246F, -1.6621F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.6759F, -0.326F, -1.2182F, 1.8668F, -0.5933F, 1.2488F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 44).addBox(-0.8F, -4.8F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5816F, 4.4624F, -6.2067F, 2.1968F, -0.1517F, 0.3103F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(69, 64).addBox(-0.8F, -4.8F, -0.55F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.9476F, 7.3765F, -9.7471F, 2.1914F, -0.0972F, 0.3543F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(41, 69).addBox(-0.6793F, -7.1246F, -1.6184F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.6759F, -0.326F, -1.2182F, 2.2158F, -0.1228F, 0.3388F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(69, 15).addBox(-0.5619F, -1.5F, -1.3908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.6172F, 1.0071F, -1.6696F, 2.2441F, -0.6661F, 0.9048F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(33, 90).addBox(-0.1904F, -1.5F, -0.2538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.6172F, 1.0071F, -1.6696F, 2.4735F, -0.1247F, 0.3435F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(32, 97).addBox(0.5837F, -1.4193F, 1.9977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -2.9857F, 0.3557F, 0.6539F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(107, 99).addBox(0.2675F, -2.4493F, 0.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 2.271F, 0.2228F, -0.0182F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(107, 86).addBox(0.2675F, -2.4331F, -0.7809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 1.6165F, 0.2228F, -0.0182F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(107, 61).addBox(0.0922F, -1.3984F, -1.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.643F, 0.1304F, -0.088F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(107, 102).addBox(0.0922F, -1.0431F, -1.1302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.1194F, 0.1304F, -0.088F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(30, 108).addBox(0.0922F, -0.8965F, -0.5933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(79, 7).addBox(0.0922F, -1.0965F, -0.5933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.3605F, 0.1304F, -0.088F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(20, 108).addBox(0.0922F, -1.112F, 0.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.4249F, 0.1304F, -0.088F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(73, 59).addBox(0.0922F, 1.0331F, -2.2202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 2.3447F, 0.1304F, -0.088F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(35, 108).addBox(0.0922F, 0.0658F, 0.8696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 1.027F, 0.1304F, -0.088F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(108, 70).addBox(0.0922F, -0.9627F, 0.5272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(10, 108).addBox(0.0922F, -1.3627F, 0.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.1107F, 0.1304F, -0.088F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(71, 108).addBox(0.0922F, -3.1297F, -0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -1.8004F, 0.1304F, -0.088F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(108, 67).addBox(0.0922F, -0.6662F, 1.5711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(108, 64).addBox(0.0922F, -0.6662F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.1424F, 0.1304F, -0.088F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(78, 51).addBox(0.0922F, -0.4963F, -0.4789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(107, 105).addBox(0.0922F, -0.467F, -1.1741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 46).addBox(0.0922F, -0.467F, -1.6491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.0987F, 0.1304F, -0.088F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(93, 7).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4349F, -0.3136F, -1.41F, -0.6424F, -0.1407F, 0.2574F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(12, 78).addBox(-2.4167F, 0.4484F, -1.2494F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.7646F, -0.1407F, 0.2574F));

		PartDefinition cube_r272 = leftOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(72, 77).addBox(-2.6363F, -1.7559F, -1.1298F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, -0.6217F, -0.3737F, 0.1313F));

		PartDefinition cube_r273 = leftOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(45, 78).addBox(-0.5516F, -2.0926F, 1.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.8296F, -0.1516F, 0.052F));

		PartDefinition cube_r274 = leftOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(108, 7).addBox(-0.6129F, -2.2017F, -0.7608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.0322F, -0.1544F, 0.0329F));

		PartDefinition cube_r275 = leftOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(53, 76).addBox(-1.4423F, 2.3166F, -0.6488F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 1.4712F, 0.2148F, -0.1787F));

		PartDefinition cube_r276 = leftOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(90, 38).addBox(-1.4423F, 1.9805F, 1.5227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.8167F, 0.2148F, -0.1787F));

		PartDefinition cube_r277 = leftOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(68, 71).addBox(-1.8423F, -2.2357F, 2.0886F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.2284F, 0.4172F, -0.7874F));

		PartDefinition cube_r278 = leftOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 9).addBox(-1.4423F, -2.2357F, 2.0886F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.424F, 0.2148F, -0.1787F));

		PartDefinition cube_r279 = leftOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(108, 4).addBox(-1.6629F, -2.1187F, -0.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2433F, -0.6694F, 1.4997F, 0.0318F, -0.003F, 0.2124F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-2.8F, 1.8933F, -5.1002F));

		PartDefinition cube_r280 = rightOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(92, 24).addBox(-1.0922F, -1.1373F, 1.249F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 1.4284F, -0.1304F, 0.088F));

		PartDefinition cube_r281 = rightOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(85, 47).addBox(-1.0922F, 1.1847F, 0.9775F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 2.5193F, -0.1304F, 0.088F));

		PartDefinition cube_r282 = rightOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(92, 21).addBox(-1.0922F, 1.658F, -1.3501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -2.7604F, -0.1304F, 0.088F));

		PartDefinition cube_r283 = rightOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(92, 18).addBox(-1.0922F, -1.268F, -2.1064F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -1.2332F, -0.1304F, 0.088F));

		PartDefinition cube_r284 = rightOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(29, 85).addBox(-1.0922F, -1.7506F, -1.4657F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(0, 85).addBox(-1.0922F, -1.9535F, 0.5789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.7532F, -0.1304F, 0.088F));

		PartDefinition cube_r285 = rightOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(85, 23).addBox(-1.0922F, -1.9713F, -1.6633F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.5351F, -0.1304F, 0.088F));

		PartDefinition cube_r286 = rightOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(85, 19).addBox(-1.0922F, -0.5983F, -1.6175F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.9278F, -0.1304F, 0.088F));

		PartDefinition cube_r287 = rightOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(93, 4).addBox(-1.0922F, 1.2526F, -1.0497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -1.3205F, -0.1304F, 0.088F));

		PartDefinition cube_r288 = rightOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(90, 35).addBox(-1.2675F, 1.0002F, 0.9607F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -2.3105F, -0.2228F, 0.0182F));

		PartDefinition cube_r289 = rightOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(92, 15).addBox(-1.2675F, -0.9527F, 1.7059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 84).addBox(-1.2675F, -0.5527F, 1.7059F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -3.0086F, -0.2228F, 0.0182F));

		PartDefinition cube_r290 = rightOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(104, 12).addBox(-1.5837F, -0.1705F, 1.5058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -2.5057F, -0.3557F, -0.6539F));

		PartDefinition cube_r291 = rightOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(71, 37).addBox(-0.4698F, -2.5F, -0.6459F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.1322F, 3.168F, -4.2343F, 1.8668F, 0.5933F, -1.2924F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(12, 70).addBox(-0.175F, -4.6F, -0.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.8782F, 4.4879F, -6.4102F, 2.204F, 0.1276F, -0.3314F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(7, 70).addBox(-0.6368F, -2.5F, -0.4411F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.1322F, 3.168F, -4.2343F, 2.2158F, 0.1228F, -0.3825F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(34, 69).addBox(-0.4381F, -1.5F, -1.3907F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.7172F, 0.8821F, -1.5196F, 2.2519F, 0.6616F, -0.9869F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(64, 92).addBox(-0.8096F, -1.5F, -0.2538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.7172F, 0.8821F, -1.5196F, 2.4764F, 0.1176F, -0.4301F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(102, 61).addBox(-1.5837F, -1.4193F, 1.9977F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -2.9857F, -0.3557F, -0.6539F));

		PartDefinition cube_r297 = rightOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(113, 6).addBox(-1.2675F, -2.4493F, 0.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 2.271F, -0.2228F, 0.0182F));

		PartDefinition cube_r298 = rightOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(113, 3).addBox(-1.2675F, -2.4331F, -0.7809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 1.6165F, -0.2228F, 0.0182F));

		PartDefinition cube_r299 = rightOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(112, 107).addBox(-1.0922F, -1.3984F, -1.9459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.643F, -0.1304F, 0.088F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(112, 104).addBox(-1.0922F, -1.0431F, -1.1302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.1194F, -0.1304F, 0.088F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(112, 101).addBox(-1.0922F, -0.8965F, -0.5933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(85, 15).addBox(-1.0922F, -1.0965F, -0.5933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.3605F, -0.1304F, 0.088F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(112, 98).addBox(-1.0922F, -1.112F, 0.1558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.4249F, -0.1304F, 0.088F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(17, 74).addBox(-1.0922F, 1.0331F, -2.2202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 2.3447F, -0.1304F, 0.088F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(112, 86).addBox(-1.0922F, 0.0658F, 0.8696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 1.027F, -0.1304F, 0.088F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(112, 61).addBox(-1.0922F, -0.9627F, 0.5272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(112, 46).addBox(-1.0922F, -1.3627F, 0.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.1107F, -0.1304F, 0.088F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(112, 43).addBox(-1.0922F, -3.1297F, -0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -1.8004F, -0.1304F, 0.088F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(112, 40).addBox(-1.0922F, -0.6662F, 1.5711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(40, 112).addBox(-1.0922F, -0.6662F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.1424F, -0.1304F, 0.088F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(84, 81).addBox(-1.0922F, -0.4963F, -0.4789F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(112, 37).addBox(-1.0922F, -0.467F, -1.1741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(112, 34).addBox(-1.0922F, -0.467F, -1.6491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.0987F, -0.1304F, 0.088F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(43, 93).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4349F, -0.3136F, -1.41F, -0.6337F, 0.1407F, -0.2574F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(84, 71).addBox(0.4167F, 0.4484F, -1.2494F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.7646F, 0.1407F, -0.2574F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(84, 55).addBox(0.6363F, -1.7559F, -1.1298F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, -0.6217F, 0.3737F, -0.1313F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(14, 84).addBox(-0.4484F, -2.0926F, 1.0258F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.8296F, 0.1516F, -0.052F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(73, 0).addBox(-0.1577F, -2.2357F, 2.0886F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.2284F, -0.4172F, 0.7874F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(112, 31).addBox(-0.3871F, -2.2017F, -0.7608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.0322F, 0.1544F, -0.0329F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(83, 67).addBox(-0.5577F, 2.3166F, -0.6488F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 1.4712F, -0.2148F, 0.1787F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(91, 72).addBox(-0.5577F, 1.9805F, 1.5227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.8167F, -0.2148F, 0.1787F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(20, 68).addBox(-0.5577F, -2.2357F, 2.0886F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.424F, -0.2148F, 0.1787F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(96, 111).addBox(0.6629F, -2.1187F, -0.8407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2433F, -0.6694F, 1.4997F, 0.0318F, 0.003F, -0.2124F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.0063F, -1.7945F, 1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(92, 47).addBox(-0.3073F, 7.8297F, -1.2012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -1.8588F, -0.1745F, 0.0F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(28, 89).addBox(-0.3073F, 6.3728F, -3.3362F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(27, 68).addBox(-0.3073F, 1.9796F, -3.6514F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -1.6581F, -0.1745F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(95, 114).addBox(-0.148F, -0.1285F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 114).addBox(-0.148F, 0.0715F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-1.6525F, -2.7796F, -9.976F, -1.6581F, -0.1222F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(102, 87).addBox(-0.148F, -0.05F, -0.3253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.6525F, -2.7796F, -9.976F, -1.8675F, -0.1222F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(19, 90).addBox(-0.8227F, -0.1519F, -0.7759F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8525F, -2.7796F, -11.776F, -1.8719F, -0.0698F, 0.0F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(24, 74).addBox(-0.8227F, -0.187F, -0.9647F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8525F, -2.7796F, -11.776F, -1.8195F, -0.0698F, 0.0F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 89).addBox(-0.7936F, -3.6653F, -0.3992F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9475F, -5.1796F, -18.276F, -1.8895F, 0.0718F, 0.0115F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(35, 41).addBox(-1.3903F, -1.2871F, -0.3078F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.837F, 0.1047F, 0.0F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(14, 88).addBox(-0.7936F, -3.6737F, -0.4825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9475F, -5.1796F, -18.276F, -1.8546F, 0.0718F, 0.0115F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(60, 24).addBox(-1.3903F, -0.2857F, -0.4574F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.8457F, 0.1047F, 0.0F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(64, 86).addBox(-1.3903F, 8.0828F, -1.044F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.7759F, 0.1047F, 0.0F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(85, 114).addBox(-0.8569F, 11.5098F, -2.8945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(70, 114).addBox(-0.8819F, 10.5098F, -2.7695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 52).addBox(-0.8819F, 10.0098F, -2.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 49).addBox(-0.8819F, 9.5098F, -2.6445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 114).addBox(-0.8819F, 9.0098F, -2.6195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(30, 114).addBox(-0.8819F, 8.5098F, -2.5445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 21).addBox(-0.8819F, 8.0098F, -2.4945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.6864F, 0.0775F, -0.2615F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(80, 114).addBox(-1.3836F, 10.9822F, -2.8445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.6861F, 0.0341F, -0.2564F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(20, 114).addBox(-1.2799F, 7.4367F, -2.5025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 18).addBox(-1.2799F, 6.9367F, -2.4525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 15).addBox(-1.2799F, 6.4367F, -2.3775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 12).addBox(-1.2799F, 5.9367F, -2.2775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 114).addBox(-1.2799F, 5.4367F, -2.1775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 9).addBox(-1.2799F, 4.9367F, -2.0525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(114, 0).addBox(-1.2799F, 4.4367F, -1.9525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 95).addBox(-1.2799F, 3.9367F, -1.8525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 92).addBox(-1.2799F, 3.4367F, -1.7775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 89).addBox(-1.2799F, 2.9367F, -1.6775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 82).addBox(-1.2799F, 2.4367F, -1.5775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 79).addBox(-1.2799F, 1.9367F, -1.5025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(75, 113).addBox(-1.2799F, 1.4367F, -1.4025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 73).addBox(-1.2799F, 0.9367F, -1.3275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(86, 75).addBox(-1.2799F, 0.4367F, -1.2525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(57, 86).addBox(-1.2799F, -0.0633F, -1.2025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.673F, 0.0298F, -0.2559F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(50, 86).addBox(-0.6996F, -0.596F, -0.9532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9475F, -5.1796F, -18.276F, -1.6648F, -0.0021F, -0.2443F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(43, 86).addBox(-0.6994F, -1.0752F, -0.8761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(36, 86).addBox(-0.6994F, -1.5752F, -0.7761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(21, 86).addBox(-0.6994F, -2.0752F, -0.7011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(86, 8).addBox(-0.6994F, -2.5752F, -0.6011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(7, 86).addBox(-0.6994F, -3.0752F, -0.4761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(86, 4).addBox(-0.6994F, -3.5752F, -0.3761F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9475F, -5.1796F, -18.276F, -1.656F, -0.0359F, -0.2445F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(84, 85).addBox(-0.6883F, 2.6804F, -2.1256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(77, 85).addBox(-0.6883F, 2.1804F, -2.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(70, 85).addBox(-0.6883F, 1.6804F, -1.9256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(85, 51).addBox(-0.6883F, 1.1804F, -1.8256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 70).addBox(-0.6883F, 0.6804F, -1.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(113, 67).addBox(-0.6883F, 0.1804F, -1.6256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 113).addBox(-0.6883F, -0.3196F, -1.5256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8525F, -2.7796F, -11.776F, -1.6286F, -0.139F, -0.2584F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(113, 64).addBox(-0.2685F, 1.0829F, -1.1602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.6525F, -2.7796F, -9.976F, -1.6149F, -0.1896F, -0.2606F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(60, 113).addBox(-0.183F, 0.5637F, -1.0602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 113).addBox(-0.183F, 0.0637F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 113).addBox(-0.183F, -0.4363F, -0.9602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.6525F, -2.7796F, -9.976F, -1.6145F, -0.1199F, -0.2637F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(45, 113).addBox(0.531F, 9.4266F, -3.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 113).addBox(0.531F, 8.9266F, -3.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 113).addBox(0.531F, 8.4266F, -3.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -1.6006F, -0.1704F, -0.2657F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(104, 52).addBox(-0.3073F, -0.5573F, -1.5148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -0.2618F, -0.1745F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(104, 49).addBox(-0.3073F, -0.4392F, -1.3827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -0.5236F, -0.1745F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(103, 8).addBox(-0.3073F, 4.5892F, -4.183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -1.5272F, -0.1745F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(45, 116).addBox(-0.3073F, -2.494F, -0.5084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, 1.2654F, -0.1745F, 0.0F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(104, 22).addBox(-0.3073F, -0.6811F, 2.4525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, 2.7663F, -0.1745F, 0.0F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(83, 89).addBox(-0.3073F, 3.4195F, -0.169F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 105).addBox(-0.3073F, 7.4195F, -0.169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -1.9897F, -0.1745F, 0.0F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(66, 46).addBox(-0.3073F, 0.2559F, -1.5232F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -1.8326F, -0.1745F, 0.0F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(76, 89).addBox(-0.3073F, 3.8649F, -4.8158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -1.3963F, -0.1745F, 0.0F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(25, 116).addBox(-0.3073F, -2.8871F, -2.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, -0.3927F, -0.1745F, 0.0F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(46, 73).addBox(-0.3073F, -3.2828F, -0.7741F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(15, 116).addBox(-0.3073F, -1.8328F, 0.2259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1525F, 1.0204F, 0.024F, 0.5672F, -0.1745F, 0.0F));

		PartDefinition cube_r350 = jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(66, 37).addBox(-0.6927F, 0.2559F, -1.5232F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -1.8326F, 0.1745F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(108, 95).addBox(-0.6927F, -1.8328F, 0.2259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(-0.6927F, -3.2828F, -0.7741F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, 0.5672F, 0.1745F, 0.0F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(108, 92).addBox(-0.6927F, -2.8871F, -2.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -0.3927F, 0.1745F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(49, 67).addBox(-0.6927F, 1.9796F, -3.6514F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(24, 80).addBox(-0.6927F, 6.3728F, -3.3362F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -1.6581F, 0.1745F, 0.0F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(79, 77).addBox(-0.6927F, 3.8649F, -4.8158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -1.3963F, 0.1745F, 0.0F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(99, 22).addBox(-0.6927F, 4.5892F, -4.183F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -1.5272F, 0.1745F, 0.0F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(104, 16).addBox(-0.6927F, -0.4392F, -1.3827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -0.5236F, 0.1745F, 0.0F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(74, 9).addBox(-0.1773F, -0.187F, -0.9647F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3475F, -2.7796F, -11.776F, -1.8195F, 0.0698F, 0.0F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(65, 80).addBox(-0.6237F, 8.1002F, -1.0404F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.7759F, 0.1396F, 0.0F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(35, 57).addBox(-0.6237F, -0.2687F, -0.4526F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.8457F, 0.1396F, 0.0F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(91, 111).addBox(-1.531F, 8.4266F, -3.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(86, 111).addBox(-1.531F, 8.9266F, -3.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(81, 111).addBox(-1.531F, 9.4266F, -3.9252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -1.6006F, 0.1704F, 0.2657F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(111, 76).addBox(-0.817F, -0.4363F, -0.9602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(70, 111).addBox(-0.817F, 0.0637F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(111, 58).addBox(-0.817F, 0.5637F, -1.0602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4525F, -2.7796F, -9.976F, -1.6145F, 0.1199F, 0.2637F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(111, 55).addBox(-0.7315F, 1.0829F, -1.1602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4525F, -2.7796F, -9.976F, -1.6149F, 0.1896F, 0.2606F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(35, 111).addBox(-0.3117F, -0.3196F, -1.5256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(30, 111).addBox(-0.3117F, 0.1804F, -1.6256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(20, 111).addBox(-0.3117F, 0.6804F, -1.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(83, 43).addBox(-0.3117F, 1.1804F, -1.8256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(83, 39).addBox(-0.3117F, 1.6804F, -1.9256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(83, 33).addBox(-0.3117F, 2.1804F, -2.0256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(83, 29).addBox(-0.3117F, 2.6804F, -2.1256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3475F, -2.7796F, -11.776F, -1.6286F, 0.139F, 0.2584F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(57, 82).addBox(-1.0291F, -0.4375F, -1.3413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(41, 82).addBox(-1.0291F, 0.0625F, -1.4413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(7, 82).addBox(-1.0291F, 0.5625F, -1.5663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(77, 81).addBox(-1.0291F, 1.0625F, -1.6663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(70, 81).addBox(-1.0291F, 1.5625F, -1.7413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(29, 81).addBox(-1.0291F, 2.0625F, -1.8413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1525F, -3.7796F, -15.376F, -1.6195F, 0.1727F, 0.2598F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 81).addBox(-0.6973F, -0.4953F, -0.8393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(80, 59).addBox(-0.6973F, 0.0047F, -0.9393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(80, 0).addBox(-0.6973F, 0.5047F, -0.9893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 111).addBox(-0.6973F, 1.0047F, -1.0643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(76, 110).addBox(-0.6973F, 1.5047F, -1.1393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 110).addBox(-0.6973F, 2.0047F, -1.2393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 110).addBox(-0.6973F, 2.5047F, -1.3143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 110).addBox(-0.6973F, 3.0047F, -1.4143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 110).addBox(-0.6973F, 3.5047F, -1.5143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 110).addBox(-0.6973F, 4.0047F, -1.5893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(110, 25).addBox(-0.6973F, 4.5047F, -1.6893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 110).addBox(-0.6973F, 5.0047F, -1.7893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 110).addBox(-0.6973F, 5.5047F, -1.9143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 52).addBox(-0.6973F, 6.0047F, -2.0143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 49).addBox(-0.6973F, 6.5047F, -2.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 109).addBox(-0.6973F, 7.0047F, -2.1893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 22).addBox(-0.6973F, 7.5047F, -2.2393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.6104F, 0.2065F, 0.2615F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(109, 19).addBox(-1.0972F, 8.0274F, -2.2304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 16).addBox(-1.0972F, 8.5274F, -2.2804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 13).addBox(-1.0972F, 9.0274F, -2.3554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 10).addBox(-1.0972F, 9.5274F, -2.3804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 109).addBox(-1.0972F, 10.0274F, -2.4304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(109, 0).addBox(-1.0972F, 10.5274F, -2.5054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(107, 108).addBox(-1.1222F, 11.5274F, -2.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.623F, 0.1585F, 0.2641F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 109).addBox(-0.5938F, 11.0425F, -2.5804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.6234F, 0.2021F, 0.2617F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(30, 41).addBox(-0.6237F, -1.27F, -0.3031F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3475F, -5.1796F, -18.276F, -1.837F, 0.1396F, 0.0F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(52, 80).addBox(-0.8179F, -0.3857F, -0.9823F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1525F, -3.7796F, -15.376F, -1.8544F, 0.1047F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(36, 80).addBox(-0.8179F, -0.3618F, -0.7841F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1525F, -3.7796F, -15.376F, -1.8893F, 0.1047F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(5, 90).addBox(-0.1773F, -0.1519F, -0.7759F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3475F, -2.7796F, -11.776F, -1.8719F, 0.0698F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(99, 49).addBox(-0.852F, -0.05F, -0.3253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4525F, -2.7796F, -9.976F, -1.8675F, 0.1222F, 0.0F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(102, 108).addBox(-0.852F, 0.0715F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F))
				.texOffs(97, 108).addBox(-0.852F, -0.1285F, -0.5317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4525F, -2.7796F, -9.976F, -1.6581F, 0.1222F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(91, 79).addBox(-0.6927F, 7.8297F, -1.2012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -1.8588F, 0.1745F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(105, 25).addBox(-0.6927F, 7.4195F, -0.169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(19, 78).addBox(-0.6927F, 3.4195F, -0.169F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -1.9897F, 0.1745F, 0.0F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(104, 19).addBox(-0.6927F, -0.6811F, 2.4525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, 2.7663F, 0.1745F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(92, 108).addBox(-0.6927F, -2.494F, -0.5084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, 1.2654F, 0.1745F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(15, 104).addBox(-0.6927F, -0.5573F, -1.5148F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.9525F, 1.0204F, 0.024F, -0.2618F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 122, 122);
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