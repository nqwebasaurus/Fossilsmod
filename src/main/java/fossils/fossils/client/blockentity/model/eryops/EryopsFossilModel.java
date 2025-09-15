package fossils.fossils.client.blockentity.model.eryops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EryopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone3;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone5;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart bone7;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone6;
	private final ModelPart bone2;
	private final ModelPart bone8;

	public EryopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail9 = this.tail3.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.body = this.hip.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone3 = this.forelegL2.getChild("bone3");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone5 = this.forelegL4.getChild("bone5");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.bone = this.chest.getChild("bone");
		this.bone7 = this.chest.getChild("bone7");
		this.hindlegL = this.hip.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.hip.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone6 = this.hindlegL4.getChild("bone6");
		this.bone2 = this.hip.getChild("bone2");
		this.bone8 = this.hip.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, 8.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body6_r1 = hip.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(77, 77).addBox(0.0F, -0.9616F, 1.0497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 77).addBox(0.0F, -0.9616F, 3.0497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(-0.5F, 0.0384F, 0.0497F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -8.9847F, 1.8393F, -0.144F, 0.0F, 0.0F));

		PartDefinition body8_r1 = hip.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-2.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -8.3004F, 3.3285F, -0.055F, -0.1089F, -1.0614F));

		PartDefinition body7_r1 = hip.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -8.3004F, 3.3285F, -0.1021F, -0.0668F, -0.5374F));

		PartDefinition body6_r2 = hip.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(72, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -8.3004F, 3.3285F, -0.1204F, -0.0196F, -0.1208F));

		PartDefinition body8_r2 = hip.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(75, 46).mirror().addBox(-1.0181F, 0.1674F, 1.4012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -8.412F, 3.4067F, -0.1559F, -0.009F, -0.122F));

		PartDefinition body5_r1 = hip.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(72, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -8.3004F, 3.3285F, -0.1204F, 0.0196F, 0.1208F));

		PartDefinition body7_r2 = hip.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(10, 77).addBox(1.4538F, -1.309F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -8.3004F, 3.3285F, -0.055F, 0.1089F, 1.0614F));

		PartDefinition body6_r3 = hip.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(0, 77).addBox(0.9136F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -8.3004F, 3.3285F, -0.1021F, 0.0668F, 0.5374F));

		PartDefinition body7_r3 = hip.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(75, 46).addBox(0.0181F, 0.1674F, 1.4012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -8.412F, 3.4067F, -0.1559F, 0.009F, 0.122F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.3007F, -0.0289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(49, 77).addBox(0.0F, -0.9007F, 1.9711F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.9766F, 6.7405F, -0.3302F, 0.2067F, -0.0702F));

		PartDefinition tail4_r1 = tail.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(17, 61).addBox(0.0F, 0.4F, 1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 77).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.031F, 0.3792F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = tail.addOrReplaceChild("tail5_r1", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-0.4F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 77).mirror().addBox(-0.4F, -1.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3007F, -0.0289F, 0.0F, -0.0698F, -1.5708F));

		PartDefinition tail4_r2 = tail.addOrReplaceChild("tail4_r2", CubeListBuilder.create().texOffs(67, 77).addBox(0.4F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 77).addBox(0.4F, -1.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3007F, -0.0289F, 0.0F, 0.0698F, 1.5708F));

		PartDefinition tail2_r1 = tail.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(29, 36).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3007F, -0.0289F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5F, -0.35F, -0.0483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(58, 77).addBox(0.0F, -0.9971F, -0.0483F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 59).addBox(0.0F, -0.7971F, 1.9517F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, 3.9F, 0.0536F, 0.2179F, 0.0116F));

		PartDefinition tail6_r1 = tail2.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-0.7F, -1.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 68).mirror().addBox(-0.7F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4971F, 0.4517F, 0.0F, 0.0F, -1.5708F));

		PartDefinition tail5_r2 = tail2.addOrReplaceChild("tail5_r2", CubeListBuilder.create().texOffs(77, 71).addBox(0.7F, -1.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 68).addBox(0.7F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4971F, 0.4517F, 0.0F, 0.0F, 1.5708F));

		PartDefinition tail5_r3 = tail2.addOrReplaceChild("tail5_r3", CubeListBuilder.create().texOffs(52, 75).addBox(0.0F, 1.2F, 3.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 77).addBox(0.0F, 2.4F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.981F, -3.5208F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(9, 40).addBox(-0.5F, -0.2108F, -0.0338F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1617F, 2.8579F, 0.0536F, 0.2179F, 0.0116F));

		PartDefinition tail7_r1 = tail3.addOrReplaceChild("tail7_r1", CubeListBuilder.create().texOffs(15, 78).addBox(0.0F, 3.2F, 8.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1303F, -7.3836F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail9 = tail3.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.2108F, -0.0339F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0062F, 2.8443F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition tail8_r1 = tail9.addOrReplaceChild("tail8_r1", CubeListBuilder.create().texOffs(5, 78).addBox(0.0F, 3.6F, 10.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1241F, -10.2279F, 0.4102F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(44, 20).addBox(-0.5F, -0.2108F, -0.0338F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0181F, 2.9274F, 0.0452F, 0.2615F, 0.0117F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(44, 34).addBox(-0.5F, -0.2108F, -0.0338F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.032F, 2.9402F, 0.0715F, 0.2176F, 0.0155F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.4884F, 2.0218F, -0.0616F, -0.1307F, 0.008F));

		PartDefinition body5_r2 = body.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(77, 62).addBox(0.0F, -0.9857F, -0.0828F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.451F, -1.0307F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body5_r3 = body.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(27, 78).addBox(0.0F, -1.0097F, 2.9905F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 78).addBox(0.0F, -1.0097F, 0.9905F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 14).addBox(-0.5F, -0.0097F, 0.9905F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, -6.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body7_r4 = body.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-4.3721F, -1.3474F, 1.427F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.353F, -4.519F, 0.0991F, -0.1868F, -1.1276F));

		PartDefinition body6_r4 = body.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(46, 16).mirror().addBox(-5.3673F, -1.359F, -0.4948F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.353F, -4.519F, 0.0994F, 0.204F, -1.0889F));

		PartDefinition body4_r1 = body.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(76, 50).mirror().addBox(-0.9896F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.353F, -4.519F, 0.2231F, 0.0405F, -0.1521F));

		PartDefinition body5_r4 = body.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(-1.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.353F, -4.519F, 0.1881F, 0.1272F, -0.5635F));

		PartDefinition body6_r5 = body.addOrReplaceChild("body6_r5", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -0.5933F, 0.0529F, 0.0016F, -0.1223F));

		PartDefinition body7_r5 = body.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -0.5933F, 0.0477F, 0.023F, -0.5407F));

		PartDefinition body8_r3 = body.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-3.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -0.5933F, 0.0298F, 0.0437F, -1.0642F));

		PartDefinition body5_r5 = body.addOrReplaceChild("body5_r5", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -2.5933F, 0.221F, 0.0518F, -0.221F));

		PartDefinition body6_r6 = body.addOrReplaceChild("body6_r6", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -2.5933F, 0.1816F, 0.1367F, -0.6332F));

		PartDefinition body7_r6 = body.addOrReplaceChild("body7_r6", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -2.5933F, 0.0888F, 0.209F, -1.1599F));

		PartDefinition body5_r6 = body.addOrReplaceChild("body5_r6", CubeListBuilder.create().texOffs(15, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -0.5933F, 0.0529F, -0.0016F, 0.1223F));

		PartDefinition body6_r7 = body.addOrReplaceChild("body6_r7", CubeListBuilder.create().texOffs(5, 76).addBox(0.9136F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -0.5933F, 0.0477F, -0.023F, 0.5407F));

		PartDefinition body7_r7 = body.addOrReplaceChild("body7_r7", CubeListBuilder.create().texOffs(67, 57).addBox(1.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -0.5933F, 0.0298F, -0.0437F, 1.0642F));

		PartDefinition body4_r2 = body.addOrReplaceChild("body4_r2", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -2.5933F, 0.221F, -0.0518F, 0.221F));

		PartDefinition body5_r7 = body.addOrReplaceChild("body5_r7", CubeListBuilder.create().texOffs(60, 75).addBox(0.9136F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -2.5933F, 0.1816F, -0.1367F, 0.6332F));

		PartDefinition body6_r8 = body.addOrReplaceChild("body6_r8", CubeListBuilder.create().texOffs(57, 27).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -2.5933F, 0.0888F, -0.209F, 1.1599F));

		PartDefinition body4_r3 = body.addOrReplaceChild("body4_r3", CubeListBuilder.create().texOffs(30, 76).addBox(0.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.353F, -4.519F, 0.1881F, -0.1272F, 0.5635F));

		PartDefinition body3_r1 = body.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(76, 50).addBox(-0.0104F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.353F, -4.519F, 0.2231F, -0.0405F, 0.1521F));

		PartDefinition body5_r8 = body.addOrReplaceChild("body5_r8", CubeListBuilder.create().texOffs(46, 16).addBox(1.3673F, -1.359F, -0.4948F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.353F, -4.519F, 0.0994F, -0.204F, 1.0889F));

		PartDefinition body6_r9 = body.addOrReplaceChild("body6_r9", CubeListBuilder.create().texOffs(0, 66).addBox(2.3721F, -1.3474F, 1.427F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.353F, -4.519F, 0.0991F, 0.1868F, 1.1276F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.253F, -5.019F, 0.1402F, -0.0864F, -0.0122F));

		PartDefinition body3_r2 = body2.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, -0.0097F, -2.0095F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(77, 74).addBox(0.0F, -1.0097F, -1.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 77).addBox(0.0F, -1.0097F, 0.9905F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.438F, -3.0067F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body6_r10 = body2.addOrReplaceChild("body6_r10", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(-1.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -3.5F, 0.0994F, 0.0708F, -0.5722F));

		PartDefinition body5_r9 = body2.addOrReplaceChild("body5_r9", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.9896F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -3.5F, 0.1196F, 0.0244F, -0.1554F));

		PartDefinition body7_r8 = body2.addOrReplaceChild("body7_r8", CubeListBuilder.create().texOffs(33, 30).mirror().addBox(-7.3673F, -1.359F, -0.4948F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -3.5F, 0.0507F, 0.111F, -1.0965F));

		PartDefinition body8_r4 = body2.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(37, 66).mirror().addBox(-5.3721F, -1.3474F, 1.8271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -3.5F, 0.0524F, -0.2812F, -1.1167F));

		PartDefinition body7_r9 = body2.addOrReplaceChild("body7_r9", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(-5.3721F, -1.3474F, 1.827F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.5F, 0.0444F, -0.2968F, -1.1144F));

		PartDefinition body6_r11 = body2.addOrReplaceChild("body6_r11", CubeListBuilder.create().texOffs(35, 18).mirror().addBox(-6.3673F, -1.359F, -0.4948F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.5F, 0.0427F, 0.0955F, -1.0974F));

		PartDefinition body5_r10 = body2.addOrReplaceChild("body5_r10", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-1.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.5F, 0.0847F, 0.0614F, -0.5732F));

		PartDefinition body4_r4 = body2.addOrReplaceChild("body4_r4", CubeListBuilder.create().texOffs(75, 48).mirror().addBox(-0.9896F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.5F, 0.1023F, 0.0217F, -0.1558F));

		PartDefinition body7_r10 = body2.addOrReplaceChild("body7_r10", CubeListBuilder.create().texOffs(37, 66).addBox(3.3721F, -1.3474F, 1.8271F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, 0.0524F, 0.2812F, 1.1167F));

		PartDefinition body6_r12 = body2.addOrReplaceChild("body6_r12", CubeListBuilder.create().texOffs(33, 30).addBox(1.3673F, -1.359F, -0.4948F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, 0.0507F, -0.111F, 1.0965F));

		PartDefinition body4_r5 = body2.addOrReplaceChild("body4_r5", CubeListBuilder.create().texOffs(20, 76).addBox(-0.0104F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, 0.1196F, -0.0244F, 0.1554F));

		PartDefinition body5_r11 = body2.addOrReplaceChild("body5_r11", CubeListBuilder.create().texOffs(25, 76).addBox(0.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, 0.0994F, -0.0708F, 0.5722F));

		PartDefinition body6_r13 = body2.addOrReplaceChild("body6_r13", CubeListBuilder.create().texOffs(66, 27).addBox(3.3721F, -1.3474F, 1.827F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.5F, 0.0444F, 0.2968F, 1.1144F));

		PartDefinition body5_r12 = body2.addOrReplaceChild("body5_r12", CubeListBuilder.create().texOffs(35, 18).addBox(1.3673F, -1.359F, -0.4948F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.5F, 0.0427F, -0.0955F, 1.0974F));

		PartDefinition body4_r6 = body2.addOrReplaceChild("body4_r6", CubeListBuilder.create().texOffs(55, 75).addBox(0.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.5F, 0.0847F, -0.0614F, 0.5732F));

		PartDefinition body3_r3 = body2.addOrReplaceChild("body3_r3", CubeListBuilder.create().texOffs(75, 48).addBox(-0.0104F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.5F, 0.1023F, -0.0217F, 0.1558F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.012F, -5.0041F, 0.0524F, -0.0436F, -0.0023F));

		PartDefinition body9_r1 = chest.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(68, 45).mirror().addBox(-4.9902F, -1.284F, 1.0879F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.338F, -2.4933F, 0.0912F, -0.1358F, -1.1362F));

		PartDefinition body8_r5 = chest.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(22, 28).mirror().addBox(-7.4538F, -1.309F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.338F, -2.4933F, 0.0917F, 0.1684F, -1.1084F));

		PartDefinition body7_r11 = chest.addOrReplaceChild("body7_r11", CubeListBuilder.create().texOffs(72, 74).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.338F, -2.4933F, 0.1635F, 0.1002F, -0.5843F));

		PartDefinition body6_r14 = chest.addOrReplaceChild("body6_r14", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.338F, -2.4933F, 0.1898F, 0.0255F, -0.1713F));

		PartDefinition body6_r15 = chest.addOrReplaceChild("body6_r15", CubeListBuilder.create().texOffs(77, 32).mirror().addBox(-1.941F, -0.3342F, -0.7984F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5101F, 0.0208F, -0.2084F, 0.0734F, 0.0465F, -0.6087F));

		PartDefinition body8_r6 = chest.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(55, 67).mirror().addBox(-5.2593F, -1.2407F, 2.2736F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5101F, 0.0208F, -0.2084F, 0.0446F, -0.4462F, -1.1548F));

		PartDefinition body7_r12 = chest.addOrReplaceChild("body7_r12", CubeListBuilder.create().texOffs(33, 32).mirror().addBox(-7.5139F, -1.2599F, -0.7984F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5101F, 0.0208F, -0.2084F, 0.0404F, 0.077F, -1.1324F));

		PartDefinition body5_r13 = chest.addOrReplaceChild("body5_r13", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.9956F, 0.0775F, -0.7984F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5101F, 0.0208F, -0.2084F, 0.086F, 0.0127F, -0.191F));

		PartDefinition body8_r7 = chest.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(68, 45).addBox(2.9902F, -1.284F, 1.0879F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.338F, -2.4933F, 0.0912F, 0.1358F, 1.1362F));

		PartDefinition body7_r13 = chest.addOrReplaceChild("body7_r13", CubeListBuilder.create().texOffs(22, 28).addBox(1.4538F, -1.309F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.338F, -2.4933F, 0.0917F, -0.1684F, 1.1084F));

		PartDefinition body6_r16 = chest.addOrReplaceChild("body6_r16", CubeListBuilder.create().texOffs(72, 74).addBox(0.9136F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.338F, -2.4933F, 0.1635F, -0.1002F, 0.5843F));

		PartDefinition body5_r14 = chest.addOrReplaceChild("body5_r14", CubeListBuilder.create().texOffs(74, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.338F, -2.4933F, 0.1898F, -0.0255F, 0.1713F));

		PartDefinition body5_r15 = chest.addOrReplaceChild("body5_r15", CubeListBuilder.create().texOffs(77, 32).addBox(0.941F, -0.3342F, -0.7984F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5101F, 0.0208F, -0.2084F, 0.0734F, -0.0465F, 0.6087F));

		PartDefinition body7_r14 = chest.addOrReplaceChild("body7_r14", CubeListBuilder.create().texOffs(55, 67).addBox(3.2593F, -1.2407F, 2.2736F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5101F, 0.0208F, -0.2084F, 0.0446F, 0.4462F, 1.1548F));

		PartDefinition body6_r17 = chest.addOrReplaceChild("body6_r17", CubeListBuilder.create().texOffs(33, 32).addBox(1.5139F, -1.2599F, -0.7984F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5101F, 0.0208F, -0.2084F, 0.0404F, -0.077F, 1.1324F));

		PartDefinition body4_r7 = chest.addOrReplaceChild("body4_r7", CubeListBuilder.create().texOffs(35, 77).addBox(-0.0044F, 0.0775F, -0.7984F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5101F, 0.0208F, -0.2084F, 0.086F, -0.0127F, 0.191F));

		PartDefinition neck3_r1 = chest.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(62, 9).addBox(-0.5F, 2.975F, -2.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3315F, -4.9487F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body3_r4 = chest.addOrReplaceChild("body3_r4", CubeListBuilder.create().texOffs(18, 78).addBox(0.0F, -1.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 77).addBox(0.0F, -1.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 26).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.9F, 0.1047F, 0.0F, 0.0F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(52, 62).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.804F, 4.9622F, -2.9971F, 0.7189F, 0.0469F, -1.3802F));

		PartDefinition cube_r1 = forelegL.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 29).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9718F, -0.3243F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r2 = forelegL.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.5229F, -0.3992F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = forelegL.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 5).addBox(-0.5F, -1.4F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = forelegL.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, -0.675F, -1.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0588F, 4.7516F, -0.1499F, -1.6585F, 1.1657F, -0.3089F));

		PartDefinition cube_r5 = forelegL2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(73, 38).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = forelegL2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 72).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 72).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r7 = forelegL2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 67).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = forelegL2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 58).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(62, 63).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone3 = forelegL2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4473F, 2.4839F, -0.249F, 0.0019F, -0.0436F, -1.2654F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 6).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(57, 62).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-3.804F, 4.9622F, -2.9971F, -0.4592F, -0.0469F, 1.3802F));

		PartDefinition cube_r10 = forelegL3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9718F, -0.3243F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r11 = forelegL3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 14).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.5229F, -0.3992F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = forelegL3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 50).addBox(-0.5F, -1.4F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r13 = forelegL3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(43, 51).addBox(-0.5F, -0.675F, -1.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0588F, 4.7516F, -0.1499F, -1.1793F, -0.889F, -0.1069F));

		PartDefinition cube_r14 = forelegL4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 3).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r15 = forelegL4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(72, 59).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 72).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r16 = forelegL4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 33).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = forelegL4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(63, 37).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(64, 13).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone5 = forelegL4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4473F, 2.4839F, -0.249F, -0.0149F, 0.041F, 0.8724F));

		PartDefinition cube_r18 = bone5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(11, 32).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(19, 7).addBox(-0.5F, -0.49F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(21, 78).addBox(0.0F, -1.09F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 65).addBox(0.0F, -1.09F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.9F, -0.0416F, -0.173F, -0.023F));

		PartDefinition body5_r16 = neck.addOrReplaceChild("body5_r16", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(-0.9896F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -2.496F, 0.0937F, 0.0203F, -0.3829F));

		PartDefinition body6_r18 = neck.addOrReplaceChild("body6_r18", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-1.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -2.496F, 0.0774F, 0.0567F, -0.8005F));

		PartDefinition body7_r15 = neck.addOrReplaceChild("body7_r15", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-4.6721F, -1.3474F, 1.6271F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -0.496F, 0.0404F, -0.3047F, -1.218F));

		PartDefinition body6_r19 = neck.addOrReplaceChild("body6_r19", CubeListBuilder.create().texOffs(48, 18).mirror().addBox(-5.3673F, -1.359F, -0.4948F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -0.496F, 0.0387F, 0.0877F, -1.2025F));

		PartDefinition body4_r8 = neck.addOrReplaceChild("body4_r8", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(-0.9896F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -0.496F, 0.0937F, 0.0203F, -0.2607F));

		PartDefinition body5_r17 = neck.addOrReplaceChild("body5_r17", CubeListBuilder.create().texOffs(40, 75).mirror().addBox(-1.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -0.496F, 0.0774F, 0.0567F, -0.6784F));

		PartDefinition body5_r18 = neck.addOrReplaceChild("body5_r18", CubeListBuilder.create().texOffs(76, 52).addBox(0.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -2.496F, 0.0774F, -0.0567F, 0.8005F));

		PartDefinition body4_r9 = neck.addOrReplaceChild("body4_r9", CubeListBuilder.create().texOffs(76, 54).addBox(-0.0104F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -2.496F, 0.0937F, -0.0203F, 0.3829F));

		PartDefinition body4_r10 = neck.addOrReplaceChild("body4_r10", CubeListBuilder.create().texOffs(40, 75).addBox(0.8636F, -0.4932F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -0.496F, 0.0774F, -0.0567F, 0.6784F));

		PartDefinition body3_r5 = neck.addOrReplaceChild("body3_r5", CubeListBuilder.create().texOffs(75, 44).addBox(-0.0104F, -0.0993F, -0.4948F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -0.496F, 0.0937F, -0.0203F, 0.2607F));

		PartDefinition body5_r19 = neck.addOrReplaceChild("body5_r19", CubeListBuilder.create().texOffs(48, 18).addBox(1.3673F, -1.359F, -0.4948F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -0.496F, 0.0387F, -0.0877F, 1.2025F));

		PartDefinition body6_r20 = neck.addOrReplaceChild("body6_r20", CubeListBuilder.create().texOffs(0, 75).addBox(3.6721F, -1.3474F, 1.6271F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -0.496F, 0.0404F, 0.3047F, 1.218F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0478F, -4.1466F, -0.1671F, -0.2555F, -0.0579F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(74, 24).addBox(-0.5F, -1.0589F, -0.9115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5318F, -8.1607F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(33, 34).addBox(-1.0F, -1.0611F, -0.0548F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5318F, -8.1607F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(42, 69).addBox(-0.5F, -0.0281F, -2.0883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5318F, -8.1607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(35, 14).addBox(-1.5F, 0.0F, -0.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8958F, -2.1358F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 26).addBox(-1.5F, 0.0F, -0.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6174F, -4.1163F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(47, 43).addBox(-1.5F, -0.008F, -1.8196F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5316F, -4.315F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(47, 39).addBox(-1.0F, -1.3729F, -1.9529F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.5318F, -8.1607F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.4675F, -2.2921F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 1.5318F, -8.1607F, 0.0698F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.792F, 0.5149F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r27 = jaw.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 62).mirror().addBox(-1.5718F, -1.0233F, -1.6216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7532F, 0.8173F, -6.1994F, -0.2694F, -0.2359F, 0.0644F));

		PartDefinition cube_r28 = jaw.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 29).mirror().addBox(-1.5718F, 0.0187F, 0.3794F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2356F, -0.7046F, -7.9408F, -0.1385F, -0.2359F, 0.0644F));

		PartDefinition cube_r29 = jaw.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.944F, 0.5799F, -5.0861F, -0.2718F, -0.138F, 0.0106F));

		PartDefinition cube_r30 = jaw.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(0.0308F, -0.55F, -3.1352F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 0.6F, -0.5F, 0.0611F, -0.0349F, 0.0F));

		PartDefinition cube_r31 = jaw.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(73, 35).mirror().addBox(0.0308F, -1.525F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5891F, 1.9821F, -3.6766F, -0.2007F, -0.0349F, 0.0F));

		PartDefinition cube_r32 = jaw.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(0.0308F, -1.525F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.6237F, 2.0953F, -2.6837F, -0.1134F, -0.0349F, 0.0F));

		PartDefinition cube_r33 = jaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(0.0308F, -1.0F, -0.9602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.653F, 1.5599F, -1.8463F, 0.0087F, -0.0349F, 0.0F));

		PartDefinition cube_r34 = jaw.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(59, 50).mirror().addBox(0.0308F, -1.0F, -1.7602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7126F, 0.9887F, -0.1404F, 0.3229F, -0.0349F, 0.0F));

		PartDefinition cube_r35 = jaw.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(-0.5F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0641F, -0.6665F, -3.5002F, -1.1694F, -0.0349F, 0.0F));

		PartDefinition cube_r36 = jaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5035F, -0.7614F, -4.7188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2232F, 0.3035F, 1.1574F, -0.0436F, -0.0349F, -0.0012F));

		PartDefinition cube_r37 = jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.5035F, 0.0284F, -3.7958F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2232F, 0.3035F, 1.1574F, -0.2531F, -0.0349F, -0.0012F));

		PartDefinition cube_r38 = jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.0619F, 0.3372F, -2.147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5593F, -0.15F, -3.8726F, -0.2618F, -0.1396F, 0.0F));

		PartDefinition cube_r39 = jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 5).mirror().addBox(-0.0619F, -0.1422F, -2.2537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 67).mirror().addBox(0.2579F, -0.3946F, -2.2051F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5593F, -0.15F, -3.8726F, -0.0873F, -0.1396F, 0.0F));

		PartDefinition cube_r40 = jaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-1.0643F, -1.0503F, -2.1276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7146F, 0.4232F, -8.1195F, -0.3714F, -0.6699F, 0.2139F));

		PartDefinition cube_r41 = jaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-0.3667F, -0.3267F, -0.4901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 14).mirror().addBox(-0.1333F, -0.6733F, -0.1099F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1341F, -0.8F, -9.6315F, -0.3365F, -0.6699F, 0.2139F));

		PartDefinition cube_r42 = jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(0.0183F, -0.5694F, -0.0497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 0).mirror().addBox(0.2517F, -0.916F, -0.0696F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7888F, -0.5187F, -9.5192F, -0.3102F, -0.5674F, 0.1986F));

		PartDefinition cube_r43 = jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(27, 69).mirror().addBox(-1.3218F, -0.5563F, 0.7794F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1388F, -0.5187F, -8.4192F, -0.1822F, -0.2359F, 0.0644F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(33, 62).addBox(0.5718F, -1.0233F, -1.6216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7532F, 0.8173F, -6.1994F, -0.2694F, 0.2359F, -0.0644F));

		PartDefinition cube_r45 = jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(62, 29).addBox(0.5718F, 0.0187F, 0.3794F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.2356F, -0.7046F, -7.9408F, -0.1385F, 0.2359F, -0.0644F));

		PartDefinition cube_r46 = jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.944F, 0.5799F, -5.0861F, -0.2718F, 0.138F, -0.0106F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(38, 39).addBox(-1.0308F, -0.55F, -3.1352F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7F, 0.6F, -0.5F, 0.0611F, 0.0349F, 0.0F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(73, 35).addBox(-1.0308F, -1.525F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5891F, 1.9821F, -3.6766F, -0.2007F, 0.0349F, 0.0F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(30, 73).addBox(-1.0308F, -1.525F, -0.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.6237F, 2.0953F, -2.6837F, -0.1134F, 0.0349F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(74, 12).addBox(-1.0308F, -1.0F, -0.9602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.653F, 1.5599F, -1.8463F, 0.0087F, 0.0349F, 0.0F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(59, 50).addBox(-1.0308F, -1.0F, -1.7602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.7126F, 0.9887F, -0.1404F, 0.3229F, 0.0349F, 0.0F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(25, 73).addBox(-0.5F, 0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0641F, -0.6665F, -3.5002F, -1.1694F, 0.0349F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 72).addBox(-0.4965F, -0.7614F, -4.7188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2232F, 0.3035F, 1.1574F, -0.0436F, 0.0349F, 0.0012F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 0).addBox(-0.4965F, 0.0284F, -3.7958F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2232F, 0.3035F, 1.1574F, -0.2531F, 0.0349F, 0.0012F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(59, 0).addBox(-0.9381F, 0.3372F, -2.147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5593F, -0.15F, -3.8726F, -0.2618F, 0.1396F, 0.0F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(57, 5).addBox(-0.9381F, -0.1422F, -2.2537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(50, 67).addBox(-0.2579F, -0.3946F, -2.2051F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5593F, -0.15F, -3.8726F, -0.0873F, 0.1396F, 0.0F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(21, 52).addBox(0.0643F, -1.0503F, -2.1276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7146F, 0.4232F, -8.1195F, -0.3714F, 0.6699F, -0.2139F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(69, 29).addBox(-0.6333F, -0.3267F, -0.4901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 14).addBox(0.1333F, -0.6733F, -0.1099F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1341F, -0.8F, -9.6315F, -0.3365F, 0.6699F, -0.2139F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(56, 42).addBox(-1.0183F, -0.5694F, -0.0497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 0).addBox(-0.2517F, -0.916F, -0.0696F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7888F, -0.5187F, -9.5192F, -0.3102F, 0.5674F, -0.1986F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(27, 69).addBox(1.3218F, -0.5563F, 0.7794F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1388F, -0.5187F, -8.4192F, -0.1822F, 0.2359F, -0.0644F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(45, 62).addBox(-1.0F, -0.375F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(35, 75).addBox(-1.0F, -0.625F, -0.075F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8145F, -9.8721F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.5F, 1.6F, -9.0F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 54).addBox(-1.4F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.229F, -1.9413F, 8.8113F, 0.2265F, -1.1224F, -0.2075F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(74, 21).addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.229F, -1.9413F, 8.8113F, 0.1097F, -0.4755F, -0.0531F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 47).addBox(-0.2394F, -0.0134F, -0.7723F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.1F, 9.0F, -0.1348F, -0.6514F, 0.7437F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, 45).addBox(-0.9729F, -0.7217F, -2.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, -0.1F, 6.1F, 0.1032F, 0.0357F, -0.009F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(69, 24).addBox(-0.1331F, -0.0281F, -2.1446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.0732F, -0.3047F, 0.022F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 62).addBox(1.2062F, -0.0555F, -0.2486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.0229F, 0.5927F, -0.0255F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(20, 73).addBox(1.0444F, -0.0732F, 1.1927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.1606F, 0.7191F, 0.0936F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(22, 65).addBox(0.5211F, -0.8997F, -0.3801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.2153F, 0.6307F, 0.1061F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 65).addBox(0.5211F, -0.8171F, -0.855F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.0845F, 0.6307F, 0.1061F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(67, 67).addBox(-1.4478F, -1.4692F, -0.7342F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9F, 0.0F, 5.1F, 0.3634F, 0.0225F, 0.0328F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(45, 65).addBox(-1.4478F, -1.4346F, -1.2934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9F, 0.0F, 5.1F, 0.2325F, 0.0225F, 0.0328F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(69, 16).addBox(0.8829F, -0.5194F, 1.0432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 1.1393F, 0.3002F, 0.4598F, 0.0521F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(69, 20).addBox(0.8829F, -0.6258F, 0.6058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 1.1393F, 0.1693F, 0.4598F, 0.0521F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(55, 58).addBox(1.8246F, -0.1343F, 1.1437F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 54).addBox(1.8246F, -0.5093F, 0.6437F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 1.1393F, 0.1603F, 0.243F, 0.0261F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(47, 71).addBox(0.9924F, 0.3209F, 1.8881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, -2.1F, 9.0F, -0.4437F, 0.0788F, 0.1401F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(62, 18).addBox(0.277F, 0.0374F, 0.0388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.1F, 9.0F, -0.0202F, 0.6209F, 0.6115F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(26, 61).addBox(1.2743F, 0.0374F, -0.216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, -2.1F, 9.0F, -0.0165F, 0.0974F, 0.6216F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(60, 33).addBox(0.9924F, 1.0713F, -0.216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.1F, 9.0F, -0.0597F, 0.0788F, 0.1401F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(41, 56).addBox(-0.6291F, -0.581F, -0.971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6479F, -0.7155F, 7.8086F, -0.005F, 0.2742F, 0.6729F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(56, 46).addBox(-0.4182F, -0.3701F, -1.0218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6479F, -0.7155F, 7.8086F, -0.2005F, 0.2094F, 0.2281F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(74, 15).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0582F, -1.214F, 6.4292F, 0.245F, -0.04F, 0.4757F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(15, 73).addBox(-0.5279F, -0.2064F, 1.0446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4729F, -0.6533F, 5.0171F, 0.2357F, 0.0785F, 0.0012F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(10, 71).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9993F, -1.1285F, 5.6815F, 0.0306F, 0.0728F, 0.5088F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 74).addBox(0.3503F, 0.6334F, -0.1481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(47, 74).addBox(0.3503F, 0.6334F, -0.4481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.3843F, 0.4691F, -1.139F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(74, 27).addBox(0.546F, 0.5016F, -0.3634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.1088F, 0.3621F, -1.1473F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(5, 70).addBox(0.3548F, 0.4984F, -0.6299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.1029F, 0.4214F, -1.1493F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(72, 32).addBox(-0.5F, -0.925F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.6835F, -0.0955F, 1.1127F, -0.3908F, 0.2725F, -0.9983F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(18, 42).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.7402F, -1.1118F, 2.4218F, 0.0019F, 0.2725F, -0.9983F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 32).addBox(0.3883F, 0.5298F, 0.0843F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.037F, 0.27F, -1.1432F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(22, 30).addBox(0.0455F, -1.0611F, 0.1741F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.2469F, 0.1347F, 0.037F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(48, 58).addBox(-0.6053F, -0.7756F, -1.8232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1278F, -1.7795F, 6.712F, 0.2872F, 0.0949F, -0.6871F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(7, 55).addBox(-0.6053F, -0.7725F, -0.1897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1278F, -1.7795F, 6.712F, -0.1927F, 0.0949F, -0.6871F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(47, 47).addBox(0.0F, 0.0F, -2.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4609F, 8.8639F, 0.0023F, 0.0087F, 0.5235F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 71).addBox(-0.4162F, -0.4771F, -0.4822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2341F, -1.7962F, 6.8579F, 0.0606F, -0.0784F, 0.5286F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(5, 73).addBox(-0.6093F, -0.4771F, -0.3246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2341F, -1.7962F, 6.8579F, 0.062F, 0.2264F, 0.5473F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(71, 53).addBox(-0.6116F, -0.4771F, -0.667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2341F, -1.7962F, 6.8579F, 0.0664F, -0.4268F, 0.5059F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(48, 25).addBox(0.0F, 0.0F, -0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2174F, 4.8837F, 0.108F, -0.0696F, 0.5194F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(66, 50).addBox(-1.0F, -0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2131F, 4.859F, 0.0202F, -0.0434F, -1.1215F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(32, 66).addBox(-0.9697F, 0.0279F, -0.0115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1148F, -1.9045F, 3.9407F, 0.0774F, 0.2868F, -1.1088F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(72, 65).addBox(-0.083F, -0.0086F, -0.0079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.9316F, 3.985F, 0.2757F, 0.0843F, 0.0225F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(41, 11).addBox(-0.8325F, -1.3894F, -2.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.6084F, -0.8952F, -0.1763F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 34).addBox(-0.2607F, -0.4675F, -2.4358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.0753F, -0.383F, -0.0282F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(21, 55).addBox(-0.8508F, -0.4675F, -2.4059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.1131F, -0.9045F, -0.089F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(34, 54).addBox(-0.3101F, -0.2867F, -2.374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.0849F, -0.9058F, 0.0669F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 54).addBox(-0.1489F, -0.2861F, -2.3741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.2948F, -0.873F, -0.4182F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 0).addBox(-0.0749F, -0.2867F, -2.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, -0.1094F, -1.0709F, 0.0961F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(17, 70).addBox(-0.0117F, -0.3193F, -2.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.6454F, -0.9317F, -0.7819F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(32, 70).addBox(0.3705F, -0.2457F, -2.4286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.0248F, -1.1262F, -0.0524F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(50, 54).addBox(-0.2517F, -1.3999F, -2.1141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.517F, -0.38F, -0.0562F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(74, 56).addBox(0.0381F, -1.0111F, -0.6074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.3996F, 0.2647F, 0.0464F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(71, 50).addBox(-0.8695F, -1.0251F, -0.9184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9F, -0.1F, 6.1F, 0.0439F, 0.0783F, 0.0053F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(72, 62).addBox(-1.0054F, 0.0F, -0.9813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9349F, -1.1343F, 5.2639F, 0.1347F, 0.0136F, 0.5071F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(72, 68).addBox(-0.9427F, -1.0628F, -3.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(57, 23).addBox(-0.9427F, -1.0628F, -2.7791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.1F, 6.1F, 0.0873F, 0.0348F, 0.003F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 9).addBox(-0.8834F, -0.4675F, -1.3256F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.0709F, 0.1741F, 0.0123F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(37, 72).addBox(1.0465F, -0.5175F, 1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.0682F, 0.8393F, 0.091F, 0.6961F, 0.0585F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5F, 1.6F, -9.0F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(64, 54).mirror().addBox(-0.6F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.229F, -1.9413F, 8.8113F, 0.2265F, 1.1224F, 0.2075F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.229F, -1.9413F, 8.8113F, 0.1097F, 0.4755F, 0.0531F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(63, 47).mirror().addBox(-1.7606F, -0.0134F, -0.7723F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.1F, 9.0F, -0.1348F, 0.6514F, -0.7437F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(9, 45).mirror().addBox(-0.0271F, -0.7217F, -2.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.1F, 6.1F, 0.1032F, -0.0357F, 0.009F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-0.8669F, -0.0281F, -2.1446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.0732F, 0.3047F, -0.022F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-2.2062F, -0.0555F, -0.2486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.0229F, -0.5927F, 0.0255F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-2.0444F, -0.0732F, 1.1927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.1606F, -0.7191F, -0.0936F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(22, 65).mirror().addBox(-1.5211F, -0.8997F, -0.3801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.2153F, -0.6307F, -0.1061F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-1.5211F, -0.8171F, -0.855F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.0845F, -0.6307F, -0.1061F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(67, 67).mirror().addBox(0.4478F, -1.4692F, -0.7342F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, 5.1F, 0.3634F, -0.0225F, -0.0328F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(0.4478F, -1.4346F, -1.2934F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, 5.1F, 0.2325F, -0.0225F, -0.0328F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(-1.8829F, -0.5194F, 1.0432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 1.1393F, 0.3002F, -0.4598F, -0.0521F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-1.8829F, -0.6258F, 0.6058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 1.1393F, 0.1693F, -0.4598F, -0.0521F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-2.8246F, -0.1343F, 1.1437F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 54).mirror().addBox(-2.8246F, -0.5093F, 0.6437F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 1.1393F, 0.1603F, -0.243F, -0.0261F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(47, 71).mirror().addBox(-1.9924F, 0.3209F, 1.8881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.1F, 9.0F, -0.4437F, -0.0788F, -0.1401F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-1.277F, 0.0374F, 0.0388F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.1F, 9.0F, -0.0202F, -0.6209F, -0.6115F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(26, 61).mirror().addBox(-2.2743F, 0.0374F, -0.216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.1F, 9.0F, -0.0165F, -0.0974F, -0.6216F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(-1.9924F, 1.0713F, -0.216F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.1F, 9.0F, -0.0597F, -0.0788F, -0.1401F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(41, 56).mirror().addBox(-0.3709F, -0.581F, -0.971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6479F, -0.7155F, 7.8086F, -0.005F, -0.2742F, -0.6729F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-0.5818F, -0.3701F, -1.0218F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6479F, -0.7155F, 7.8086F, -0.2005F, -0.2094F, -0.2281F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0582F, -1.214F, 6.4292F, 0.245F, 0.04F, -0.4757F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(15, 73).mirror().addBox(-0.4721F, -0.2064F, 1.0446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4729F, -0.6533F, 5.0171F, 0.2357F, -0.0785F, -0.0012F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(10, 71).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9993F, -1.1285F, 5.6815F, 0.0306F, -0.0728F, -0.5088F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-1.3503F, 0.6334F, -0.1481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(47, 74).mirror().addBox(-1.3503F, 0.6334F, -0.4481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.3843F, -0.4691F, 1.139F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-1.5459F, 0.5016F, -0.3634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.1088F, -0.3621F, 1.1473F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-1.3547F, 0.4984F, -0.6299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.1029F, -0.4214F, 1.1493F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.5F, -0.925F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.6835F, -0.0955F, 1.1127F, -0.3908F, -0.2725F, 0.9983F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(18, 42).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.7402F, -1.1118F, 2.4218F, 0.0019F, -0.2725F, 0.9983F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.3883F, 0.5298F, 0.0843F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.037F, -0.27F, 1.1432F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(22, 30).mirror().addBox(-1.0455F, -1.0611F, 0.1741F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.2469F, -0.1347F, -0.037F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-0.3947F, -0.7756F, -1.8232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1278F, -1.7795F, 6.712F, 0.2872F, -0.0949F, 0.6871F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(7, 55).mirror().addBox(-0.3947F, -0.7725F, -0.1897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1278F, -1.7795F, 6.712F, -0.1927F, -0.0949F, 0.6871F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(47, 47).mirror().addBox(-2.0F, 0.0F, -2.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4609F, 8.8639F, 0.0023F, -0.0087F, -0.5235F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.5838F, -0.4771F, -0.4822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2341F, -1.7962F, 6.8579F, 0.0606F, 0.0784F, -0.5286F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-0.3906F, -0.4771F, -0.3246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2341F, -1.7962F, 6.8579F, 0.062F, -0.2264F, -0.5473F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-0.3884F, -0.4771F, -0.667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2341F, -1.7962F, 6.8579F, 0.0664F, 0.4268F, -0.5059F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(48, 25).mirror().addBox(-2.0F, 0.0F, -0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2174F, 4.8837F, 0.108F, 0.0696F, -0.5194F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 50).mirror().addBox(0.0F, -0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2131F, 4.859F, 0.0202F, 0.0434F, 1.1215F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(32, 66).mirror().addBox(-0.0303F, 0.0279F, -0.0115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1148F, -1.9045F, 3.9407F, 0.0774F, -0.2868F, 1.1088F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-0.917F, -0.0086F, -0.0079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.9316F, 3.985F, 0.2757F, -0.0843F, -0.0225F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(41, 11).mirror().addBox(-0.1675F, -1.3894F, -2.0831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.6084F, 0.8952F, 0.1763F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-0.7393F, -0.4675F, -2.4358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.0753F, 0.383F, 0.0282F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(21, 55).mirror().addBox(-0.1492F, -0.4675F, -2.4059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.1131F, 0.9045F, 0.089F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(34, 54).mirror().addBox(-0.6899F, -0.2867F, -2.374F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.0849F, 0.9058F, -0.0669F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.8511F, -0.2861F, -2.3741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.2948F, 0.873F, 0.4182F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.9251F, -0.2867F, -2.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, -0.1094F, 1.0709F, -0.0961F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(17, 70).mirror().addBox(-0.9883F, -0.3193F, -2.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.6454F, 0.9317F, 0.7819F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(-1.3705F, -0.2457F, -2.4286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.0248F, 1.1262F, 0.0524F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(50, 54).mirror().addBox(-0.7483F, -1.3999F, -2.1141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.517F, 0.38F, 0.0562F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(74, 56).mirror().addBox(-1.0381F, -1.0111F, -0.6074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.3996F, -0.2647F, -0.0464F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(71, 50).mirror().addBox(-0.1305F, -1.0251F, -0.9184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.1F, 6.1F, 0.0439F, -0.0783F, -0.0053F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(72, 62).mirror().addBox(0.0054F, 0.0F, -0.9813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9349F, -1.1343F, 5.2639F, 0.1347F, -0.0136F, -0.5071F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-0.0573F, -1.0628F, -3.1791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(57, 23).mirror().addBox(-0.0573F, -1.0628F, -2.7791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.1F, 6.1F, 0.0873F, -0.0348F, -0.003F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-2.1166F, -0.4675F, -1.3256F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(37, 72).mirror().addBox(-2.0465F, -0.5175F, 1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.0682F, 0.8393F, 0.091F, -0.6961F, -0.0585F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 4.7461F, -4.9358F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck4_r1 = bone.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(50, 51).addBox(-1.9948F, -0.5124F, -0.4991F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5784F, 2.2138F, -0.7977F, 0.0528F, -0.1039F, -0.0119F));

		PartDefinition neck4_r2 = bone.addOrReplaceChild("neck4_r2", CubeListBuilder.create().texOffs(53, 20).addBox(-2.2828F, -0.5F, -1.1866F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5784F, 2.2138F, -0.7977F, 0.0542F, -0.2614F, -0.014F));

		PartDefinition neck5_r1 = bone.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(18, 47).addBox(-1.0162F, -0.5F, -0.7926F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5784F, 2.2138F, -0.7977F, 0.059F, 0.4793F, 0.0272F));

		PartDefinition neck4_r3 = bone.addOrReplaceChild("neck4_r3", CubeListBuilder.create().texOffs(46, 11).addBox(0.0784F, -0.5F, -1.0036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5784F, 2.2138F, -0.7977F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body4_r11 = bone.addOrReplaceChild("body4_r11", CubeListBuilder.create().texOffs(70, 47).addBox(-0.5F, -0.7221F, -0.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8291F, -5.3974F, 1.7704F, 0.461F, 0.1525F, -0.3256F));

		PartDefinition body3_r6 = bone.addOrReplaceChild("body3_r6", CubeListBuilder.create().texOffs(62, 72).addBox(-0.5F, -0.0891F, -0.3003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8291F, -5.3974F, 1.7704F, 1.0719F, 0.1525F, -0.3256F));

		PartDefinition body3_r7 = bone.addOrReplaceChild("body3_r7", CubeListBuilder.create().texOffs(27, 45).addBox(-0.5F, 0.175F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4843F, -3.9122F, 0.9979F, 1.2868F, 0.1799F, -0.3117F));

		PartDefinition body2_r1 = bone.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(35, 20).addBox(-1.4688F, -0.8491F, -0.0338F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6916F, -2.9453F, 0.1072F, 1.1559F, 0.1799F, -0.3117F));

		PartDefinition body5_r20 = bone.addOrReplaceChild("body5_r20", CubeListBuilder.create().texOffs(0, 38).addBox(-0.285F, -1.9426F, -3.8846F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1416F, -1.3953F, 0.9072F, 1.72F, 0.2094F, -0.0176F));

		PartDefinition body4_r12 = bone.addOrReplaceChild("body4_r12", CubeListBuilder.create().texOffs(41, 6).addBox(-1.1204F, 0.0205F, -0.4613F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6916F, -0.8453F, 0.1072F, 1.2849F, 0.2325F, -0.1632F));

		PartDefinition body4_r13 = bone.addOrReplaceChild("body4_r13", CubeListBuilder.create().texOffs(20, 36).addBox(-0.285F, -2.3427F, -4.2667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1416F, -1.3953F, 0.9072F, 1.4582F, 0.2094F, -0.0176F));

		PartDefinition body3_r8 = bone.addOrReplaceChild("body3_r8", CubeListBuilder.create().texOffs(29, 39).addBox(-1.1204F, -1.53F, -0.9691F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6916F, -0.8453F, 0.1072F, 1.1976F, 0.2325F, -0.1632F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 4.7461F, -4.9358F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck5_r2 = bone7.addOrReplaceChild("neck5_r2", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-1.0052F, -0.5124F, -0.4991F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5784F, 2.2138F, -0.7977F, 0.0528F, 0.1039F, 0.0119F));

		PartDefinition neck5_r3 = bone7.addOrReplaceChild("neck5_r3", CubeListBuilder.create().texOffs(53, 20).mirror().addBox(-0.7172F, -0.5F, -1.1866F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5784F, 2.2138F, -0.7977F, 0.0542F, 0.2614F, 0.014F));

		PartDefinition neck6_r1 = bone7.addOrReplaceChild("neck6_r1", CubeListBuilder.create().texOffs(18, 47).mirror().addBox(0.0162F, -0.5F, -0.7926F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5784F, 2.2138F, -0.7977F, 0.059F, -0.4793F, -0.0272F));

		PartDefinition neck5_r4 = bone7.addOrReplaceChild("neck5_r4", CubeListBuilder.create().texOffs(46, 11).mirror().addBox(-1.0784F, -0.5F, -1.0036F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5784F, 2.2138F, -0.7977F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body5_r21 = bone7.addOrReplaceChild("body5_r21", CubeListBuilder.create().texOffs(70, 47).mirror().addBox(-0.5F, -0.7221F, -0.8993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8291F, -5.3974F, 1.7704F, 0.461F, -0.1525F, 0.3256F));

		PartDefinition body4_r14 = bone7.addOrReplaceChild("body4_r14", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-0.5F, -0.0891F, -0.3003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8291F, -5.3974F, 1.7704F, 1.0719F, -0.1525F, 0.3256F));

		PartDefinition body4_r15 = bone7.addOrReplaceChild("body4_r15", CubeListBuilder.create().texOffs(27, 45).mirror().addBox(-0.5F, 0.175F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4843F, -3.9122F, 0.9979F, 1.2868F, -0.1799F, 0.3117F));

		PartDefinition body3_r9 = bone7.addOrReplaceChild("body3_r9", CubeListBuilder.create().texOffs(35, 20).mirror().addBox(0.4688F, -0.8491F, -0.0338F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6916F, -2.9453F, 0.1072F, 1.1559F, -0.1799F, 0.3117F));

		PartDefinition body6_r21 = bone7.addOrReplaceChild("body6_r21", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.715F, -1.9426F, -3.8846F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1416F, -1.3953F, 0.9072F, 1.72F, -0.2094F, 0.0176F));

		PartDefinition body5_r22 = bone7.addOrReplaceChild("body5_r22", CubeListBuilder.create().texOffs(41, 6).mirror().addBox(0.1204F, 0.0205F, -0.4613F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6916F, -0.8453F, 0.1072F, 1.2849F, -0.2325F, 0.1632F));

		PartDefinition body5_r23 = bone7.addOrReplaceChild("body5_r23", CubeListBuilder.create().texOffs(20, 36).mirror().addBox(-0.715F, -2.3427F, -4.2667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1416F, -1.3953F, 0.9072F, 1.4582F, -0.2094F, 0.0176F));

		PartDefinition body4_r16 = bone7.addOrReplaceChild("body4_r16", CubeListBuilder.create().texOffs(29, 39).mirror().addBox(0.1204F, -1.53F, -0.9691F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6916F, -0.8453F, 0.1072F, 1.1976F, -0.2325F, 0.1632F));

		PartDefinition hindlegL = hip.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2328F, -4.5809F, 5.3656F, -0.5073F, 0.0811F, -1.5946F));

		PartDefinition cube_r172 = hindlegL.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(7, 65).addBox(5.0F, -4.125F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5F, 4.0F, 0.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r173 = hindlegL.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(68, 37).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9146F, 1.1692F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r174 = hindlegL.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(64, 4).addBox(-0.5F, -2.025F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 4.3132F, 0.1423F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r175 = hindlegL.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(73, 41).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.3132F, 0.1423F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r176 = hindlegL.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(37, 68).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3132F, 0.1423F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r177 = hindlegL.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 68).addBox(5.0F, -0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 2.6763F, 0.8914F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r178 = hindlegL.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(55, 29).addBox(-0.5F, 0.45F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.9754F, 0.4828F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r179 = hindlegL.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.9754F, 0.4828F, -0.4974F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(7, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(21, 59).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9648F, 5.2168F, 0.2788F, -0.6116F, 1.1568F, 0.7897F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 3.4894F, -0.1216F, -0.0602F, -0.1639F, -1.2168F));

		PartDefinition hindlegL3 = hip.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2328F, -4.5809F, 5.3656F, 0.7581F, -0.0811F, 1.5946F));

		PartDefinition cube_r180 = hindlegL3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(17, 65).addBox(-6.0F, -4.125F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.5F, 4.0F, 0.8F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r181 = hindlegL3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(69, 4).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9146F, 1.1692F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r182 = hindlegL3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(64, 22).addBox(-0.5F, -2.025F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 4.3132F, 0.1423F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r183 = hindlegL3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(74, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.3132F, 0.1423F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r184 = hindlegL3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(62, 68).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 4.3132F, 0.1423F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r185 = hindlegL3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(68, 41).addBox(-6.0F, -0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 2.6763F, 0.8914F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r186 = hindlegL3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(56, 38).addBox(-0.5F, 0.45F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.9754F, 0.4828F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r187 = hindlegL3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(14, 52).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 0.9754F, 0.4828F, -0.4974F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(40, 60).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(12, 61).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9648F, 5.2168F, 0.2788F, -0.0436F, -1.5272F, -1.3963F));

		PartDefinition bone6 = hindlegL4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(11, 17).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 3.4894F, -0.1216F, 0.0F, 0.1745F, 1.5708F));

		PartDefinition bone2 = hip.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5978F, -3.4172F, 6.0032F, 0.0873F, 0.0F, 0.1309F));

		PartDefinition body11_r1 = bone2.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(33, 58).addBox(-0.5F, -0.3809F, -0.7813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2037F, 0.6867F, -0.3819F, 0.4407F, 0.0F, 0.0F));

		PartDefinition body10_r1 = bone2.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(38, 44).addBox(-0.5F, -1.2809F, -1.3813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2037F, 0.6867F, -0.3819F, 0.6152F, 0.0F, 0.0F));

		PartDefinition body9_r2 = bone2.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(74, 18).addBox(-0.5F, -1.6881F, -1.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2037F, 0.6867F, -0.3819F, 1.0516F, 0.0F, 0.0F));

		PartDefinition body8_r8 = bone2.addOrReplaceChild("body8_r8", CubeListBuilder.create().texOffs(22, 69).addBox(-0.5F, -1.2719F, -1.1005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2037F, 0.6867F, -0.3819F, 1.4879F, 0.0F, 0.0F));

		PartDefinition body7_r16 = bone2.addOrReplaceChild("body7_r16", CubeListBuilder.create().texOffs(63, 42).addBox(-0.5F, 0.4583F, -1.2255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.2037F, 0.6867F, -0.3819F, 1.7061F, 0.0F, 0.0F));

		PartDefinition body9_r3 = bone2.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(55, 69).addBox(-0.5F, -0.1417F, 0.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2796F, -3.4285F, 0.3976F, -0.8858F, 0.0F, 0.2182F));

		PartDefinition body9_r4 = bone2.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(69, 12).addBox(-0.5F, -2.0608F, 0.0012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F))
				.texOffs(67, 63).addBox(-0.5F, -2.0608F, 0.5012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2037F, -0.7133F, -0.3819F, -0.1876F, 0.0F, 0.0F));

		PartDefinition body9_r5 = bone2.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(10, 74).addBox(-0.5F, 1.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(74, 9).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(36, 49).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2037F, -0.0142F, 1.3107F, 0.8159F, 0.0F, 0.0F));

		PartDefinition body6_r22 = bone2.addOrReplaceChild("body6_r22", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5F, -1.1344F, -0.7845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2796F, -3.4285F, 0.3976F, 1.0777F, 0.0F, 0.2182F));

		PartDefinition body5_r24 = bone2.addOrReplaceChild("body5_r24", CubeListBuilder.create().texOffs(72, 71).addBox(-0.5F, -0.409F, -1.2716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2796F, -3.4285F, 0.3976F, 0.4669F, 0.0F, 0.2182F));

		PartDefinition body6_r23 = bone2.addOrReplaceChild("body6_r23", CubeListBuilder.create().texOffs(69, 8).addBox(-0.5F, -1.9193F, -0.4207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(67, 59).addBox(-0.5F, -1.9193F, -0.8207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2796F, -3.4285F, 0.3976F, 0.1178F, 0.0F, 0.2182F));

		PartDefinition body4_r17 = bone2.addOrReplaceChild("body4_r17", CubeListBuilder.create().texOffs(28, 55).addBox(-0.5F, -1.9672F, -0.4052F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2796F, -3.4285F, 0.3976F, -0.3622F, 0.0F, 0.2182F));

		PartDefinition bone8 = hip.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5978F, -3.4172F, 6.0032F, 0.0873F, 0.0F, -0.1309F));

		PartDefinition body12_r1 = bone8.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(33, 58).mirror().addBox(-0.5F, -0.3809F, -0.7813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2037F, 0.6867F, -0.3819F, 0.4407F, 0.0F, 0.0F));

		PartDefinition body11_r2 = bone8.addOrReplaceChild("body11_r2", CubeListBuilder.create().texOffs(38, 44).mirror().addBox(-0.5F, -1.2809F, -1.3813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2037F, 0.6867F, -0.3819F, 0.6152F, 0.0F, 0.0F));

		PartDefinition body10_r2 = bone8.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(-0.5F, -1.6881F, -1.5303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2037F, 0.6867F, -0.3819F, 1.0516F, 0.0F, 0.0F));

		PartDefinition body9_r6 = bone8.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-0.5F, -1.2719F, -1.1005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.2037F, 0.6867F, -0.3819F, 1.4879F, 0.0F, 0.0F));

		PartDefinition body8_r9 = bone8.addOrReplaceChild("body8_r9", CubeListBuilder.create().texOffs(63, 42).mirror().addBox(-0.5F, 0.4583F, -1.2255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.2037F, 0.6867F, -0.3819F, 1.7061F, 0.0F, 0.0F));

		PartDefinition body10_r3 = bone8.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-0.5F, -0.1417F, 0.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2796F, -3.4285F, 0.3976F, -0.8858F, 0.0F, -0.2182F));

		PartDefinition body10_r4 = bone8.addOrReplaceChild("body10_r4", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-0.5F, -2.0608F, 0.0012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false)
				.texOffs(67, 63).mirror().addBox(-0.5F, -2.0608F, 0.5012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2037F, -0.7133F, -0.3819F, -0.1876F, 0.0F, 0.0F));

		PartDefinition body10_r5 = bone8.addOrReplaceChild("body10_r5", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.5F, 1.4F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(74, 9).mirror().addBox(-0.5F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(36, 49).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.2037F, -0.0142F, 1.3107F, 0.8159F, 0.0F, 0.0F));

		PartDefinition body7_r17 = bone8.addOrReplaceChild("body7_r17", CubeListBuilder.create().texOffs(55, 10).mirror().addBox(-0.5F, -1.1344F, -0.7845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2796F, -3.4285F, 0.3976F, 1.0777F, 0.0F, -0.2182F));

		PartDefinition body6_r24 = bone8.addOrReplaceChild("body6_r24", CubeListBuilder.create().texOffs(72, 71).mirror().addBox(-0.5F, -0.409F, -1.2716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2796F, -3.4285F, 0.3976F, 0.4669F, 0.0F, -0.2182F));

		PartDefinition body7_r18 = bone8.addOrReplaceChild("body7_r18", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-0.5F, -1.9193F, -0.4207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(67, 59).mirror().addBox(-0.5F, -1.9193F, -0.8207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2796F, -3.4285F, 0.3976F, 0.1178F, 0.0F, -0.2182F));

		PartDefinition body5_r25 = bone8.addOrReplaceChild("body5_r25", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.5F, -1.9672F, -0.4052F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2796F, -3.4285F, 0.3976F, -0.3622F, 0.0F, -0.2182F));

		return LayerDefinition.create(meshdefinition, 81, 81);
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