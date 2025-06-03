package fossils.fossils.client.blockentity.model.teraterpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TeraterpetonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hip;
	private final ModelPart lowerbody;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart tail;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart tail2;
	private final ModelPart cube_r24;
	private final ModelPart cube_r25;
	private final ModelPart tail3;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart cube_r31;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart cube_r34;
	private final ModelPart cube_r35;
	private final ModelPart cube_r36;
	private final ModelPart cube_r37;
	private final ModelPart cube_r38;
	private final ModelPart cube_r39;
	private final ModelPart cube_r40;
	private final ModelPart cube_r41;
	private final ModelPart cube_r42;
	private final ModelPart cube_r43;
	private final ModelPart cube_r44;
	private final ModelPart cube_r45;
	private final ModelPart cube_r46;
	private final ModelPart cube_r47;
	private final ModelPart cube_r48;
	private final ModelPart body2;
	private final ModelPart cube_r49;
	private final ModelPart cube_r50;
	private final ModelPart cube_r51;
	private final ModelPart cube_r52;
	private final ModelPart cube_r53;
	private final ModelPart cube_r54;
	private final ModelPart cube_r55;
	private final ModelPart cube_r56;
	private final ModelPart cube_r57;
	private final ModelPart cube_r58;
	private final ModelPart cube_r59;
	private final ModelPart cube_r60;
	private final ModelPart cube_r61;
	private final ModelPart cube_r62;
	private final ModelPart cube_r63;
	private final ModelPart cube_r64;
	private final ModelPart cube_r65;
	private final ModelPart cube_r66;
	private final ModelPart cube_r67;
	private final ModelPart cube_r68;
	private final ModelPart cube_r69;
	private final ModelPart cube_r70;
	private final ModelPart cube_r71;
	private final ModelPart cube_r72;
	private final ModelPart armL;
	private final ModelPart cube_r73;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart cube_r74;
	private final ModelPart cube_r75;
	private final ModelPart cube_r76;
	private final ModelPart cube_r77;
	private final ModelPart cube_r78;
	private final ModelPart armL4;
	private final ModelPart cube_r79;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart cube_r80;
	private final ModelPart cube_r81;
	private final ModelPart cube_r82;
	private final ModelPart cube_r83;
	private final ModelPart cube_r84;
	private final ModelPart neck;
	private final ModelPart cube_r85;
	private final ModelPart cube_r86;
	private final ModelPart cube_r87;
	private final ModelPart cube_r88;
	private final ModelPart cube_r89;
	private final ModelPart neck2;
	private final ModelPart cube_r90;
	private final ModelPart cube_r91;
	private final ModelPart cube_r92;
	private final ModelPart head;
	private final ModelPart cube_r93;
	private final ModelPart cube_r94;
	private final ModelPart cube_r95;
	private final ModelPart cube_r96;
	private final ModelPart cube_r97;
	private final ModelPart cube_r98;
	private final ModelPart cube_r99;
	private final ModelPart cube_r100;
	private final ModelPart cube_r101;
	private final ModelPart cube_r102;
	private final ModelPart cube_r103;
	private final ModelPart cube_r104;
	private final ModelPart cube_r105;
	private final ModelPart cube_r106;
	private final ModelPart cube_r107;
	private final ModelPart cube_r108;
	private final ModelPart cube_r109;
	private final ModelPart cube_r110;
	private final ModelPart cube_r111;
	private final ModelPart cube_r112;
	private final ModelPart cube_r113;
	private final ModelPart cube_r114;
	private final ModelPart cube_r115;
	private final ModelPart cube_r116;
	private final ModelPart cube_r117;
	private final ModelPart cube_r118;
	private final ModelPart cube_r119;
	private final ModelPart cube_r120;
	private final ModelPart cube_r121;
	private final ModelPart cube_r122;
	private final ModelPart jaw;
	private final ModelPart cube_r123;
	private final ModelPart cube_r124;
	private final ModelPart cube_r125;
	private final ModelPart cube_r126;
	private final ModelPart cube_r127;
	private final ModelPart cube_r128;
	private final ModelPart cube_r129;
	private final ModelPart cube_r130;
	private final ModelPart cube_r131;

	public TeraterpetonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hip = this.fossil.getChild("hip");
		this.lowerbody = this.hip.getChild("lowerbody");
		this.cube_r1 = this.lowerbody.getChild("cube_r1");
		this.cube_r2 = this.lowerbody.getChild("cube_r2");
		this.cube_r3 = this.lowerbody.getChild("cube_r3");
		this.cube_r4 = this.lowerbody.getChild("cube_r4");
		this.cube_r5 = this.lowerbody.getChild("cube_r5");
		this.cube_r6 = this.lowerbody.getChild("cube_r6");
		this.cube_r7 = this.lowerbody.getChild("cube_r7");
		this.cube_r8 = this.lowerbody.getChild("cube_r8");
		this.cube_r9 = this.lowerbody.getChild("cube_r9");
		this.cube_r10 = this.lowerbody.getChild("cube_r10");
		this.legL = this.lowerbody.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.cube_r11 = this.legL3.getChild("cube_r11");
		this.cube_r12 = this.legL3.getChild("cube_r12");
		this.cube_r13 = this.legL3.getChild("cube_r13");
		this.cube_r14 = this.legL3.getChild("cube_r14");
		this.cube_r15 = this.legL3.getChild("cube_r15");
		this.legL4 = this.lowerbody.getChild("legL4");
		this.legL5 = this.legL4.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.cube_r16 = this.legL6.getChild("cube_r16");
		this.cube_r17 = this.legL6.getChild("cube_r17");
		this.cube_r18 = this.legL6.getChild("cube_r18");
		this.cube_r19 = this.legL6.getChild("cube_r19");
		this.cube_r20 = this.legL6.getChild("cube_r20");
		this.tail = this.lowerbody.getChild("tail");
		this.cube_r21 = this.tail.getChild("cube_r21");
		this.cube_r22 = this.tail.getChild("cube_r22");
		this.cube_r23 = this.tail.getChild("cube_r23");
		this.tail2 = this.tail.getChild("tail2");
		this.cube_r24 = this.tail2.getChild("cube_r24");
		this.cube_r25 = this.tail2.getChild("cube_r25");
		this.tail3 = this.tail2.getChild("tail3");
		this.cube_r26 = this.tail3.getChild("cube_r26");
		this.cube_r27 = this.tail3.getChild("cube_r27");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hip.getChild("body");
		this.cube_r28 = this.body.getChild("cube_r28");
		this.cube_r29 = this.body.getChild("cube_r29");
		this.cube_r30 = this.body.getChild("cube_r30");
		this.cube_r31 = this.body.getChild("cube_r31");
		this.cube_r32 = this.body.getChild("cube_r32");
		this.cube_r33 = this.body.getChild("cube_r33");
		this.cube_r34 = this.body.getChild("cube_r34");
		this.cube_r35 = this.body.getChild("cube_r35");
		this.cube_r36 = this.body.getChild("cube_r36");
		this.cube_r37 = this.body.getChild("cube_r37");
		this.cube_r38 = this.body.getChild("cube_r38");
		this.cube_r39 = this.body.getChild("cube_r39");
		this.cube_r40 = this.body.getChild("cube_r40");
		this.cube_r41 = this.body.getChild("cube_r41");
		this.cube_r42 = this.body.getChild("cube_r42");
		this.cube_r43 = this.body.getChild("cube_r43");
		this.cube_r44 = this.body.getChild("cube_r44");
		this.cube_r45 = this.body.getChild("cube_r45");
		this.cube_r46 = this.body.getChild("cube_r46");
		this.cube_r47 = this.body.getChild("cube_r47");
		this.cube_r48 = this.body.getChild("cube_r48");
		this.body2 = this.body.getChild("body2");
		this.cube_r49 = this.body2.getChild("cube_r49");
		this.cube_r50 = this.body2.getChild("cube_r50");
		this.cube_r51 = this.body2.getChild("cube_r51");
		this.cube_r52 = this.body2.getChild("cube_r52");
		this.cube_r53 = this.body2.getChild("cube_r53");
		this.cube_r54 = this.body2.getChild("cube_r54");
		this.cube_r55 = this.body2.getChild("cube_r55");
		this.cube_r56 = this.body2.getChild("cube_r56");
		this.cube_r57 = this.body2.getChild("cube_r57");
		this.cube_r58 = this.body2.getChild("cube_r58");
		this.cube_r59 = this.body2.getChild("cube_r59");
		this.cube_r60 = this.body2.getChild("cube_r60");
		this.cube_r61 = this.body2.getChild("cube_r61");
		this.cube_r62 = this.body2.getChild("cube_r62");
		this.cube_r63 = this.body2.getChild("cube_r63");
		this.cube_r64 = this.body2.getChild("cube_r64");
		this.cube_r65 = this.body2.getChild("cube_r65");
		this.cube_r66 = this.body2.getChild("cube_r66");
		this.cube_r67 = this.body2.getChild("cube_r67");
		this.cube_r68 = this.body2.getChild("cube_r68");
		this.cube_r69 = this.body2.getChild("cube_r69");
		this.cube_r70 = this.body2.getChild("cube_r70");
		this.cube_r71 = this.body2.getChild("cube_r71");
		this.cube_r72 = this.body2.getChild("cube_r72");
		this.armL = this.body2.getChild("armL");
		this.cube_r73 = this.armL.getChild("cube_r73");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.cube_r74 = this.armL3.getChild("cube_r74");
		this.cube_r75 = this.armL3.getChild("cube_r75");
		this.cube_r76 = this.armL3.getChild("cube_r76");
		this.cube_r77 = this.armL3.getChild("cube_r77");
		this.cube_r78 = this.armL3.getChild("cube_r78");
		this.armL4 = this.body2.getChild("armL4");
		this.cube_r79 = this.armL4.getChild("cube_r79");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.cube_r80 = this.armL6.getChild("cube_r80");
		this.cube_r81 = this.armL6.getChild("cube_r81");
		this.cube_r82 = this.armL6.getChild("cube_r82");
		this.cube_r83 = this.armL6.getChild("cube_r83");
		this.cube_r84 = this.armL6.getChild("cube_r84");
		this.neck = this.body2.getChild("neck");
		this.cube_r85 = this.neck.getChild("cube_r85");
		this.cube_r86 = this.neck.getChild("cube_r86");
		this.cube_r87 = this.neck.getChild("cube_r87");
		this.cube_r88 = this.neck.getChild("cube_r88");
		this.cube_r89 = this.neck.getChild("cube_r89");
		this.neck2 = this.neck.getChild("neck2");
		this.cube_r90 = this.neck2.getChild("cube_r90");
		this.cube_r91 = this.neck2.getChild("cube_r91");
		this.cube_r92 = this.neck2.getChild("cube_r92");
		this.head = this.neck2.getChild("head");
		this.cube_r93 = this.head.getChild("cube_r93");
		this.cube_r94 = this.head.getChild("cube_r94");
		this.cube_r95 = this.head.getChild("cube_r95");
		this.cube_r96 = this.head.getChild("cube_r96");
		this.cube_r97 = this.head.getChild("cube_r97");
		this.cube_r98 = this.head.getChild("cube_r98");
		this.cube_r99 = this.head.getChild("cube_r99");
		this.cube_r100 = this.head.getChild("cube_r100");
		this.cube_r101 = this.head.getChild("cube_r101");
		this.cube_r102 = this.head.getChild("cube_r102");
		this.cube_r103 = this.head.getChild("cube_r103");
		this.cube_r104 = this.head.getChild("cube_r104");
		this.cube_r105 = this.head.getChild("cube_r105");
		this.cube_r106 = this.head.getChild("cube_r106");
		this.cube_r107 = this.head.getChild("cube_r107");
		this.cube_r108 = this.head.getChild("cube_r108");
		this.cube_r109 = this.head.getChild("cube_r109");
		this.cube_r110 = this.head.getChild("cube_r110");
		this.cube_r111 = this.head.getChild("cube_r111");
		this.cube_r112 = this.head.getChild("cube_r112");
		this.cube_r113 = this.head.getChild("cube_r113");
		this.cube_r114 = this.head.getChild("cube_r114");
		this.cube_r115 = this.head.getChild("cube_r115");
		this.cube_r116 = this.head.getChild("cube_r116");
		this.cube_r117 = this.head.getChild("cube_r117");
		this.cube_r118 = this.head.getChild("cube_r118");
		this.cube_r119 = this.head.getChild("cube_r119");
		this.cube_r120 = this.head.getChild("cube_r120");
		this.cube_r121 = this.head.getChild("cube_r121");
		this.cube_r122 = this.head.getChild("cube_r122");
		this.jaw = this.head.getChild("jaw");
		this.cube_r123 = this.jaw.getChild("cube_r123");
		this.cube_r124 = this.jaw.getChild("cube_r124");
		this.cube_r125 = this.jaw.getChild("cube_r125");
		this.cube_r126 = this.jaw.getChild("cube_r126");
		this.cube_r127 = this.jaw.getChild("cube_r127");
		this.cube_r128 = this.jaw.getChild("cube_r128");
		this.cube_r129 = this.jaw.getChild("cube_r129");
		this.cube_r130 = this.jaw.getChild("cube_r130");
		this.cube_r131 = this.jaw.getChild("cube_r131");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hip = fossil.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, -4.5F, 7.0F));

		PartDefinition lowerbody = hip.addOrReplaceChild("lowerbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1F, -3.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = lowerbody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 45).addBox(0.0F, -1.1473F, 0.0064F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 60).addBox(0.0F, -0.9473F, 2.0064F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 51).mirror().addBox(-1.5F, 0.5527F, 0.7064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 51).addBox(0.5F, 0.5527F, 0.7064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 30).addBox(-0.5F, 0.0527F, 0.0064F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, -0.0527F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = lowerbody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 18).mirror().addBox(-0.454F, 0.1947F, -1.0362F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9616F, 1.698F, 1.6171F, -0.6074F, 0.0229F, -0.4532F));

		PartDefinition cube_r3 = lowerbody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 36).mirror().addBox(-0.454F, 0.2437F, -1.0158F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9616F, 1.698F, 1.6171F, 0.2129F, 0.0229F, -0.4532F));

		PartDefinition cube_r4 = lowerbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 41).mirror().addBox(-0.454F, -1.774F, -0.3762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9616F, 1.698F, 1.6171F, -0.0315F, 0.0229F, -0.4532F));

		PartDefinition cube_r5 = lowerbody.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 54).mirror().addBox(-0.454F, -1.6494F, -1.0895F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9616F, 1.698F, 1.6171F, -0.4416F, 0.0229F, -0.4532F));

		PartDefinition cube_r6 = lowerbody.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 41).mirror().addBox(-0.5F, -0.4057F, -1.4666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 41).addBox(2.5138F, -0.4057F, -1.4666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5069F, 0.0776F, 1.7941F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r7 = lowerbody.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 54).addBox(-0.546F, -1.6494F, -1.0895F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9616F, 1.698F, 1.6171F, -0.4416F, -0.0229F, 0.4532F));

		PartDefinition cube_r8 = lowerbody.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 41).addBox(-0.546F, -1.774F, -0.3762F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9616F, 1.698F, 1.6171F, -0.0315F, -0.0229F, 0.4532F));

		PartDefinition cube_r9 = lowerbody.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 36).addBox(-0.546F, 0.2437F, -1.0158F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9616F, 1.698F, 1.6171F, 0.2129F, -0.0229F, 0.4532F));

		PartDefinition cube_r10 = lowerbody.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 18).addBox(-0.546F, 0.1947F, -1.0362F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9616F, 1.698F, 1.6171F, -0.6074F, -0.0229F, 0.4532F));

		PartDefinition legL = lowerbody.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(26, 23).addBox(-0.5F, -0.25F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.9546F, 1.4878F, 1.3969F, 1.0539F, -1.1782F, -1.0104F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(46, 23).addBox(0.0316F, -0.1132F, -0.8333F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 46).addBox(-1.0684F, 0.0868F, -0.8333F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1046F, 0.5277F, -3.3738F, 0.48F, 0.3491F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -2.25F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0583F, 3.8686F, 0.6464F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r11 = legL3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 37).addBox(-0.25F, 0.02F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.75F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r12 = legL3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, 0.01F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.25F, 0.0436F, 0.4363F, 0.0F));

		PartDefinition cube_r13 = legL3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, 0.0F, -3.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.25F, 0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r14 = legL3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 41).addBox(-0.5F, 0.02F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.75F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r15 = legL3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, 0.01F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -2.25F, 0.0611F, -0.1309F, 0.0F));

		PartDefinition legL4 = lowerbody.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(26, 23).mirror().addBox(-0.5F, -0.25F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.9546F, 1.4878F, 1.3969F, 0.5102F, 0.8216F, 0.3801F));

		PartDefinition legL5 = legL4.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-1.0316F, -0.1132F, -0.8333F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 46).mirror().addBox(0.0684F, 0.0868F, -0.8333F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1046F, 0.5277F, -3.3738F, 0.48F, -0.3491F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-1.0F, 0.0F, -2.25F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0583F, 3.8686F, 0.6464F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r16 = legL6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(-0.75F, 0.02F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.5F, -1.75F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r17 = legL6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, 0.01F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, -2.25F, 0.0436F, -0.4363F, 0.0F));

		PartDefinition cube_r18 = legL6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, 0.0F, -3.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -2.25F, 0.0436F, -0.1745F, 0.0F));

		PartDefinition cube_r19 = legL6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 41).mirror().addBox(-0.5F, 0.02F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.75F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r20 = legL6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 29).mirror().addBox(-0.5F, 0.01F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.25F, 0.0611F, 0.1309F, 0.0F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.35F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.392F, 3.8473F, -0.0097F, -0.218F, 0.0447F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(60, 32).addBox(0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 60).addBox(0.0F, 0.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 29).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.25F, 0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 47).addBox(0.0F, -0.1017F, -0.0821F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6659F, 4.2124F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(39, 58).addBox(0.0F, 0.0F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 58).addBox(0.0F, -0.7F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2659F, 0.5124F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 7).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 5.0F, -0.0206F, -0.2642F, -0.0695F));

		PartDefinition cube_r24 = tail2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 60).addBox(0.0F, 0.1F, 4.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 60).addBox(0.0F, 0.1F, 2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 60).addBox(0.0F, 0.1F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(3, 60).addBox(0.0F, 1.8983F, 5.4179F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 60).addBox(0.0F, 1.5983F, 3.7179F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 30).addBox(0.0F, 0.4983F, 1.7179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5659F, -0.7876F, 0.384F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 15).addBox(0.0115F, -0.4945F, -0.0662F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4992F, 0.0666F, 6.0044F, 0.0526F, -0.4375F, 0.0196F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(57, 60).addBox(0.4877F, 0.01F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 60).addBox(0.4877F, 0.01F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0115F, -0.9045F, 1.0338F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, 2.9983F, 9.0179F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 55).addBox(0.0F, 2.4983F, 7.2179F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4992F, 0.4993F, -6.792F, 0.384F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4359F, -0.1278F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5115F, -0.0738F, 5.8613F, 0.2112F, -0.3283F, -0.0661F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.5F, -6.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(17, 0).addBox(-2.0F, 3.5F, -6.9F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.2F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(59, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -1.4077F, 0.0105F, -0.0051F, -0.4972F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -1.4077F, 0.0117F, -0.0004F, -0.916F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-2.4307F, -1.3342F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -1.4077F, 0.0102F, 0.0056F, -1.457F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -5.4077F, 0.0932F, 0.0225F, -0.3219F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -5.4077F, 0.0761F, 0.0585F, -0.7396F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-4.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -5.4077F, 0.0351F, 0.0893F, -1.2813F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(36, 5).mirror().addBox(-3.4307F, -1.3342F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -3.4077F, 0.0202F, 0.0391F, -1.387F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 58).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -3.4077F, 0.0374F, 0.0231F, -0.8459F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(25, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, -0.0783F, -3.4077F, 0.0436F, 0.0059F, -0.4273F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 51).addBox(1.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -5.4077F, 0.0351F, -0.0893F, 1.2813F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(56, 58).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -5.4077F, 0.0761F, -0.0585F, 0.7396F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(59, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -5.4077F, 0.0932F, -0.0225F, 0.3219F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(59, 5).addBox(1.4307F, -1.3342F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -1.4077F, 0.0102F, -0.0056F, 1.457F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(59, 7).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -1.4077F, 0.0117F, 0.0004F, 0.916F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -1.4077F, 0.0105F, 0.0051F, 0.4972F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(25, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -3.4077F, 0.0436F, -0.0059F, 0.4273F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(51, 58).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -3.4077F, 0.0374F, -0.0231F, 0.8459F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 5).addBox(1.4307F, -1.3342F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, -0.0783F, -3.4077F, 0.0202F, -0.0391F, 1.387F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(13, 18).addBox(0.0F, -1.7302F, 0.0006F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(59, 41).addBox(0.0F, -1.8651F, 0.0003F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 58).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(45, 58).addBox(-0.5F, -1.6585F, -0.0535F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3472F, -0.7793F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(58, 37).addBox(-0.5F, -1.3538F, -0.0562F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3472F, -2.7793F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.6F, -0.0745F, 0.1353F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 25).addBox(3.4138F, -0.0745F, 0.1353F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.9069F, 2.259F, -4.1193F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(18, 46).mirror().addBox(0.7248F, -0.3376F, -0.6646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1069F, 3.659F, -3.8193F, 1.3755F, -0.1657F, -0.7734F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 35).mirror().addBox(-0.6F, 2.9425F, 0.7307F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 35).addBox(3.4138F, 2.9425F, 0.7307F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9069F, 1.259F, -7.1193F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(14, 55).mirror().addBox(0.1355F, 1.0882F, 2.3239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4069F, 0.959F, -6.9193F, 0.1126F, -0.1485F, -0.3354F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(44, 54).mirror().addBox(0.1355F, 2.0988F, 1.4659F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4069F, 0.959F, -6.9193F, 0.6362F, -0.1485F, -0.3354F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, 0.3745F, -2.3871F, 0.393F, 0.1194F, -0.4401F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(59, 13).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, 0.3745F, -2.3871F, 0.315F, 0.2666F, -0.8402F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(37, 33).mirror().addBox(-3.4307F, -1.3342F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, 0.3745F, -2.3871F, 0.1306F, 0.3896F, -1.398F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, 0.0745F, -0.4871F, 0.2759F, 0.0825F, -0.3646F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(59, 11).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, 0.0745F, -0.4871F, 0.22F, 0.1868F, -0.7743F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(-4.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, 0.0745F, -0.4871F, 0.0917F, 0.273F, -1.3234F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(37, 33).addBox(1.4307F, -1.3342F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, 0.3745F, -2.3871F, 0.1306F, -0.3896F, 1.398F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(59, 13).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, 0.3745F, -2.3871F, 0.315F, -0.2666F, 0.8402F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(59, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, 0.3745F, -2.3871F, 0.393F, -0.1194F, 0.4401F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, 51).addBox(1.4307F, -1.3342F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, 0.0745F, -0.4871F, 0.0917F, -0.273F, 1.3234F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 11).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, 0.0745F, -0.4871F, 0.22F, -0.1868F, 0.7743F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(13, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, 0.0745F, -0.4871F, 0.2759F, -0.0825F, 0.3646F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 54).addBox(-1.1355F, 2.0988F, 1.4659F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4069F, 0.959F, -6.9193F, 0.6362F, 0.1485F, 0.3354F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(14, 55).addBox(-1.1355F, 1.0882F, 2.3239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4069F, 0.959F, -6.9193F, 0.1126F, 0.1485F, 0.3354F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(32, 19).addBox(-2.0F, -0.9704F, -2.1978F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5528F, 0.1207F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(18, 46).addBox(-1.7248F, -0.3376F, -0.6646F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1069F, 3.659F, -3.8193F, 1.3755F, 0.1657F, 0.7734F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7528F, -3.7793F, 0.0524F, 0.0F, 0.0F));

		PartDefinition armL = body2.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5069F, 2.1243F, -2.9588F, 0.0387F, 0.8935F, 0.0453F));

		PartDefinition cube_r73 = armL.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(52, 20).addBox(-1.2F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(32, 54).addBox(-1.2F, -1.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(52, 8).addBox(-0.7F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, 0.0F, 0.6109F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(51, 23).addBox(-1.0F, 0.0F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 49).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1371F, 0.2679F, 3.2911F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(43, 10).addBox(-0.9532F, -0.2866F, -1.9949F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5675F, 3.7081F, 0.8169F, -0.6868F, -1.1558F, 0.438F));

		PartDefinition cube_r74 = armL3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5F, 0.02F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7968F, 0.2134F, -1.9949F, 0.0436F, -0.48F, 0.0F));

		PartDefinition cube_r75 = armL3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(33, 35).addBox(-0.5F, 0.01F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2968F, 0.2134F, -1.9949F, 0.0873F, -0.1745F, 0.0F));

		PartDefinition cube_r76 = armL3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(9, 42).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2032F, 0.2134F, -1.9949F, 0.0785F, 0.0873F, 0.0F));

		PartDefinition cube_r77 = armL3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(52, 12).addBox(-0.25F, 0.01F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9532F, 0.2134F, -1.9949F, 0.0611F, 0.3927F, 0.0F));

		PartDefinition cube_r78 = armL3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(46, 29).addBox(-0.5F, 0.02F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9532F, 0.2134F, -0.9949F, 0.0349F, 0.7418F, 0.0F));

		PartDefinition armL4 = body2.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5069F, 2.1243F, -2.9588F, -2.7445F, -0.5036F, 2.6148F));

		PartDefinition cube_r79 = armL4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-0.8F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(32, 54).mirror().addBox(-0.8F, -1.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(52, 8).mirror().addBox(-0.3F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, 0.0F, -0.6109F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create().texOffs(51, 23).mirror().addBox(0.0F, 0.0F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 49).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1371F, 0.2679F, 3.2911F, 0.534F, 0.4269F, 0.6923F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-1.0468F, -0.2866F, -1.9949F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5675F, 3.7081F, 0.8169F, 3.1343F, 1.5312F, 2.0819F));

		PartDefinition cube_r80 = armL6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-0.5F, 0.02F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7968F, 0.2134F, -1.9949F, 0.0436F, 0.48F, 0.0F));

		PartDefinition cube_r81 = armL6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(33, 35).mirror().addBox(-0.5F, 0.01F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2968F, 0.2134F, -1.9949F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r82 = armL6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(9, 42).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2032F, 0.2134F, -1.9949F, 0.0785F, -0.0873F, 0.0F));

		PartDefinition cube_r83 = armL6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-0.75F, 0.01F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9532F, 0.2134F, -1.9949F, 0.0611F, -0.3927F, 0.0F));

		PartDefinition cube_r84 = armL6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-0.5F, 0.02F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9532F, 0.2134F, -0.9949F, 0.0349F, -0.7418F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(37, 23).addBox(0.0F, -0.4895F, -2.8435F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(24, 60).addBox(0.5F, -1.2895F, -2.8435F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2528F, -3.5793F, -0.1478F, -0.263F, -0.0753F));

		PartDefinition cube_r85 = neck.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(10, 57).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4895F, -0.8435F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r86 = neck.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-1.146F, 0.0632F, -0.6212F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0069F, 0.0322F, -2.3512F, 0.5816F, 0.8754F, -0.8807F));

		PartDefinition cube_r87 = neck.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(53, 35).mirror().addBox(-2.1729F, 0.0832F, -0.5563F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0069F, 0.0322F, -0.3512F, 0.6035F, 0.818F, -0.9394F));

		PartDefinition cube_r88 = neck.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(59, 17).addBox(0.146F, 0.0632F, -0.6212F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0069F, 0.0322F, -2.3512F, 0.5816F, -0.8754F, 0.8807F));

		PartDefinition cube_r89 = neck.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 35).addBox(0.1729F, 0.0832F, -0.5563F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0069F, 0.0322F, -0.3512F, 0.6035F, -0.818F, 0.9394F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(37, 28).addBox(-0.5F, -0.5119F, -2.9365F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0105F, -2.6435F, 0.4518F, -0.2865F, -0.1074F));

		PartDefinition cube_r90 = neck2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(6, 60).addBox(0.0F, -0.7F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5119F, -1.8365F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-1.1815F, 0.0268F, -0.7374F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5069F, 0.0097F, -1.4442F, 0.4257F, 1.0439F, -1.1431F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(59, 19).addBox(0.1815F, 0.0268F, -0.7374F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5069F, 0.0097F, -1.4442F, 0.4257F, -1.0439F, 1.1431F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(53, 29).addBox(-1.0F, -1.3048F, -2.2271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F))
				.texOffs(25, 54).addBox(-1.0F, -1.3048F, -2.9271F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1204F)), PartPose.offsetAndRotation(0.0F, -0.1924F, -2.2664F, 0.1838F, 0.0438F, 0.0047F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(7, 47).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1147F, -3.7974F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(32, 7).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 46).addBox(-0.5F, -1.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6452F, -6.7771F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.785F, -1.8189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2452F, -8.2771F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(37, 46).addBox(-0.5F, -0.253F, -1.8037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.4845F, -7.7503F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(32, 13).addBox(-1.0F, -0.1501F, -3.8179F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5F, -1.0048F, -4.1271F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(56, 49).mirror().addBox(-0.5F, -0.1652F, -0.1137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1504F)).mirror(false)
				.texOffs(56, 52).mirror().addBox(-0.5F, -0.1652F, 0.0863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(56, 52).addBox(0.5F, -0.1652F, 0.0863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 49).addBox(0.5F, -0.1652F, -0.1137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1504F)), PartPose.offsetAndRotation(-0.5F, -1.1048F, -0.1271F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 57).addBox(0.0F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6075F, -0.1315F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(-0.45F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 5).addBox(-0.31F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.12F, -0.4525F, -4.8243F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-0.65F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.07F, -0.5571F, -3.8298F, 0.1107F, -0.3297F, -0.036F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(34, 57).mirror().addBox(-0.5F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 33).addBox(-0.5F, -0.8F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.118F))
				.texOffs(34, 57).addBox(0.5F, -1.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(43, 14).addBox(-0.5F, -1.5F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1204F)), PartPose.offsetAndRotation(-0.5F, 0.2952F, -1.3271F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-0.5F, -0.8645F, -1.8924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false)
				.texOffs(47, 0).addBox(0.54F, -0.8645F, -1.8924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.52F, -0.2048F, -1.2271F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(24, 57).mirror().addBox(-0.5F, -0.9F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1204F)).mirror(false)
				.texOffs(24, 57).addBox(0.54F, -0.9F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1204F)), PartPose.offsetAndRotation(-0.52F, -0.7048F, -2.5271F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 57).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1204F)).mirror(false)
				.texOffs(5, 57).addBox(0.54F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1204F)), PartPose.offsetAndRotation(-0.52F, -0.7048F, -2.5271F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(29, 57).mirror().addBox(-0.5F, -0.1146F, -0.1761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1207F)).mirror(false)
				.texOffs(29, 57).addBox(0.54F, -0.1146F, -0.1761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1207F)), PartPose.offsetAndRotation(-0.52F, -1.2048F, -2.3271F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-0.5273F, -0.4418F, -1.6881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0945F, -1.0484F, -3.0468F, 0.2178F, -1.0567F, -0.0844F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(51, 45).mirror().addBox(-0.4297F, -0.4418F, -1.5811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0945F, -1.0484F, -3.0468F, 2.6358F, -1.3497F, -2.5402F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-0.1554F, -0.8338F, -0.2036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0952F, -4.3271F, -0.0451F, -0.3145F, -0.0161F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(56, 26).addBox(-1.0F, -0.1469F, -0.1432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.4048F, -0.7271F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(54, 55).addBox(-1.0F, -0.0253F, -0.1538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1504F)), PartPose.offsetAndRotation(0.5F, -1.4048F, -1.4271F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 23).addBox(-1.0F, -0.2249F, -0.1634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.3048F, -1.4271F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(49, 55).addBox(-1.0F, -0.1924F, -0.157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.4048F, -2.1271F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(20, 41).addBox(-1.0F, 0.1F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.5F, -1.5048F, -3.0271F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 45).addBox(-0.5703F, -0.4418F, -1.5811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0945F, -1.0484F, -3.0468F, 2.6358F, 1.3497F, 2.5402F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 37).addBox(-0.4727F, -0.4418F, -1.6881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0945F, -1.0484F, -3.0468F, 0.2178F, 1.0567F, 0.0844F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.1707F, -0.2352F, -0.1535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.9048F, -4.3271F, 0.112F, -0.3145F, -0.0161F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 53).addBox(-0.8293F, -0.2352F, -0.1535F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -0.9048F, -4.3271F, 0.112F, 0.3145F, 0.0161F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(52, 16).addBox(-0.8446F, -0.8338F, -0.2036F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.35F, 0.0952F, -4.3271F, -0.0451F, 0.3145F, 0.0161F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(54, 0).addBox(-1.5F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.5F, 0.2952F, -2.0271F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(53, 32).addBox(-1.5F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1204F)), PartPose.offsetAndRotation(0.5F, 0.2952F, -1.3271F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(19, 55).addBox(-0.35F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.07F, -0.5571F, -3.8298F, 0.1107F, 0.3297F, 0.036F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(30, 46).addBox(0.0F, -0.1347F, -2.2095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1205F))
				.texOffs(30, 46).mirror().addBox(-1.0F, -0.1347F, -2.2095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1205F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9002F, -0.1576F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-0.1963F, -0.3755F, -1.9075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1205F)).mirror(false), PartPose.offsetAndRotation(-0.8504F, -0.0347F, -1.9605F, 0.0524F, -0.3491F, 0.0F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(7, 53).mirror().addBox(-0.1963F, -0.1037F, -1.9004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.8504F, -0.0347F, -1.9605F, -0.1047F, -0.3491F, 0.0F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(44, 50).mirror().addBox(-0.5F, -0.824F, -1.0959F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 50).addBox(0.5F, -0.824F, -1.0959F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.5653F, 0.1905F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-0.5F, -0.0534F, -0.1222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false)
				.texOffs(19, 58).addBox(0.5F, -0.0534F, -0.1222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.5F, -0.3347F, -2.1095F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(37, 50).mirror().addBox(-0.5F, -0.2371F, -1.7711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(37, 50).addBox(0.5F, -0.2371F, -1.7711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.5F, -0.0347F, 0.1905F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 50).addBox(-0.8037F, -0.3755F, -1.9075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1205F)), PartPose.offsetAndRotation(0.8504F, -0.0347F, -1.9605F, 0.0524F, 0.3491F, 0.0F));

		PartDefinition cube_r129 = jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(7, 53).addBox(-0.8037F, -0.1037F, -1.9004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.8504F, -0.0347F, -1.9605F, -0.1047F, 0.3491F, 0.0F));

		PartDefinition cube_r130 = jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(47, 41).addBox(-0.5F, -0.844F, -0.2545F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.5653F, -5.0095F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r131 = jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(13, 23).addBox(-0.5F, -0.4F, -3.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2653F, -6.2095F, 0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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