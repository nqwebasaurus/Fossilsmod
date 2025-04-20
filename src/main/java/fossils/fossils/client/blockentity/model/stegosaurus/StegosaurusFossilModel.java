package fossils.fossils.client.blockentity.model.stegosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StegosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart plate2;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart plate3;
	private final ModelPart tail2;
	private final ModelPart plate4;
	private final ModelPart tail3;
	private final ModelPart plate5;
	private final ModelPart tail4;
	private final ModelPart plate6;
	private final ModelPart tail5;
	private final ModelPart plate7;
	private final ModelPart tail7;
	private final ModelPart tail6;
	private final ModelPart thagomizer2;
	private final ModelPart thagomizer4;
	private final ModelPart thagomizer3;
	private final ModelPart thagomizer5;
	private final ModelPart plate9;
	private final ModelPart plate10;
	private final ModelPart body2;
	private final ModelPart plate8;
	private final ModelPart upperbody;
	private final ModelPart plate11;
	private final ModelPart plate12;
	private final ModelPart chest;
	private final ModelPart plate13;
	private final ModelPart plate19;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart neck;
	private final ModelPart plate14;
	private final ModelPart plate15;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart plate20;
	private final ModelPart neck2;
	private final ModelPart plate21;
	private final ModelPart plate16;
	private final ModelPart neck6;
	private final ModelPart plate17;
	private final ModelPart plate22;
	private final ModelPart neck3;
	private final ModelPart plate23;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;

	public StegosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.body = this.main.getChild("body");
		this.plate2 = this.body.getChild("plate2");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.body.getChild("tail");
		this.plate3 = this.tail.getChild("plate3");
		this.tail2 = this.tail.getChild("tail2");
		this.plate4 = this.tail2.getChild("plate4");
		this.tail3 = this.tail2.getChild("tail3");
		this.plate5 = this.tail3.getChild("plate5");
		this.tail4 = this.tail3.getChild("tail4");
		this.plate6 = this.tail4.getChild("plate6");
		this.tail5 = this.tail4.getChild("tail5");
		this.plate7 = this.tail5.getChild("plate7");
		this.tail7 = this.tail5.getChild("tail7");
		this.tail6 = this.tail7.getChild("tail6");
		this.thagomizer2 = this.tail6.getChild("thagomizer2");
		this.thagomizer4 = this.tail6.getChild("thagomizer4");
		this.thagomizer3 = this.tail6.getChild("thagomizer3");
		this.thagomizer5 = this.tail6.getChild("thagomizer5");
		this.plate9 = this.tail7.getChild("plate9");
		this.plate10 = this.tail7.getChild("plate10");
		this.body2 = this.body.getChild("body2");
		this.plate8 = this.body2.getChild("plate8");
		this.upperbody = this.body2.getChild("upperbody");
		this.plate11 = this.upperbody.getChild("plate11");
		this.plate12 = this.upperbody.getChild("plate12");
		this.chest = this.upperbody.getChild("chest");
		this.plate13 = this.chest.getChild("plate13");
		this.plate19 = this.chest.getChild("plate19");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.neck = this.chest.getChild("neck");
		this.plate14 = this.neck.getChild("plate14");
		this.plate15 = this.neck.getChild("plate15");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.plate20 = this.neck5.getChild("plate20");
		this.neck2 = this.neck5.getChild("neck2");
		this.plate21 = this.neck2.getChild("plate21");
		this.plate16 = this.neck2.getChild("plate16");
		this.neck6 = this.neck2.getChild("neck6");
		this.plate17 = this.neck6.getChild("plate17");
		this.plate22 = this.neck6.getChild("plate22");
		this.neck3 = this.neck6.getChild("neck3");
		this.plate23 = this.neck3.getChild("plate23");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 2.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.4078F, 3.5545F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(173, 75).addBox(-0.005F, -0.3006F, -1.3566F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1139F, 1.531F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(171, 88).addBox(0.0F, 0.0392F, -0.2263F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0139F, -1.069F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(189, 47).mirror().addBox(-8.7256F, -11.4189F, 5.6752F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7744F, 1.51F, -2.3218F, -1.7452F, 0.4945F, -0.4762F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-3.8228F, -0.5695F, 1.209F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4744F, 1.01F, -3.0218F, -0.5727F, 0.2783F, -0.0266F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(84, 170).mirror().addBox(-8.5256F, -3.6472F, 8.0974F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.7744F, 1.51F, -2.3218F, -0.9598F, 0.4945F, -0.4762F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(131, 34).mirror().addBox(-3.8228F, -0.3026F, 6.4678F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4744F, 1.01F, -3.0218F, -0.6251F, 0.2783F, -0.0266F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(141, 65).mirror().addBox(-3.8228F, 0.2618F, 0.4745F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.4744F, 1.01F, -3.0218F, -0.5378F, 0.2783F, -0.0266F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(174, 125).mirror().addBox(-3.6705F, -1.2845F, -1.4119F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.4744F, 1.01F, -3.0218F, -0.4277F, 0.2504F, 0.0903F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(187, 176).mirror().addBox(-0.3839F, -1.9024F, -1.2121F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.8602F, 0.4176F, -2.1202F, 0.9033F, 0.1794F, 0.0129F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(182, 158).mirror().addBox(-0.3839F, -0.7263F, -4.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.8602F, 0.4176F, -2.1202F, 0.2052F, 0.1794F, 0.0129F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(182, 136).mirror().addBox(-0.3839F, 0.1909F, -7.1056F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.8602F, 0.4176F, -2.1202F, -0.013F, 0.1794F, 0.0129F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 196).mirror().addBox(-0.3839F, 0.6478F, -7.7483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.8602F, 0.4176F, -2.1202F, -0.0828F, 0.1794F, 0.0129F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(148, 195).mirror().addBox(-0.3839F, -1.6622F, -8.5933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.8602F, 0.4176F, -2.1202F, 0.2139F, 0.1794F, 0.0129F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 191).mirror().addBox(-0.3839F, 2.1599F, -8.5324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.8602F, 0.4176F, -2.1202F, -0.2224F, 0.1794F, 0.0129F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(126, 80).mirror().addBox(-4.8918F, -4.6269F, -6.6739F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.9974F, 2.1191F, -0.2613F, -0.0151F, -0.0682F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(178, 90).mirror().addBox(0.0F, -1.8F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.0399F, -3.8413F, -4.0778F, -0.5402F, -0.0213F, -0.1397F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 13).mirror().addBox(1.1803F, -0.7327F, 0.2046F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-7.8481F, -2.1637F, -15.4626F, 0.1153F, 0.2903F, -0.0816F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(166, 98).mirror().addBox(-0.7F, -0.5F, -2.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6808F, -4.2357F, 2.3038F, -0.2224F, -0.2456F, -0.0291F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(67, 174).mirror().addBox(-5.2F, -0.5F, 3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-11.1908F, -2.7182F, 3.3857F, -2.755F, 0.575F, -3.0387F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(148, 0).mirror().addBox(-1.9F, -0.5F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-9.3966F, -3.3245F, 2.1969F, -2.4821F, 1.0774F, -2.6117F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(171, 29).mirror().addBox(-1.275F, -0.5F, -3.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.3438F, -2.3425F, 6.5272F, -0.413F, 0.5621F, -0.3181F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(171, 43).mirror().addBox(-1.2F, -0.3F, 0.025F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-7.3221F, -4.5993F, -0.7456F, -0.5828F, 1.1714F, -0.6298F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(156, 75).mirror().addBox(-0.425F, -0.5F, -2.425F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-7.1231F, -2.754F, 4.678F, -0.7173F, 1.0687F, -0.7678F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(174, 132).mirror().addBox(-3.1F, -0.5F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.8916F, -1.505F, 8.9488F, -2.4695F, -0.9939F, 2.4647F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(168, 113).mirror().addBox(-4.0F, 0.1F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9557F, -4.5573F, 3.9227F, -0.4776F, -0.0326F, -0.0769F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(184, 0).mirror().addBox(-0.85F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.3868F, -2.0551F, 7.555F, -0.4245F, -0.6015F, 0.1617F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 178).mirror().addBox(-2.7F, 0.1F, 0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.9592F, -4.6342F, 3.9552F, -0.496F, -0.2643F, 0.0466F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(171, 24).mirror().addBox(-4.0F, 0.1F, 2.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(130, 101).mirror().addBox(-4.0F, 0.1F, -0.2F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8672F, -5.8097F, -1.7398F, -0.2158F, -0.0326F, -0.0769F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(185, 131).mirror().addBox(-0.9F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7074F, -4.9333F, -2.7819F, -0.0496F, -0.3009F, -0.0986F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 103).mirror().addBox(-0.3F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.1009F, -3.5646F, -11.2782F, 0.2039F, 0.1159F, -0.1331F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(166, 10).mirror().addBox(0.6F, -0.5F, 0.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.9604F, -3.4943F, -11.0206F, 0.2113F, 0.0771F, -0.129F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(178, 85).mirror().addBox(-0.9F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.3576F, -4.8805F, -5.344F, 0.169F, -0.0279F, -0.1373F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(151, 100).mirror().addBox(-3.4595F, -0.0173F, -0.9399F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.7668F, -5.8427F, -4.6311F, -0.0535F, 0.4835F, -0.1383F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(16, 179).mirror().addBox(0.0F, 0.1F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.4664F, -5.2492F, -7.461F, 0.1694F, 0.0753F, -0.1197F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(98, 192).mirror().addBox(-4.4953F, 4.1693F, 2.0848F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.6974F, 2.1191F, 0.7383F, 0.1318F, -0.6009F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(87, 46).mirror().addBox(-4.4953F, 2.8183F, 3.5358F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.6974F, 2.1191F, 0.5637F, 0.1318F, -0.6009F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 171).mirror().addBox(-4.1792F, -1.5735F, 1.3678F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.6974F, 2.1191F, 0.8849F, 0.0715F, -0.4559F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(57, 187).mirror().addBox(-4.4018F, -3.1334F, 1.0016F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 2.6974F, 2.1191F, 0.3453F, 0.0594F, -0.3585F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(130, 42).mirror().addBox(-0.3839F, 0.1001F, -7.1357F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.8602F, 0.4176F, -2.1202F, 0.0743F, 0.1794F, 0.0129F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(196, 159).mirror().addBox(-0.7486F, 0.946F, 0.7956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.1F, -4.4858F, 4.2151F, -0.3085F, -0.5941F, -0.2814F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(89, 178).mirror().addBox(-0.3735F, 0.9349F, -0.7461F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.2F, -4.4771F, 4.0153F, -0.3085F, 0.1513F, -0.1209F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 100).mirror().addBox(-5.2891F, -2.6989F, -3.0155F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -1.3026F, 0.0191F, -0.2613F, -0.0151F, -0.0682F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(38, 101).mirror().addBox(1.1803F, -2.1327F, -9.1954F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -3.0677F, -6.3801F, 0.22F, 0.2903F, -0.0816F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(185, 131).addBox(-1.1F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.7074F, -4.9333F, -2.7819F, -0.0496F, 0.3009F, 0.0986F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(171, 29).addBox(-1.725F, -0.5F, -3.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.3438F, -2.3425F, 6.5272F, -0.413F, -0.5621F, 0.3181F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(67, 174).addBox(1.2F, -0.5F, 3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(11.1908F, -2.7182F, 3.3857F, -2.755F, -0.575F, 3.0387F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(148, 0).addBox(-0.1F, -0.5F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(9.3966F, -3.3245F, 2.1969F, -2.4821F, -1.0774F, 2.6117F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(156, 75).addBox(-2.575F, -0.5F, -2.425F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.1231F, -2.754F, 4.678F, -0.7173F, -1.0687F, 0.7678F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(174, 132).addBox(0.1F, -0.5F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.8916F, -1.505F, 8.9488F, -2.4695F, 0.9939F, -2.4647F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(184, 0).addBox(-0.15F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.3868F, -2.0551F, 7.555F, -0.4245F, 0.6015F, -0.1617F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(168, 113).addBox(1.0F, 0.1F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9557F, -4.5573F, 3.9227F, -0.4776F, 0.0326F, 0.0769F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(67, 178).addBox(0.7F, 0.1F, 0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.9592F, -4.6342F, 3.9552F, -0.496F, 0.2643F, -0.0466F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(166, 98).addBox(-1.3F, -0.5F, -2.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.6808F, -4.2357F, 2.3038F, -0.2224F, 0.2456F, 0.0291F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(171, 24).addBox(1.0F, 0.1F, 2.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(130, 101).addBox(-3.0F, 0.1F, -0.2F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.8672F, -5.8097F, -1.7398F, -0.2158F, 0.0326F, 0.0769F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(171, 43).addBox(-1.8F, -0.3F, 0.025F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(7.3221F, -4.5993F, -0.7456F, -0.5828F, -1.1714F, 0.6298F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(151, 100).addBox(0.4595F, -0.0173F, -0.9399F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.7668F, -5.8427F, -4.6311F, -0.0535F, -0.4835F, 0.1383F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(178, 85).addBox(-1.1F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.3576F, -4.8805F, -5.344F, 0.169F, 0.0279F, 0.1373F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(178, 90).addBox(-1.0F, -1.8F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.0399F, -3.8413F, -4.0778F, -0.5402F, 0.0213F, 0.1397F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(16, 179).addBox(-1.0F, 0.1F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.4664F, -5.2492F, -7.461F, 0.1694F, -0.0753F, 0.1197F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(166, 10).addBox(-2.6F, -0.5F, 0.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.9604F, -3.4943F, -11.0206F, 0.2113F, -0.0771F, 0.129F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(59, 103).addBox(-0.7F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.1009F, -3.5646F, -11.2782F, 0.2039F, -0.1159F, 0.1331F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(106, 13).addBox(-2.1803F, -0.7327F, 0.2046F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(7.8481F, -2.1637F, -15.4626F, 0.1153F, -0.2903F, 0.0816F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(38, 101).addBox(-2.1803F, -2.1327F, -9.1954F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.2F, -3.0677F, -6.3801F, 0.22F, -0.2903F, 0.0816F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(126, 80).addBox(3.8918F, -4.6269F, -6.6739F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2F, 4.9974F, 2.1191F, -0.2613F, 0.0151F, 0.0682F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 100).addBox(4.2891F, -2.6989F, -3.0155F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, -1.3026F, 0.0191F, -0.2613F, 0.0151F, 0.0682F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(89, 178).addBox(-1.6265F, 0.9349F, -0.7461F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.2F, -4.4771F, 4.0153F, -0.3085F, -0.1513F, 0.1209F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(196, 159).addBox(-0.2514F, 0.946F, 0.7956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.1F, -4.4858F, 4.2151F, -0.3085F, 0.5941F, 0.2814F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(34, 196).addBox(-0.6161F, 0.6478F, -7.7483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.8602F, 0.4176F, -2.1202F, -0.0828F, -0.1794F, -0.0129F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(148, 195).addBox(-0.6161F, -1.6622F, -8.5933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.8602F, 0.4176F, -2.1202F, 0.2139F, -0.1794F, -0.0129F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(7, 191).addBox(-0.6161F, 2.1599F, -8.5324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.8602F, 0.4176F, -2.1202F, -0.2224F, -0.1794F, -0.0129F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(187, 176).addBox(-0.6161F, -1.9024F, -1.2121F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.8602F, 0.4176F, -2.1202F, 0.9033F, -0.1794F, -0.0129F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(182, 158).addBox(-0.6161F, -0.7263F, -4.1688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.8602F, 0.4176F, -2.1202F, 0.2052F, -0.1794F, -0.0129F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(182, 136).addBox(-0.6161F, 0.1909F, -7.1056F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.8602F, 0.4176F, -2.1202F, -0.013F, -0.1794F, -0.0129F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(189, 47).addBox(7.7256F, -11.4189F, 5.6752F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7744F, 1.51F, -2.3218F, -1.7452F, -0.4945F, 0.4762F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(84, 170).addBox(7.5256F, -3.6472F, 8.0974F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.7744F, 1.51F, -2.3218F, -0.9598F, -0.4945F, 0.4762F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(21, 76).addBox(2.8228F, -0.5695F, 1.209F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4744F, 1.01F, -3.0218F, -0.5727F, -0.2783F, 0.0266F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(131, 34).addBox(2.8228F, -0.3026F, 6.4678F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4744F, 1.01F, -3.0218F, -0.6251F, -0.2783F, 0.0266F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(141, 65).addBox(2.8228F, 0.2618F, 0.4745F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.4744F, 1.01F, -3.0218F, -0.5378F, -0.2783F, 0.0266F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(174, 125).addBox(2.6705F, -1.2845F, -1.4119F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.4744F, 1.01F, -3.0218F, -0.4277F, -0.2504F, -0.0903F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(130, 42).addBox(-0.6161F, 0.1001F, -7.1357F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.8602F, 0.4176F, -2.1202F, 0.0743F, -0.1794F, -0.0129F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 187).addBox(3.4018F, -3.1334F, 1.0016F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2F, 2.6974F, 2.1191F, 0.3453F, -0.0594F, 0.3585F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 171).addBox(3.1792F, -1.5735F, 1.3678F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 2.6974F, 2.1191F, 0.8849F, -0.0715F, 0.4559F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(98, 192).addBox(3.4953F, 4.1693F, 2.0848F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 2.6974F, 2.1191F, 0.7383F, -0.1318F, 0.6009F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(87, 46).addBox(3.4953F, 2.8183F, 3.5358F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.6974F, 2.1191F, 0.5637F, -0.1318F, 0.6009F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(111, 95).addBox(-0.5F, -1.4358F, -0.019F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -3.3139F, -3.369F, -0.0873F, 0.0F, 0.0F));

		PartDefinition plate2 = body.addOrReplaceChild("plate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4764F, -13.2659F, -0.7516F, -0.109F, 0.001F, -0.0971F));

		PartDefinition cube_r86 = plate2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(87, 31).addBox(-0.5F, -5.1F, -9.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -10.2796F, -4.7126F, -2.666F, 0.0F, 0.0F));

		PartDefinition cube_r87 = plate2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(130, 65).addBox(-0.5F, -10.1F, -4.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -6.9154F, -6.8765F, -2.1424F, 0.0F, 0.0F));

		PartDefinition cube_r88 = plate2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(175, 0).addBox(-0.5F, 0.4264F, -0.03F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2716F, -7.3703F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r89 = plate2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(46, 54).addBox(-0.5F, -4.7736F, -0.83F, 1.0F, 6.0F, 11.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.9944F, -6.4071F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r90 = plate2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(120, 106).addBox(-0.5F, -3.1086F, -7.1624F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.9609F, 6.5515F, 0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r91 = plate2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(111, 80).addBox(-0.5F, -8.0086F, -6.1624F, 1.0F, 8.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.3391F, 8.6295F, 0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r92 = plate2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(147, 137).addBox(-0.5F, -5.2086F, -4.5624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0433F, 4.9847F, -0.781F, 0.0F, 0.0F));

		PartDefinition cube_r93 = plate2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -3.9669F, -2.1584F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.1353F, 0.0F, 0.0F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -0.7077F, 0.6028F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r94 = backleftleg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(158, 154).addBox(0.25F, 7.1F, -3.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.75F, 14.3059F, -1.4642F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r95 = backleftleg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(158, 91).addBox(0.25F, -3.0F, -0.2F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 1.4059F, -1.5642F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r96 = backleftleg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(77, 133).addBox(-1.0F, -13.1F, -1.9F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 14.5514F, 0.4213F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r97 = backleftleg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(68, 131).addBox(-1.0F, -13.1F, -1.9F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 14.5514F, 0.4213F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r98 = backleftleg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(158, 143).addBox(-1.0F, 2.5F, -0.8F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.9059F, -0.5642F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(73, 159).addBox(-0.5F, -0.1527F, -0.9304F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.9936F, -0.4037F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r99 = backleftleg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(186, 102).addBox(-0.6F, -4.15F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(173, 170).addBox(-0.6F, -1.45F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5F, 3.6973F, 1.1696F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r100 = backleftleg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(178, 176).addBox(-1.0F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 10.4161F, 2.1633F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r101 = backleftleg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(173, 154).addBox(-1.0F, -0.4F, -1.9F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 10.4161F, 2.1633F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r102 = backleftleg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(25, 170).addBox(-1.0F, -0.2F, -1.9F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 4.4181F, 2.0062F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r103 = backleftleg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(180, 54).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 1.7005F, 1.7326F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r104 = backleftleg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(89, 183).addBox(-1.0F, -4.188F, -0.1607F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r105 = backleftleg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(26, 159).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.6306F, -0.6725F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r106 = backleftleg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(25, 179).addBox(-1.0F, -5.0F, -1.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 7.8473F, 0.9696F, -0.1222F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0342F, 15.7939F, 1.8943F, -0.2607F, -0.0084F, -0.0044F));

		PartDefinition cube_r107 = backleftleg3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(167, 64).addBox(0.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8886F, 0.3385F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create().texOffs(108, 24).addBox(-2.0F, 0.0F, -5.25F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1114F, -0.4115F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -0.7077F, 0.6028F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r108 = backrightleg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(160, 17).addBox(-3.25F, 7.1F, -3.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.75F, 14.3059F, -1.4642F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r109 = backrightleg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(158, 136).addBox(-3.25F, -3.0F, -0.2F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 1.4059F, -1.5642F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r110 = backrightleg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(95, 135).addBox(-1.0F, -13.1F, -1.9F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 14.5514F, 0.4213F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r111 = backrightleg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(86, 133).addBox(-1.0F, -13.1F, -1.9F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, 14.5514F, 0.4213F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r112 = backrightleg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(86, 159).addBox(-1.0F, 2.5F, -0.8F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 11.9059F, -0.5642F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(35, 160).addBox(-1.5F, -0.1527F, -0.9304F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.9936F, -0.4037F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r113 = backrightleg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(115, 186).addBox(-0.4F, -4.15F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(62, 174).addBox(-0.4F, -1.35F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.5F, 3.6973F, 1.1696F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r114 = backrightleg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(7, 179).addBox(-1.0F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 10.4161F, 2.1633F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r115 = backrightleg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(173, 162).addBox(-1.0F, -0.4F, -1.9F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 10.4161F, 2.1633F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r116 = backrightleg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(129, 170).addBox(-1.0F, -0.2F, -1.9F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 4.4181F, 2.0062F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r117 = backrightleg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(180, 60).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 1.7005F, 1.7326F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r118 = backrightleg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(183, 116).addBox(-1.0F, -4.188F, -0.1607F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r119 = backrightleg2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(132, 159).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.6306F, -0.6725F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r120 = backrightleg2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(179, 96).addBox(-1.0F, -5.0F, -1.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 7.8473F, 0.9696F, -0.1222F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0342F, 15.7939F, 1.8943F, 0.2629F, 0.0084F, 0.0044F));

		PartDefinition cube_r121 = backrightleg3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(167, 143).addBox(-3.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8886F, 0.3385F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create().texOffs(108, 33).addBox(-3.0F, 0.0F, -5.25F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1114F, -0.4115F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -3.4095F, 4.3369F, 0.1688F, 0.1794F, -0.0132F));

		PartDefinition cube_r122 = tail.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(109, 181).addBox(0.0F, -7.4456F, -0.1588F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0972F, 8.1815F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(64, 186).addBox(0.0F, -7.5458F, 0.1215F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0972F, 5.8815F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 188).addBox(0.0F, -6.6589F, -0.2269F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4028F, 4.2815F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(89, 188).addBox(0.0F, -6.5469F, -0.0327F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5028F, 2.0815F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(83, 31).addBox(0.0F, -6.4315F, 0.1094F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2028F, -0.1185F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(54, 192).addBox(0.0F, 0.0249F, 0.0041F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9404F, 8.1761F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(125, 193).addBox(0.0F, -0.0279F, -0.3575F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.9404F, 6.1761F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(137, 194).addBox(0.0F, 0.2596F, -0.989F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.21F, 4.0627F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -0.7289F, 0.1702F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0972F, -0.1185F, -0.0436F, 0.0F, 0.0F));

		PartDefinition plate3 = tail.addOrReplaceChild("plate3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9319F, -9.5479F, 8.8283F, 0.1092F, -0.001F, 0.0971F));

		PartDefinition cube_r131 = plate3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(33, 19).addBox(-0.5F, -5.1F, -12.1F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -10.4628F, -4.357F, -2.9278F, 0.0F, 0.0F));

		PartDefinition cube_r132 = plate3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -9.8F, -8.9F, 1.0F, 10.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -3.3472F, -9.6473F, -2.2293F, 0.0084F, -0.0012F));

		PartDefinition cube_r133 = plate3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(174, 118).addBox(-0.5F, 0.4264F, -0.03F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2717F, -7.3703F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r134 = plate3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -2.4736F, -2.73F, 1.0F, 6.0F, 11.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.9944F, -6.4071F, 0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r135 = plate3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 54).addBox(-0.5F, -6.6086F, -8.3624F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3391F, 8.6295F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r136 = plate3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(147, 38).addBox(-0.5F, -5.2086F, -4.1624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0433F, 4.9847F, -0.9992F, 0.0F, 0.0F));

		PartDefinition cube_r137 = plate3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, -3.1669F, -3.1584F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.048F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.539F, 10.1152F, -0.2732F, 0.2637F, -0.0293F));

		PartDefinition cube_r138 = tail2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(69, 91).addBox(-0.5F, -0.933F, -0.2727F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.1919F, 0.0825F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(38, 187).addBox(0.0F, -5.7939F, -0.1282F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9264F, 7.7479F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r140 = tail2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(35, 187).addBox(0.0F, -6.081F, -0.1389F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7264F, 5.7479F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(150, 186).addBox(0.0F, -6.3682F, -0.1408F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7264F, 3.7479F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(122, 186).addBox(0.0F, -6.4598F, -0.0428F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7264F, 1.6479F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(105, 186).addBox(0.0F, -6.5383F, -0.2445F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7264F, -0.1521F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(57, 192).addBox(0.0F, 0.4333F, 1.5151F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 192).addBox(0.0F, 0.0333F, -0.4849F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0493F, 5.1519F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(31, 192).addBox(0.0F, -0.3426F, -0.3481F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5669F, 3.2201F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r146 = tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(28, 192).addBox(0.0F, -0.0928F, -0.6543F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3072F, 1.2417F, 0.6109F, 0.0F, 0.0F));

		PartDefinition plate4 = tail2.addOrReplaceChild("plate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9021F, -9.8955F, 9.4953F, -0.109F, 0.001F, -0.0971F));

		PartDefinition cube_r147 = plate4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(134, 140).addBox(-0.5F, -5.1F, 0.2F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -7.7611F, -8.0777F, -1.9504F, 0.0F, 0.0F));

		PartDefinition cube_r148 = plate4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(113, 42).addBox(-0.5F, -5.1F, -1.3F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -9.7991F, -2.9692F, -2.762F, 0.0F, 0.0F));

		PartDefinition cube_r149 = plate4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -2.5F, -7.0F, 1.0F, 5.0F, 13.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -10.5191F, 3.5302F, -2.6224F, 0.0F, 0.0F));

		PartDefinition cube_r150 = plate4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(162, 161).addBox(-0.5F, -0.8F, -1.45F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -14.726F, 9.0789F, -1.1039F, 0.0F, 0.0F));

		PartDefinition cube_r151 = plate4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(80, 103).addBox(-0.5F, 0.4264F, -0.03F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2716F, -7.3703F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r152 = plate4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -2.4736F, -2.73F, 1.0F, 6.0F, 15.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.9944F, -6.4071F, 0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r153 = plate4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(25, 54).addBox(-0.5F, -11.4086F, -6.1624F, 1.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3391F, 8.6295F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r154 = plate4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(147, 148).addBox(-0.5F, -7.3086F, -1.9624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.0434F, 4.9847F, -0.7374F, 0.0F, 0.0F));

		PartDefinition cube_r155 = plate4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -8.1669F, -3.1584F, 1.0F, 9.0F, 15.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.048F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5276F, 8.6745F, -0.0916F, 0.3042F, -0.0275F));

		PartDefinition cube_r156 = tail3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(90, 87).addBox(-0.5F, -1.0878F, 0.1652F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5704F, -0.0912F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(51, 192).addBox(0.0F, -4.3196F, -0.1004F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8496F, 7.1888F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(191, 187).addBox(0.0F, -4.6067F, -0.1067F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7496F, 5.1888F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(191, 153).addBox(0.0F, -5.2026F, 0.0869F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6496F, 2.9888F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(191, 64).addBox(0.0F, -5.2505F, -0.8186F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5496F, 1.8888F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(121, 195).addBox(0.0F, 1.7142F, 5.8616F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(194, 153).addBox(0.0F, 0.3142F, 3.8616F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 192).addBox(0.0F, 0.1399F, 1.8692F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5998F, 0.4116F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(134, 194).addBox(0.0F, 0.0663F, -0.1057F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5998F, 0.4116F, 0.5236F, 0.0F, 0.0F));

		PartDefinition plate5 = tail3.addOrReplaceChild("plate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6852F, -7.2781F, 13.6071F, -0.1963F, -0.001F, 0.0971F));

		PartDefinition cube_r163 = plate5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(137, 106).addBox(-0.5F, -5.0F, -5.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.3196F, -8.7413F, -2.1075F, 0.0F, 0.0F));

		PartDefinition cube_r164 = plate5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(17, 113).addBox(-0.5F, -3.3F, -3.0F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -7.4213F, -1.9129F, -2.5438F, 0.0F, 0.0F));

		PartDefinition cube_r165 = plate5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(28, 137).addBox(-0.5F, -2.2F, 1.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -10.7672F, 3.9642F, -2.4042F, 0.0F, 0.0F));

		PartDefinition cube_r166 = plate5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(95, 151).addBox(-0.5F, -1.9F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -11.7573F, 1.0385F, -2.5438F, 0.0F, 0.0F));

		PartDefinition cube_r167 = plate5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(110, 159).addBox(-0.5F, -1.9F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -9.9232F, 2.8999F, -1.2785F, 0.0F, 0.0F));

		PartDefinition cube_r168 = plate5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(41, 138).addBox(-0.5F, -2.5F, -1.7F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -6.3013F, 3.8065F, -0.7549F, 0.0F, 0.0F));

		PartDefinition cube_r169 = plate5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(131, 22).addBox(-0.5F, -6.1F, -0.2F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9709F, -5.7672F, 0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r170 = plate5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(120, 117).addBox(-0.5F, -4.6086F, -6.5624F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3391F, 8.6295F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r171 = plate5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(150, 106).addBox(-0.5F, -4.3086F, -4.1624F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.0433F, 4.9847F, -0.8683F, 0.0F, 0.0F));

		PartDefinition cube_r172 = plate5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(60, 19).addBox(-0.5F, -8.1669F, -1.1584F, 1.0F, 9.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.048F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2853F, 9.1346F, -0.1002F, 0.2131F, -0.0641F));

		PartDefinition cube_r173 = tail4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(60, 39).addBox(-0.5F, -1.2709F, -0.3162F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.6479F, 0.2589F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r174 = tail4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(105, 198).addBox(0.0F, 6.1885F, 14.854F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 198).addBox(0.0F, 4.3885F, 12.854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 198).addBox(0.0F, 3.6885F, 10.854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 198).addBox(0.0F, 3.0885F, 8.854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(198, 41).addBox(0.0F, 2.5885F, 6.854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(198, 25).addBox(0.0F, 2.0885F, 4.854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7083F, -5.4539F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r175 = tail4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(25, 195).addBox(0.0F, -3.5172F, 6.0358F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 195).addBox(0.0F, -3.3172F, 4.0358F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 195).addBox(0.0F, -3.2172F, 2.0358F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 195).addBox(0.0F, -3.0172F, 0.0358F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5981F, 3.9989F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r176 = tail4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(3, 193).addBox(0.0F, -3.4669F, -0.0649F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5981F, 2.0989F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r177 = tail4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 193).addBox(0.0F, -3.7219F, 0.0344F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5981F, -0.0011F, -0.3752F, 0.0F, 0.0F));

		PartDefinition plate6 = tail4.addOrReplaceChild("plate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0706F, -5.9338F, 15.4672F, -0.109F, 0.001F, -0.0971F));

		PartDefinition cube_r178 = plate6.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(15, 136).addBox(-0.5F, -6.9F, -4.1F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.3196F, -8.7413F, -2.1075F, 0.0F, 0.0F));

		PartDefinition cube_r179 = plate6.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(156, 126).addBox(-0.5F, -5.3F, 0.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -7.4213F, -1.9129F, -2.5438F, 0.0F, 0.0F));

		PartDefinition cube_r180 = plate6.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(186, 182).addBox(-0.5F, -2.2F, 5.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -10.7672F, 3.9643F, -2.4042F, 0.0F, 0.0F));

		PartDefinition cube_r181 = plate6.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(195, 7).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(6, 195).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -6.3327F, -0.8157F, 2.7358F, 0.0F, 0.0F));

		PartDefinition cube_r182 = plate6.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(150, 116).addBox(-0.5F, -2.6F, -2.9F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.3829F, 0.2781F, -1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r183 = plate6.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(142, 8).addBox(-0.5F, -3.9F, -0.2F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9709F, -5.7672F, 0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r184 = plate6.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(104, 140).addBox(-0.5F, -0.6086F, -11.5624F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.3391F, 8.6295F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r185 = plate6.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(121, 159).addBox(-0.5F, -4.2F, -3.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0969F, 0.2154F, -0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r186 = plate6.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(127, 10).addBox(-0.5F, -4.1669F, -1.1584F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.048F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(92, 46).addBox(0.0F, -0.5439F, -0.8306F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4209F, 12.6065F, -0.1833F, 0.3006F, -0.0548F));

		PartDefinition cube_r187 = tail5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(198, 21).addBox(0.0F, -1.2028F, 0.0304F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5439F, 7.1694F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r188 = tail5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(198, 17).addBox(0.0F, -1.5771F, 0.0228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5439F, 5.1694F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r189 = tail5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(198, 13).addBox(0.0F, -1.7427F, -0.0844F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5439F, 3.2694F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r190 = tail5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(12, 198).addBox(0.0F, -2.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 198).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5439F, -0.8306F, -0.0873F, 0.0F, 0.0F));

		PartDefinition plate7 = tail5.addOrReplaceChild("plate7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5281F, -5.1514F, 9.8627F, -0.109F, -0.001F, 0.0971F));

		PartDefinition cube_r191 = plate7.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(177, 104).addBox(-0.5F, -3.0F, -3.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 1.4194F, -6.8795F, -1.7235F, 0.0F, 0.0F));

		PartDefinition cube_r192 = plate7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(104, 168).addBox(-0.5F, -0.9F, -1.7F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.5834F, -3.427F, -2.762F, 0.0F, 0.0F));

		PartDefinition cube_r193 = plate7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(162, 169).addBox(-0.5F, 1.4F, -2.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.3829F, 0.2781F, -1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r194 = plate7.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(128, 151).addBox(-0.5F, -2.0F, -0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9709F, -5.7672F, 0.4843F, 0.0F, 0.0F));

		PartDefinition cube_r195 = plate7.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(14, 191).addBox(-0.5F, 1.1914F, -11.0624F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.3391F, 8.6295F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r196 = plate7.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(184, 187).addBox(-0.5F, 0.5F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4231F, -0.8096F, -0.6414F, 0.0F, 0.0F));

		PartDefinition cube_r197 = plate7.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 163).addBox(-0.5F, -2.1669F, -1.1584F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.048F, 0.0F, 0.0F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(145, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.5786F, 7.9725F, -0.1828F, 0.3006F, -0.0547F));

		PartDefinition tail6 = tail7.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(90, 99).addBox(-0.5F, -0.5111F, -0.0591F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5171F, 6.0408F, -0.2347F, 0.2975F, -0.07F));

		PartDefinition thagomizer2 = tail6.addOrReplaceChild("thagomizer2", CubeListBuilder.create().texOffs(160, 88).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(179, 13).addBox(0.0F, -0.5F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0025F, -0.9742F, 1.6481F, -0.0917F, -0.2841F, -0.5728F));

		PartDefinition cube_r198 = thagomizer2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(62, 16).addBox(-0.0743F, -0.5F, 0.5924F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0F, 0.0F, -1.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r199 = thagomizer2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(110, 10).addBox(0.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer4 = tail6.addOrReplaceChild("thagomizer4", CubeListBuilder.create().texOffs(160, 88).mirror().addBox(-4.0F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(179, 13).mirror().addBox(-4.0F, -0.5F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0025F, -0.9742F, 1.6481F, -0.0917F, 0.2841F, 0.5728F));

		PartDefinition cube_r200 = thagomizer4.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-5.9257F, -0.5F, 0.5924F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -1.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r201 = thagomizer4.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(110, 10).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer3 = tail6.addOrReplaceChild("thagomizer3", CubeListBuilder.create().texOffs(186, 108).addBox(1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(187, 38).addBox(1.0F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6821F, -0.4726F, 5.5156F, -0.1128F, -0.6749F, -0.5279F));

		PartDefinition cube_r202 = thagomizer3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(87, 13).addBox(-0.0743F, -0.5F, 0.5924F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0F, 0.0F, -1.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r203 = thagomizer3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(130, 51).addBox(0.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer5 = tail6.addOrReplaceChild("thagomizer5", CubeListBuilder.create().texOffs(186, 108).mirror().addBox(-4.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(187, 38).mirror().addBox(-4.0F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6821F, -0.4726F, 5.5156F, -0.1128F, 0.6749F, 0.5279F));

		PartDefinition cube_r204 = thagomizer5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(87, 13).mirror().addBox(-5.9257F, -0.5F, 0.5924F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -1.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r205 = thagomizer5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(130, 51).mirror().addBox(-6.0F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition plate9 = tail7.addOrReplaceChild("plate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9259F, -3.6167F, 7.1171F, -0.109F, 0.001F, -0.0971F));

		PartDefinition cube_r206 = plate9.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(192, 127).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.7429F, -5.3589F, -1.8108F, 0.0F, 0.0F));

		PartDefinition cube_r207 = plate9.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(156, 183).addBox(-0.5F, -0.875F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.4939F, -4.1133F, -2.4144F, 0.0323F, 0.0097F));

		PartDefinition cube_r208 = plate9.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(128, 187).addBox(-0.5F, 3.4F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.3829F, 0.2781F, -1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r209 = plate9.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(187, 90).addBox(-0.5F, -2.0F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9709F, -5.7672F, 0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r210 = plate9.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(28, 187).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.1625F, -4.0274F, -0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r211 = plate9.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(195, 4).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2692F, -3.6858F, -0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r212 = plate9.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(189, 145).addBox(-0.5F, -0.1669F, -1.1584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.048F, 0.0F, 0.0F));

		PartDefinition plate10 = tail7.addOrReplaceChild("plate10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8866F, -3.2489F, 10.4969F, -0.109F, -0.001F, 0.0971F));

		PartDefinition cube_r213 = plate10.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(189, 149).addBox(-0.5F, -0.35F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0125F, 0.1233F, -4.0127F, -2.0834F, -0.0581F, -0.0287F));

		PartDefinition cube_r214 = plate10.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(108, 42).addBox(-0.5F, -2.2F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9709F, -5.7672F, -0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r215 = plate10.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(68, 114).addBox(-0.5F, -0.3F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7078F, -4.3548F, -1.8195F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -4.0768F, -3.0647F, 0.1583F, -0.1289F, -0.0031F));

		PartDefinition cube_r216 = body2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(46, 72).addBox(0.5F, -0.9F, 1.95F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1608F, -12.5096F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r217 = body2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(165, 183).addBox(0.0F, -5.5478F, -0.1476F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6597F, -0.4055F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r218 = body2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(86, 184).addBox(0.0F, -6.2991F, -0.0251F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6597F, -2.4055F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(95, 188).addBox(0.0F, -6.7635F, -0.1409F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7597F, -4.3055F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(138, 170).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.7937F, -2.1248F, -0.4757F, 0.2001F, 0.2137F));

		PartDefinition cube_r221 = body2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(185, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.7937F, -2.1248F, -0.3547F, 0.3789F, 0.63F));

		PartDefinition cube_r222 = body2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(197, 197).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.7937F, -2.1248F, 0.3031F, 0.4018F, 2.1181F));

		PartDefinition cube_r223 = body2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(194, 197).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -4.1248F, 0.2552F, 0.3269F, 2.101F));

		PartDefinition cube_r224 = body2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(182, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -4.1248F, -0.2803F, 0.3265F, 0.6557F));

		PartDefinition cube_r225 = body2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(42, 89).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -4.1248F, -0.389F, 0.1809F, 0.2302F));

		PartDefinition cube_r226 = body2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(101, 162).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -6.7248F, -0.2858F, 0.1561F, 0.2475F));

		PartDefinition cube_r227 = body2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(172, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -6.7248F, -0.1944F, 0.2616F, 0.6807F));

		PartDefinition cube_r228 = body2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(191, 197).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -6.7248F, 0.2008F, 0.2361F, 2.0859F));

		PartDefinition cube_r229 = body2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(178, 197).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -9.9248F, 0.1402F, 0.1295F, 2.0749F));

		PartDefinition cube_r230 = body2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(169, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -9.9248F, -0.098F, 0.1836F, 0.702F));

		PartDefinition cube_r231 = body2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(98, 162).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.8937F, -9.9248F, -0.1664F, 0.1252F, 0.2642F));

		PartDefinition cube_r232 = body2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(197, 197).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.7937F, -2.1248F, 0.3031F, -0.4018F, -2.1181F));

		PartDefinition cube_r233 = body2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(185, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.7937F, -2.1248F, -0.3547F, -0.3789F, -0.63F));

		PartDefinition cube_r234 = body2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(138, 170).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.7937F, -2.1248F, -0.4757F, -0.2001F, -0.2137F));

		PartDefinition cube_r235 = body2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(42, 89).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -4.1248F, -0.389F, -0.1809F, -0.2302F));

		PartDefinition cube_r236 = body2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(182, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -4.1248F, -0.2803F, -0.3265F, -0.6557F));

		PartDefinition cube_r237 = body2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(194, 197).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -4.1248F, 0.2552F, -0.3269F, -2.101F));

		PartDefinition cube_r238 = body2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(191, 197).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -6.7248F, 0.2008F, -0.2361F, -2.0859F));

		PartDefinition cube_r239 = body2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(172, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -6.7248F, -0.1944F, -0.2616F, -0.6807F));

		PartDefinition cube_r240 = body2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(101, 162).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -6.7248F, -0.2858F, -0.1561F, -0.2475F));

		PartDefinition cube_r241 = body2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(178, 197).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -9.9248F, 0.1402F, -0.1295F, -2.0749F));

		PartDefinition cube_r242 = body2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(169, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -9.9248F, -0.098F, -0.1836F, -0.702F));

		PartDefinition cube_r243 = body2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(98, 162).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.8937F, -9.9248F, -0.1664F, -0.1252F, -0.2642F));

		PartDefinition cube_r244 = body2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(120, 175).addBox(0.0F, -7.3333F, -0.056F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8382F, -7.394F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r245 = body2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(115, 175).addBox(0.0F, -7.4166F, -0.0555F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9382F, -10.394F, -0.2356F, 0.0F, 0.0F));

		PartDefinition plate8 = body2.addOrReplaceChild("plate8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1536F, -10.9055F, -7.2137F, 0.0655F, -0.001F, 0.0971F));

		PartDefinition cube_r246 = plate8.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, -9.5F, -8.3F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -4.514F, -6.9918F, -2.4042F, 0.0F, 0.0F));

		PartDefinition cube_r247 = plate8.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(138, 177).addBox(-0.5F, 0.4264F, -0.03F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2716F, -7.3703F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r248 = plate8.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(143, 73).addBox(-0.5F, -2.7736F, -0.83F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.9944F, -6.4071F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r249 = plate8.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(26, 148).addBox(-0.5F, -0.1086F, -4.1624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -10.6749F, -1.0166F, 1.8806F, 0.0F, 0.0F));

		PartDefinition cube_r250 = plate8.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(115, 130).addBox(-0.5F, -3.1086F, -6.1624F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.9609F, 6.5515F, 0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r251 = plate8.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(38, 112).addBox(-0.5F, -8.0086F, -6.1624F, 1.0F, 8.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.3391F, 8.6295F, 0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r252 = plate8.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(48, 149).addBox(-0.5F, -5.7086F, -4.1624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0433F, 4.9847F, -0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r253 = plate8.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(37, 149).addBox(-0.5F, -5.7086F, -0.7624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0351F, 1.7376F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r254 = plate8.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(83, 16).addBox(-0.5F, -3.9669F, -2.1584F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition upperbody = body2.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2835F, -10.6105F, -0.1051F, 0.0F, 0.0F));

		PartDefinition cube_r255 = upperbody.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(112, 181).addBox(0.5F, -7.9342F, -0.1146F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4525F, -6.4671F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r256 = upperbody.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(51, 176).addBox(0.5F, -8.1657F, -0.0638F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3525F, -2.6671F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r257 = upperbody.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(76, 183).addBox(0.5F, -8.0637F, 0.0217F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9525F, -4.6671F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r258 = upperbody.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(51, 128).addBox(0.0F, -0.9335F, -6.2319F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.3525F, -0.3671F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r259 = upperbody.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(56, 176).addBox(0.5F, -8.2673F, -0.04F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3525F, -11.6671F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r260 = upperbody.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(34, 113).addBox(0.5F, -8.4764F, -0.187F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3525F, -9.7671F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r261 = upperbody.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(21, 65).addBox(0.5F, -8.315F, -0.1519F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5525F, -7.9671F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r262 = upperbody.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(17, 126).addBox(0.0F, -0.4364F, -6.8463F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.9525F, -6.3671F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r263 = upperbody.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(175, 197).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.2102F, -1.8143F, 0.0436F, -0.0466F, 2.0708F));

		PartDefinition cube_r264 = upperbody.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(166, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.2102F, -1.8143F, 0.0551F, 0.0524F, 0.7201F));

		PartDefinition cube_r265 = upperbody.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(95, 162).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, -0.2102F, -1.8143F, 0.0278F, 0.0707F, 0.2833F));

		PartDefinition cube_r266 = upperbody.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(159, 197).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 0.6898F, -4.3143F, -0.007F, -0.1384F, 2.0755F));

		PartDefinition cube_r267 = upperbody.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(163, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 0.6898F, -4.3143F, 0.1337F, -0.0168F, 0.7215F));

		PartDefinition cube_r268 = upperbody.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(62, 149).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 0.6898F, -4.3143F, 0.1284F, 0.0412F, 0.2889F));

		PartDefinition cube_r269 = upperbody.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(156, 197).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 1.5898F, -6.3143F, -0.0414F, -0.1994F, 2.0813F));

		PartDefinition cube_r270 = upperbody.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(145, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 1.5898F, -6.3143F, 0.1862F, -0.0628F, 0.7194F));

		PartDefinition cube_r271 = upperbody.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(59, 149).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 1.5898F, -6.3143F, 0.1953F, 0.0212F, 0.291F));

		PartDefinition cube_r272 = upperbody.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(197, 154).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 2.4898F, -7.9143F, -0.0678F, -0.245F, 2.0871F));

		PartDefinition cube_r273 = upperbody.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(142, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 2.4898F, -7.9143F, 0.2258F, -0.0973F, 0.7162F));

		PartDefinition cube_r274 = upperbody.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(70, 147).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 2.4898F, -7.9143F, 0.2455F, 0.0061F, 0.2917F));

		PartDefinition cube_r275 = upperbody.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(146, 18).mirror().addBox(-3.8062F, 3.3325F, -0.2326F, 0.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 3.2898F, -9.8143F, 0.2956F, -0.0089F, 0.2916F));

		PartDefinition cube_r276 = upperbody.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(188, 192).mirror().addBox(-2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 3.2898F, -9.8143F, 0.2656F, -0.1316F, 0.7117F));

		PartDefinition cube_r277 = upperbody.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(198, 0).mirror().addBox(0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 3.2898F, -9.8143F, -0.0947F, -0.2905F, 2.0943F));

		PartDefinition cube_r278 = upperbody.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 147).mirror().addBox(-3.8397F, 3.2451F, -0.1975F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 4.2757F, -11.5513F, 0.3407F, -0.1225F, 0.2659F));

		PartDefinition cube_r279 = upperbody.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(115, 192).mirror().addBox(-2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 4.2757F, -11.5513F, 0.2601F, -0.2537F, 0.69F));

		PartDefinition cube_r280 = upperbody.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(142, 18).mirror().addBox(0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3936F, 4.2757F, -11.5513F, -0.2216F, -0.3058F, 2.1088F));

		PartDefinition cube_r281 = upperbody.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(95, 162).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.2102F, -1.8143F, 0.0278F, -0.0707F, -0.2833F));

		PartDefinition cube_r282 = upperbody.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(166, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.2102F, -1.8143F, 0.0551F, -0.0524F, -0.7201F));

		PartDefinition cube_r283 = upperbody.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(175, 197).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, -0.2102F, -1.8143F, 0.0436F, 0.0466F, -2.0708F));

		PartDefinition cube_r284 = upperbody.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(62, 149).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 0.6898F, -4.3143F, 0.1284F, -0.0412F, -0.2889F));

		PartDefinition cube_r285 = upperbody.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(163, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 0.6898F, -4.3143F, 0.1337F, 0.0168F, -0.7215F));

		PartDefinition cube_r286 = upperbody.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(159, 197).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 0.6898F, -4.3143F, -0.007F, 0.1384F, -2.0755F));

		PartDefinition cube_r287 = upperbody.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(59, 149).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 1.5898F, -6.3143F, 0.1953F, -0.0212F, -0.291F));

		PartDefinition cube_r288 = upperbody.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(145, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 1.5898F, -6.3143F, 0.1862F, 0.0628F, -0.7194F));

		PartDefinition cube_r289 = upperbody.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(156, 197).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 1.5898F, -6.3143F, -0.0414F, 0.1994F, -2.0813F));

		PartDefinition cube_r290 = upperbody.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(70, 147).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 2.4898F, -7.9143F, 0.2455F, -0.0061F, -0.2917F));

		PartDefinition cube_r291 = upperbody.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(142, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 2.4898F, -7.9143F, 0.2258F, 0.0973F, -0.7162F));

		PartDefinition cube_r292 = upperbody.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(197, 154).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 2.4898F, -7.9143F, -0.0678F, 0.245F, -2.0871F));

		PartDefinition cube_r293 = upperbody.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(198, 0).addBox(-0.2406F, 0.1376F, -0.179F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.2898F, -9.8143F, -0.0947F, 0.2905F, -2.0943F));

		PartDefinition cube_r294 = upperbody.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(188, 192).addBox(2.034F, 0.6515F, -0.2299F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.2898F, -9.8143F, 0.2656F, 0.1316F, -0.7117F));

		PartDefinition cube_r295 = upperbody.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(146, 18).addBox(3.8062F, 3.3325F, -0.2326F, 0.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 3.2898F, -9.8143F, 0.2956F, 0.0089F, -0.2916F));

		PartDefinition cube_r296 = upperbody.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(142, 18).addBox(-0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 4.2757F, -11.5513F, -0.14F, 0.3463F, -2.039F));

		PartDefinition cube_r297 = upperbody.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(115, 192).addBox(2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 4.2757F, -11.5513F, 0.3135F, 0.1837F, -0.6348F));

		PartDefinition cube_r298 = upperbody.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(67, 147).addBox(3.8397F, 3.2451F, -0.1975F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 4.2757F, -11.5513F, 0.36F, 0.0374F, -0.2207F));

		PartDefinition plate11 = upperbody.addOrReplaceChild("plate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1536F, -9.3945F, -6.4766F, 0.4146F, 0.001F, -0.0971F));

		PartDefinition cube_r299 = plate11.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(71, 72).addBox(-0.5F, -10.1F, -7.9F, 1.0F, 10.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -9.1193F, -4.5194F, -2.6308F, -0.0046F, 0.0021F));

		PartDefinition cube_r300 = plate11.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(178, 34).addBox(-0.5F, 0.4264F, -0.03F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2717F, -7.3703F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r301 = plate11.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(101, 110).addBox(-0.5F, -3.1736F, -0.13F, 1.0F, 3.0F, 8.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -6.6365F, -6.7238F, -0.781F, 0.0F, 0.0F));

		PartDefinition cube_r302 = plate11.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -4.7736F, -0.83F, 1.0F, 6.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.9944F, -6.4071F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r303 = plate11.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(113, 55).addBox(-0.5F, -5.6836F, -6.0124F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.9609F, 6.5515F, 0.7461F, 0.0F, 0.0F));

		PartDefinition cube_r304 = plate11.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(85, 120).addBox(-0.5F, -0.2086F, -5.8624F, 1.0F, 6.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -7.8473F, 7.3285F, 0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r305 = plate11.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(15, 147).addBox(-0.5F, -6.1086F, -4.1624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0433F, 4.9847F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r306 = plate11.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(149, 18).addBox(-0.5F, -5.7086F, -0.7624F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0351F, 1.7376F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r307 = plate11.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(46, 86).addBox(-0.5F, -3.9669F, -2.1584F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition plate12 = upperbody.addOrReplaceChild("plate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9348F, -7.0815F, -12.9435F, 0.6589F, -0.001F, 0.0971F));

		PartDefinition cube_r308 = plate12.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(160, 55).addBox(-0.5F, -4.0F, -3.9F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0041F, -8.2469F, -4.0306F, -2.6134F, 0.0046F, -0.0021F));

		PartDefinition cube_r309 = plate12.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(184, 41).addBox(-0.5F, 0.1264F, -1.83F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -3.1714F, -8.958F, 1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r310 = plate12.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(166, 0).addBox(-0.5F, -0.9736F, -0.73F, 1.0F, 6.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2717F, -7.3703F, 0.8247F, 0.0F, 0.0F));

		PartDefinition cube_r311 = plate12.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(68, 120).addBox(-0.5F, -3.1736F, 0.07F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -6.6365F, -6.7238F, -1.0077F, 0.004F, -0.0032F));

		PartDefinition cube_r312 = plate12.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -6.386F, -6.2955F, -0.5978F, 0.0F, 0.0F));

		PartDefinition cube_r313 = plate12.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(53, 114).addBox(-0.5F, -3.5F, -3.0F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.551F, 0.7277F, 0.8159F, 0.0F, 0.0F));

		PartDefinition cube_r314 = plate12.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(90, 72).addBox(-0.5F, -0.1086F, -7.9624F, 1.0F, 6.0F, 8.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -6.1809F, 5.3228F, 0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r315 = plate12.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(42, 178).addBox(-0.5F, -1.8353F, -0.8849F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0165F, -0.3002F, 3.719F, -0.7078F, -0.0085F, 0.0126F));

		PartDefinition cube_r316 = plate12.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(144, 159).addBox(-0.5F, -0.9629F, -2.0248F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0165F, -0.3002F, 3.719F, -1.3187F, -0.0085F, 0.0126F));

		PartDefinition cube_r317 = plate12.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(130, 90).addBox(-0.5F, -3.9669F, -0.1584F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(92, 58).addBox(-0.6064F, -0.3F, -9.2F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6064F, 4.9757F, -12.2513F, 0.808F, -0.1233F, -0.003F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(144, 151).addBox(-0.1064F, -6.0F, -0.1F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(115, 122).addBox(-0.1064F, -6.0F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.2F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(153, 186).addBox(-0.1064F, -6.5F, 0.0F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -3.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(19, 89).mirror().addBox(-0.2F, 0.2F, 0.6F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3027F, 17.884F, -10.7361F, -0.9016F, -0.7324F, 1.1051F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-1.2F, 0.2F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 0).mirror().addBox(-1.2F, 0.2F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3027F, 17.884F, -10.7361F, -0.8443F, -0.7107F, 1.0843F));

		PartDefinition cube_r323 = chest.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(109, 70).mirror().addBox(-0.3F, 0.3F, -0.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7864F, 16.7496F, -11.3988F, -0.8762F, -0.6104F, 1.3198F));

		PartDefinition cube_r324 = chest.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3673F, 13.0936F, -15.2804F, 0.5569F, -1.0823F, 0.1658F));

		PartDefinition cube_r325 = chest.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(34, 179).mirror().addBox(-0.5F, -2.3526F, -1.7478F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2174F, 8.0397F, -14.3914F, -0.2285F, -1.0823F, 0.1658F));

		PartDefinition cube_r326 = chest.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(162, 24).mirror().addBox(-0.5F, -2.85F, -0.7527F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2174F, 8.0397F, -14.3914F, 0.1642F, -1.0823F, 0.1658F));

		PartDefinition cube_r327 = chest.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(145, 126).mirror().addBox(-1.4805F, -1.0183F, -8.6272F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, -0.0954F, -0.3175F, 0.5313F));

		PartDefinition cube_r328 = chest.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(189, 141).mirror().addBox(-1.4805F, 0.2117F, -4.8904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, -0.4008F, -0.3175F, 0.5313F));

		PartDefinition cube_r329 = chest.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(73, 149).mirror().addBox(-1.4805F, 3.3091F, -5.7058F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, -0.5317F, -0.3175F, 0.5313F));

		PartDefinition cube_r330 = chest.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(195, 124).mirror().addBox(-1.6911F, 1.7277F, 5.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(195, 121).mirror().addBox(-1.6911F, 2.0277F, 5.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, 0.8327F, 0.0007F, 0.5854F));

		PartDefinition cube_r331 = chest.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(72, 193).mirror().addBox(-1.6911F, -2.5412F, 6.0863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(130, 130).mirror().addBox(-1.6911F, -1.7862F, 0.2259F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, 0.0735F, 0.0007F, 0.5854F));

		PartDefinition cube_r332 = chest.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(67, 193).mirror().addBox(-1.6911F, -3.1898F, 5.3264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, -0.3192F, 0.0007F, 0.5854F));

		PartDefinition cube_r333 = chest.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(80, 177).mirror().addBox(-1.6911F, -1.6256F, 0.8007F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, 0.4225F, 0.0007F, 0.5854F));

		PartDefinition cube_r334 = chest.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(159, 176).mirror().addBox(-1.6911F, -2.2217F, 3.5266F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, 0.248F, 0.0007F, 0.5854F));

		PartDefinition cube_r335 = chest.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(7, 171).mirror().addBox(-3.8397F, 3.2451F, -0.1975F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -6.9F, -0.1257F, 0.0716F, 0.2123F));

		PartDefinition cube_r336 = chest.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(128, 192).mirror().addBox(-2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -6.9F, -0.0838F, 0.1179F, 0.6481F));

		PartDefinition cube_r337 = chest.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(44, 197).mirror().addBox(0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -6.9F, 0.0783F, 0.1025F, 2.0117F));

		PartDefinition cube_r338 = chest.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(59, 176).mirror().addBox(-3.8397F, 3.2451F, -0.1975F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -5.1F, -0.2113F, 0.0897F, 0.2053F));

		PartDefinition cube_r339 = chest.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(192, 121).mirror().addBox(-2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -5.1F, -0.1543F, 0.1703F, 0.638F));

		PartDefinition cube_r340 = chest.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(153, 195).mirror().addBox(0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -5.1F, 0.1161F, 0.1813F, 2.0171F));

		PartDefinition cube_r341 = chest.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(126, 168).mirror().addBox(-3.8397F, 3.2451F, -0.1975F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -3.1F, -0.3145F, 0.1105F, 0.195F));

		PartDefinition cube_r342 = chest.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(118, 192).mirror().addBox(-2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -3.1F, -0.2407F, 0.232F, 0.6207F));

		PartDefinition cube_r343 = chest.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(147, 177).mirror().addBox(0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -3.1F, 0.163F, 0.2755F, 2.0277F));

		PartDefinition cube_r344 = chest.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(141, 151).mirror().addBox(-3.8397F, 3.2451F, -0.1975F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -1.1F, -0.3835F, 0.1238F, 0.187F));

		PartDefinition cube_r345 = chest.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(192, 115).mirror().addBox(-2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -1.1F, -0.2996F, 0.2722F, 0.606F));

		PartDefinition cube_r346 = chest.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(11, 163).mirror().addBox(0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2129F, -0.2F, -1.1F, 0.1956F, 0.338F, 2.0376F));

		PartDefinition cube_r347 = chest.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(145, 91).mirror().addBox(-1.4805F, -1.6322F, -3.8578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 149).mirror().addBox(-1.4805F, -3.6322F, -7.8578F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2568F, 4.3207F, -5.0783F, 0.21F, -0.3175F, 0.5313F));

		PartDefinition cube_r348 = chest.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(44, 197).addBox(-0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -6.9F, 0.0783F, -0.1025F, -2.0117F));

		PartDefinition cube_r349 = chest.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(128, 192).addBox(2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -6.9F, -0.0838F, -0.1179F, -0.6481F));

		PartDefinition cube_r350 = chest.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(7, 171).addBox(3.8397F, 3.2451F, -0.1975F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -6.9F, -0.1257F, -0.0716F, -0.2123F));

		PartDefinition cube_r351 = chest.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(153, 195).addBox(-0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.1F, 0.1161F, -0.1813F, -2.0171F));

		PartDefinition cube_r352 = chest.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(192, 121).addBox(2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.1F, -0.1543F, -0.1703F, -0.638F));

		PartDefinition cube_r353 = chest.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(59, 176).addBox(3.8397F, 3.2451F, -0.1975F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -5.1F, -0.2113F, -0.0897F, -0.2053F));

		PartDefinition cube_r354 = chest.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(147, 177).addBox(-0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.1F, 0.163F, -0.2755F, -2.0277F));

		PartDefinition cube_r355 = chest.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(118, 192).addBox(2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.1F, -0.2407F, -0.232F, -0.6207F));

		PartDefinition cube_r356 = chest.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(126, 168).addBox(3.8397F, 3.2451F, -0.1975F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.1F, -0.3145F, -0.1105F, -0.195F));

		PartDefinition cube_r357 = chest.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(11, 163).addBox(-0.1628F, 0.1887F, -0.1425F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.1F, 0.1956F, -0.338F, -2.0376F));

		PartDefinition cube_r358 = chest.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(192, 115).addBox(2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.1F, -0.2996F, -0.2722F, -0.606F));

		PartDefinition cube_r359 = chest.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(80, 177).addBox(0.6911F, -1.6256F, 0.8007F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, 0.4225F, -0.0007F, -0.5854F));

		PartDefinition cube_r360 = chest.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(195, 124).addBox(0.6911F, 1.7277F, 5.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(195, 121).addBox(0.6911F, 2.0277F, 5.871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, 0.8327F, -0.0007F, -0.5854F));

		PartDefinition cube_r361 = chest.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(72, 193).addBox(0.6911F, -2.5412F, 6.0863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(130, 130).addBox(0.6911F, -1.7862F, 0.2259F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, 0.0735F, -0.0007F, -0.5854F));

		PartDefinition cube_r362 = chest.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(67, 193).addBox(0.6911F, -3.1898F, 5.3264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, -0.3192F, -0.0007F, -0.5854F));

		PartDefinition cube_r363 = chest.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(159, 176).addBox(0.6911F, -2.2217F, 3.5266F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, 0.248F, -0.0007F, -0.5854F));

		PartDefinition cube_r364 = chest.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(189, 141).addBox(0.4805F, 0.2117F, -4.8904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, -0.4008F, 0.3175F, -0.5313F));

		PartDefinition cube_r365 = chest.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(145, 91).addBox(0.4805F, -1.6322F, -3.8578F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(84, 149).addBox(0.4805F, -3.6322F, -7.8578F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, 0.21F, 0.3175F, -0.5313F));

		PartDefinition cube_r366 = chest.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(73, 149).addBox(0.4805F, 3.3091F, -5.7058F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, -0.5317F, 0.3175F, -0.5313F));

		PartDefinition cube_r367 = chest.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(25, 47).addBox(-0.5F, -2.5F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1545F, 13.0936F, -15.2804F, 0.5569F, 1.0823F, -0.1658F));

		PartDefinition cube_r368 = chest.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(34, 179).addBox(-0.5F, -2.3526F, -1.7478F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0046F, 8.0397F, -14.3914F, -0.2285F, 1.0823F, -0.1658F));

		PartDefinition cube_r369 = chest.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(162, 24).addBox(-0.5F, -2.85F, -0.7527F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0046F, 8.0397F, -14.3914F, 0.1642F, 1.0823F, -0.1658F));

		PartDefinition cube_r370 = chest.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(145, 126).addBox(0.4805F, -1.0183F, -8.6272F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.0439F, 4.3207F, -5.0783F, -0.0954F, 0.3175F, -0.5313F));

		PartDefinition cube_r371 = chest.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(141, 151).addBox(3.8397F, 3.2451F, -0.1975F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.1F, -0.3835F, -0.1238F, -0.187F));

		PartDefinition cube_r372 = chest.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(125, 183).addBox(-0.1064F, -7.6F, 0.0F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.2F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r373 = chest.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(80, 110).addBox(0.2F, 0.2F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(110, 0).addBox(0.2F, 0.2F, 0.2F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0898F, 17.884F, -10.7361F, -0.8443F, 0.7107F, -1.0843F));

		PartDefinition cube_r374 = chest.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(19, 89).addBox(-0.8F, 0.2F, 0.6F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0898F, 17.884F, -10.7361F, -0.9016F, 0.7324F, -1.1051F));

		PartDefinition cube_r375 = chest.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(109, 70).addBox(-0.7F, 0.3F, -0.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5735F, 16.7496F, -11.3988F, -0.8762F, 0.6104F, -1.3198F));

		PartDefinition cube_r376 = chest.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(131, 0).addBox(-1.0F, -0.9F, 0.1F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 14.2408F, -14.4624F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r377 = chest.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(145, 59).addBox(-1.5F, 3.1F, -0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, 9.7F, -11.7F, -1.2654F, 0.0F, 0.0F));

		PartDefinition plate13 = chest.addOrReplaceChild("plate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3456F, -10.0756F, 1.7756F, 0.2662F, 0.001F, -0.0971F));

		PartDefinition cube_r378 = plate13.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(117, 149).addBox(-0.5F, -5.1F, -0.1F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.0197F, -9.6727F, 0.0002F, -2.8926F, -0.0046F, 0.0021F));

		PartDefinition cube_r379 = plate13.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(155, 7).addBox(-0.5F, -1.7F, -0.8F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.0254F, -4.529F, 1.8631F, 0.0F, 0.0F));

		PartDefinition cube_r380 = plate13.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(178, 170).addBox(-0.5F, 2.1264F, 0.17F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2716F, -7.3703F, 0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r381 = plate13.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(34, 127).addBox(-0.5F, -3.5736F, 0.27F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -6.6365F, -6.7238F, -0.9204F, -0.004F, 0.0032F));

		PartDefinition cube_r382 = plate13.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(173, 16).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -7.3181F, -5.177F, -0.432F, 0.0F, 0.0F));

		PartDefinition cube_r383 = plate13.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(160, 46).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8308F, 4.9827F, -0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r384 = plate13.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(129, 179).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.6431F, 6.3399F, -0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r385 = plate13.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(180, 48).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1352F, 5.0082F, 0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r386 = plate13.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(0, 130).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -6.551F, 0.7277F, 1.4704F, 0.0F, 0.0F));

		PartDefinition cube_r387 = plate13.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(0, 181).addBox(-0.5F, -3.9669F, 0.0416F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.0954F, 1.6036F, 0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r388 = plate13.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(100, 122).addBox(-0.5F, -5.9669F, -0.1584F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition plate19 = chest.addOrReplaceChild("plate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0218F, -8.8642F, -5.0733F, -0.1701F, -0.001F, 0.0971F));

		PartDefinition cube_r389 = plate19.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(143, 186).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0109F, -5.2671F, -3.9356F, -2.7094F, 0.0046F, -0.0021F));

		PartDefinition cube_r390 = plate19.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(156, 65).addBox(-0.5F, -3.1F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.7069F, -2.9588F, 2.5176F, 0.0F, 0.0F));

		PartDefinition cube_r391 = plate19.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(180, 74).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.8079F, -2.9484F, 0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r392 = plate19.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(150, 173).addBox(-0.5F, -4.1736F, -0.03F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0144F, -2.1367F, -6.6929F, -0.7284F, 0.004F, -0.0032F));

		PartDefinition cube_r393 = plate19.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(179, 7).addBox(-0.5F, -1.0F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.5704F, -4.4132F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r394 = plate19.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(188, 95).addBox(-0.5F, -1.0F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7796F, 0.2567F, -0.7985F, 0.0F, 0.0F));

		PartDefinition cube_r395 = plate19.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(98, 186).addBox(-0.5F, -3.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8441F, 2.4483F, 0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r396 = plate19.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(54, 138).addBox(-0.5F, -3.875F, -2.9F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.5812F, 0.2275F, 1.0777F, 0.0F, 0.0F));

		PartDefinition cube_r397 = plate19.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(156, 188).addBox(-0.5F, -2.0669F, -0.2584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.2994F, 0.9983F, 1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r398 = plate19.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(48, 160).addBox(-0.5F, -3.4669F, 1.2416F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, 0.2138F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3504F, 11.5517F, -12.313F, -0.0842F, -0.05F, -0.121F));

		PartDefinition cube_r399 = frontleftleg2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(115, 168).addBox(-1.0F, -1.5F, -2.1F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 10.1028F, 0.3402F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r400 = frontleftleg2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(141, 168).addBox(-1.0F, -5.5F, 0.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.3588F, -0.8931F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r401 = frontleftleg2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(168, 104).addBox(-1.0F, -3.0F, 0.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 5.8612F, -1.0021F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r402 = frontleftleg2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(171, 48).addBox(-1.0F, -3.3332F, 0.8678F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1388F, -1.3021F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r403 = frontleftleg2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(168, 182).addBox(-1.0F, 0.0158F, -0.122F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 4.1458F, -3.7228F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r404 = frontleftleg2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(182, 163).addBox(-1.0F, 0.0158F, -0.122F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 2.214F, -4.2404F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r405 = frontleftleg2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(62, 166).addBox(-1.0F, -3.9842F, -2.122F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.3612F, -2.6021F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r406 = frontleftleg2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(15, 158).addBox(-1.0F, -0.6F, -0.8F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 0.8612F, -0.4021F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create().texOffs(187, 33).addBox(-1.3352F, -1.0559F, 0.5847F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5744F, 11.624F, 0.5224F, -1.3937F, 0.0216F, 0.1318F));

		PartDefinition cube_r407 = frontleftleg3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(161, 106).addBox(-1.0F, -3.5F, -0.8F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3352F, 5.1441F, -1.4153F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r408 = frontleftleg3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(100, 181).addBox(0.4996F, -1.9987F, -1.1689F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r409 = frontleftleg3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(184, 21).addBox(0.4996F, -3.9551F, -0.1061F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8348F, 5.6428F, -0.0464F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r410 = frontleftleg3.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(35, 167).addBox(0.4996F, 0.0013F, -1.4689F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 167).addBox(0.4996F, 0.0013F, -1.0689F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create().texOffs(167, 70).addBox(-3.0F, 0.3166F, -3.5736F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(149, 29).addBox(1.0F, 0.3166F, -3.5736F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(95, 157).addBox(-2.5F, -0.6834F, -1.5736F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0618F, 12.5457F, -1.3371F, 1.693F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5633F, 11.5517F, -12.313F, -0.2588F, 0.05F, 0.121F));

		PartDefinition cube_r411 = frontrightleg2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(51, 169).addBox(-1.0F, -1.5F, -2.1F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 10.1028F, 0.3402F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r412 = frontrightleg2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(42, 169).addBox(-1.0F, -5.5F, 0.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.3588F, -0.8931F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r413 = frontrightleg2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(169, 34).addBox(-1.0F, -3.0F, 0.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 5.8612F, -1.0021F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r414 = frontrightleg2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(171, 56).addBox(-1.0F, -3.3332F, 0.8678F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1388F, -1.3021F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r415 = frontrightleg2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(67, 183).addBox(-1.0F, 0.0158F, -0.122F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 4.1458F, -3.7228F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r416 = frontrightleg2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(177, 182).addBox(-1.0F, 0.0158F, -0.122F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.214F, -4.2404F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r417 = frontrightleg2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(73, 166).addBox(-1.0F, -3.9842F, -2.122F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 3.3612F, -2.6021F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r418 = frontrightleg2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(158, 37).addBox(-1.0F, -0.6F, -0.8F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.8612F, -0.4021F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create().texOffs(50, 187).addBox(-0.6648F, -1.0559F, 0.5847F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5744F, 11.624F, 0.5224F, -0.4338F, -0.0216F, -0.1318F));

		PartDefinition cube_r419 = frontrightleg3.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(155, 161).addBox(-1.0F, -3.5F, -0.8F, 2.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3352F, 5.1441F, -1.4153F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r420 = frontrightleg3.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(181, 111).addBox(-2.4996F, -1.9987F, -1.1689F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r421 = frontrightleg3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(184, 27).addBox(-2.4996F, -3.9551F, -0.1061F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8348F, 5.6428F, -0.0464F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r422 = frontrightleg3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(167, 124).addBox(-2.4996F, 0.0013F, -1.4689F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 167).addBox(-2.4996F, 0.0013F, -1.0689F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create().texOffs(167, 149).addBox(-1.0F, 0.3166F, -3.5736F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(104, 149).addBox(-2.0F, 0.3166F, -3.5736F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 158).addBox(-1.5F, -0.6834F, -1.5736F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0618F, 12.5457F, -1.3371F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6064F, 0.8647F, -8.8819F, -1.2032F, 0.0F, 0.0F));

		PartDefinition cube_r423 = neck.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(163, 0).addBox(0.0F, -4.6923F, -0.1499F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3097F, -1.2944F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r424 = neck.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(126, 90).addBox(0.0F, -3.2132F, -0.0737F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0903F, -2.6944F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r425 = neck.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(6, 198).addBox(0.0F, -2.2341F, -0.1975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4903F, -4.0944F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r426 = neck.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(135, 117).addBox(-0.5F, -0.8093F, -0.3765F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 3.3903F, -4.3943F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r427 = neck.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(63, 195).mirror().addBox(-3.8397F, 3.2451F, -0.1975F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -0.4647F, -0.6181F, 1.2434F, -0.1948F, 0.111F));

		PartDefinition cube_r428 = neck.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(131, 192).mirror().addBox(-2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -0.4647F, -0.6181F, 1.1774F, -0.6041F, 0.2769F));

		PartDefinition cube_r429 = neck.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(102, 13).mirror().addBox(0.1628F, 1.1887F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -0.4647F, -0.6181F, -0.917F, -1.047F, 2.5844F));

		PartDefinition cube_r430 = neck.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(102, 13).addBox(-0.1628F, 1.1887F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0936F, -0.4647F, -0.6181F, -0.917F, 1.047F, -2.5844F));

		PartDefinition cube_r431 = neck.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(131, 192).addBox(2.1013F, 0.5865F, -0.1948F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0936F, -0.4647F, -0.6181F, 1.1774F, 0.6041F, -0.2769F));

		PartDefinition cube_r432 = neck.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(63, 195).addBox(3.8397F, 3.2451F, -0.1975F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0936F, -0.4647F, -0.6181F, 1.2434F, 0.1948F, -0.111F));

		PartDefinition plate14 = neck.addOrReplaceChild("plate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5581F, -0.5183F, -6.6784F, 0.1221F, 0.0378F, -0.1681F));

		PartDefinition plate15 = neck.addOrReplaceChild("plate15", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4581F, 0.4817F, -8.6784F, -0.096F, -0.0378F, 0.1681F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.7903F, -3.8943F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r433 = neck4.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(34, 124).addBox(0.0F, -2.9272F, -1.8582F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(180, 142).addBox(-0.5F, -1.9272F, -2.8582F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6103F, -2.7881F, 0.2327F, -0.1417F, -0.1659F));

		PartDefinition cube_r434 = neck5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(175, 7).addBox(0.0F, -1.4754F, -2.3331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(80, 174).addBox(0.0F, -1.4754F, -0.3331F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(159, 173).addBox(0.0F, -1.4754F, 1.6669F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(119, 140).addBox(-0.5F, -0.4754F, -3.3331F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition plate20 = neck5.addOrReplaceChild("plate20", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5251F, -7.8069F, -2.1608F, 0.0917F, 0.001F, -0.0971F));

		PartDefinition cube_r435 = plate20.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(189, 52).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.016F, -3.8213F, -3.4889F, 3.0085F, -0.0653F, 0.0353F));

		PartDefinition cube_r436 = plate20.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(21, 185).addBox(-0.5F, -2.9F, -1.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.7069F, -2.9588F, 2.5176F, 0.0F, 0.0F));

		PartDefinition cube_r437 = plate20.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(193, 104).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.8079F, -2.9484F, 0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r438 = plate20.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(14, 185).addBox(-0.5F, -2.9736F, 0.07F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0221F, -1.5112F, -5.2407F, -0.1874F, -0.004F, 0.0032F));

		PartDefinition cube_r439 = plate20.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(188, 5).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.5704F, -4.4132F, 0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r440 = plate20.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(7, 185).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.323F, -0.2835F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r441 = plate20.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(136, 184).addBox(-0.5F, 0.025F, -2.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -4.3193F, -2.5848F, 0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r442 = plate20.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 188).addBox(-0.5F, -0.9F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.6569F, -1.3732F, 1.3832F, 0.0F, 0.0F));

		PartDefinition cube_r443 = plate20.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(79, 184).addBox(-0.5F, -2.4669F, 1.2416F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, 0.2138F, 0.0F, 0.0F));

		PartDefinition neck2 = neck5.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8586F, -6.0224F, -0.0419F, -0.3911F, -0.0404F));

		PartDefinition cube_r444 = neck2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(198, 100).addBox(0.0F, -1.3803F, -2.9913F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 198).addBox(0.0F, -1.3803F, -0.9913F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(191, 30).addBox(0.0F, -1.3803F, 1.0087F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 178).addBox(0.0F, -1.3803F, 3.0087F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 55).addBox(-0.5F, -0.3803F, -2.9913F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5789F, -3.6993F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r445 = neck2.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(145, 83).addBox(-1.0F, -1.8316F, -0.1176F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 3.0397F, -6.813F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r446 = neck2.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(160, 81).addBox(-1.0F, -1.9685F, -0.1691F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4541F, -1.905F, -0.1047F, 0.0F, 0.0F));

		PartDefinition plate21 = neck2.addOrReplaceChild("plate21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3996F, -5.6049F, -1.3525F, -0.0392F, -0.001F, 0.0971F));

		PartDefinition cube_r447 = plate21.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(196, 148).addBox(-0.5F, 0.1F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.0902F, -2.7867F, -3.111F, 0.0F, 0.0F));

		PartDefinition cube_r448 = plate21.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(194, 64).addBox(-0.5F, -2.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.0027F, -1.3791F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r449 = plate21.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(77, 194).addBox(-0.5F, -3.1736F, 2.57F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0221F, -1.5112F, -5.2407F, -0.1874F, 0.004F, -0.0032F));

		PartDefinition cube_r450 = plate21.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(67, 188).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1821F, -2.459F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r451 = plate21.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(194, 68).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3101F, -0.4575F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r452 = plate21.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(41, 188).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3239F, -0.2225F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r453 = plate21.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(191, 18).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 0.6569F, -1.3732F, 1.3832F, 0.0F, 0.0F));

		PartDefinition cube_r454 = plate21.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(150, 168).addBox(-0.5F, -2.4669F, 2.8416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, 0.2138F, 0.0F, 0.0F));

		PartDefinition plate16 = neck2.addOrReplaceChild("plate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2063F, -3.5764F, -5.5355F, -0.0217F, 0.001F, -0.0971F));

		PartDefinition cube_r455 = plate16.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(194, 90).addBox(-0.5F, -2.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1027F, -0.0791F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r456 = plate16.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(191, 161).addBox(-0.5F, -2.8736F, 2.87F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0221F, -3.4112F, -3.9407F, -0.1874F, -0.004F, 0.0032F));

		PartDefinition cube_r457 = plate16.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(191, 41).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.7179F, -1.159F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r458 = plate16.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(82, 194).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2101F, 0.8425F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r459 = plate16.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(191, 26).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.224F, 1.0775F, 0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r460 = plate16.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(191, 22).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.2431F, -0.0732F, 1.3832F, 0.0F, 0.0F));

		PartDefinition cube_r461 = plate16.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(168, 176).addBox(-0.5F, -2.4669F, 2.8416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.1692F, -3.0964F, 0.2138F, 0.0F, 0.0F));

		PartDefinition neck6 = neck2.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5789F, -6.6993F, -0.132F, -0.4517F, -0.1018F));

		PartDefinition cube_r462 = neck6.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(198, 103).addBox(0.0F, -1.7F, -3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 198).addBox(0.0F, -1.7F, -1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 150).addBox(-0.5F, -0.7F, -4.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r463 = neck6.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(0, 142).addBox(-1.0F, -2.0F, -0.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8886F, -4.1136F, 0.2618F, 0.0F, 0.0F));

		PartDefinition plate17 = neck6.addOrReplaceChild("plate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1588F, -2.4738F, -2.2485F, -0.0217F, -0.001F, 0.0971F));

		PartDefinition cube_r464 = plate17.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(194, 30).addBox(-0.5F, -2.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1027F, -0.0791F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r465 = plate17.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(104, 162).addBox(-0.5F, -3.0736F, -0.03F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0389F, -1.6548F, -1.1185F, -0.2746F, 0.004F, -0.0032F));

		PartDefinition cube_r466 = plate17.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(193, 181).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2101F, 0.8424F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r467 = plate17.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(21, 191).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.2431F, -0.0732F, 1.3832F, 0.0F, 0.0F));

		PartDefinition cube_r468 = plate17.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(156, 193).addBox(-0.5F, -1.6669F, 2.8416F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.1692F, -3.0964F, 0.2138F, 0.0F, 0.0F));

		PartDefinition plate22 = neck6.addOrReplaceChild("plate22", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0984F, -1.8289F, -4.6631F, -0.0217F, 0.001F, -0.0971F));

		PartDefinition cube_r469 = plate22.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(196, 72).addBox(-0.5F, -1.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1027F, -0.0791F, 0.4145F, 0.0F, 0.0F));

		PartDefinition cube_r470 = plate22.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(194, 34).addBox(-0.5F, -1.1986F, 0.47F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0389F, -1.6548F, -1.1185F, -0.1874F, -0.004F, 0.0032F));

		PartDefinition cube_r471 = plate22.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(193, 100).addBox(-0.5F, 0.8F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2101F, 0.8424F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r472 = plate22.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(196, 60).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.2431F, -0.0732F, 1.3832F, 0.0F, 0.0F));

		PartDefinition neck3 = neck6.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3708F, -4.9169F, 0.1351F, 0.0F, 0.0F));

		PartDefinition cube_r473 = neck3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(111, 198).addBox(0.0F, -1.55F, -5.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 198).addBox(0.0F, -1.55F, -3.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(183, 126).addBox(-0.5F, -0.65F, -5.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 0.2857F, 2.5523F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r474 = neck3.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(182, 153).addBox(-1.0F, -1.95F, -0.05F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 5.1434F, -1.3392F, 0.3665F, 0.0F, 0.0F));

		PartDefinition plate23 = neck3.addOrReplaceChild("plate23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0456F, -1.6393F, -1.4588F, -0.0217F, -0.001F, 0.0971F));

		PartDefinition cube_r475 = plate23.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(196, 57).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1027F, -0.0791F, 0.24F, 0.0F, 0.0F));

		PartDefinition cube_r476 = plate23.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(196, 75).addBox(-0.5F, -0.3986F, 0.67F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0389F, -1.6548F, -1.1185F, -0.1874F, 0.004F, -0.0032F));

		PartDefinition cube_r477 = plate23.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(196, 54).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6609F, 0.1486F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r478 = plate23.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(196, 51).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.2431F, -0.0732F, 1.3832F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8222F, -2.533F, 0.0553F, 0.0F, 0.0F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(111, 106).addBox(-1.5F, -0.0152F, -2.0058F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -0.3655F, -3.9685F, 0.7199F, 0.0F, 0.0F));

		PartDefinition cube_r480 = head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(104, 135).addBox(-2.0F, -0.0285F, -2.0057F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -1.5655F, -2.3685F, 0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r481 = head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(196, 165).addBox(-1.0F, -1.118F, -0.1752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(196, 162).addBox(-1.0F, -0.818F, -0.1752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(197, 10).addBox(-1.0F, -0.418F, -0.1752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5F, 3.8163F, -8.5184F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r482 = head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(71, 197).addBox(-1.0F, -0.9795F, -1.6995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.3163F, -6.4184F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r483 = head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(191, 135).addBox(0.0F, 0.0262F, -0.0382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5981F, -6.6251F, 0.5716F, 0.0F, 0.0F));

		PartDefinition cube_r484 = head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(108, 191).addBox(0.0F, -0.0713F, -0.1197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 2.7981F, -8.125F, 0.624F, 0.0F, 0.0F));

		PartDefinition cube_r485 = head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(104, 176).addBox(-2.5F, -2.0259F, -0.0038F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, 1.4163F, -2.0184F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r486 = head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(180, 70).addBox(-2.5F, -1.6259F, -2.0038F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(180, 66).addBox(-2.5F, -1.0259F, -2.0038F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 1.4163F, -2.0184F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r487 = head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(175, 187).addBox(-1.5F, -0.0421F, -0.6953F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7837F, -1.7184F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r488 = head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(187, 168).addBox(-2.0F, -0.075F, -0.9381F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -2.2837F, -0.9184F, 0.5934F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(168, 187).addBox(-1.1028F, -0.2319F, 0.8423F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offset(1.6028F, -1.0518F, -2.7607F));

		PartDefinition cube_r489 = leftFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(135, 190).addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3299F, -0.3928F, 0.5166F, 0.415F, -0.4537F, -0.2317F));

		PartDefinition cube_r490 = leftFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(135, 126).addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6465F, 0.2055F, 0.0467F));

		PartDefinition cube_r491 = leftFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(190, 10).addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2972F, 0.8369F, -1.1006F, 0.6513F, -0.0556F, -0.0423F));

		PartDefinition cube_r492 = leftFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(196, 168).addBox(-0.55F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6562F, 2.2971F, -0.7905F, 0.6393F, 0.1662F, 0.1544F));

		PartDefinition cube_r493 = leftFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(197, 111).addBox(-0.5F, -0.3982F, -1.335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1414F, 3.7924F, -2.8085F, 0.3054F, 0.1745F, 0.0F));

		PartDefinition cube_r494 = leftFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(97, 197).addBox(-0.5F, -0.4437F, -0.7469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1414F, 3.7924F, -2.8085F, 0.4189F, 0.1745F, 0.0F));

		PartDefinition cube_r495 = leftFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(87, 197).addBox(-1.0F, -0.8894F, -2.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6028F, 3.4681F, -1.8577F, 0.4189F, 0.1396F, 0.0F));

		PartDefinition cube_r496 = leftFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(175, 190).addBox(-0.5F, -0.4479F, -0.1604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1414F, 3.7924F, -2.8085F, 0.4887F, 0.1745F, 0.0F));

		PartDefinition cube_r497 = leftFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(79, 190).addBox(-1.0F, -0.9675F, -1.0107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6028F, 3.4681F, -1.8577F, 0.4887F, 0.1396F, 0.0F));

		PartDefinition cube_r498 = leftFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(182, 16).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2305F, 2.7654F, -2.7309F, 0.5685F, 0.1547F, 0.009F));

		PartDefinition cube_r499 = leftFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(190, 111).addBox(-0.55F, -0.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9127F, 2.194F, -1.9225F, 0.5972F, 0.1712F, 0.1625F));

		PartDefinition cube_r500 = leftFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(195, 115).addBox(-0.8469F, -0.9636F, 0.0237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8028F, 3.5086F, -1.8307F, 0.5627F, 0.236F, 0.2079F));

		PartDefinition cube_r501 = leftFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(41, 184).addBox(-1.75F, -0.3441F, -1.6711F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2972F, 0.7606F, -1.2578F, 0.9361F, 0.7067F, 0.6758F));

		PartDefinition cube_r502 = leftFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(162, 34).addBox(-0.7F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 16).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0028F, 4.8666F, -5.0203F, -0.8072F, 0.3081F, -0.2512F));

		PartDefinition cube_r503 = leftFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(196, 194).addBox(-0.7F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0028F, 5.2023F, -5.4867F, -0.339F, 1.0215F, -0.2922F));

		PartDefinition cube_r504 = leftFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(161, 118).addBox(-1.65F, -0.4F, 1.7F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1076F, 3.9081F, -5.3526F, 0.6107F, 0.2374F, -0.0436F));

		PartDefinition cube_r505 = leftFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(180, 80).addBox(-0.65F, -0.4F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7727F, 2.7456F, -3.7601F, 0.6187F, 0.2801F, -0.0124F));

		PartDefinition cube_r506 = leftFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(195, 94).addBox(0.0F, -0.075F, -0.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1028F, -1.2319F, 1.8423F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r507 = leftFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(196, 38).addBox(0.5F, -1.25F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6028F, 0.2181F, 2.7923F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r508 = leftFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(193, 0).addBox(0.8F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6028F, 1.4681F, 2.7423F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r509 = leftFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(195, 118).addBox(0.0F, -0.2F, -0.9381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1028F, -1.2319F, 1.8423F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r510 = leftFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(92, 197).addBox(-1.0F, -0.6451F, -2.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6028F, 3.4681F, -1.8577F, 0.2967F, 0.1396F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(168, 187).mirror().addBox(0.1028F, -0.2319F, 0.8423F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offset(-1.6028F, -1.0518F, -2.7607F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(135, 190).mirror().addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3299F, -0.3928F, 0.5166F, 0.415F, 0.4537F, 0.2317F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(135, 126).mirror().addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6465F, -0.2055F, -0.0467F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(190, 10).mirror().addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2972F, 0.8369F, -1.1006F, 0.6513F, 0.0556F, 0.0423F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(196, 168).mirror().addBox(-0.45F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6562F, 2.2971F, -0.7905F, 0.6393F, -0.1662F, -0.1544F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(197, 111).mirror().addBox(-0.5F, -0.3982F, -1.335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1414F, 3.7924F, -2.8085F, 0.3054F, -0.1745F, 0.0F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(97, 197).mirror().addBox(-0.5F, -0.4437F, -0.7469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1414F, 3.7924F, -2.8085F, 0.4189F, -0.1745F, 0.0F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(87, 197).mirror().addBox(0.0F, -0.8894F, -2.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6028F, 3.4681F, -1.8577F, 0.4189F, -0.1396F, 0.0F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(175, 190).mirror().addBox(-0.5F, -0.4479F, -0.1604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1414F, 3.7924F, -2.8085F, 0.4887F, -0.1745F, 0.0F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(79, 190).mirror().addBox(0.0F, -0.9675F, -1.0107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6028F, 3.4681F, -1.8577F, 0.4887F, -0.1396F, 0.0F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(182, 16).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2305F, 2.7654F, -2.7309F, 0.5685F, -0.1547F, -0.009F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(190, 111).mirror().addBox(-0.45F, -0.5F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9127F, 2.194F, -1.9225F, 0.5972F, -0.1712F, -0.1625F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(195, 115).mirror().addBox(-0.1531F, -0.9636F, 0.0237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8028F, 3.5086F, -1.8307F, 0.5627F, -0.236F, -0.2079F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(41, 184).mirror().addBox(-0.25F, -0.3441F, -1.6711F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2972F, 0.7606F, -1.2578F, 0.9361F, -0.7067F, -0.6758F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(162, 34).mirror().addBox(-0.3F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 16).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0028F, 4.8666F, -5.0203F, -0.8072F, -0.3081F, 0.2512F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(196, 194).mirror().addBox(-0.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0028F, 5.2023F, -5.4867F, -0.339F, -1.0215F, 0.2922F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(161, 118).mirror().addBox(-0.35F, -0.4F, 1.7F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.1076F, 3.9081F, -5.3526F, 0.6107F, -0.2374F, 0.0436F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(180, 80).mirror().addBox(-0.35F, -0.4F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7727F, 2.7456F, -3.7601F, 0.6187F, -0.2801F, 0.0124F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(195, 94).mirror().addBox(-1.0F, -0.075F, -0.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1028F, -1.2319F, 1.8423F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(196, 38).mirror().addBox(-1.5F, -1.25F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.6028F, 0.2181F, 2.7923F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(193, 0).mirror().addBox(-1.8F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6028F, 1.4681F, 2.7423F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(195, 118).mirror().addBox(-1.0F, -0.2F, -0.9381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1028F, -1.2319F, 1.8423F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(92, 197).mirror().addBox(0.0F, -0.6451F, -2.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6028F, 3.4681F, -1.8577F, 0.2967F, -0.1396F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r533 = eye.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(195, 108).addBox(-0.5F, -0.1558F, -0.8627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.995F, -0.0762F, -0.1476F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r534 = eye.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(196, 45).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.995F, 4.0063F, -3.4729F, 2.0923F, 0.1517F, 0.0866F));

		PartDefinition cube_r535 = eye.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(41, 193).addBox(-0.5F, -0.1727F, -0.8558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.995F, 0.6238F, -0.2476F, 2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r536 = eye.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(196, 84).addBox(-0.5F, -0.15F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.945F, -2.0864F, 2.0361F, -0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r537 = eye.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(196, 145).addBox(-0.5F, -1.1F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F))
				.texOffs(196, 81).addBox(-0.5F, -0.875F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.945F, -0.6945F, 1.9132F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r538 = eye.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(196, 142).addBox(-0.5F, -0.675F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.945F, -1.6058F, 2.3F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r539 = eye.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(196, 139).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(196, 87).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F))
				.texOffs(196, 78).addBox(-0.5F, -0.2F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1495F)), PartPose.offsetAndRotation(1.945F, -0.8069F, 2.1913F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r540 = eye.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(108, 195).addBox(-0.685F, -0.186F, -0.9212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(2.18F, -0.6057F, 0.3964F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r541 = eye.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(103, 195).addBox(-0.685F, -0.1864F, -0.8295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.18F, -0.7057F, 0.9964F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r542 = eye.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(195, 97).addBox(-0.685F, -0.8264F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(2.18F, -0.3057F, 1.4964F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r543 = eye.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(11, 195).addBox(-0.685F, 0.094F, 0.4658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 197).addBox(-0.525F, -0.206F, -0.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(66, 197).addBox(-0.7F, -0.206F, -0.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.18F, -0.0057F, 0.1964F, 0.3927F, 0.0F, 0.0F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r544 = eye2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(195, 108).mirror().addBox(-0.5F, -0.1558F, -0.8627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.995F, -0.0762F, -0.1476F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r545 = eye2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(196, 45).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.995F, 4.0063F, -3.4729F, 2.0923F, -0.1517F, -0.0866F));

		PartDefinition cube_r546 = eye2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(41, 193).mirror().addBox(-0.5F, -0.1727F, -0.8558F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.995F, 0.6238F, -0.2476F, 2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r547 = eye2.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(196, 84).mirror().addBox(-0.5F, -0.15F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.945F, -2.0864F, 2.0361F, -0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r548 = eye2.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(196, 145).mirror().addBox(-0.5F, -1.1F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false)
				.texOffs(196, 81).mirror().addBox(-0.5F, -0.875F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.945F, -0.6945F, 1.9132F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r549 = eye2.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(196, 142).mirror().addBox(-0.5F, -0.675F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.945F, -1.6058F, 2.3F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r550 = eye2.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(196, 139).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(196, 87).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false)
				.texOffs(196, 78).mirror().addBox(-0.5F, -0.2F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1495F)).mirror(false), PartPose.offsetAndRotation(-1.945F, -0.8069F, 2.1913F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r551 = eye2.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(108, 195).mirror().addBox(-0.315F, -0.186F, -0.9212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.18F, -0.6057F, 0.3964F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r552 = eye2.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(103, 195).mirror().addBox(-0.315F, -0.1864F, -0.8295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.18F, -0.7057F, 0.9964F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r553 = eye2.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(195, 97).mirror().addBox(-0.315F, -0.8264F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-2.18F, -0.3057F, 1.4964F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r554 = eye2.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(11, 195).mirror().addBox(-0.315F, 0.094F, 0.4658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(39, 197).mirror().addBox(-0.475F, -0.206F, -0.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(66, 197).mirror().addBox(-0.3F, -0.206F, -0.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.18F, -0.0057F, 0.1964F, 0.3927F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(194, 191).addBox(0.65F, -0.8505F, -1.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(194, 191).mirror().addBox(-1.65F, -0.8505F, -1.7818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2209F, 0.0894F, 0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(183, 121).addBox(-1.0F, -1.9907F, -0.0158F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.464F, -3.1963F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(189, 86).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 1.6403F, -3.7528F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(171, 136).addBox(-0.5F, -1.0697F, 0.0008F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.14F, -6.9652F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(189, 74).mirror().addBox(-0.3F, -0.2762F, -1.5862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.35F, -0.4997F, -2.0768F, 0.0524F, -0.2182F, 0.0F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(194, 177).mirror().addBox(-0.3308F, -0.3772F, -1.9095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(189, 60).mirror().addBox(-0.4308F, -0.2772F, -1.9095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 0.5061F, -0.1484F, 0.0F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(189, 82).mirror().addBox(-0.3308F, -0.1409F, -3.4199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(189, 56).mirror().addBox(-0.4308F, -0.0409F, -3.4199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 0.3665F, -0.1484F, 0.0F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(189, 78).mirror().addBox(-0.4308F, 0.4563F, -2.2568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(180, 148).mirror().addBox(-0.4308F, 0.9563F, -3.2568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 0.1745F, -0.1484F, 0.0F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(194, 131).mirror().addBox(-0.4308F, -4.821F, -2.443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 1.5708F, -0.1484F, 0.0F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(197, 151).mirror().addBox(-0.4308F, -3.6527F, -4.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(197, 127).mirror().addBox(-0.4308F, -3.0527F, -4.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 1.1257F, -0.1484F, 0.0F));

		PartDefinition cube_r564 = jaw.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(175, 194).mirror().addBox(-0.4308F, 0.1234F, -4.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(194, 174).mirror().addBox(-0.4308F, -0.1766F, -4.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 0.384F, -0.1484F, 0.0F));

		PartDefinition cube_r565 = jaw.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(194, 185).mirror().addBox(-0.3308F, 0.1471F, -3.9171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(194, 171).mirror().addBox(-0.4308F, 0.2471F, -3.9171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 0.2705F, -0.1484F, 0.0F));

		PartDefinition cube_r566 = jaw.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(173, 85).mirror().addBox(-0.4308F, 1.0619F, -3.7936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -0.4997F, -3.2768F, 0.1396F, -0.1484F, 0.0F));

		PartDefinition cube_r567 = jaw.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(187, 171).mirror().addBox(-0.3F, -0.234F, -1.9439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.35F, -0.4997F, -2.0768F, 0.1571F, -0.2182F, 0.0F));

		PartDefinition cube_r568 = jaw.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(196, 48).mirror().addBox(-0.3F, -1.5504F, -2.7265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(196, 48).addBox(2.0F, -1.5504F, -2.7265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.35F, 0.4003F, 0.5232F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r569 = jaw.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(191, 14).mirror().addBox(-0.3F, -1.1331F, -2.7658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(191, 14).addBox(2.0F, -1.1331F, -2.7658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.35F, 0.4003F, 0.5232F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r570 = jaw.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(191, 194).mirror().addBox(-0.3F, -0.5163F, -2.0081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(191, 194).addBox(2.0F, -0.5163F, -2.0081F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.35F, 0.4003F, 0.5232F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r571 = jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(194, 188).mirror().addBox(-0.3F, -0.28F, -1.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(194, 188).addBox(2.0F, -0.28F, -1.4462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.35F, 0.4003F, 0.5232F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r572 = jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(147, 181).mirror().addBox(-0.3F, -0.8F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(147, 181).addBox(2.0F, -0.8F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.35F, 0.4003F, 0.5232F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(189, 74).addBox(-0.7F, -0.2762F, -1.5862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.35F, -0.4997F, -2.0768F, 0.0524F, 0.2182F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(194, 177).addBox(-0.6692F, -0.3772F, -1.9095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(189, 60).addBox(-0.5692F, -0.2772F, -1.9095F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 0.5061F, 0.1484F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(189, 82).addBox(-0.6692F, -0.1409F, -3.4199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F))
				.texOffs(189, 56).addBox(-0.5692F, -0.0409F, -3.4199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 0.3665F, 0.1484F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(189, 78).addBox(-0.5692F, 0.4563F, -2.2568F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F))
				.texOffs(180, 148).addBox(-0.5692F, 0.9563F, -3.2568F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 0.1745F, 0.1484F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(194, 131).addBox(-0.5692F, -4.821F, -2.443F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 1.5708F, 0.1484F, 0.0F));

		PartDefinition cube_r578 = jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(197, 151).addBox(-0.5692F, -3.6527F, -4.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(197, 127).addBox(-0.5692F, -3.0527F, -4.2699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 1.1257F, 0.1484F, 0.0F));

		PartDefinition cube_r579 = jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(175, 194).addBox(-0.5692F, 0.1234F, -4.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(194, 174).addBox(-0.5692F, -0.1766F, -4.5438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 0.384F, 0.1484F, 0.0F));

		PartDefinition cube_r580 = jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(194, 185).addBox(-0.6692F, 0.1471F, -3.9171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(194, 171).addBox(-0.5692F, 0.2471F, -3.9171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 0.2705F, 0.1484F, 0.0F));

		PartDefinition cube_r581 = jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(173, 85).addBox(-0.5692F, 1.0619F, -3.7936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.95F, -0.4997F, -3.2768F, 0.1396F, 0.1484F, 0.0F));

		PartDefinition cube_r582 = jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(187, 171).addBox(-0.7F, -0.234F, -1.9439F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.35F, -0.4997F, -2.0768F, 0.1571F, 0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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