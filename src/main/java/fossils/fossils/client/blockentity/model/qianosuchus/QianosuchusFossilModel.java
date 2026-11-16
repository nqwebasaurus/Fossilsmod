package fossils.fossils.client.blockentity.model.qianosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class QianosuchusFossilModel extends SkullModelBase {
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

	public QianosuchusFossilModel(ModelPart root) {
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

		PartDefinition cube_r1 = basin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 18).mirror().addBox(-3.2F, 0.9256F, 1.0452F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 18).addBox(-0.2F, 0.9256F, 1.0452F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(36, 109).addBox(-0.7F, -2.5744F, 7.0452F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(33, 109).addBox(-0.7F, -2.5994F, 5.0452F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(109, 31).addBox(-0.7F, -2.6244F, 3.0452F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(15, 109).addBox(-0.7F, -2.5744F, 1.0452F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 17).addBox(-1.2F, -0.0744F, 0.0452F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, -0.6107F, -3.9205F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 27).addBox(-0.3F, -0.5688F, -7.1294F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(61, 88).addBox(0.2F, -3.1439F, -4.1196F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(63, 111).addBox(0.2F, -3.1439F, -1.1196F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1728F, -3.7062F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-7.0418F, -2.5888F, -0.5365F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -6.0899F, 0.0424F, 0.5812F, -1.3644F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(100, 30).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -6.0899F, 0.3907F, 0.4438F, -0.6769F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 100).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -6.0899F, 0.5692F, 0.1317F, -0.0731F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 38).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -3.0899F, 0.5716F, 0.2416F, -0.2099F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 91).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -3.0899F, 0.3205F, 0.5347F, -0.8472F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 28).mirror().addBox(-4.0418F, -2.5888F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3664F, -3.0899F, -0.0858F, 0.61F, -1.5735F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(96, 28).addBox(2.0418F, -2.5888F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -3.0899F, -0.0858F, -0.61F, 1.5735F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 91).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -3.0899F, 0.3205F, -0.5347F, 0.8472F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 38).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -3.0899F, 0.5716F, -0.2416F, 0.2099F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 100).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -6.0899F, 0.5692F, -0.1317F, 0.0731F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(100, 30).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -6.0899F, 0.3907F, -0.4438F, 0.6769F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 20).addBox(2.0418F, -2.5888F, -0.5365F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3664F, -6.0899F, 0.0424F, -0.5812F, 1.3644F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(49, 91).addBox(0.0F, -2.4F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.5688F, -6.1294F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 8.8312F, -7.3294F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(19, 17).addBox(-0.9F, -0.5374F, -6.8909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0314F, -7.2386F, -0.0089F, 0.1745F, -0.0015F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(97, 70).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -6.3513F, 0.4567F, 0.091F, -0.0061F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(98, 16).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -6.3513F, 0.3169F, 0.3464F, -0.6259F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(42, 7).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -6.3513F, 0.0507F, 0.4625F, -1.2807F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(97, 66).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -1.8513F, 0.5702F, 0.1145F, -0.0426F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 68).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -1.8513F, 0.4023F, 0.4302F, -0.6416F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 43).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -1.8513F, 0.0625F, 0.5773F, -1.323F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(15, 45).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -4.3513F, 0.0672F, 0.531F, -1.2895F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(41, 98).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -4.3513F, 0.3742F, 0.3916F, -0.6218F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(98, 51).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3978F, -4.3513F, 0.5268F, 0.0972F, -0.0162F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(98, 51).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -4.3513F, 0.5268F, -0.0972F, 0.0162F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(41, 98).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -4.3513F, 0.3742F, -0.3916F, 0.6218F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 45).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -4.3513F, 0.0672F, -0.531F, 1.2895F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(15, 43).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -1.8513F, 0.0625F, -0.5773F, 1.323F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(97, 68).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -1.8513F, 0.4023F, -0.4302F, 0.6416F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(97, 66).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -1.8513F, 0.5702F, -0.1145F, 0.0426F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(42, 7).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -6.3513F, 0.0507F, -0.4625F, 1.2807F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(98, 16).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -6.3513F, 0.3169F, -0.3464F, 0.6259F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(97, 70).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3978F, -6.3513F, 0.4567F, -0.091F, 0.0061F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 39).addBox(-0.5F, -1.675F, 3.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(114, 16).addBox(-0.5F, -1.625F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 114).addBox(-0.5F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.5374F, -6.3909F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 9).addBox(-2.5F, -1.0F, -6.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 8.8626F, 0.1091F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(32, 40).addBox(-0.9F, -0.5374F, -4.8909F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(113, 101).addBox(-0.4F, -1.8375F, -3.8909F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 113).addBox(-0.4F, -1.8874F, -1.8909F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0084F, -6.945F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r36 = body3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(98, 53).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -3.4064F, 0.2702F, 0.3454F, -0.7248F));

		PartDefinition cube_r37 = body3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(45, 40).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -3.4064F, 0.0128F, 0.435F, -1.3802F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(98, 55).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -3.4064F, 0.4204F, 0.1159F, -0.0929F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(45, 42).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -1.4064F, 0.016F, 0.4076F, -1.345F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(98, 57).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -1.4064F, 0.2552F, 0.3218F, -0.6959F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.4062F, -1.4064F, 0.3948F, 0.1054F, -0.0619F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(98, 75).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -1.4064F, 0.3948F, -0.1054F, 0.0619F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(98, 57).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -1.4064F, 0.2552F, -0.3218F, 0.6959F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(45, 42).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -1.4064F, 0.016F, -0.4076F, 1.345F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(98, 55).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -3.4064F, 0.4204F, -0.1159F, 0.0929F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 40).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -3.4064F, 0.0128F, -0.435F, 1.3802F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(98, 53).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.4062F, -3.4064F, 0.2702F, -0.3454F, 0.7248F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3943F, -4.8162F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-6.0418F, -2.5888F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3983F, -4.3221F, 0.0294F, 0.5712F, -1.6364F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(98, 77).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3983F, -4.3221F, 0.3744F, 0.443F, -0.949F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(90, 98).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3983F, -4.3221F, 0.5565F, 0.1394F, -0.3398F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-8.0418F, -2.5888F, -0.5365F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1483F, -2.3221F, 0.0179F, 0.4691F, -1.4837F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1483F, -2.3221F, 0.2964F, 0.3695F, -0.8214F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(99, 72).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1483F, -2.3221F, 0.4546F, 0.121F, -0.1946F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9233F, -0.3721F, 0.3769F, 0.108F, -0.151F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(7, 100).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9233F, -0.3721F, 0.2384F, 0.3134F, -0.7882F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(45, 44).mirror().addBox(-9.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9233F, -0.3721F, 0.0078F, 0.3913F, -1.4354F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(26, 48).mirror().addBox(-0.0802F, -0.1023F, -3.209F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2271F, 8.1288F, -2.587F, -0.4243F, 0.3203F, -0.1413F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(77, 77).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2495F, 8.3777F, -2.7881F, -0.0972F, -0.7984F, 0.982F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7837F, 8.6622F, -1.9073F, -0.249F, -0.479F, 0.3981F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(68, 22).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3792F, 1.6472F, -6.4618F, 0.5988F, 0.6328F, -0.9644F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(0.0F, 0.0F, -0.3F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2495F, 8.3777F, -2.7881F, -0.3794F, -0.4807F, 0.7995F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(36, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9837F, 8.6622F, -1.9073F, -0.249F, 0.479F, -0.3981F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, 0.0F, -0.3F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4495F, 8.3777F, -2.7881F, -0.3794F, 0.4807F, -0.7995F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 77).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4495F, 8.3777F, -2.7881F, -0.0972F, 0.7984F, -0.982F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(26, 48).addBox(-1.9198F, -0.1023F, -3.209F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4271F, 8.1288F, -2.587F, -0.4243F, -0.3203F, 0.1413F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 43).addBox(-3.8271F, -0.1523F, -4.9881F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(13, 47).addBox(-2.3271F, -0.086F, -3.0986F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.4271F, 8.1288F, -2.587F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(45, 44).addBox(2.0418F, -2.5888F, -0.5365F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9233F, -0.3721F, 0.0078F, -0.3913F, 1.4354F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(7, 100).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9233F, -0.3721F, 0.2384F, -0.3134F, 0.7882F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.9233F, -0.3721F, 0.3769F, -0.108F, 0.151F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(99, 72).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1483F, -2.3221F, 0.4546F, -0.121F, 0.1946F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 99).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1483F, -2.3221F, 0.2964F, -0.3695F, 0.8214F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(53, 22).addBox(2.0418F, -2.5888F, -0.5365F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.1483F, -2.3221F, 0.0179F, -0.4691F, 1.4837F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(90, 98).addBox(-0.5037F, -0.0487F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.3983F, -4.3221F, 0.5565F, -0.1394F, 0.3398F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(98, 77).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.3983F, -4.3221F, 0.3744F, -0.443F, 0.949F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 34).addBox(2.0418F, -2.5888F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.3983F, -4.3221F, 0.0294F, -0.5712F, 1.6364F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(113, 97).addBox(0.5F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0067F, -0.9797F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(113, 51).addBox(0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.2867F, -2.9587F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(113, 12).addBox(1.1F, -2.55F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 8).addBox(1.1F, -2.6F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 0).addBox(0.6F, -1.0F, 1.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 1.839F, -7.8057F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(68, 22).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5792F, 1.6472F, -6.4618F, 0.5988F, -0.6328F, 0.9644F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(91, 5).addBox(-0.4F, -0.7056F, -2.9655F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 1.3199F, -5.802F, 0.0672F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(66, 64).mirror().addBox(-4.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4303F, -0.0904F, -2.5499F, 0.4587F, 0.7204F, -1.1571F));

		PartDefinition cube_r81 = neck1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(66, 64).addBox(-0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6303F, -0.0904F, -2.5499F, 0.4587F, -0.7204F, 1.1571F));

		PartDefinition cube_r82 = neck1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(112, 60).addBox(-0.003F, -0.5465F, -0.8249F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.8446F, -2.7432F, 3.0194F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, -2.9577F, -0.6076F, 0.1518F, -0.0864F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 95).addBox(-0.003F, -0.4465F, -0.9249F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.256F, -1.7827F, -2.8274F, 0.0F, 0.0F));

		PartDefinition cube_r84 = neck2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(66, 0).addBox(0.1F, -0.1F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7561F, -6.8926F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r85 = neck2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(56, 52).mirror().addBox(-5.7506F, -0.0553F, -0.6572F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1808F, -1.6284F, 0.8879F, 1.2459F, -0.5642F));

		PartDefinition cube_r86 = neck2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(56, 52).addBox(-0.2494F, -0.0553F, -0.6572F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.1808F, -1.6284F, 0.8879F, -1.2459F, 0.5642F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9378F, -3.7638F, -0.2838F, 0.2635F, -0.1996F));

		PartDefinition cube_r87 = neck3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-4.7098F, -0.0252F, -0.3897F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.0783F, -0.9814F, 1.3559F, 1.3641F, -0.1686F));

		PartDefinition cube_r88 = neck3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0663F, 0.1534F, -3.3979F, 1.1855F, 1.3551F, -0.3337F));

		PartDefinition cube_r89 = neck3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 44).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1338F, 0.1534F, -3.3979F, 1.1855F, -1.3551F, 0.3337F));

		PartDefinition cube_r90 = neck3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(69, 70).addBox(-0.2902F, -0.0252F, -0.3897F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0783F, -0.9814F, 1.3559F, -1.3641F, 0.1686F));

		PartDefinition cube_r91 = neck3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(71, 94).addBox(-0.003F, 0.0535F, -0.4249F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2876F, -0.081F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r92 = neck3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(85, 94).addBox(0.0F, -0.75F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.597F, -0.4899F, -4.3413F, -3.0466F, 0.0F, 0.0F));

		PartDefinition cube_r93 = neck3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(22, 66).addBox(0.1F, -1.0F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5012F, -3.5445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5555F, -3.8401F, -0.1144F, 0.0F, 0.0F));

		PartDefinition cube_r94 = neck4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 95).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.597F, -0.9339F, -2.1983F, -2.9593F, 0.0F, 0.0F));

		PartDefinition cube_r95 = neck4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 77).addBox(0.1F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.4012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5403F, -2.8195F, -0.2541F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0986F, 0.2988F, 0.654F, 2.2156F, 1.4104F, 0.6766F));

		PartDefinition cube_r97 = neck5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(64, 36).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0986F, 0.8953F, -1.782F, 1.6457F, 1.4425F, 0.1011F));

		PartDefinition cube_r98 = neck5.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(64, 36).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1014F, 0.8953F, -1.782F, 1.6457F, -1.4425F, -0.1011F));

		PartDefinition cube_r99 = neck5.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 0).addBox(0.1F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r100 = neck5.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(84, 99).addBox(0.0F, -0.55F, -0.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1595F, -1.874F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck5.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(64, 18).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1014F, 0.2988F, 0.654F, 2.2156F, -1.4104F, -0.6766F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2F, -2.925F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r102 = neck6.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(95, 86).addBox(0.0F, -0.9F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.6174F, -3.0897F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r103 = neck6.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(91, 9).addBox(0.1F, -1.0F, 1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.4512F, -3.4195F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r104 = neck6.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(76, 50).mirror().addBox(-3.7356F, 0.1097F, -0.573F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0458F, -0.2051F, -0.6955F, 1.3127F, 1.4384F, -0.2346F));

		PartDefinition cube_r105 = neck6.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(76, 50).addBox(-0.2644F, 0.1097F, -0.573F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2458F, -0.2051F, -0.6955F, 1.3127F, -1.4384F, 0.2346F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.675F, -1.95F, 0.0197F, 0.2893F, 0.1114F));

		PartDefinition cube_r106 = neck7.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(15, 95).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0576F, -1.1397F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck7.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(77, 16).addBox(0.1F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3512F, -3.4195F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck7.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-3.431F, 0.068F, -0.6757F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0458F, 0.6949F, -0.6955F, 0.4158F, 1.2493F, -1.1485F));

		PartDefinition cube_r109 = neck7.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(77, 36).addBox(-0.569F, 0.068F, -0.6757F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2458F, 0.6949F, -0.6955F, 0.4158F, -1.2493F, 1.1485F));

		PartDefinition head1 = neck7.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.52F, 0.236F, -2.3052F, 0.2866F, 0.3118F, 0.2428F));

		PartDefinition cube_r110 = head1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.6613F, -5.1056F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(5, 106).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.08F, -2.517F, -11.6944F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.08F, -1.6828F, -10.9301F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(105, 105).addBox(-0.5F, -1.4F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(105, 102).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.08F, -2.6964F, -9.7887F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(100, 105).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.8356F, -8.7985F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(105, 99).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.8443F, -7.7985F, -3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(95, 105).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.8094F, -6.7991F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(75, 11).addBox(-0.5F, -1.7F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(73, 90).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.244F, -1.3541F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head1.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(75, 6).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -2.6085F, -3.3207F, 2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head1.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(27, 78).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.08F, -2.7043F, -4.3161F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head1.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(29, 73).addBox(-1.0F, -1.05F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.6296F, -4.7604F, 0.0524F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2993F, 2.4534F, 0.1773F, 0.5672F, 0.0087F, -0.0008F));

		PartDefinition cube_r121 = jaw1.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-0.5F, -0.5239F, -0.7011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1636F, 0.4949F, -0.1158F, 0.0873F, -0.1309F, 0.0F));

		PartDefinition cube_r122 = jaw1.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(100, 101).mirror().addBox(-0.5F, -0.5605F, -0.4402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.1636F, 0.4949F, -0.1158F, -1.3526F, -0.1309F, 0.0F));

		PartDefinition cube_r123 = jaw1.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(45, 77).mirror().addBox(-0.5F, -0.575F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0482F, 0.467F, -0.993F, -0.3142F, -0.1309F, 0.0F));

		PartDefinition cube_r124 = jaw1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(107, 39).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.996F, 1.353F, -1.3891F, -1.4835F, -0.1309F, 0.0F));

		PartDefinition cube_r125 = jaw1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(111, 48).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.866F, 1.4402F, -2.3767F, -0.1571F, -0.1309F, 0.0F));

		PartDefinition cube_r126 = jaw1.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(97, 93).mirror().addBox(-0.0043F, -2.0617F, -0.0212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.2392F, -0.1658F, 0.0F));

		PartDefinition cube_r127 = jaw1.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(97, 97).mirror().addBox(-0.0043F, -3.5189F, 0.2003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.3701F, -0.1658F, 0.0F));

		PartDefinition cube_r128 = jaw1.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(57, 94).mirror().addBox(-0.0043F, -3.2866F, 1.1165F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(98, 0).mirror().addBox(-0.1034F, -5.1735F, 1.2167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.5533F, -0.1658F, 0.0F));

		PartDefinition cube_r129 = jaw1.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(43, 106).mirror().addBox(-0.0043F, 1.036F, -0.3396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(38, 106).mirror().addBox(-0.0043F, 0.461F, -0.3396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 2.9932F, -0.1658F, 0.0F));

		PartDefinition cube_r130 = jaw1.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(66, 111).mirror().addBox(-0.7F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(111, 70).mirror().addBox(-0.7F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-3.8189F, 0.4417F, -2.9259F, -0.5498F, -0.1309F, 0.0F));

		PartDefinition cube_r131 = jaw1.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(98, 4).mirror().addBox(-0.1034F, -5.2903F, 0.1437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.3788F, -0.1658F, 0.0F));

		PartDefinition cube_r132 = jaw1.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(-0.0938F, -7.0517F, 0.3206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.4142F, -0.1658F, -0.0049F));

		PartDefinition cube_r133 = jaw1.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(107, 42).mirror().addBox(-0.0938F, -7.8058F, 0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.4491F, -0.1658F, -0.0049F));

		PartDefinition cube_r134 = jaw1.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(48, 107).mirror().addBox(-0.0938F, -2.2285F, -8.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, -0.0344F, -0.1658F, -0.0049F));

		PartDefinition cube_r135 = jaw1.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(53, 107).mirror().addBox(-0.0938F, 6.3228F, -5.9681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, -1.1253F, -0.1658F, -0.0049F));

		PartDefinition cube_r136 = jaw1.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(58, 107).mirror().addBox(-0.0938F, -3.4175F, -8.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 0.0965F, -0.1658F, -0.0049F));

		PartDefinition cube_r137 = jaw1.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-0.0938F, -8.0345F, -0.1904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.3269F, -0.1658F, -0.0049F));

		PartDefinition cube_r138 = jaw1.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(106, 80).mirror().addBox(-0.0938F, 1.3732F, 4.8418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, -3.1237F, -0.1658F, -0.0049F));

		PartDefinition cube_r139 = jaw1.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(66, 88).mirror().addBox(-0.1034F, -8.6247F, 2.2046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.6842F, -0.1658F, 0.0F));

		PartDefinition cube_r140 = jaw1.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-0.1034F, -8.308F, 0.2255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 89).mirror().addBox(-0.1034F, -6.7186F, 0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.4224F, -0.1658F, 0.0F));

		PartDefinition cube_r141 = jaw1.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(80, 107).mirror().addBox(-0.1034F, -7.6506F, -0.2957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.2479F, -0.1658F, 0.0F));

		PartDefinition cube_r142 = jaw1.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(107, 92).mirror().addBox(-0.1034F, -5.5751F, 1.922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.597F, -0.1658F, 0.0F));

		PartDefinition cube_r143 = jaw1.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(107, 95).mirror().addBox(-0.1034F, -4.8579F, 1.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.5621F, -0.1658F, 0.0F));

		PartDefinition cube_r144 = jaw1.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.1034F, -4.2094F, 1.5426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 3).mirror().addBox(-0.0043F, -3.4224F, 1.4916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2371F, 1.2837F, -3.356F, 1.4923F, -0.1658F, 0.0F));

		PartDefinition cube_r145 = jaw1.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(38, 106).addBox(-0.9957F, 0.461F, -0.3396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 106).addBox(-0.9957F, 1.036F, -0.3396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 2.9932F, 0.1658F, 0.0F));

		PartDefinition cube_r146 = jaw1.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(106, 80).addBox(-0.9063F, 1.3732F, 4.8418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, -3.1237F, 0.1658F, 0.0049F));

		PartDefinition cube_r147 = jaw1.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(98, 12).addBox(-0.9063F, -8.0345F, -0.1904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.3269F, 0.1658F, 0.0049F));

		PartDefinition cube_r148 = jaw1.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 107).addBox(-0.9063F, -3.4175F, -8.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 0.0965F, 0.1658F, 0.0049F));

		PartDefinition cube_r149 = jaw1.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(53, 107).addBox(-0.9063F, 6.3228F, -5.9681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, -1.1253F, 0.1658F, 0.0049F));

		PartDefinition cube_r150 = jaw1.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(48, 107).addBox(-0.9063F, -2.2285F, -8.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, -0.0344F, 0.1658F, 0.0049F));

		PartDefinition cube_r151 = jaw1.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(107, 42).addBox(-0.9063F, -7.8058F, 0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.4491F, 0.1658F, 0.0049F));

		PartDefinition cube_r152 = jaw1.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(98, 8).addBox(-0.9063F, -7.0517F, 0.3206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.4142F, 0.1658F, 0.0049F));

		PartDefinition cube_r153 = jaw1.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(98, 4).addBox(-0.8966F, -5.2903F, 0.1437F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.3788F, 0.1658F, 0.0F));

		PartDefinition cube_r154 = jaw1.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(98, 0).addBox(-0.8966F, -5.1735F, 1.2167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(57, 94).addBox(-0.9957F, -3.2866F, 1.1165F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.5533F, 0.1658F, 0.0F));

		PartDefinition cube_r155 = jaw1.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(108, 3).addBox(-0.9957F, -3.4224F, 1.4916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 0).addBox(-0.8966F, -4.2094F, 1.5426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.4923F, 0.1658F, 0.0F));

		PartDefinition cube_r156 = jaw1.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(107, 95).addBox(-0.8966F, -4.8579F, 1.7964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.5621F, 0.1658F, 0.0F));

		PartDefinition cube_r157 = jaw1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(107, 92).addBox(-0.8966F, -5.5751F, 1.922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.597F, 0.1658F, 0.0F));

		PartDefinition cube_r158 = jaw1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(107, 89).addBox(-0.8966F, -6.7186F, 0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 20).addBox(-0.8966F, -8.308F, 0.2255F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.4224F, 0.1658F, 0.0F));

		PartDefinition cube_r159 = jaw1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(80, 107).addBox(-0.8966F, -7.6506F, -0.2957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.2479F, 0.1658F, 0.0F));

		PartDefinition cube_r160 = jaw1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(66, 88).addBox(-0.8966F, -8.6247F, 2.2046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.6842F, 0.1658F, 0.0F));

		PartDefinition cube_r161 = jaw1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(97, 97).addBox(-0.9957F, -3.5189F, 0.2003F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.3701F, 0.1658F, 0.0F));

		PartDefinition cube_r162 = jaw1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(97, 93).addBox(-0.9957F, -2.0617F, -0.0212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2016F, 1.2837F, -3.356F, 1.2392F, 0.1658F, 0.0F));

		PartDefinition cube_r163 = jaw1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(111, 70).addBox(-0.3F, -0.2F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(66, 111).addBox(-0.3F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6197F, 0.4417F, -2.9259F, -0.5498F, 0.1309F, 0.0F));

		PartDefinition cube_r164 = jaw1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(111, 48).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5727F, 1.4402F, -2.3767F, -0.1571F, 0.1309F, 0.0F));

		PartDefinition cube_r165 = jaw1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(107, 39).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4426F, 1.353F, -1.3891F, -1.4835F, 0.1309F, 0.0F));

		PartDefinition cube_r166 = jaw1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(100, 101).addBox(-0.5F, -0.5605F, -0.4402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, -1.3526F, 0.1309F, 0.0F));

		PartDefinition cube_r167 = jaw1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(45, 77).addBox(-0.5F, -0.575F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3905F, 0.467F, -0.993F, -0.3142F, 0.1309F, 0.0F));

		PartDefinition cube_r168 = jaw1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(91, 56).addBox(-0.5F, -0.5239F, -0.7011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.275F, 0.4949F, -0.1158F, 0.0873F, 0.1309F, 0.0F));

		PartDefinition leftFace = head1.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.846F, -2.0745F, -5.4167F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(97, 63).addBox(-1.2547F, -0.7157F, -3.5473F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(97, 60).addBox(-1.2547F, -0.7157F, -3.1473F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1185F, 0.6947F, 6.2009F, -0.4638F, 0.1517F, -0.0179F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(97, 45).addBox(-1.2547F, -2.5821F, -1.1183F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.1185F, 0.6947F, 6.2009F, 0.7579F, 0.1517F, -0.0179F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(85, 90).addBox(-0.2547F, -2.287F, -1.3589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1185F, 0.6947F, 6.2009F, 1.1506F, 0.1517F, -0.0179F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(104, 32).addBox(-0.2547F, -1.7621F, 0.008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1185F, 0.6947F, 6.2009F, 1.3688F, 0.1517F, -0.0179F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(104, 18).addBox(-0.2547F, -1.6658F, 0.0277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(112, 32).addBox(-0.2547F, -0.1658F, 0.0277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1185F, 0.6947F, 6.2009F, 1.456F, 0.1517F, -0.0179F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(9, 76).addBox(-0.55F, -1.15F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F))
				.texOffs(75, 52).addBox(-0.55F, -0.55F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F))
				.texOffs(75, 29).addBox(-0.55F, 0.05F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3027F, -0.5152F, 4.544F, -0.0196F, -0.0017F, -0.9544F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(42, 66).addBox(-0.5F, -2.9F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4115F, 0.2034F, 6.5518F, 0.9326F, 0.9336F, -0.1525F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(105, 54).addBox(-0.5F, -0.4F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(105, 51).addBox(-0.5F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2672F, 1.475F, 5.0781F, -0.4544F, 0.1396F, -0.0219F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(65, 105).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3081F, 1.0906F, 5.4289F, -1.7634F, 0.1396F, -0.0219F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(104, 68).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.367F, 2.0554F, 5.6971F, 2.0327F, 0.1396F, -0.0219F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(104, 65).addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 62).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.2349F, 2.0566F, 4.7576F, 2.8181F, 0.1396F, -0.0219F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(104, 59).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1675F, 1.6261F, 4.3451F, -2.3743F, 0.1396F, -0.0219F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(104, 45).addBox(-0.5F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(102, 42).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2101F, 0.5248F, 4.8197F, -1.9816F, 0.1396F, -0.0219F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(101, 48).addBox(-0.5F, -1.627F, -1.447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.329F, 1.874F, 5.4555F, -0.5417F, 0.1396F, -0.0219F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(108, 15).addBox(-0.4871F, -0.8423F, -0.1105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, -0.1484F, 0.1745F, -0.0175F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(106, 86).addBox(-0.4871F, -0.2173F, -0.549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, 0.7243F, 0.1745F, -0.0175F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(107, 36).addBox(-0.4871F, -1.2361F, -0.8504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, 2.1206F, 0.1745F, -0.0175F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(107, 28).addBox(-0.4871F, -0.9622F, -0.2096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, 2.6878F, 0.1745F, -0.0175F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(28, 107).addBox(-0.4871F, -0.5649F, 0.0103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(59, 6).addBox(-0.6121F, -0.3495F, -0.4982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(82, 69).addBox(-0.3871F, -0.3495F, -0.4982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, -2.9409F, 0.1745F, -0.0175F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(106, 83).addBox(-0.4871F, 0.0664F, -0.7301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, -2.0246F, 0.1745F, -0.0175F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(111, 80).addBox(-0.4871F, -0.6144F, -1.141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, -2.1991F, 0.1745F, -0.0175F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(111, 77).addBox(-0.4871F, -0.3887F, -1.14F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7526F, 0.1456F, 3.4083F, -1.5446F, 0.1745F, -0.0175F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(108, 12).addBox(-0.83F, -2.3831F, -3.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 109).addBox(-0.83F, -2.8527F, -5.2572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 0.5364F, 0.1806F, -0.0411F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 109).addBox(-0.83F, -1.5204F, -2.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(104, 108).addBox(-0.83F, -1.5204F, -3.4537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 0.231F, 0.1806F, -0.0411F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(99, 108).addBox(-0.83F, 2.9931F, -1.661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, -1.2962F, 0.1806F, -0.0411F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(94, 108).addBox(-0.83F, 0.8251F, 3.5257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, -2.8233F, 0.1806F, -0.0411F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(73, 108).addBox(-0.83F, -5.1007F, 0.8251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.8891F, 0.1806F, -0.0411F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(68, 108).addBox(-0.83F, -5.3864F, -0.7313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(63, 108).addBox(-0.83F, -4.7864F, -0.7313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.5836F, 0.1806F, -0.0411F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(108, 9).addBox(-0.83F, -2.6513F, -3.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 0.6237F, 0.1806F, -0.0411F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(101, 24).addBox(-1.0093F, -0.0221F, -0.0094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.504F, 2.7386F, 4.6948F, 1.508F, 0.1555F, -0.022F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(10, 95).addBox(-1.0093F, -0.0221F, -1.0093F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3478F, 2.5495F, 3.7253F, 2.9479F, 0.1555F, -0.022F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(21, 89).addBox(-1.0093F, -1.0221F, -2.0093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1924F, 2.1716F, 2.7878F, -1.9827F, 0.1555F, -0.022F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(66, 83).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2592F, 1.2924F, 3.3977F, -0.1861F, 0.1898F, -0.0286F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(51, 66).addBox(-1.0F, -0.125F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.2064F, -1.1592F, 3.4053F, 0.191F, 0.177F, -0.0178F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(77, 81).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.4005F, 1.1523F, 1.6773F, 1.5604F, 0.1137F, -0.0567F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(59, 83).addBox(-1.0846F, -1.8853F, -1.3965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.6441F, 0.1747F, -0.0572F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(108, 6).addBox(-1.0419F, 0.2578F, 3.1783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, -2.8915F, 0.1832F, -0.0362F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(42, 87).addBox(-0.5F, 3.1F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 87).addBox(-0.5F, 2.2F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1208F, 2.4584F, -1.3987F, 1.8332F, 0.1265F, -0.014F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(14, 87).addBox(-0.9821F, -1.4583F, -2.2349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 87).addBox(-0.9821F, -2.3583F, -2.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 87).addBox(-0.9821F, -3.2583F, -2.1349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.8323F, 0.1876F, -0.0142F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(85, 86).addBox(-0.9821F, -4.1188F, -2.0804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.7974F, 0.1876F, -0.0142F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(86, 76).addBox(-0.3154F, -0.8577F, -2.5262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 105).addBox(-0.3154F, -1.6577F, -1.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5252F, 0.6845F, -2.896F, 1.6241F, 0.1003F, -0.014F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(105, 74).addBox(-0.7872F, -0.9405F, -1.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2252F, 1.1845F, -4.696F, 1.7974F, 0.1876F, -0.0142F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(70, 105).addBox(-0.8116F, -1.5579F, -1.6662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2252F, 1.1845F, -4.696F, 1.6202F, 0.1832F, -0.0362F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(73, 86).addBox(-1.0403F, 1.1738F, 3.3424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, -2.708F, 0.1832F, -0.0353F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(109, 18).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3869F, -1.0655F, 1.8648F, -1.5191F, 0.1222F, -0.035F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(10, 109).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.2731F, -0.8884F, 0.8872F, -2.9677F, 0.1222F, -0.035F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(64, 6).addBox(-1.0403F, 0.5604F, -0.3309F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, -2.8826F, 0.1832F, -0.0353F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(86, 31).addBox(-1.0403F, -3.0629F, 2.7688F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 2.7548F, 0.1832F, -0.0353F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(77, 57).addBox(-1.0403F, -3.9293F, -1.2681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.7076F, 0.1832F, -0.0353F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(112, 26).addBox(-0.4998F, -1.4338F, -0.433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4748F, 0.6845F, 0.204F, -1.538F, 0.1367F, -0.033F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(21, 112).addBox(-0.4998F, -1.4212F, -1.2071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4748F, 0.6845F, 0.204F, -2.1488F, 0.1367F, -0.033F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(10, 112).addBox(-0.4998F, -0.4278F, -1.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.4748F, 0.6845F, 0.204F, -3.0215F, 0.1367F, -0.033F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(5, 112).addBox(-0.8005F, -0.3251F, 0.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, -3.0236F, 0.1978F, -0.0334F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 112).addBox(-0.8005F, -0.4743F, 0.3879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 3.0851F, 0.1978F, -0.0334F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(112, 29).addBox(-0.8005F, -2.1892F, -0.2249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 111).addBox(-0.8005F, -1.8892F, -0.2249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.7325F, 0.1978F, -0.0334F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(83, 103).addBox(-0.8005F, -1.8634F, -0.527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8748F, 0.6845F, 0.904F, 1.5579F, 0.1978F, -0.0334F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(106, 22).addBox(-0.8347F, -1.4668F, -0.8367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(13, 106).addBox(-0.8347F, -0.6668F, -0.8367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2252F, 1.1845F, -4.696F, 1.8326F, 0.1484F, 0.0F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(23, 106).addBox(-0.8347F, -0.7897F, -0.7155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2252F, 1.1845F, -4.696F, 2.0508F, 0.1484F, 0.0F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(102, 38).addBox(-0.5F, -1.2188F, -0.6944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1179F, 1.3828F, 5.8408F, -0.4033F, 0.1786F, -0.0357F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(38, 102).addBox(-0.5F, -1.2353F, -0.4621F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1179F, 1.3828F, 5.8408F, 0.1639F, 0.1786F, -0.0357F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(33, 98).addBox(-0.5F, -1.2927F, -0.5032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.1179F, 1.3828F, 5.8408F, -2.8293F, 0.1786F, -0.0357F));

		PartDefinition rightFace = head1.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.686F, -2.0745F, -5.4167F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(97, 63).mirror().addBox(-0.7453F, -0.7157F, -3.5473F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(97, 60).mirror().addBox(-0.7453F, -0.7157F, -3.1473F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1185F, 0.6947F, 6.2009F, -0.4638F, -0.1517F, 0.0179F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(97, 45).mirror().addBox(-0.7453F, -2.5821F, -1.1183F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.1185F, 0.6947F, 6.2009F, 0.7579F, -0.1517F, 0.0179F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(85, 90).mirror().addBox(-0.7453F, -2.287F, -1.3589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1185F, 0.6947F, 6.2009F, 1.1506F, -0.1517F, 0.0179F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(104, 32).mirror().addBox(-0.7453F, -1.7621F, 0.008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1185F, 0.6947F, 6.2009F, 1.3688F, -0.1517F, 0.0179F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(104, 18).mirror().addBox(-0.7453F, -1.6658F, 0.0277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(112, 32).mirror().addBox(-0.7453F, -0.1658F, 0.0277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1185F, 0.6947F, 6.2009F, 1.456F, -0.1517F, 0.0179F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(9, 76).mirror().addBox(-0.45F, -1.15F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(75, 52).mirror().addBox(-0.45F, -0.55F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(75, 29).mirror().addBox(-0.45F, 0.05F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3027F, -0.5152F, 4.544F, -0.0196F, 0.0017F, 0.9544F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(42, 66).mirror().addBox(-0.5F, -2.9F, -2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4115F, 0.2034F, 6.5518F, 0.9326F, -0.9336F, 0.1525F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(105, 54).mirror().addBox(-0.5F, -0.4F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(105, 51).mirror().addBox(-0.5F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2672F, 1.475F, 5.0781F, -0.4544F, -0.1396F, 0.0219F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(65, 105).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3081F, 1.0906F, 5.4289F, -1.7634F, -0.1396F, 0.0219F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(104, 68).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.367F, 2.0554F, 5.6971F, 2.0327F, -0.1396F, 0.0219F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(104, 65).mirror().addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 62).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.2349F, 2.0566F, 4.7576F, 2.8181F, -0.1396F, 0.0219F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(104, 59).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1675F, 1.6261F, 4.3451F, -2.3743F, -0.1396F, 0.0219F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(104, 45).mirror().addBox(-0.5F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(102, 42).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2101F, 0.5248F, 4.8197F, -1.9816F, -0.1396F, 0.0219F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(101, 48).mirror().addBox(-0.5F, -1.627F, -1.447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.329F, 1.874F, 5.4555F, -0.5417F, -0.1396F, 0.0219F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(108, 15).mirror().addBox(-0.5129F, -0.8423F, -0.1105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, -0.1484F, -0.1745F, 0.0175F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(106, 86).mirror().addBox(-0.5129F, -0.2173F, -0.549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, 0.7243F, -0.1745F, 0.0175F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(107, 36).mirror().addBox(-0.5129F, -1.2361F, -0.8504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, 2.1206F, -0.1745F, 0.0175F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(107, 28).mirror().addBox(-0.5129F, -0.9622F, -0.2096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, 2.6878F, -0.1745F, 0.0175F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(28, 107).mirror().addBox(-0.5129F, -0.5649F, 0.0103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(59, 6).mirror().addBox(-0.3879F, -0.3495F, -0.4982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(82, 69).mirror().addBox(-0.6129F, -0.3495F, -0.4982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, -2.9409F, -0.1745F, 0.0175F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(106, 83).mirror().addBox(-0.5129F, 0.0664F, -0.7301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, -2.0246F, -0.1745F, 0.0175F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(111, 80).mirror().addBox(-0.5129F, -0.6144F, -1.141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, -2.1991F, -0.1745F, 0.0175F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(111, 77).mirror().addBox(-0.5129F, -0.3887F, -1.14F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7526F, 0.1456F, 3.4083F, -1.5446F, -0.1745F, 0.0175F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(108, 12).mirror().addBox(-0.17F, -2.3831F, -3.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 109).mirror().addBox(-0.17F, -2.8527F, -5.2572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 0.5364F, -0.1806F, 0.0411F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.17F, -1.5204F, -2.8537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(104, 108).mirror().addBox(-0.17F, -1.5204F, -3.4537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 0.231F, -0.1806F, 0.0411F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(99, 108).mirror().addBox(-0.17F, 2.9931F, -1.661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, -1.2962F, -0.1806F, 0.0411F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(94, 108).mirror().addBox(-0.17F, 0.8251F, 3.5257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, -2.8233F, -0.1806F, 0.0411F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(73, 108).mirror().addBox(-0.17F, -5.1007F, 0.8251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.8891F, -0.1806F, 0.0411F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(68, 108).mirror().addBox(-0.17F, -5.3864F, -0.7313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(63, 108).mirror().addBox(-0.17F, -4.7864F, -0.7313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.5836F, -0.1806F, 0.0411F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(108, 9).mirror().addBox(-0.17F, -2.6513F, -3.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 0.6237F, -0.1806F, 0.0411F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(0.0093F, -0.0221F, -0.0094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.504F, 2.7386F, 4.6948F, 1.508F, -0.1555F, 0.022F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(0.0093F, -0.0221F, -1.0093F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3478F, 2.5495F, 3.7253F, 2.9479F, -0.1555F, 0.022F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(21, 89).mirror().addBox(0.0093F, -1.0221F, -2.0093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1924F, 2.1716F, 2.7878F, -1.9827F, -0.1555F, 0.022F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(66, 83).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2592F, 1.2924F, 3.3977F, -0.1861F, -0.1898F, 0.0286F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(51, 66).mirror().addBox(0.0F, -0.125F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.2064F, -1.1592F, 3.4053F, 0.191F, -0.177F, 0.0178F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(77, 81).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.4005F, 1.1523F, 1.6773F, 1.5604F, -0.1137F, 0.0567F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(59, 83).mirror().addBox(0.0846F, -1.8853F, -1.3965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.6441F, -0.1747F, 0.0572F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(0.0419F, 0.2578F, 3.1783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, -2.8915F, -0.1832F, 0.0362F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(-0.5F, 3.1F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(28, 87).mirror().addBox(-0.5F, 2.2F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1208F, 2.4584F, -1.3987F, 1.8332F, -0.1265F, 0.014F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(14, 87).mirror().addBox(-0.0179F, -1.4583F, -2.2349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 87).mirror().addBox(-0.0179F, -2.3583F, -2.0598F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 87).mirror().addBox(-0.0179F, -3.2583F, -2.1349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.8323F, -0.1876F, 0.0142F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(-0.0179F, -4.1188F, -2.0804F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.7974F, -0.1876F, 0.0142F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(86, 76).mirror().addBox(-0.6846F, -0.8577F, -2.5262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 105).mirror().addBox(-0.6846F, -1.6577F, -1.9262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5252F, 0.6845F, -2.896F, 1.6241F, -0.1003F, 0.014F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-0.2128F, -0.9405F, -1.5119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2252F, 1.1845F, -4.696F, 1.7974F, -0.1876F, 0.0142F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(70, 105).mirror().addBox(-0.1884F, -1.5579F, -1.6662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2252F, 1.1845F, -4.696F, 1.6202F, -0.1832F, 0.0362F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(73, 86).mirror().addBox(0.0403F, 1.1738F, 3.3424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, -2.708F, -0.1832F, 0.0353F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(109, 18).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3869F, -1.0655F, 1.8648F, -1.5191F, -0.1222F, 0.035F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.2731F, -0.8884F, 0.8872F, -2.9677F, -0.1222F, 0.035F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(0.0403F, 0.5604F, -0.3309F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, -2.8826F, -0.1832F, 0.0353F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(0.0403F, -3.0629F, 2.7688F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 2.7548F, -0.1832F, 0.0353F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(0.0403F, -3.9293F, -1.2681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.7076F, -0.1832F, 0.0353F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(112, 26).mirror().addBox(-0.5002F, -1.4338F, -0.433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4748F, 0.6845F, 0.204F, -1.538F, -0.1367F, 0.033F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(21, 112).mirror().addBox(-0.5002F, -1.4212F, -1.2071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4748F, 0.6845F, 0.204F, -2.1488F, -0.1367F, 0.033F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(10, 112).mirror().addBox(-0.5002F, -0.4278F, -1.3232F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.4748F, 0.6845F, 0.204F, -3.0215F, -0.1367F, 0.033F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(5, 112).mirror().addBox(-0.1995F, -0.3251F, 0.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, -3.0236F, -0.1978F, 0.0334F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.1995F, -0.4743F, 0.3879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 3.0851F, -0.1978F, 0.0334F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(112, 29).mirror().addBox(-0.1995F, -2.1892F, -0.2249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 111).mirror().addBox(-0.1995F, -1.8892F, -0.2249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.7325F, -0.1978F, 0.0334F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(83, 103).mirror().addBox(-0.1995F, -1.8634F, -0.527F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8748F, 0.6845F, 0.904F, 1.5579F, -0.1978F, 0.0334F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(106, 22).mirror().addBox(-0.1653F, -1.4668F, -0.8367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(13, 106).mirror().addBox(-0.1653F, -0.6668F, -0.8367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2252F, 1.1845F, -4.696F, 1.8326F, -0.1484F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(23, 106).mirror().addBox(-0.1653F, -0.7897F, -0.7155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2252F, 1.1845F, -4.696F, 2.0508F, -0.1484F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(102, 38).mirror().addBox(-0.5F, -1.2188F, -0.6944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1179F, 1.3828F, 5.8408F, -0.4033F, -0.1786F, 0.0357F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(38, 102).mirror().addBox(-0.5F, -1.2353F, -0.4621F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1179F, 1.3828F, 5.8408F, 0.1639F, -0.1786F, 0.0357F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(33, 98).mirror().addBox(-0.5F, -1.2927F, -0.5032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1179F, 1.3828F, 5.8408F, -2.8293F, -0.1786F, 0.0357F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(103, 0).addBox(-0.3F, -0.0851F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.2856F, 6.8643F, -2.6163F, 1.0492F, 0.243F, -0.0479F));

		PartDefinition cube_r291 = upperarm2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(75, 101).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 6.0669F, 2.4281F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r292 = upperarm2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(65, 101).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 6.0669F, 2.4281F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r293 = upperarm2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(96, 18).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, 3.6375F, 1.1707F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r294 = upperarm2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(28, 103).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.8885F, 0.4283F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r295 = upperarm2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(93, 111).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2F, 3.0324F, 1.1079F, 0.6507F, -0.0209F, 0.0138F));

		PartDefinition cube_r296 = upperarm2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(103, 4).addBox(-0.5F, -1.025F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 1.9188F, 0.2503F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r297 = upperarm2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(102, 91).addBox(-0.5F, -0.425F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.093F, 0.1356F, -0.5082F, -0.0181F, 0.0045F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create().texOffs(91, 80).addBox(-0.4F, -0.1996F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6495F, 7.5527F, 3.591F, -1.2927F, -0.3899F, -1.6972F));

		PartDefinition cube_r298 = lowerarm2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(66, 92).addBox(-0.5F, -0.1579F, -1.7127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1F, 3.4005F, 0.4002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r299 = lowerarm2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(87, 62).addBox(-0.5132F, -0.3632F, -0.9638F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 3.4005F, 0.4002F, -0.111F, 0.0199F, 0.0047F));

		PartDefinition cube_r300 = lowerarm2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(39, 48).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 1.4005F, 0.1002F, -0.0848F, 0.0181F, 0.0093F));

		PartDefinition hand4 = lowerarm2.addOrReplaceChild("hand4", CubeListBuilder.create().texOffs(84, 57).addBox(-0.8736F, -0.2769F, -1.1549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.3039F, 7.0579F, -0.6776F, 0.1129F, -0.0956F, -0.5881F));

		PartDefinition hand2 = hand4.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r301 = hand2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(86, 0).addBox(-0.2F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create().texOffs(103, 8).addBox(-0.7F, -0.0851F, 0.1687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.0856F, 6.8643F, -2.6163F, 0.8311F, -0.243F, 0.0479F));

		PartDefinition cube_r302 = upperarm3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(95, 101).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2F, 6.0669F, 2.4281F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r303 = upperarm3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(101, 79).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 6.0669F, 2.4281F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r304 = upperarm3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(20, 96).addBox(-0.5F, -0.0236F, -0.0726F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.2F, 3.6375F, 1.1707F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r305 = upperarm3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(57, 103).addBox(-0.5F, 0.0214F, -0.2607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.8885F, 0.4283F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r306 = upperarm3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(98, 111).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.2F, 3.0324F, 1.1079F, 0.6507F, 0.0209F, -0.0138F));

		PartDefinition cube_r307 = upperarm3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(103, 12).addBox(-0.5F, -1.025F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 1.9188F, 0.2503F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r308 = upperarm3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(102, 95).addBox(-0.5F, -0.425F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.093F, 0.1356F, -0.5082F, 0.0181F, -0.0045F));

		PartDefinition lowerarm3 = upperarm3.addOrReplaceChild("lowerarm3", CubeListBuilder.create().texOffs(92, 60).addBox(-0.6F, -0.1996F, -1.2998F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6495F, 7.5527F, 3.591F, -0.358F, -1.2962F, 0.389F));

		PartDefinition cube_r309 = lowerarm3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(92, 66).addBox(-0.5F, -0.1579F, -1.7127F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1F, 3.4005F, 0.4002F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r310 = lowerarm3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(87, 68).addBox(-0.4868F, -0.3632F, -0.9638F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 3.4005F, 0.4002F, -0.111F, -0.0199F, -0.0047F));

		PartDefinition cube_r311 = lowerarm3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(80, 86).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.4005F, 0.1002F, -0.0848F, -0.0181F, -0.0093F));

		PartDefinition hand3 = lowerarm3.addOrReplaceChild("hand3", CubeListBuilder.create().texOffs(84, 81).addBox(-0.1264F, -0.2769F, -1.1549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.3039F, 7.0579F, -0.6776F, 0.1086F, 0.1004F, 0.5445F));

		PartDefinition hand5 = hand3.addOrReplaceChild("hand5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r312 = hand5.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(86, 15).addBox(-0.8F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5638F, 3.7949F, -2.9614F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r313 = bone.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(60, 66).addBox(-0.9933F, -0.6734F, 0.3123F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5974F, 3.2789F, -1.5002F, 0.6266F, 0.5216F, 0.5201F));

		PartDefinition cube_r314 = bone.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(55, 60).addBox(-0.9933F, 0.0477F, -1.7791F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.5974F, 3.2789F, -1.5002F, 1.5865F, 0.5216F, 0.5201F));

		PartDefinition cube_r315 = bone.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(66, 54).addBox(-0.9933F, -1.8329F, -1.6409F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)), PartPose.offsetAndRotation(-0.5974F, 3.2789F, -1.5002F, 1.3335F, 0.5216F, 0.5201F));

		PartDefinition cube_r316 = bone.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(54, 77).addBox(-0.9933F, -2.0242F, -2.169F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-0.5974F, 3.2789F, -1.5002F, 0.8099F, 0.5216F, 0.5201F));

		PartDefinition cube_r317 = bone.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(67, 46).addBox(-0.9933F, -1.4615F, -2.1359F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.5974F, 3.2789F, -1.5002F, -0.5428F, 0.5216F, 0.5201F));

		PartDefinition cube_r318 = bone.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(51, 25).addBox(-0.9933F, -1.798F, -1.4348F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.397F)), PartPose.offsetAndRotation(-0.5974F, 3.2789F, -1.5002F, -0.185F, 0.5216F, 0.5201F));

		PartDefinition cube_r319 = bone.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.406F)), PartPose.offsetAndRotation(-0.6753F, -1.7297F, -1.8685F, -0.75F, 0.3013F, -0.1823F));

		PartDefinition cube_r320 = bone.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(33, 66).addBox(-1.0F, -0.4F, -1.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(-0.4938F, -2.4102F, -0.8969F, 0.559F, 0.3013F, -0.1823F));

		PartDefinition cube_r321 = bone.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(23, 10).addBox(-1.0F, -1.6F, -3.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.2655F, -2.9589F, 0.1456F, 1.9989F, 0.3013F, -0.1823F));

		PartDefinition cube_r322 = bone.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(73, 38).addBox(-1.0F, -1.6F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.0317F, -3.2679F, 1.2664F, -2.9317F, 0.3013F, -0.1823F));

		PartDefinition cube_r323 = bone.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(11, 65).addBox(-1.0F, -0.4F, -0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.374F, -3.3742F, 2.4116F, -1.5354F, 0.3013F, -0.1823F));

		PartDefinition cube_r324 = bone.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(53, 9).addBox(-1.0F, -0.4F, -2.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(1.1282F, -2.4639F, 4.2671F, -0.4882F, 0.3013F, -0.1823F));

		PartDefinition cube_r325 = bone.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -1.775F, -0.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9851F, -0.6675F, 2.7661F, 0.2099F, 0.3013F, -0.1823F));

		PartDefinition cube_r326 = bone.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(45, 46).addBox(-1.0F, -2.875F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.396F)), PartPose.offsetAndRotation(0.7897F, -0.1232F, 1.8303F, 0.4717F, 0.3013F, -0.1823F));

		PartDefinition cube_r327 = bone.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -0.875F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.6259F, 0.4179F, 0.9961F, 0.6462F, 0.3013F, -0.1823F));

		PartDefinition cube_r328 = bone.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(11, 71).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4753F, 1.0164F, 0.1704F, 0.8208F, 0.3013F, -0.1823F));

		PartDefinition cube_r329 = bone.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(20, 72).addBox(-1.0003F, 0.2144F, -2.1899F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(0.0537F, 0.4813F, -0.8526F, 1.2135F, 0.3013F, -0.1823F));

		PartDefinition cube_r330 = bone.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(62, 38).addBox(-1.0003F, -0.3856F, -1.6899F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.394F)), PartPose.offsetAndRotation(0.0537F, 0.4813F, -0.8526F, 1.7371F, 0.3013F, -0.1823F));

		PartDefinition cube_r331 = bone.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0003F, -0.1856F, -1.6899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.39F)), PartPose.offsetAndRotation(0.0537F, 0.4813F, -0.8526F, 0.6899F, 0.3013F, -0.1823F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3638F, 3.7949F, -2.9614F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r332 = bone3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-1.0067F, -0.6734F, 0.3123F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.5974F, 3.2789F, -1.5002F, 0.6266F, -0.5216F, -0.5201F));

		PartDefinition cube_r333 = bone3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(55, 60).mirror().addBox(-1.0067F, 0.0477F, -1.7791F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(0.5974F, 3.2789F, -1.5002F, 1.5865F, -0.5216F, -0.5201F));

		PartDefinition cube_r334 = bone3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(66, 54).mirror().addBox(-1.0067F, -1.8329F, -1.6409F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.406F)).mirror(false), PartPose.offsetAndRotation(0.5974F, 3.2789F, -1.5002F, 1.3335F, -0.5216F, -0.5201F));

		PartDefinition cube_r335 = bone3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-1.0067F, -2.0242F, -2.169F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(0.5974F, 3.2789F, -1.5002F, 0.8099F, -0.5216F, -0.5201F));

		PartDefinition cube_r336 = bone3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-1.0067F, -1.4615F, -2.1359F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.5974F, 3.2789F, -1.5002F, -0.5428F, -0.5216F, -0.5201F));

		PartDefinition cube_r337 = bone3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(51, 25).mirror().addBox(-1.0067F, -1.798F, -1.4348F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.397F)).mirror(false), PartPose.offsetAndRotation(0.5974F, 3.2789F, -1.5002F, -0.185F, -0.5216F, -0.5201F));

		PartDefinition cube_r338 = bone3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-1.0F, -1.0F, -0.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.406F)).mirror(false), PartPose.offsetAndRotation(0.6753F, -1.7297F, -1.8685F, -0.75F, -0.3013F, 0.1823F));

		PartDefinition cube_r339 = bone3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(-1.0F, -0.4F, -1.6F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(0.4938F, -2.4102F, -0.8969F, 0.559F, -0.3013F, 0.1823F));

		PartDefinition cube_r340 = bone3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(23, 10).mirror().addBox(-1.0F, -1.6F, -3.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.2655F, -2.9589F, 0.1456F, 1.9989F, -0.3013F, 0.1823F));

		PartDefinition cube_r341 = bone3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-1.0F, -1.6F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.0317F, -3.2679F, 1.2664F, -2.9317F, -0.3013F, 0.1823F));

		PartDefinition cube_r342 = bone3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(11, 65).mirror().addBox(-1.0F, -0.4F, -0.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.374F, -3.3742F, 2.4116F, -1.5354F, -0.3013F, 0.1823F));

		PartDefinition cube_r343 = bone3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(53, 9).mirror().addBox(-1.0F, -0.4F, -2.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-1.1282F, -2.4639F, 4.2671F, -0.4882F, -0.3013F, 0.1823F));

		PartDefinition cube_r344 = bone3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-1.0F, -1.775F, -0.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9851F, -0.6675F, 2.7661F, 0.2099F, -0.3013F, 0.1823F));

		PartDefinition cube_r345 = bone3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(45, 46).mirror().addBox(-1.0F, -2.875F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.396F)).mirror(false), PartPose.offsetAndRotation(-0.7897F, -0.1232F, 1.8303F, 0.4717F, -0.3013F, 0.1823F));

		PartDefinition cube_r346 = bone3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.0F, -0.875F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.6259F, 0.4179F, 0.9961F, 0.6462F, -0.3013F, 0.1823F));

		PartDefinition cube_r347 = bone3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(11, 71).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4753F, 1.0164F, 0.1704F, 0.8208F, -0.3013F, 0.1823F));

		PartDefinition cube_r348 = bone3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.9997F, 0.2144F, -2.1899F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(-0.0537F, 0.4813F, -0.8526F, 1.2135F, -0.3013F, 0.1823F));

		PartDefinition cube_r349 = bone3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-0.9997F, -0.3856F, -1.6899F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.394F)).mirror(false), PartPose.offsetAndRotation(-0.0537F, 0.4813F, -0.8526F, 1.7371F, -0.3013F, 0.1823F));

		PartDefinition cube_r350 = bone3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.9997F, -0.1856F, -1.6899F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.39F)).mirror(false), PartPose.offsetAndRotation(-0.0537F, 0.4813F, -0.8526F, 0.6899F, -0.3013F, 0.1823F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(36, 25).addBox(0.2F, -0.0522F, -0.0584F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(39, 109).addBox(0.7F, -2.6272F, 0.9416F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 109).addBox(0.7F, -2.7271F, 2.9416F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 109).addBox(0.7F, -2.8772F, 4.9416F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.054F, 4.1231F, -0.1244F, -0.2599F, 0.0321F));

		PartDefinition cube_r351 = tail1.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(17, 37).mirror().addBox(-1.8F, 0.0F, -0.9F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.9478F, 0.8415F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r352 = tail1.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(17, 37).addBox(-0.2F, 0.0F, -0.9F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.9478F, 0.8415F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r353 = tail1.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(30, 97).addBox(0.6F, -0.1429F, 0.0174F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 2.101F, 2.2123F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r354 = tail1.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(54, 94).addBox(0.6F, -0.9429F, -0.3826F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7503F, 5.382F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 66).addBox(0.2F, -0.1101F, -0.066F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(109, 57).addBox(0.7F, -3.0351F, 0.934F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 62).addBox(0.7F, -2.9601F, 2.934F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0341F, 5.8641F, 0.0137F, -0.2181F, -0.003F));

		PartDefinition cube_r355 = tail2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(92, 86).addBox(0.6F, 1.5571F, 3.6174F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 94).addBox(0.6F, 0.3571F, 1.6174F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7162F, -0.4821F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r356 = tail2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(-1.4F, 0.0F, -1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.8899F, 0.884F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r357 = tail2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(69, 66).addBox(-0.6F, 0.0F, -1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.8899F, 0.884F, 0.0F, -0.0698F, 0.0F));

		PartDefinition tail = tail2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(62, 24).addBox(-0.5F, -0.2935F, -0.0136F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7F, 0.1834F, 3.8976F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r358 = tail.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(38, 93).addBox(0.6F, 3.1571F, 5.6174F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.5327F, -4.3796F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r359 = tail.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(109, 108).addBox(-0.5F, -2.925F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2935F, 2.9864F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r360 = tail.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(85, 107).addBox(-0.5F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2935F, 0.9864F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r361 = tail.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-1.4F, 0.0F, 3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7065F, -3.0136F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r362 = tail.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(66, 60).addBox(-0.6F, 0.0F, 3.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7065F, -3.0136F, 0.0F, -0.0698F, 0.0F));

		PartDefinition tail3 = tail.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(64, 12).addBox(0.2F, -0.5203F, -0.2717F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(18, 110).addBox(0.7F, -3.4203F, 0.7283F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.2145F, 4.1002F, -0.0742F, -0.2176F, 0.016F));

		PartDefinition cube_r363 = tail3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(28, 110).addBox(0.0F, -2.95F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 2.7283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r364 = tail3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(54, 101).addBox(0.0F, 0.3F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0354F, 3.2341F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r365 = tail3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(76, 94).addBox(0.6F, 4.5571F, 7.6174F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.3182F, -8.4799F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(64, 30).addBox(0.2F, -0.5203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0157F, 3.7004F, -0.0264F, -0.1309F, 0.0034F));

		PartDefinition cube_r366 = tail4.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(14, 100).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 3.0283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r367 = tail4.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(72, 99).addBox(0.0F, -3.075F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 1.0283F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r368 = tail4.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(62, 101).addBox(0.0F, 1.5F, 1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0197F, -0.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(44, 60).addBox(0.2F, -0.5203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r369 = tail5.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(103, 83).addBox(0.0F, 3.6F, 5.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 101).addBox(0.0F, 2.4F, 3.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0197F, -4.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r370 = tail5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(17, 100).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 3.0283F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r371 = tail5.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(10, 102).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 1.0283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(11, 53).addBox(0.2F, -0.5203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition cube_r372 = tail6.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(100, 85).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 3.0283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r373 = tail6.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(45, 100).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 1.0283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r374 = tail6.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(110, 98).addBox(0.0F, 6.7F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 110).addBox(0.0F, 5.4F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0197F, -8.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(53, 16).addBox(0.2F, -0.5203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r375 = tail7.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(92, 100).addBox(0.0F, -3.225F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 3.5283F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r376 = tail7.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(89, 100).addBox(0.0F, -3.225F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.5203F, 1.0283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r377 = tail7.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(110, 103).addBox(0.0F, 7.9F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0197F, -12.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(53, 32).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -0.0354F, 0.1744F, -0.0062F));

		PartDefinition cube_r378 = tail8.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(20, 101).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0297F, 3.0283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r379 = tail8.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(101, 18).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0453F, 1.0283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r380 = tail8.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(88, 106).addBox(0.0F, 10.2F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 21).addBox(0.0F, 9.1F, 13.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -16.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(22, 54).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition cube_r381 = tail9.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(48, 101).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r382 = tail9.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(101, 32).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r383 = tail9.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(112, 112).addBox(0.0F, 13.4F, 19.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 106).addBox(0.0F, 11.2F, 17.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -20.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(33, 54).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0179F, 0.2181F, -0.0039F));

		PartDefinition cube_r384 = tail10.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(48, 110).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r385 = tail10.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(51, 101).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r386 = tail10.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(113, 0).addBox(0.0F, 14.4F, 21.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -24.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(44, 54).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0181F, 0.2618F, -0.0047F));

		PartDefinition cube_r387 = tail11.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(110, 51).addBox(0.0F, -2.65F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r388 = tail11.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(51, 110).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r389 = tail11.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(112, 56).addBox(0.0F, 16.8F, 25.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 4).addBox(0.0F, 15.6F, 23.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -28.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(55, 0).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0354F, 0.1744F, -0.0062F));

		PartDefinition cube_r390 = tail12.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(57, 110).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r391 = tail12.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(54, 110).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r392 = tail12.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(112, 39).addBox(0.0F, 18.9F, 29.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 35).addBox(0.0F, 17.9F, 27.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -32.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(55, 54).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition cube_r393 = tail13.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(78, 110).addBox(0.0F, -2.125F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r394 = tail13.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(60, 110).addBox(0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r395 = tail13.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(42, 84).addBox(0.0F, 20.9F, 31.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -36.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14", CubeListBuilder.create().texOffs(56, 46).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0352F, 0.1308F, -0.0046F));

		PartDefinition cube_r396 = tail14.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(112, 89).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r397 = tail14.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(84, 112).addBox(0.0F, -1.95F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r398 = tail14.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(73, 83).addBox(0.0F, 23.3F, 35.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 64).addBox(0.0F, 22.1F, 33.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -40.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail15 = tail14.addOrReplaceChild("tail15", CubeListBuilder.create().texOffs(11, 59).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition cube_r399 = tail15.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(112, 108).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r400 = tail15.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(112, 93).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r401 = tail15.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(113, 105).addBox(0.0F, 25.5F, 39.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 37).addBox(0.0F, 24.4F, 37.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4803F, -44.4663F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail16 = tail15.addOrReplaceChild("tail16", CubeListBuilder.create().texOffs(0, 60).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0723F, 0.2611F, -0.0187F));

		PartDefinition cube_r402 = tail16.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(114, 23).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 3.0283F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r403 = tail16.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(114, 20).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0203F, 1.0283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail17 = tail16.addOrReplaceChild("tail17", CubeListBuilder.create().texOffs(18, 77).addBox(0.2F, -0.0203F, 0.0283F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1179F, 0.4771F, -0.0544F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 2.2961F, -0.5445F, 1.0293F, -0.1709F, 0.0963F));

		PartDefinition cube_r404 = upperleg1.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(51, 72).addBox(-1.0F, -2.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8391F, -0.2515F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r405 = upperleg1.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(94, 48).addBox(-1.0F, -1.225F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(41, 95).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.015F, 2.5381F, 0.4145F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r406 = upperleg1.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(7, 91).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.546F, 0.4299F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r407 = upperleg1.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(21, 93).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7154F, -1.7431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r408 = upperleg1.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(82, 38).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.439F, -2.3519F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r409 = upperleg1.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(87, 48).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.6569F, -1.4439F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r410 = upperleg1.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(69, 72).addBox(-1.0F, -6.8F, 1.625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 14.3738F, -4.7181F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r411 = upperleg1.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(35, 89).addBox(-1.0F, -0.075F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.403F, -0.4355F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r412 = upperleg1.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(90, 45).addBox(-1.0F, 1.0305F, -1.1914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.3434F, 0.8137F, -0.3403F, 0.0F, 0.0F));

		PartDefinition lowerleg1 = upperleg1.addOrReplaceChild("lowerleg1", CubeListBuilder.create().texOffs(84, 10).addBox(-1.5F, 3.0328F, -0.031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(38, 73).addBox(-1.5F, 1.0328F, -0.331F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.105F))
				.texOffs(78, 72).addBox(-1.5F, 0.0328F, -0.331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.087F))
				.texOffs(80, 63).addBox(0.9F, 0.0328F, -0.356F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 9.8797F, -2.5284F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r413 = lowerleg1.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(96, 23).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 80).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 3.959F, 0.2529F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r414 = lowerleg1.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, -0.2F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4F, 7.7594F, 1.2434F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r415 = lowerleg1.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(23, 102).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 7.7594F, 1.2434F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r416 = lowerleg1.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(33, 93).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.4F, 5.1714F, 0.9942F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r417 = lowerleg1.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4F, 5.3708F, 0.0142F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r418 = lowerleg1.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(91, 24).addBox(-0.5F, -5.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4F, 7.5328F, 0.944F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r419 = lowerleg1.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(84, 26).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.109F)), PartPose.offsetAndRotation(-0.5F, 2.2199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r420 = lowerleg1.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(28, 82).addBox(1.9F, 0.0F, 0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.096F))
				.texOffs(0, 82).addBox(1.9F, 0.0F, 0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.4F, 6.2328F, -0.431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition feet1 = lowerleg1.addOrReplaceChild("feet1", CubeListBuilder.create().texOffs(22, 60).addBox(-2.0F, -0.9979F, 0.3761F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 9.4363F, 0.7332F, -0.969F, 0.0F, 0.0F));

		PartDefinition cube_r421 = feet1.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(42, 91).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0979F, 0.8761F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r422 = feet1.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(63, 77).addBox(-1.0F, -2.5F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5021F, 0.4761F, 0.2182F, 0.0F, 0.0F));

		PartDefinition toes1 = feet1.addOrReplaceChild("toes1", CubeListBuilder.create().texOffs(36, 34).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9702F, 1.4114F, 1.5727F, 0.0F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 2.2961F, -0.5445F, 0.8366F, -0.3813F, 0.0964F));

		PartDefinition cube_r423 = upperleg2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(60, 72).addBox(-1.0F, -2.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8391F, -0.2515F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r424 = upperleg2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(95, 39).addBox(-1.0F, -1.225F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(95, 42).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.015F, 2.5381F, 0.4145F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r425 = upperleg2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(14, 91).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.546F, 0.4299F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r426 = upperleg2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(93, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7154F, -1.7431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r427 = upperleg2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(52, 82).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 5.439F, -2.3519F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r428 = upperleg2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(49, 87).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 3.6569F, -1.4439F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r429 = upperleg2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(73, 24).addBox(-1.0F, -6.8F, 1.625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 14.3738F, -4.7181F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r430 = upperleg2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, -0.075F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.403F, -0.4355F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r431 = upperleg2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(92, 72).addBox(-1.0F, 1.0305F, -1.1914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.3434F, 0.8137F, -0.3403F, 0.0F, 0.0F));

		PartDefinition lowerleg2 = upperleg2.addOrReplaceChild("lowerleg2", CubeListBuilder.create().texOffs(35, 84).addBox(-0.5F, 3.0328F, -0.031F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(76, 43).addBox(-0.5F, 1.0328F, -0.331F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.105F))
				.texOffs(36, 80).addBox(-0.5F, 0.0328F, -0.331F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.087F))
				.texOffs(9, 81).addBox(-1.9F, 0.0328F, -0.356F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 9.8797F, -2.5284F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r432 = lowerleg2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(96, 33).addBox(-0.5F, -1.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 97).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 3.959F, 0.2529F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r433 = lowerleg2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(5, 102).addBox(-0.5F, -0.2F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.4F, 7.7594F, 1.2434F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r434 = lowerleg2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(33, 102).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4F, 7.7594F, 1.2434F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r435 = lowerleg2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(93, 75).addBox(-0.5F, -0.2F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.4F, 5.1714F, 0.9942F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r436 = lowerleg2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(93, 13).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4F, 5.3708F, 0.0142F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r437 = lowerleg2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(28, 91).addBox(-0.5F, -5.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.4F, 7.5328F, 0.944F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r438 = lowerleg2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(84, 52).addBox(-1.0F, -1.5F, -0.325F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.109F)), PartPose.offsetAndRotation(0.5F, 2.2199F, 0.651F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r439 = lowerleg2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(45, 82).addBox(-3.9F, 0.0F, 0.4F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.096F))
				.texOffs(82, 21).addBox(-3.9F, 0.0F, 0.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.4F, 6.2328F, -0.431F, 0.0524F, 0.0F, 0.0F));

		PartDefinition feet2 = lowerleg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(33, 60).addBox(-2.0F, -0.9979F, 0.3761F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 9.4363F, 0.7332F, -0.8817F, 0.0F, 0.0F));

		PartDefinition cube_r440 = feet2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(91, 52).addBox(-1.0F, -1.0F, -1.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0979F, 0.8761F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r441 = feet2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(70, 77).addBox(-1.0F, -2.5F, -0.45F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5021F, 0.4761F, 0.2182F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9702F, 1.4114F, 1.5727F, 0.0F, 0.0F));

		PartDefinition bone2 = basin.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3163F, 5.0672F, 0.0452F, 0.0F, -0.0087F, 0.0524F));

		PartDefinition cube_r442 = bone2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(89, 35).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -3.7348F, 2.5558F, 0.0522F, -0.0443F, -0.0542F));

		PartDefinition cube_r443 = bone2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(106, 71).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, -4.8165F, 3.3558F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r444 = bone2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(106, 48).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -3.7021F, 4.2265F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r445 = bone2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(111, 83).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -4.872F, 1.9187F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r446 = bone2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(57, 99).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -4.5148F, 1.4729F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r447 = bone2.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(106, 77).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -4.8219F, -1.5688F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r448 = bone2.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, -4.9974F, -0.995F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r449 = bone2.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(23, 109).addBox(-0.5F, -0.525F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -4.4713F, -0.8746F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r450 = bone2.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(88, 111).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.6701F, 1.8141F, 3.2164F, -0.8692F, 0.0405F, 0.2745F));

		PartDefinition cube_r451 = bone2.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(111, 86).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.687F, 1.7843F, 2.6173F, -0.0402F, 0.0405F, 0.2745F));

		PartDefinition cube_r452 = bone2.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(23, 82).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.2843F, 0.068F, 0.7036F, 0.7888F, 0.0405F, 0.2745F));

		PartDefinition cube_r453 = bone2.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(79, 97).addBox(-0.5F, -2.0F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1725F, -0.2328F, 1.3443F, 0.4136F, 0.0405F, 0.2745F));

		PartDefinition cube_r454 = bone2.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(71, 111).addBox(-0.8227F, 4.3556F, 3.2166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2298F, -2.5877F, -2.4981F, -1.2452F, 0.0069F, 0.2743F));

		PartDefinition cube_r455 = bone2.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(106, 25).addBox(-0.8227F, -0.3486F, 5.2716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2298F, -2.5877F, -2.4981F, -2.1179F, 0.0069F, 0.2743F));

		PartDefinition cube_r456 = bone2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(110, 74).addBox(-0.8227F, 4.6901F, -0.1728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2298F, -2.5877F, -2.4981F, -0.6343F, 0.0069F, 0.2743F));

		PartDefinition cube_r457 = bone2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(80, 92).addBox(-0.8227F, 2.0843F, 0.0405F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2298F, -2.5877F, -2.4981F, -0.678F, 0.0069F, 0.2743F));

		PartDefinition cube_r458 = bone2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(109, 67).addBox(-0.8227F, -0.6919F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 45).addBox(-0.8227F, -1.2919F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(18, 107).addBox(-0.8227F, -1.2919F, 0.0479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.2298F, -2.5877F, -2.4981F, -1.7688F, 0.0069F, 0.2743F));

		PartDefinition cube_r459 = bone2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(48, 97).addBox(-0.8227F, -0.8516F, 0.5857F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2298F, -2.5877F, -2.4981F, -1.3325F, 0.0069F, 0.2743F));

		PartDefinition cube_r460 = bone2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(92, 93).addBox(-0.8227F, -0.388F, -0.4738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2298F, -2.5877F, -2.4981F, -0.4598F, 0.0069F, 0.2743F));

		PartDefinition cube_r461 = bone2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(56, 88).addBox(-0.5F, -2.175F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4152F, 0.7515F, 2.1649F, 0.8936F, 0.0405F, 0.2745F));

		PartDefinition cube_r462 = bone2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(83, 43).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7373F, -2.5487F, 1.2124F, 1.1257F, 0.0F, 0.2793F));

		PartDefinition cube_r463 = bone2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(16, 82).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5837F, -3.0842F, -1.517F, -0.5323F, 0.0F, 0.2793F));

		PartDefinition cube_r464 = bone2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(84, 5).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6605F, -2.8164F, -0.1523F, 0.1658F, 0.0F, 0.2793F));

		PartDefinition bone4 = basin.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9163F, 5.0672F, 0.0452F, 0.0F, 0.0087F, -0.0524F));

		PartDefinition cube_r465 = bone4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(89, 35).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.7348F, 2.5558F, 0.0522F, 0.0443F, 0.0542F));

		PartDefinition cube_r466 = bone4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(106, 71).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.8165F, 3.3558F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r467 = bone4.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(106, 48).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -3.7021F, 4.2265F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r468 = bone4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(111, 83).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.872F, 1.9187F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r469 = bone4.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(57, 99).mirror().addBox(-0.5F, -1.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.5148F, 1.4729F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(106, 77).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.8219F, -1.5688F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.9974F, -0.995F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(23, 109).mirror().addBox(-0.5F, -0.525F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, -4.4713F, -0.8746F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r473 = bone4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(88, 111).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.6701F, 1.8141F, 3.2164F, -0.8692F, -0.0405F, -0.2745F));

		PartDefinition cube_r474 = bone4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(111, 86).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.687F, 1.7843F, 2.6173F, -0.0402F, -0.0405F, -0.2745F));

		PartDefinition cube_r475 = bone4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(23, 82).mirror().addBox(-0.5F, -2.2F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(1.2843F, 0.068F, 0.7036F, 0.7888F, -0.0405F, -0.2745F));

		PartDefinition cube_r476 = bone4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(79, 97).mirror().addBox(-0.5F, -2.0F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.1725F, -0.2328F, 1.3443F, 0.4136F, -0.0405F, -0.2745F));

		PartDefinition cube_r477 = bone4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(71, 111).mirror().addBox(-0.1773F, 4.3556F, 3.2166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.2298F, -2.5877F, -2.4981F, -1.2452F, -0.0069F, -0.2743F));

		PartDefinition cube_r478 = bone4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(106, 25).mirror().addBox(-0.1773F, -0.3486F, 5.2716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2298F, -2.5877F, -2.4981F, -2.1179F, -0.0069F, -0.2743F));

		PartDefinition cube_r479 = bone4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(110, 74).mirror().addBox(-0.1773F, 4.6901F, -0.1728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.2298F, -2.5877F, -2.4981F, -0.6343F, -0.0069F, -0.2743F));

		PartDefinition cube_r480 = bone4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(80, 92).mirror().addBox(-0.1773F, 2.0843F, 0.0405F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2298F, -2.5877F, -2.4981F, -0.678F, -0.0069F, -0.2743F));

		PartDefinition cube_r481 = bone4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(109, 67).mirror().addBox(-0.1773F, -0.6919F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 45).mirror().addBox(-0.1773F, -1.2919F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(18, 107).mirror().addBox(-0.1773F, -1.2919F, 0.0479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(0.2298F, -2.5877F, -2.4981F, -1.7688F, -0.0069F, -0.2743F));

		PartDefinition cube_r482 = bone4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(48, 97).mirror().addBox(-0.1773F, -0.8516F, 0.5857F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2298F, -2.5877F, -2.4981F, -1.3325F, -0.0069F, -0.2743F));

		PartDefinition cube_r483 = bone4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-0.1773F, -0.388F, -0.4738F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.2298F, -2.5877F, -2.4981F, -0.4598F, -0.0069F, -0.2743F));

		PartDefinition cube_r484 = bone4.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(56, 88).mirror().addBox(-0.5F, -2.175F, -0.225F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4152F, 0.7515F, 2.1649F, 0.8936F, -0.0405F, -0.2745F));

		PartDefinition cube_r485 = bone4.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7373F, -2.5487F, 1.2124F, 1.1257F, 0.0F, -0.2793F));

		PartDefinition cube_r486 = bone4.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(16, 82).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5837F, -3.0842F, -1.517F, -0.5323F, 0.0F, -0.2793F));

		PartDefinition cube_r487 = bone4.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(84, 5).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.6605F, -2.8164F, -0.1523F, 0.1658F, 0.0F, -0.2793F));

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