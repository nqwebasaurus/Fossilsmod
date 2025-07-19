package fossils.fossils.client.blockentity.model.suminia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SuminiaFossilModel extends SkullModelBase {
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
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Uppermiddleteeth;
	private final ModelPart Upperbackteeth;
	private final ModelPart Browslope;
	private final ModelPart Snoutslope;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Rightthumb;
	private final ModelPart Righthand2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart Leftthumb;
	private final ModelPart Lefthand2;
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

	public SuminiaFossilModel(ModelPart root) {
		this.root = root.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Uppermiddleteeth = this.Upperjawfront.getChild("Uppermiddleteeth");
		this.Upperbackteeth = this.Upperjawback.getChild("Upperbackteeth");
		this.Browslope = this.Head.getChild("Browslope");
		this.Snoutslope = this.Browslope.getChild("Snoutslope");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Rightthumb = this.Righthand.getChild("Rightthumb");
		this.Righthand2 = this.Righthand.getChild("Righthand2");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.Leftthumb = this.Lefthand.getChild("Leftthumb");
		this.Lefthand2 = this.Lefthand.getChild("Lefthand2");
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

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.25F, -0.4F, -0.4787F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(80, 30).addBox(0.0F, -1.2F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(20, 80).addBox(0.0F, -1.1F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 80).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(15, 0).addBox(-0.5F, -0.2F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -7.8941F, 5.5588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-1.2F, -1.2F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(-0.9F, -1.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(-0.7F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -8.1743F, 8.0929F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 80).addBox(1.2F, -1.2F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 80).addBox(0.9F, -1.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 80).addBox(0.7F, -1.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -8.1743F, 8.0929F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4942F, 12.4588F, 0.154F, 0.3396F, 0.0931F));

		PartDefinition Tail4_r1 = Tail1.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(3, 81).addBox(0.0F, -2.125F, 5.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 80).addBox(0.0F, -2.15F, 3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 80).addBox(0.0F, -2.2F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-0.5F, -1.2F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail5_r1 = Tail1.addOrReplaceChild("Tail5_r1", CubeListBuilder.create().texOffs(78, 6).addBox(0.0F, 0.9146F, 1.8788F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 77).addBox(0.0F, -0.0854F, -0.1212F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4768F, 2.2697F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(67, 78).addBox(0.0F, -0.1653F, 0.003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.1598F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6283F, -0.0494F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F))
				.texOffs(6, 81).addBox(0.0F, -1.3283F, 0.9506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(81, 6).addBox(0.0F, -1.2283F, 2.9506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(9, 81).addBox(0.0F, -1.2283F, 4.9506F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.6624F, 5.7402F, 0.0115F, 0.5618F, 0.0945F));

		PartDefinition Tail8_r1 = Tail2.addOrReplaceChild("Tail8_r1", CubeListBuilder.create().texOffs(78, 42).addBox(0.0F, 2.3146F, 7.8788F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 24).addBox(0.0F, 2.1146F, 5.8788F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 77).addBox(0.0F, 1.8146F, 3.8788F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1856F, -3.4706F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(30, 16).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(12, 81).addBox(0.0F, -1.1605F, 0.9414F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 12).addBox(0.0F, -1.0855F, 2.9414F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0283F, 5.9506F, 0.2554F, 0.2958F, 0.2871F));

		PartDefinition Tail10_r1 = Tail3.addOrReplaceChild("Tail10_r1", CubeListBuilder.create().texOffs(26, 81).addBox(0.0F, 3.8146F, 11.8788F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 78).addBox(0.0F, 2.5146F, 9.8788F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1573F, -9.4212F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 81).addBox(0.0F, -1.0605F, 0.9414F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 81).addBox(0.0F, -0.9605F, 2.9414F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.925F, 0.0714F, 0.5661F, 0.0384F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(39, 22).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(81, 24).addBox(0.0F, -0.8855F, 0.9414F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, -0.0733F, 0.3474F, 0.0346F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(11, 36).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, -0.0436F, 0.6104F, -0.025F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(22, 36).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, 0.0051F, 0.261F, -0.0212F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(15, 8).addBox(-0.5F, -0.5855F, -0.0586F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.1134F, 0.3908F, -0.04F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.8626F, -4.8347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(79, 67).addBox(0.0F, -1.6626F, -4.8347F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 70).addBox(0.0F, -1.5876F, -2.8347F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1191F, 6.5588F, 0.1328F, -0.2163F, -0.0287F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(79, 73).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0126F, -0.3347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -0.3342F, 0.0206F, -0.0323F, -0.9058F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -0.3342F, -0.007F, -0.02F, -1.4504F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -2.3342F, -0.0097F, -0.0497F, -0.7475F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 53).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -2.3342F, -0.0238F, -0.0506F, -1.2927F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.0811F, 0.0025F, -0.61F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.0268F, 0.0411F, -1.1533F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3903F, -4.3342F, 0.0026F, 0.049F, -1.6774F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 14).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -0.3342F, -0.007F, 0.02F, 1.4504F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -0.3342F, 0.0206F, 0.0323F, 0.9058F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 53).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -2.3342F, -0.0238F, 0.0506F, 1.2927F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -2.3342F, -0.0097F, 0.0497F, 0.7475F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 79).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.0026F, -0.049F, 1.6774F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 31).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.0268F, -0.0411F, 1.1533F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3903F, -4.3342F, 0.0811F, -0.0025F, 0.61F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(33, 46).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4505F, -6.0856F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(32, 42).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9546F, -3.4375F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(23, 42).addBox(-1.5F, -1.9F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6374F, 0.0653F, 0.4363F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(26, 22).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(79, 61).addBox(0.0F, -1.5F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 64).addBox(0.0F, -1.5F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2626F, -4.7847F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.066F, -0.0062F, -0.5227F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(52, 29).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.0183F, 0.0258F, -1.0664F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 64).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5495F, 0.003F, 0.0315F, -1.5902F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(79, 2).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.1114F, 0.02F, -0.4875F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.0437F, 0.0716F, -1.0302F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5495F, 0.002F, 0.0839F, -1.5553F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 64).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.003F, -0.0315F, 1.5902F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 29).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.0183F, -0.0258F, 1.0664F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(79, 4).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5495F, 0.066F, 0.0062F, 0.5227F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(52, 18).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.002F, -0.0839F, 1.5553F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(52, 27).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.0437F, -0.0716F, 1.0302F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(79, 2).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5495F, 0.1114F, -0.02F, 0.4875F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.95F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition Bodymiddle_r5 = body2.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(79, 58).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r6 = body2.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(64, 78).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.0357F, -0.0236F, -0.4524F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.0015F, -0.0047F, -0.9967F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(41, 19).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -0.5995F, 0.0036F, -0.0034F, -1.5203F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(78, 28).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.0811F, 0.0025F, -0.4006F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.0268F, 0.0411F, -0.9439F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(39, 32).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -2.5995F, 0.0026F, 0.049F, -1.468F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(39, 30).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.002F, 0.0839F, -1.468F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 2).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.0437F, 0.0716F, -0.943F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -4.5995F, 0.1114F, 0.02F, -0.4002F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(41, 19).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.0036F, 0.0034F, 1.5203F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 12).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.0015F, 0.0047F, 0.9967F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(78, 46).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -0.5995F, 0.0357F, 0.0236F, 0.4524F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(39, 32).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.0026F, -0.049F, 1.468F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 10).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.0268F, -0.0411F, 0.9439F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(78, 28).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -2.5995F, 0.0811F, -0.0025F, 0.4006F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(78, 10).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.1114F, -0.02F, 0.4002F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(52, 2).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.0437F, -0.0716F, 0.943F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(39, 30).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -4.5995F, 0.002F, -0.0839F, 1.468F));

		PartDefinition Bodymiddle_r7 = body2.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(61, 78).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 29).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(51, 79).addBox(0.0F, -1.6F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.1056F, -0.1302F, -0.0138F));

		PartDefinition Bodymiddle_r8 = body3.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(58, 78).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(39, 28).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, 0.0036F, -0.0034F, -1.4854F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, 0.0015F, -0.0047F, -0.9618F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -1.5995F, 0.0357F, -0.0236F, -0.4175F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.0811F, 0.0025F, -0.4529F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 38).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.0268F, 0.0411F, -0.9963F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(39, 34).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1277F, -3.5995F, 0.0026F, 0.049F, -1.5204F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(78, 0).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, 0.0357F, 0.0236F, 0.4175F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(52, 0).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, 0.0015F, 0.0047F, 0.9618F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(39, 28).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -1.5995F, 0.0036F, 0.0034F, 1.4854F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(39, 34).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.0026F, -0.049F, 1.5204F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 38).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.0268F, -0.0411F, 0.9963F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(77, 37).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1277F, -3.5995F, 0.0811F, -0.0025F, 0.4529F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -4.875F, -0.0249F, -0.0872F, 0.0022F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(48, 79).addBox(0.0F, -1.5F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(45, 79).addBox(0.0F, -1.35F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.9959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(41, 10).addBox(-1.5F, -1.0319F, -2.1076F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.2959F, -3.2804F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -1.1883F, -1.9395F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.9959F, -1.5804F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(30, 10).addBox(-0.5F, -1.5F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.7959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 39).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, 0.2633F, 0.1065F, -0.6175F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, 0.1301F, 0.2239F, -1.1571F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(7, 52).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4473F, -2.5245F, -0.0015F, 0.2584F, -1.6955F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.1568F, 0.0461F, -0.5209F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.0692F, 0.1174F, -1.0627F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(30, 53).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1473F, -0.5245F, 0.0009F, 0.1362F, -1.5903F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(7, 52).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, -0.0015F, -0.2584F, 1.6955F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(50, 8).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, 0.1301F, -0.2239F, 1.1571F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(79, 39).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4473F, -2.5245F, 0.2633F, -0.1065F, 0.6175F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 53).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.0009F, -0.1362F, 1.5903F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(7, 54).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.0692F, -0.1174F, 1.0627F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(30, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1473F, -0.5245F, 0.1568F, -0.0461F, 0.5209F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4959F, -3.8054F, -0.4572F, -0.3115F, -0.0363F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(44, 55).addBox(0.0F, -0.8F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.011F, -6.0139F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1514F, -0.4191F, 0.6631F, 0.5773F, -0.6311F));

		PartDefinition cube_r70 = Neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 16).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1514F, -0.4191F, 0.1935F, 0.8212F, -1.2771F));

		PartDefinition cube_r71 = Neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(35, 79).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1514F, -0.4191F, 0.6631F, -0.5773F, 0.6311F));

		PartDefinition cube_r72 = Neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(64, 16).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1514F, -0.4191F, 0.1935F, -0.8212F, 1.2771F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.8F, 4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.589F, -6.0139F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1862F, -1.8525F, -0.3308F, -0.2079F, -0.0652F));

		PartDefinition Neck_r3 = neck2.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(32, 81).addBox(0.0F, -0.8F, 3.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 47).addBox(0.0F, -0.8F, 5.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2222F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-1.9348F, 0.0814F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0652F, -0.5666F, 0.3761F, 0.9258F, -1.1228F));

		PartDefinition cube_r74 = neck2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(17, 64).addBox(-0.0652F, 0.0814F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0652F, -0.5666F, 0.3761F, -0.9258F, 1.1228F));

		PartDefinition Neck_r4 = neck2.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.8F, 3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4778F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.0206F, -2.2797F, 0.259F, -0.306F, -0.2147F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(71, 50).mirror().addBox(-0.5F, -0.7F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7333F, 0.8293F, -0.2806F, -2.4057F, 0.007F, -0.3537F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.8788F, -2.6725F, -2.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 65).mirror().addBox(-0.8788F, -2.4475F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(10, 66).mirror().addBox(-0.8788F, -2.1475F, -2.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, 3.1052F, 0.007F, -0.3537F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-0.4272F, -2.4915F, -1.5421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(64, 69).mirror().addBox(-0.4272F, -2.8915F, -1.5421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0868F, 0.3381F, -3.7105F, -1.2655F, -0.4122F, -0.1198F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(60, 37).mirror().addBox(-0.525F, -0.5F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 30).mirror().addBox(-0.575F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3822F, -2.6032F, -2.669F, -0.0525F, -0.0433F, 0.0057F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(-1.1059F, -1.7154F, 1.1132F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.9053F, 0.4419F, 0.1244F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.1059F, -1.2918F, 1.034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.6435F, 0.4419F, 0.1244F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(41, 42).mirror().addBox(-0.4242F, -0.6148F, 0.0289F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.1449F, 0.0196F, 0.4376F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-0.4873F, -2.7359F, 0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -1.4466F, -0.0174F, -0.3096F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-0.4873F, -2.5947F, 0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -1.3419F, -0.0174F, -0.3096F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-0.4873F, -2.09F, 1.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.9928F, -0.0174F, -0.3096F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-0.4873F, -1.5724F, 1.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.6786F, -0.0174F, -0.3096F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.4873F, -1.2673F, 1.0171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.4866F, -0.0174F, -0.3096F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.4873F, -0.9519F, 0.8016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.2598F, -0.0174F, -0.3096F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(74, 3).mirror().addBox(-0.4873F, -0.755F, 0.4984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, -0.0852F, -0.0174F, -0.3096F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-0.4873F, -0.4746F, 0.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, 0.2508F, -0.0174F, -0.3096F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.425F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.35F, -2.4691F, -2.3323F, 0.4712F, -0.0952F, -0.3492F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-1.0503F, -0.8492F, -2.4378F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, 2.9399F, 0.1845F, -0.9887F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(71, 13).mirror().addBox(-0.8931F, -1.06F, -3.1893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0868F, -1.2119F, -1.8105F, 2.538F, 0.007F, -0.3537F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.6563F, 1.0548F, -0.1145F, 2.2063F, 0.007F, -0.3537F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(54, 63).mirror().addBox(-0.5F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.1256F, -0.2315F, -0.3747F, 3.0921F, 0.007F, -0.3537F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(54, 70).mirror().addBox(-0.8788F, -0.4051F, -2.4686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, 2.538F, 0.007F, -0.3537F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(37, 55).mirror().addBox(-0.8967F, -1.9948F, -2.5003F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, 3.0347F, 0.1951F, -0.3608F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(49, 70).mirror().addBox(-0.8788F, -0.8777F, -2.3922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, 2.9743F, 0.007F, -0.3537F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-0.8788F, -1.1233F, -2.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(70, 33).mirror().addBox(-0.8788F, -1.1233F, -2.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, -3.0035F, 0.007F, -0.3537F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-0.8324F, -1.7018F, -1.4002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, -2.1805F, 0.0051F, -0.2317F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-0.8324F, -1.5771F, -1.8917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 70).mirror().addBox(-0.8324F, -1.5771F, -2.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, -2.6169F, 0.0051F, -0.2317F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.8324F, -1.6816F, -1.7363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, -2.3114F, 0.0051F, -0.2317F));

		PartDefinition Head_r28 = Head.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.8324F, -2.0283F, -0.4582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, -1.4301F, 0.0051F, -0.2317F));

		PartDefinition Head_r29 = Head.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5404F, -1.1595F, -0.3997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(50, 73).mirror().addBox(-0.5404F, -0.9095F, -0.3997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7129F, -1.8817F, -2.4272F, 0.2834F, -0.2213F, 0.2723F));

		PartDefinition Head_r30 = Head.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-0.5404F, -1.2033F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 73).mirror().addBox(-0.5404F, -0.9533F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(73, 28).mirror().addBox(-0.5404F, -0.5533F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.7129F, -1.8817F, -2.4272F, -0.0657F, -0.2213F, 0.2723F));

		PartDefinition Head_r31 = Head.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(55, 24).mirror().addBox(-0.2398F, -0.4513F, -0.2624F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4237F, -2.6525F, -2.2375F, 0.2413F, -0.0227F, 0.3544F));

		PartDefinition Head_r32 = Head.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(0.0089F, -0.0198F, -0.9617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -2.7902F, -2.7088F, -0.1363F, -0.3124F, 0.0718F));

		PartDefinition Head_r33 = Head.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-0.018F, -0.3006F, -1.9294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -2.7902F, -2.7088F, 0.1841F, -0.3454F, 0.0069F));

		PartDefinition Head_r34 = Head.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(49, 63).mirror().addBox(-0.374F, -1.214F, -1.1076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.0868F, 0.3381F, -3.9105F, -1.387F, -0.4815F, -0.1239F));

		PartDefinition Head_r35 = Head.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-0.374F, -1.3716F, -0.8906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0868F, 0.3381F, -3.9105F, -1.1689F, -0.4815F, -0.1239F));

		PartDefinition Head_r36 = Head.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(63, 44).mirror().addBox(-0.374F, -1.516F, -0.4879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-1.0868F, 0.3381F, -3.9105F, -0.8198F, -0.4815F, -0.1239F));

		PartDefinition Head_r37 = Head.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-0.5355F, -0.169F, -0.4368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7129F, -1.8817F, -2.4272F, -0.0459F, -0.2908F, 0.1996F));

		PartDefinition Head_r38 = Head.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(5, 63).mirror().addBox(-0.3848F, -1.7127F, -0.3426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.1868F, -1.4619F, -1.8105F, -1.3966F, -0.3428F, -0.1165F));

		PartDefinition Head_r39 = Head.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.4272F, -2.8111F, -0.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0868F, 0.3381F, -3.9105F, -0.8292F, -0.4122F, -0.1198F));

		PartDefinition Head_r40 = Head.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(73, 25).mirror().addBox(-0.6064F, 0.1937F, -0.4368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-1.7129F, -1.8817F, -2.4272F, -0.0065F, -0.2943F, 0.0629F));

		PartDefinition Head_r41 = Head.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(64, 65).addBox(-0.982F, -0.3006F, -1.9294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.675F, -2.7902F, -2.7088F, 0.1841F, 0.3454F, -0.0069F));

		PartDefinition Head_r42 = Head.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(16, 55).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9321F, -3.6351F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r43 = Head.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(44, 64).addBox(-0.99F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.0613F, -2.1379F, -1.693F, 0.0F, 0.0F));

		PartDefinition Head_r44 = Head.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(29, 66).addBox(-0.99F, -1.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(15, 73).addBox(-0.99F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5579F, -1.5407F, -1.3875F, 0.0F, 0.0F));

		PartDefinition Head_r45 = Head.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(64, 40).addBox(-0.99F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, -0.8035F, 0.0212F, -1.7366F, 0.0F, 0.0F));

		PartDefinition Head_r46 = Head.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(61, 27).addBox(-1.49F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.194F, 0.1078F, -1.789F, 0.0F, 0.0F));

		PartDefinition Head_r47 = Head.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(36, 59).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.1788F, -0.0658F, -1.3963F, 0.0F, 0.0F));

		PartDefinition Head_r48 = Head.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(29, 59).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6405F, -0.9528F, -0.48F, 0.0F, 0.0F));

		PartDefinition Head_r49 = Head.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(61, 11).addBox(-1.99F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -2.7711F, -1.9443F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r50 = Head.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(30, 70).addBox(-0.1676F, -1.7018F, -1.4002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, -2.1805F, -0.0051F, 0.2317F));

		PartDefinition Head_r51 = Head.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(25, 70).addBox(-0.1676F, -1.5771F, -1.8917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 70).addBox(-0.1676F, -1.5771F, -2.0917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, -2.6169F, -0.0051F, 0.2317F));

		PartDefinition Head_r52 = Head.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(71, 13).addBox(-0.1069F, -1.06F, -3.1893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1068F, -1.2119F, -1.8105F, 2.538F, -0.007F, 0.3537F));

		PartDefinition Head_r53 = Head.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.6764F, 1.0548F, -0.1145F, 2.2063F, -0.007F, 0.3537F));

		PartDefinition Head_r54 = Head.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(71, 50).addBox(-0.5F, -0.7F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7533F, 0.8293F, -0.2806F, -2.4057F, -0.007F, 0.3537F));

		PartDefinition Head_r55 = Head.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(54, 63).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.1456F, -0.2315F, -0.3747F, 3.0921F, -0.007F, 0.3537F));

		PartDefinition Head_r56 = Head.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(59, 58).addBox(-0.9497F, -0.8492F, -2.4378F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, 2.9399F, -0.1845F, 0.9887F));

		PartDefinition Head_r57 = Head.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(15, 66).addBox(-0.1212F, -2.6725F, -2.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 65).addBox(-0.1212F, -2.4475F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(10, 66).addBox(-0.1212F, -2.1475F, -2.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, 3.1052F, -0.007F, 0.3537F));

		PartDefinition Head_r58 = Head.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(37, 55).addBox(-1.1033F, -1.9948F, -2.5003F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, 3.0347F, -0.1951F, 0.3608F));

		PartDefinition Head_r59 = Head.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(54, 70).addBox(-0.1212F, -0.4051F, -2.4686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, 2.538F, -0.007F, 0.3537F));

		PartDefinition Head_r60 = Head.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(49, 70).addBox(-0.1212F, -0.8777F, -2.3922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, 2.9743F, -0.007F, 0.3537F));

		PartDefinition Head_r61 = Head.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(35, 70).addBox(-0.1212F, -1.1233F, -2.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(70, 33).addBox(-0.1212F, -1.1233F, -2.44F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, -3.0035F, -0.007F, 0.3537F));

		PartDefinition Head_r62 = Head.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(10, 70).addBox(-0.1676F, -1.6816F, -1.7363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, -2.3114F, -0.0051F, 0.2317F));

		PartDefinition Head_r63 = Head.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(5, 70).addBox(-0.1676F, -2.0283F, -0.4582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, -1.4301F, -0.0051F, 0.2317F));

		PartDefinition Head_r64 = Head.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(5, 63).addBox(-0.6152F, -1.7127F, -0.3426F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2068F, -1.4619F, -1.8105F, -1.3966F, 0.3428F, 0.1165F));

		PartDefinition Head_r65 = Head.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(40, 71).addBox(-0.5728F, -2.4915F, -1.5421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(64, 69).addBox(-0.5728F, -2.8915F, -1.5421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1068F, 0.3381F, -3.7105F, -1.2655F, 0.4122F, 0.1198F));

		PartDefinition Head_r66 = Head.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(49, 63).addBox(-0.626F, -1.214F, -1.1076F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.1068F, 0.3381F, -3.9105F, -1.387F, 0.4815F, 0.1239F));

		PartDefinition Head_r67 = Head.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(63, 48).addBox(-0.626F, -1.3716F, -0.8906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1068F, 0.3381F, -3.9105F, -1.1689F, 0.4815F, 0.1239F));

		PartDefinition Head_r68 = Head.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(63, 44).addBox(-0.626F, -1.516F, -0.4879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.1068F, 0.3381F, -3.9105F, -0.8198F, 0.4815F, 0.1239F));

		PartDefinition Head_r69 = Head.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5728F, -2.8111F, -0.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1068F, 0.3381F, -3.9105F, -0.8292F, 0.4122F, 0.1198F));

		PartDefinition Head_r70 = Head.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(73, 46).addBox(-0.4596F, -1.2033F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 73).addBox(-0.4596F, -0.9533F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(73, 28).addBox(-0.4596F, -0.5533F, -0.4518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.7329F, -1.8817F, -2.4272F, -0.0657F, 0.2213F, -0.2723F));

		PartDefinition Head_r71 = Head.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(0, 74).addBox(-0.4596F, -1.1595F, -0.3997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(50, 73).addBox(-0.4596F, -0.9095F, -0.3997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7329F, -1.8817F, -2.4272F, 0.2834F, 0.2213F, -0.2723F));

		PartDefinition Head_r72 = Head.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(76, 52).addBox(-0.4645F, -0.169F, -0.4368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7329F, -1.8817F, -2.4272F, -0.0459F, 0.2908F, -0.1996F));

		PartDefinition Head_r73 = Head.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(73, 25).addBox(-0.3936F, 0.1937F, -0.4368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.7329F, -1.8817F, -2.4272F, -0.0065F, 0.2943F, -0.0629F));

		PartDefinition Head_r74 = Head.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(61, 8).addBox(-1.99F, 0.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8016F, -2.6436F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r75 = Head.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(25, 73).addBox(-1.0F, -0.125F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, -3.4135F, -2.6908F, 1.5272F, 0.0F, 0.0F));

		PartDefinition Head_r76 = Head.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(55, 20).addBox(-1.0F, -0.25F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -2.8669F, -3.1394F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Head_r77 = Head.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(77, 18).addBox(-0.5127F, -2.7359F, 0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -1.4466F, 0.0174F, 0.3096F));

		PartDefinition Head_r78 = Head.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(77, 15).addBox(-0.5127F, -2.5947F, 0.7962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -1.3419F, 0.0174F, 0.3096F));

		PartDefinition Head_r79 = Head.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(40, 74).addBox(-0.5127F, -2.09F, 1.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.9928F, 0.0174F, 0.3096F));

		PartDefinition Head_r80 = Head.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(74, 39).addBox(-0.5127F, -1.5724F, 1.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.6786F, 0.0174F, 0.3096F));

		PartDefinition Head_r81 = Head.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5127F, -1.2673F, 1.0171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.4866F, 0.0174F, 0.3096F));

		PartDefinition Head_r82 = Head.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(20, 74).addBox(-0.5127F, -0.9519F, 0.8016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.2598F, 0.0174F, 0.3096F));

		PartDefinition Head_r83 = Head.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(74, 3).addBox(-0.5127F, -0.755F, 0.4984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.0852F, 0.0174F, 0.3096F));

		PartDefinition Head_r84 = Head.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(76, 55).addBox(-0.5127F, -0.4746F, 0.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, 0.2508F, 0.0174F, 0.3096F));

		PartDefinition Head_r85 = Head.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(0, 56).addBox(-0.575F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.37F, -2.4691F, -2.3323F, 0.4712F, 0.0952F, 0.3492F));

		PartDefinition Head_r86 = Head.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(7, 60).addBox(-0.8941F, -1.7154F, 1.1132F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.9053F, -0.4419F, -0.1244F));

		PartDefinition Head_r87 = Head.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(0, 60).addBox(-0.8941F, -1.2918F, 1.034F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.6435F, -0.4419F, -0.1244F));

		PartDefinition Head_r88 = Head.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(41, 42).addBox(-1.5758F, -0.6148F, 0.0289F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, -0.1449F, -0.0196F, -0.4376F));

		PartDefinition Head_r89 = Head.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(55, 24).addBox(-1.7602F, -0.4513F, -0.2624F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4437F, -2.6525F, -2.2375F, 0.2413F, 0.0227F, -0.3544F));

		PartDefinition Head_r90 = Head.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(60, 37).addBox(-1.475F, -0.5F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 30).addBox(-1.425F, -0.5F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4022F, -2.6032F, -2.669F, -0.0525F, 0.0433F, -0.0057F));

		PartDefinition Head_r91 = Head.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(69, 69).addBox(-1.0089F, -0.0198F, -0.9617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.675F, -2.7902F, -2.7088F, -0.1363F, 0.3124F, -0.0718F));

		PartDefinition Head_r92 = Head.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(61, 0).addBox(-1.99F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, -2.9321F, -3.6351F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.652F, -0.2145F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(0.0F, -0.316F, -2.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, -0.4363F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(0.0F, 0.3245F, -1.863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(74, 71).mirror().addBox(0.0F, -0.6755F, -0.863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, -0.9163F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(50, 76).mirror().addBox(-0.2F, -0.8184F, 0.1526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 31).mirror().addBox(-0.2F, -0.8184F, -0.4474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, -1.4835F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(0.0F, -0.9038F, -1.6199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, -0.6109F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(57, 14).mirror().addBox(0.0F, -1.5439F, -3.3624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, 0.1309F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r6 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.0081F, -0.8978F, -0.8124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 0.2F, -3.6F, 0.1658F, -0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r7 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(0.0343F, -0.4211F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(15, 76).mirror().addBox(0.0343F, -1.0211F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.2F, -5.475F, 0.8727F, -0.096F, 0.0F));

		PartDefinition Lowerjawbase_r8 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.0081F, -0.9543F, -2.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 76).mirror().addBox(-0.0081F, -0.9543F, -1.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 0.2F, -3.6F, 0.2618F, -0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r9 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-0.175F, -2.8064F, -3.3393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, 0.2618F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r10 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(45, 76).mirror().addBox(-0.1831F, -1.7765F, -1.156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(66, 52).mirror().addBox(-0.1831F, -1.9765F, -1.956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 76).mirror().addBox(-0.0081F, -1.1069F, -1.8391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 0.2F, -3.6F, 0.0873F, -0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r11 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r11", CubeListBuilder.create().texOffs(39, 66).mirror().addBox(-0.1407F, -2.0162F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.2F, -5.475F, 0.4363F, -0.096F, 0.0F));

		PartDefinition Lowerjawbase_r12 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r12", CubeListBuilder.create().texOffs(34, 66).mirror().addBox(-0.1407F, -2.4414F, -1.3443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.2F, -5.475F, 0.5672F, -0.096F, 0.0F));

		PartDefinition Lowerjawbase_r13 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r13", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(0.0343F, -0.8478F, -0.5738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.73F, 0.2F, -5.475F, 0.3491F, -0.096F, 0.0F));

		PartDefinition Lowerjawbase_r14 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r14", CubeListBuilder.create().texOffs(65, 75).mirror().addBox(-0.0081F, -1.2155F, -0.818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 0.2F, -3.6F, 0.2182F, -0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r15 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r15", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(0.0F, -2.6938F, -2.9138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, 0.3927F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r16 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r16", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(0.0F, -1.8768F, -2.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, 0.0436F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r17 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r17", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(0.0F, -1.5496F, -2.0195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 0.4F, -0.2F, -0.1309F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r18 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r18", CubeListBuilder.create().texOffs(74, 74).addBox(-1.0F, -0.316F, -2.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, -0.4363F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r19 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r19", CubeListBuilder.create().texOffs(57, 4).addBox(-1.0F, 0.3245F, -1.863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(74, 71).addBox(-1.0F, -0.6755F, -0.863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, -0.9163F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r20 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r20", CubeListBuilder.create().texOffs(50, 76).addBox(-0.8F, -0.8184F, 0.1526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 31).addBox(-0.8F, -0.8184F, -0.4474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, -1.4835F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r21 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r21", CubeListBuilder.create().texOffs(74, 68).addBox(-1.0F, -0.9038F, -1.6199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, -0.6109F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r22 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r22", CubeListBuilder.create().texOffs(57, 14).addBox(-1.0F, -1.5439F, -3.3624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, 0.1309F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r23 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r23", CubeListBuilder.create().texOffs(5, 76).addBox(-0.9919F, -0.8978F, -0.8124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1F, 0.2F, -3.6F, 0.1658F, 0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r24 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r24", CubeListBuilder.create().texOffs(30, 76).addBox(-1.0343F, -0.4211F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(15, 76).addBox(-1.0343F, -1.0211F, -1.073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.2F, -5.475F, 0.8727F, 0.096F, 0.0F));

		PartDefinition Lowerjawbase_r25 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r25", CubeListBuilder.create().texOffs(35, 76).addBox(-0.9919F, -0.9543F, -2.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 76).addBox(-0.9919F, -0.9543F, -1.7793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.1F, 0.2F, -3.6F, 0.2618F, 0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r26 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r26", CubeListBuilder.create().texOffs(76, 49).addBox(-0.825F, -2.8064F, -3.3393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, 0.2618F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r27 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r27", CubeListBuilder.create().texOffs(45, 76).addBox(-0.8169F, -1.7765F, -1.156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(66, 52).addBox(-0.8169F, -1.9765F, -1.956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 76).addBox(-0.9919F, -1.1069F, -1.8391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1F, 0.2F, -3.6F, 0.0873F, 0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r28 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r28", CubeListBuilder.create().texOffs(39, 66).addBox(-0.8593F, -2.0162F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.75F, 0.2F, -5.475F, 0.4363F, 0.096F, 0.0F));

		PartDefinition Lowerjawbase_r29 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r29", CubeListBuilder.create().texOffs(34, 66).addBox(-0.8593F, -2.4414F, -1.3443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.75F, 0.2F, -5.475F, 0.5672F, 0.096F, 0.0F));

		PartDefinition Lowerjawbase_r30 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r30", CubeListBuilder.create().texOffs(76, 12).addBox(-1.0343F, -0.8478F, -0.5738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.75F, 0.2F, -5.475F, 0.3491F, 0.096F, 0.0F));

		PartDefinition Lowerjawbase_r31 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r31", CubeListBuilder.create().texOffs(65, 75).addBox(-0.9919F, -1.2155F, -0.818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.2F, -3.6F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition Lowerjawbase_r32 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r32", CubeListBuilder.create().texOffs(60, 75).addBox(-1.0F, -2.6938F, -2.9138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, 0.3927F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r33 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r33", CubeListBuilder.create().texOffs(55, 75).addBox(-1.0F, -1.8768F, -2.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, 0.0436F, 0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r34 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r34", CubeListBuilder.create().texOffs(72, 16).addBox(-1.0F, -1.5496F, -2.0195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.4F, -0.2F, -0.1309F, 0.2007F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -1.6321F, -4.5051F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.46F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-0.3344F, -0.4862F, -1.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(35, 73).mirror().addBox(-0.3344F, -0.4862F, -1.0814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4475F, 0.0033F, 2.3728F, -0.1152F, -0.1735F, 0.0188F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(35, 73).addBox(-0.6656F, -0.4862F, -1.0814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 53).addBox(-0.6656F, -0.4862F, -1.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4475F, 0.0033F, 2.3728F, -0.1152F, 0.1735F, -0.0188F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.7F, -1.9F, -0.5732F, 0.0F, 0.0F));

		PartDefinition Uppermiddleteeth = Upperjawfront.addOrReplaceChild("Uppermiddleteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.0F, -1.7F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawback.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 3.9F, -3.2F, 0.1274F, 0.0F, 0.0F));

		PartDefinition Browslope = Head.addOrReplaceChild("Browslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6321F, -4.6351F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Browslope_r1 = Browslope.addOrReplaceChild("Browslope_r1", CubeListBuilder.create().texOffs(59, 69).mirror().addBox(-0.475F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(69, 60).mirror().addBox(-0.475F, -0.55F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.304F, 1.6772F, -2.7997F, 0.4279F, -0.082F, -0.049F));

		PartDefinition Browslope_r2 = Browslope.addOrReplaceChild("Browslope_r2", CubeListBuilder.create().texOffs(73, 43).mirror().addBox(-0.075F, 0.0F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.48F, 0.2996F, -1.7849F, 0.3321F, -0.3485F, -0.0684F));

		PartDefinition Browslope_r3 = Browslope.addOrReplaceChild("Browslope_r3", CubeListBuilder.create().texOffs(59, 65).mirror().addBox(-0.05F, 0.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.856F, -0.0343F, -0.8896F, 0.0706F, -0.1523F, -0.0107F));

		PartDefinition Browslope_r4 = Browslope.addOrReplaceChild("Browslope_r4", CubeListBuilder.create().texOffs(20, 71).mirror().addBox(-0.1788F, -2.0543F, 0.6412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 63).mirror().addBox(0.0462F, -2.0543F, 0.6412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1579F, 1.9013F, 2.9538F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r5 = Browslope.addOrReplaceChild("Browslope_r5", CubeListBuilder.create().texOffs(34, 62).mirror().addBox(-0.4978F, -1.0442F, -0.2243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8189F, 1.1747F, 0.2573F, -0.7958F, -0.3159F, 0.1171F));

		PartDefinition Browslope_r6 = Browslope.addOrReplaceChild("Browslope_r6", CubeListBuilder.create().texOffs(69, 40).mirror().addBox(-0.1089F, 2.1694F, -0.482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1581F, 1.9263F, -0.7987F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r7 = Browslope.addOrReplaceChild("Browslope_r7", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(-0.1089F, 0.8655F, 0.6454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1581F, 1.9263F, -1.6277F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r8 = Browslope.addOrReplaceChild("Browslope_r8", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(-0.1089F, -1.912F, 1.1317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1581F, 1.9263F, -2.7185F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r9 = Browslope.addOrReplaceChild("Browslope_r9", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-0.1089F, -2.2681F, -0.416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1581F, 1.9263F, 2.8229F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r10 = Browslope.addOrReplaceChild("Browslope_r10", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(-0.1089F, -1.01F, -1.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1581F, 1.9263F, 1.5575F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r11 = Browslope.addOrReplaceChild("Browslope_r11", CubeListBuilder.create().texOffs(68, 47).mirror().addBox(-0.1089F, -0.7462F, -1.4901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(68, 44).mirror().addBox(-0.1089F, -1.0462F, -1.4901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1581F, 1.9263F, 1.1212F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r12 = Browslope.addOrReplaceChild("Browslope_r12", CubeListBuilder.create().texOffs(44, 68).mirror().addBox(-0.1089F, -0.2079F, -2.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(68, 30).mirror().addBox(-0.1089F, -0.2079F, -2.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.655F, -0.1581F, 1.9263F, 0.2049F, -0.3375F, 0.1268F));

		PartDefinition Browslope_r13 = Browslope.addOrReplaceChild("Browslope_r13", CubeListBuilder.create().texOffs(68, 27).mirror().addBox(-0.4978F, -0.8284F, -0.3741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8189F, 1.1747F, 0.2573F, 0.823F, -0.3159F, 0.1171F));

		PartDefinition Browslope_r14 = Browslope.addOrReplaceChild("Browslope_r14", CubeListBuilder.create().texOffs(20, 68).mirror().addBox(-0.4978F, -0.4037F, -0.7975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.8189F, 1.1747F, 0.2573F, 0.0376F, -0.3159F, 0.1171F));

		PartDefinition Browslope_r15 = Browslope.addOrReplaceChild("Browslope_r15", CubeListBuilder.create().texOffs(73, 43).addBox(-0.925F, 0.0F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2996F, -1.7849F, 0.3321F, 0.3485F, 0.0684F));

		PartDefinition Browslope_r16 = Browslope.addOrReplaceChild("Browslope_r16", CubeListBuilder.create().texOffs(5, 73).addBox(-1.0F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0302F, -0.9476F, 0.3752F, 0.0F, 0.0F));

		PartDefinition Browslope_r17 = Browslope.addOrReplaceChild("Browslope_r17", CubeListBuilder.create().texOffs(34, 62).addBox(-0.5022F, -1.0442F, -0.2243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8389F, 1.1747F, 0.2573F, -0.7958F, 0.3159F, -0.1171F));

		PartDefinition Browslope_r18 = Browslope.addOrReplaceChild("Browslope_r18", CubeListBuilder.create().texOffs(69, 40).addBox(-0.8911F, 2.1694F, -0.482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.675F, -0.1581F, 1.9263F, -0.7987F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r19 = Browslope.addOrReplaceChild("Browslope_r19", CubeListBuilder.create().texOffs(40, 51).addBox(-0.8911F, 0.8655F, 0.6454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.675F, -0.1581F, 1.9263F, -1.6277F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r20 = Browslope.addOrReplaceChild("Browslope_r20", CubeListBuilder.create().texOffs(69, 3).addBox(-0.8911F, -1.912F, 1.1317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.675F, -0.1581F, 1.9263F, -2.7185F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r21 = Browslope.addOrReplaceChild("Browslope_r21", CubeListBuilder.create().texOffs(20, 71).addBox(-0.8212F, -2.0543F, 0.6412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(69, 63).addBox(-1.0462F, -2.0543F, 0.6412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.675F, -0.1579F, 1.9013F, 2.9538F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r22 = Browslope.addOrReplaceChild("Browslope_r22", CubeListBuilder.create().texOffs(51, 34).addBox(-0.8911F, -2.2681F, -0.416F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.675F, -0.1581F, 1.9263F, 2.8229F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r23 = Browslope.addOrReplaceChild("Browslope_r23", CubeListBuilder.create().texOffs(69, 66).addBox(-0.8911F, -1.01F, -1.4998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.675F, -0.1581F, 1.9263F, 1.5575F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r24 = Browslope.addOrReplaceChild("Browslope_r24", CubeListBuilder.create().texOffs(68, 47).addBox(-0.8911F, -0.7462F, -1.4901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(68, 44).addBox(-0.8911F, -1.0462F, -1.4901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.675F, -0.1581F, 1.9263F, 1.1212F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r25 = Browslope.addOrReplaceChild("Browslope_r25", CubeListBuilder.create().texOffs(44, 68).addBox(-0.8911F, -0.2079F, -2.0099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(68, 30).addBox(-0.8911F, -0.2079F, -2.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.675F, -0.1581F, 1.9263F, 0.2049F, 0.3375F, -0.1268F));

		PartDefinition Browslope_r26 = Browslope.addOrReplaceChild("Browslope_r26", CubeListBuilder.create().texOffs(68, 27).addBox(-0.5022F, -0.8284F, -0.3741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8389F, 1.1747F, 0.2573F, 0.823F, 0.3159F, -0.1171F));

		PartDefinition Browslope_r27 = Browslope.addOrReplaceChild("Browslope_r27", CubeListBuilder.create().texOffs(69, 60).addBox(-0.525F, -0.55F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 69).addBox(-0.525F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.324F, 1.6772F, -2.7997F, 0.4279F, 0.082F, 0.049F));

		PartDefinition Browslope_r28 = Browslope.addOrReplaceChild("Browslope_r28", CubeListBuilder.create().texOffs(20, 68).addBox(-0.5022F, -0.4037F, -0.7975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.8389F, 1.1747F, 0.2573F, 0.0376F, 0.3159F, -0.1171F));

		PartDefinition Browslope_r29 = Browslope.addOrReplaceChild("Browslope_r29", CubeListBuilder.create().texOffs(59, 65).addBox(-0.95F, 0.025F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.876F, -0.0343F, -0.8896F, 0.0706F, 0.1523F, 0.0107F));

		PartDefinition Browslope_r30 = Browslope.addOrReplaceChild("Browslope_r30", CubeListBuilder.create().texOffs(64, 3).addBox(-1.0F, 0.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, -0.1F, 0.05F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Snoutslope = Browslope.addOrReplaceChild("Snoutslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.536F, 0.0F, 0.0F));

		PartDefinition Snoutslope_r1 = Snoutslope.addOrReplaceChild("Snoutslope_r1", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(0.0F, -0.2F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(7, 56).addBox(0.38F, -0.2F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(73, 9).addBox(0.18F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.68F, 0.9011F, -1.1455F, 0.384F, 0.0F, 0.0F));

		PartDefinition Snoutslope_r2 = Snoutslope.addOrReplaceChild("Snoutslope_r2", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-0.5F, -0.3F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(56, 45).addBox(-0.12F, -0.3F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.18F, 2.2226F, -2.0137F, 0.733F, 0.0F, 0.0F));

		PartDefinition Snoutslope_r3 = Snoutslope.addOrReplaceChild("Snoutslope_r3", CubeListBuilder.create().texOffs(56, 49).mirror().addBox(-0.8F, -1.3931F, -0.8204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 59).mirror().addBox(-0.8F, -0.3931F, -0.6204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 62).mirror().addBox(-0.8F, 0.4069F, -0.4954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.18F, 3.4387F, -0.3622F, 0.8564F, -0.1324F, 0.114F));

		PartDefinition Snoutslope_r4 = Snoutslope.addOrReplaceChild("Snoutslope_r4", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-0.0004F, -0.0065F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.48F, 2.2029F, -1.6981F, 0.9034F, -0.103F, 0.0809F));

		PartDefinition Snoutslope_r5 = Snoutslope.addOrReplaceChild("Snoutslope_r5", CubeListBuilder.create().texOffs(23, 55).mirror().addBox(-0.65F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(30, 55).mirror().addBox(-0.65F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.31F, 3.0337F, 0.8723F, 0.8707F, -0.1838F, 0.1529F));

		PartDefinition Snoutslope_r6 = Snoutslope.addOrReplaceChild("Snoutslope_r6", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1984F, 2.1026F, -0.0406F, 1.5747F, -0.1306F, 0.0084F));

		PartDefinition Snoutslope_r7 = Snoutslope.addOrReplaceChild("Snoutslope_r7", CubeListBuilder.create().texOffs(64, 61).mirror().addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.194F, 1.6026F, -0.0426F, 1.5747F, -0.1306F, 0.0084F));

		PartDefinition Snoutslope_r8 = Snoutslope.addOrReplaceChild("Snoutslope_r8", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.4508F, 0.1058F, -0.4317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2819F, 1.6385F, 0.6368F, 1.4033F, -0.1752F, 0.09F));

		PartDefinition Snoutslope_r9 = Snoutslope.addOrReplaceChild("Snoutslope_r9", CubeListBuilder.create().texOffs(30, 55).addBox(-0.35F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 55).addBox(-0.35F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.33F, 3.0337F, 0.8723F, 0.8707F, 0.1838F, -0.1529F));

		PartDefinition Snoutslope_r10 = Snoutslope.addOrReplaceChild("Snoutslope_r10", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5492F, 0.1058F, -0.4317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3019F, 1.6385F, 0.6368F, 1.4033F, 0.1752F, -0.09F));

		PartDefinition Snoutslope_r11 = Snoutslope.addOrReplaceChild("Snoutslope_r11", CubeListBuilder.create().texOffs(65, 33).addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2184F, 2.1026F, -0.0406F, 1.5747F, 0.1306F, -0.0084F));

		PartDefinition Snoutslope_r12 = Snoutslope.addOrReplaceChild("Snoutslope_r12", CubeListBuilder.create().texOffs(64, 61).addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.214F, 1.6026F, -0.0426F, 1.5747F, 0.1306F, -0.0084F));

		PartDefinition Snoutslope_r13 = Snoutslope.addOrReplaceChild("Snoutslope_r13", CubeListBuilder.create().texOffs(10, 73).addBox(-0.9996F, -0.0065F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2029F, -1.6981F, 0.9034F, 0.103F, -0.0809F));

		PartDefinition Snoutslope_r14 = Snoutslope.addOrReplaceChild("Snoutslope_r14", CubeListBuilder.create().texOffs(74, 62).addBox(-0.2F, 0.4069F, -0.4954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 59).addBox(-0.2F, -0.3931F, -0.6204F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(56, 49).addBox(-0.2F, -1.3931F, -0.8204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2F, 3.4387F, -0.3622F, 0.8564F, 0.1324F, -0.114F));

		PartDefinition Snoutslope_r15 = Snoutslope.addOrReplaceChild("Snoutslope_r15", CubeListBuilder.create().texOffs(73, 6).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8227F, -0.1486F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Snoutslope_r16 = Snoutslope.addOrReplaceChild("Snoutslope_r16", CubeListBuilder.create().texOffs(71, 56).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.875F, 0.85F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(28, 46).addBox(-0.6247F, 1.1902F, -0.4481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8468F, 4.8187F, -3.0304F, 0.1371F, 0.0232F, -0.1487F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(14, 50).addBox(-1.0F, -1.0F, -0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3753F, 1.2343F, -1.2198F, -1.1345F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(67, 18).addBox(-1.0F, 0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(5, 67).addBox(-1.0F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3753F, -0.387F, -0.7086F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(62, 18).addBox(-1.0F, -1.4F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3753F, 1.0902F, -0.4481F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(59, 61).addBox(-1.0F, -1.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3753F, 1.0902F, -0.4481F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightupperarm.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(50, 4).addBox(-1.0F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(49, 46).addBox(-1.0F, -1.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3753F, 7.0803F, -1.0043F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightupperarm.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(29, 62).addBox(-1.0F, 0.275F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3753F, 4.0902F, -0.4481F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r7 = Rightupperarm.addOrReplaceChild("Rightupperarm_r7", CubeListBuilder.create().texOffs(62, 22).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3753F, 4.0902F, -0.4481F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 7.4113F, -0.2656F, -1.3916F, -0.0075F, -1.3249F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(50, 21).addBox(-0.5F, -3.2679F, -0.5672F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1694F, 3.7007F, -0.6207F, -0.1745F, 0.0F, -0.1309F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(14, 59).addBox(-0.5F, 0.2603F, -0.654F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1694F, 3.7007F, -0.6207F, -0.0436F, 0.0F, -0.1309F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(23, 46).addBox(0.0F, -0.3F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3306F, 2.4041F, 1.2276F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(49, 58).addBox(0.0F, -1.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.3306F, 1.261F, 0.5253F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2436F, 6.7376F, -0.328F, 1.1319F, -1.463F, 0.2609F));

		PartDefinition Righthand_r1 = Righthand.addOrReplaceChild("Righthand_r1", CubeListBuilder.create().texOffs(30, 0).addBox(-1.3F, -0.5F, -3.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.3F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Rightthumb = Righthand.addOrReplaceChild("Rightthumb", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9265F, 0.1F, 0.1854F, 0.0F, 0.3302F, 0.0F));

		PartDefinition Righthand2 = Righthand.addOrReplaceChild("Righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.0F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Righthand_r2 = Righthand2.addOrReplaceChild("Righthand_r2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.3F, -0.5F, -7.2F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.3F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(28, 46).mirror().addBox(-0.3753F, 1.1902F, -0.4481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8468F, 4.8187F, -3.0304F, 0.6608F, -0.0392F, 0.0994F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(14, 50).mirror().addBox(0.0F, -1.0F, -0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3753F, 1.2343F, -1.2198F, -1.1345F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(0.0F, 0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(5, 67).mirror().addBox(0.0F, 0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3753F, -0.387F, -0.7086F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(0.0F, -1.4F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3753F, 1.0902F, -0.4481F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(59, 61).mirror().addBox(0.0F, -1.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3753F, 1.0902F, -0.4481F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftupperarm.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(0.0F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(49, 46).mirror().addBox(0.0F, -1.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3753F, 7.0803F, -1.0043F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftupperarm.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(29, 62).mirror().addBox(0.0F, 0.275F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3753F, 4.0902F, -0.4481F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r7 = Leftupperarm.addOrReplaceChild("Leftupperarm_r7", CubeListBuilder.create().texOffs(62, 22).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3753F, 4.0902F, -0.4481F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 7.4113F, -0.2656F, -1.5519F, 0.1434F, 1.2268F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(-0.5F, -3.2679F, -0.5672F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1694F, 3.7007F, -0.6207F, -0.1745F, 0.0F, 0.1309F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(-0.5F, 0.2603F, -0.654F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1694F, 3.7007F, -0.6207F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(23, 46).mirror().addBox(-1.0F, -0.3F, -1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3306F, 2.4041F, 1.2276F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-1.0F, -1.7F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.3306F, 1.261F, 0.5253F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2436F, 6.7376F, -0.328F, 0.5086F, 1.4384F, -0.5406F));

		PartDefinition Lefthand_r1 = Lefthand.addOrReplaceChild("Lefthand_r1", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-1.7F, -0.5F, -3.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.0F, 0.3F, 0.0F, 0.0524F, 0.0F));

		PartDefinition Leftthumb = Lefthand.addOrReplaceChild("Leftthumb", CubeListBuilder.create().texOffs(26, 29).mirror().addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9265F, 0.1F, 0.1854F, 0.0F, -0.3302F, 0.0F));

		PartDefinition Lefthand2 = Lefthand.addOrReplaceChild("Lefthand2", CubeListBuilder.create(), PartPose.offset(0.3F, 0.0F, -3.0F));

		PartDefinition Lefthand_r2 = Lefthand2.addOrReplaceChild("Lefthand_r2", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-1.7F, -0.5F, -7.2F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 3.3F, 0.0F, 0.0524F, 0.0F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0F, 1.7959F, 2.1196F));

		PartDefinition Bodyfront_r5 = bone2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(77, 21).addBox(-0.5246F, -0.0617F, -0.9108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8007F, 3.5727F, -5.4738F, 2.1869F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r6 = bone2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(67, 37).addBox(-0.5246F, -0.6614F, -1.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(67, 24).addBox(-0.5246F, -0.6614F, -0.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.8007F, 3.5727F, -5.4738F, 2.7977F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r7 = bone2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(54, 67).addBox(-0.5246F, -0.8119F, 0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8007F, 3.5727F, -5.4738F, 2.405F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r8 = bone2.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(49, 50).addBox(-0.5246F, -0.1629F, -0.4855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.8007F, 3.5727F, -5.4738F, 2.8414F, 0.3814F, 0.588F));

		PartDefinition Bodyfront_r9 = bone2.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(49, 67).addBox(-0.492F, -2.6472F, -1.1582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.4993F, 0.2761F, -5.1493F, 2.6859F, -0.0651F, -0.252F));

		PartDefinition Bodyfront_r10 = bone2.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(68, 7).addBox(-0.492F, -1.3122F, -2.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(68, 0).addBox(-0.492F, -1.7122F, -2.0429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.4993F, 0.2761F, -5.1493F, 1.883F, -0.0651F, -0.252F));

		PartDefinition Bodyfront_r11 = bone2.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(70, 77).addBox(-0.492F, -0.1628F, 0.8717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(72, 19).addBox(-0.492F, -0.1628F, 1.7717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4993F, 0.2761F, -5.1493F, 1.4031F, -0.0651F, -0.252F));

		PartDefinition Bodyfront_r12 = bone2.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(41, 14).addBox(-0.9466F, -0.0021F, -0.0025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.2724F, 2.5798F, -7.348F, 0.9414F, -0.0833F, 0.245F));

		PartDefinition Bodyfront_r13 = bone2.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(47, 54).addBox(-0.6045F, -0.7461F, -0.1806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.3317F, 4.0246F, -6.4321F, 1.6712F, 0.0115F, 0.4464F));

		PartDefinition Bodyfront_r14 = bone2.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(13, 22).addBox(-0.492F, -0.2822F, -2.2305F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4993F, 0.2761F, -5.1493F, 1.2722F, -0.0651F, -0.252F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.7959F, 2.1196F));

		PartDefinition Bodyfront_r15 = bone4.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(77, 21).mirror().addBox(-0.4754F, -0.0617F, -0.9108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.5727F, -5.4738F, 2.1869F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r16 = bone4.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-0.4754F, -0.6614F, -1.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(67, 24).mirror().addBox(-0.4754F, -0.6614F, -0.4073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.5727F, -5.4738F, 2.7977F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r17 = bone4.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(54, 67).mirror().addBox(-0.4754F, -0.8119F, 0.3087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.5727F, -5.4738F, 2.405F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r18 = bone4.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(49, 50).mirror().addBox(-0.4754F, -0.1629F, -0.4855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 3.5727F, -5.4738F, 2.8414F, -0.3814F, -0.588F));

		PartDefinition Bodyfront_r19 = bone4.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-0.508F, -2.6472F, -1.1582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.4993F, 0.2761F, -5.1493F, 2.6859F, 0.0651F, 0.252F));

		PartDefinition Bodyfront_r20 = bone4.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(68, 7).mirror().addBox(-0.508F, -1.3122F, -2.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(68, 0).mirror().addBox(-0.508F, -1.7122F, -2.0429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.4993F, 0.2761F, -5.1493F, 1.883F, 0.0651F, 0.252F));

		PartDefinition Bodyfront_r21 = bone4.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(70, 77).mirror().addBox(-0.508F, -0.1628F, 0.8717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(72, 19).mirror().addBox(-0.508F, -0.1628F, 1.7717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4993F, 0.2761F, -5.1493F, 1.4031F, 0.0651F, 0.252F));

		PartDefinition Bodyfront_r22 = bone4.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(41, 14).mirror().addBox(-0.0534F, -0.0021F, -0.0025F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.2724F, 2.5798F, -7.348F, 0.9414F, 0.0833F, -0.245F));

		PartDefinition Bodyfront_r23 = bone4.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(47, 54).mirror().addBox(-0.3955F, -0.7461F, -0.1806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.3317F, 4.0246F, -6.4321F, 1.6712F, -0.0115F, -0.4464F));

		PartDefinition Bodyfront_r24 = bone4.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(13, 22).mirror().addBox(-0.508F, -0.2822F, -2.2305F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4993F, 0.2761F, -5.1493F, 1.2722F, 0.0651F, 0.252F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(18, 42).addBox(-0.4892F, 1.5178F, 0.5448F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4698F, -5.3875F, 9.4695F, -1.3908F, -0.3008F, -0.0539F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -2.2F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0108F, 1.3178F, 1.6448F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(66, 56).addBox(-0.5F, -1.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0108F, 1.3178F, 1.6448F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(50, 14).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0108F, -0.395F, 1.0823F, 0.9163F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(57, 40).addBox(-0.5F, 0.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(77, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0108F, 7.5178F, 0.5448F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(58, 33).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0108F, 7.4508F, 1.6608F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(19, 59).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2892F, 8.631F, 2.1816F, 2.204F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(39, 62).addBox(3.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.4F, 5.3747F, 0.4381F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(24, 59).addBox(3.2F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-3.4F, 2.8F, 0.8F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(44, 58).addBox(-0.5F, -0.0128F, -0.0686F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.6263F, -1.4194F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(61, 53).addBox(-0.5F, -1.7128F, -0.5686F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 1.5F, -0.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(30, 5).addBox(-1.5F, -0.4F, -2.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.5764F, -1.061F, -0.336F, -0.1933F, -0.0253F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create().texOffs(15, 16).addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, 0.0008F, 0.0F, 0.0F));

		PartDefinition Rightopposabletoe = Righthindfoot.addOrReplaceChild("Rightopposabletoe", CubeListBuilder.create().texOffs(33, 36).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1119F, 0.15F, 0.4609F, 0.0F, 0.3302F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(18, 42).mirror().addBox(-0.5108F, 1.5178F, 0.5448F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4698F, -5.3875F, 9.4695F, -0.7881F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -2.2F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 1.3178F, 1.6448F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(66, 56).mirror().addBox(-0.5F, -1.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 1.3178F, 1.6448F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(50, 14).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, -0.395F, 1.0823F, 0.9163F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(57, 40).mirror().addBox(-0.5F, 0.6F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(77, 34).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 7.5178F, 0.5448F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(58, 33).mirror().addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0108F, 7.4508F, 1.6608F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(19, 59).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2892F, 8.631F, 2.1816F, 2.8585F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(39, 62).mirror().addBox(-4.2F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.4F, 5.3747F, 0.4381F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(24, 59).mirror().addBox(-4.2F, -0.2F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.4F, 2.8F, 0.8F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(44, 58).mirror().addBox(-0.5F, -0.0128F, -0.0686F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.6263F, -1.4194F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(61, 53).mirror().addBox(-0.5F, -1.7128F, -0.5686F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.5F, -0.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(30, 5).mirror().addBox(-1.5F, -0.4F, -2.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.5764F, -1.061F, -1.378F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create().texOffs(15, 16).mirror().addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, -0.2173F, 0.0F, 0.0F));

		PartDefinition Leftopposabletoe = Lefthindfoot.addOrReplaceChild("Leftopposabletoe", CubeListBuilder.create().texOffs(33, 36).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1119F, 0.15F, 0.4609F, 0.0F, -0.3302F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -8.5941F, 8.5588F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Hips_r4 = bone.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(72, 36).addBox(-0.1757F, 0.1592F, 0.3622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(72, 22).addBox(-0.1757F, 0.1592F, 0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2F, 3.2F, -0.8705F, -0.0338F, -0.2138F));

		PartDefinition Hips_r5 = bone.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(59, 72).addBox(-0.1963F, 1.1842F, 0.4036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(54, 54).addBox(-0.1963F, 0.1842F, 0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.3F, -0.1898F, -0.0338F, -0.2138F));

		PartDefinition Hips_r6 = bone.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(33, 49).addBox(0.3279F, -0.8175F, -0.1277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.0F, 2.1F, 0.4821F, -0.0338F, -0.2138F));

		PartDefinition Hips_r7 = bone.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(43, 4).addBox(0.1579F, 0.0592F, -0.0932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.4F, 0.3076F, -0.0338F, -0.2138F));

		PartDefinition Hips_r8 = bone.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(50, 41).addBox(-0.0252F, -0.1654F, -0.6185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1767F, -0.0338F, -0.2138F));

		PartDefinition Hips_r9 = bone.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(24, 64).addBox(-0.9937F, -1.3128F, -0.0868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -1.0653F, -0.0828F, 0.1821F));

		PartDefinition Hips_r10 = bone.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(64, 72).addBox(-0.9937F, -2.5631F, -1.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -2.8106F, -0.0828F, 0.1821F));

		PartDefinition Hips_r11 = bone.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(69, 72).addBox(-0.9895F, -3.3877F, -2.5985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(68, 10).addBox(-0.9895F, -3.3877F, -1.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -2.2438F, -0.0809F, 0.1867F));

		PartDefinition Hips_r12 = bone.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(40, 77).addBox(-0.9705F, 0.0679F, -1.6934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, 2.3392F, -0.0945F, 0.1717F));

		PartDefinition Hips_r13 = bone.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(20, 77).addBox(-0.9895F, -1.6532F, -2.2842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -3.0292F, -0.0809F, 0.1867F));

		PartDefinition Hips_r14 = bone.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(73, 0).addBox(-0.9895F, -2.3416F, -2.8293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -2.6801F, -0.0809F, 0.1867F));

		PartDefinition Hips_r15 = bone.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(67, 21).addBox(-0.9895F, -2.86F, -2.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -2.5928F, -0.0809F, 0.1867F));

		PartDefinition Hips_r16 = bone.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(7, 47).addBox(-0.9937F, -2.3081F, -1.3448F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -3.0724F, -0.0828F, 0.1821F));

		PartDefinition Hips_r17 = bone.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(42, 46).addBox(-0.9937F, -2.3896F, 0.0521F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, 2.949F, -0.0828F, 0.1821F));

		PartDefinition Hips_r18 = bone.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(9, 42).addBox(-0.9937F, -0.0662F, 0.1732F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -2.4615F, -0.0828F, 0.1821F));

		PartDefinition Hips_r19 = bone.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(54, 58).addBox(-0.9937F, 0.3792F, -0.8943F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3917F, 3.383F, 0.8615F, -1.1962F, -0.0828F, 0.1821F));

		PartDefinition Hips_r20 = bone.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(44, 36).addBox(-1.0F, -2.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.4882F, 2.6522F, 1.9943F, -0.5993F, -0.0927F, -0.2192F));

		PartDefinition Hips_r21 = bone.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -1.2F, -1.275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9667F, 3.183F, 0.6615F, -0.61F, 0.0202F, -0.0105F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, -8.5941F, 8.5588F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Hips_r22 = bone3.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-0.8243F, 0.1592F, 0.3622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(72, 22).mirror().addBox(-0.8243F, 0.1592F, 0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 3.2F, -0.8705F, 0.0338F, 0.2138F));

		PartDefinition Hips_r23 = bone3.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(59, 72).mirror().addBox(-0.8037F, 1.1842F, 0.4036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(54, 54).mirror().addBox(-0.8037F, 0.1842F, 0.0036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 1.3F, -0.1898F, 0.0338F, 0.2138F));

		PartDefinition Hips_r24 = bone3.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(33, 49).mirror().addBox(-1.3279F, -0.8175F, -0.1277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 2.1F, 0.4821F, 0.0338F, 0.2138F));

		PartDefinition Hips_r25 = bone3.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(43, 4).mirror().addBox(-1.1579F, 0.0592F, -0.0932F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, -0.4F, 0.3076F, 0.0338F, 0.2138F));

		PartDefinition Hips_r26 = bone3.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(50, 41).mirror().addBox(-0.9748F, -0.1654F, -0.6185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1767F, 0.0338F, 0.2138F));

		PartDefinition Hips_r27 = bone3.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(24, 64).mirror().addBox(-0.0063F, -1.3128F, -0.0868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -1.0653F, 0.0828F, -0.1821F));

		PartDefinition Hips_r28 = bone3.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(64, 72).mirror().addBox(-0.0063F, -2.5631F, -1.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -2.8106F, 0.0828F, -0.1821F));

		PartDefinition Hips_r29 = bone3.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(69, 72).mirror().addBox(-0.0105F, -3.3877F, -2.5985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(68, 10).mirror().addBox(-0.0105F, -3.3877F, -1.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -2.2438F, 0.0809F, -0.1867F));

		PartDefinition Hips_r30 = bone3.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.0295F, 0.0679F, -1.6934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, 2.3392F, 0.0945F, -0.1717F));

		PartDefinition Hips_r31 = bone3.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.0105F, -1.6532F, -2.2842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -3.0292F, 0.0809F, -0.1867F));

		PartDefinition Hips_r32 = bone3.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.0105F, -2.3416F, -2.8293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -2.6801F, 0.0809F, -0.1867F));

		PartDefinition Hips_r33 = bone3.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(67, 21).mirror().addBox(-0.0105F, -2.86F, -2.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -2.5928F, 0.0809F, -0.1867F));

		PartDefinition Hips_r34 = bone3.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.0063F, -2.3081F, -1.3448F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -3.0724F, 0.0828F, -0.1821F));

		PartDefinition Hips_r35 = bone3.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(42, 46).mirror().addBox(-0.0063F, -2.3896F, 0.0521F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, 2.949F, 0.0828F, -0.1821F));

		PartDefinition Hips_r36 = bone3.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(9, 42).mirror().addBox(-0.0063F, -0.0662F, 0.1732F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -2.4615F, 0.0828F, -0.1821F));

		PartDefinition Hips_r37 = bone3.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-0.0063F, 0.3792F, -0.8943F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3917F, 3.383F, 0.8615F, -1.1962F, 0.0828F, -0.1821F));

		PartDefinition Hips_r38 = bone3.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(44, 36).mirror().addBox(0.0F, -2.0F, -2.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.4882F, 2.6522F, 1.9943F, -0.5993F, 0.0927F, 0.2192F));

		PartDefinition Hips_r39 = bone3.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.5F, -1.2F, -1.275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9667F, 3.183F, 0.6615F, -0.61F, -0.0202F, 0.0105F));

		return LayerDefinition.create(meshdefinition, 84, 84);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.root.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}