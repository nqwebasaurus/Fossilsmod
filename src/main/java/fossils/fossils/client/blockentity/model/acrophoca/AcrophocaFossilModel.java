package fossils.fossils.client.blockentity.model.acrophoca;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcrophocaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart hips;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart leftarm4;
	private final ModelPart leftarm5;
	private final ModelPart leftArm6;
	private final ModelPart rightarm4;
	private final ModelPart rightarm5;
	private final ModelPart rightArm6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body5;
	private final ModelPart body7;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart bone;

	public AcrophocaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.hips = this.body4.getChild("hips");
		this.bone4 = this.hips.getChild("bone4");
		this.bone2 = this.hips.getChild("bone2");
		this.leftarm4 = this.hips.getChild("leftarm4");
		this.leftarm5 = this.leftarm4.getChild("leftarm5");
		this.leftArm6 = this.leftarm5.getChild("leftArm6");
		this.rightarm4 = this.hips.getChild("rightarm4");
		this.rightarm5 = this.rightarm4.getChild("rightarm5");
		this.rightArm6 = this.rightarm5.getChild("rightArm6");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body5 = this.body4.getChild("body5");
		this.body7 = this.body4.getChild("body7");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone3 = this.chest.getChild("bone3");
		this.bone5 = this.chest.getChild("bone5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
		this.bone = this.neck2.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.9747F, -7.9122F, -0.5738F, 1.2116F, -0.5442F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(5, 78).addBox(0.0F, -1.1912F, 0.0459F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2146F, -2.0706F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 4).addBox(0.0F, -1.4274F, -1.0655F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2847F, -2.8862F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 23).mirror().addBox(-1.4427F, -1.2605F, -2.8632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8631F, 4.849F, 0.3311F, 0.0924F, 0.2283F, 0.573F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 39).mirror().addBox(-2.779F, -0.3708F, -0.8241F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8631F, 4.849F, 0.3311F, -0.048F, 0.1399F, 0.3739F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 23).mirror().addBox(-2.602F, -0.5893F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9649F, -3.435F, -0.4303F, 0.4147F, -1.3503F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-1.7664F, 0.0895F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9649F, -3.435F, -0.2292F, 0.5469F, -0.9216F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-0.7171F, 0.2848F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9649F, -3.435F, -0.0634F, 0.5854F, -0.6144F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-1.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, 0.1221F, 0.3968F, -0.2462F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 78).mirror().addBox(-2.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, 0.0093F, 0.4141F, -0.5306F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 13).mirror().addBox(-3.8796F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, -0.1617F, 0.383F, -0.9654F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(43, 80).mirror().addBox(-3.6883F, -3.1031F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, -0.3326F, 0.2516F, -1.5F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 78).addBox(-0.2829F, 0.2848F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9649F, -3.435F, -0.0634F, -0.5854F, 0.6144F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 78).addBox(0.7664F, 0.0895F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9649F, -3.435F, -0.2292F, -0.5469F, 0.9216F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(78, 23).addBox(1.602F, -0.5893F, -0.111F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9649F, -3.435F, -0.4303F, -0.4147F, 1.3503F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(14, 39).addBox(-0.221F, -0.3708F, -0.8241F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8631F, 4.849F, 0.3311F, -0.048F, -0.1399F, -0.3739F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(53, 23).addBox(-0.5573F, -1.2605F, -2.8632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8631F, 4.849F, 0.3311F, 0.0924F, -0.2283F, -0.573F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 14).addBox(-1.3631F, -0.7265F, -4.952F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8631F, 5.149F, 1.7311F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 5).addBox(-0.5F, -0.475F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.33F, -4.1393F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 38).addBox(0.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, 0.1221F, -0.3968F, 0.2462F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(43, 78).addBox(1.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, 0.0093F, -0.4141F, 0.5306F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 13).addBox(1.8797F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, -0.1617F, -0.383F, 0.9654F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 80).addBox(2.6883F, -3.1031F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.436F, -1.4129F, -0.3326F, -0.2516F, 1.5F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(13, 20).addBox(-0.5F, -0.2553F, -0.0229F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8854F, -3.7706F, 0.3578F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.0389F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(35, 15).mirror().addBox(-3.3F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5058F, 6.0001F, 0.2948F, -0.4298F, 0.3174F, 0.4659F));

		PartDefinition cube_r25 = body6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(36, 31).mirror().addBox(-3.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4054F, 7.1189F, 1.9421F, -0.0745F, 0.3061F, 0.5702F));

		PartDefinition cube_r26 = body6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-1.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.1801F, 0.3087F, -0.3514F));

		PartDefinition cube_r27 = body6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(-2.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.2541F, 0.252F, -0.6175F));

		PartDefinition cube_r28 = body6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-3.8796F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.3305F, 0.1348F, -1.009F));

		PartDefinition cube_r29 = body6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 23).mirror().addBox(-5.6883F, -3.103F, -0.5891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.3533F, -0.0444F, -1.5022F));

		PartDefinition cube_r30 = body6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-3.8796F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.3584F, 0.0904F, -1.0122F));

		PartDefinition cube_r31 = body6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-2.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.2979F, 0.2214F, -0.6277F));

		PartDefinition cube_r32 = body6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(-4.6883F, -3.103F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.3569F, -0.0966F, -1.5019F));

		PartDefinition cube_r33 = body6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(79, 27).mirror().addBox(-1.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.2314F, 0.2903F, -0.3665F));

		PartDefinition cube_r34 = body6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(79, 27).addBox(0.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.2314F, -0.2903F, 0.3665F));

		PartDefinition cube_r35 = body6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 58).addBox(2.6883F, -3.103F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.3569F, 0.0966F, 1.5019F));

		PartDefinition cube_r36 = body6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 79).addBox(1.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.2979F, -0.2214F, 0.6277F));

		PartDefinition cube_r37 = body6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(58, 0).addBox(1.8797F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 0.326F, -0.3584F, -0.0904F, 1.0122F));

		PartDefinition cube_r38 = body6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 80).addBox(0.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.1801F, -0.3087F, 0.3514F));

		PartDefinition cube_r39 = body6.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(80, 21).addBox(1.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.2541F, -0.252F, 0.6175F));

		PartDefinition cube_r40 = body6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(57, 54).addBox(1.8797F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.3305F, -0.1348F, 1.009F));

		PartDefinition cube_r41 = body6.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(44, 23).addBox(2.6883F, -3.103F, -0.5891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1185F, 2.326F, -0.3533F, 0.0444F, 1.5022F));

		PartDefinition cube_r42 = body6.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(24, 12).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1921F, 1.0781F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(7, 27).addBox(0.0F, -1.3127F, -0.0015F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.541F, -0.0173F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body6.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 80).addBox(0.0F, -1.086F, -0.1002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.541F, 2.0827F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body6.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(24, 20).addBox(-1.0F, -0.9785F, -4.0694F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.8278F, 2.4341F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(36, 31).addBox(-0.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4054F, 7.1189F, 1.9421F, -0.0745F, -0.3061F, -0.5702F));

		PartDefinition cube_r47 = body6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(35, 15).addBox(-0.7F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5058F, 6.0001F, 0.2948F, -0.4298F, -0.3174F, -0.4659F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.186F, 3.9776F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 0).addBox(0.0F, -1.3614F, 0.0209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5176F, 1.7437F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(79, 51).addBox(0.0F, -1.2519F, -0.1409F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4326F, -0.0516F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 21).addBox(-1.1135F, -0.938F, 0.0337F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6135F, 8.0857F, -0.4393F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 25).mirror().addBox(-4.1204F, -1.1667F, -0.6187F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.234F, 0.2817F, -0.989F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-2.4693F, -0.2394F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.1028F, 0.35F, -0.5725F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-1.4812F, 0.149F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.0047F, 0.3642F, -0.2933F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 33).mirror().addBox(-3.8F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1903F, 7.7926F, 0.9083F, 0.0223F, 0.3319F, 0.4179F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2672F, 8.1478F, 2.9766F, 0.0799F, 0.3142F, 0.6013F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(32, 39).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1224F, 2.3996F, 1.6427F, -0.3413F, 0.1297F, -1.5017F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-2.4693F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5326F, 2.3484F, -0.1028F, 0.35F, -0.5725F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1224F, 2.0996F, 3.6427F, -0.3413F, 0.1297F, -1.5017F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(-4.1204F, -1.1667F, -0.6186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5326F, 2.3484F, -0.234F, 0.2817F, -0.989F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(8, 80).mirror().addBox(-1.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5326F, 2.3484F, -0.0047F, 0.3642F, -0.2933F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(14, 32).mirror().addBox(-5.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2672F, 8.1478F, 2.9766F, 0.1293F, 0.7014F, 0.6869F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(24, 18).mirror().addBox(-6.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2672F, 8.1478F, 2.9766F, 0.2199F, 0.8269F, 0.8157F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(24, 18).addBox(0.4F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2672F, 8.1478F, 2.9766F, 0.2199F, -0.8269F, -0.8157F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(14, 32).addBox(0.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2672F, 8.1478F, 2.9766F, 0.1293F, -0.7014F, -0.6869F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(39, 17).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2672F, 8.1478F, 2.9766F, 0.0799F, -0.3142F, -0.6013F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(36, 33).addBox(-0.2F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1903F, 7.7926F, 0.9083F, 0.0223F, -0.3319F, -0.4179F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(8, 80).addBox(0.4812F, 0.149F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5326F, 2.3484F, -0.0047F, -0.3642F, 0.2933F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(56, 42).addBox(2.1204F, -1.1667F, -0.6186F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5326F, 2.3484F, -0.234F, -0.2817F, 0.989F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1224F, 2.0996F, 3.6427F, -0.3413F, -0.1297F, 1.5017F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 80).addBox(1.4692F, -0.2394F, -0.6186F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5326F, 2.3484F, -0.1028F, -0.35F, 0.5725F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(79, 46).addBox(0.4812F, 0.149F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.0047F, -0.3642F, 0.2933F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 44).addBox(1.4692F, -0.2394F, -0.6187F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.1028F, -0.35F, 0.5725F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(32, 39).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1224F, 2.3996F, 1.6427F, -0.3413F, -0.1297F, 1.5017F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(56, 25).addBox(2.1204F, -1.1667F, -0.6187F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2326F, 0.3484F, -0.234F, -0.2817F, 0.989F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(22, 6).addBox(-0.5F, -1.0F, -9.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4433F, 8.9202F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9334F, 3.6148F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 80).addBox(0.0F, -0.7804F, -0.0509F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4296F, 2.1044F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(48, 80).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0296F, 0.6044F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-1.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.0225F, 0.3591F, -0.2997F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-2.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.1184F, 0.3405F, -0.5777F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(57, 15).mirror().addBox(-3.8796F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.244F, 0.2671F, -0.9917F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(11, 41).mirror().addBox(-6.6883F, -3.103F, -0.5891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.3425F, 0.1123F, -1.5018F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 19).mirror().addBox(-2.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.1947F, 0.292F, -0.6015F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(42, 29).mirror().addBox(-5.6883F, -3.103F, -0.5891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.3485F, 0.0252F, -1.5022F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(-3.8796F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.2926F, 0.1938F, -1.0028F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-1.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.1107F, 0.332F, -0.3295F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 12).addBox(0.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.1107F, -0.332F, 0.3295F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(41, 57).addBox(1.8797F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.2926F, -0.1938F, 1.0028F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(42, 29).addBox(2.6883F, -3.103F, -0.5891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.3485F, -0.0252F, 1.5022F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(80, 19).addBox(1.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9008F, 2.2336F, -0.1947F, -0.292F, 0.6015F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(80, 8).addBox(0.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.0225F, -0.3591F, 0.2997F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(80, 10).addBox(1.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.1184F, -0.3405F, 0.5777F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 15).addBox(1.8797F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.244F, -0.2671F, 0.9917F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(11, 41).addBox(2.6883F, -3.103F, -0.5891F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6008F, 0.2336F, -0.3425F, -0.1123F, 1.5018F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(14, 34).addBox(-0.5F, -0.1512F, 7.7474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4624F, -7.5423F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0994F, 2.7653F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(80, 55).addBox(0.0F, -1.4F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.1F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(51, 28).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-2.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, 0.0424F, 0.4315F, -0.517F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(48, 78).mirror().addBox(-1.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, 0.159F, 0.405F, -0.2318F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 3).mirror().addBox(-3.8796F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, -0.1401F, 0.4116F, -0.957F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-4.6883F, -3.103F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, -0.33F, 0.2864F, -1.4993F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-3.8796F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, -0.1401F, 0.4116F, -0.957F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-3.6883F, -3.103F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, -0.33F, 0.2864F, -1.4993F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(-1.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, 0.159F, 0.405F, -0.2318F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-2.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, 0.0424F, 0.4315F, -0.517F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(30, 80).addBox(1.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, 0.0424F, -0.4315F, 0.517F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(79, 25).addBox(0.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, 0.159F, -0.405F, 0.2318F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 80).addBox(2.6883F, -3.103F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, -0.33F, -0.2864F, 1.4993F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(54, 46).addBox(1.8797F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 3.3683F, -0.1401F, -0.4116F, 0.957F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(80, 17).addBox(1.3166F, -0.496F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, 0.0424F, -0.4315F, 0.517F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(48, 78).addBox(0.4001F, -0.1383F, -0.5891F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, 0.159F, -0.405F, 0.2318F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(56, 3).addBox(1.8797F, -1.3432F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, -0.1401F, -0.4116F, 0.957F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 48).addBox(2.6883F, -3.103F, -0.5891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0014F, 1.3683F, -0.33F, -0.2864F, 1.4993F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(11, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(80, 70).addBox(0.0F, -1.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.2991F, -0.1251F, 0.0385F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 80).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 3.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r115 = body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 4.0F, 0.0F, -0.2182F, -0.4363F));

		PartDefinition cube_r116 = body4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(78, 15).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 4.0F, 0.0F, 0.2182F, 0.4363F));

		PartDefinition cube_r117 = body4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(35, 80).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.4363F));

		PartDefinition hips = body4.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2813F, 10.8351F, 0.4084F, -0.4457F, -0.1844F));

		PartDefinition cube_r118 = hips.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(31, 52).addBox(0.0F, -0.5986F, 3.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 80).addBox(0.0F, -0.7986F, 1.0389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 78).mirror().addBox(-1.5F, 0.4014F, 1.0389F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 78).addBox(0.5F, 0.4014F, 1.0389F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 26).addBox(-0.5F, -0.0986F, 0.0389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.4473F, 0.1279F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3051F, 1.1682F, 1.5735F, 0.1369F, -0.1699F, 0.2387F));

		PartDefinition cube_r119 = bone4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 52).addBox(-0.5F, -0.7F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1684F, -0.1329F, -0.4046F, -0.7434F, -0.0261F, 0.0282F));

		PartDefinition cube_r120 = bone4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(47, 44).addBox(-0.5052F, -0.9835F, -0.2337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F))
				.texOffs(65, 74).addBox(-0.5052F, -1.5835F, 0.7663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1324F, -1.1094F, -0.5287F, 1.6958F, -0.474F, 0.4679F));

		PartDefinition cube_r121 = bone4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(47, 31).addBox(-0.5052F, 0.0506F, -1.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1324F, -1.1094F, -0.5287F, -1.2713F, -0.474F, 0.4679F));

		PartDefinition cube_r122 = bone4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(70, 74).addBox(-0.5052F, -1.8616F, -0.495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1324F, -1.1094F, -0.5287F, 0.9104F, -0.474F, 0.4679F));

		PartDefinition cube_r123 = bone4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 74).addBox(-0.5052F, 0.9157F, -0.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1324F, -1.1094F, -0.5287F, -2.7548F, -0.474F, 0.4679F));

		PartDefinition cube_r124 = bone4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 74).addBox(-0.5052F, 0.69F, -1.0862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1324F, -1.1094F, -0.5287F, -2.3621F, -0.474F, 0.4679F));

		PartDefinition cube_r125 = bone4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(14, 47).addBox(-0.5052F, -0.3068F, -1.4514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.1324F, -1.1094F, -0.5287F, -1.4895F, -0.474F, 0.4679F));

		PartDefinition cube_r126 = bone4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 48).addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1684F, -0.1329F, -0.4046F, -0.9616F, -0.0261F, 0.0282F));

		PartDefinition cube_r127 = bone4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(21, 48).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2219F, 1.561F, -0.1861F, -1.0837F, -0.0261F, 0.0282F));

		PartDefinition cube_r128 = bone4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(76, 61).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2449F, 1.9855F, 0.2373F, -2.3578F, -0.0261F, 0.0282F));

		PartDefinition cube_r129 = bone4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(76, 58).addBox(-0.5F, 0.125F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.2677F, 2.3714F, 0.6962F, -2.9687F, -0.0261F, 0.0282F));

		PartDefinition cube_r130 = bone4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(76, 41).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2677F, 2.3714F, 0.6962F, 2.4418F, -0.0261F, 0.0282F));

		PartDefinition cube_r131 = bone4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(76, 29).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2779F, 2.2016F, 1.2716F, 1.8572F, -0.0261F, 0.0282F));

		PartDefinition cube_r132 = bone4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(15, 76).addBox(-0.5F, -0.8F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(75, 74).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2614F, 1.3487F, 1.5584F, 1.2463F, -0.0261F, 0.0282F));

		PartDefinition cube_r133 = bone4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(75, 68).addBox(-0.5F, -0.8F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2503F, 1.0492F, 1.4575F, 1.9444F, -0.0261F, 0.0282F));

		PartDefinition cube_r134 = bone4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 71).addBox(-0.5F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2184F, 0.5501F, 0.772F, 0.1555F, -0.0261F, 0.0282F));

		PartDefinition cube_r135 = bone4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 75).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2153F, 0.1004F, 1.1433F, 1.4208F, -0.0261F, 0.0282F));

		PartDefinition cube_r136 = bone4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(45, 75).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2153F, 0.1004F, 1.1433F, 0.4173F, -0.0261F, 0.0282F));

		PartDefinition cube_r137 = bone4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(40, 75).addBox(-0.5F, -0.05F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2214F, -0.2405F, 1.7448F, -0.1936F, -0.0261F, 0.0282F));

		PartDefinition cube_r138 = bone4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(35, 20).addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1757F, -0.3826F, 0.1453F, -0.4554F, -0.0261F, 0.0282F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3051F, 1.1682F, 1.5735F, 0.1369F, 0.1699F, -0.2387F));

		PartDefinition cube_r139 = bone2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 52).mirror().addBox(-0.5F, -0.7F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1684F, -0.1329F, -0.4046F, -0.7434F, 0.0261F, -0.0282F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(47, 44).mirror().addBox(-0.4948F, -0.9835F, -0.2337F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(65, 74).mirror().addBox(-0.4948F, -1.5835F, 0.7663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1324F, -1.1094F, -0.5287F, 1.6958F, 0.474F, -0.4679F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-0.4948F, 0.0506F, -1.1004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1324F, -1.1094F, -0.5287F, -1.2713F, 0.474F, -0.4679F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 74).mirror().addBox(-0.4948F, -1.8616F, -0.495F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.1324F, -1.1094F, -0.5287F, 0.9104F, 0.474F, -0.4679F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(-0.4948F, 0.9157F, -0.4486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.1324F, -1.1094F, -0.5287F, -2.7548F, 0.474F, -0.4679F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 74).mirror().addBox(-0.4948F, 0.69F, -1.0862F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1324F, -1.1094F, -0.5287F, -2.3621F, 0.474F, -0.4679F));

		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(14, 47).mirror().addBox(-0.4948F, -0.3068F, -1.4514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.1324F, -1.1094F, -0.5287F, -1.4895F, 0.474F, -0.4679F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(40, 48).mirror().addBox(-0.5F, -0.2F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1684F, -0.1329F, -0.4046F, -0.9616F, 0.0261F, -0.0282F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2219F, 1.561F, -0.1861F, -1.0837F, 0.0261F, -0.0282F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2449F, 1.9855F, 0.2373F, -2.3578F, 0.0261F, -0.0282F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(76, 58).mirror().addBox(-0.5F, 0.125F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.2677F, 2.3714F, 0.6962F, -2.9687F, 0.0261F, -0.0282F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(76, 41).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2677F, 2.3714F, 0.6962F, 2.4418F, 0.0261F, -0.0282F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2779F, 2.2016F, 1.2716F, 1.8572F, 0.0261F, -0.0282F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.5F, -0.8F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(75, 74).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2614F, 1.3487F, 1.5584F, 1.2463F, 0.0261F, -0.0282F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-0.5F, -0.8F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 1.0492F, 1.4575F, 1.9444F, 0.0261F, -0.0282F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(75, 71).mirror().addBox(-0.5F, -0.2F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2184F, 0.5501F, 0.772F, 0.1555F, 0.0261F, -0.0282F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2153F, 0.1004F, 1.1433F, 1.4208F, 0.0261F, -0.0282F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 75).mirror().addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.2153F, 0.1004F, 1.1433F, 0.4173F, 0.0261F, -0.0282F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 75).mirror().addBox(-0.5F, -0.05F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2214F, -0.2405F, 1.7448F, -0.1936F, 0.0261F, -0.0282F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(35, 20).mirror().addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1757F, -0.3826F, 0.1453F, -0.4554F, 0.0261F, -0.0282F));

		PartDefinition leftarm4 = hips.addOrReplaceChild("leftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1627F, 0.7971F, 1.3018F, -0.8733F, 0.1321F, -0.8902F));

		PartDefinition cube_r159 = leftarm4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(75, 55).addBox(-0.1F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.8767F, 0.4727F, 0.6684F, 0.2499F, 0.2065F, -0.6733F));

		PartDefinition cube_r160 = leftarm4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(77, 48).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(77, 35).addBox(0.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4767F, -0.4273F, 1.2684F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r161 = leftarm4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(70, 77).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.023F, 0.92F, 0.0928F, 0.7155F, 0.0014F, -0.001F));

		PartDefinition cube_r162 = leftarm4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(58, 17).addBox(-0.5F, -1.2F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0264F, 1.8106F, 1.9295F, 2.4434F, 0.0014F, -0.001F));

		PartDefinition cube_r163 = leftarm4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(57, 50).addBox(-0.011F, -0.5746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4662F, 0.9306F, 0.0291F, 0.794F, 0.0014F, -0.001F));

		PartDefinition leftarm5 = leftarm4.addOrReplaceChild("leftarm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1452F, 1.7344F, 1.8976F, 1.5034F, -0.6362F, 0.5114F));

		PartDefinition cube_r164 = leftarm5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(56, 60).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2004F, 0.8326F, 0.9841F, 1.5708F, 0.3142F, -1.5708F));

		PartDefinition cube_r165 = leftarm5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(40, 41).addBox(-0.3F, -0.7F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2004F, 3.2293F, 1.1097F, 1.5708F, 0.0524F, -1.5708F));

		PartDefinition cube_r166 = leftarm5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(22, 41).addBox(-2.7F, -0.1F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3004F, 3.1979F, 0.5106F, 1.5708F, -0.0524F, -1.5708F));

		PartDefinition cube_r167 = leftarm5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(10, 62).addBox(0.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(61, 44).addBox(0.1F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.3004F, 1.1764F, 0.0618F, 1.5708F, -0.288F, -1.5708F));

		PartDefinition cube_r168 = leftarm5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(10, 71).addBox(-0.825F, 0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(25, 72).addBox(-0.825F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(-0.3004F, 1.6655F, -0.6389F, 1.5708F, 1.5184F, -1.5708F));

		PartDefinition cube_r169 = leftarm5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(49, 3).addBox(-0.125F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.3004F, 2.3651F, -0.6144F, 1.5708F, -0.1833F, -1.5708F));

		PartDefinition cube_r170 = leftarm5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 71).addBox(-0.125F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.3004F, 2.3651F, -0.6144F, 1.5708F, 0.0873F, -1.5708F));

		PartDefinition cube_r171 = leftarm5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(50, 69).addBox(-0.125F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(-0.3004F, 3.0534F, -0.4869F, 1.5708F, -1.3875F, -1.5708F));

		PartDefinition cube_r172 = leftarm5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(47, 48).addBox(-0.1476F, -1.667F, -0.501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.3014F, 4.5408F, -0.1882F, 1.5708F, -1.3875F, -1.5708F));

		PartDefinition leftArm6 = leftarm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3874F, 5.7262F, 0.8643F, -0.0744F, 0.001F, -0.1323F));

		PartDefinition cube_r173 = leftArm6.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -2.0F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm4 = hips.addOrReplaceChild("rightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1627F, 0.7971F, 1.3018F, -0.8733F, -0.1321F, 0.8902F));

		PartDefinition cube_r174 = rightarm4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 77).addBox(-0.9F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.8767F, 0.4727F, 0.6684F, 0.2499F, -0.2065F, 0.6733F));

		PartDefinition cube_r175 = rightarm4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(60, 77).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(55, 77).addBox(-1.0F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4767F, -0.4273F, 1.2684F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r176 = rightarm4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(75, 77).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.023F, 0.92F, 0.0928F, 0.7155F, -0.0014F, 0.001F));

		PartDefinition cube_r177 = rightarm4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(59, 27).addBox(-0.5F, -1.2F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0264F, 1.8106F, 1.9295F, 2.4434F, -0.0014F, 0.001F));

		PartDefinition cube_r178 = rightarm4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(58, 9).addBox(-0.989F, -0.5746F, -0.0311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4662F, 0.9306F, 0.0291F, 0.794F, -0.0014F, 0.001F));

		PartDefinition rightarm5 = rightarm4.addOrReplaceChild("rightarm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1452F, 1.7344F, 1.8976F, 1.5034F, 0.6362F, -0.5114F));

		PartDefinition cube_r179 = rightarm5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(61, 31).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2004F, 0.8326F, 0.9841F, 1.5708F, -0.3142F, 1.5708F));

		PartDefinition cube_r180 = rightarm5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(42, 0).addBox(-2.7F, -0.7F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2004F, 3.2293F, 1.1097F, 1.5708F, -0.0524F, 1.5708F));

		PartDefinition cube_r181 = rightarm5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(31, 41).addBox(-0.3F, -0.1F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3004F, 3.1979F, 0.5106F, 1.5708F, 0.0524F, 1.5708F));

		PartDefinition cube_r182 = rightarm5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(22, 63).addBox(-1.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(63, 17).addBox(-1.1F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3004F, 1.1764F, 0.0618F, 1.5708F, 0.288F, 1.5708F));

		PartDefinition cube_r183 = rightarm5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(72, 35).addBox(-0.175F, 0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(35, 72).addBox(-0.175F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.3004F, 1.6655F, -0.6389F, 1.5708F, -1.5184F, 1.5708F));

		PartDefinition cube_r184 = rightarm5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(51, 0).addBox(-1.875F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.3004F, 2.3651F, -0.6144F, 1.5708F, 0.1833F, 1.5708F));

		PartDefinition cube_r185 = rightarm5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 32).addBox(-0.875F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3004F, 2.3651F, -0.6144F, 1.5708F, -0.0873F, 1.5708F));

		PartDefinition cube_r186 = rightarm5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(70, 20).addBox(-0.875F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.3004F, 3.0534F, -0.4869F, 1.5708F, 1.3875F, 1.5708F));

		PartDefinition cube_r187 = rightarm5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(35, 50).addBox(-0.8524F, -1.667F, -0.501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3014F, 4.5408F, -0.1882F, 1.5708F, 1.3875F, 1.5708F));

		PartDefinition rightArm6 = rightarm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3874F, 5.7262F, 0.8643F, -0.0744F, -0.001F, 0.1323F));

		PartDefinition cube_r188 = rightArm6.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(11, 0).addBox(0.0F, -2.0F, -2.0F, 0.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 10).addBox(-0.5F, -0.3902F, -0.0618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(17, 58).addBox(0.0F, -0.6902F, 0.9382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.491F, 3.6799F, -0.6109F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(7, 43).addBox(-0.5F, -0.3994F, -0.0157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.0057F, 2.7985F, 0.0785F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(42, 25).addBox(-0.5F, -0.4244F, -0.0278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0321F, 1.9299F, 0.1658F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(60, 80).addBox(0.0F, -1.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 80).addBox(0.0F, -1.325F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r189 = body5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(-0.4F, 0.1F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2789F, 0.2529F, 1.3562F, 0.1283F, -0.0884F, -0.4192F));

		PartDefinition cube_r190 = body5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(-0.8F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.854F, -0.1239F, 3.5213F, 0.1255F, -0.0239F, -0.2349F));

		PartDefinition cube_r191 = body5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(54, 44).addBox(-1.2F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.854F, -0.1239F, 3.5213F, 0.1255F, 0.0239F, 0.2349F));

		PartDefinition cube_r192 = body5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(54, 32).addBox(-1.6F, 0.1F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2789F, 0.2529F, 1.3562F, 0.1283F, 0.0884F, 0.4192F));

		PartDefinition body7 = body4.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(80, 67).addBox(0.0F, -1.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1396F, 7.9976F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(51, 21).mirror().addBox(-0.4F, 0.1F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2789F, 0.2529F, 1.3562F, 0.1283F, -0.0884F, -0.4192F));

		PartDefinition cube_r194 = body7.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(51, 21).addBox(-1.6F, 0.1F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2789F, 0.2529F, 1.3562F, 0.1283F, 0.0884F, 0.4192F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7098F, 2.5976F, -1.2902F, 0.4013F, 0.215F, -0.1353F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(64, 47).addBox(-0.1F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.8767F, 0.4727F, 0.6684F, 0.2499F, 0.2065F, -0.6733F));

		PartDefinition cube_r196 = leftarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(61, 59).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(51, 60).addBox(0.0F, -0.2F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4767F, -0.4273F, 1.2684F, 0.3228F, 0.0014F, -0.001F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(32, 63).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0214F, 0.0366F, -0.3863F, 0.0086F, 0.0014F, -0.001F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(64, 27).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0229F, 0.92F, 0.0928F, 0.4101F, 0.0014F, -0.001F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(27, 63).addBox(-0.5F, -0.575F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0241F, 1.6564F, 0.4053F, 0.8813F, 0.0014F, -0.001F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(63, 24).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(0.0246F, 1.9876F, 0.5472F, 1.5358F, 0.0014F, -0.001F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(70, 68).addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0274F, 1.9433F, 2.5168F, 0.8832F, -0.0667F, 0.0736F));

		PartDefinition cube_r202 = leftarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(45, 53).addBox(-0.0082F, -0.8326F, -0.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4662F, 1.8306F, 1.3291F, 1.2653F, 0.0014F, -0.001F));

		PartDefinition cube_r203 = leftarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(52, 52).addBox(-0.011F, -0.2746F, -0.2311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4662F, 0.9306F, 0.0291F, 0.9686F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3753F, 2.3937F, 2.6665F, -0.2118F, 0.1946F, 0.1214F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(14, 51).addBox(-3.3F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5764F, -0.4729F, 0.3301F, 1.5708F, 0.4276F, -1.5708F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(51, 9).addBox(-1.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.5764F, -0.4729F, 0.3301F, 1.5708F, 0.384F, -1.5708F));

		PartDefinition cube_r206 = leftarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5764F, -0.9222F, 0.7277F, 1.5708F, 0.8465F, -1.5708F));

		PartDefinition cube_r207 = leftarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 54).addBox(0.1F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5764F, -0.3186F, 0.6532F, 1.5708F, -0.288F, -1.5708F));

		PartDefinition cube_r208 = leftarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(26, 52).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5764F, 1.1732F, 0.8099F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r209 = leftarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(40, 72).addBox(-1.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 53).addBox(-0.8F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.1764F, 2.7698F, 1.5861F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition cube_r210 = leftarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 62).addBox(-0.0353F, -0.4763F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3236F, 2.9954F, 0.2336F, 1.5708F, -0.8203F, -1.5708F));

		PartDefinition cube_r211 = leftarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(10, 77).addBox(-0.725F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1764F, 2.5044F, 0.4625F, -1.5708F, -0.3229F, 1.5708F));

		PartDefinition cube_r212 = leftarm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(77, 64).addBox(-0.0736F, -0.2768F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3236F, 1.7954F, -0.2664F, 1.5708F, -1.2043F, -1.5708F));

		PartDefinition cube_r213 = leftarm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(31, 59).addBox(0.2014F, -0.4768F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.3236F, 1.7954F, -0.2664F, 1.5708F, -0.8901F, -1.5708F));

		PartDefinition cube_r214 = leftarm2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 58).addBox(-0.1335F, -0.5622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.3614F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2667F, 2.9803F, 1.471F, 0.9696F, -0.03F, 0.0837F));

		PartDefinition cube_r215 = leftArm3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -2.0F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7098F, 2.5976F, -1.2902F, 0.4013F, -0.215F, 0.1353F));

		PartDefinition cube_r216 = rightarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(70, 9).addBox(-0.9F, -0.0626F, -0.8451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.8767F, 0.4727F, 0.6684F, 0.2499F, -0.2065F, 0.6733F));

		PartDefinition cube_r217 = rightarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(63, 5).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(17, 61).addBox(-1.0F, -0.2F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4767F, -0.4273F, 1.2684F, 0.3228F, -0.0014F, 0.001F));

		PartDefinition cube_r218 = rightarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(15, 64).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.0214F, 0.0366F, -0.3863F, 0.0086F, -0.0014F, 0.001F));

		PartDefinition cube_r219 = rightarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(69, 53).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.0229F, 0.92F, 0.0928F, 0.4101F, -0.0014F, 0.001F));

		PartDefinition cube_r220 = rightarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 63).addBox(-0.5F, -0.575F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.0241F, 1.6564F, 0.4053F, 0.8813F, -0.0014F, 0.001F));

		PartDefinition cube_r221 = rightarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(47, 63).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-0.0246F, 1.9876F, 0.5472F, 1.5358F, -0.0014F, 0.001F));

		PartDefinition cube_r222 = rightarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(30, 72).addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0274F, 1.9433F, 2.5168F, 0.8832F, 0.0667F, -0.0736F));

		PartDefinition cube_r223 = rightarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(15, 54).addBox(-0.9918F, -0.8326F, -0.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4662F, 1.8306F, 1.3291F, 1.2653F, -0.0014F, 0.001F));

		PartDefinition cube_r224 = rightarm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(10, 54).addBox(-0.989F, -0.2746F, -0.2311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4662F, 0.9306F, 0.0291F, 0.9686F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3753F, 2.3937F, 2.6665F, -0.2118F, -0.1946F, -0.1214F));

		PartDefinition cube_r225 = rightarm2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(51, 18).addBox(1.3F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5764F, -0.4729F, 0.3301F, 1.5708F, -0.4276F, 1.5708F));

		PartDefinition cube_r226 = rightarm2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(51, 12).addBox(-0.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.5764F, -0.4729F, 0.3301F, 1.5708F, -0.384F, 1.5708F));

		PartDefinition cube_r227 = rightarm2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(15, 70).addBox(0.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5764F, -0.9222F, 0.7277F, 1.5708F, -0.8465F, 1.5708F));

		PartDefinition cube_r228 = rightarm2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(54, 28).addBox(-1.1F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.5764F, -0.3186F, 0.6532F, 1.5708F, 0.288F, 1.5708F));

		PartDefinition cube_r229 = rightarm2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(40, 52).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.5764F, 1.1732F, 0.8099F, 1.5708F, 1.4661F, 1.5708F));

		PartDefinition cube_r230 = rightarm2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(74, 45).addBox(0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 12).addBox(-0.2F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.1764F, 2.7698F, 1.5861F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition cube_r231 = rightarm2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(63, 8).addBox(-0.9647F, -0.4763F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3236F, 2.9954F, 0.2336F, 1.5708F, 0.8203F, 1.5708F));

		PartDefinition cube_r232 = rightarm2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(77, 32).addBox(-0.275F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1764F, 2.5044F, 0.4625F, -1.5708F, 0.3229F, -1.5708F));

		PartDefinition cube_r233 = rightarm2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(65, 77).addBox(-0.9264F, -0.2768F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.3236F, 1.7954F, -0.2664F, 1.5708F, 1.2043F, 1.5708F));

		PartDefinition cube_r234 = rightarm2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(41, 59).addBox(-1.2014F, -0.4768F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.3236F, 1.7954F, -0.2664F, 1.5708F, 0.8901F, 1.5708F));

		PartDefinition cube_r235 = rightarm2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(58, 5).addBox(-0.8665F, -0.5622F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.3614F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2667F, 2.9803F, 1.471F, 0.9696F, 0.03F, -0.0837F));

		PartDefinition cube_r236 = rightArm3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(7, 32).addBox(0.0F, -2.0F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.4627F, 0.3449F, -1.6633F));

		PartDefinition cube_r237 = bone3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(44, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4069F, 1.5583F, -1.3321F, 1.4645F, 0.2143F, -0.3683F));

		PartDefinition cube_r238 = bone3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(62, 65).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1713F, 1.5354F, -2.3037F, 3.0352F, 0.2143F, -0.3683F));

		PartDefinition cube_r239 = bone3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(57, 65).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2382F, 0.7135F, -2.6997F, -2.7243F, 0.2143F, -0.3683F));

		PartDefinition cube_r240 = bone3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(65, 56).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5291F, -0.2041F, -2.4289F, -1.8517F, 0.2143F, -0.3683F));

		PartDefinition cube_r241 = bone3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(44, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6183F, -0.8786F, -1.696F, -0.8481F, 0.2143F, -0.3683F));

		PartDefinition cube_r242 = bone3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(31, 55).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.565F, -1.2904F, -0.7863F, 0.3736F, 0.2143F, -0.3683F));

		PartDefinition cube_r243 = bone3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(26, 56).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4797F, 0.1087F, 1.3775F, 0.7663F, 0.2143F, -0.3683F));

		PartDefinition cube_r244 = bone3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 66).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6053F, -0.0354F, 2.1543F, 0.1118F, 0.2143F, -0.3683F));

		PartDefinition cube_r245 = bone3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(25, 66).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0783F, -1.3444F, 2.0601F, -0.7172F, 0.2143F, -0.3683F));

		PartDefinition cube_r246 = bone3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(20, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2364F, -1.6087F, 1.1485F, -1.9389F, 0.2143F, -0.3683F));

		PartDefinition cube_r247 = bone3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(5, 66).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4417F, -1.55F, 0.1715F, 3.1225F, 0.2143F, -0.3683F));

		PartDefinition cube_r248 = bone3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(0, 36).addBox(-0.3939F, -0.4878F, -0.4659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7699F, 0.2143F, -0.3683F));

		PartDefinition cube_r249 = bone3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(10, 65).addBox(-0.3939F, -0.9608F, -1.201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6687F, 0.2143F, -0.3683F));

		PartDefinition cube_r250 = bone3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(36, 35).addBox(-0.1F, 0.0F, -0.8F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5819F, 0.6016F, -0.2228F, 1.1288F, -0.1857F, -0.363F));

		PartDefinition cube_r251 = bone3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(7, 47).addBox(-0.3939F, -0.3016F, -1.7845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2201F, 0.2143F, -0.3683F));

		PartDefinition cube_r252 = bone3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(70, 56).addBox(-0.3939F, 1.1183F, -0.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.33F, 0.2143F, -0.3683F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.4627F, 0.3449F, -1.6633F));

		PartDefinition cube_r253 = bone5.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(44, 11).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4069F, 1.5583F, -1.3321F, 1.4645F, -0.2143F, 0.3683F));

		PartDefinition cube_r254 = bone5.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(62, 65).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1713F, 1.5354F, -2.3037F, 3.0352F, -0.2143F, 0.3683F));

		PartDefinition cube_r255 = bone5.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(57, 65).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2382F, 0.7135F, -2.6997F, -2.7243F, -0.2143F, 0.3683F));

		PartDefinition cube_r256 = bone5.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5291F, -0.2041F, -2.4289F, -1.8517F, -0.2143F, 0.3683F));

		PartDefinition cube_r257 = bone5.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(44, 7).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6183F, -0.8786F, -1.696F, -0.8481F, -0.2143F, 0.3683F));

		PartDefinition cube_r258 = bone5.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(31, 55).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.565F, -1.2904F, -0.7863F, 0.3736F, -0.2143F, 0.3683F));

		PartDefinition cube_r259 = bone5.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4797F, 0.1087F, 1.3775F, 0.7663F, -0.2143F, 0.3683F));

		PartDefinition cube_r260 = bone5.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(30, 66).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6053F, -0.0354F, 2.1543F, 0.1118F, -0.2143F, 0.3683F));

		PartDefinition cube_r261 = bone5.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(25, 66).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0783F, -1.3444F, 2.0601F, -0.7172F, -0.2143F, 0.3683F));

		PartDefinition cube_r262 = bone5.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2364F, -1.6087F, 1.1485F, -1.9389F, -0.2143F, 0.3683F));

		PartDefinition cube_r263 = bone5.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4417F, -1.55F, 0.1715F, 3.1225F, -0.2143F, 0.3683F));

		PartDefinition cube_r264 = bone5.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.6061F, -0.4878F, -0.4659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7699F, -0.2143F, 0.3683F));

		PartDefinition cube_r265 = bone5.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-0.6061F, -0.9608F, -1.201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6687F, -0.2143F, 0.3683F));

		PartDefinition cube_r266 = bone5.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(36, 35).mirror().addBox(-0.9F, 0.0F, -0.8F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5819F, 0.6016F, -0.2228F, 1.1288F, 0.1857F, 0.363F));

		PartDefinition cube_r267 = bone5.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.6061F, -0.3016F, -1.7845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2201F, -0.2143F, 0.3683F));

		PartDefinition cube_r268 = bone5.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(70, 56).mirror().addBox(-0.6061F, 1.1183F, -0.8444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.33F, -0.2143F, 0.3683F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2539F, -3.7545F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r269 = neck2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(40, 78).addBox(0.0F, -1.7315F, -0.261F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2707F, -1.5781F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r270 = neck2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0322F, -1.3406F, 0.0633F, 0.0295F, -0.4354F));

		PartDefinition cube_r271 = neck2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(35, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0322F, -1.3406F, 0.0633F, -0.0295F, 0.4354F));

		PartDefinition cube_r272 = neck2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(14, 43).addBox(-0.5F, -0.4315F, -1.8645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 0.0158F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0299F, -1.7964F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r273 = neck.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(23, 34).addBox(0.0F, -0.8F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5181F, -1.5181F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r274 = neck.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(75, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.113F, -1.4187F, 0.0454F, 0.0262F, -0.523F));

		PartDefinition cube_r275 = neck.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(75, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.113F, -1.4187F, 0.0454F, -0.0262F, 0.523F));

		PartDefinition cube_r276 = neck.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(42, 3).addBox(-0.5F, -0.466F, -1.916F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0049F, -0.0064F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0049F, -1.9064F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(51, 80).addBox(0.0F, -0.8F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 48).addBox(-0.5F, -0.4F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.8F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r278 = neck4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.4F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -1.925F, 0.3674F, 0.5788F, 0.2075F));

		PartDefinition cube_r279 = neck5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6859F, -0.5444F, 0.0693F, -0.0531F, 0.6527F));

		PartDefinition cube_r280 = neck5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(5, 54).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6859F, -0.5444F, 0.0693F, 0.0531F, -0.6527F));

		PartDefinition cube_r281 = neck5.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(27, 32).addBox(-0.5F, -0.4F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.375F, -0.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9093F, -2.5086F, -0.2597F, -0.0338F, -0.1265F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(49, 25).addBox(-0.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5F, 0.0584F, -0.2792F, 2.8798F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(51, 6).addBox(-0.5F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.1568F, 0.3844F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(40, 44).addBox(-0.5F, -2.25F, -1.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(44, 19).addBox(-0.5F, -1.8F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5F, -0.407F, 0.1792F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(23, 37).addBox(-0.5F, -0.2F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.8023F, -0.2831F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(72, 49).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 72).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.0646F, -1.9558F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(49, 41).addBox(-2.6078F, -0.4386F, -0.807F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6271F, 0.3206F, -2.2802F, 3.0198F, 1.0F, 1.3918F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(35, 66).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5406F, -2.321F, 2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(45, 35).addBox(-0.5F, -1.2F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, 1.8592F, -3.2273F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(35, 44).addBox(-0.5F, -1.2F, -1.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(57, 38).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 1.8592F, -3.2273F, 2.5395F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(36, 56).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.2234F, -4.0633F, 2.5918F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(20, 75).addBox(-0.5F, -0.35F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(75, 18).addBox(-0.5F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 4.1678F, -4.5361F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 69).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 4.0133F, -4.2385F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(30, 69).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 4.0277F, -4.1566F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(66, 30).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 3.9619F, -3.6455F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(65, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.0319F, -4.0639F, 0.9512F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.0495F, -4.4505F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(55, 56).addBox(-0.5778F, -1.2453F, -0.4543F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(-0.9534F, -0.4878F, -0.0068F, -0.8355F, 0.1296F, 0.04F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(69, 46).addBox(-0.725F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9603F, -3.0951F, 1.5259F, 2.6254F, -0.1855F, -0.4173F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(50, 56).addBox(-0.776F, -1.7899F, -0.8012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6729F, -4.5289F, 2.1452F, 2.5483F, 0.135F, 0.1556F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(7, 51).addBox(-0.2375F, -1.3615F, -0.2787F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0497F, -4.8378F, 3.1413F, -1.0133F, 0.7686F, 2.4698F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(50, 38).addBox(-0.5843F, -1.4565F, -0.6053F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4679F, -5.6054F, 3.5506F, -1.7182F, 0.64F, 1.4932F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 51).addBox(-0.2F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0497F, -4.8378F, 3.1413F, -0.9551F, 0.8553F, 2.3725F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(50, 35).addBox(-1.0F, -1.2424F, -0.6053F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4679F, -5.6054F, 3.5506F, -1.7879F, 0.9922F, 1.399F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(72, 65).addBox(-0.5F, -0.475F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.3F, -5.5768F, 3.0423F, 0.1903F, 0.3643F, 0.3198F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(50, 72).addBox(-0.5F, -0.7927F, -0.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3F, -5.5768F, 3.0423F, -0.9005F, 0.3643F, 0.3198F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(50, 15).addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4679F, -5.6054F, 3.5506F, -2.6169F, 0.9922F, 1.399F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(46, 60).addBox(0.1047F, -0.716F, -0.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 60).addBox(0.4547F, -0.666F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 56).addBox(-0.2953F, -0.716F, -0.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0497F, -4.8378F, 3.1413F, -1.9471F, 0.8652F, 2.3601F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(63, 40).addBox(-0.347F, -0.716F, -0.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0497F, -4.8378F, 3.1413F, -2.3217F, 0.6006F, 1.8126F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(62, 50).addBox(-0.2064F, -0.7504F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4409F, -5.1801F, 2.8774F, -2.9712F, 0.8708F, 1.7697F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(60, 71).addBox(-0.7059F, -0.4259F, -0.9225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6729F, -4.7289F, 2.1702F, 2.4042F, 0.3331F, 0.3336F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(25, 69).addBox(-0.3899F, -0.7892F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(61, 62).addBox(-0.3899F, -0.9892F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 69).addBox(-0.3899F, -0.5892F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3284F, 0.0872F, -0.7067F, -0.6185F, 0.0556F, -0.0063F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(57, 34).addBox(-0.3899F, -1.6219F, -0.392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.402F)), PartPose.offsetAndRotation(-1.3284F, 0.0872F, -0.7067F, -0.8367F, 0.0556F, -0.0063F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(15, 73).addBox(-0.6107F, -0.4425F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 69).addBox(-0.6107F, -0.2425F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(45, 66).addBox(-0.6107F, -0.0425F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.39F)), PartPose.offsetAndRotation(-0.9784F, -0.3378F, -0.4067F, -0.8269F, 0.2403F, 0.1111F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(69, 26).addBox(-0.6F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.1117F, 0.1764F, -0.6701F, -0.7901F, -0.3107F, -0.2463F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(65, 68).addBox(-0.6107F, -0.4033F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F))
				.texOffs(60, 68).addBox(-0.6107F, -0.2033F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(66, 43).addBox(-0.6107F, -0.0033F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)), PartPose.offsetAndRotation(-0.9784F, -0.3378F, -0.4067F, -0.6088F, 0.2403F, 0.1111F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(36, 60).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.3101F, -0.4035F, -0.179F, -0.5313F, 0.0556F, 0.0F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(60, 21).addBox(-0.6278F, -0.3055F, -0.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9534F, -0.4878F, -0.0068F, -0.53F, 0.1296F, 0.04F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(62, 34).addBox(-0.5619F, -0.8381F, -0.7108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0784F, -0.2878F, -0.0068F, -0.9751F, 0.1296F, 0.04F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(37, 63).addBox(-0.4595F, -0.1475F, -0.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9466F, -2.0196F, 1.1193F, 2.2017F, 0.9484F, -0.5416F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(68, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8347F, -1.7503F, 1.3937F, 1.2636F, 0.2162F, -1.5076F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(55, 68).addBox(-0.5071F, -1.54F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(68, 39).addBox(-0.5071F, -1.19F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5768F, -1.6541F, 1.1816F, 1.2768F, 0.6854F, -1.6774F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(55, 71).addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7588F, -1.5134F, 1.7374F, 1.2118F, -0.5722F, -1.2392F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(73, 6).addBox(-0.5273F, -0.6648F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5768F, -1.6541F, 1.1816F, 1.2884F, 0.6352F, -1.6585F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(71, 42).addBox(-0.3536F, -0.5639F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5768F, -1.6541F, 1.1816F, 1.1393F, 1.0047F, -1.8587F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(71, 59).addBox(-0.3837F, -1.0389F, 0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 37).addBox(-0.4837F, -0.5389F, 0.1156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5768F, -1.6541F, 1.1816F, 2.2642F, 0.8849F, -0.5382F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(20, 57).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1202F, -0.9466F, -0.051F, -0.706F, 0.1346F, 0.0168F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(40, 66).addBox(-0.5619F, -0.8399F, -0.6774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.0784F, -0.2878F, -0.0068F, -0.53F, 0.1296F, 0.04F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(33, 26).addBox(-0.6F, -0.45F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9047F, -0.9838F, 0.78F, 0.6311F, 0.2279F, 0.0456F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(71, 62).addBox(-0.6556F, -0.1199F, -0.5853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.9784F, -0.3378F, -0.4067F, 0.712F, 0.1856F, 0.0142F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(71, 29).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.1715F, 0.1989F, -0.4161F, 0.7418F, 0.3161F, 0.1339F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(65, 11).addBox(-0.664F, 0.0252F, -0.6851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.9784F, -0.3378F, -0.4067F, 0.9269F, 0.2072F, 0.0042F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(66, 59).addBox(-0.7519F, -0.296F, -0.5233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 66).addBox(-0.7519F, 0.104F, -0.5233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.3859F, -3.6779F, 2.8736F, 1.766F, -0.0518F, 0.0875F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(20, 72).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0423F, -5.248F, 4.7448F, -1.1225F, -0.0879F, -0.4523F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(5, 72).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0299F, -4.8556F, 4.7739F, -1.4977F, -0.1106F, -0.1901F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(70, 71).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1694F, -4.4704F, 4.6647F, -1.7852F, -0.1238F, 0.0291F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 47).addBox(-0.725F, -0.625F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1995F, -3.8448F, 3.3766F, -2.4834F, -0.1238F, 0.0291F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(21, 44).addBox(-0.45F, -0.625F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1995F, -3.8448F, 3.3766F, -2.1649F, -0.7487F, -0.665F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(10, 68).addBox(-0.5F, -0.4587F, -0.6562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(68, 6).addBox(-0.5F, -0.4587F, -0.5562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.575F, -2.4953F, 1.2587F, -1.7488F, 0.5089F, 0.1909F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(68, 17).addBox(-0.9F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(28, 44).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.4938F, -2.5794F, 0.9625F, -1.7275F, 0.1388F, 0.2565F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(73, 3).addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5481F, -2.3894F, 0.9316F, -2.054F, -0.208F, -1.2982F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.643F, -0.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.575F, -2.4953F, 1.2587F, -2.5778F, 0.5089F, 0.1909F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(75, 12).addBox(-0.7629F, -0.9454F, 0.1525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0505F, -2.0904F, 2.1012F, 2.6237F, 0.355F, 0.1939F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(68, 3).addBox(-0.7629F, -1.0615F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0505F, -2.0904F, 2.1012F, 1.751F, 0.355F, 0.1939F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(68, 0).addBox(-0.7629F, -0.6324F, -0.7093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.0505F, -2.0904F, 2.1012F, 0.5293F, 0.355F, 0.1939F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 68).addBox(-0.7122F, -0.2379F, -0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0495F, -2.3904F, 2.4012F, -0.7518F, 0.275F, 0.2205F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(67, 65).addBox(-0.7242F, -0.3323F, -0.6987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.1495F, -2.5654F, 2.6012F, -0.5983F, 0.1716F, 0.2529F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(67, 50).addBox(-0.7F, -0.25F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1995F, -2.9154F, 2.8512F, -0.6102F, 0.0966F, 0.1422F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(67, 36).addBox(-0.3F, -0.6354F, -0.4046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2005F, -3.0419F, 2.5765F, -0.1993F, 0.121F, 0.1407F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(66, 62).addBox(-0.3F, -0.9969F, -0.3659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2005F, -3.0419F, 2.5765F, -0.0772F, 0.121F, 0.1407F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(67, 33).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0783F, -3.369F, 2.8128F, 0.778F, 0.121F, 0.1407F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(15, 67).addBox(-0.7519F, -0.2947F, -0.3968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3859F, -3.6779F, 2.8736F, 0.6838F, -0.0518F, 0.0875F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(65, 20).addBox(-0.3F, -0.9232F, 0.0189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2005F, -3.0419F, 2.5765F, 0.4901F, 0.121F, 0.1407F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.0495F, -4.4505F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(55, 56).mirror().addBox(-0.4222F, -1.2453F, -0.4543F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(0.9534F, -0.4878F, -0.0068F, -0.8355F, -0.1296F, -0.04F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(69, 46).mirror().addBox(-0.275F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9603F, -3.0951F, 1.5259F, 2.6254F, 0.1855F, 0.4173F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(-0.2239F, -1.7899F, -0.8012F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6729F, -4.5289F, 2.1452F, 2.5483F, -0.135F, -0.1556F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(7, 51).mirror().addBox(-1.7625F, -1.3615F, -0.2787F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0497F, -4.8378F, 3.1413F, -1.0133F, -0.7686F, -2.4698F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(50, 38).mirror().addBox(-1.4157F, -1.4565F, -0.6053F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4679F, -5.6054F, 3.5506F, -1.7182F, -0.64F, -1.4932F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-1.8F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0497F, -4.8378F, 3.1413F, -0.9551F, -0.8553F, -2.3725F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(50, 35).mirror().addBox(-1.0F, -1.2424F, -0.6053F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4679F, -5.6054F, 3.5506F, -1.7879F, -0.9922F, -1.399F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-0.5F, -0.475F, 0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.3F, -5.5768F, 3.0423F, 0.1903F, -0.3643F, -0.3198F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(-0.5F, -0.7927F, -0.2015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3F, -5.5768F, 3.0423F, -0.9005F, -0.3643F, -0.3198F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(50, 15).mirror().addBox(-1.0F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4679F, -5.6054F, 3.5506F, -2.6169F, -0.9922F, -1.399F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(46, 60).mirror().addBox(-1.1047F, -0.716F, -0.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 60).mirror().addBox(-1.4547F, -0.666F, -0.3551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(60, 56).mirror().addBox(-0.7047F, -0.716F, -0.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0497F, -4.8378F, 3.1413F, -1.9471F, -0.8652F, -2.3601F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(63, 40).mirror().addBox(-0.653F, -0.716F, -0.1521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0497F, -4.8378F, 3.1413F, -2.3217F, -0.6006F, -1.8126F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(62, 50).mirror().addBox(-0.7936F, -0.7504F, -0.8009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4409F, -5.1801F, 2.8774F, -2.9712F, -0.8708F, -1.7697F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-0.2941F, -0.4259F, -0.9225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6729F, -4.7289F, 2.1702F, 2.4042F, -0.3331F, -0.3336F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-0.6101F, -0.7892F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(61, 62).mirror().addBox(-0.6101F, -0.9892F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 69).mirror().addBox(-0.6101F, -0.5892F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3284F, 0.0872F, -0.7067F, -0.6185F, -0.0556F, 0.0063F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(-0.6101F, -1.6219F, -0.392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false), PartPose.offsetAndRotation(1.3284F, 0.0872F, -0.7067F, -0.8367F, -0.0556F, 0.0063F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(15, 73).mirror().addBox(-0.3893F, -0.4425F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 69).mirror().addBox(-0.3893F, -0.2425F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(45, 66).mirror().addBox(-0.3893F, -0.0425F, -0.2984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.39F)).mirror(false), PartPose.offsetAndRotation(0.9784F, -0.3378F, -0.4067F, -0.8269F, -0.2403F, -0.1111F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-0.4F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.1117F, 0.1764F, -0.6701F, -0.7901F, 0.3107F, 0.2463F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(65, 68).mirror().addBox(-0.3893F, -0.4033F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false)
				.texOffs(60, 68).mirror().addBox(-0.3893F, -0.2033F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(66, 43).mirror().addBox(-0.3893F, -0.0033F, -0.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.401F)).mirror(false), PartPose.offsetAndRotation(0.9784F, -0.3378F, -0.4067F, -0.6088F, -0.2403F, -0.1111F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(36, 60).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.3101F, -0.4035F, -0.179F, -0.5313F, -0.0556F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-0.3722F, -0.3055F, -0.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9534F, -0.4878F, -0.0068F, -0.53F, -0.1296F, -0.04F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(62, 34).mirror().addBox(-0.4381F, -0.8381F, -0.7108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0784F, -0.2878F, -0.0068F, -0.9751F, -0.1296F, -0.04F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(37, 63).mirror().addBox(-0.5405F, -0.1475F, -0.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9466F, -2.0196F, 1.1193F, 2.2017F, -0.9484F, 0.5416F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(68, 23).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8347F, -1.7503F, 1.3937F, 1.2636F, -0.2162F, 1.5076F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-0.4929F, -1.54F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(68, 39).mirror().addBox(-0.4929F, -1.19F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5768F, -1.6541F, 1.1816F, 1.2768F, -0.6854F, 1.6774F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.7588F, -1.5134F, 1.7374F, 1.2118F, 0.5722F, 1.2392F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.4727F, -0.6648F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.5768F, -1.6541F, 1.1816F, 1.2884F, -0.6352F, 1.6585F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(71, 42).mirror().addBox(-0.6464F, -0.5639F, -0.181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5768F, -1.6541F, 1.1816F, 1.1393F, -1.0047F, 1.8587F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(71, 59).mirror().addBox(-0.6162F, -1.0389F, 0.0156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 37).mirror().addBox(-0.5163F, -0.5389F, 0.1156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5768F, -1.6541F, 1.1816F, 2.2642F, -0.8849F, 0.5382F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(20, 57).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1202F, -0.9466F, -0.051F, -0.706F, -0.1346F, -0.0168F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-0.4381F, -0.8399F, -0.6774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.0784F, -0.2878F, -0.0068F, -0.53F, -0.1296F, -0.04F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(33, 26).mirror().addBox(-0.4F, -0.45F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9047F, -0.9838F, 0.78F, 0.6311F, -0.2279F, -0.0456F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-0.3444F, -0.1199F, -0.5853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.9784F, -0.3378F, -0.4067F, 0.712F, -0.1856F, -0.0142F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.1715F, 0.1989F, -0.4161F, 0.7418F, -0.3161F, -0.1339F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(65, 11).mirror().addBox(-0.336F, 0.0252F, -0.6851F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.9784F, -0.3378F, -0.4067F, 0.9269F, -0.2072F, -0.0042F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(66, 59).mirror().addBox(-0.2481F, -0.296F, -0.5233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 66).mirror().addBox(-0.2481F, 0.104F, -0.5233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.3859F, -3.6779F, 2.8736F, 1.766F, 0.0518F, -0.0875F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0423F, -5.248F, 4.7448F, -1.1225F, 0.0879F, 0.4523F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0299F, -4.8556F, 4.7739F, -1.4977F, 0.1106F, 0.1901F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1694F, -4.4704F, 4.6647F, -1.7852F, 0.1238F, -0.0291F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.275F, -0.625F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1995F, -3.8448F, 3.3766F, -2.4834F, 0.1238F, -0.0291F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(21, 44).mirror().addBox(-0.55F, -0.625F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1995F, -3.8448F, 3.3766F, -2.1649F, 0.7487F, 0.665F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.5F, -0.4587F, -0.6562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(68, 6).mirror().addBox(-0.5F, -0.4587F, -0.5562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.575F, -2.4953F, 1.2587F, -1.7488F, -0.5089F, -0.1909F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-0.1F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(28, 44).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.4938F, -2.5794F, 0.9625F, -1.7275F, -0.1388F, -0.2565F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(73, 3).mirror().addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5481F, -2.3894F, 0.9316F, -2.054F, 0.208F, 1.2982F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, -0.643F, -0.4249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.575F, -2.4953F, 1.2587F, -2.5778F, -0.5089F, -0.1909F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(75, 12).mirror().addBox(-0.2371F, -0.9454F, 0.1525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.0505F, -2.0904F, 2.1012F, 2.6237F, -0.355F, -0.1939F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(68, 3).mirror().addBox(-0.2371F, -1.0615F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0505F, -2.0904F, 2.1012F, 1.751F, -0.355F, -0.1939F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.2371F, -0.6324F, -0.7093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.0505F, -2.0904F, 2.1012F, 0.5293F, -0.355F, -0.1939F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.2877F, -0.2379F, -0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0495F, -2.3904F, 2.4012F, -0.7518F, -0.275F, -0.2205F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-0.2758F, -0.3323F, -0.6987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.1495F, -2.5654F, 2.6012F, -0.5983F, -0.1716F, -0.2529F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-0.3F, -0.25F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1995F, -2.9154F, 2.8512F, -0.6102F, -0.0966F, -0.1422F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(-0.7F, -0.6354F, -0.4046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2005F, -3.0419F, 2.5765F, -0.1993F, -0.121F, -0.1407F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-0.7F, -0.9969F, -0.3659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2005F, -3.0419F, 2.5765F, -0.0772F, -0.121F, -0.1407F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0783F, -3.369F, 2.8128F, 0.778F, -0.121F, -0.1407F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.2481F, -0.2947F, -0.3968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3859F, -3.6779F, 2.8736F, 0.6838F, 0.0518F, -0.0875F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(-0.7F, -0.9232F, 0.0189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2005F, -3.0419F, 2.5765F, 0.4901F, -0.121F, -0.1407F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.4019F, -0.9103F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(75, 9).mirror().addBox(-0.201F, -0.1614F, 0.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, -1.2741F, -0.1745F, 0.0F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(-0.201F, -0.8011F, -0.2046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 2.7838F, -0.1745F, 0.0F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(73, 15).mirror().addBox(-0.201F, -0.7298F, -0.0367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, -1.885F, -0.1745F, 0.0F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-0.201F, -0.8048F, -0.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, -2.1031F, -0.1745F, 0.0F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(63, 2).mirror().addBox(-0.201F, -1.3286F, -0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(5, 63).mirror().addBox(-0.201F, -1.9286F, -0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 1.693F, -0.1745F, 0.0F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.201F, 0.3245F, -0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, -0.1833F, -0.1745F, 0.0F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.201F, -0.9905F, -1.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 0.9512F, -0.1745F, 0.0F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-0.201F, -1.6643F, -1.3702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 75).mirror().addBox(-0.201F, -0.8643F, -1.1702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 1.1694F, -0.1745F, 0.0F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(12, 58).mirror().addBox(-0.3999F, -3.2405F, -1.3631F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 1.2043F, -0.2618F, 0.0F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(52, 48).mirror().addBox(-0.0644F, -4.5122F, -1.7341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(65, 71).mirror().addBox(-0.0644F, -5.0122F, -1.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 1.074F, -0.1571F, -0.0175F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(-0.0644F, -3.4436F, 3.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 2.2521F, -0.1571F, -0.0175F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.3999F, -2.2384F, -0.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 1.597F, -0.2618F, 0.0F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-0.0644F, -5.1528F, -1.3506F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0989F, -0.2019F, 1.1176F, -0.1571F, -0.0175F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.1644F, -5.6071F, -0.1906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.1739F, -0.2019F, 1.3358F, -0.1571F, -0.0175F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(74, 26).mirror().addBox(-0.1644F, -5.5723F, -1.1273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.1739F, -0.2019F, 1.1176F, -0.1571F, -0.0175F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(73, 15).addBox(-0.799F, -0.7298F, -0.0367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, -1.885F, 0.1745F, 0.0F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(73, 23).addBox(-0.799F, -0.8048F, -0.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, -2.1031F, 0.1745F, 0.0F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(5, 63).addBox(-0.799F, -1.9286F, -0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(63, 2).addBox(-0.799F, -1.3286F, -0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 1.693F, 0.1745F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(30, 75).addBox(-0.799F, -0.8011F, -0.2046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 2.7838F, 0.1745F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(35, 75).addBox(-0.799F, -0.8643F, -1.1702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 75).addBox(-0.799F, -1.6643F, -1.3702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 1.1694F, 0.1745F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(42, 63).addBox(-0.9356F, -3.4436F, 3.5817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 2.2521F, 0.1571F, 0.0175F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(65, 71).addBox(-0.9356F, -5.0122F, -1.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(52, 48).addBox(-0.9356F, -4.5122F, -1.7341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 1.074F, 0.1571F, 0.0175F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(74, 26).addBox(-0.8356F, -5.5723F, -1.1273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6F, -0.1739F, -0.2019F, 1.1176F, 0.1571F, 0.0175F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(10, 74).addBox(-0.8356F, -5.6071F, -0.1906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6F, -0.1739F, -0.2019F, 1.3358F, 0.1571F, 0.0175F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(21, 52).addBox(-0.9356F, -5.1528F, -1.3506F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 1.1176F, 0.1571F, 0.0175F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(5, 60).addBox(-0.6001F, -2.2384F, -0.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 1.597F, 0.2618F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(12, 58).addBox(-0.6001F, -3.2405F, -1.3631F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 1.2043F, 0.2618F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 74).addBox(-0.799F, -0.9905F, -1.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, 0.9512F, 0.1745F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(73, 38).addBox(-0.799F, 0.3245F, -0.9346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, -0.1833F, 0.1745F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(75, 9).addBox(-0.799F, -0.1614F, 0.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6F, -0.0989F, -0.2019F, -1.2741F, 0.1745F, 0.0F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2572F, 0.9281F, -3.9069F, -1.1202F, 0.0554F, -2.6677F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9428F, 0.9281F, -3.9069F, -1.1202F, -0.0554F, 2.6677F));

		PartDefinition bone = neck2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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