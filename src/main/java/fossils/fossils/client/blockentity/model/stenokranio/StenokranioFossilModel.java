package fossils.fossils.client.blockentity.model.stenokranio;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StenokranioFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart eyeright;
	private final ModelPart eyeleft;
	private final ModelPart armleft;
	private final ModelPart armleft2;
	private final ModelPart handleft;
	private final ModelPart armright;
	private final ModelPart armright2;
	private final ModelPart handright;
	private final ModelPart legleft;
	private final ModelPart legleft2;
	private final ModelPart footleft;
	private final ModelPart legright;
	private final ModelPart legright2;
	private final ModelPart footright;

	public StenokranioFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hip.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.eyeright = this.head.getChild("eyeright");
		this.eyeleft = this.head.getChild("eyeleft");
		this.armleft = this.body.getChild("armleft");
		this.armleft2 = this.armleft.getChild("armleft2");
		this.handleft = this.armleft2.getChild("handleft");
		this.armright = this.body.getChild("armright");
		this.armright2 = this.armright.getChild("armright2");
		this.handright = this.armright2.getChild("handright");
		this.legleft = this.hip.getChild("legleft");
		this.legleft2 = this.legleft.getChild("legleft2");
		this.footleft = this.legleft2.getChild("footleft");
		this.legright = this.hip.getChild("legright");
		this.legright2 = this.legright.getChild("legright2");
		this.footright = this.legright2.getChild("footright");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition body6_r1 = hip.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0358F, -0.0134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.1847F, 6.8393F, -0.2138F, 0.0F, 0.0F));

		PartDefinition body5_r1 = hip.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(47, 31).addBox(0.0F, -0.9616F, 3.0497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 47).addBox(0.0F, -0.9616F, 1.0497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.0384F, 0.0497F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.9847F, 1.8393F, -0.144F, 0.0F, 0.0F));

		PartDefinition body8_r1 = hip.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(43, 16).mirror().addBox(-1.0209F, -1.5005F, -2.874F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -6.4477F, 5.2032F, 1.4443F, 0.0F, -0.1745F));

		PartDefinition body7_r1 = hip.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(43, 16).addBox(0.0209F, -1.5005F, -2.874F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, -6.4477F, 5.2032F, 1.4443F, 0.0F, 0.1745F));

		PartDefinition body8_r2 = hip.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-1.0209F, 0.4271F, -1.6083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(13, 40).mirror().addBox(-1.0209F, 0.0271F, -0.6083F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -6.4477F, 5.2032F, 0.6414F, 0.0F, -0.1745F));

		PartDefinition body6_r2 = hip.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(34, 39).mirror().addBox(-1.0209F, -0.1994F, -0.6213F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -6.4477F, 5.2032F, -0.4756F, 0.0F, -0.1745F));

		PartDefinition body5_r2 = hip.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-0.5F, -4.9936F, -0.7268F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -3.4477F, 5.2032F, -0.0567F, 0.0F, -0.1745F));

		PartDefinition body7_r2 = hip.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(0, 24).addBox(0.0209F, 0.4271F, -1.6083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(13, 40).addBox(-0.9791F, 0.0271F, -0.6083F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -6.4477F, 5.2032F, 0.6414F, 0.0F, 0.1745F));

		PartDefinition body5_r3 = hip.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(34, 39).addBox(-0.9791F, -0.1994F, -0.6213F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -6.4477F, 5.2032F, -0.4756F, 0.0F, 0.1745F));

		PartDefinition body4_r1 = hip.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, -4.9936F, -0.7268F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -3.4477F, 5.2032F, -0.0567F, 0.0F, 0.1745F));

		PartDefinition body8_r3 = hip.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(29, 18).mirror().addBox(-1.0181F, 0.1674F, 1.4012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 31).mirror().addBox(-1.0181F, 0.1674F, -0.5988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -8.412F, 3.4067F, -0.1559F, -0.009F, -0.122F));

		PartDefinition body7_r3 = hip.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(29, 18).addBox(0.0181F, 0.1674F, 1.4012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 31).addBox(0.0181F, 0.1674F, -0.5988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -8.412F, 3.4067F, -0.1559F, 0.009F, 0.122F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 12).addBox(-0.5F, -1.1007F, -0.5289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 38).addBox(0.0F, -1.7007F, 1.4711F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.75F, 9.0F, -0.3981F, -0.1611F, 0.0674F));

		PartDefinition tail4_r1 = tail.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(27, 24).addBox(0.0F, 0.4F, 1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.231F, -0.1208F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(46, 40).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1007F, -0.5289F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(20, 24).addBox(-0.5F, -0.35F, -0.0483F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(0.0F, -0.9971F, -0.0483F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 31).addBox(0.0F, -0.7971F, 1.9517F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 3.4F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition tail5_r1 = tail2.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(18, 18).addBox(0.0F, 0.9F, 3.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(0.0F, 1.9F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.981F, -3.5208F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.2108F, -0.0338F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1492F, 3.8629F, 0.1795F, -0.2979F, -0.0761F));

		PartDefinition tail7_r1 = tail3.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, 2.3F, 7.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1303F, -7.3836F, 0.4102F, 0.0F, 0.0F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, 2.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition body5_r4 = body.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(45, 46).addBox(0.0F, -0.9857F, -0.0828F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.951F, -1.0307F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body4_r2 = body.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(25, 47).addBox(0.0F, -1.0097F, 2.9905F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 47).addBox(0.0F, -1.0097F, 0.9905F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 10).addBox(-0.5F, -0.0097F, -0.0095F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, -6.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body8_r4 = body.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(45, 12).mirror().addBox(-2.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.412F, -0.5933F, -0.0125F, -0.0326F, -1.0644F));

		PartDefinition body7_r4 = body.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(17, 45).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.412F, -0.5933F, -0.0271F, -0.022F, -0.5408F));

		PartDefinition body6_r3 = body.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(45, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.412F, -0.5933F, -0.0337F, -0.009F, -0.122F));

		PartDefinition body5_r5 = body.addOrReplaceChild("body5_r5", CubeListBuilder.create().texOffs(45, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.412F, -2.5933F, 0.0337F, 0.009F, -0.1395F));

		PartDefinition body6_r4 = body.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(45, 27).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.412F, -2.5933F, 0.0271F, 0.022F, -0.5582F));

		PartDefinition body7_r5 = body.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(16, 8).mirror().addBox(-3.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.412F, -2.5933F, 0.0125F, 0.0326F, -1.0819F));

		PartDefinition body7_r6 = body.addOrReplaceChild("body7_r6", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.3F, 0.0116F, -0.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1101F, 0.5884F, -4.4736F, 0.0216F, -0.5182F, -1.0584F));

		PartDefinition body8_r5 = body.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(27, 5).mirror().addBox(-0.2F, 0.0192F, -0.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1101F, 0.6708F, -6.3084F, 0.0721F, -0.5288F, -1.0872F));

		PartDefinition body4_r3 = body.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.312F, -4.5933F, 0.0506F, 0.0135F, -0.1044F));

		PartDefinition body5_r6 = body.addOrReplaceChild("body5_r6", CubeListBuilder.create().texOffs(21, 46).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.312F, -4.5933F, 0.0407F, 0.0329F, -0.5229F));

		PartDefinition body6_r5 = body.addOrReplaceChild("body6_r5", CubeListBuilder.create().texOffs(39, 34).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.312F, -4.5933F, 0.0188F, 0.0489F, -1.0467F));

		PartDefinition body7_r7 = body.addOrReplaceChild("body7_r7", CubeListBuilder.create().texOffs(8, 26).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.212F, -6.5933F, 0.0627F, 0.1244F, -1.0429F));

		PartDefinition body6_r6 = body.addOrReplaceChild("body6_r6", CubeListBuilder.create().texOffs(12, 45).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.212F, -6.5933F, 0.1165F, 0.0764F, -0.5188F));

		PartDefinition body5_r7 = body.addOrReplaceChild("body5_r7", CubeListBuilder.create().texOffs(45, 7).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.212F, -6.5933F, 0.1374F, 0.0226F, -0.1028F));

		PartDefinition body8_r6 = body.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-3.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.012F, -8.5933F, 0.1075F, 0.1996F, -1.0357F));

		PartDefinition body7_r8 = body.addOrReplaceChild("body7_r8", CubeListBuilder.create().texOffs(44, 29).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.012F, -8.5933F, 0.1928F, 0.1194F, -0.5113F));

		PartDefinition body6_r7 = body.addOrReplaceChild("body6_r7", CubeListBuilder.create().texOffs(18, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.012F, -8.5933F, 0.2242F, 0.0314F, -0.1005F));

		PartDefinition body5_r8 = body.addOrReplaceChild("body5_r8", CubeListBuilder.create().texOffs(45, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.412F, -0.5933F, -0.0337F, 0.009F, 0.122F));

		PartDefinition body6_r8 = body.addOrReplaceChild("body6_r8", CubeListBuilder.create().texOffs(17, 45).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.412F, -0.5933F, -0.0271F, 0.022F, 0.5408F));

		PartDefinition body7_r9 = body.addOrReplaceChild("body7_r9", CubeListBuilder.create().texOffs(45, 12).addBox(1.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.412F, -0.5933F, -0.0125F, 0.0326F, 1.0644F));

		PartDefinition body4_r4 = body.addOrReplaceChild("body4_r4", CubeListBuilder.create().texOffs(45, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.412F, -2.5933F, 0.0337F, -0.009F, 0.1395F));

		PartDefinition body5_r9 = body.addOrReplaceChild("body5_r9", CubeListBuilder.create().texOffs(45, 27).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.412F, -2.5933F, 0.0271F, -0.022F, 0.5582F));

		PartDefinition body6_r9 = body.addOrReplaceChild("body6_r9", CubeListBuilder.create().texOffs(16, 8).addBox(1.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.412F, -2.5933F, 0.0125F, -0.0326F, 1.0819F));

		PartDefinition body7_r10 = body.addOrReplaceChild("body7_r10", CubeListBuilder.create().texOffs(0, 5).addBox(1.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.012F, -8.5933F, 0.1075F, -0.1996F, 1.0357F));

		PartDefinition body6_r10 = body.addOrReplaceChild("body6_r10", CubeListBuilder.create().texOffs(44, 29).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.012F, -8.5933F, 0.1928F, -0.1194F, 0.5113F));

		PartDefinition body5_r10 = body.addOrReplaceChild("body5_r10", CubeListBuilder.create().texOffs(18, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.012F, -8.5933F, 0.2242F, -0.0314F, 0.1005F));

		PartDefinition body5_r11 = body.addOrReplaceChild("body5_r11", CubeListBuilder.create().texOffs(12, 45).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.212F, -6.5933F, 0.1165F, -0.0764F, 0.5188F));

		PartDefinition body7_r11 = body.addOrReplaceChild("body7_r11", CubeListBuilder.create().texOffs(27, 5).addBox(-0.8F, 0.0192F, -0.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1101F, 0.6708F, -6.3084F, 0.0721F, 0.5288F, 1.0872F));

		PartDefinition body6_r11 = body.addOrReplaceChild("body6_r11", CubeListBuilder.create().texOffs(8, 26).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.212F, -6.5933F, 0.0627F, -0.1244F, 1.0429F));

		PartDefinition body4_r5 = body.addOrReplaceChild("body4_r5", CubeListBuilder.create().texOffs(45, 7).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.212F, -6.5933F, 0.1374F, -0.0226F, 0.1028F));

		PartDefinition body6_r12 = body.addOrReplaceChild("body6_r12", CubeListBuilder.create().texOffs(32, 0).addBox(-0.7F, 0.0116F, -0.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1101F, 0.5884F, -4.4736F, 0.0216F, 0.5182F, 1.0584F));

		PartDefinition body5_r12 = body.addOrReplaceChild("body5_r12", CubeListBuilder.create().texOffs(39, 34).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.312F, -4.5933F, 0.0188F, -0.0489F, 1.0467F));

		PartDefinition body4_r6 = body.addOrReplaceChild("body4_r6", CubeListBuilder.create().texOffs(21, 46).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.312F, -4.5933F, 0.0407F, -0.0329F, 0.5229F));

		PartDefinition body3_r1 = body.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(46, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.312F, -4.5933F, 0.0506F, -0.0135F, 0.1044F));

		PartDefinition neck5_r1 = body.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(36, 27).mirror().addBox(-3.0F, -0.5731F, 0.0955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8843F, -10.4498F, -0.1227F, 0.1043F, -0.0064F));

		PartDefinition neck5_r2 = body.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-1.0F, -0.6341F, -0.1082F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.9087F, -10.7513F, -0.1264F, 0.2598F, -0.0326F));

		PartDefinition neck5_r3 = body.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-3.5F, -2.975F, 6.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 31).addBox(2.5F, -2.975F, 6.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 12).addBox(-0.5F, -2.975F, 5.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, -17.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition body4_r7 = body.addOrReplaceChild("body4_r7", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-0.5F, -1.575F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 2.6954F, -8.85F, 1.0647F, 0.0F, -0.1745F));

		PartDefinition body3_r2 = body.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(30, 21).mirror().addBox(-0.1743F, -1.7455F, -0.4401F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5995F, 0.5952F, -7.3904F, 0.8158F, 0.1569F, -0.01F));

		PartDefinition body3_r3 = body.addOrReplaceChild("body3_r3", CubeListBuilder.create().texOffs(18, 30).addBox(-0.5F, -1.575F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 2.6954F, -8.85F, 1.0647F, 0.0F, 0.1745F));

		PartDefinition body2_r1 = body.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(30, 21).addBox(-0.8257F, -1.7455F, -0.4401F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5995F, 0.5952F, -7.3904F, 0.8158F, -0.1569F, 0.01F));

		PartDefinition body3_r4 = body.addOrReplaceChild("body3_r4", CubeListBuilder.create().texOffs(47, 0).addBox(0.0F, -1.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 47).addBox(0.0F, -1.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 15).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, -9.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck4_r1 = body.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(38, 0).addBox(-2.0F, -0.6341F, -0.1082F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.9087F, -10.7513F, -0.1264F, -0.2598F, 0.0326F));

		PartDefinition neck4_r2 = body.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(36, 27).addBox(0.0F, -0.5731F, 0.0955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 2.8843F, -10.4498F, -0.1227F, -0.1043F, 0.0064F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(33, 34).addBox(-0.5F, -1.99F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 14).addBox(0.0F, -2.59F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -10.0F, -0.0421F, 0.002F, 0.0227F));

		PartDefinition body8_r7 = neck.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(12, 33).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.512F, -0.5933F, 0.0761F, 0.3635F, -0.5502F));

		PartDefinition body7_r12 = neck.addOrReplaceChild("body7_r12", CubeListBuilder.create().texOffs(32, 7).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.512F, -0.5933F, 0.2212F, 0.3004F, -0.1117F));

		PartDefinition body7_r13 = neck.addOrReplaceChild("body7_r13", CubeListBuilder.create().texOffs(12, 33).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.512F, -0.5933F, 0.0761F, -0.3635F, 0.5502F));

		PartDefinition body6_r13 = neck.addOrReplaceChild("body6_r13", CubeListBuilder.create().texOffs(32, 7).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -1.512F, -0.5933F, 0.2212F, -0.3004F, 0.1117F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(39, 24).addBox(-1.5F, -1.0F, -9.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(42, 36).addBox(-1.5F, -0.75F, -8.75F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(15, 47).addBox(2.75F, -0.5F, -6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 47).addBox(3.5F, -0.5F, -4.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 47).mirror().addBox(-3.5F, -0.5F, -4.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 47).mirror().addBox(-2.75F, -0.5F, -6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.75F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.25F, -0.75F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 28).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -9.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 9).mirror().addBox(-1.05F, -0.75F, 2.55F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 3).mirror().addBox(-1.3F, -1.0F, 2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -9.0F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 4).mirror().addBox(-2.0F, -0.75F, 4.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 16).mirror().addBox(-2.25F, -1.0F, 4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -9.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 44).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.271F, -1.9413F, -0.1887F, 0.1074F, 0.4321F, 0.0479F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-1.9483F, -0.0457F, -1.0016F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.8F, 0.0F, 0.0F, 0.6632F, -0.3927F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(0.0695F, 0.1423F, 0.0162F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, -1.0F, -5.0F, 0.0524F, 0.0087F, -0.3927F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 27).mirror().addBox(-0.25F, -0.85F, 1.75F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, -9.0F, 0.2094F, -0.3491F, -0.3491F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 4).addBox(2.0F, -0.75F, 4.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(1.25F, -1.0F, 4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -9.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 9).addBox(1.05F, -0.75F, 2.55F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 3).addBox(0.3F, -1.0F, 2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 0.0F, -9.0F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.75F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 28).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -9.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 27).addBox(-1.75F, -0.85F, 1.75F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, -9.0F, 0.2094F, 0.3491F, 0.3491F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 45).addBox(-0.0517F, -0.0457F, -1.0016F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.8F, 0.0F, 0.0F, -0.6632F, 0.3927F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 9).addBox(-3.0695F, 0.1423F, 0.0162F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, -1.0F, -5.0F, 0.0524F, -0.0087F, 0.3927F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 18).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.0F, -9.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 44).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.271F, -1.9413F, -0.1887F, 0.1074F, -0.4321F, -0.0479F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 0).addBox(-1.5F, -0.675F, 3.9F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -9.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(17, 26).addBox(-1.5F, -0.25F, -9.85F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(39, 9).addBox(-1.5F, 0.0F, -10.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r17 = jaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0308F, -1.0F, -1.9852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 1.0F, -1.0F, 0.3665F, -0.0349F, 0.0F));

		PartDefinition cube_r18 = jaw.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(0.0F, -1.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0F, -10.1F, -0.0524F, -0.6981F, 0.0F));

		PartDefinition cube_r19 = jaw.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 44).mirror().addBox(-0.4725F, -1.008F, -1.8278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 1.4F, -5.9F, -0.1047F, -0.2443F, 0.0F));

		PartDefinition cube_r20 = jaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 35).mirror().addBox(0.0867F, -1.3516F, -3.345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 2.1F, -2.6F, -0.0873F, -0.0349F, 0.0F));

		PartDefinition cube_r21 = jaw.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(6, 38).mirror().addBox(-2.0F, -0.75F, 4.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 18).mirror().addBox(-2.25F, -0.5F, 4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, -10.1F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r22 = jaw.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 18).mirror().addBox(-1.05F, -0.75F, 2.55F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 43).mirror().addBox(-1.3F, -0.5F, 2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, -10.1F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r23 = jaw.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 38).mirror().addBox(0.25F, -0.75F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 9).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, -10.1F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r24 = jaw.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(32, 44).addBox(-0.5275F, -1.008F, -1.8278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.4F, 1.4F, -5.9F, -0.1047F, 0.2443F, 0.0F));

		PartDefinition cube_r25 = jaw.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(25, 43).addBox(0.3F, -1.0F, 2.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(9, 18).addBox(1.05F, -1.25F, 2.55F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, -10.1F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r26 = jaw.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(12, 35).addBox(-1.0867F, -1.3516F, -3.345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.1F, 2.1F, -2.6F, -0.0873F, 0.0349F, 0.0F));

		PartDefinition cube_r27 = jaw.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0308F, -1.0F, -1.9852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1F, 1.0F, -1.0F, 0.3665F, 0.0349F, 0.0F));

		PartDefinition cube_r28 = jaw.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(9, 18).addBox(1.25F, -1.0F, 4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(6, 38).addBox(2.0F, -1.25F, 4.2F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, -10.1F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r29 = jaw.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -1.0F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5F, 1.0F, -10.1F, -0.0524F, 0.6981F, 0.0F));

		PartDefinition cube_r30 = jaw.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(33, 9).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(27, 38).addBox(-0.25F, -1.25F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0F, -10.1F, 0.0F, 0.6981F, 0.0F));

		PartDefinition eyeright = head.addOrReplaceChild("eyeright", CubeListBuilder.create(), PartPose.offset(-1.3F, -2.05F, -2.75F));

		PartDefinition eyeleft = head.addOrReplaceChild("eyeleft", CubeListBuilder.create(), PartPose.offset(1.3F, -2.05F, -2.75F));

		PartDefinition cube_r31 = eyeleft.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 32).mirror().addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.46F)).mirror(false), PartPose.offsetAndRotation(-2.6644F, 1.4359F, -5.0095F, 0.2417F, 0.0891F, -0.3155F));

		PartDefinition cube_r32 = eyeleft.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 12).mirror().addBox(-1.2F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.0557F, 0.0198F, -0.1808F, 0.0406F, -0.0518F, -0.3505F));

		PartDefinition cube_r33 = eyeleft.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(27, 32).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.46F)), PartPose.offsetAndRotation(0.0644F, 1.4359F, -5.0095F, 0.2417F, -0.0891F, 0.3155F));

		PartDefinition cube_r34 = eyeleft.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 12).addBox(-0.8F, -0.1F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4557F, 0.0198F, -0.1808F, 0.0406F, 0.0518F, 0.3505F));

		PartDefinition armleft = body.addOrReplaceChild("armleft", CubeListBuilder.create().texOffs(6, 33).addBox(2.0F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 2).addBox(-1.0F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 37).addBox(0.0F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 20).addBox(0.0F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.25F, 2.0F, -7.75F, 0.0115F, 0.1304F, 0.088F));

		PartDefinition armleft2 = armleft.addOrReplaceChild("armleft2", CubeListBuilder.create().texOffs(41, 38).addBox(0.49F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(-1.01F, 1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.25F, -0.25F, 0.0F, -0.3254F, -0.2834F, -0.0878F));

		PartDefinition handleft = armleft2.addOrReplaceChild("handleft", CubeListBuilder.create().texOffs(22, 0).addBox(-1.1F, 0.0864F, -2.0889F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2239F, -0.4309F, 0.348F, -0.0018F, -0.0094F));

		PartDefinition armright = body.addOrReplaceChild("armright", CubeListBuilder.create().texOffs(6, 33).mirror().addBox(-3.0F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 2).mirror().addBox(0.0F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 37).mirror().addBox(-2.0F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 20).mirror().addBox(-2.0F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.25F, 2.0F, -7.75F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armright2 = armright.addOrReplaceChild("armright2", CubeListBuilder.create().texOffs(41, 38).mirror().addBox(-1.49F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 9).mirror().addBox(0.01F, 1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.25F, -0.25F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition handright = armright2.addOrReplaceChild("handright", CubeListBuilder.create().texOffs(22, 0).mirror().addBox(-1.9F, 0.0864F, -2.0889F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 3.2239F, -0.4309F));

		PartDefinition legleft = hip.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(20, 41).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 31).addBox(0.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, -5.05F, 6.0F, -0.2024F, 0.4256F, -0.3282F));

		PartDefinition legleft2 = legleft.addOrReplaceChild("legleft2", CubeListBuilder.create().texOffs(0, 16).addBox(-0.2022F, -0.0711F, 0.0591F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 43).addBox(-0.2022F, -0.0711F, -1.1409F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3F, 0.6F, -0.55F, -0.0786F, 0.3405F, 0.0737F));

		PartDefinition footleft = legleft2.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(20, 7).addBox(-1.8854F, -0.3114F, -2.2965F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4578F, 4.0467F, -0.172F, 0.0F, -1.5708F, 0.2182F));

		PartDefinition legright = hip.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(20, 41).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 31).mirror().addBox(-3.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -5.05F, 6.0F, -0.0049F, 0.085F, 0.3119F));

		PartDefinition legright2 = legright.addOrReplaceChild("legright2", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.7978F, -0.0711F, 0.0591F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 43).mirror().addBox(-0.7978F, -0.0711F, -1.1409F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 0.6F, -0.55F, -0.0786F, -0.3405F, -0.0737F));

		PartDefinition footright = legright2.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(20, 7).mirror().addBox(-2.1146F, -0.3114F, -2.2965F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4578F, 4.0467F, -0.172F, 0.0F, 1.5708F, -0.2182F));

		return LayerDefinition.create(meshdefinition, 50, 50);
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