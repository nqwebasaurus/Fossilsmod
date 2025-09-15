package fossils.fossils.client.blockentity.model.tiarajudens;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TiarajudensFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Righthindfoot2;
	private final ModelPart Rightopposabletoe;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Lefthindfoot2;
	private final ModelPart Leftopposabletoe;
	private final ModelPart bone;
	private final ModelPart bone3;

	public TiarajudensFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.upperarm1 = this.Bodyfront.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.Bodyfront.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Righthindfoot2 = this.Righthindfoot.getChild("Righthindfoot2");
		this.Rightopposabletoe = this.Righthindfoot.getChild("Rightopposabletoe");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Lefthindfoot2 = this.Lefthindfoot.getChild("Lefthindfoot2");
		this.Leftopposabletoe = this.Lefthindfoot.getChild("Leftopposabletoe");
		this.bone = this.Hips.getChild("bone");
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2862F, -0.4899F, -0.3042F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(69, 83).addBox(0.0F, -1.4F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(66, 83).addBox(0.0F, -1.6F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(63, 83).addBox(0.0F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 8).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -7.8941F, 5.5588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-1.2F, -1.2F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(85, 6).mirror().addBox(-0.9F, -1.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(85, 3).mirror().addBox(-0.7F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -8.1743F, 8.0929F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(85, 9).addBox(1.2F, -1.2F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(85, 6).addBox(0.9F, -1.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(85, 3).addBox(0.7F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -8.1743F, 8.0929F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4387F, 13.4651F, 0.1504F, 0.2653F, -0.0029F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(47, 69).addBox(0.0F, -1.95F, 2.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 0).addBox(0.0F, -2.2F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 37).addBox(-0.5F, -1.2F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail4_r1 = Tail1.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(82, 38).addBox(0.0F, -0.0854F, -0.1212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4768F, 2.2697F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail3_r2 = Tail1.addOrReplaceChild("Tail3_r2", CubeListBuilder.create().texOffs(8, 83).addBox(0.0F, 0.0347F, 0.003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.1598F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(11, 37).addBox(-0.5F, -0.6283F, -0.0494F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(48, 84).addBox(0.0F, -1.2283F, -0.0494F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(84, 66).addBox(0.0F, -1.0283F, 1.9506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.3317F, 3.8586F, -0.1438F, 0.2592F, -0.0371F));

		PartDefinition Tail7_r1 = Tail2.addOrReplaceChild("Tail7_r1", CubeListBuilder.create().texOffs(34, 82).addBox(0.0F, -0.2507F, -0.2703F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3144F, 3.0294F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail6_r1 = Tail2.addOrReplaceChild("Tail6_r1", CubeListBuilder.create().texOffs(55, 82).addBox(0.0F, -0.2968F, 0.1963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5144F, 0.5294F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(36, 16).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 84).addBox(0.0F, -0.8605F, -0.0586F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 84).addBox(0.0F, -0.7855F, 1.9414F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0525F, 3.9191F, 0.0878F, 0.1739F, 0.0152F));

		PartDefinition Tail10_r1 = Tail3.addOrReplaceChild("Tail10_r1", CubeListBuilder.create().texOffs(84, 32).addBox(0.0F, 0.3499F, -0.6782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1573F, 3.5788F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail9_r1 = Tail3.addOrReplaceChild("Tail9_r1", CubeListBuilder.create().texOffs(5, 83).addBox(0.0F, -0.6153F, -0.2565F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2427F, 1.1788F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(42, 59).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.925F, 0.1488F, 0.1295F, 0.0194F));

		PartDefinition Tail11_r1 = Tail4.addOrReplaceChild("Tail11_r1", CubeListBuilder.create().texOffs(17, 85).addBox(0.0F, 0.9499F, 1.3218F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1573F, -0.3462F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(59, 47).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.009F, 1.94F, 0.1144F, 0.1734F, 0.0198F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0035F, 1.9486F, -0.0363F, 0.1744F, -0.0063F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(60, 34).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0151F, 1.8948F, -0.1259F, 0.2165F, -0.0272F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(57, 60).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0034F, 1.9159F, -0.1884F, 0.2144F, -0.0406F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(45, 11).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 1.8828F, -0.1989F, -0.3857F, 0.0757F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.8626F, -4.8347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1191F, 6.5588F, 0.1132F, -0.1301F, -0.0147F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(14, 83).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0126F, -0.3347F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(11, 83).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7876F, -2.8347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(30, 77).addBox(0.0F, -2.4F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7626F, -4.7347F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -0.3342F, -0.007F, -0.02F, -1.4504F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(82, 15).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -0.3342F, 0.0206F, -0.0323F, -0.9058F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 25).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -2.3342F, -0.0238F, -0.0506F, -1.2927F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 64).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -2.3342F, -0.0097F, -0.0497F, -0.7475F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.0026F, 0.049F, -1.6774F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.0268F, 0.0411F, -1.1533F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 63).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.0811F, 0.0025F, -0.61F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 72).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -0.3342F, -0.007F, 0.02F, 1.4504F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(82, 15).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -0.3342F, 0.0206F, 0.0323F, 0.9058F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 25).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -2.3342F, -0.0238F, 0.0506F, 1.2927F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(80, 64).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -2.3342F, -0.0097F, 0.0497F, 0.7475F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 83).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.0026F, -0.049F, 1.6774F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 4).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.0268F, -0.0411F, 1.1533F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(43, 63).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.0811F, -0.0025F, 0.61F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(0, 17).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5374F, -3.6347F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2626F, -4.7847F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(13, 78).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(17, 72).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.003F, 0.0315F, -1.5902F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.0183F, 0.0258F, -1.0664F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.066F, -0.0062F, -0.5227F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.002F, 0.0839F, -1.5553F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(61, 27).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.0437F, 0.0716F, -1.0302F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(83, 81).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.1114F, 0.02F, -0.4875F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 72).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.003F, -0.0315F, 1.5902F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 62).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.0183F, -0.0258F, 1.0664F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(82, 72).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.066F, 0.0062F, 0.5227F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 62).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.002F, -0.0839F, 1.5553F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 27).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.0437F, -0.0716F, 1.0302F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(83, 81).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.1114F, -0.02F, 0.4875F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(10, 78).addBox(0.0F, -2.8F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r7 = body.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.725F, -5.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 30).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(19, 17).addBox(-2.5F, 7.7F, -4.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.95F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Bodymiddle_r8 = body2.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(23, 53).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r9 = body2.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(16, 78).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(21, 6).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.0036F, -0.0034F, -1.5203F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.0015F, -0.0047F, -0.9967F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(37, 83).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.0357F, -0.0236F, -0.4524F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 4).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, -0.0009F, 0.0143F, -1.4681F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 62).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.0063F, 0.0128F, -0.9445F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(24, 83).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.049F, -0.0111F, -0.4004F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(37, 56).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.0792F, 0.0064F, -0.4006F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(56, 19).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.0232F, 0.0434F, -0.9441F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-8.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, -0.0016F, 0.0492F, -1.4683F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(21, 6).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.0036F, 0.0034F, 1.5203F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(66, 22).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.0015F, 0.0047F, 0.9967F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(37, 83).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.0357F, 0.0236F, 0.4524F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(36, 4).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, -0.0009F, -0.0143F, 1.4681F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(18, 62).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.0063F, -0.0128F, 0.9445F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(24, 83).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.049F, 0.0111F, 0.4004F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(37, 56).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.0792F, -0.0064F, 0.4006F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(56, 19).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.0232F, -0.0434F, 0.9441F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(36, 0).addBox(2.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, -0.0016F, -0.0492F, 1.4683F));

		PartDefinition Bodymiddle_r10 = body2.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(80, 81).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(26, 30).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Bodymiddle_r11 = body3.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(39, 78).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r12 = body3.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(78, 27).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, -0.0122F, -0.0448F, -0.4159F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, -0.0285F, -0.0477F, -0.961F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(36, 2).mirror().addBox(-8.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, -0.0008F, -0.0555F, -1.4853F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(39, 35).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.0009F, 0.0141F, -1.5204F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.0078F, 0.0118F, -0.9968F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.0497F, -0.0127F, -0.4528F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(83, 44).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, -0.0122F, 0.0448F, 0.4159F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(62, 38).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, -0.0285F, 0.0477F, 0.961F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 2).addBox(2.9922F, -2.343F, -0.4258F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, -0.0008F, 0.0555F, 1.4853F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(39, 35).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.0009F, -0.0141F, 1.5204F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(27, 62).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.0078F, -0.0118F, 0.9968F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(83, 42).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.0497F, 0.0127F, 0.4528F));

		PartDefinition Bodymiddle_r13 = body3.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(32, 6).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.725F, 0.075F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -4.875F, -0.025F, -0.1309F, 0.0033F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(52, 78).addBox(0.0F, -2.2188F, 0.0179F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2041F, -0.9804F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(77, 83).addBox(0.0F, -1.9937F, 0.0277F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0041F, -2.9804F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(29, 46).addBox(-0.5F, -0.3F, -3.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.3335F, -1.2893F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, -1.5F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.7959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(75, 12).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, -0.0015F, 0.2584F, -1.6955F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, 0.1301F, 0.2239F, -1.1571F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(83, 83).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, 0.2633F, 0.1065F, -0.6175F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.0023F, 0.0664F, -1.5902F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(62, 40).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.0352F, 0.0564F, -1.0657F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.0962F, 0.0113F, -0.5226F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(75, 12).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, -0.0015F, -0.2584F, 1.6955F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 68).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, 0.1301F, -0.2239F, 1.1571F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(83, 83).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, 0.2633F, -0.1065F, 0.6175F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(49, 4).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.0023F, -0.0664F, 1.5902F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(62, 40).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.0352F, -0.0564F, 1.0657F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(83, 46).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.0962F, -0.0113F, 0.5226F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4959F, -3.8054F, -0.4833F, -0.2342F, -0.0153F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(52, 83).addBox(0.0F, -1.9094F, -0.8963F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.011F, -0.0139F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(58, 83).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1514F, -0.4191F, 0.6631F, 0.5773F, -0.6311F));

		PartDefinition cube_r70 = Neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(47, 72).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1514F, -0.4191F, 0.1935F, 0.8212F, -1.2771F));

		PartDefinition cube_r71 = Neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(58, 83).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1514F, -0.4191F, 0.6631F, -0.5773F, 0.6311F));

		PartDefinition cube_r72 = Neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(47, 72).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1514F, -0.4191F, 0.1935F, -0.8212F, 1.2771F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(49, 61).addBox(-0.5F, -0.8F, 4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.589F, -6.0139F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1862F, -1.8525F, -0.3433F, -0.3808F, 0.2196F));

		PartDefinition Neck_r3 = neck2.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, -1.1F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2222F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = neck2.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(84, 69).addBox(0.0F, -1.0096F, -0.9068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5222F, -0.0864F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r73 = neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(73, 17).mirror().addBox(-1.9348F, 0.0814F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0652F, -0.5666F, 0.3761F, 0.9258F, -1.1228F));

		PartDefinition cube_r74 = neck2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(73, 17).addBox(-0.0652F, 0.0814F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0652F, -0.5666F, 0.3761F, -0.9258F, 1.1228F));

		PartDefinition Neck_r5 = neck2.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(43, 22).addBox(-0.5F, -0.8F, 3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4778F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(50, 30).addBox(-0.99F, -3.2953F, -4.8275F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.1405F, -2.7651F, 0.3617F, 0.0477F, -0.1203F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(56, 14).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1824F, -2.1127F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(56, 6).addBox(-0.5F, -1.9038F, 0.0446F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.7103F, -3.3024F, 0.5934F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(57, 68).addBox(-1.49F, -0.0288F, -1.9804F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 79).addBox(-0.99F, -0.0288F, -0.9804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4198F, -8.696F, 1.2654F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(9, 68).addBox(-0.565F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.075F, 1.7713F, -8.9977F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(40, 74).addBox(-0.99F, -0.0288F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -1.3068F, -8.2342F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(74, 33).addBox(-0.49F, -0.0288F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0139F, -7.5271F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(21, 64).addBox(-0.49F, -0.0288F, -0.9804F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -2.6227F, -6.7338F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(14, 64).addBox(-0.49F, -0.0288F, -0.9804F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.0453F, -5.8275F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(7, 64).addBox(-0.49F, -0.05F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -3.2453F, -4.8275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(73, 45).addBox(-0.99F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.6613F, -1.8379F, -1.693F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(73, 29).addBox(-0.99F, -1.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(47, 78).addBox(-0.99F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0421F, -1.2407F, -1.3875F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(29, 73).addBox(-0.99F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.2035F, 0.3212F, -1.7366F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(54, 11).addBox(-1.99F, -0.4155F, 0.8871F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7461F, 0.3557F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(53, 39).addBox(-1.99F, -0.0444F, -0.0214F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -1.7461F, 0.3557F, -1.5795F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(29, 43).addBox(-2.99F, -0.3226F, 0.9228F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9461F, -1.1443F, -0.8203F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(43, 27).addBox(-2.99F, 0.0125F, -0.0225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -2.9461F, -1.1443F, -0.4712F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(70, 14).addBox(-1.49F, 0.0257F, 0.7027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2461F, -2.8443F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5F, -0.814F, -0.8607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.1853F, -1.7215F, 1.8762F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(78, 46).addBox(-0.5F, -0.1446F, -0.2471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -2.7853F, -2.5215F, 1.3526F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(63, 10).addBox(-0.5F, -0.1873F, -1.86F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.3353F, -2.4215F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(51, 0).addBox(-1.99F, -0.0617F, 0.0012F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -3.2461F, -2.8443F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1267F, -0.543F, 1.6144F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.002F, -0.2604F, -2.2614F, -0.4847F, -0.2529F, 0.0883F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-0.4032F, -0.4881F, 0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4005F, -0.2369F, -1.0258F, -1.309F, -0.2007F, 0.0873F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(-0.4032F, -0.0215F, -1.1947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(82, 12).mirror().addBox(-0.4032F, -1.0215F, 0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4005F, -0.2369F, -1.0258F, -0.9163F, -0.2007F, 0.0873F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-0.6032F, -1.9052F, -0.1152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(78, 43).mirror().addBox(-0.6032F, -1.9052F, -0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.4005F, -0.2369F, -1.0258F, -1.9199F, -0.2007F, 0.0873F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-0.4032F, -0.9125F, -1.4971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4005F, -0.2369F, -1.0258F, -0.6109F, -0.2007F, 0.0873F));

		PartDefinition Lowerjawbase_r6 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(0.0595F, -0.0259F, -1.961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(66, 29).mirror().addBox(0.0595F, -1.0142F, -2.4029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 78).mirror().addBox(0.0595F, -0.6642F, -2.0279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.5472F, -0.3124F, 0.1049F));

		PartDefinition Lowerjawbase_r7 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(0.0595F, -0.8043F, -1.9984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.4163F, -0.3124F, 0.1049F));

		PartDefinition Lowerjawbase_r8 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(0.0245F, -0.3565F, -2.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.3844F, -0.3273F, 0.1145F));

		PartDefinition Lowerjawbase_r9 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(70, 77).mirror().addBox(0.4799F, -4.8004F, -2.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, 0.8638F, -0.2226F, 0.0492F));

		PartDefinition Lowerjawbase_r10 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(65, 77).mirror().addBox(0.0245F, -0.6109F, -4.4419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 77).mirror().addBox(0.0245F, -0.6109F, -3.5419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.2884F, -0.3273F, 0.1145F));

		PartDefinition Lowerjawbase_r11 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r11", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(-0.1483F, -1.6959F, -3.0109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(75, 19).mirror().addBox(-0.1483F, -1.7459F, -3.7109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(24, 72).mirror().addBox(-0.1483F, -1.8459F, -4.4108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.235F, -0.3472F, 0.0693F));

		PartDefinition Lowerjawbase_r12 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r12", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(0.3049F, -2.6251F, -4.866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.0961F, -0.2226F, 0.0492F));

		PartDefinition Lowerjawbase_r13 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r13", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(0.3049F, -3.4263F, -5.1808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, 0.0348F, -0.2226F, 0.0492F));

		PartDefinition Lowerjawbase_r14 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r14", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(0.4799F, -1.0049F, -5.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.2707F, -0.2226F, 0.0492F));

		PartDefinition Lowerjawbase_r15 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r15", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(0.4799F, -1.3773F, -4.3911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.1834F, -0.2226F, 0.0492F));

		PartDefinition Lowerjawbase_r16 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r16", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(0.0245F, -1.4077F, -3.6647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.2012F, -0.3273F, 0.1145F));

		PartDefinition Lowerjawbase_r17 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r17", CubeListBuilder.create().texOffs(76, 58).mirror().addBox(0.0245F, -1.1574F, -2.7977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4183F, -1.0194F, -2.5865F, -0.2928F, -0.3273F, 0.1145F));

		PartDefinition Lowerjawbase_r18 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r18", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(0.1832F, -0.9381F, -1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8183F, -1.0194F, -1.5865F, 0.0389F, -0.2529F, 0.0883F));

		PartDefinition Lowerjawbase_r19 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r19", CubeListBuilder.create().texOffs(81, 58).mirror().addBox(0.1832F, -0.8613F, -0.4736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8183F, -1.0194F, -1.5865F, -0.1356F, -0.2529F, 0.0883F));

		PartDefinition Lowerjawbase_r20 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r20", CubeListBuilder.create().texOffs(81, 55).addBox(-0.5F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.022F, -0.2604F, -2.2614F, -0.4847F, 0.2529F, -0.0883F));

		PartDefinition Lowerjawbase_r21 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r21", CubeListBuilder.create().texOffs(81, 52).addBox(-0.5968F, -0.4881F, 0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4205F, -0.2369F, -1.0258F, -1.309F, 0.2007F, -0.0873F));

		PartDefinition Lowerjawbase_r22 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r22", CubeListBuilder.create().texOffs(67, 33).addBox(-0.5968F, -0.0215F, -1.1947F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(82, 12).addBox(-0.5968F, -1.0215F, 0.2053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4205F, -0.2369F, -1.0258F, -0.9163F, 0.2007F, -0.0873F));

		PartDefinition Lowerjawbase_r23 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r23", CubeListBuilder.create().texOffs(75, 8).addBox(-0.3968F, -1.9052F, -0.1152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(78, 43).addBox(-0.3968F, -1.9052F, -0.4152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.4205F, -0.2369F, -1.0258F, -1.9199F, 0.2007F, -0.0873F));

		PartDefinition Lowerjawbase_r24 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r24", CubeListBuilder.create().texOffs(56, 42).addBox(-0.5968F, -0.9125F, -1.4971F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4205F, -0.2369F, -1.0258F, -0.6109F, 0.2007F, -0.0873F));

		PartDefinition Lowerjawbase_r25 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r25", CubeListBuilder.create().texOffs(66, 18).addBox(-1.0595F, -0.0259F, -1.961F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F))
				.texOffs(66, 29).addBox(-1.0595F, -1.0142F, -2.4029F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 78).addBox(-1.0595F, -0.6642F, -2.0279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.5472F, 0.3124F, -0.1049F));

		PartDefinition Lowerjawbase_r26 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r26", CubeListBuilder.create().texOffs(63, 6).addBox(-1.0595F, -0.8043F, -1.9984F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.4163F, 0.3124F, -0.1049F));

		PartDefinition Lowerjawbase_r27 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r27", CubeListBuilder.create().texOffs(77, 72).addBox(-1.0245F, -0.3565F, -2.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.3844F, 0.3273F, -0.1145F));

		PartDefinition Lowerjawbase_r28 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r28", CubeListBuilder.create().texOffs(70, 77).addBox(-1.4799F, -4.8004F, -2.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, 0.8638F, 0.2226F, -0.0492F));

		PartDefinition Lowerjawbase_r29 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r29", CubeListBuilder.create().texOffs(65, 77).addBox(-1.0245F, -0.6109F, -4.4419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 77).addBox(-1.0245F, -0.6109F, -3.5419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.2884F, 0.3273F, -0.1145F));

		PartDefinition Lowerjawbase_r30 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r30", CubeListBuilder.create().texOffs(75, 23).addBox(-0.8517F, -1.6959F, -3.0109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(75, 19).addBox(-0.8517F, -1.7459F, -3.7109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(24, 72).addBox(-0.8517F, -1.8459F, -4.4108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.235F, 0.3472F, -0.0693F));

		PartDefinition Lowerjawbase_r31 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r31", CubeListBuilder.create().texOffs(5, 72).addBox(-1.3049F, -2.6251F, -4.866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.0961F, 0.2226F, -0.0492F));

		PartDefinition Lowerjawbase_r32 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r32", CubeListBuilder.create().texOffs(71, 58).addBox(-1.3049F, -3.4263F, -5.1808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, 0.0348F, 0.2226F, -0.0492F));

		PartDefinition Lowerjawbase_r33 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r33", CubeListBuilder.create().texOffs(77, 40).addBox(-1.4799F, -1.0049F, -5.397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.2707F, 0.2226F, -0.0492F));

		PartDefinition Lowerjawbase_r34 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r34", CubeListBuilder.create().texOffs(25, 77).addBox(-1.4799F, -1.3773F, -4.3911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.1834F, 0.2226F, -0.0492F));

		PartDefinition Lowerjawbase_r35 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r35", CubeListBuilder.create().texOffs(77, 14).addBox(-1.0245F, -1.4077F, -3.6647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.2012F, 0.3273F, -0.1145F));

		PartDefinition Lowerjawbase_r36 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r36", CubeListBuilder.create().texOffs(76, 58).addBox(-1.0245F, -1.1574F, -2.7977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4383F, -1.0194F, -2.5865F, -0.2928F, 0.3273F, -0.1145F));

		PartDefinition Lowerjawbase_r37 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r37", CubeListBuilder.create().texOffs(0, 82).addBox(-1.1832F, -0.9381F, -1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.8383F, -1.0194F, -1.5865F, 0.0389F, 0.2529F, -0.0883F));

		PartDefinition Lowerjawbase_r38 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r38", CubeListBuilder.create().texOffs(81, 58).addBox(-1.1832F, -0.8613F, -0.4736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8383F, -1.0194F, -1.5865F, -0.1356F, 0.2529F, -0.0883F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.1F, 1.0863F, -5.8424F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(35, 58).addBox(-0.4998F, -0.8842F, -2.816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.6343F, 3.1222F, -0.3485F, 1.6493F, 0.0F, -0.0524F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(28, 58).addBox(-0.4998F, -0.5491F, -2.8079F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.6343F, 3.1222F, -0.3485F, 1.5184F, 0.0F, -0.0524F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(21, 58).addBox(-0.4998F, -0.5471F, -1.2689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6343F, 3.1222F, -0.3485F, 1.4312F, 0.0F, -0.0524F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(35, 71).addBox(-0.5031F, -1.8621F, -0.6121F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 75).addBox(-0.5031F, -0.8621F, 0.3879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8597F, -0.4737F, 1.8845F, 1.2013F, 0.2464F, -0.014F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(75, 4).addBox(-0.5031F, -1.0077F, -1.3169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8597F, -0.4737F, 1.8845F, 1.4195F, 0.2464F, -0.014F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(14, 58).addBox(-0.4998F, -0.7411F, -1.31F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.6343F, 3.1222F, -0.3485F, 1.6057F, 0.0F, -0.0524F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(66, 46).addBox(-0.925F, -0.425F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.5525F, -3.8658F, 0.9857F, 0.018F, 0.1618F, 0.0847F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(43, 65).addBox(-0.925F, -0.425F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5525F, -3.8658F, 0.9857F, 0.0189F, 0.3363F, 0.088F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(81, 29).addBox(-0.175F, -0.45F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5862F, -3.7563F, 3.4199F, -0.1414F, 0.234F, -0.0552F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(80, 3).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0915F, -3.5364F, 4.1785F, -0.2829F, 0.223F, -0.1436F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(79, 69).addBox(-0.4952F, -0.5418F, -0.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -3.3956F, 4.5812F, -0.4641F, 0.3067F, -0.1691F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(79, 66).addBox(-1.0514F, -0.6756F, -1.881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5355F, -1.6596F, 5.6846F, -1.0908F, 0.3927F, -0.1745F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(63, 64).addBox(-1.3F, -0.5F, -0.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9442F, -2.3173F, 5.802F, -0.2051F, 0.0238F, 0.0887F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(80, 6).addBox(-1.0764F, -0.4199F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 79).addBox(-1.0764F, -1.0949F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.5355F, -1.6596F, 5.7345F, -0.2039F, 0.4F, -0.1375F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(64, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9407F, -0.3807F, 5.6532F, -2.3562F, 0.2705F, 0.0F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(50, 48).addBox(-1.2F, -0.2F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9319F, -0.7432F, 5.7575F, -1.3562F, 0.0451F, 0.0814F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(5, 80).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.8165F, -1.3776F, 5.2052F, -1.1345F, 0.2705F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(33, 79).addBox(-1.0F, -3.8724F, 3.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.4429F, 0.3901F, -0.3491F, 0.2705F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(64, 55).addBox(-1.0F, -3.0538F, 2.982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, 0.4429F, 0.3901F, -0.1309F, 0.2705F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(80, 23).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1871F, -2.5503F, 3.3713F, -0.0229F, 0.327F, -0.2007F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(80, 20).addBox(-0.5785F, -0.3848F, 0.4361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, -0.1975F, 0.327F, -0.2007F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(80, 17).addBox(-0.5785F, -0.5863F, 0.4156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, 0.3698F, 0.327F, -0.2007F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(80, 75).addBox(-0.5326F, -0.4172F, -0.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, -2.51F, 0.327F, -0.2007F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(75, 80).addBox(-0.5326F, -0.8817F, -0.4681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, -3.1209F, 0.327F, -0.2007F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(70, 80).addBox(-0.5326F, -0.4537F, -0.8892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0078F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, 2.5514F, 0.327F, -0.2007F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(65, 80).addBox(-0.5326F, 0.0246F, -0.198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, 1.7224F, 0.327F, -0.2007F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(80, 61).addBox(-0.5326F, -0.3603F, 0.1331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, 1.3297F, 0.327F, -0.2007F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(60, 80).addBox(-0.5326F, -1.056F, -0.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0078F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, 0.5443F, 0.327F, -0.2007F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(42, 81).addBox(-0.5F, -0.7608F, -0.5301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9125F, -1.5558F, -2.2113F, -0.6333F, 0.2543F, -0.0081F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(81, 35).addBox(-0.5F, -0.2403F, -0.5385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9125F, -1.5558F, -2.2113F, -0.3715F, 0.2543F, -0.0081F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(81, 49).addBox(-0.3076F, -0.6191F, -0.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(80, 78).addBox(-0.5326F, -0.6191F, -0.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
				.texOffs(24, 80).addBox(-0.5326F, -0.5441F, -1.0123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, -0.1277F, 0.327F, -0.2007F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5785F, -0.862F, -2.4628F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9056F, -2.8958F, 2.5168F, -0.0229F, 0.327F, -0.2007F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(79, 32).addBox(-0.7082F, -0.8168F, -1.2103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(47, 16).addBox(-0.7082F, -0.8234F, -4.1483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6773F, -1.3806F, 3.9242F, 0.0262F, 0.2705F, 0.0F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(76, 55).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7861F, -1.5501F, -1.7218F, 1.5344F, 0.2897F, -0.2688F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(57, 71).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2414F, -2.1541F, -0.4111F, 1.8834F, 0.2897F, -0.2688F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(52, 21).addBox(-0.75F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.729F, -0.5324F, 1.9677F, 0.295F, -0.0239F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(64, 51).addBox(-0.7082F, -1.1028F, -2.9352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6773F, -1.3806F, 3.9242F, 0.288F, 0.2705F, 0.0F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(0, 58).addBox(-1.05F, -1.025F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(57, 56).addBox(-1.05F, -1.75F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6316F, -0.4183F, -1.0959F, 1.6438F, 0.296F, 0.0213F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(45, 74).addBox(-1.0F, 0.0462F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4437F, -3.6828F, -0.8649F, 0.471F, 0.0257F, 0.007F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(50, 74).addBox(0.0F, -0.0038F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.456F, -3.7489F, -0.7231F, 0.6497F, 0.1069F, 0.0741F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(74, 68).addBox(0.0F, -0.0038F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3265F, -3.1519F, -1.5149F, 0.7806F, 0.1069F, 0.0741F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(0, 75).addBox(0.0F, -0.0288F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1988F, -2.4558F, -2.2213F, 1.0424F, 0.1069F, 0.0741F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(54, 26).addBox(0.0F, -0.0288F, -1.9804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0812F, -1.5986F, -2.7226F, 1.2564F, 0.0934F, 0.0324F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(75, 62).addBox(-0.825F, 0.025F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -4.3316F, 1.015F, 0.2238F, 0.1674F, 0.0915F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(56, 64).addBox(-1.6394F, -4.0257F, -2.3973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6773F, -1.3806F, 3.9242F, 1.379F, 0.0083F, 0.0079F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(28, 64).addBox(-0.7082F, -2.5243F, -3.6313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6773F, -1.3806F, 3.9242F, 0.8552F, 0.2705F, 0.0F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(80, 9).addBox(-0.5F, -0.475F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.21F, -3.6153F, 4.0976F, -0.2737F, 0.4728F, -0.0857F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(47, 81).addBox(-0.4F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(67, 0).addBox(-0.4F, -0.85F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9404F, 0.677F, -1.4484F, 1.6605F, 0.2613F, 0.0126F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(35, 67).addBox(-0.525F, -1.1902F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.693F, -1.7771F, 1.4835F, 0.1222F, 0.0F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(50, 57).addBox(-0.325F, -0.1288F, -3.1804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -1.5061F, -2.8535F, 1.2654F, 0.0F, 0.0F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(9, 47).addBox(-0.4998F, -0.6825F, 0.3515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6343F, 3.1222F, -0.3485F, 1.3788F, 0.0F, -0.0524F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.12F, 1.0863F, -5.8424F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(35, 58).mirror().addBox(-0.5002F, -0.8842F, -2.816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, 3.1222F, -0.3485F, 1.6493F, 0.0F, 0.0524F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(-0.5002F, -0.5491F, -2.8079F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, 3.1222F, -0.3485F, 1.5184F, 0.0F, 0.0524F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-0.5002F, -0.5471F, -1.2689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, 3.1222F, -0.3485F, 1.4312F, 0.0F, 0.0524F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-0.4969F, -1.8621F, -0.6121F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 75).mirror().addBox(-0.4969F, -0.8621F, 0.3879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8597F, -0.4737F, 1.8845F, 1.2013F, -0.2464F, 0.014F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-0.4969F, -1.0077F, -1.3169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8597F, -0.4737F, 1.8845F, 1.4195F, -0.2464F, 0.014F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(14, 58).mirror().addBox(-0.5002F, -0.7411F, -1.31F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, 3.1222F, -0.3485F, 1.6057F, 0.0F, 0.0524F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-0.075F, -0.425F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5525F, -3.8658F, 0.9857F, 0.018F, -0.1618F, -0.0847F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(43, 65).mirror().addBox(-0.075F, -0.425F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5525F, -3.8658F, 0.9857F, 0.0189F, -0.3363F, -0.088F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(81, 29).mirror().addBox(-0.825F, -0.45F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5862F, -3.7563F, 3.4199F, -0.1414F, -0.234F, 0.0552F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0915F, -3.5364F, 4.1785F, -0.2829F, -0.223F, 0.1436F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(79, 69).mirror().addBox(-0.5048F, -0.5418F, -0.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.25F, -3.3956F, 4.5812F, -0.4641F, -0.3067F, 0.1691F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(0.0514F, -0.6756F, -1.881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5355F, -1.6596F, 5.6846F, -1.0908F, -0.3927F, 0.1745F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-0.7F, -0.5F, -0.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9442F, -2.3173F, 5.802F, -0.2051F, -0.0238F, -0.0887F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(0.0764F, -0.4199F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 79).mirror().addBox(0.0764F, -1.0949F, -1.0635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5355F, -1.6596F, 5.7345F, -0.2039F, -0.4F, 0.1375F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(64, 59).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9407F, -0.3807F, 5.6532F, -2.3562F, -0.2705F, 0.0F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(-0.8F, -0.2F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9319F, -0.7432F, 5.7575F, -1.3562F, -0.0451F, -0.0814F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8165F, -1.3776F, 5.2052F, -1.1345F, -0.2705F, 0.0F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(33, 79).mirror().addBox(0.0F, -3.8724F, 3.4425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4429F, 0.3901F, -0.3491F, -0.2705F, 0.0F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(64, 55).mirror().addBox(0.0F, -3.0538F, 2.982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4429F, 0.3901F, -0.1309F, -0.2705F, 0.0F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(80, 23).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1871F, -2.5503F, 3.3713F, -0.0229F, -0.327F, 0.2007F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-0.4215F, -0.3848F, 0.4361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, -0.1975F, -0.327F, 0.2007F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-0.4215F, -0.5863F, 0.4156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, 0.3698F, -0.327F, 0.2007F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(-0.4674F, -0.4172F, -0.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, -2.51F, -0.327F, 0.2007F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(75, 80).mirror().addBox(-0.4674F, -0.8817F, -0.4681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, -3.1209F, -0.327F, 0.2007F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(70, 80).mirror().addBox(-0.4674F, -0.4537F, -0.8892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0078F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, 2.5514F, -0.327F, 0.2007F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(65, 80).mirror().addBox(-0.4674F, 0.0246F, -0.198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, 1.7224F, -0.327F, 0.2007F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-0.4674F, -0.3603F, 0.1331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, 1.3297F, -0.327F, 0.2007F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(60, 80).mirror().addBox(-0.4674F, -1.056F, -0.4535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0078F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, 0.5443F, -0.327F, 0.2007F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(42, 81).mirror().addBox(-0.5F, -0.7608F, -0.5301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9125F, -1.5558F, -2.2113F, -0.6333F, -0.2543F, 0.0081F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-0.5F, -0.2403F, -0.5385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9125F, -1.5558F, -2.2113F, -0.3715F, -0.2543F, 0.0081F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-0.6924F, -0.6191F, -0.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(80, 78).mirror().addBox(-0.4674F, -0.6191F, -0.5123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(24, 80).mirror().addBox(-0.4674F, -0.5441F, -1.0123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, -0.1277F, -0.327F, 0.2007F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.4215F, -0.862F, -2.4628F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9056F, -2.8958F, 2.5168F, -0.0229F, -0.327F, 0.2007F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-0.2918F, -0.8168F, -1.2103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(47, 16).mirror().addBox(-0.2918F, -0.8234F, -4.1483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6773F, -1.3806F, 3.9242F, 0.0262F, -0.2705F, 0.0F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7861F, -1.5501F, -1.7218F, 1.5344F, -0.2897F, 0.2688F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(57, 71).mirror().addBox(-0.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2414F, -2.1541F, -0.4111F, 1.8834F, -0.2897F, 0.2688F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(52, 21).mirror().addBox(-0.25F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.729F, -0.5324F, 1.9677F, -0.295F, 0.0239F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(64, 51).mirror().addBox(-0.2918F, -1.1028F, -2.9352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6773F, -1.3806F, 3.9242F, 0.288F, -0.2705F, 0.0F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(0.05F, -1.025F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 56).mirror().addBox(0.05F, -1.75F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6316F, -0.4183F, -1.0959F, 1.6438F, -0.296F, -0.0213F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(0.0F, 0.0462F, -0.0054F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4437F, -3.6828F, -0.8649F, 0.471F, -0.0257F, -0.007F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-1.0F, -0.0038F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.456F, -3.7489F, -0.7231F, 0.6497F, -0.1069F, -0.0741F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(-1.0F, -0.0038F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3265F, -3.1519F, -1.5149F, 0.7806F, -0.1069F, -0.0741F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-1.0F, -0.0288F, -0.9804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1988F, -2.4558F, -2.2213F, 1.0424F, -0.1069F, -0.0741F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(54, 26).mirror().addBox(-1.0F, -0.0288F, -1.9804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0812F, -1.5986F, -2.7226F, 1.2564F, -0.0934F, -0.0324F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(75, 62).mirror().addBox(-0.175F, 0.025F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -4.3316F, 1.015F, 0.2238F, -0.1674F, -0.0915F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(0.6394F, -4.0257F, -2.3973F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6773F, -1.3806F, 3.9242F, 1.379F, -0.0083F, -0.0079F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(28, 64).mirror().addBox(-0.2918F, -2.5243F, -3.6313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6773F, -1.3806F, 3.9242F, 0.8552F, -0.2705F, 0.0F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-0.5F, -0.475F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.21F, -3.6153F, 4.0976F, -0.2737F, -0.4728F, 0.0857F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(47, 81).mirror().addBox(-0.6F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 0).mirror().addBox(-0.6F, -0.85F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9404F, 0.677F, -1.4484F, 1.6605F, -0.2613F, -0.0126F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(35, 67).mirror().addBox(-0.475F, -1.1902F, -1.1637F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.693F, -1.7771F, 1.4835F, -0.1222F, 0.0F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(-0.675F, -0.1288F, -3.1804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.5061F, -2.8535F, 1.2654F, 0.0F, 0.0F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(9, 47).mirror().addBox(-0.5002F, -0.6825F, 0.3515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6343F, 3.1222F, -0.3485F, 1.3788F, 0.0F, 0.0524F));

		PartDefinition upperarm1 = Bodyfront.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(27, 51).addBox(-0.3797F, -0.0885F, -0.9806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 68).addBox(-0.3797F, 5.1684F, -1.2832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.2551F, 6.0047F, -1.8577F, 1.0576F, 0.2197F, -0.4443F));

		PartDefinition upperarm4_r1 = upperarm1.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(50, 68).addBox(-0.5F, -0.825F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 5.2782F, -0.1496F, -1.1781F, 0.0F, 0.0F));

		PartDefinition upperarm4_r2 = upperarm1.addOrReplaceChild("upperarm4_r2", CubeListBuilder.create().texOffs(7, 57).addBox(-0.5F, -0.55F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 4.6934F, -0.5832F, 1.309F, 0.0F, 0.0F));

		PartDefinition upperarm5_r1 = upperarm1.addOrReplaceChild("upperarm5_r1", CubeListBuilder.create().texOffs(9, 52).addBox(-0.5F, -1.2F, -0.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1203F, 0.5875F, -1.1534F, -2.4435F, 0.0F, 0.0F));

		PartDefinition upperarm4_r3 = upperarm1.addOrReplaceChild("upperarm4_r3", CubeListBuilder.create().texOffs(71, 37).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1203F, 0.5875F, -1.1534F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm3_r1 = upperarm1.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(64, 68).addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1203F, 1.1115F, -0.6806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0873F, 5.6638F, -0.5001F, -1.0783F, 0.1764F, 1.6365F));

		PartDefinition lowerarm3_r1 = lowerarm1.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(59, 30).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8955F, -0.2335F, -0.2897F, 0.0791F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(38, 48).addBox(-0.5F, -1.75F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1779F, 1.0197F, -0.3384F, -0.3572F, 1.2533F, -0.3373F));

		PartDefinition lowerarm2_r2 = lowerarm1.addOrReplaceChild("lowerarm2_r2", CubeListBuilder.create().texOffs(5, 76).addBox(0.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3115F, 2.0518F, -0.2838F, -0.2961F, 1.2533F, -0.2064F));

		PartDefinition lowerarm1_r1 = lowerarm1.addOrReplaceChild("lowerarm1_r1", CubeListBuilder.create().texOffs(30, 68).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3239F, 4.1855F, -0.6257F, -0.2001F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0448F, 5.3251F, -1.0759F, 0.8905F, 1.2161F, -0.6661F));

		PartDefinition hand3_r1 = hand1.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(47, 6).addBox(0.9998F, -1.9393F, -3.2994F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.446F, 2.8812F, -1.6371F, -0.4498F, 0.2368F, -0.1128F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(21, 0).addBox(0.9998F, -1.9393F, -4.2994F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.446F, 2.8812F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(9, 43).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 1.6518F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(19, 82).addBox(0.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(70, 42).addBox(3.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = Bodyfront.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-0.6203F, -0.0885F, -0.9806F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 68).mirror().addBox(-0.6203F, 5.1684F, -1.2832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.2551F, 6.0047F, -1.8577F, 0.1493F, 0.175F, 0.5569F));

		PartDefinition upperarm5_r2 = upperarm2.addOrReplaceChild("upperarm5_r2", CubeListBuilder.create().texOffs(50, 68).mirror().addBox(-0.5F, -0.825F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 5.2782F, -0.1496F, -1.1781F, 0.0F, 0.0F));

		PartDefinition upperarm5_r3 = upperarm2.addOrReplaceChild("upperarm5_r3", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-0.5F, -0.55F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 4.6934F, -0.5832F, 1.309F, 0.0F, 0.0F));

		PartDefinition upperarm6_r1 = upperarm2.addOrReplaceChild("upperarm6_r1", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-0.5F, -1.2F, -0.65F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 0.5875F, -1.1534F, -2.4435F, 0.0F, 0.0F));

		PartDefinition upperarm5_r4 = upperarm2.addOrReplaceChild("upperarm5_r4", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 0.5875F, -1.1534F, -0.0436F, 0.0F, 0.0F));

		PartDefinition upperarm4_r4 = upperarm2.addOrReplaceChild("upperarm4_r4", CubeListBuilder.create().texOffs(64, 68).mirror().addBox(-0.5F, -1.475F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1203F, 1.1115F, -0.6806F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0873F, 5.6638F, -0.5001F, -0.5259F, 0.5218F, -1.0779F));

		PartDefinition lowerarm4_r1 = lowerarm2.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(59, 30).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8955F, -0.2335F, -0.2897F, 0.0791F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r2 = lowerarm2.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(38, 48).mirror().addBox(-0.5F, -1.75F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1779F, 1.0197F, -0.3384F, -0.3572F, -1.2533F, 0.3373F));

		PartDefinition lowerarm3_r3 = lowerarm2.addOrReplaceChild("lowerarm3_r3", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-1.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3115F, 2.0518F, -0.2838F, -0.2961F, -1.2533F, 0.2064F));

		PartDefinition lowerarm2_r3 = lowerarm2.addOrReplaceChild("lowerarm2_r3", CubeListBuilder.create().texOffs(30, 68).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3239F, 4.1855F, -0.6257F, -0.2001F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0448F, 5.3251F, -1.0759F, 0.7706F, -1.1226F, 0.072F));

		PartDefinition hand4_r1 = hand2.addOrReplaceChild("hand4_r1", CubeListBuilder.create().texOffs(47, 6).mirror().addBox(-1.9998F, -1.9393F, -3.2994F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.446F, 2.8812F, -1.6371F, -0.4498F, -0.2368F, 0.1128F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-3.9998F, -1.9393F, -4.2994F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.446F, 2.8812F, -1.6371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4807F, 1.6518F, -1.9835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r4 = hand2.addOrReplaceChild("hand3_r4", CubeListBuilder.create().texOffs(19, 82).mirror().addBox(-1.8417F, -0.3794F, 0.0272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r4 = hand2.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(70, 42).mirror().addBox(-5.0998F, -0.0153F, 0.0272F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0F, 1.7959F, 2.1196F));

		PartDefinition Bodyfront_r5 = bone2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(75, 77).addBox(-0.5F, 0.4068F, -1.3349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2261F, 4.3655F, -5.2253F, 1.9368F, 0.5153F, 0.4789F));

		PartDefinition Bodyfront_r6 = bone2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(44, 37).addBox(-0.5F, -0.9632F, -1.7552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2261F, 4.3655F, -5.2253F, 2.5477F, 0.5153F, 0.4789F));

		PartDefinition Bodyfront_r7 = bone2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(29, 82).addBox(-0.5F, -1.592F, 0.0718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2261F, 4.3655F, -5.2253F, 1.675F, 0.5153F, 0.4789F));

		PartDefinition Bodyfront_r8 = bone2.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.0734F, -1.1119F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2261F, 4.3655F, -5.2253F, 2.5913F, 0.5153F, 0.4789F));

		PartDefinition Bodyfront_r9 = bone2.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(40, 43).addBox(-0.4728F, -3.5017F, -2.1279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.2384F, 0.0824F, -4.0191F, 2.6859F, -0.0651F, -0.0338F));

		PartDefinition Bodyfront_r10 = bone2.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(57, 52).addBox(-0.4728F, -1.9595F, -3.1751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2384F, 0.0824F, -4.0191F, 2.1448F, -0.0651F, -0.0338F));

		PartDefinition Bodyfront_r11 = bone2.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(0, 79).addBox(-0.4728F, -3.0641F, -1.9369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2384F, 0.0824F, -4.0191F, 1.883F, -0.0651F, -0.0338F));

		PartDefinition Bodyfront_r12 = bone2.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(0, 64).addBox(-0.4793F, -0.3993F, 2.5017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2384F, 0.0824F, -4.0191F, 0.9667F, -0.0651F, -0.0338F));

		PartDefinition Bodyfront_r13 = bone2.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(32, 23).addBox(-0.4793F, -1.0053F, 0.3891F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2384F, 0.0824F, -4.0191F, 1.2285F, -0.0651F, -0.0338F));

		PartDefinition Bodyfront_r14 = bone2.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(0, 36).addBox(-0.4365F, -0.7636F, -0.5911F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8366F, 3.2103F, -6.7318F, 1.1549F, -0.134F, 0.2218F));

		PartDefinition Bodyfront_r15 = bone2.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(16, 68).addBox(-0.354F, -0.9109F, -1.8423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8366F, 3.2103F, -6.7318F, 1.8683F, -0.0823F, 0.4394F));

		PartDefinition Bodyfront_r16 = bone2.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(17, 8).addBox(-0.4793F, -1.1577F, -2.6837F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2384F, 0.0824F, -4.0191F, 1.054F, -0.0651F, -0.0338F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.7959F, 2.1196F));

		PartDefinition Bodyfront_r17 = bone4.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-0.5F, 0.4068F, -1.3349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2261F, 4.3655F, -5.2253F, 1.9368F, -0.5153F, -0.4789F));

		PartDefinition Bodyfront_r18 = bone4.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-0.5F, -0.9632F, -1.7552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2261F, 4.3655F, -5.2253F, 2.5477F, -0.5153F, -0.4789F));

		PartDefinition Bodyfront_r19 = bone4.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-0.5F, -1.592F, 0.0718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2261F, 4.3655F, -5.2253F, 1.675F, -0.5153F, -0.4789F));

		PartDefinition Bodyfront_r20 = bone4.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -0.0734F, -1.1119F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2261F, 4.3655F, -5.2253F, 2.5913F, -0.5153F, -0.4789F));

		PartDefinition Bodyfront_r21 = bone4.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(40, 43).mirror().addBox(-0.5272F, -3.5017F, -2.1279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 0.0824F, -4.0191F, 2.6859F, 0.0651F, 0.0338F));

		PartDefinition Bodyfront_r22 = bone4.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-0.5272F, -1.9595F, -3.1751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 0.0824F, -4.0191F, 2.1448F, 0.0651F, 0.0338F));

		PartDefinition Bodyfront_r23 = bone4.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5272F, -3.0641F, -1.9369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 0.0824F, -4.0191F, 1.883F, 0.0651F, 0.0338F));

		PartDefinition Bodyfront_r24 = bone4.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.5207F, -0.3993F, 2.5017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 0.0824F, -4.0191F, 0.9667F, 0.0651F, 0.0338F));

		PartDefinition Bodyfront_r25 = bone4.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(32, 23).mirror().addBox(-0.5207F, -1.0053F, 0.3891F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 0.0824F, -4.0191F, 1.2285F, 0.0651F, 0.0338F));

		PartDefinition Bodyfront_r26 = bone4.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.5635F, -0.7636F, -0.5911F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.8366F, 3.2103F, -6.7318F, 1.1549F, 0.134F, -0.2218F));

		PartDefinition Bodyfront_r27 = bone4.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(16, 68).mirror().addBox(-0.646F, -0.9109F, -1.8423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.8366F, 3.2103F, -6.7318F, 1.8683F, 0.0823F, -0.4394F));

		PartDefinition Bodyfront_r28 = bone4.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(17, 8).mirror().addBox(-0.5207F, -1.1577F, -2.6837F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 0.0824F, -4.0191F, 1.054F, 0.0651F, 0.0338F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(62, 73).addBox(-0.4892F, 5.4178F, 0.5448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 73).addBox(-0.4892F, -0.0822F, 0.5448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4698F, -5.5598F, 9.0001F, -0.3843F, -0.0893F, -0.2464F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -2.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0108F, 1.3178F, 1.6448F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(43, 54).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0108F, -0.395F, 1.0823F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(67, 73).addBox(-0.5F, -1.8F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0108F, 7.4508F, 1.6608F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(15, 74).addBox(-0.5F, 0.0407F, -1.4211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(10, 74).addBox(-0.5F, 0.0407F, -0.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0108F, 4.3178F, 1.9448F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(70, 63).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(70, 9).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0108F, 4.5178F, 1.0448F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(42, 69).addBox(-0.2F, -0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.2892F, 7.577F, 2.0435F, 0.7539F, -0.191F, 0.1061F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(32, 51).addBox(3.2F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.4F, 2.6F, 0.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(69, 68).addBox(3.2F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.4F, 2.8F, 1.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(13, 24).addBox(-0.5F, -0.0128F, -0.0686F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.6263F, -1.4194F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(70, 4).addBox(-0.5F, -3.0497F, -0.2289F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 2.8F, -1.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -1.7128F, -0.5686F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 1.5F, -0.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -0.4F, -2.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.0847F, -0.8126F, 0.2365F, 0.0F, 0.0F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create().texOffs(32, 11).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, -0.2173F, 0.0F, 0.0F));

		PartDefinition Rightopposabletoe = Righthindfoot.addOrReplaceChild("Rightopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1119F, 0.15F, 0.4609F, 0.0F, 0.3302F, 0.0F));

		PartDefinition Rightopposabletoe_r1 = Rightopposabletoe.addOrReplaceChild("Rightopposabletoe_r1", CubeListBuilder.create().texOffs(18, 48).addBox(-0.35F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(62, 73).mirror().addBox(-0.5108F, 5.4178F, 0.5448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 73).mirror().addBox(-0.5108F, -0.0822F, 0.5448F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4698F, -5.5598F, 9.0001F, 0.0084F, 0.0893F, 0.2464F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.5F, -2.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 1.3178F, 1.6448F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(43, 54).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, -0.395F, 1.0823F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(67, 73).mirror().addBox(-0.5F, -1.8F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 7.4508F, 1.6608F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.5F, 0.0407F, -1.4211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(10, 74).mirror().addBox(-0.5F, 0.0407F, -0.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 4.3178F, 1.9448F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(70, 9).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 4.5178F, 1.0448F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(42, 69).mirror().addBox(-0.8F, -0.2F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.2892F, 7.577F, 2.0435F, 1.0157F, 0.191F, -0.1061F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(32, 51).mirror().addBox(-4.2F, -0.2F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.4F, 2.6F, 0.9F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(69, 68).mirror().addBox(-4.2F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.4F, 2.8F, 1.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(13, 24).mirror().addBox(-0.5F, -0.0128F, -0.0686F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.6263F, -1.4194F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-0.5F, -3.0497F, -0.2289F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.8F, -1.3F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -1.7128F, -0.5686F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.5F, -0.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-1.5F, -0.4F, -2.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.0847F, -0.8126F, -0.1999F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create().texOffs(32, 11).mirror().addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, -0.4791F, 0.0F, 0.0F));

		PartDefinition Leftopposabletoe = Lefthindfoot.addOrReplaceChild("Leftopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1119F, 0.15F, 0.4609F, 0.0F, -0.3302F, 0.0F));

		PartDefinition Leftopposabletoe_r1 = Leftopposabletoe.addOrReplaceChild("Leftopposabletoe_r1", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(-0.65F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9695F, -8.9881F, 7.9588F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Hips_r4 = bone.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(63, 42).addBox(-0.1757F, 0.1592F, 0.0622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2F, 3.2F, -0.7309F, -0.0338F, -0.2138F));

		PartDefinition Hips_r5 = bone.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(81, 26).addBox(-0.1963F, 1.1842F, 0.4036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(36, 63).addBox(-0.1963F, 0.1842F, 0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.3F, -0.1898F, -0.0338F, -0.2138F));

		PartDefinition Hips_r6 = bone.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5F, -0.525F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.746F, 1.6804F, 3.0313F, 0.3512F, -0.0338F, -0.2138F));

		PartDefinition Hips_r7 = bone.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(53, 34).addBox(0.1579F, 0.0592F, -0.0932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.4F, 0.3076F, -0.0338F, -0.2138F));

		PartDefinition Hips_r8 = bone.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(63, 14).addBox(-0.0252F, -0.1654F, -0.6185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1767F, -0.0338F, -0.2138F));

		PartDefinition Hips_r9 = bone.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(16, 53).addBox(-0.625F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0577F, 3.2949F, 1.4608F, -1.3595F, -0.0471F, 0.0109F));

		PartDefinition Hips_r10 = bone.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(71, 54).addBox(-0.9937F, -2.5631F, -1.7011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, -2.8106F, -0.0828F, 0.1821F));

		PartDefinition Hips_r11 = bone.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(76, 52).addBox(-0.9895F, -3.3877F, -2.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(34, 76).addBox(-0.9895F, -3.3877F, -1.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, -2.2438F, -0.0809F, 0.1867F));

		PartDefinition Hips_r12 = bone.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(50, 65).addBox(-0.9705F, 0.3679F, -1.6934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, 2.3392F, -0.0945F, 0.1717F));

		PartDefinition Hips_r13 = bone.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(76, 49).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5493F, 4.9983F, 2.9957F, 2.9486F, -0.0809F, 0.1867F));

		PartDefinition Hips_r14 = bone.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(76, 37).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4929F, 4.85F, 4.0181F, -2.8546F, -0.0809F, 0.1867F));

		PartDefinition Hips_r15 = bone.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(20, 76).addBox(-0.9895F, -2.86F, -2.1034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, -2.5928F, -0.0809F, 0.1867F));

		PartDefinition Hips_r16 = bone.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(49, 42).addBox(-0.9937F, -2.3081F, -1.3448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, -3.0724F, -0.0828F, 0.1821F));

		PartDefinition Hips_r17 = bone.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(0, 53).addBox(-0.9937F, -2.3896F, 0.0521F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, 2.949F, -0.0828F, 0.1821F));

		PartDefinition Hips_r18 = bone.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(20, 43).addBox(-0.9937F, -0.0662F, 0.1732F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, -2.4615F, -0.0828F, 0.1821F));

		PartDefinition Hips_r19 = bone.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(71, 50).addBox(-0.9937F, 0.7792F, -1.5943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, -0.8907F, -0.0828F, 0.1821F));

		PartDefinition Hips_r20 = bone.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(70, 24).addBox(-0.9937F, 0.3792F, -0.8943F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.3167F, 4.383F, 1.1615F, -1.1962F, -0.0828F, 0.1821F));

		PartDefinition Hips_r21 = bone.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(50, 52).addBox(-1.0F, -2.175F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.4882F, 2.6522F, 1.9943F, -0.5993F, -0.0927F, -0.2192F));

		PartDefinition Hips_r22 = bone.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(43, 48).addBox(-0.5F, -1.45F, -0.875F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9667F, 3.183F, 0.6615F, -0.61F, 0.0202F, -0.0105F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9695F, -8.9881F, 7.9588F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Hips_r23 = bone3.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-0.8243F, 0.1592F, 0.0622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 3.2F, -0.7309F, 0.0338F, 0.2138F));

		PartDefinition Hips_r24 = bone3.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(81, 26).mirror().addBox(-0.8037F, 1.1842F, 0.4036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(36, 63).mirror().addBox(-0.8037F, 0.1842F, 0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 1.3F, -0.1898F, 0.0338F, 0.2138F));

		PartDefinition Hips_r25 = bone3.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(59, 21).mirror().addBox(-0.5F, -0.525F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.746F, 1.6804F, 3.0313F, 0.3512F, 0.0338F, 0.2138F));

		PartDefinition Hips_r26 = bone3.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-1.1579F, 0.0592F, -0.0932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -0.4F, 0.3076F, 0.0338F, 0.2138F));

		PartDefinition Hips_r27 = bone3.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(63, 14).mirror().addBox(-0.9748F, -0.1654F, -0.6185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1767F, 0.0338F, 0.2138F));

		PartDefinition Hips_r28 = bone3.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(16, 53).mirror().addBox(-0.375F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0577F, 3.2949F, 1.4608F, -1.3595F, 0.0471F, -0.0109F));

		PartDefinition Hips_r29 = bone3.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(71, 54).mirror().addBox(-0.0063F, -2.5631F, -1.7011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, -2.8106F, 0.0828F, -0.1821F));

		PartDefinition Hips_r30 = bone3.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-0.0105F, -3.3877F, -2.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(34, 76).mirror().addBox(-0.0105F, -3.3877F, -1.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, -2.2438F, 0.0809F, -0.1867F));

		PartDefinition Hips_r31 = bone3.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-0.0295F, 0.3679F, -1.6934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, 2.3392F, 0.0945F, -0.1717F));

		PartDefinition Hips_r32 = bone3.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5493F, 4.9983F, 2.9957F, 2.9486F, 0.0809F, -0.1867F));

		PartDefinition Hips_r33 = bone3.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.4929F, 4.85F, 4.0181F, -2.8546F, 0.0809F, -0.1867F));

		PartDefinition Hips_r34 = bone3.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.0105F, -2.86F, -2.1034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, -2.5928F, 0.0809F, -0.1867F));

		PartDefinition Hips_r35 = bone3.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(49, 42).mirror().addBox(-0.0063F, -2.3081F, -1.3448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, -3.0724F, 0.0828F, -0.1821F));

		PartDefinition Hips_r36 = bone3.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.0063F, -2.3896F, 0.0521F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, 2.949F, 0.0828F, -0.1821F));

		PartDefinition Hips_r37 = bone3.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(20, 43).mirror().addBox(-0.0063F, -0.0662F, 0.1732F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, -2.4615F, 0.0828F, -0.1821F));

		PartDefinition Hips_r38 = bone3.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(71, 50).mirror().addBox(-0.0063F, 0.7792F, -1.5943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, -0.8907F, 0.0828F, -0.1821F));

		PartDefinition Hips_r39 = bone3.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.0063F, 0.3792F, -0.8943F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.3167F, 4.383F, 1.1615F, -1.1962F, 0.0828F, -0.1821F));

		PartDefinition Hips_r40 = bone3.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(0.0F, -2.175F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.4882F, 2.6522F, 1.9943F, -0.5993F, 0.0927F, 0.2192F));

		PartDefinition Hips_r41 = bone3.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-0.5F, -1.45F, -0.875F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9667F, 3.183F, 0.6615F, -0.61F, -0.0202F, 0.0105F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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