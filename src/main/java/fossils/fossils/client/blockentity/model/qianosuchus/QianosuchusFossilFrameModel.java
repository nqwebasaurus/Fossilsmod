package fossils.fossils.client.blockentity.model.qianosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class QianosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand4;
	private final ModelPart hand2;
	private final ModelPart upperarm3;
	private final ModelPart lowerarm3;
	private final ModelPart hand3;
	private final ModelPart hand5;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart tail14;
	private final ModelPart tail15;
	private final ModelPart tail16;
	private final ModelPart tail17;
	private final ModelPart upperleg1;
	private final ModelPart lowerleg1;
	private final ModelPart feet1;
	private final ModelPart toes1;
	private final ModelPart upperleg2;
	private final ModelPart lowerleg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public QianosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.head1 = this.neck7.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.leftFace = this.head1.getChild("leftFace");
		this.rightFace = this.head1.getChild("rightFace");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand4 = this.lowerarm2.getChild("hand4");
		this.hand2 = this.hand4.getChild("hand2");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.lowerarm3 = this.upperarm3.getChild("lowerarm3");
		this.hand3 = this.lowerarm3.getChild("hand3");
		this.hand5 = this.hand3.getChild("hand5");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail = this.tail2.getChild("tail");
		this.tail3 = this.tail.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.tail14 = this.tail13.getChild("tail14");
		this.tail15 = this.tail14.getChild("tail15");
		this.tail16 = this.tail15.getChild("tail16");
		this.tail17 = this.tail16.getChild("tail17");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.lowerleg1 = this.upperleg1.getChild("lowerleg1");
		this.feet1 = this.lowerleg1.getChild("feet1");
		this.toes1 = this.feet1.getChild("toes1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.lowerleg2 = this.upperleg2.getChild("lowerleg2");
		this.feet2 = this.lowerleg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.bone2 = this.basin.getChild("bone2");
		this.bone4 = this.basin.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.1836F, 5.148F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r1 = basin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.7F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 1.516F, -0.2718F, -1.5708F, -1.4835F, 1.5708F));

		PartDefinition cube_r2 = basin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 17).addBox(0.2F, 0.8006F, -0.1798F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6107F, -3.9205F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 27).addBox(-0.225F, 0.3562F, -7.1294F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1728F, -3.7062F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(19, 17).addBox(-0.9F, 0.3625F, -7.1909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 23).addBox(-0.9F, 0.3625F, -0.4909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, -0.0314F, -7.2386F, -0.0089F, 0.1745F, -0.0015F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(32, 40).addBox(-0.9F, 0.3625F, -5.6909F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 44).addBox(-0.9F, 0.3625F, -0.9909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0084F, -6.945F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3943F, -4.8162F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, -2).addBox(1.0F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 5.1476F, -2.5709F, -1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 2).addBox(0.1F, -4.3F, 0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, 1.839F, -6.8057F, -1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 0).addBox(0.1F, -0.3F, 0.3F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.839F, -7.8057F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(91, 5).addBox(-0.35F, -0.0056F, -3.1405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3199F, -5.802F, 0.0672F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, -2.9577F, -0.6076F, 0.1518F, -0.0864F));

		PartDefinition cube_r6 = neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 3).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.8111F, -0.166F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -0.2684F, -0.1892F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.8341F, -3.8688F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9378F, -3.7638F, -0.2838F, 0.2635F, -0.1996F));

		PartDefinition cube_r8 = neck3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 69).addBox(0.1F, -0.325F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 66).addBox(0.1F, -0.325F, -0.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5012F, -3.5445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5555F, -3.8401F, -0.1144F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 77).addBox(0.1F, -0.3F, 0.325F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5403F, -2.8195F, -0.2541F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(79, 2).addBox(0.1F, -0.325F, 2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(77, 0).addBox(0.1F, -0.325F, 0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -2.925F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(91, 9).addBox(0.1F, -0.3F, 1.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4512F, -3.4195F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.675F, -1.95F, 0.0197F, 0.2893F, 0.1114F));

		PartDefinition cube_r12 = neck7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 16).addBox(0.1F, -0.3F, 1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3512F, -3.4195F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head1 = neck7.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.52F, 0.236F, -2.3052F, 0.2866F, 0.3118F, 0.2428F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2993F, 2.4534F, 0.1773F, 0.5672F, 0.0087F, -0.0008F));

		PartDefinition leftFace = head1.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.846F, -2.0745F, -5.4167F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightFace = head1.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.686F, -2.0745F, -5.4167F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2856F, 6.8643F, -2.6163F, 1.0492F, 0.243F, -0.0479F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6495F, 7.5527F, 3.591F, -1.2927F, -0.3899F, -1.6972F));

		PartDefinition hand4 = lowerarm2.addOrReplaceChild("hand4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3039F, 7.0579F, -0.6776F, 0.1129F, -0.0956F, -0.5881F));

		PartDefinition hand2 = hand4.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, -0.0873F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0856F, 6.8643F, -2.6163F, 0.8311F, -0.243F, 0.0479F));

		PartDefinition lowerarm3 = upperarm3.addOrReplaceChild("lowerarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6495F, 7.5527F, 3.591F, -0.358F, -1.2962F, 0.389F));

		PartDefinition hand3 = lowerarm3.addOrReplaceChild("hand3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3039F, 7.0579F, -0.6776F, 0.1086F, 0.1004F, 0.5445F));

		PartDefinition hand5 = hand3.addOrReplaceChild("hand5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5638F, 3.7949F, -2.9614F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3638F, 3.7949F, -2.9614F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.054F, 4.1231F, -0.1244F, -0.2599F, 0.0321F));

		PartDefinition cube_r13 = tail1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(41, 30).addBox(-0.5F, -1.8F, 6.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 30).addBox(-0.5F, -1.8F, 5.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 25).addBox(-0.5F, -1.8F, -0.15F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 2.6479F, -0.6084F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 66).addBox(0.2F, 0.5899F, -0.066F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0341F, 5.8641F, 0.0137F, -0.2181F, -0.003F));

		PartDefinition tail = tail2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(62, 24).addBox(-0.5F, 0.4065F, -0.3136F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 27).addBox(-0.5F, 0.4065F, 3.3865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 0.1834F, 3.8976F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition tail3 = tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(64, 12).addBox(0.2F, 0.1797F, -0.2717F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, 0.2145F, 4.1002F, -0.0742F, -0.2176F, 0.016F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(64, 30).addBox(0.15F, 0.1797F, -0.3717F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 33).addBox(0.15F, 0.1797F, 3.3283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0157F, 3.7004F, -0.0264F, -0.1309F, 0.0034F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(44, 60).addBox(0.15F, 0.1797F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(11, 53).addBox(0.15F, 0.1797F, -0.2717F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 56).addBox(0.15F, 0.1797F, 3.4283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(53, 16).addBox(-0.475F, -0.5F, -1.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 0.6797F, 2.0283F, 0.0F, 0.0393F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -0.0354F, 0.1744F, -0.0062F));

		PartDefinition cube_r15 = tail8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 32).addBox(-0.55F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.775F, 1.1797F, 1.9283F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(22, 54).addBox(0.175F, 0.6797F, -0.3717F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 57).addBox(0.175F, 0.6797F, 3.3283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(33, 54).addBox(0.125F, 0.6797F, 0.0783F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(44, 54).addBox(0.15F, 0.6797F, -0.1217F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0181F, 0.2618F, -0.0047F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(55, 0).addBox(0.2F, 0.6797F, -0.3217F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0354F, 0.1744F, -0.0062F));

		PartDefinition cube_r16 = tail12.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 3).addBox(-0.15F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 1.1797F, 3.5283F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(55, 54).addBox(0.2F, 0.6797F, 0.2533F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14", CubeListBuilder.create().texOffs(56, 46).addBox(0.2F, 0.6797F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0352F, 0.1308F, -0.0046F));

		PartDefinition tail15 = tail14.addOrReplaceChild("tail15", CubeListBuilder.create().texOffs(11, 59).addBox(0.2F, 0.6797F, -0.1717F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition tail16 = tail15.addOrReplaceChild("tail16", CubeListBuilder.create().texOffs(0, 60).addBox(0.25F, 0.6797F, -0.2717F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0723F, 0.2611F, -0.0187F));

		PartDefinition tail17 = tail16.addOrReplaceChild("tail17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1179F, 0.4771F, -0.0544F));

		PartDefinition cube_r17 = tail17.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 77).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 1.1797F, 1.3283F, 0.0F, -0.0873F, 0.0F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 2.2961F, -0.5445F, 1.0293F, -0.1709F, 0.0963F));

		PartDefinition lowerleg1 = upperleg1.addOrReplaceChild("lowerleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 9.8797F, -2.5284F, 0.9687F, 0.0F, 0.0F));

		PartDefinition feet1 = lowerleg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 9.4363F, 0.7332F, -0.969F, 0.0F, 0.0F));

		PartDefinition toes1 = feet1.addOrReplaceChild("toes1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9702F, 1.4114F, 1.5727F, 0.0F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 2.2961F, -0.5445F, 0.8366F, -0.3813F, 0.0964F));

		PartDefinition lowerleg2 = upperleg2.addOrReplaceChild("lowerleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 9.8797F, -2.5284F, 0.4451F, 0.0F, 0.0F));

		PartDefinition feet2 = lowerleg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 9.4363F, 0.7332F, -0.8817F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9702F, 1.4114F, 1.5727F, 0.0F, 0.0F));

		PartDefinition bone2 = basin.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3163F, 5.0672F, 0.0452F, 0.0F, -0.0087F, 0.0524F));

		PartDefinition bone4 = basin.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9163F, 5.0672F, 0.0452F, 0.0F, 0.0087F, -0.0524F));

		return LayerDefinition.create(meshdefinition, 118, 118);
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