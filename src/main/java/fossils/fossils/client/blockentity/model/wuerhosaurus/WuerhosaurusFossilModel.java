package fossils.fossils.client.blockentity.model.wuerhosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

@SuppressWarnings("unused")
public class WuerhosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart plate11;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart Plate4;
	private final ModelPart plate13;
	private final ModelPart tail2;
	private final ModelPart plate14;
	private final ModelPart tail3;
	private final ModelPart plate15;
	private final ModelPart tail4;
	private final ModelPart plate19;
	private final ModelPart tail5;
	private final ModelPart plate20;
	private final ModelPart plate12;
	private final ModelPart plate21;
	private final ModelPart tail6;
	private final ModelPart thagomizer4;
	private final ModelPart thagomizer3;
	private final ModelPart thagomizer2;
	private final ModelPart thagomizer5;
	private final ModelPart body2;
	private final ModelPart plate7;
	private final ModelPart plate8;
	private final ModelPart Plate3;
	private final ModelPart upperbody;
	private final ModelPart plate5;
	private final ModelPart plate6;
	private final ModelPart neck;
	private final ModelPart plate9;
	private final ModelPart neck4;
	private final ModelPart plate22;
	private final ModelPart neck2;
	private final ModelPart plate23;
	private final ModelPart neck5;
	private final ModelPart plate24;
	private final ModelPart plate16;
	private final ModelPart neck3;
	private final ModelPart plate17;
	private final ModelPart plate25;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart jaw;
	private final ModelPart frontrightleg5;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontleftleg5;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;

	public WuerhosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.plate11 = this.body.getChild("plate11");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.body.getChild("tail");
		this.Plate4 = this.tail.getChild("Plate4");
		this.plate13 = this.tail.getChild("plate13");
		this.tail2 = this.tail.getChild("tail2");
		this.plate14 = this.tail2.getChild("plate14");
		this.tail3 = this.tail2.getChild("tail3");
		this.plate15 = this.tail3.getChild("plate15");
		this.tail4 = this.tail3.getChild("tail4");
		this.plate19 = this.tail4.getChild("plate19");
		this.tail5 = this.tail4.getChild("tail5");
		this.plate20 = this.tail5.getChild("plate20");
		this.plate12 = this.tail5.getChild("plate12");
		this.plate21 = this.tail5.getChild("plate21");
		this.tail6 = this.tail5.getChild("tail6");
		this.thagomizer4 = this.tail6.getChild("thagomizer4");
		this.thagomizer3 = this.tail6.getChild("thagomizer3");
		this.thagomizer2 = this.tail6.getChild("thagomizer2");
		this.thagomizer5 = this.tail6.getChild("thagomizer5");
		this.body2 = this.body.getChild("body2");
		this.plate7 = this.body2.getChild("plate7");
		this.plate8 = this.body2.getChild("plate8");
		this.Plate3 = this.body2.getChild("Plate3");
		this.upperbody = this.body2.getChild("upperbody");
		this.plate5 = this.upperbody.getChild("plate5");
		this.plate6 = this.upperbody.getChild("plate6");
		this.neck = this.upperbody.getChild("neck");
		this.plate9 = this.neck.getChild("plate9");
		this.neck4 = this.neck.getChild("neck4");
		this.plate22 = this.neck4.getChild("plate22");
		this.neck2 = this.neck4.getChild("neck2");
		this.plate23 = this.neck2.getChild("plate23");
		this.neck5 = this.neck2.getChild("neck5");
		this.plate24 = this.neck5.getChild("plate24");
		this.plate16 = this.neck5.getChild("plate16");
		this.neck3 = this.neck5.getChild("neck3");
		this.plate17 = this.neck3.getChild("plate17");
		this.plate25 = this.neck3.getChild("plate25");
		this.head = this.neck3.getChild("head");
		this.eye = this.head.getChild("eye");
		this.jaw = this.head.getChild("jaw");
		this.frontrightleg5 = this.upperbody.getChild("frontrightleg5");
		this.frontleftleg2 = this.frontrightleg5.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.upperbody.getChild("frontrightleg2");
		this.frontleftleg5 = this.frontrightleg2.getChild("frontleftleg5");
		this.frontrightleg3 = this.frontleftleg5.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.5118F, 6.8041F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, -2.5F, -3.5F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8878F, 0.9398F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 56).mirror().addBox(-2.0F, 0.3486F, 0.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
		.texOffs(38, 56).addBox(1.0F, 0.3486F, 0.0152F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, -3.3139F, 5.631F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(0.002F, 0.9742F, -1.6285F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.8F, -6.4026F, 0.1191F, -0.1586F, 0.0736F, 0.4483F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(110, 133).mirror().addBox(-2.881F, -4.9534F, -0.116F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.4974F, 4.9191F, 0.5691F, 0.0406F, -0.4594F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 70).mirror().addBox(-0.6014F, -2.0138F, -1.9918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5185F, -1.3271F, 3.2774F, 0.3235F, 0.0348F, -0.0823F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(132, 92).mirror().addBox(-0.5F, -1.8371F, -1.1171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.5185F, 0.3729F, 2.1774F, -0.1303F, 0.0348F, -0.0823F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-0.5714F, -0.7071F, -2.6431F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false)
		.texOffs(117, 68).mirror().addBox(-0.5714F, -0.2071F, -2.6431F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9443F, 4.5564F, 2.437F, -0.8261F, 0.3149F, -0.2883F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(1.8341F, -0.6417F, -3.9953F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9443F, 8.7564F, 6.537F, -0.8785F, 0.3149F, -0.2883F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(131, 79).mirror().addBox(-0.8837F, 0.0184F, 0.0196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-6.0425F, -3.4572F, 7.7261F, -2.8337F, -0.5913F, 2.5082F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(116, 51).mirror().addBox(-0.6905F, 0.3455F, -0.3371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0425F, -3.4572F, 9.0261F, -2.8844F, 0.1492F, 2.7227F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(117, 62).mirror().addBox(-1.2F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.2425F, -3.4572F, 7.0261F, -2.8544F, 0.4773F, 2.8185F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(123, 41).mirror().addBox(-1.8404F, 0.4057F, -3.0148F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.3978F, -3.583F, 6.5261F, -2.6037F, -1.0575F, 2.2044F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 77).mirror().addBox(0.1223F, -0.3338F, -3.8528F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-8.1978F, -3.583F, 2.2261F, -2.8282F, -0.6162F, 2.4985F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(129, 46).mirror().addBox(1.0061F, -0.3298F, -1.5554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -5.5677F, -1.6801F, -0.2561F, 0.7192F, -0.5724F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(129, 11).mirror().addBox(0.7533F, -0.3298F, -4.7821F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -5.5677F, -1.6801F, -0.2278F, 0.5667F, -0.5254F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.4079F, -0.1966F, -2.8269F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.2F, -5.3026F, 0.1191F, -0.1688F, -0.0449F, -0.2402F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(96, 85).mirror().addBox(-1.1401F, -1.4117F, -10.6141F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -5.5677F, -1.6801F, 0.07F, 0.3635F, -0.3622F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(110, 121).mirror().addBox(0.8577F, -1.4542F, -8.2133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -5.5677F, -1.6801F, 0.058F, 0.6008F, -0.4286F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-1.2429F, -0.3298F, -4.0627F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
		.texOffs(89, 77).mirror().addBox(-1.2429F, -0.3298F, -5.0627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -5.5677F, -1.6801F, -0.2015F, 0.3108F, -0.464F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-5.2891F, 0.1011F, -2.0155F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -5.3026F, 0.1191F, -0.2613F, -0.0151F, -0.0682F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(124, 83).mirror().addBox(-0.3735F, 0.9349F, -0.7461F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.2F, -5.4771F, 4.1153F, -0.3085F, 0.1513F, -0.1209F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(116, 12).mirror().addBox(-0.8F, -0.5F, -2.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-7.3978F, -3.583F, 2.9261F, -1.2675F, -1.304F, 0.7991F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(142, 61).mirror().addBox(-0.7486F, 0.946F, 0.7956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.1F, -5.4858F, 4.3151F, -0.3085F, -0.5941F, -0.2814F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(-0.3381F, 2.1681F, -0.442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.9582F, -2.5188F, -0.5106F, -0.8874F, -0.002F, -0.1395F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(0.1304F, -1.3079F, -6.6278F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.0602F, 0.8176F, -2.8202F, -0.1961F, 0.3523F, -0.0844F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(51, 132).mirror().addBox(-0.5F, -0.1652F, -1.1328F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.5185F, 0.3729F, 2.1774F, 0.1664F, 0.0348F, -0.0823F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(35, 105).mirror().addBox(-2.8892F, -5.826F, 0.1379F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.4974F, 4.7191F, 0.7436F, 0.0406F, -0.4594F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(32, 132).mirror().addBox(-2.7728F, -1.7266F, -0.3959F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.2974F, 5.2191F, 0.5932F, 0.0921F, -0.6073F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(110, 40).mirror().addBox(1.8341F, -0.6417F, -3.9953F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9443F, 8.7564F, 6.537F, -0.7563F, 0.3149F, -0.2883F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(9, 128).mirror().addBox(-1.0054F, -1.9361F, -5.2079F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9443F, 4.5564F, 2.437F, -0.5528F, 0.1983F, -0.189F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 68).addBox(-3.002F, 0.9742F, -1.6285F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.8F, -6.4026F, 0.1191F, -0.1586F, -0.0736F, -0.4483F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 30).addBox(-2.5921F, -0.1966F, -2.8269F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.2F, -5.3026F, 0.1191F, -0.1688F, 0.0449F, 0.2402F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 85).addBox(0.1401F, -1.4117F, -10.6141F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.9F, -5.5677F, -1.6801F, 0.07F, -0.3635F, 0.3622F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 121).addBox(-1.8577F, -1.4542F, -8.2133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.9F, -5.5677F, -1.6801F, 0.058F, -0.6008F, 0.4286F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 92).addBox(-0.7571F, -0.3298F, -4.0627F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F))
		.texOffs(89, 77).addBox(0.2429F, -0.3298F, -5.0627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.9F, -5.5677F, -1.6801F, -0.2015F, -0.3108F, 0.464F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(129, 46).addBox(-2.0061F, -0.3298F, -1.5554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.9F, -5.5677F, -1.6801F, -0.2561F, -0.7192F, 0.5724F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(129, 11).addBox(-1.7533F, -0.3298F, -4.7821F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.9F, -5.5677F, -1.6801F, -0.2278F, -0.5667F, 0.5254F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 85).addBox(4.2891F, 0.1011F, -2.0155F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, -5.3026F, 0.1191F, -0.2613F, 0.0151F, 0.0682F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(124, 83).addBox(-1.6265F, 0.9349F, -0.7461F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.2F, -5.4771F, 4.1153F, -0.3085F, -0.1513F, 0.1209F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(131, 79).addBox(-0.1163F, 0.0184F, 0.0196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(6.0425F, -3.4572F, 7.7261F, -2.8337F, 0.5913F, -2.5082F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(116, 51).addBox(-0.3095F, 0.3455F, -0.3371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0425F, -3.4572F, 9.0261F, -2.8844F, -0.1492F, -2.7227F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(117, 62).addBox(0.2F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.2425F, -3.4572F, 7.0261F, -2.8544F, -0.4773F, -2.8185F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(123, 41).addBox(-0.1596F, 0.4057F, -3.0148F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.3978F, -3.583F, 6.5261F, -2.6037F, 1.0575F, -2.2044F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(111, 77).addBox(-2.1223F, -0.3338F, -3.8528F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(8.1978F, -3.583F, 2.2261F, -2.8282F, 0.6162F, -2.4985F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(116, 12).addBox(-2.2F, -0.5F, -2.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(7.3978F, -3.583F, 2.9261F, -1.2675F, 1.304F, -0.7991F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(142, 61).addBox(-0.2514F, 0.946F, 0.7956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.1F, -5.4858F, 4.3151F, -0.3085F, 0.5941F, 0.2814F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(136, 0).addBox(-0.6619F, 2.1681F, -0.442F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.9582F, -2.5188F, -0.5106F, -0.8874F, 0.002F, 0.1395F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(82, 24).addBox(-1.1304F, -1.3079F, -6.6278F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.0602F, 0.8176F, -2.8202F, -0.1961F, -0.3523F, 0.0844F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 70).addBox(-0.3986F, -2.0138F, -1.9918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5185F, -1.3271F, 3.2774F, 0.3235F, -0.0348F, 0.0823F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(132, 92).addBox(-0.5F, -1.8371F, -1.1171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.5185F, 0.3729F, 2.1774F, -0.1303F, -0.0348F, 0.0823F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(51, 132).addBox(-0.5F, -0.1652F, -1.1328F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5185F, 0.3729F, 2.1774F, 0.1664F, -0.0348F, 0.0823F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(110, 133).addBox(1.881F, -4.9534F, -0.116F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 4.4974F, 4.9191F, 0.5691F, -0.0406F, 0.4594F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(35, 105).addBox(1.8892F, -5.826F, 0.1379F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2F, 4.4974F, 4.7191F, 0.7436F, -0.0406F, 0.4594F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 132).addBox(1.7728F, -1.7266F, -0.3959F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 4.2974F, 5.2191F, 0.5932F, -0.0921F, 0.6073F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 111).addBox(-2.8341F, -0.6417F, -3.9953F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.9443F, 8.7564F, 6.537F, -0.8785F, -0.3149F, 0.2883F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(110, 40).addBox(-2.8341F, -0.6417F, -3.9953F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9443F, 8.7564F, 6.537F, -0.7563F, -0.3149F, 0.2883F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 118).addBox(-0.4286F, -0.7071F, -2.6431F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
		.texOffs(117, 68).addBox(-0.4286F, -0.2071F, -2.6431F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.9443F, 4.5564F, 2.437F, -0.8261F, -0.3149F, 0.2883F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(9, 128).addBox(0.0054F, -1.9361F, -5.2079F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.9443F, 4.5564F, 2.437F, -0.5528F, -0.1983F, 0.189F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(142, 14).addBox(0.0F, -2.2923F, -2.2264F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6659F, 9.3052F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -1.4358F, -0.019F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -3.3139F, -3.369F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 134).addBox(0.0F, -5.6453F, -0.0234F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0139F, 5.731F, -0.1745F, 0.0F, 0.0F));

		PartDefinition plate11 = body.addOrReplaceChild("plate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0966F, -11.4285F, 8.0849F, -0.0305F, 0.001F, -0.0971F));

		PartDefinition cube_r62 = plate11.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -4.5182F, 0.3894F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -8.0944F, 2.0929F, -2.0813F, 0.0F, 0.0F));

		PartDefinition cube_r63 = plate11.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(36, 70).addBox(-0.5F, -9.7736F, 0.07F, 1.0F, 10.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.9944F, -6.4071F, -0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r64 = plate11.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(116, 110).addBox(-0.5F, -8.3086F, -0.2624F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0351F, 1.7376F, -0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r65 = plate11.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -3.9669F, -2.1584F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(70, 55).addBox(0.0F, 1.4059F, -1.5642F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.4191F, -0.0904F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r66 = backleftleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(41, 95).addBox(0.25F, 0.1F, -0.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 14.3059F, -1.4642F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r67 = backleftleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 95).addBox(0.25F, -3.0F, -0.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 1.4059F, -1.5642F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(88, 0).addBox(-0.5F, -0.1527F, -0.9304F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.1433F, 0.0595F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r68 = backleftleg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(131, 73).addBox(-0.6F, -4.15F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(46, 113).addBox(-0.6F, -1.85F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5F, 3.6973F, 1.1696F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r69 = backleftleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(127, 0).addBox(-1.0F, -2.7207F, -1.8621F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 3.7473F, 2.3696F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r70 = backleftleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(123, 110).addBox(-1.0F, -4.188F, -0.1607F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r71 = backleftleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(69, 91).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 7.8473F, 0.9696F, -0.1222F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0096F, 11.0466F, 2.3329F, -0.1298F, -0.0084F, -0.0044F));

		PartDefinition cube_r72 = backleftleg3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(52, 112).addBox(0.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9886F, -0.7615F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create().texOffs(48, 26).addBox(-2.0F, 0.0F, -5.25F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0114F, -1.5115F, -0.0873F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(71, 24).addBox(-2.0F, 1.4059F, -1.5642F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -2.4191F, -0.0904F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r73 = backrightleg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(96, 77).addBox(-3.25F, 0.1F, -0.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 14.3059F, -1.4642F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r74 = backrightleg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 95).addBox(-3.25F, -3.0F, -0.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 1.4059F, -1.5642F, -0.2269F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(89, 69).addBox(-1.5F, -0.1527F, -0.9304F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.1433F, 0.0595F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r75 = backrightleg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(131, 127).addBox(-0.4F, -4.15F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
		.texOffs(60, 118).addBox(-0.4F, -1.85F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.5F, 3.6973F, 1.1696F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r76 = backrightleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(108, 127).addBox(-1.0F, -2.7207F, -1.8621F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 3.7473F, 2.3696F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r77 = backrightleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 124).addBox(-1.0F, -4.188F, -0.1607F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r78 = backrightleg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(15, 98).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 7.8473F, 0.9696F, -0.1222F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0096F, 11.0466F, 2.3329F, -0.2607F, 0.0084F, 0.0044F));

		PartDefinition cube_r79 = backrightleg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(92, 112).addBox(-3.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9886F, -0.7615F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create().texOffs(48, 35).addBox(-3.0F, 0.0F, -5.25F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.0114F, -1.5115F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.163F, 7.4237F, 0.0337F, -0.1307F, 0.007F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(135, 22).addBox(0.0F, -5.4365F, -0.0259F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3028F, 7.9815F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(115, 135).addBox(0.0F, -5.5231F, -0.0245F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3028F, 6.0815F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 134).addBox(0.0F, -5.1989F, 0.0836F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5028F, 3.9815F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(135, 97).addBox(0.0F, -5.4469F, -0.0327F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5028F, 2.0815F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(66, 134).addBox(0.0F, -5.721F, 0.0494F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5028F, -0.0185F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(34, 139).addBox(0.0F, 1.1745F, 1.2406F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 28).addBox(0.0F, -0.0279F, -0.3575F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9404F, 6.1761F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(31, 139).addBox(0.0F, 0.2596F, -0.989F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.21F, 4.0627F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(135, 141).addBox(0.0F, 0.2596F, -0.989F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4972F, 1.8815F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(61, 13).mirror().addBox(-1.3F, 0.0F, 1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(71, 41).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.096F, 0.5723F, 4.5487F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition cube_r89 = tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(71, 11).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3699F, 0.4857F, 2.567F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r90 = tail.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(52, 13).mirror().addBox(-3.5F, 0.2711F, 0.0702F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0972F, -0.1185F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r91 = tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(61, 13).addBox(-0.7F, 0.0F, 1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 41).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.096F, 0.5723F, 4.5487F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(71, 11).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3699F, 0.4857F, 2.567F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition cube_r93 = tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 13).addBox(0.5F, 0.2711F, 0.0702F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0972F, -0.1185F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.7289F, 0.0702F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0972F, -0.1185F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Plate4 = tail.addOrReplaceChild("Plate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, -3.8392F, 4.9184F, -0.0602F, -0.0106F, -0.1742F));

		PartDefinition plate13 = tail.addOrReplaceChild("plate13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9496F, -6.8389F, 8.321F, -0.1003F, -0.001F, 0.0971F));

		PartDefinition cube_r95 = plate13.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(28, 95).addBox(-0.5F, -0.1023F, -4.5566F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3056F, 2.5929F, -2.0289F, 0.0F, 0.0F));

		PartDefinition cube_r96 = plate13.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(83, 81).addBox(-0.5F, -8.0768F, -0.0818F, 1.0F, 8.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6944F, -5.5071F, -0.7199F, 0.0F, 0.0F));

		PartDefinition cube_r97 = plate13.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(19, 56).addBox(-0.5F, -2.9669F, -1.1584F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.539F, 10.1153F, -0.1077F, -0.0879F, -0.0037F));

		PartDefinition cube_r98 = tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(25, 31).addBox(-0.5F, -0.933F, -0.2727F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1919F, 0.0825F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(13, 138).addBox(0.0F, -4.0593F, 0.0311F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0264F, 7.6479F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(10, 138).addBox(0.0F, -3.9939F, 0.098F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0264F, 5.7479F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(137, 65).addBox(0.0F, -4.5586F, -0.0908F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7264F, 3.7479F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(57, 137).addBox(0.0F, -4.8041F, -0.0141F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7264F, 1.6479F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(72, 134).addBox(0.0F, -5.2383F, -0.0445F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7264F, -0.1521F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(142, 82).addBox(0.0F, 7.7569F, 9.5332F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 142).addBox(0.0F, 6.6619F, 7.8596F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(139, 137).addBox(0.0F, 4.5669F, 6.186F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(110, 139).addBox(0.0F, 3.4719F, 4.5124F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(139, 109).addBox(0.0F, 2.3769F, 2.8388F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4014F, -3.9392F, 0.7418F, 0.0F, 0.0F));

		PartDefinition plate14 = tail2.addOrReplaceChild("plate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9012F, -6.9772F, 7.2106F, -0.1003F, 0.001F, -0.0971F));

		PartDefinition cube_r105 = plate14.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(65, 105).addBox(-0.5F, -0.3023F, -2.7566F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3056F, 2.5929F, -2.4566F, 0.0F, 0.0F));

		PartDefinition cube_r106 = plate14.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 103).addBox(-0.5F, -5.0476F, -0.0858F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -3.2944F, -2.4071F, -1.4006F, 0.0F, 0.0F));

		PartDefinition cube_r107 = plate14.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(24, 105).addBox(-0.5F, -4.0768F, -0.0818F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6944F, -5.5071F, -0.877F, 0.0F, 0.0F));

		PartDefinition cube_r108 = plate14.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(38, 58).addBox(-0.5F, -2.9669F, -1.1584F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6483F, 9.5885F, -0.0437F, 0.2182F, 0.0F));

		PartDefinition cube_r109 = tail3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(140, 103).addBox(0.0F, -2.842F, 0.0146F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7296F, 6.0088F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(60, 140).addBox(0.0F, -2.9678F, 0.0124F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7296F, 4.0088F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(25, 138).addBox(0.0F, -3.3805F, 0.0149F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6296F, 2.0088F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(138, 22).addBox(0.0F, -3.7932F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5296F, 0.0088F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(65, 44).addBox(-0.5F, -1.0878F, 0.1652F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5704F, -0.0912F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(144, 91).addBox(0.0F, 12.0417F, 14.5543F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(89, 144).addBox(0.0F, 10.9468F, 12.8806F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(86, 144).addBox(0.0F, 9.8519F, 11.2069F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0497F, -13.5277F, 0.7418F, 0.0F, 0.0F));

		PartDefinition plate15 = tail3.addOrReplaceChild("plate15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8046F, -5.4329F, 6.5769F, -0.1003F, -0.001F, 0.0971F));

		PartDefinition cube_r115 = plate15.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(123, 17).addBox(-0.5F, 0.5977F, -1.0566F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3056F, 2.5929F, -2.4566F, 0.0F, 0.0F));

		PartDefinition cube_r116 = plate15.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(101, 119).addBox(-0.5F, -3.9465F, -0.1177F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.0944F, -2.7071F, -1.3134F, 0.0F, 0.0F));

		PartDefinition cube_r117 = plate15.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(41, 131).addBox(-0.5F, -3.0768F, -0.0818F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.6944F, -5.5071F, -1.1039F, 0.0F, 0.0F));

		PartDefinition cube_r118 = plate15.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -2.9669F, -1.1584F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2742F, 8.1296F, -0.1671F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(43, 86).addBox(-0.5F, -1.2709F, -0.3162F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.6479F, 0.2589F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(122, 143).addBox(0.0F, -1.9173F, 0.041F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7981F, 3.9989F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r121 = tail4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 120).addBox(0.0F, -2.3722F, 0.035F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5981F, 1.8989F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(69, 142).addBox(0.0F, -2.4957F, -1.0653F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5981F, 0.9989F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(80, 144).addBox(0.0F, 15.2035F, 19.6525F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 144).addBox(0.0F, 14.17F, 17.9402F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 144).addBox(0.0F, 13.1365F, 16.228F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3239F, -21.6573F, 0.7418F, 0.0F, 0.0F));

		PartDefinition plate19 = tail4.addOrReplaceChild("plate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7959F, -5.1545F, 6.4871F, -0.1003F, 0.001F, -0.0971F));

		PartDefinition cube_r124 = plate19.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(123, 93).addBox(-0.5F, -0.0331F, -3.0735F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.1056F, -0.6071F, -2.1773F, 0.0F, 0.0F));

		PartDefinition cube_r125 = plate19.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(51, 126).addBox(-0.5F, -1.4465F, 0.3823F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -2.0944F, -2.7071F, -1.3134F, 0.0F, 0.0F));

		PartDefinition cube_r126 = plate19.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(131, 51).addBox(-0.5F, -2.9368F, 0.0038F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1056F, -5.5071F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r127 = plate19.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, -1.9669F, -1.1584F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(23, 44).addBox(-0.5F, -0.3513F, 0.0018F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5025F, 5.8263F, -0.0548F, 0.3891F, -0.0542F));

		PartDefinition cube_r128 = tail5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(145, 14).addBox(0.0F, 20.8291F, 26.3434F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 145).addBox(0.0F, 19.5707F, 24.7105F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 145).addBox(0.0F, 18.4038F, 23.0377F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(83, 144).addBox(0.0F, 16.237F, 21.3648F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8265F, -27.4836F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(86, 69).addBox(0.0F, -1.3054F, 3.9734F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 144).addBox(0.0F, -1.4054F, 1.9734F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 144).addBox(0.0F, -1.4054F, -0.0266F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2159F, 4.0111F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(138, 143).addBox(0.0F, -1.482F, 0.0946F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0841F, 1.9111F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(125, 143).addBox(0.0F, -1.6196F, -0.0816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3841F, 0.1111F, 0.0087F, 0.0F, 0.0F));

		PartDefinition plate20 = tail5.addOrReplaceChild("plate20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.739F, -4.1244F, 5.9342F, -0.1003F, -0.001F, 0.0971F));

		PartDefinition cube_r132 = plate20.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(130, 121).addBox(-0.5F, -0.0726F, -1.9865F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.1056F, -1.5071F, -2.0726F, 0.0F, 0.0F));

		PartDefinition cube_r133 = plate20.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(130, 32).addBox(-0.5F, -2.6368F, 0.0038F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1056F, -5.5071F, -1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r134 = plate20.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(65, 114).addBox(-0.5F, -1.9669F, -1.1584F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition plate12 = tail5.addOrReplaceChild("plate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6961F, -3.7262F, 9.9141F, -0.1003F, 0.001F, -0.0971F));

		PartDefinition cube_r135 = plate12.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(138, 4).addBox(-0.5F, 0.0246F, -0.1433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.0944F, -2.9071F, -0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r136 = plate12.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(134, 137).addBox(-0.5F, -1.9055F, 0.0678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.0056F, -4.5071F, -0.8596F, 0.0F, 0.0F));

		PartDefinition cube_r137 = plate12.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(9, 134).addBox(-0.5F, -0.9669F, -0.1584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition plate21 = tail5.addOrReplaceChild("plate21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5596F, -2.3216F, 9.5111F, -0.2137F, -0.001F, 0.0971F));

		PartDefinition cube_r138 = plate21.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(121, 100).addBox(-0.5F, -0.2693F, 0.5642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
		.texOffs(117, 74).addBox(-0.5F, -0.2693F, -0.0358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4388F, -0.6474F, -0.3534F, 0.0F, 0.0F));

		PartDefinition cube_r139 = plate21.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(107, 8).addBox(-0.5F, -0.9055F, 0.0678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.1388F, -1.2474F, -0.8596F, 0.0F, 0.0F));

		PartDefinition cube_r140 = plate21.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(134, 38).addBox(-0.5F, -0.9669F, -0.1584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9248F, -1.1367F, -0.0044F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(48, 15).addBox(-0.5F, -0.5111F, -0.0591F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1593F, 9.8982F, -0.3914F, -0.0807F, 0.0333F));

		PartDefinition thagomizer4 = tail6.addOrReplaceChild("thagomizer4", CubeListBuilder.create().texOffs(116, 47).addBox(0.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0563F, -0.4812F, 6.943F, 0.0938F, -0.3846F, -0.4922F));

		PartDefinition cube_r141 = thagomizer4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(88, 8).addBox(-0.0743F, -0.5F, -0.0076F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0F, 0.0F, -1.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r142 = thagomizer4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(86, 19).addBox(0.0F, -0.5F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer3 = tail6.addOrReplaceChild("thagomizer3", CubeListBuilder.create().texOffs(116, 47).mirror().addBox(-4.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0563F, -0.4812F, 6.943F, 0.0938F, 0.3846F, 0.4922F));

		PartDefinition cube_r143 = thagomizer3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(88, 8).mirror().addBox(-7.9257F, -0.5F, -0.0076F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -1.0F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r144 = thagomizer3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(86, 19).mirror().addBox(-8.0F, -0.5F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition thagomizer2 = tail6.addOrReplaceChild("thagomizer2", CubeListBuilder.create().texOffs(111, 89).addBox(0.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7F, -0.5681F, 2.8821F, -0.1297F, -0.0531F, -0.4668F));

		PartDefinition cube_r145 = thagomizer2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(84, 52).addBox(-0.0743F, -0.5F, -0.0076F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.0F, 0.0F, -1.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r146 = thagomizer2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(81, 66).addBox(0.0F, -0.5F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition thagomizer5 = tail6.addOrReplaceChild("thagomizer5", CubeListBuilder.create().texOffs(111, 89).mirror().addBox(-4.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.5681F, 2.8821F, -0.1297F, 0.0531F, 0.4668F));

		PartDefinition cube_r147 = thagomizer5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 52).mirror().addBox(-7.9257F, -0.5F, -0.0076F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -1.0F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r148 = thagomizer5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-10.0F, -0.5F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -4.0767F, -3.0647F, 0.0877F, -0.0869F, -0.0076F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -0.9F, -0.05F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1608F, -12.5096F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(105, 142).mirror().addBox(-3.4522F, 3.1544F, -0.849F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -1.7751F, -0.3612F, 0.2375F, 0.1155F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -1.7751F, -0.229F, 0.3666F, 0.5528F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(119, 143).mirror().addBox(-0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -1.7751F, 0.3032F, 0.284F, 1.9951F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(90, 137).mirror().addBox(-3.4522F, 3.1544F, -0.849F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -3.7751F, -0.2854F, 0.2484F, 0.324F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(138, 126).mirror().addBox(-1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -3.7751F, -0.153F, 0.345F, 0.7695F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(116, 143).mirror().addBox(-0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -3.7751F, 0.2917F, 0.2105F, 2.1825F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(102, 142).mirror().addBox(-6.8799F, 6.9375F, -0.849F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -5.7751F, -0.2541F, 0.1216F, 0.177F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(37, 137).mirror().addBox(-3.4522F, 3.1544F, -0.849F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -5.7751F, -0.1838F, 0.2139F, 0.5917F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(99, 138).mirror().addBox(-1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -5.7751F, -0.075F, 0.2712F, 1.0375F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(113, 143).mirror().addBox(-0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -5.7751F, 0.2311F, 0.1244F, 2.4167F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(87, 137).mirror().addBox(-6.8799F, 6.9375F, -0.849F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -7.7751F, -0.1677F, 0.1058F, 0.1868F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(137, 30).mirror().addBox(-3.4522F, 3.1544F, -0.849F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -7.7751F, -0.1104F, 0.1647F, 0.6055F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(138, 97).mirror().addBox(-1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -7.7751F, -0.0298F, 0.1958F, 1.048F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(143, 101).mirror().addBox(-0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -7.7751F, 0.1657F, 0.0663F, 2.4105F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(143, 71).mirror().addBox(-0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -9.7751F, 0.1267F, 0.0313F, 2.4086F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(22, 137).mirror().addBox(-3.4522F, 3.1544F, -0.849F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -9.7751F, -0.0669F, 0.1348F, 0.612F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(104, 133).mirror().addBox(-6.8799F, 6.9375F, -0.849F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -9.7751F, -0.116F, 0.0959F, 0.192F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(96, 138).mirror().addBox(-1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -9.7751F, -0.0033F, 0.1503F, 1.0526F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(60, 130).mirror().addBox(-6.9293F, 6.9093F, -0.2517F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -12.3751F, -0.0472F, 0.0824F, 0.1981F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(19, 137).mirror().addBox(-3.5088F, 3.1487F, -0.2517F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -12.3751F, -0.0096F, 0.0945F, 0.6185F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(138, 76).mirror().addBox(-1.8421F, 0.3593F, -0.249F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -12.3751F, 0.0314F, 0.0896F, 1.0567F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(143, 46).mirror().addBox(-0.0035F, -0.1123F, -0.2019F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1741F, -12.3751F, 0.0748F, -0.0154F, 2.4082F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(119, 143).addBox(0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -1.7751F, 0.3032F, -0.284F, -1.9951F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 139).addBox(1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -1.7751F, -0.229F, -0.3666F, -0.5528F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(105, 142).addBox(3.4522F, 3.1544F, -0.849F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -1.7751F, -0.3612F, -0.2375F, -0.1155F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(116, 143).addBox(0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -3.7751F, 0.2917F, -0.2105F, -2.1825F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(138, 126).addBox(1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -3.7751F, -0.153F, -0.345F, -0.7695F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(90, 137).addBox(3.4522F, 3.1544F, -0.849F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -3.7751F, -0.2854F, -0.2484F, -0.324F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(113, 143).addBox(0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -5.7751F, 0.2311F, -0.1244F, -2.4167F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(99, 138).addBox(1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -5.7751F, -0.075F, -0.2712F, -1.0375F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(37, 137).addBox(3.4522F, 3.1544F, -0.849F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -5.7751F, -0.1838F, -0.2139F, -0.5917F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(102, 142).addBox(6.8799F, 6.9375F, -0.849F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -5.7751F, -0.2541F, -0.1216F, -0.177F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(143, 101).addBox(0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -7.7751F, 0.1657F, -0.0663F, -2.4105F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(138, 97).addBox(1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -7.7751F, -0.0298F, -0.1958F, -1.048F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(137, 30).addBox(3.4522F, 3.1544F, -0.849F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -7.7751F, -0.1104F, -0.1647F, -0.6055F));

		PartDefinition cube_r185 = body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(87, 137).addBox(6.8799F, 6.9375F, -0.849F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -7.7751F, -0.1677F, -0.1058F, -0.1868F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(96, 138).addBox(1.7884F, 0.3405F, -0.8463F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -9.7751F, -0.0033F, -0.1503F, -1.0526F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(104, 133).addBox(6.8799F, 6.9375F, -0.849F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -9.7751F, -0.116F, -0.0959F, -0.192F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(22, 137).addBox(3.4522F, 3.1544F, -0.849F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -9.7751F, -0.0669F, -0.1348F, -0.612F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(143, 71).addBox(0.0128F, -0.1571F, -0.8002F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -9.7751F, 0.1267F, -0.0313F, -2.4086F));

		PartDefinition cube_r190 = body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(60, 130).addBox(6.9293F, 6.9093F, -0.2517F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -12.3751F, -0.0472F, -0.0824F, -0.1981F));

		PartDefinition cube_r191 = body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(19, 137).addBox(3.5088F, 3.1487F, -0.2517F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -12.3751F, -0.0096F, -0.0945F, -0.6185F));

		PartDefinition cube_r192 = body2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(138, 76).addBox(1.8421F, 0.3593F, -0.249F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -12.3751F, 0.0314F, -0.0896F, -1.0567F));

		PartDefinition cube_r193 = body2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(78, 134).addBox(0.0F, -4.4009F, -0.006F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7597F, -2.4055F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r194 = body2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(118, 135).addBox(0.0F, -4.689F, -0.5145F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8597F, -3.9055F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(131, 133).addBox(0.0F, -4.7671F, -0.1028F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0818F, -6.3018F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 134).addBox(0.0F, -5.0944F, -0.0579F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8382F, -8.394F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(84, 137).addBox(0.0F, -4.9166F, -0.0555F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9382F, -10.394F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r198 = body2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(81, 137).addBox(0.0F, -4.6998F, 0.1183F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0701F, -12.6931F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(143, 46).addBox(0.0035F, -0.1123F, -0.2019F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9414F, 0.1741F, -12.3751F, 0.0748F, 0.0154F, -2.4082F));

		PartDefinition plate7 = body2.addOrReplaceChild("plate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3978F, -8.2033F, -6.8494F, 0.0044F, 0.0447F, -0.097F));

		PartDefinition cube_r200 = plate7.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(99, 22).addBox(-0.5F, -8.7672F, 0.1048F, 1.0F, 9.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.0944F, -4.7071F, -0.781F, 0.0F, 0.0F));

		PartDefinition cube_r201 = plate7.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(58, 91).addBox(-0.5F, 0.0394F, -3.9116F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9649F, 4.6376F, -0.5367F, 0.0F, 0.0F));

		PartDefinition cube_r202 = plate7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(24, 114).addBox(-0.5F, -8.3086F, -0.2624F, 1.0F, 8.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.0351F, 1.7376F, -0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r203 = plate7.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -3.9669F, -0.1584F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition plate8 = body2.addOrReplaceChild("plate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6128F, -7.4108F, 1.0797F, -0.0654F, -0.001F, 0.0971F));

		PartDefinition cube_r204 = plate8.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(46, 44).addBox(-0.5F, -5.3182F, -0.3106F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -8.0944F, 2.0929F, -2.0813F, 0.0F, 0.0F));

		PartDefinition cube_r205 = plate8.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(57, 58).addBox(-0.5F, -10.7736F, 0.07F, 1.0F, 11.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.9944F, -6.4071F, -0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r206 = plate8.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(85, 111).addBox(-0.5F, -9.3086F, -0.2624F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0351F, 1.7376F, -0.432F, 0.0F, 0.0F));

		PartDefinition cube_r207 = plate8.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(25, 16).addBox(-0.5F, -3.9669F, -2.1584F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.0692F, -4.3964F, -0.0044F, 0.0F, 0.0F));

		PartDefinition Plate3 = body2.addOrReplaceChild("Plate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, -4.2452F, -2.9738F, 0.1902F, 0.0844F, -0.2481F));

		PartDefinition upperbody = body2.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2592F, -12.6204F, -0.0877F, -0.0435F, 0.0038F));

		PartDefinition cube_r208 = upperbody.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(104, 62).addBox(-0.5F, -0.8863F, -4.721F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 0.1786F, 0.0355F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r209 = upperbody.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.3669F, 0.2637F, -0.3549F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 17.2653F, -2.4585F, 0.8185F, -0.959F, -0.5276F));

		PartDefinition cube_r210 = upperbody.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.4826F, 0.0605F, -0.77F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 17.2653F, -2.4585F, 0.9278F, -1.0389F, -0.6989F));

		PartDefinition cube_r211 = upperbody.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(16, 137).mirror().addBox(-3.3311F, 3.1213F, -0.2719F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.9786F, -8.8645F, 0.4643F, -0.1998F, 0.3591F));

		PartDefinition cube_r212 = upperbody.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(138, 8).mirror().addBox(-1.6927F, 0.2593F, -0.2692F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.9786F, -8.8645F, 0.3439F, -0.374F, 0.7772F));

		PartDefinition cube_r213 = upperbody.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(142, 137).mirror().addBox(-0.0691F, -0.2793F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.9786F, -8.8645F, -0.3388F, -0.3994F, 2.2625F));

		PartDefinition cube_r214 = upperbody.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(107, 133).mirror().addBox(-6.7558F, 6.9565F, -0.2719F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.5786F, -7.2645F, 0.3295F, 0.007F, 0.0923F));

		PartDefinition cube_r215 = upperbody.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(127, 135).mirror().addBox(-3.3311F, 3.1213F, -0.2719F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.5786F, -7.2645F, 0.3055F, -0.1255F, 0.4906F));

		PartDefinition cube_r216 = upperbody.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(7, 138).mirror().addBox(-1.6927F, 0.2593F, -0.2692F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.5786F, -7.2645F, 0.226F, -0.2419F, 0.9187F));

		PartDefinition cube_r217 = upperbody.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(142, 108).mirror().addBox(-0.0691F, -0.2793F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.5786F, -7.2645F, -0.2149F, -0.2714F, 2.3273F));

		PartDefinition cube_r218 = upperbody.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(142, 87).mirror().addBox(-0.0409F, -0.3586F, -0.9414F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.1786F, -4.9645F, -0.1609F, -0.2254F, 2.3841F));

		PartDefinition cube_r219 = upperbody.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(31, 114).mirror().addBox(-1.5949F, 0.2696F, -0.9838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.1786F, -4.9645F, 0.1889F, -0.1825F, 0.9966F));

		PartDefinition cube_r220 = upperbody.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(124, 135).mirror().addBox(-3.2469F, 3.172F, -0.9865F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.1786F, -4.9645F, 0.2475F, -0.0865F, 0.5668F));

		PartDefinition cube_r221 = upperbody.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(48, 131).mirror().addBox(-6.6995F, 7.037F, -0.9865F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.1786F, -4.9645F, 0.2611F, 0.0203F, 0.1614F));

		PartDefinition cube_r222 = upperbody.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(11, 100).mirror().addBox(-6.8286F, 7.0575F, -0.3923F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2786F, -3.1645F, 0.1582F, 0.0397F, 0.2107F));

		PartDefinition cube_r223 = upperbody.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(138, 50).mirror().addBox(-1.6643F, 0.3805F, -0.3896F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2786F, -3.1645F, 0.1342F, -0.0929F, 1.0565F));

		PartDefinition cube_r224 = upperbody.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(121, 135).mirror().addBox(-3.3566F, 3.2432F, -0.3923F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2786F, -3.1645F, 0.1607F, -0.0278F, 0.6242F));

		PartDefinition cube_r225 = upperbody.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(143, 26).mirror().addBox(0.0549F, -0.2786F, -0.346F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2786F, -3.1645F, -0.0821F, -0.1549F, 2.4216F));

		PartDefinition cube_r226 = upperbody.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(143, 30).mirror().addBox(0.457F, 0.0222F, -0.358F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, -0.0294F, -0.1086F, 2.4147F));

		PartDefinition cube_r227 = upperbody.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(139, 14).mirror().addBox(-1.8712F, 0.8379F, -0.4058F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, 0.0999F, -0.0321F, 1.0587F));

		PartDefinition cube_r228 = upperbody.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(40, 137).mirror().addBox(-3.7374F, 3.5703F, -0.4085F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, 0.1041F, 0.0131F, 0.6246F));

		PartDefinition cube_r229 = upperbody.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(38, 126).mirror().addBox(-7.3096F, 7.2014F, -0.4085F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, 0.0898F, 0.0542F, 0.2075F));

		PartDefinition cube_r230 = upperbody.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(0.0616F, -3.1703F, -0.1732F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.2882F, 13.5495F, -11.9736F, -0.2094F, -0.4324F, 0.2893F));

		PartDefinition cube_r231 = upperbody.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(18, 131).mirror().addBox(1.0976F, -0.7857F, 0.8666F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2882F, 9.5495F, -11.9736F, -1.0297F, -0.4324F, 0.2893F));

		PartDefinition cube_r232 = upperbody.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(1.0976F, -0.6857F, -0.6334F, 1.0F, 3.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.2882F, 9.5495F, -11.9736F, -0.3664F, -0.4324F, 0.2893F));

		PartDefinition cube_r233 = upperbody.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(105, 112).mirror().addBox(0.4065F, -0.2922F, -3.467F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2882F, 7.8495F, -9.2736F, 0.1222F, -0.4324F, 0.2893F));

		PartDefinition cube_r234 = upperbody.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-0.2893F, -1.0213F, -0.2364F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.7437F, 5.2186F, -7.0253F, 1.2635F, -0.2309F, 0.5905F));

		PartDefinition cube_r235 = upperbody.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(86, 11).mirror().addBox(-2.5479F, -1.0335F, 1.8541F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 18.0653F, -9.4585F, -0.0515F, -0.1418F, 0.0681F));

		PartDefinition cube_r236 = upperbody.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(98, 55).mirror().addBox(-0.2507F, -0.1574F, -0.9876F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 17.5653F, -3.1585F, 1.3092F, -1.2351F, -0.9769F));

		PartDefinition cube_r237 = upperbody.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(84, 44).mirror().addBox(-0.3273F, -0.0028F, -1.1331F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 17.2653F, -2.4585F, 1.2354F, -1.0869F, -0.9312F));

		PartDefinition cube_r238 = upperbody.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(52, 104).mirror().addBox(-2.8317F, -1.4162F, 0.5289F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 15.2077F, -11.9178F, 1.0679F, -0.0132F, 0.6101F));

		PartDefinition cube_r239 = upperbody.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(76, 111).mirror().addBox(-0.5F, -3.0F, 0.8F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.2882F, 11.3495F, -9.2736F, 0.6109F, -0.4324F, 0.2893F));

		PartDefinition cube_r240 = upperbody.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(13, 112).mirror().addBox(-0.8598F, -1.6027F, -1.917F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7437F, 7.3186F, -7.0253F, 1.0996F, -0.4324F, 0.2893F));

		PartDefinition cube_r241 = upperbody.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.2893F, -0.9864F, -0.0251F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7437F, 5.2186F, -7.0253F, 0.8272F, -0.2309F, 0.5905F));

		PartDefinition cube_r242 = upperbody.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(86, 11).addBox(0.5479F, -1.0335F, 1.8541F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 18.0653F, -9.4585F, -0.0515F, 0.1418F, -0.0681F));

		PartDefinition cube_r243 = upperbody.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(98, 55).addBox(-0.7493F, -0.1574F, -0.9876F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 17.5653F, -3.1585F, 1.3092F, 1.2351F, 0.9769F));

		PartDefinition cube_r244 = upperbody.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(15, 76).addBox(-0.6331F, 0.2637F, -0.3549F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 17.2653F, -2.4585F, 0.8185F, 0.959F, 0.5276F));

		PartDefinition cube_r245 = upperbody.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(70, 72).addBox(-0.5174F, 0.0605F, -0.77F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 17.2653F, -2.4585F, 0.9278F, 1.0389F, 0.6989F));

		PartDefinition cube_r246 = upperbody.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(84, 44).addBox(-0.6727F, -0.0028F, -1.1331F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 17.2653F, -2.4585F, 1.2354F, 1.0869F, 0.9312F));

		PartDefinition cube_r247 = upperbody.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(52, 104).addBox(-2.1683F, -1.4162F, 0.5289F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 15.2077F, -11.9178F, 1.0679F, 0.0132F, -0.6101F));

		PartDefinition cube_r248 = upperbody.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(69, 13).addBox(-1.0616F, -3.1703F, -0.1732F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.2882F, 13.5495F, -11.9736F, -0.2094F, 0.4324F, -0.2893F));

		PartDefinition cube_r249 = upperbody.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(18, 131).addBox(-2.0976F, -0.7857F, 0.8666F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2882F, 9.5495F, -11.9736F, -1.0297F, 0.4324F, -0.2893F));

		PartDefinition cube_r250 = upperbody.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 54).addBox(-2.0976F, -0.6857F, -0.6334F, 1.0F, 3.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.2882F, 9.5495F, -11.9736F, -0.3664F, 0.4324F, -0.2893F));

		PartDefinition cube_r251 = upperbody.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(105, 112).addBox(-1.4065F, -0.2922F, -3.467F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2882F, 7.8495F, -9.2736F, 0.1222F, 0.4324F, -0.2893F));

		PartDefinition cube_r252 = upperbody.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 111).addBox(-0.5F, -3.0F, 0.8F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(7.2882F, 11.3495F, -9.2736F, 0.6109F, 0.4324F, -0.2893F));

		PartDefinition cube_r253 = upperbody.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(13, 112).addBox(-0.1402F, -1.6027F, -1.917F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7437F, 7.3186F, -7.0253F, 1.0996F, 0.4324F, -0.2893F));

		PartDefinition cube_r254 = upperbody.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(49, 75).addBox(-0.7107F, -1.0213F, -0.2364F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.7437F, 5.2186F, -7.0253F, 1.2635F, 0.2309F, -0.5905F));

		PartDefinition cube_r255 = upperbody.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(81, 55).addBox(-0.7107F, -0.9864F, -0.0251F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7437F, 5.2186F, -7.0253F, 0.8272F, 0.2309F, -0.5905F));

		PartDefinition cube_r256 = upperbody.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(66, 81).addBox(-0.5F, -0.7768F, -6.7945F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.5166F, -4.3828F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r257 = upperbody.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(93, 137).addBox(0.0F, -5.1239F, 0.019F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0786F, -1.7645F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r258 = upperbody.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(54, 137).addBox(0.0F, -4.5036F, 0.0074F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4786F, -3.7645F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r259 = upperbody.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(51, 137).addBox(0.0F, -4.1347F, -0.6783F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5166F, -5.6828F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r260 = upperbody.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(137, 119).addBox(0.0F, -4.375F, -0.1623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9166F, -7.7828F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r261 = upperbody.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(142, 137).addBox(0.0691F, -0.2793F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 4.9786F, -8.8645F, -0.3388F, 0.3994F, -2.2625F));

		PartDefinition cube_r262 = upperbody.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(138, 8).addBox(1.6927F, 0.2593F, -0.2692F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 4.9786F, -8.8645F, 0.3439F, 0.374F, -0.7772F));

		PartDefinition cube_r263 = upperbody.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(16, 137).addBox(3.3311F, 3.1213F, -0.2719F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 4.9786F, -8.8645F, 0.4643F, 0.1998F, -0.3591F));

		PartDefinition cube_r264 = upperbody.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(142, 108).addBox(0.0691F, -0.2793F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.5786F, -7.2645F, -0.2149F, 0.2714F, -2.3273F));

		PartDefinition cube_r265 = upperbody.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(7, 138).addBox(1.6927F, 0.2593F, -0.2692F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.5786F, -7.2645F, 0.226F, 0.2419F, -0.9187F));

		PartDefinition cube_r266 = upperbody.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(127, 135).addBox(3.3311F, 3.1213F, -0.2719F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.5786F, -7.2645F, 0.3055F, 0.1255F, -0.4906F));

		PartDefinition cube_r267 = upperbody.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(107, 133).addBox(6.7558F, 6.9565F, -0.2719F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 3.5786F, -7.2645F, 0.3295F, -0.007F, -0.0923F));

		PartDefinition cube_r268 = upperbody.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(48, 131).addBox(6.6995F, 7.037F, -0.9865F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1786F, -4.9645F, 0.2611F, -0.0203F, -0.1614F));

		PartDefinition cube_r269 = upperbody.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(124, 135).addBox(3.2469F, 3.172F, -0.9865F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1786F, -4.9645F, 0.2475F, 0.0865F, -0.5668F));

		PartDefinition cube_r270 = upperbody.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(31, 114).addBox(1.5949F, 0.2696F, -0.9838F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1786F, -4.9645F, 0.1889F, 0.1825F, -0.9966F));

		PartDefinition cube_r271 = upperbody.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(142, 87).addBox(0.0409F, -0.3586F, -0.9414F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.1786F, -4.9645F, -0.1609F, 0.2254F, -2.3841F));

		PartDefinition cube_r272 = upperbody.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(143, 26).addBox(-0.0549F, -0.2786F, -0.346F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2786F, -3.1645F, -0.0821F, 0.1549F, -2.4216F));

		PartDefinition cube_r273 = upperbody.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(121, 135).addBox(3.3566F, 3.2432F, -0.3923F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2786F, -3.1645F, 0.1607F, 0.0278F, -0.6242F));

		PartDefinition cube_r274 = upperbody.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(138, 50).addBox(1.6643F, 0.3805F, -0.3896F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2786F, -3.1645F, 0.1342F, 0.0929F, -1.0565F));

		PartDefinition cube_r275 = upperbody.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(11, 100).addBox(6.8286F, 7.0575F, -0.3923F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2786F, -3.1645F, 0.1582F, -0.0397F, -0.2107F));

		PartDefinition cube_r276 = upperbody.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(143, 30).addBox(-0.457F, 0.0222F, -0.358F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, -0.0294F, 0.1086F, -2.4147F));

		PartDefinition cube_r277 = upperbody.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(139, 14).addBox(1.8712F, 0.8379F, -0.4058F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, 0.0999F, 0.0321F, -1.0587F));

		PartDefinition cube_r278 = upperbody.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(40, 137).addBox(3.7374F, 3.5703F, -0.4085F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, 0.1041F, -0.0131F, -0.6246F));

		PartDefinition cube_r279 = upperbody.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(38, 126).addBox(7.3096F, 7.2014F, -0.4085F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6786F, -1.2645F, 0.0898F, -0.0542F, -0.2075F));

		PartDefinition cube_r280 = upperbody.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(43, 137).addBox(0.0F, -4.0938F, -0.2243F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0166F, -9.3828F, 0.1047F, 0.0F, 0.0F));

		PartDefinition plate5 = upperbody.addOrReplaceChild("plate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0924F, -3.1723F, -8.8711F, 0.6066F, 0.0883F, -0.0968F));

		PartDefinition cube_r281 = plate5.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(123, 32).addBox(-0.5F, -5.9894F, -0.0244F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1358F, -0.534F, -3.412F, -0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r282 = plate5.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(119, 24).addBox(-0.5F, -3.7087F, -2.9689F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1358F, 1.0955F, 3.0327F, -0.4145F, 0.0F, 0.0F));

		PartDefinition cube_r283 = plate5.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(117, 128).addBox(-0.5F, -3.9585F, -0.3695F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1358F, 1.0955F, 0.7327F, 0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r284 = plate5.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(113, 55).addBox(-0.5F, -1.9669F, 0.8416F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1358F, 1.4296F, -3.1012F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r285 = plate5.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(35, 113).addBox(-0.5F, -1.9669F, -0.1584F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1358F, 1.4296F, -3.1012F, 0.0829F, 0.0F, 0.0F));

		PartDefinition plate6 = upperbody.addOrReplaceChild("plate6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.711F, -5.0617F, -2.5218F, 0.3099F, -0.0883F, 0.0968F));

		PartDefinition cube_r286 = plate6.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, -3.1F, -1.4F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1358F, -3.3123F, 1.9306F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r287 = plate6.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(101, 35).addBox(-0.5F, -7.9894F, -0.0244F, 1.0F, 8.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1358F, -0.534F, -3.412F, -0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r288 = plate6.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(83, 123).addBox(-0.5F, -6.1086F, -1.1624F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1358F, 1.3955F, 3.0327F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r289 = plate6.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(124, 128).addBox(-0.5F, -3.7585F, 0.2305F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1358F, 1.0955F, 0.7327F, 0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r290 = plate6.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(91, 103).addBox(-0.5F, -1.9669F, -0.1584F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1358F, 1.4296F, -3.1012F, 0.048F, 0.0F, 0.0F));

		PartDefinition neck = upperbody.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.7011F, -9.8326F, -0.1309F, -0.1298F, 0.017F));

		PartDefinition cube_r291 = neck.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(24, 98).addBox(0.0F, -4.326F, -0.075F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3097F, -1.3944F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r292 = neck.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(66, 75).addBox(0.0F, -3.8058F, -0.0902F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9903F, -2.8944F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r293 = neck.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(42, 120).addBox(0.0F, -2.5604F, -0.0391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3903F, -4.3944F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r294 = neck.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(28, 86).addBox(-0.5F, -0.8093F, -0.3765F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 3.3903F, -4.3944F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r295 = neck.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(142, 56).mirror().addBox(-0.8206F, 0.039F, -0.9177F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.5775F, -3.2319F, 1.4483F, -0.5646F, 0.1197F));

		PartDefinition cube_r296 = neck.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(131, 144).mirror().addBox(-0.0992F, -0.1656F, -0.8908F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.5775F, -3.2319F, -1.3077F, -1.2067F, 2.9321F));

		PartDefinition cube_r297 = neck.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(3, 139).mirror().addBox(-1.2862F, 0.1187F, -0.2895F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.6775F, -2.0319F, 1.0346F, -0.592F, 0.3234F));

		PartDefinition cube_r298 = neck.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(143, 3).mirror().addBox(-0.119F, -0.706F, -0.2535F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.6775F, -2.0319F, -0.7691F, -0.9589F, 2.4255F));

		PartDefinition cube_r299 = neck.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(28, 138).mirror().addBox(-1.6927F, 0.2593F, -0.2692F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4775F, -0.5319F, 0.6789F, -0.6228F, 0.5622F));

		PartDefinition cube_r300 = neck.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(92, 144).mirror().addBox(-3.3311F, 3.1213F, -0.2719F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4775F, -0.5319F, 0.8425F, -0.3184F, 0.2086F));

		PartDefinition cube_r301 = neck.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(142, 141).mirror().addBox(-0.0691F, -0.2793F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4775F, -0.5319F, -0.6503F, -0.6769F, 2.3723F));

		PartDefinition cube_r302 = neck.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(131, 144).addBox(0.0992F, -0.1656F, -0.8908F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.5775F, -3.2319F, -1.3077F, 1.2067F, -2.9321F));

		PartDefinition cube_r303 = neck.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(142, 56).addBox(0.8206F, 0.039F, -0.9177F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.5775F, -3.2319F, 1.4483F, 0.5646F, -0.1197F));

		PartDefinition cube_r304 = neck.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(143, 3).addBox(0.119F, -0.706F, -0.2535F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.6775F, -2.0319F, -0.7691F, 0.9589F, -2.4255F));

		PartDefinition cube_r305 = neck.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(3, 139).addBox(1.2862F, 0.1187F, -0.2895F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.6775F, -2.0319F, 1.0346F, 0.592F, -0.3234F));

		PartDefinition cube_r306 = neck.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(142, 141).addBox(0.0691F, -0.2793F, -0.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4775F, -0.5319F, -0.6503F, 0.6769F, -2.3723F));

		PartDefinition cube_r307 = neck.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(92, 144).addBox(3.3311F, 3.1213F, -0.2719F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4775F, -0.5319F, 0.8425F, 0.3184F, -0.2086F));

		PartDefinition cube_r308 = neck.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(28, 138).addBox(1.6927F, 0.2593F, -0.2692F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.4775F, -0.5319F, 0.6789F, 0.6228F, -0.5622F));

		PartDefinition plate9 = neck.addOrReplaceChild("plate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8976F, -3.0166F, -3.2408F, 0.6066F, -0.0883F, 0.0968F));

		PartDefinition cube_r309 = plate9.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(51, 118).addBox(-0.5F, -3.8894F, -0.0244F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.9518F, -2.9196F, -0.5629F, 0.0F, 0.0F));

		PartDefinition cube_r310 = plate9.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(90, 126).addBox(-0.5F, -1.9336F, -3.0388F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.1223F, 2.0251F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r311 = plate9.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(42, 125).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1223F, 0.7251F, 0.6152F, 0.0F, 0.0F));

		PartDefinition cube_r312 = plate9.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(29, 126).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8882F, -1.0089F, 0.1353F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.2903F, -4.4944F, -0.0894F, -0.2173F, 0.0193F));

		PartDefinition cube_r313 = neck4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(112, 8).addBox(0.0F, -0.7968F, -0.177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -4.4F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r314 = neck4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(105, 19).addBox(0.0F, -1.0985F, 0.126F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -2.9F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r315 = neck4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(12, 144).addBox(0.0F, -1.7158F, -0.0357F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.1F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r316 = neck4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(78, 103).addBox(-0.5F, -1.9272F, -4.8582F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.6F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r317 = neck4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(25, 144).mirror().addBox(0.0878F, -0.0644F, -0.4415F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.5872F, -4.0375F, 1.4346F, -0.5959F, 0.1607F));

		PartDefinition cube_r318 = neck4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(145, 17).mirror().addBox(0.1066F, -0.2283F, -0.5401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.7872F, -1.9375F, -0.7811F, -1.4207F, 2.4225F));

		PartDefinition cube_r319 = neck4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(66, 142).mirror().addBox(-0.7221F, 0.2265F, -0.5649F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.7872F, -1.9375F, 1.4522F, -0.3189F, 0.1213F));

		PartDefinition cube_r320 = neck4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(15, 145).mirror().addBox(0.0133F, -0.2129F, -1.0299F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3872F, -0.3375F, -2.0438F, -1.2857F, -2.6612F));

		PartDefinition cube_r321 = neck4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(63, 142).mirror().addBox(-0.7474F, 0.1386F, -1.0553F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3872F, -0.3375F, 1.7049F, -0.4708F, -0.0194F));

		PartDefinition cube_r322 = neck4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(25, 144).addBox(-0.0878F, -0.0644F, -0.4415F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.5872F, -4.0375F, 1.4346F, 0.5959F, -0.1607F));

		PartDefinition cube_r323 = neck4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(66, 142).addBox(0.7221F, 0.2265F, -0.5649F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.7872F, -1.9375F, 1.4522F, 0.3189F, -0.1213F));

		PartDefinition cube_r324 = neck4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(145, 17).addBox(-0.1066F, -0.2283F, -0.5401F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.7872F, -1.9375F, -0.7811F, 1.4207F, -2.4225F));

		PartDefinition cube_r325 = neck4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(63, 142).addBox(0.7474F, 0.1386F, -1.0553F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3872F, -0.3375F, 1.7049F, 0.4708F, 0.0194F));

		PartDefinition cube_r326 = neck4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 145).addBox(-0.0133F, -0.2129F, -1.0299F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3872F, -0.3375F, -2.0438F, 1.2857F, 2.6612F));

		PartDefinition plate22 = neck4.addOrReplaceChild("plate22", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0204F, -1.9887F, -1.486F, 0.4478F, 0.0254F, -0.1271F));

		PartDefinition cube_r327 = plate22.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(121, 121).addBox(-0.5F, -2.8894F, -0.0244F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.9518F, -2.9196F, -0.3534F, 0.0F, 0.0F));

		PartDefinition cube_r328 = plate22.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(138, 46).addBox(-0.5F, 0.169F, 2.0853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.7223F, -2.0749F, 0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r329 = plate22.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(58, 86).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1223F, 0.7251F, 0.6152F, 0.0F, 0.0F));

		PartDefinition cube_r330 = plate22.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(20, 125).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.8882F, -1.0089F, 0.1353F, 0.0F, 0.0F));

		PartDefinition neck2 = neck4.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(82, 34).addBox(-0.5F, -0.9148F, -6.815F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(130, 38).addBox(0.0F, -1.6148F, -1.815F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(131, 57).addBox(0.0F, -1.6148F, -3.815F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 97).addBox(0.0F, -1.5148F, -5.815F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6258F, -3.7937F, 0.055F, -0.1213F, -0.224F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(46, 144).mirror().addBox(-0.006F, -0.2204F, -0.6951F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.0386F, -5.5438F, 1.1895F, -0.3155F, 0.0251F));

		PartDefinition cube_r332 = neck2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(43, 144).mirror().addBox(-0.0035F, -0.2519F, -0.6172F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.0386F, -3.5438F, 1.1698F, -0.4366F, 0.0787F));

		PartDefinition cube_r333 = neck2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(28, 144).mirror().addBox(0.0225F, -0.1982F, -0.7182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.0386F, -1.5438F, 1.1292F, -0.5959F, 0.1607F));

		PartDefinition cube_r334 = neck2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(46, 144).addBox(0.006F, -0.2204F, -0.6951F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0386F, -5.5438F, 1.1895F, 0.3155F, -0.0251F));

		PartDefinition cube_r335 = neck2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(43, 144).addBox(0.0035F, -0.2519F, -0.6172F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0386F, -3.5438F, 1.1698F, 0.4366F, -0.0787F));

		PartDefinition cube_r336 = neck2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(28, 144).addBox(-0.0225F, -0.1982F, -0.7182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0386F, -1.5438F, 1.1292F, 0.5959F, -0.1607F));

		PartDefinition cube_r337 = neck2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(111, 83).addBox(-1.0F, -0.8642F, -0.0876F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9806F, -7.4328F, -0.0873F, 0.0F, 0.0F));

		PartDefinition plate23 = neck2.addOrReplaceChild("plate23", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0581F, -3.2465F, -1.8764F, -0.1611F, 0.0668F, 0.0716F));

		PartDefinition cube_r338 = plate23.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(90, 132).addBox(-0.5F, -1.8894F, -0.0244F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.1098F, -2.5465F, -0.3534F, 0.0F, 0.0F));

		PartDefinition cube_r339 = plate23.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(78, 91).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0026F, -0.4092F, 0.1614F, 0.0F, 0.0F));

		PartDefinition cube_r340 = plate23.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(135, 105).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7908F, -0.6265F, 0.5105F, 0.0F, 0.0F));

		PartDefinition cube_r341 = plate23.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(83, 132).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1733F, -0.6357F, 0.1353F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(104, 70).addBox(-0.5F, -0.4F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(142, 112).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(143, 105).addBox(0.0F, -1.0F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(95, 144).addBox(0.0F, -1.0F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4952F, -6.7774F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r342 = neck5.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(110, 33).addBox(-1.0F, -2.0596F, -0.072F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8758F, -4.5554F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r343 = neck5.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(128, 144).mirror().addBox(-0.9655F, -2.9968F, -2.4589F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(98, 144).mirror().addBox(-0.4312F, -1.3293F, -1.4421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(49, 144).mirror().addBox(0.0724F, -0.0343F, -0.4869F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2566F, -0.9664F, 0.9626F, -0.3155F, 0.0251F));

		PartDefinition cube_r344 = neck5.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(128, 144).addBox(0.9655F, -2.9968F, -2.4589F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(98, 144).addBox(0.4312F, -1.3293F, -1.4421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 144).addBox(-0.0724F, -0.0343F, -0.4869F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2566F, -0.9664F, 0.9626F, 0.3155F, -0.0251F));

		PartDefinition plate24 = neck5.addOrReplaceChild("plate24", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8603F, -2.9832F, 1.7014F, -0.1611F, -0.0668F, -0.0716F));

		PartDefinition cube_r345 = plate24.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(141, 53).addBox(-0.5F, -0.9828F, -0.0563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.2098F, -2.2465F, -0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r346 = plate24.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(141, 50).addBox(-0.5F, -0.9276F, 0.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.1098F, -2.5465F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r347 = plate24.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(98, 62).addBox(-0.5F, -1.9384F, -0.5027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.3026F, -1.3092F, 0.0223F, -0.0082F, 0.0061F));

		PartDefinition cube_r348 = plate24.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(46, 141).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8327F, -1.5199F, 0.3185F, 0.0F, 0.0F));

		PartDefinition cube_r349 = plate24.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(141, 43).addBox(-0.5F, 0.7F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1733F, -0.6357F, 0.1353F, 0.0F, 0.0F));

		PartDefinition plate16 = neck5.addOrReplaceChild("plate16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6922F, -3.2476F, -1.0882F, -0.1611F, 0.0668F, 0.0716F));

		PartDefinition cube_r350 = plate16.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(141, 95).addBox(-0.5F, -0.9276F, 0.0295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.1098F, -2.5465F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r351 = plate16.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(65, 55).addBox(-0.5F, -1.1384F, -0.9027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.3026F, -1.3092F, 0.0223F, 0.0082F, -0.0061F));

		PartDefinition cube_r352 = plate16.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(141, 79).addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8327F, -1.5199F, 0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r353 = plate16.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(141, 76).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5647F, -1.9602F, 0.048F, 0.0F, 0.0F));

		PartDefinition neck3 = neck5.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.1439F, -0.0432F, -0.0063F));

		PartDefinition cube_r354 = neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(138, 72).addBox(0.0F, -0.9921F, -2.0049F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3172F, -0.8827F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(129, 6).addBox(-1.0F, -1.9528F, -0.0448F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 3.9758F, -1.9554F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(31, 120).addBox(-0.5F, -0.65F, -1.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 0.3828F, -2.4827F, 0.0873F, 0.0F, 0.0F));

		PartDefinition plate17 = neck3.addOrReplaceChild("plate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5215F, -3.1509F, 1.4681F, -0.1611F, -0.0668F, -0.0716F));

		PartDefinition cube_r357 = plate17.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(141, 131).addBox(-0.5F, -0.5276F, 0.2295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.1098F, -2.5465F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r358 = plate17.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(81, 69).addBox(-0.4928F, 0.011F, -0.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0047F, 0.5732F, -2.2171F, 0.127F, -0.0082F, 0.0061F));

		PartDefinition cube_r359 = plate17.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(130, 141).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.5551F, -1.7604F, 0.8334F, 0.0F, 0.0F));

		PartDefinition plate25 = neck3.addOrReplaceChild("plate25", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1573F, -1.9207F, -2.6273F, 0.0484F, 0.0668F, 0.0716F));

		PartDefinition cube_r360 = plate25.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(141, 98).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0016F, 0.2806F, -0.0077F, 0.8334F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(139, 91).addBox(0.5F, -1.2966F, -0.3483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
		.texOffs(139, 91).mirror().addBox(-1.5F, -1.2966F, -0.3483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4952F, -3.6127F, 0.3217F, -0.1657F, -0.0549F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(0, 131).addBox(-1.0F, 0.0287F, -1.9789F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.6784F, -2.1984F, 0.4407F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(141, 0).addBox(0.1F, -0.0432F, -0.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.5F, 1.5852F, -5.855F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(140, 122).addBox(0.1F, -0.0296F, -0.976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.5F, 0.9852F, -5.155F, 0.6938F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(134, 115).addBox(0.1F, 0.0193F, -1.5174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.5F, 0.1852F, -3.955F, 0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(134, 42).mirror().addBox(0.025F, -0.5647F, 0.9913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.9149F, -5.8885F, 0.3957F, -0.1209F, -0.0503F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(134, 42).addBox(-1.025F, -0.5647F, 0.9913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(0.6F, 1.9149F, -5.8885F, 0.3957F, 0.1209F, 0.0503F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(126, 106).addBox(-1.5F, -0.9235F, -1.9142F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9034F, -1.7483F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(124, 88).addBox(-1.5F, -0.4F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2581F, -0.8706F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(123, 117).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2966F, -0.3483F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(140, 119).mirror().addBox(-1.0F, 0.05F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(140, 119).addBox(1.0F, 0.05F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3466F, 0.6017F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(72, 142).mirror().addBox(-1.0F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
		.texOffs(72, 142).addBox(1.0F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 0.2034F, 0.1517F, -0.4102F, 0.0F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.775F, 0.0771F, -2.8709F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r372 = eye.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(141, 128).mirror().addBox(-0.4F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(141, 125).mirror().addBox(-0.4F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.155F, 1.8743F, -1.9708F, 0.2026F, -0.1368F, -0.028F));

		PartDefinition cube_r373 = eye.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(140, 34).mirror().addBox(0.285F, 0.5352F, -2.3218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(141, 20).mirror().addBox(-0.015F, -0.0648F, -1.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(141, 8).mirror().addBox(-0.015F, -0.0648F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
		.texOffs(140, 34).addBox(1.925F, 0.5352F, -2.3218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(141, 20).addBox(2.225F, -0.0648F, -1.6218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
		.texOffs(141, 8).addBox(2.225F, -0.0648F, -0.8218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.83F, -0.8057F, 1.9964F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r374 = eye.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(140, 68).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
		.texOffs(140, 68).addBox(1.74F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.345F, -0.2578F, 1.1705F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r375 = eye.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(141, 134).mirror().addBox(-0.535F, -0.306F, 0.4658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(141, 115).mirror().addBox(-0.375F, -0.306F, 0.4658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(141, 134).addBox(2.145F, -0.306F, 0.4658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(141, 115).addBox(1.985F, -0.306F, 0.4658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.53F, -0.1057F, 0.2964F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r376 = eye.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(141, 11).mirror().addBox(-0.5F, -0.073F, -0.8221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(141, 11).addBox(1.74F, -0.073F, -0.8221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.345F, -0.8578F, 1.9705F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r377 = eye.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(141, 37).mirror().addBox(-0.44F, -0.2033F, -0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(141, 37).addBox(1.88F, -0.2033F, -0.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.445F, -0.9531F, 2.1791F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r378 = eye.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(141, 23).mirror().addBox(-0.45F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
		.texOffs(141, 23).addBox(1.89F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.445F, -1.0531F, 2.5791F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r379 = eye.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(141, 128).addBox(-0.6F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
		.texOffs(141, 125).addBox(-0.6F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.395F, 1.8743F, -1.9708F, 0.2026F, 0.1368F, 0.028F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7457F, 0.4672F, 0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(141, 40).addBox(-1.0F, -0.9559F, -0.9258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 2.496F, -4.7146F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(135, 61).mirror().addBox(-0.5F, -0.8663F, -0.2681F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
		.texOffs(135, 61).addBox(0.7F, -0.8663F, -0.2681F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.6F, 1.796F, -3.0146F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(135, 57).mirror().addBox(-1.0F, -0.122F, -2.0238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false)
		.texOffs(135, 57).addBox(1.2F, -0.122F, -2.0238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.6F, -0.004F, 0.0854F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(134, 133).mirror().addBox(-1.0F, -0.3229F, -1.9043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(134, 133).addBox(1.2F, -0.3229F, -1.9043F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.196F, 0.0854F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(140, 65).mirror().addBox(0.385F, 1.7352F, -1.5218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(140, 65).addBox(2.025F, 1.7352F, -1.5218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.705F, -1.4743F, -1.3417F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 135).mirror().addBox(-0.5F, 0.0071F, -1.7832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(0, 135).addBox(0.7F, 0.0071F, -1.7832F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, 0.196F, -1.8146F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(135, 83).mirror().addBox(-0.5F, -0.1192F, -1.9202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.096F, -3.3146F, 0.3503F, -0.082F, -0.0299F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(135, 83).addBox(-0.5F, -0.1192F, -1.9202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.096F, -3.3146F, 0.3503F, 0.082F, 0.0299F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(135, 87).addBox(-0.5F, 1.9418F, -12.946F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.2119F, 9.4679F, -0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(128, 68).addBox(-1.0F, -1.9081F, -0.1465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.7119F, -1.7321F, -0.1963F, 0.0F, 0.0F));

		PartDefinition frontrightleg5 = upperbody.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(6.75F, 14.4025F, -3.6421F, 0.0F, 0.0F, -0.1745F));

		PartDefinition frontleftleg2 = frontrightleg5.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 1.1735F, -4.524F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r390 = frontleftleg2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(115, 103).addBox(-1.0F, 0.1603F, -1.9828F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 6.3612F, 0.9979F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r391 = frontleftleg2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(92, 118).addBox(-1.0F, -3.0F, -0.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.8612F, -1.0021F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r392 = frontleftleg2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(126, 100).addBox(-1.0F, -2.7332F, -0.0322F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1388F, -1.3021F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r393 = frontleftleg2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(65, 121).addBox(-1.0F, -4.9842F, -2.122F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 3.3612F, -2.6021F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r394 = frontleftleg2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(104, 103).addBox(-1.0F, -2.0F, -1.6F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 0.8612F, -0.4021F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create().texOffs(132, 110).addBox(-1.3351F, -1.0559F, 0.5847F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(124, 51).addBox(-1.3351F, 0.9441F, -1.6153F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0541F, 8.487F, 0.2162F, -0.3016F, 0.045F, 0.1687F));

		PartDefinition cube_r395 = frontleftleg3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(65, 129).addBox(0.4996F, -1.9987F, -1.1689F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r396 = frontleftleg3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(132, 16).addBox(0.4996F, -3.9551F, -0.1061F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8348F, 5.6428F, -0.0464F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r397 = frontleftleg3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(128, 24).addBox(0.4996F, 0.0013F, -1.0689F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create().texOffs(108, 98).addBox(-3.0F, 0.3166F, -3.5736F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(103, 11).addBox(1.0F, 0.3166F, -3.5736F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(108, 19).addBox(-2.5F, -0.6834F, -1.5736F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0618F, 8.2964F, -0.3459F, 0.5149F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = upperbody.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.75F, 14.4025F, -3.6421F, 0.0F, 0.0F, 0.1745F));

		PartDefinition frontleftleg5 = frontrightleg2.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 1.1735F, -4.524F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r398 = frontleftleg5.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(116, 0).addBox(-1.0F, 0.1603F, -1.9828F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 6.3612F, 0.9979F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r399 = frontleftleg5.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(11, 120).addBox(-1.0F, -3.0F, -0.1F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.8612F, -1.0021F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r400 = frontleftleg5.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(99, 127).addBox(-1.0F, -2.7332F, -0.0322F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1388F, -1.3021F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r401 = frontleftleg5.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(74, 121).addBox(-1.0F, -4.9842F, -2.122F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 3.3612F, -2.6021F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r402 = frontleftleg5.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(108, 24).addBox(-1.0F, -2.0F, -1.6F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 0.8612F, -0.4021F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightleg3 = frontleftleg5.addOrReplaceChild("frontrightleg3", CubeListBuilder.create().texOffs(97, 133).addBox(-0.6649F, -1.0559F, 0.5847F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(124, 74).addBox(-0.6649F, 0.9441F, -1.6153F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0541F, 8.487F, 0.2162F, -0.3453F, -0.045F, -0.1687F));

		PartDefinition cube_r403 = frontrightleg3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(74, 129).addBox(-2.4996F, -1.9987F, -1.1689F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 0.7536F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r404 = frontrightleg3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(25, 132).addBox(-2.4996F, -3.9551F, -0.1061F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8348F, 5.6428F, -0.0464F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r405 = frontrightleg3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(128, 60).addBox(-2.4996F, 0.0013F, -1.0689F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 1.9428F, 1.6536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create().texOffs(116, 7).addBox(-1.0F, 0.3166F, -3.5736F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(103, 47).addBox(-2.0F, 0.3166F, -3.5736F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(108, 93).addBox(-1.5F, -0.6834F, -1.5736F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0618F, 8.2964F, -0.3459F, 0.2531F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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
