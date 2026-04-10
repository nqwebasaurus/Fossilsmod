package fossils.fossils.client.blockentity.model.biarmosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BiarmosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart biarmosuchus;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart scapula;
	private final ModelPart scapula2;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RFrontLeg2;
	private final ModelPart LowerRFrontLeg2;
	private final ModelPart RFrontFoot2;
	private final ModelPart RFrontFoot3;
	private final ModelPart RFrontLeg3;
	private final ModelPart LowerRFrontLeg3;
	private final ModelPart RFrontFoot4;
	private final ModelPart RFrontFoot5;
	private final ModelPart sacrum;
	private final ModelPart sacrum2;
	private final ModelPart RBackLeg2;
	private final ModelPart LowerRBackLeg2;
	private final ModelPart RBackFoot2;
	private final ModelPart RBackFoot3;
	private final ModelPart RBackLeg3;
	private final ModelPart LowerRBackLeg3;
	private final ModelPart RBackFoot4;
	private final ModelPart RBackFoot5;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;

	public BiarmosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.biarmosuchus = this.fossil.getChild("biarmosuchus");
		this.main = this.biarmosuchus.getChild("main");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.scapula = this.chest.getChild("scapula");
		this.scapula2 = this.chest.getChild("scapula2");
		this.Neck2 = this.chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Head = this.Neck5.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RFrontLeg2 = this.chest.getChild("RFrontLeg2");
		this.LowerRFrontLeg2 = this.RFrontLeg2.getChild("LowerRFrontLeg2");
		this.RFrontFoot2 = this.LowerRFrontLeg2.getChild("RFrontFoot2");
		this.RFrontFoot3 = this.RFrontFoot2.getChild("RFrontFoot3");
		this.RFrontLeg3 = this.chest.getChild("RFrontLeg3");
		this.LowerRFrontLeg3 = this.RFrontLeg3.getChild("LowerRFrontLeg3");
		this.RFrontFoot4 = this.LowerRFrontLeg3.getChild("RFrontFoot4");
		this.RFrontFoot5 = this.RFrontFoot4.getChild("RFrontFoot5");
		this.sacrum = this.main.getChild("sacrum");
		this.sacrum2 = this.main.getChild("sacrum2");
		this.RBackLeg2 = this.main.getChild("RBackLeg2");
		this.LowerRBackLeg2 = this.RBackLeg2.getChild("LowerRBackLeg2");
		this.RBackFoot2 = this.LowerRBackLeg2.getChild("RBackFoot2");
		this.RBackFoot3 = this.RBackFoot2.getChild("RBackFoot3");
		this.RBackLeg3 = this.main.getChild("RBackLeg3");
		this.LowerRBackLeg3 = this.RBackLeg3.getChild("LowerRBackLeg3");
		this.RBackFoot4 = this.LowerRBackLeg3.getChild("RBackFoot4");
		this.RBackFoot5 = this.RBackFoot4.getChild("RBackFoot5");
		this.Tail = this.main.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition biarmosuchus = fossil.addOrReplaceChild("biarmosuchus", CubeListBuilder.create(), PartPose.offset(0.5F, -12.1F, 3.0F));

		PartDefinition main = biarmosuchus.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -7.3079F, 12.1934F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 90).addBox(0.0F, -1.5617F, -0.0455F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6845F, 1.9821F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 91).addBox(0.0F, -2.2581F, 1.5944F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).mirror().addBox(-1.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 52).addBox(0.5F, -0.1831F, 1.5944F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 23).addBox(-0.5F, -0.6831F, -0.4056F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5845F, -1.7179F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 90).addBox(0.0F, -2.2831F, -0.5056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5845F, -1.7179F, -0.2967F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0302F, -2.0209F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 89).addBox(0.0F, -2.0156F, 0.0203F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1752F, -2.0052F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2967F, 0.4726F, -0.0738F, -0.0268F, -0.732F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 37).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0967F, -1.5274F, 0.0062F, 0.0062F, -1.117F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(87, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0967F, -1.5274F, 0.0082F, 0.003F, -0.6807F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0033F, -3.5274F, 0.0738F, 0.0268F, -0.6273F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0033F, -3.5274F, 0.0556F, 0.0555F, -1.0631F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2967F, 0.4726F, -0.0738F, 0.0268F, 0.732F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(88, 37).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0967F, -1.5274F, 0.0062F, -0.0062F, 1.117F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(87, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0967F, -1.5274F, 0.0082F, -0.003F, 0.6807F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 83).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0033F, -3.5274F, 0.0738F, -0.0268F, 0.6273F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 0).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0033F, -3.5274F, 0.0556F, -0.0555F, 1.0631F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(84, 88).addBox(0.0F, -2.3873F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0248F, -4.0052F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.7792F, 4.5939F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0248F, -9.6052F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.3944F, -5.3827F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 91).addBox(0.0F, -1.9649F, -0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0808F, -0.6225F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(89, 55).addBox(0.0F, -2.6792F, 1.5939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 23).addBox(-0.5F, -0.7792F, -0.4061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.4192F, -4.2225F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(91, 50).mirror().addBox(-3.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1911F, -0.1447F, 0.017F, 0.0767F, -1.4916F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(76, 31).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1911F, -0.1447F, 0.0556F, 0.0555F, -0.9235F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(91, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1911F, -0.1447F, 0.0738F, 0.0268F, -0.4877F));

		PartDefinition cube_r22 = body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0911F, -2.0447F, 0.0427F, 0.2315F, -1.4531F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(73, 2).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0911F, -2.0447F, 0.1614F, 0.172F, -0.8769F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0911F, -2.0447F, 0.2184F, 0.0884F, -0.4448F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0089F, -4.0447F, 0.3046F, 0.1087F, -0.3324F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 37).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0089F, -4.0447F, 0.2323F, 0.2263F, -0.7589F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 44).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0089F, -4.0447F, 0.0723F, 0.315F, -1.3411F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(91, 50).addBox(2.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1911F, -0.1447F, 0.017F, -0.0767F, 1.4916F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(76, 31).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1911F, -0.1447F, 0.0556F, -0.0555F, 0.9235F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(91, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1911F, -0.1447F, 0.0738F, -0.0268F, 0.4877F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(73, 4).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0911F, -2.0447F, 0.0427F, -0.2315F, 1.4531F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(73, 2).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0911F, -2.0447F, 0.1614F, -0.172F, 0.8769F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 89).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0911F, -2.0447F, 0.2184F, -0.0884F, 0.4448F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(53, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0089F, -4.0447F, 0.3046F, -0.1087F, 0.3324F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 37).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0089F, -4.0447F, 0.2323F, -0.2263F, 0.7589F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(58, 44).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0089F, -4.0447F, 0.0723F, -0.315F, 1.3411F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 88).addBox(0.0F, -1.7792F, -0.4061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3794F, -4.1737F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3516F, -4.5172F, -0.0873F, 0.0435F, -0.0038F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(89, 69).addBox(0.0F, -2.1869F, -0.0379F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.4872F, -1.9795F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 91).addBox(0.0F, -2.1537F, -0.0043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.6099F, -4.0123F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5513F, -1.5274F, 0.4549F, 0.1586F, -0.3123F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5513F, -1.5274F, 0.3527F, 0.3326F, -0.7256F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(41, 35).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5513F, -1.5274F, 0.1122F, 0.4677F, -1.3259F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7514F, -3.5274F, 0.3383F, 0.3217F, -0.7826F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(91, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7514F, -3.5274F, 0.4378F, 0.1541F, -0.3673F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7514F, -3.5274F, 0.1065F, 0.4509F, -1.3807F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(89, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5513F, -1.5274F, 0.4549F, -0.1586F, 0.3123F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(73, 8).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5513F, -1.5274F, 0.3527F, -0.3326F, 0.7256F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(41, 35).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5513F, -1.5274F, 0.1122F, -0.4677F, 1.3259F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(73, 6).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7514F, -3.5274F, 0.3383F, -0.3217F, 0.7826F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(91, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7514F, -3.5274F, 0.4378F, -0.1541F, 0.3673F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(34, 18).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7514F, -3.5274F, 0.1065F, -0.4509F, 1.3807F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.2037F, 4.0957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.1872F, -9.0795F, 0.1134F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.575F, -4.95F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 80).addBox(0.0F, -2.5619F, -0.0379F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.4872F, -0.9795F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(76, 85).addBox(0.0F, -2.0537F, -1.0043F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.425F, -4.0399F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 85).addBox(0.0F, -2.4537F, 5.0957F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.1872F, -8.0795F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9514F, -4.5274F, 0.3395F, 0.1158F, -0.3805F));

		PartDefinition cube_r57 = body4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9514F, -4.5274F, 0.2618F, 0.247F, -0.8041F));

		PartDefinition cube_r58 = body4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9514F, -4.5274F, 0.0855F, 0.348F, -1.3889F));

		PartDefinition cube_r59 = body4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5514F, -0.5274F, 0.3212F, 0.1144F, -0.3305F));

		PartDefinition cube_r60 = body4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5514F, -0.5274F, 0.2454F, 0.2383F, -0.7559F));

		PartDefinition cube_r61 = body4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(34, 20).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5514F, -0.5274F, 0.0765F, 0.332F, -1.3398F));

		PartDefinition cube_r62 = body4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7514F, -2.5274F, 0.2493F, 0.2344F, -0.807F));

		PartDefinition cube_r63 = body4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(91, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7514F, -2.5274F, 0.3232F, 0.1093F, -0.3824F));

		PartDefinition cube_r64 = body4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(39, 28).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7514F, -2.5274F, 0.0822F, 0.3308F, -1.39F));

		PartDefinition cube_r65 = body4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(34, 16).mirror().addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1525F, 8.9906F, 2.3706F, 0.775F, 0.5944F, 0.8514F));

		PartDefinition cube_r66 = body4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(21, 14).mirror().addBox(-4.6F, -0.3F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5151F, 9.424F, 2.0544F, 0.5937F, 0.484F, 0.7329F));

		PartDefinition cube_r67 = body4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 39).mirror().addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8458F, 6.8086F, 1.6354F, 0.4357F, 0.1014F, 0.6419F));

		PartDefinition cube_r68 = body4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4998F, 9.4969F, -1.9503F, -0.0483F, -0.0528F, 0.5948F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(49, 15).mirror().addBox(-4.0F, -0.1F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5301F, 9.7157F, 0.1283F, 0.047F, 0.0227F, 0.6618F));

		PartDefinition cube_r70 = body4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(91, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5514F, -0.5274F, 0.3212F, -0.1144F, 0.3305F));

		PartDefinition cube_r71 = body4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 23).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5514F, -0.5274F, 0.2454F, -0.2383F, 0.7559F));

		PartDefinition cube_r72 = body4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(34, 20).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5514F, -0.5274F, 0.0765F, -0.332F, 1.3398F));

		PartDefinition cube_r73 = body4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(40, 37).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9514F, -4.5274F, 0.0855F, -0.348F, 1.3889F));

		PartDefinition cube_r74 = body4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(75, 65).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9514F, -4.5274F, 0.2618F, -0.247F, 0.8041F));

		PartDefinition cube_r75 = body4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 91).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9514F, -4.5274F, 0.3395F, -0.1158F, 0.3805F));

		PartDefinition cube_r76 = body4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(75, 47).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7514F, -2.5274F, 0.2493F, -0.2344F, 0.807F));

		PartDefinition cube_r77 = body4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(91, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7514F, -2.5274F, 0.3232F, -0.1093F, 0.3824F));

		PartDefinition cube_r78 = body4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(39, 28).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7514F, -2.5274F, 0.0822F, -0.3308F, 1.39F));

		PartDefinition cube_r79 = body4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(61, 7).addBox(-0.5F, 3.6797F, 1.9306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 5.8186F, -1.4655F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(34, 16).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1525F, 8.9906F, 2.3706F, 0.775F, -0.5944F, -0.8514F));

		PartDefinition cube_r81 = body4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(21, 14).addBox(-0.4F, -0.3F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5151F, 9.424F, 2.0544F, 0.5937F, -0.484F, -0.7329F));

		PartDefinition cube_r82 = body4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(40, 39).addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8458F, 6.8086F, 1.6354F, 0.4357F, -0.1014F, -0.6419F));

		PartDefinition cube_r83 = body4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 51).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4998F, 9.4969F, -1.9503F, -0.0483F, 0.0528F, -0.5948F));

		PartDefinition cube_r84 = body4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(49, 15).addBox(0.0F, -0.1F, -1.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5301F, 9.7157F, 0.1283F, 0.047F, -0.0227F, -0.6618F));

		PartDefinition cube_r85 = body4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, 3.7824F, 1.1835F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.4186F, -2.9655F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, -0.2037F, 4.0957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.1872F, -9.0795F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(41, 30).addBox(-0.5F, 2.6417F, 2.2263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 5.9121F, -6.237F, -0.1222F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6172F, -5.0057F, 0.1398F, 0.0432F, 0.0061F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(27, 44).addBox(0.0F, -2.516F, -0.0837F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5866F, -1.8733F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(90, 0).addBox(0.0F, -2.0282F, 0.0028F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5866F, -3.9733F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6806F, -3.4987F, 0.0916F, 0.3914F, -1.509F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6806F, -3.4987F, 0.2916F, 0.2799F, -0.9186F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(89, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6806F, -3.4987F, 0.3795F, 0.134F, -0.4978F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 55).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3806F, -1.4987F, 0.057F, 0.2025F, -1.4498F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3806F, -1.4987F, 0.1573F, 0.1401F, -0.8773F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3806F, -1.4987F, 0.2014F, 0.0611F, -0.4459F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(73, 12).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6806F, -3.4987F, 0.0916F, -0.3914F, 1.509F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(73, 10).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6806F, -3.4987F, 0.2916F, -0.2799F, 0.9186F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(89, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6806F, -3.4987F, 0.3795F, -0.134F, 0.4978F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 55).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3806F, -1.4987F, 0.057F, -0.2025F, 1.4498F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(73, 29).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3806F, -1.4987F, 0.1573F, -0.1401F, 0.8773F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(91, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3806F, -1.4987F, 0.2014F, -0.0611F, 0.4459F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(50, 30).addBox(-1.508F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.508F, 7.8388F, -4.9083F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(40, 41).addBox(-0.754F, -0.3489F, -0.3665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.254F, 7.3041F, -4.3754F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(11, 35).addBox(-0.5F, -0.2037F, 0.0957F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5866F, -4.0733F, 0.1134F, 0.0F, 0.0F));

		PartDefinition scapula = chest.addOrReplaceChild("scapula", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4713F, 3.0685F, -3.6055F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r105 = scapula.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(63, 46).addBox(-0.4221F, -0.9996F, -0.0142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2683F, -1.5394F, 0.6938F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r106 = scapula.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(59, 28).addBox(-1.0F, -2.5586F, 1.6266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, -1.9373F, 0.0F, 0.3927F));

		PartDefinition cube_r107 = scapula.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(34, 74).addBox(-1.0F, -2.8573F, 0.9841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, -2.2427F, 0.0F, 0.3927F));

		PartDefinition cube_r108 = scapula.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(86, 15).addBox(-1.0F, -0.6886F, -1.9021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, 1.7715F, 0.0F, 0.3927F));

		PartDefinition cube_r109 = scapula.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(80, 43).addBox(-1.0F, 2.049F, -1.2503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, -0.5847F, 0.0F, 0.3927F));

		PartDefinition cube_r110 = scapula.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(36, 51).addBox(-1.0F, -3.7096F, -0.5912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, 3.0369F, 0.0F, 0.3927F));

		PartDefinition cube_r111 = scapula.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(35, 87).addBox(-1.0F, -1.3053F, 2.7473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, -2.3736F, 0.0F, 0.3927F));

		PartDefinition cube_r112 = scapula.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(40, 80).addBox(-1.0F, 2.0926F, 1.1381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, -1.3265F, 0.0F, 0.3927F));

		PartDefinition cube_r113 = scapula.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(80, 22).addBox(-1.0F, -0.6773F, -2.3028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, 0.7243F, 0.0F, 0.3927F));

		PartDefinition cube_r114 = scapula.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(5, 80).addBox(-1.0F, -1.4628F, -0.8728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, 1.9024F, 0.0F, 0.3927F));

		PartDefinition cube_r115 = scapula.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(61, 85).addBox(-1.0F, -0.5131F, -0.9998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, 1.597F, 0.0F, 0.3927F));

		PartDefinition cube_r116 = scapula.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 35).addBox(-0.4221F, -0.4996F, 0.9857F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2683F, 1.4727F, 0.2725F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r117 = scapula.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(64, 15).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3461F, -4.3185F, -0.2966F, 2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r118 = scapula.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 39).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3461F, -4.7647F, 0.5983F, -2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r119 = scapula.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(30, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3461F, -4.7036F, 1.5965F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r120 = scapula.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(68, 10).addBox(-0.5F, -2.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3461F, -2.293F, 1.4256F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r121 = scapula.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(25, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3461F, -1.5541F, 0.2197F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r122 = scapula.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(82, 46).addBox(-1.0F, -0.3417F, -0.9872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8461F, 0.4871F, 0.2602F, 1.4224F, 0.0F, 0.3927F));

		PartDefinition cube_r123 = scapula.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(61, 11).addBox(-0.4221F, -0.4996F, 0.9857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2683F, 1.4727F, 0.2725F, 1.4224F, 0.0F, 0.0F));

		PartDefinition scapula2 = chest.addOrReplaceChild("scapula2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4713F, 3.0685F, -3.6055F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r124 = scapula2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(63, 46).mirror().addBox(-0.5779F, -0.9996F, -0.0142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2683F, -1.5394F, 0.6938F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r125 = scapula2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(59, 28).mirror().addBox(0.0F, -2.5586F, 1.6266F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, -1.9373F, 0.0F, -0.3927F));

		PartDefinition cube_r126 = scapula2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(34, 74).mirror().addBox(0.0F, -2.8573F, 0.9841F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, -2.2427F, 0.0F, -0.3927F));

		PartDefinition cube_r127 = scapula2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(0.0F, -0.6886F, -1.9021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, 1.7715F, 0.0F, -0.3927F));

		PartDefinition cube_r128 = scapula2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(0.0F, 2.049F, -1.2503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, -0.5847F, 0.0F, -0.3927F));

		PartDefinition cube_r129 = scapula2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(36, 51).mirror().addBox(0.0F, -3.7096F, -0.5912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, 3.0369F, 0.0F, -0.3927F));

		PartDefinition cube_r130 = scapula2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(0.0F, -1.3053F, 2.7473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, -2.3736F, 0.0F, -0.3927F));

		PartDefinition cube_r131 = scapula2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(0.0F, 2.0926F, 1.1381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, -1.3265F, 0.0F, -0.3927F));

		PartDefinition cube_r132 = scapula2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(80, 22).mirror().addBox(0.0F, -0.6773F, -2.3028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, 0.7243F, 0.0F, -0.3927F));

		PartDefinition cube_r133 = scapula2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(0.0F, -1.4628F, -0.8728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, 1.9024F, 0.0F, -0.3927F));

		PartDefinition cube_r134 = scapula2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(61, 85).mirror().addBox(0.0F, -0.5131F, -0.9998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, 1.597F, 0.0F, -0.3927F));

		PartDefinition cube_r135 = scapula2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.5779F, -0.4996F, 0.9857F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2683F, 1.4727F, 0.2725F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r136 = scapula2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3461F, -4.3185F, -0.2966F, 2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r137 = scapula2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3461F, -4.7647F, 0.5983F, -2.6791F, 0.0F, 0.0F));

		PartDefinition cube_r138 = scapula2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3461F, -4.7036F, 1.5965F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r139 = scapula2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-0.5F, -2.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3461F, -2.293F, 1.4256F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r140 = scapula2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3461F, -1.5541F, 0.2197F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r141 = scapula2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(0.0F, -0.3417F, -0.9872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8461F, 0.4871F, 0.2602F, 1.4224F, 0.0F, -0.3927F));

		PartDefinition cube_r142 = scapula2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(61, 11).mirror().addBox(-0.5779F, -0.4996F, 0.9857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2683F, 1.4727F, 0.2725F, 1.4224F, 0.0F, 0.0F));

		PartDefinition Neck2 = chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0932F, -3.8594F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(90, 4).addBox(0.0F, -2.123F, -0.1264F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5751F, -1.7708F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(89, 78).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4385F, -1.3604F, 0.3548F, 0.347F, -0.7438F));

		PartDefinition cube_r145 = Neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(17, 73).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4385F, -1.3604F, 0.1711F, 0.4626F, -1.2026F));

		PartDefinition cube_r146 = Neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(89, 78).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4385F, -1.3604F, 0.3548F, -0.347F, 0.7438F));

		PartDefinition cube_r147 = Neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(17, 73).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4385F, -1.3604F, 0.1711F, -0.4626F, 1.2026F));

		PartDefinition cube_r148 = Neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(35, 62).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6588F, -3.3752F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1303F, -1.9515F, -0.0174F, 0.0436F, 0.0011F));

		PartDefinition cube_r149 = Neck3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(90, 8).addBox(0.0F, -1.9352F, -0.0347F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1187F, -1.8545F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(67, 61).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9241F, -3.3717F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-1.3987F, -0.2655F, -1.2602F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5715F, -0.401F, 0.3978F, 0.7203F, -1.0043F));

		PartDefinition cube_r152 = Neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(76, 37).addBox(-0.6013F, -0.2655F, -1.2602F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5715F, -0.401F, 0.3978F, -0.7203F, 1.0043F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7163F, -1.8731F, -0.0788F, 0.087F, -0.0069F));

		PartDefinition cube_r153 = Neck4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(20, 90).addBox(0.0F, -1.5352F, -0.0347F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.54F, -1.9433F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Neck4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-1.0574F, -0.1743F, -0.991F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1709F, -0.7058F, 0.2376F, 0.9702F, -1.0979F));

		PartDefinition cube_r155 = Neck4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(52, 28).addBox(-0.9426F, -0.1743F, -0.991F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1709F, -0.7058F, 0.2376F, -0.9702F, 1.0979F));

		PartDefinition cube_r156 = Neck4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(42, 62).addBox(-0.5F, -0.3352F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3453F, -3.4605F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.55F, -2.0F, 0.2214F, 0.1704F, 0.0381F));

		PartDefinition cube_r157 = Neck5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(48, 81).addBox(0.0F, -2.5352F, -0.5347F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1942F, -1.4654F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Neck5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(22, 35).mirror().addBox(-1.0934F, -0.174F, -0.9333F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5709F, -0.7058F, 0.2376F, 0.9702F, -1.0979F));

		PartDefinition cube_r159 = Neck5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(22, 35).addBox(-0.9066F, -0.174F, -0.9333F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5709F, -0.7058F, 0.2376F, -0.9702F, 1.0979F));

		PartDefinition cube_r160 = Neck5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 18).addBox(-0.5F, -0.3352F, 0.4653F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0547F, -3.4605F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Head = Neck5.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3224F, -2.4154F, 0.0752F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.591F, -12.7034F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(84, 85).addBox(-0.5F, -0.6F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.6412F, -12.0602F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(82, 63).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3197F, -11.4844F, 2.2907F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(61, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3396F, -10.7326F, -2.4216F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(56, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9168F, -9.9159F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(35, 81).addBox(-1.0F, -0.0683F, -1.9843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7803F, -8.128F, 0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(81, 33).addBox(-1.0F, 0.0258F, -1.0037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7803F, -8.128F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(20, 81).addBox(-1.0F, -0.0458F, -2.0154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1803F, -6.1531F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(68, 65).addBox(-1.5F, 0.0037F, -0.0251F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 22).addBox(-2.0F, 0.0037F, 0.9749F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3796F, -5.1731F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(71, 82).addBox(-1.0F, 0.0037F, -1.0251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 43).addBox(-1.5F, 0.0037F, -0.0251F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1803F, -6.1531F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 15).addBox(0.0F, -0.3375F, -1.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(9, 51).addBox(-1.0F, -0.0125F, -1.0875F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6127F, 0.5029F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(49, 41).addBox(-1.0F, -0.0125F, -1.0875F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.6127F, 0.5029F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(57, 25).addBox(-1.5F, -0.475F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8352F, -1.796F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3315F, -1.3172F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -0.025F, -0.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2803F, -2.353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6589F, 0.5278F, -12.8899F, 0.0F, -0.0829F, 0.0F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(78, 18).addBox(-0.5115F, -0.0867F, -0.6645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.1951F, 3.3384F, 2.9521F, 0.5799F, 0.1864F, -0.0285F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(76, 82).addBox(-0.5115F, -0.6081F, -0.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1951F, 3.3384F, 2.9521F, 1.8889F, 0.1864F, -0.0285F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(81, 82).addBox(-0.5115F, 0.287F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1951F, 3.3384F, 2.9521F, 0.4927F, 0.1864F, -0.0285F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(80, 9).addBox(-0.5115F, -0.2502F, -0.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.1951F, 3.3384F, 2.9521F, 0.3181F, 0.1864F, -0.0285F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(76, 49).addBox(-0.5115F, -1.6604F, -0.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.1951F, 3.3384F, 2.9521F, 0.1F, 0.1864F, -0.0285F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(39, 74).addBox(-0.4F, -1.3F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4347F, 2.5333F, 1.3033F, 0.2255F, 0.11F, 0.0198F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(75, 67).addBox(-0.3F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4347F, 2.5333F, 1.3033F, 0.4004F, 0.1061F, 0.0242F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(77, 75).addBox(-0.5115F, -1.9198F, -0.6204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.1951F, 3.3384F, 2.9521F, 0.2745F, 0.1864F, -0.0285F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(25, 78).addBox(-0.1085F, -0.6602F, -2.8778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2917F, 1.681F, 5.9159F, 0.2745F, 0.1864F, 0.0588F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 39).addBox(-0.1085F, -0.9735F, -2.2018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2917F, 1.681F, 5.9159F, 0.4054F, 0.1864F, 0.0588F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(71, 15).addBox(-0.109F, -1.1254F, -1.4975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 72).addBox(-0.109F, -1.2253F, -0.7975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2917F, 1.681F, 5.9159F, 0.4939F, 0.1808F, 0.0707F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(61, 3).addBox(-1.703F, -1.9493F, -0.8069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6205F, -0.0492F, 8.213F, 0.5494F, 0.4041F, 0.1592F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(35, 57).addBox(-0.9F, -0.175F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.5727F, -2.3643F, 6.332F, -1.1266F, 0.2341F, 0.423F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 55).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.4619F, -2.8781F, 7.9974F, -1.3085F, 0.0687F, 0.3637F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(69, 71).addBox(-1.637F, -2.7741F, -0.0144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.6205F, -0.0492F, 8.213F, 0.2255F, 0.1991F, 0.3705F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(30, 30).addBox(-2.0708F, -2.6002F, -1.7413F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.6205F, -0.0492F, 8.213F, 0.1255F, 0.2339F, 0.0112F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(18, 44).addBox(-0.5208F, 0.4717F, -2.6202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.236F, -0.7635F, 9.5304F, -1.0559F, 0.1484F, 0.0F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5137F, 0.064F, -1.3306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 12).addBox(-0.5137F, 0.064F, -0.5306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0604F, -1.3225F, 11.7084F, 0.1335F, 0.251F, 0.0181F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(83, 28).addBox(-0.5137F, -0.4718F, -1.2514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.0604F, -1.3225F, 11.7084F, -2.4845F, 0.251F, 0.0181F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(83, 36).addBox(-0.518F, -0.8919F, -0.8115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0604F, -1.3225F, 11.7084F, 1.2068F, 0.2173F, 0.0325F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(65, 39).addBox(-0.518F, -0.703F, -0.7368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0604F, -1.3225F, 11.7084F, 1.8613F, 0.2173F, 0.0325F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(83, 25).addBox(-0.518F, 0.2227F, -0.5376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0604F, -1.3225F, 11.7084F, 2.9522F, 0.2173F, 0.0325F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(83, 18).addBox(-0.5137F, -1.221F, -0.5553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0604F, -1.3225F, 11.7084F, -1.6118F, 0.251F, 0.0181F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(5, 65).addBox(-0.5137F, -0.6936F, -0.8885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0604F, -1.3225F, 11.7084F, -0.87F, 0.251F, 0.0181F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(80, 67).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2683F, 1.1988F, 0.8469F, 0.5677F, 0.2002F, 0.0165F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(25, 85).addBox(-0.4931F, 0.2569F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(85, 21).addBox(-0.4931F, -0.0931F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.455F, -1.7097F, 9.1995F, 0.647F, 0.2419F, 0.0492F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 85).addBox(-0.784F, -0.911F, -0.7081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.755F, -1.7097F, 9.1995F, -0.662F, 0.2419F, 0.0666F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(85, 42).addBox(-0.3931F, -0.2579F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 85).addBox(-0.5681F, -0.2579F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.455F, -1.7097F, 9.1995F, -1.5783F, 0.2419F, 0.0492F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(10, 85).addBox(-0.784F, -0.1112F, -1.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.755F, -1.7097F, 9.1995F, -1.5783F, 0.2419F, 0.0666F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(85, 9).addBox(-0.784F, 0.3663F, -0.3144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.755F, -1.7097F, 9.1995F, -2.3201F, 0.2419F, 0.0666F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(85, 6).addBox(-0.4931F, -0.4609F, 0.3576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.455F, -1.7097F, 9.1995F, 3.1341F, 0.2419F, 0.0492F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 3).addBox(-0.4931F, -1.271F, -0.3165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.455F, -1.7097F, 9.1995F, 2.305F, 0.2419F, 0.0492F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(85, 0).addBox(-0.4931F, -0.6411F, -1.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.455F, -1.7097F, 9.1995F, 1.3887F, 0.2419F, 0.0492F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 85).addBox(-0.4931F, 0.1481F, -0.4062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.455F, -1.7097F, 9.1995F, 0.3415F, 0.2419F, 0.0492F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(42, 70).addBox(-0.9865F, -0.0499F, 1.0796F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, -2.682F, 0.1987F, 0.0254F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(40, 86).addBox(-0.9865F, 1.9563F, -0.2928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, -1.4341F, 0.1987F, 0.0254F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(86, 49).addBox(-0.9865F, -5.2076F, -0.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 1.5329F, 0.1987F, 0.0254F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 76).addBox(-0.9865F, -5.0008F, -2.4486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 1.0966F, 0.1987F, 0.0254F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(87, 45).addBox(-0.9865F, 0.8903F, -3.3804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, -0.2997F, 0.1987F, 0.0254F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(20, 77).addBox(-0.9865F, -0.1989F, 0.8091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, -2.7868F, 0.1987F, 0.0254F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(86, 31).addBox(-0.9865F, -1.7959F, -5.3298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 0.2239F, 0.1987F, 0.0254F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(86, 52).addBox(-0.9865F, -4.5282F, -3.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 0.8348F, 0.1987F, 0.0254F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 41).addBox(-0.9865F, -2.9069F, 1.1846F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 2.2747F, 0.1987F, 0.0254F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(22, 64).addBox(-0.9175F, -3.2685F, -2.8197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4182F, 0.2882F, 8.5265F, 0.2254F, 0.1638F, 0.0125F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(64, 79).addBox(-0.9175F, 2.369F, -3.6086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4182F, 0.2882F, 8.5265F, -1.2145F, 0.1638F, 0.0125F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(79, 85).addBox(-0.9865F, 2.8944F, -0.0372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, -2.6995F, 0.1987F, 0.0254F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(86, 80).addBox(-0.9865F, -1.6198F, 2.9635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 57).addBox(-0.9865F, -0.8314F, -0.0554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 2.1002F, 0.1987F, 0.0254F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(43, 51).addBox(-0.9175F, -3.35F, 1.3478F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4182F, 0.2882F, 8.5265F, 1.9271F, 0.1638F, 0.0125F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(5, 60).addBox(-0.9865F, -2.2834F, 1.622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 1.9256F, 0.1987F, 0.0254F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(42, 57).addBox(-0.9175F, -2.899F, 0.207F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4182F, 0.2882F, 8.5265F, 2.1016F, 0.1638F, 0.0125F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(55, 53).addBox(-0.9175F, -1.9814F, -1.9197F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4182F, 0.2882F, 8.5265F, 0.3738F, 0.1638F, 0.0125F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(9, 55).addBox(-1.7376F, -3.0853F, -0.215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6205F, -0.0492F, 8.213F, -0.2778F, 0.3043F, 0.3925F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(64, 71).addBox(-1.7151F, -2.8079F, 0.4382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.6205F, -0.0492F, 8.213F, 0.1583F, 0.2413F, 0.4023F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0015F, -1.0232F, -3.1197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8205F, -0.0492F, 9.413F, -3.0508F, 0.2238F, 0.0513F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(84, 77).addBox(-1.0055F, -1.4544F, -2.8034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.8205F, -0.0492F, 9.413F, -2.309F, 0.2238F, 0.0513F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(31, 37).addBox(-1.9985F, -0.3417F, -1.7774F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.2211F, 0.4998F, 11.294F, -1.8389F, 0.2407F, 0.0466F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(31, 43).addBox(-0.9985F, -3.7873F, -1.8345F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8205F, -0.0492F, 9.413F, -1.6109F, 0.2238F, 0.0513F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(18, 49).addBox(-1.0015F, 1.4799F, -2.9447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8205F, -0.0492F, 9.413F, -2.9635F, 0.2238F, 0.0513F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(66, 82).addBox(-1.0015F, -2.1511F, -3.6737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(1.8205F, -0.0492F, 9.413F, -1.96F, 0.2238F, 0.0513F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(73, 19).addBox(-1.0015F, -4.1969F, -0.7136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8205F, -0.0492F, 9.413F, -1.0873F, 0.2238F, 0.0513F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(68, 68).addBox(-1.174F, -3.9421F, 0.2072F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0182F, 1.5882F, 5.8265F, 0.8977F, -0.9844F, -0.9476F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(82, 74).addBox(-0.975F, 0.0037F, -1.0251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7247F, -2.5155F, 5.7678F, 0.232F, 0.2225F, -0.0084F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(61, 66).addBox(-0.875F, 0.0037F, -0.0251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0565F, -2.91F, 7.7028F, -0.0298F, 0.2225F, -0.0084F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(54, 66).addBox(-0.875F, 0.0037F, -2.0251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0565F, -2.91F, 7.7028F, 0.1971F, 0.2225F, -0.0084F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6589F, 0.5278F, -12.8899F, 0.0F, 0.0829F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.4885F, -0.0867F, -0.6645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.1951F, 3.3384F, 2.9521F, 0.5799F, -0.1864F, 0.0285F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.4885F, -0.6081F, -0.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1951F, 3.3384F, 2.9521F, 1.8889F, -0.1864F, 0.0285F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-0.4885F, 0.287F, -0.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1951F, 3.3384F, 2.9521F, 0.4927F, -0.1864F, 0.0285F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-0.4885F, -0.2502F, -0.463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.1951F, 3.3384F, 2.9521F, 0.3181F, -0.1864F, 0.0285F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(-0.4885F, -1.6604F, -0.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.1951F, 3.3384F, 2.9521F, 0.1F, -0.1864F, 0.0285F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(39, 74).mirror().addBox(-0.6F, -1.3F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4347F, 2.5333F, 1.3033F, 0.2255F, -0.11F, -0.0198F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(75, 67).mirror().addBox(-0.7F, -1.0F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4347F, 2.5333F, 1.3033F, 0.4004F, -0.1061F, -0.0242F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(77, 75).mirror().addBox(-0.4885F, -1.9198F, -0.6204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.1951F, 3.3384F, 2.9521F, 0.2745F, -0.1864F, 0.0285F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.8916F, -0.6602F, -2.8778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2917F, 1.681F, 5.9159F, 0.2745F, -0.1864F, -0.0588F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-0.8916F, -0.9735F, -2.2018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2917F, 1.681F, 5.9159F, 0.4054F, -0.1864F, -0.0588F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-0.891F, -1.1254F, -1.4975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 72).mirror().addBox(-0.891F, -1.2253F, -0.7975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2917F, 1.681F, 5.9159F, 0.4939F, -0.1808F, -0.0707F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(61, 3).mirror().addBox(0.703F, -1.9493F, -0.8069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6205F, -0.0492F, 8.213F, 0.5494F, -0.4041F, -0.1592F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(35, 57).mirror().addBox(-0.1F, -0.175F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.5727F, -2.3643F, 6.332F, -1.1266F, -0.2341F, -0.423F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(23, 55).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.4619F, -2.8781F, 7.9974F, -1.3085F, -0.0687F, -0.3637F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(69, 71).mirror().addBox(0.637F, -2.7741F, -0.0144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.6205F, -0.0492F, 8.213F, 0.2255F, -0.1991F, -0.3705F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(0.0708F, -2.6002F, -1.7413F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.6205F, -0.0492F, 8.213F, 0.1255F, -0.2339F, -0.0112F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(18, 44).mirror().addBox(-0.4792F, 0.4717F, -2.6202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.236F, -0.7635F, 9.5304F, -1.0559F, -0.1484F, 0.0F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.4863F, 0.064F, -1.3306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(81, 12).mirror().addBox(-0.4863F, 0.064F, -0.5306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -1.3225F, 11.7084F, 0.1335F, -0.251F, -0.0181F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-0.4863F, -0.4718F, -1.2514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -1.3225F, 11.7084F, -2.4845F, -0.251F, -0.0181F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(83, 36).mirror().addBox(-0.482F, -0.8919F, -0.8115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -1.3225F, 11.7084F, 1.2068F, -0.2173F, -0.0325F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-0.482F, -0.703F, -0.7368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -1.3225F, 11.7084F, 1.8613F, -0.2173F, -0.0325F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-0.482F, 0.2227F, -0.5376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -1.3225F, 11.7084F, 2.9522F, -0.2173F, -0.0325F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-0.4863F, -1.221F, -0.5553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -1.3225F, 11.7084F, -1.6118F, -0.251F, -0.0181F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-0.4863F, -0.6936F, -0.8885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0604F, -1.3225F, 11.7084F, -0.87F, -0.251F, -0.0181F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2683F, 1.1988F, 0.8469F, 0.5677F, -0.2002F, -0.0165F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(-0.5069F, 0.2569F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(85, 21).mirror().addBox(-0.5069F, -0.0931F, -0.0008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.7097F, 9.1995F, 0.647F, -0.2419F, -0.0492F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-0.216F, -0.911F, -0.7081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.755F, -1.7097F, 9.1995F, -0.662F, -0.2419F, -0.0666F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(85, 42).mirror().addBox(-0.6069F, -0.2579F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(30, 85).mirror().addBox(-0.4319F, -0.2579F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.7097F, 9.1995F, -1.5783F, -0.2419F, -0.0492F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-0.216F, -0.1112F, -1.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.755F, -1.7097F, 9.1995F, -1.5783F, -0.2419F, -0.0666F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.216F, 0.3663F, -0.3144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.755F, -1.7097F, 9.1995F, -2.3201F, -0.2419F, -0.0666F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(-0.5069F, -0.4609F, 0.3576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.7097F, 9.1995F, 3.1341F, -0.2419F, -0.0492F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-0.5069F, -1.271F, -0.3165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.7097F, 9.1995F, 2.305F, -0.2419F, -0.0492F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.5069F, -0.6411F, -1.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.7097F, 9.1995F, 1.3887F, -0.2419F, -0.0492F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5069F, 0.1481F, -0.4062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.7097F, 9.1995F, 0.3415F, -0.2419F, -0.0492F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-0.0135F, -0.0499F, 1.0796F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, -2.682F, -0.1987F, -0.0254F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.0135F, 1.9563F, -0.2928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, -1.4341F, -0.1987F, -0.0254F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(86, 49).mirror().addBox(-0.0135F, -5.2076F, -0.7397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 1.5329F, -0.1987F, -0.0254F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.0135F, -5.0008F, -2.4486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 1.0966F, -0.1987F, -0.0254F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(87, 45).mirror().addBox(-0.0135F, 0.8903F, -3.3804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, -0.2997F, -0.1987F, -0.0254F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.0135F, -0.1989F, 0.8091F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, -2.7868F, -0.1987F, -0.0254F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(-0.0135F, -1.7959F, -5.3298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 0.2239F, -0.1987F, -0.0254F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(86, 52).mirror().addBox(-0.0135F, -4.5282F, -3.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 0.8348F, -0.1987F, -0.0254F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.0135F, -2.9069F, 1.1846F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 2.2747F, -0.1987F, -0.0254F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(-0.0825F, -3.2685F, -2.8197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4182F, 0.2882F, 8.5265F, 0.2254F, -0.1638F, -0.0125F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-0.0825F, 2.369F, -3.6086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4182F, 0.2882F, 8.5265F, -1.2145F, -0.1638F, -0.0125F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(79, 85).mirror().addBox(-0.0135F, 2.8944F, -0.0372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, -2.6995F, -0.1987F, -0.0254F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(86, 80).mirror().addBox(-0.0135F, -1.6198F, 2.9635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 57).mirror().addBox(-0.0135F, -0.8314F, -0.0554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 2.1002F, -0.1987F, -0.0254F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(43, 51).mirror().addBox(-0.0825F, -3.35F, 1.3478F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4182F, 0.2882F, 8.5265F, 1.9271F, -0.1638F, -0.0125F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.0135F, -2.2834F, 1.622F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 1.9256F, -0.1987F, -0.0254F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(42, 57).mirror().addBox(-0.0825F, -2.899F, 0.207F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4182F, 0.2882F, 8.5265F, 2.1016F, -0.1638F, -0.0125F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(55, 53).mirror().addBox(-0.0825F, -1.9814F, -1.9197F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4182F, 0.2882F, 8.5265F, 0.3738F, -0.1638F, -0.0125F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(0.7376F, -3.0853F, -0.215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6205F, -0.0492F, 8.213F, -0.2778F, -0.3043F, -0.3925F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(64, 71).mirror().addBox(0.7151F, -2.8079F, 0.4382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.6205F, -0.0492F, 8.213F, 0.1583F, -0.2413F, -0.4023F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(0.0015F, -1.0232F, -3.1197F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8205F, -0.0492F, 9.413F, -3.0508F, -0.2238F, -0.0513F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(0.0055F, -1.4544F, -2.8034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.8205F, -0.0492F, 9.413F, -2.309F, -0.2238F, -0.0513F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(31, 37).mirror().addBox(-0.0015F, -0.3417F, -1.7774F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.2211F, 0.4998F, 11.294F, -1.8389F, -0.2407F, -0.0466F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(31, 43).mirror().addBox(-0.0015F, -3.7873F, -1.8345F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8205F, -0.0492F, 9.413F, -1.6109F, -0.2238F, -0.0513F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(18, 49).mirror().addBox(0.0015F, 1.4799F, -2.9447F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8205F, -0.0492F, 9.413F, -2.9635F, -0.2238F, -0.0513F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(66, 82).mirror().addBox(0.0015F, -2.1511F, -3.6737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-1.8205F, -0.0492F, 9.413F, -1.96F, -0.2238F, -0.0513F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(0.0015F, -4.1969F, -0.7136F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8205F, -0.0492F, 9.413F, -1.0873F, -0.2238F, -0.0513F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(68, 68).mirror().addBox(-0.826F, -3.9421F, 0.2072F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0182F, 1.5882F, 5.8265F, 0.8977F, 0.9844F, 0.9476F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(82, 74).mirror().addBox(-0.025F, 0.0037F, -1.0251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7247F, -2.5155F, 5.7678F, 0.232F, -0.2225F, 0.0084F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(61, 66).mirror().addBox(-0.125F, 0.0037F, -0.0251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0565F, -2.91F, 7.7028F, -0.0298F, -0.2225F, 0.0084F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(54, 66).mirror().addBox(-0.125F, 0.0037F, -2.0251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0565F, -2.91F, 7.7028F, 0.1971F, -0.2225F, 0.0084F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.485F, -0.3727F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r304 = Jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(0.0243F, -0.4923F, -3.3049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7283F, -1.4501F, -2.6981F, 1.0559F, -0.1833F, 0.0349F));

		PartDefinition cube_r305 = Jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(71, 85).mirror().addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4504F, 1.0196F, -0.1145F, 0.0087F, -0.096F, 0.0F));

		PartDefinition cube_r306 = Jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(85, 66).mirror().addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3933F, 0.2817F, -0.7079F, -0.1658F, -0.096F, 0.0F));

		PartDefinition cube_r307 = Jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(47, 72).mirror().addBox(-0.9633F, -2.4374F, -1.8828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2717F, 0.4499F, -9.4981F, 0.2405F, -0.0437F, 0.0344F));

		PartDefinition cube_r308 = Jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-0.6087F, -0.9958F, -0.4957F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.799F, -9.9824F, -0.065F, -0.0371F, 0.0414F));

		PartDefinition cube_r309 = Jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(74, 71).addBox(-0.3913F, -0.9958F, -0.4957F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.799F, -9.9824F, -0.065F, 0.0371F, -0.0414F));

		PartDefinition cube_r310 = Jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-0.9633F, -2.1455F, -1.4455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2717F, 0.4499F, -9.4981F, 0.1096F, -0.0437F, 0.0344F));

		PartDefinition cube_r311 = Jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-0.9825F, -1.382F, -2.5942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 57).mirror().addBox(-0.9825F, -1.382F, -1.8942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, 0.1072F, -0.1135F, 0.0345F));

		PartDefinition cube_r312 = Jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(57, 74).mirror().addBox(-0.9825F, -1.5016F, -1.1469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, 0.1944F, -0.1135F, 0.0345F));

		PartDefinition cube_r313 = Jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(84, 70).mirror().addBox(0.0243F, -1.2092F, -4.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(20, 84).mirror().addBox(0.0243F, -0.5092F, -4.6292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7283F, -1.4501F, -2.6981F, 0.3665F, -0.1833F, 0.0349F));

		PartDefinition cube_r314 = Jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-0.9633F, -2.4403F, -0.2427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 55).mirror().addBox(-0.9633F, -1.9403F, -0.2427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2717F, 0.4499F, -9.4981F, 1.3139F, -0.0437F, 0.0344F));

		PartDefinition cube_r315 = Jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(0.0243F, -2.1983F, 2.5818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7283F, -1.4501F, -2.6981F, -2.9671F, -0.1833F, 0.0349F));

		PartDefinition cube_r316 = Jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-0.9825F, -0.0752F, 0.1253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, -1.5247F, -0.1135F, 0.0345F));

		PartDefinition cube_r317 = Jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(66, 85).mirror().addBox(-0.9825F, 1.9296F, -0.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, -1.0011F, -0.1135F, 0.0345F));

		PartDefinition cube_r318 = Jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-0.9825F, 0.0801F, -3.0629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, -0.2157F, -0.1135F, 0.0345F));

		PartDefinition cube_r319 = Jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(76, 53).mirror().addBox(-0.9633F, -0.5125F, -0.81F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2717F, 0.4499F, -9.4981F, -0.2133F, -0.0437F, 0.0344F));

		PartDefinition cube_r320 = Jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(67, 75).mirror().addBox(-0.9633F, -1.3812F, -1.5767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2717F, 0.4499F, -9.4981F, 0.4848F, -0.0437F, 0.0344F));

		PartDefinition cube_r321 = Jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(51, 84).mirror().addBox(-0.9633F, -0.4642F, 0.0819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2717F, 0.4499F, -9.4981F, 2.6665F, -0.0437F, 0.0344F));

		PartDefinition cube_r322 = Jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.9825F, -1.7491F, 1.8877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, 2.6641F, -0.1135F, 0.0345F));

		PartDefinition cube_r323 = Jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-0.9825F, 1.364F, -0.4539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, -1.5422F, -0.1135F, 0.0345F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.9825F, -0.2863F, -0.6925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0283F, 0.4499F, -6.6981F, -1.3676F, -0.1135F, 0.0345F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3651F, 2.1516F, -1.0011F, -2.4347F, -0.096F, 0.0F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(56, 85).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2708F, 2.3339F, -1.9798F, -1.3875F, -0.096F, 0.0F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(72, 75).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1763F, 2.1688F, -2.9615F, -0.1658F, -0.096F, 0.0F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(66, 19).mirror().addBox(-0.5F, 1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0047F, 1.271F, -4.7432F, 1.0559F, -0.096F, 0.0F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(0.0243F, -2.5851F, -2.8779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7283F, -1.4501F, -2.6981F, 1.4923F, -0.1833F, 0.0349F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(0.0243F, -1.5819F, 0.8112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7283F, -1.4501F, -2.6981F, -2.9147F, -0.1833F, 0.0349F));

		PartDefinition cube_r331 = Jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(58, 39).mirror().addBox(0.0243F, -3.6777F, -1.1998F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7283F, -1.4501F, -2.6981F, 2.0159F, -0.1833F, 0.0349F));

		PartDefinition cube_r332 = Jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(42, 66).mirror().addBox(0.0243F, -0.0881F, -0.0361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7283F, -1.4501F, -2.6981F, -1.7802F, -0.1833F, 0.0349F));

		PartDefinition cube_r333 = Jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(39, 22).mirror().addBox(-0.5F, 0.0F, -0.15F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2277F, -1.3877F, -2.4279F, -0.5585F, -0.096F, 0.0F));

		PartDefinition cube_r334 = Jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(52, 74).addBox(-1.0243F, -1.5819F, 0.8112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7283F, -1.4501F, -2.6981F, -2.9147F, 0.1833F, -0.0349F));

		PartDefinition cube_r335 = Jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(66, 23).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3651F, 2.1516F, -1.0011F, -2.4347F, 0.096F, 0.0F));

		PartDefinition cube_r336 = Jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(56, 85).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2708F, 2.3339F, -1.9798F, -1.3875F, 0.096F, 0.0F));

		PartDefinition cube_r337 = Jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(72, 75).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1763F, 2.1688F, -2.9615F, -0.1658F, 0.096F, 0.0F));

		PartDefinition cube_r338 = Jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(35, 66).addBox(-1.0243F, -0.4923F, -3.3049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7283F, -1.4501F, -2.6981F, 1.0559F, 0.1833F, -0.0349F));

		PartDefinition cube_r339 = Jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(66, 19).addBox(-0.5F, 1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0047F, 1.271F, -4.7432F, 1.0559F, 0.096F, 0.0F));

		PartDefinition cube_r340 = Jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(40, 83).addBox(-1.0243F, -2.5851F, -2.8779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7283F, -1.4501F, -2.6981F, 1.4923F, 0.1833F, -0.0349F));

		PartDefinition cube_r341 = Jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(66, 27).addBox(-1.0243F, -2.1983F, 2.5818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7283F, -1.4501F, -2.6981F, -2.9671F, 0.1833F, -0.0349F));

		PartDefinition cube_r342 = Jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(77, 39).addBox(-0.0175F, -0.0752F, 0.1253F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, -1.5247F, 0.1135F, -0.0345F));

		PartDefinition cube_r343 = Jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(66, 85).addBox(-0.0175F, 1.9296F, -0.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, -1.0011F, 0.1135F, -0.0345F));

		PartDefinition cube_r344 = Jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(76, 14).addBox(-0.0175F, 0.0801F, -3.0629F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, -0.2157F, 0.1135F, -0.0345F));

		PartDefinition cube_r345 = Jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(76, 53).addBox(-0.0367F, -0.5125F, -0.81F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2717F, 0.4499F, -9.4981F, -0.2133F, 0.0437F, -0.0344F));

		PartDefinition cube_r346 = Jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(67, 75).addBox(-0.0367F, -1.3812F, -1.5767F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2717F, 0.4499F, -9.4981F, 0.4848F, 0.0437F, -0.0344F));

		PartDefinition cube_r347 = Jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(84, 58).addBox(-0.0367F, -2.4403F, -0.2427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 55).addBox(-0.0367F, -1.9403F, -0.2427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2717F, 0.4499F, -9.4981F, 1.3139F, 0.0437F, -0.0344F));

		PartDefinition cube_r348 = Jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(51, 84).addBox(-0.0367F, -0.4642F, 0.0819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2717F, 0.4499F, -9.4981F, 2.6665F, 0.0437F, -0.0344F));

		PartDefinition cube_r349 = Jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(35, 84).addBox(-0.0175F, -1.7491F, 1.8877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, 2.6641F, 0.1135F, -0.0345F));

		PartDefinition cube_r350 = Jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(80, 6).addBox(-0.0175F, 1.364F, -0.4539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, -1.5422F, 0.1135F, -0.0345F));

		PartDefinition cube_r351 = Jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 71).addBox(-0.0175F, -0.2863F, -0.6925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, -1.3676F, 0.1135F, -0.0345F));

		PartDefinition cube_r352 = Jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(47, 72).addBox(-0.0367F, -2.4374F, -1.8828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2717F, 0.4499F, -9.4981F, 0.2405F, 0.0437F, -0.0344F));

		PartDefinition cube_r353 = Jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(74, 71).addBox(-0.0367F, -2.1455F, -1.4455F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2717F, 0.4499F, -9.4981F, 0.1096F, 0.0437F, -0.0344F));

		PartDefinition cube_r354 = Jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(74, 61).addBox(-0.0175F, -1.382F, -2.5942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 57).addBox(-0.0175F, -1.382F, -1.8942F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, 0.1072F, 0.1135F, -0.0345F));

		PartDefinition cube_r355 = Jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(57, 74).addBox(-0.0175F, -1.5016F, -1.1469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0283F, 0.4499F, -6.6981F, 0.1944F, 0.1135F, -0.0345F));

		PartDefinition cube_r356 = Jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(84, 70).addBox(-1.0243F, -1.2092F, -4.9292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(20, 84).addBox(-1.0243F, -0.5092F, -4.6292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7283F, -1.4501F, -2.6981F, 0.3665F, 0.1833F, -0.0349F));

		PartDefinition cube_r357 = Jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(58, 39).addBox(-1.0243F, -3.6777F, -1.1998F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7283F, -1.4501F, -2.6981F, 2.0159F, 0.1833F, -0.0349F));

		PartDefinition cube_r358 = Jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(42, 66).addBox(-1.0243F, -0.0881F, -0.0361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7283F, -1.4501F, -2.6981F, -1.7802F, 0.1833F, -0.0349F));

		PartDefinition cube_r359 = Jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(71, 85).addBox(-0.5F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4504F, 1.0196F, -0.1145F, 0.0087F, 0.096F, 0.0F));

		PartDefinition cube_r360 = Jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(85, 66).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3933F, 0.2817F, -0.7079F, -0.1658F, 0.096F, 0.0F));

		PartDefinition cube_r361 = Jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(39, 22).addBox(-0.5F, 0.0F, -0.15F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2277F, -1.3877F, -2.4279F, -0.5585F, 0.096F, 0.0F));

		PartDefinition RFrontLeg2 = chest.addOrReplaceChild("RFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9898F, 7.3808F, -2.2881F, 0.4331F, -0.0552F, 0.1188F));

		PartDefinition cube_r362 = RFrontLeg2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(10, 75).addBox(-0.5F, -1.475F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.5171F, 5.2763F, 0.2463F, 1.6668F, 0.0F, -0.48F));

		PartDefinition cube_r363 = RFrontLeg2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(49, 67).addBox(-0.5F, -1.925F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3717F, 4.9971F, 0.2763F, 0.096F, 0.0F, -0.48F));

		PartDefinition cube_r364 = RFrontLeg2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(68, 5).addBox(-0.5F, -0.925F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9073F, 4.1049F, -0.1877F, -0.4102F, 0.0F, -0.48F));

		PartDefinition cube_r365 = RFrontLeg2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(59, 79).addBox(-0.5037F, -0.8023F, 0.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0235F, 0.4781F, 0.4046F, 0.8378F, 0.0F, -0.48F));

		PartDefinition cube_r366 = RFrontLeg2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2136F, 0.0307F, 0.1156F, 2.1031F, 0.0F, -0.48F));

		PartDefinition cube_r367 = RFrontLeg2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(32, 70).addBox(-0.5037F, -0.6679F, -0.7397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0235F, 0.4781F, 0.4046F, 0.096F, 0.0F, -0.48F));

		PartDefinition cube_r368 = RFrontLeg2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(12, 60).addBox(-1.25F, -2.5F, -0.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5592F, 1.8119F, -0.1312F, -0.1222F, 0.0F, -0.48F));

		PartDefinition LowerRFrontLeg2 = RFrontLeg2.addOrReplaceChild("LowerRFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.349F, 6.471F, -0.5626F, -0.5755F, -0.053F, -0.0491F));

		PartDefinition cube_r369 = LowerRFrontLeg2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(56, 3).addBox(-1.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 55).addBox(0.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3819F, 3.4011F, -0.3955F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r370 = LowerRFrontLeg2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(15, 75).addBox(-0.35F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1513F, -0.3718F, 0.4409F, -0.2084F, -0.0651F, -0.2986F));

		PartDefinition RFrontFoot2 = LowerRFrontLeg2.addOrReplaceChild("RFrontFoot2", CubeListBuilder.create().texOffs(34, 0).addBox(-1.7F, -0.3177F, -2.4867F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2091F, 5.8005F, -0.9832F, 1.0818F, 0.0182F, -0.0487F));

		PartDefinition RFrontFoot3 = RFrontFoot2.addOrReplaceChild("RFrontFoot3", CubeListBuilder.create().texOffs(0, 16).addBox(-1.4F, -0.9656F, -5.0007F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, 0.7018F, -2.4235F, -0.9163F, 0.0F, 0.0F));

		PartDefinition RFrontLeg3 = chest.addOrReplaceChild("RFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9898F, 7.3808F, -2.2881F, 1.1312F, 0.0552F, -0.1188F));

		PartDefinition cube_r371 = RFrontLeg3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(75, 43).addBox(-0.5F, -1.475F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-2.5171F, 5.2763F, 0.2463F, 1.6668F, 0.0F, 0.48F));

		PartDefinition cube_r372 = RFrontLeg3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -1.925F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3717F, 4.9971F, 0.2763F, 0.096F, 0.0F, 0.48F));

		PartDefinition cube_r373 = RFrontLeg3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(17, 68).addBox(-0.5F, -0.925F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9073F, 4.1049F, -0.1877F, -0.4102F, 0.0F, 0.48F));

		PartDefinition cube_r374 = RFrontLeg3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(79, 60).addBox(-0.4963F, -0.8023F, 0.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0235F, 0.4781F, 0.4046F, 0.8378F, 0.0F, 0.48F));

		PartDefinition cube_r375 = RFrontLeg3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(10, 79).addBox(-0.5F, -0.4F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2136F, 0.0307F, 0.1156F, 2.1031F, 0.0F, 0.48F));

		PartDefinition cube_r376 = RFrontLeg3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(37, 70).addBox(-0.4963F, -0.6679F, -0.7397F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0235F, 0.4781F, 0.4046F, 0.096F, 0.0F, 0.48F));

		PartDefinition cube_r377 = RFrontLeg3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(49, 61).addBox(0.25F, -2.5F, -0.125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5592F, 1.8119F, -0.1312F, -0.1222F, 0.0F, 0.48F));

		PartDefinition LowerRFrontLeg3 = RFrontLeg3.addOrReplaceChild("LowerRFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.349F, 6.471F, -0.5626F, -0.5755F, 0.053F, 0.0491F));

		PartDefinition cube_r378 = LowerRFrontLeg3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 58).addBox(-1.4F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3819F, 3.4011F, -0.3955F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r379 = LowerRFrontLeg3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(62, 75).addBox(-0.65F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1513F, -0.3718F, 0.4409F, -0.2084F, 0.0651F, 0.2986F));

		PartDefinition RFrontFoot4 = LowerRFrontLeg3.addOrReplaceChild("RFrontFoot4", CubeListBuilder.create().texOffs(34, 5).addBox(-1.3F, -0.3177F, -2.4867F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2091F, 5.8005F, -0.9832F, 1.0818F, -0.0182F, 0.0487F));

		PartDefinition RFrontFoot5 = RFrontFoot4.addOrReplaceChild("RFrontFoot5", CubeListBuilder.create().texOffs(17, 16).addBox(-1.6F, -0.9656F, -5.0007F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 0.7018F, -2.4235F, -0.9163F, 0.0F, 0.0F));

		PartDefinition sacrum = main.addOrReplaceChild("sacrum", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1155F, -1.8179F));

		PartDefinition cube_r380 = sacrum.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(73, 25).addBox(-1.1F, -1.1111F, 1.5522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, -2.6529F, 0.0F, 0.3491F));

		PartDefinition cube_r381 = sacrum.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(24, 73).addBox(-1.1F, -2.7918F, 1.001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(22, 37).addBox(-1.1F, -2.7918F, -1.499F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 2.9758F, 0.0F, 0.3491F));

		PartDefinition cube_r382 = sacrum.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(49, 78).addBox(-1.1F, -0.9725F, -3.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 0.8901F, 0.0F, 0.3491F));

		PartDefinition cube_r383 = sacrum.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(35, 78).addBox(-1.1F, 0.1276F, -3.9481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 0.5411F, 0.0F, 0.3491F));

		PartDefinition cube_r384 = sacrum.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(54, 78).addBox(-1.1F, 5.7928F, -3.5322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, -0.637F, 0.0F, 0.3491F));

		PartDefinition cube_r385 = sacrum.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(34, 10).addBox(-1.1F, 1.6288F, -6.5987F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 0.1484F, 0.0F, 0.3491F));

		PartDefinition cube_r386 = sacrum.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(23, 60).addBox(-1.1F, 1.7671F, -6.6641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 0.1833F, 0.0F, 0.3491F));

		PartDefinition cube_r387 = sacrum.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(60, 58).addBox(-1.1F, 2.1668F, -4.5152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 0.096F, 0.0F, 0.3491F));

		PartDefinition cube_r388 = sacrum.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(57, 17).addBox(-1.1F, -0.2241F, 1.9366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, -1.8239F, 0.0F, 0.3491F));

		PartDefinition cube_r389 = sacrum.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(56, 46).addBox(-1.1F, -3.7191F, 1.193F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(53, 34).addBox(-1.1F, -3.4199F, -0.7001F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, -2.522F, 0.0F, 0.3491F));

		PartDefinition cube_r390 = sacrum.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(15, 82).addBox(-1.1F, -4.5495F, -2.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 2.6704F, 0.0F, 0.3491F));

		PartDefinition cube_r391 = sacrum.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(60, 62).addBox(-1.1F, 0.4047F, -5.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 1.5795F, 0.0F, 0.3491F));

		PartDefinition cube_r392 = sacrum.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(71, 53).addBox(-1.1F, 3.5149F, -0.266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, 0.3142F, 0.0F, 0.3491F));

		PartDefinition cube_r393 = sacrum.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(29, 74).addBox(-1.1F, -2.0079F, 4.5635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, -1.1257F, 0.0F, 0.3491F));

		PartDefinition cube_r394 = sacrum.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(54, 10).addBox(-1.1F, 0.1089F, 2.9845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.7745F, 2.3664F, -0.6894F, 0.0F, 0.3491F));

		PartDefinition cube_r395 = sacrum.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(48, 23).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, 0.9166F, 3.5831F, 3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r396 = sacrum.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(10, 82).addBox(-0.5F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, -0.2128F, 4.4342F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r397 = sacrum.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, -0.5874F, 3.507F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r398 = sacrum.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(87, 73).addBox(1.5F, -0.0014F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r399 = sacrum.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(81, 52).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.4154F, 0.1236F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r400 = sacrum.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(62, 51).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, -0.5748F, -0.0155F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r401 = sacrum.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(51, 81).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.0443F, 0.8674F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r402 = sacrum.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(81, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, -1.0967F, 1.866F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r403 = sacrum.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(86, 12).addBox(-0.5F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.2835F, 2.0768F, -0.384F, 0.0F, 0.0F));

		PartDefinition sacrum2 = main.addOrReplaceChild("sacrum2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1155F, -1.8179F));

		PartDefinition cube_r404 = sacrum2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(73, 25).mirror().addBox(0.1F, -1.1111F, 1.5522F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, -2.6529F, 0.0F, -0.3491F));

		PartDefinition cube_r405 = sacrum2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(24, 73).mirror().addBox(0.1F, -2.7918F, 1.001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(22, 37).mirror().addBox(0.1F, -2.7918F, -1.499F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 2.9758F, 0.0F, -0.3491F));

		PartDefinition cube_r406 = sacrum2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(49, 78).mirror().addBox(0.1F, -0.9725F, -3.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 0.8901F, 0.0F, -0.3491F));

		PartDefinition cube_r407 = sacrum2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(0.1F, 0.1276F, -3.9481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 0.5411F, 0.0F, -0.3491F));

		PartDefinition cube_r408 = sacrum2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(54, 78).mirror().addBox(0.1F, 5.7928F, -3.5322F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, -0.637F, 0.0F, -0.3491F));

		PartDefinition cube_r409 = sacrum2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(34, 10).mirror().addBox(0.1F, 1.6288F, -6.5987F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 0.1484F, 0.0F, -0.3491F));

		PartDefinition cube_r410 = sacrum2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(0.1F, 1.7671F, -6.6641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 0.1833F, 0.0F, -0.3491F));

		PartDefinition cube_r411 = sacrum2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(0.1F, 2.1668F, -4.5152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 0.096F, 0.0F, -0.3491F));

		PartDefinition cube_r412 = sacrum2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(57, 17).mirror().addBox(0.1F, -0.2241F, 1.9366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, -1.8239F, 0.0F, -0.3491F));

		PartDefinition cube_r413 = sacrum2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(0.1F, -3.7191F, 1.193F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(53, 34).mirror().addBox(0.1F, -3.4199F, -0.7001F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, -2.522F, 0.0F, -0.3491F));

		PartDefinition cube_r414 = sacrum2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(0.1F, -4.5495F, -2.8245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 2.6704F, 0.0F, -0.3491F));

		PartDefinition cube_r415 = sacrum2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(0.1F, 0.4047F, -5.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 1.5795F, 0.0F, -0.3491F));

		PartDefinition cube_r416 = sacrum2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(0.1F, 3.5149F, -0.266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, 0.3142F, 0.0F, -0.3491F));

		PartDefinition cube_r417 = sacrum2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(29, 74).mirror().addBox(0.1F, -2.0079F, 4.5635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, -1.1257F, 0.0F, -0.3491F));

		PartDefinition cube_r418 = sacrum2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(0.1F, 0.1089F, 2.9845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.7745F, 2.3664F, -0.6894F, 0.0F, -0.3491F));

		PartDefinition cube_r419 = sacrum2.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(48, 23).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.9166F, 3.5831F, 3.1067F, 0.0F, 0.0F));

		PartDefinition cube_r420 = sacrum2.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(10, 82).mirror().addBox(-0.5F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.2128F, 4.4342F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r421 = sacrum2.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5874F, 3.507F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r422 = sacrum2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(87, 73).mirror().addBox(-2.5F, -0.0014F, 0.0292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r423 = sacrum2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.4154F, 0.1236F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r424 = sacrum2.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(62, 51).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5748F, -0.0155F, -3.002F, 0.0F, 0.0F));

		PartDefinition cube_r425 = sacrum2.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(51, 81).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.0443F, 0.8674F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r426 = sacrum2.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.0967F, 1.866F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r427 = sacrum2.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.5F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.2835F, 2.0768F, -0.384F, 0.0F, 0.0F));

		PartDefinition RBackLeg2 = main.addOrReplaceChild("RBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4734F, 1.5665F, 0.393F, 0.1811F, -0.1578F, -0.1579F));

		PartDefinition cube_r428 = RBackLeg2.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(76, 33).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 7.6727F, 1.2318F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r429 = RBackLeg2.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(58, 88).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(78, 25).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6229F, 8.1745F, 0.6008F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r430 = RBackLeg2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 6.8592F, 0.5445F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r431 = RBackLeg2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(79, 71).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(80, 0).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.6229F, 1.008F, -0.8304F, 3.0238F, 0.0F, 0.0F));

		PartDefinition cube_r432 = RBackLeg2.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(15, 79).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 2.0064F, -0.7737F, 1.6275F, 0.0F, 0.0F));

		PartDefinition cube_r433 = RBackLeg2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(70, 46).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 1.5561F, 0.4558F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r434 = RBackLeg2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6229F, 2.8526F, 0.3595F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r435 = RBackLeg2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(69, 79).addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6229F, 2.9961F, -0.6302F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r436 = RBackLeg2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(17, 62).addBox(-0.5F, -2.5F, -0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6229F, 5.2529F, 0.5778F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r437 = RBackLeg2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5F, -1.7567F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(48, 87).addBox(-0.5F, -1.7567F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6229F, 0.9167F, 0.9384F, 0.4058F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg2 = RBackLeg2.addOrReplaceChild("LowerRBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1591F, 9.1179F, 0.6124F, 1.0404F, 0.0706F, 0.194F));

		PartDefinition cube_r438 = LowerRBackLeg2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(22, 68).addBox(0.0399F, -4.0906F, -0.5106F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9849F, 3.7667F, 0.0798F, -1.1593F, 1.3594F, -1.1513F));

		PartDefinition cube_r439 = LowerRBackLeg2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(5, 69).addBox(0.5493F, -1.0108F, -0.5106F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.9849F, 3.7667F, 0.0798F, 1.4851F, -0.1978F, 1.6038F));

		PartDefinition cube_r440 = LowerRBackLeg2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(88, 24).addBox(-1.471F, -2.8527F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9849F, 3.7667F, 0.0798F, -1.3656F, -1.1463F, -1.7421F));

		PartDefinition cube_r441 = LowerRBackLeg2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(88, 18).addBox(-2.9745F, -1.177F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9849F, 3.7667F, 0.0798F, -1.4807F, -0.3674F, -1.587F));

		PartDefinition cube_r442 = LowerRBackLeg2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(63, 88).addBox(-2.9075F, -0.0866F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9849F, 3.7667F, 0.0798F, -1.4867F, 0.0239F, -1.5526F));

		PartDefinition cube_r443 = LowerRBackLeg2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(15, 88).addBox(-0.1792F, 1.3366F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 53).addBox(-0.1792F, -4.2634F, -0.5106F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.9849F, 3.7667F, 0.0798F, -0.2297F, 1.4845F, -0.2143F));

		PartDefinition cube_r444 = LowerRBackLeg2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5085F, -1.0022F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 88).addBox(-0.5085F, -0.2022F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0201F, 1.1965F, 0.7429F, 0.5542F, 1.4586F, 0.585F));

		PartDefinition cube_r445 = LowerRBackLeg2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(69, 34).addBox(3.2001F, 0.1856F, -0.5996F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0201F, 1.1965F, 0.7429F, 1.4725F, 0.2451F, 1.5749F));

		PartDefinition cube_r446 = LowerRBackLeg2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(60, 33).addBox(0.5385F, -0.404F, -0.5996F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0201F, 1.1965F, 0.7429F, 1.4752F, 0.0714F, 1.592F));

		PartDefinition RBackFoot2 = LowerRBackLeg2.addOrReplaceChild("RBackFoot2", CubeListBuilder.create().texOffs(0, 30).addBox(-1.95F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1215F, 6.5915F, -0.4797F, 0.2829F, -0.0024F, -0.0044F));

		PartDefinition RBackFoot3 = RBackFoot2.addOrReplaceChild("RBackFoot3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.65F, -1.0F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7F, 1.0F, -2.4F, -0.829F, 0.0F, 0.0F));

		PartDefinition RBackLeg3 = main.addOrReplaceChild("RBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4734F, 1.5665F, 0.393F, -0.3425F, 0.1578F, 0.1579F));

		PartDefinition cube_r447 = RBackLeg3.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(44, 76).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6229F, 7.6727F, 1.2318F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r448 = RBackLeg3.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(68, 88).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(30, 78).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6229F, 8.1745F, 0.6008F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r449 = RBackLeg3.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(12, 71).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6229F, 6.8592F, 0.5445F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r450 = RBackLeg3.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(79, 79).addBox(-0.5F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(80, 3).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.6229F, 1.008F, -0.8304F, 3.0238F, 0.0F, 0.0F));

		PartDefinition cube_r451 = RBackLeg3.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(79, 57).addBox(-0.5F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6229F, 2.0064F, -0.7737F, 1.6275F, 0.0F, 0.0F));

		PartDefinition cube_r452 = RBackLeg3.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(54, 70).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6229F, 1.5561F, 0.4558F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r453 = RBackLeg3.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(12, 66).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6229F, 2.8526F, 0.3595F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r454 = RBackLeg3.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(74, 79).addBox(-0.5F, -0.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6229F, 2.9961F, -0.6302F, 0.144F, 0.0F, 0.0F));

		PartDefinition cube_r455 = RBackLeg3.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(30, 62).addBox(-0.5F, -2.5F, -0.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6229F, 5.2529F, 0.5778F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r456 = RBackLeg3.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(87, 39).addBox(-0.5F, -1.7567F, -0.567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(87, 61).addBox(-0.5F, -1.7567F, -0.967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6229F, 0.9167F, 0.9384F, 0.4058F, 0.0F, 0.0F));

		PartDefinition LowerRBackLeg3 = RBackLeg3.addOrReplaceChild("LowerRBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1591F, 9.1179F, 0.6124F, 0.6477F, -0.0706F, -0.194F));

		PartDefinition cube_r457 = LowerRBackLeg3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(27, 68).addBox(-1.0399F, -4.0906F, -0.5106F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9849F, 3.7667F, 0.0798F, -1.1593F, -1.3594F, 1.1513F));

		PartDefinition cube_r458 = LowerRBackLeg3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(69, 31).addBox(-2.5493F, -1.0108F, -0.5106F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-0.9849F, 3.7667F, 0.0798F, 1.4851F, 0.1978F, -1.6038F));

		PartDefinition cube_r459 = LowerRBackLeg3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(53, 88).addBox(0.471F, -2.8527F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9849F, 3.7667F, 0.0798F, -1.3656F, 1.1463F, 1.7421F));

		PartDefinition cube_r460 = LowerRBackLeg3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(88, 34).addBox(1.9744F, -1.177F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9849F, 3.7667F, 0.0798F, -1.4807F, 0.3674F, 1.587F));

		PartDefinition cube_r461 = LowerRBackLeg3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(79, 88).addBox(1.9075F, -0.0866F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9849F, 3.7667F, 0.0798F, -1.4867F, -0.0239F, 1.5526F));

		PartDefinition cube_r462 = LowerRBackLeg3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(30, 88).addBox(-0.8208F, 1.3366F, -0.5106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 54).addBox(-0.8208F, -4.2634F, -0.5106F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.9849F, 3.7667F, 0.0798F, -0.2297F, -1.4845F, 0.2143F));

		PartDefinition cube_r463 = LowerRBackLeg3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(88, 27).addBox(-0.4915F, -1.0022F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(25, 88).addBox(-0.4915F, -0.2022F, -0.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0201F, 1.1965F, 0.7429F, 0.5542F, -1.4586F, -0.585F));

		PartDefinition cube_r464 = LowerRBackLeg3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(69, 50).addBox(-5.2001F, 0.1856F, -0.5996F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0201F, 1.1965F, 0.7429F, 1.4725F, -0.2451F, -1.5749F));

		PartDefinition cube_r465 = LowerRBackLeg3.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(60, 36).addBox(-3.5385F, -0.404F, -0.5996F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0201F, 1.1965F, 0.7429F, 1.4752F, -0.0714F, -1.592F));

		PartDefinition RBackFoot4 = LowerRBackLeg3.addOrReplaceChild("RBackFoot4", CubeListBuilder.create().texOffs(15, 30).addBox(-2.05F, 0.0F, -2.4F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1215F, 6.5915F, -0.4797F, 0.5447F, 0.0024F, 0.0044F));

		PartDefinition RBackFoot5 = RBackFoot4.addOrReplaceChild("RBackFoot5", CubeListBuilder.create().texOffs(0, 8).addBox(-1.35F, -1.0F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7F, 1.0F, -2.4F, -0.829F, -0.0022F, -0.0026F));

		PartDefinition Tail = main.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2839F, 2.806F, -0.3216F, 0.0F, 0.0F));

		PartDefinition cube_r466 = Tail.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(18, 41).addBox(0.0F, -0.2512F, -0.0878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.8076F, 0.8829F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Tail.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(48, 90).addBox(0.0F, -1.5762F, -0.0878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, 1.0393F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Tail.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(89, 85).mirror().addBox(-0.9F, -0.1046F, -0.0037F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2664F, 0.9238F, -0.0699F, 0.0522F, -0.0037F));

		PartDefinition cube_r469 = Tail.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(89, 85).addBox(-0.1F, -0.1046F, -0.0037F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2664F, 0.9238F, -0.0699F, -0.0522F, 0.0037F));

		PartDefinition cube_r470 = Tail.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(45, 10).addBox(-0.5F, -0.5F, 3.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1801F, -3.9607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(9, 46).addBox(-1.0F, -0.4882F, -0.0833F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(76, 90).addBox(-0.5F, -1.8882F, -0.0833F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, 2.916F, -0.1806F, 0.0F, 0.0F));

		PartDefinition cube_r471 = Tail2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(23, 91).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4383F, 1.9167F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r472 = Tail2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(32, 91).addBox(0.0F, 0.3F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(29, 91).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.7383F, 0.5922F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r473 = Tail2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(90, 21).mirror().addBox(-0.9F, -4.75F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 21).mirror().addBox(-0.9F, -4.75F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.7618F, 0.9167F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r474 = Tail2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(90, 21).addBox(-0.1F, -4.75F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 21).addBox(-0.1F, -4.75F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7618F, 0.9167F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(38, 46).addBox(-1.0F, -0.4883F, 0.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0065F, 2.8504F, -0.132F, -0.1298F, 0.0172F));

		PartDefinition cube_r475 = Tail3.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(87, 90).addBox(0.0F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4383F, 1.0167F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r476 = Tail3.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(65, 0).addBox(0.0F, -0.2F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.7383F, 1.6923F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r477 = Tail3.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(90, 42).mirror().addBox(-0.8F, -4.75F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 4.7617F, 1.0167F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r478 = Tail3.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(90, 42).addBox(-0.2F, -4.75F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7617F, 1.0167F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, 0.0117F, 0.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(90, 90).addBox(-0.5F, -1.0132F, 0.0167F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.124F, -0.1732F, 0.0215F));

		PartDefinition cube_r479 = Tail4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(60, 91).addBox(0.0F, -1.075F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0617F, 1.0167F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r480 = Tail4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(90, 66).mirror().addBox(-0.7F, -4.75F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 66).mirror().addBox(-0.7F, -4.75F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 5.2617F, 1.0167F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r481 = Tail4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(90, 66).addBox(-0.3F, -4.75F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 66).addBox(-0.3F, -4.75F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 5.2617F, 1.0167F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(9, 41).addBox(-1.0F, 0.0117F, 0.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1232F, -0.1299F, 0.016F));

		PartDefinition cube_r482 = Tail5.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(91, 52).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0617F, 1.0167F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(47, 0).addBox(-1.0F, -0.9883F, 0.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition cube_r483 = Tail6.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(57, 91).addBox(0.0F, -0.45F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9383F, 1.0167F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(47, 5).addBox(-1.0F, -0.9883F, 0.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.1329F, -0.173F, -0.023F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(47, 46).addBox(-1.0F, -0.9883F, 0.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3289F, 0.3736F, 0.1239F));

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