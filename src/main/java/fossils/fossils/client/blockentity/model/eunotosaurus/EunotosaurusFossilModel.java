package fossils.fossils.client.blockentity.model.eunotosaurus;

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
public class EunotosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL9;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL8;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart hindlegRx;
	private final ModelPart hindlegLx;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart forelegR;
	private final ModelPart forelegL;
	private final ModelPart forelegLx;
	private final ModelPart forelegL2;
	private final ModelPart forelegLx2;
	private final ModelPart forelegL3;
	private final ModelPart forelegL5;
	private final ModelPart forelegLx3;
	private final ModelPart forelegL6;
	private final ModelPart forelegLx4;
	private final ModelPart forelegL7;
	private final ModelPart forelegL4;

	public EunotosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.hindlegL2 = this.body3.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.hindlegL9 = this.hindlegL4.getChild("hindlegL9");
		this.hindlegL5 = this.body3.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.hindlegL7 = this.hindlegL6.getChild("hindlegL7");
		this.hindlegL8 = this.hindlegL7.getChild("hindlegL8");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.hindlegRx = this.body3.getChild("hindlegRx");
		this.hindlegLx = this.body3.getChild("hindlegLx");
		this.neck = this.body.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
		this.forelegR = this.body.getChild("forelegR");
		this.forelegL = this.body.getChild("forelegL");
		this.forelegLx = this.forelegL.getChild("forelegLx");
		this.forelegL2 = this.forelegLx.getChild("forelegL2");
		this.forelegLx2 = this.forelegL2.getChild("forelegLx2");
		this.forelegL3 = this.forelegLx2.getChild("forelegL3");
		this.forelegL5 = this.body.getChild("forelegL5");
		this.forelegLx3 = this.forelegL5.getChild("forelegLx3");
		this.forelegL6 = this.forelegLx3.getChild("forelegL6");
		this.forelegLx4 = this.forelegL6.getChild("forelegLx4");
		this.forelegL7 = this.forelegLx4.getChild("forelegL7");
		this.forelegL4 = this.body.getChild("forelegL4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -10.4F, -1.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-3.7227F, -1.8673F, -0.4245F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.353F, 2.5036F, 7.7354F, -0.6189F, -1.0172F, -2.119F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-2.8807F, -0.3891F, -0.7128F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.353F, 2.5036F, 7.7354F, -0.9188F, -0.4894F, -1.6421F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-3.3799F, -2.1659F, -0.5114F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.453F, 3.5036F, 5.2354F, -0.0961F, -1.0657F, -2.8977F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 62).mirror().addBox(-2.8497F, -0.4398F, -0.7932F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.453F, 3.5036F, 5.2354F, -0.8041F, -0.5569F, -1.944F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-5.3798F, -2.1659F, -0.5114F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.053F, 3.7036F, 3.3354F, 0.0518F, -1.061F, -3.0264F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-2.8497F, -0.4398F, -0.7932F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.053F, 3.7036F, 3.3354F, -0.7531F, -0.6149F, -1.9716F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 26).mirror().addBox(-2.768F, -0.2476F, -0.5778F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.853F, 4.3036F, 1.2354F, -0.6023F, -0.5163F, -2.2243F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-5.5309F, -0.3251F, -0.7989F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.253F, 5.9036F, 0.0354F, 0.0256F, -0.9008F, 3.1068F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 15).mirror().addBox(-7.7339F, -1.6126F, -0.5778F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.453F, 4.7036F, -0.4646F, -0.1665F, -0.7574F, 3.0889F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(64, 42).mirror().addBox(-2.768F, -0.2476F, -0.5778F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.453F, 4.7036F, -0.4646F, -0.6023F, -0.5163F, -2.4861F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-6.7339F, -1.6126F, -0.5778F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.153F, 4.7036F, -1.9646F, -0.1713F, -0.6876F, 3.092F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-2.768F, -0.2476F, -0.5778F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-6.153F, 4.7036F, -1.9646F, -0.5549F, -0.4605F, -2.5084F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-1.768F, -0.2476F, -0.5778F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.453F, 4.2036F, -3.3646F, -0.6546F, -0.34F, -2.3138F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 27).mirror().addBox(-6.0339F, -1.1126F, -0.5778F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.453F, 4.2036F, -3.3646F, -0.3569F, -0.6465F, -2.9204F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(33, 57).mirror().addBox(-4.9376F, -1.1274F, -0.6803F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.453F, 4.1036F, -5.1646F, 0.0533F, -0.4487F, -2.9666F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 54).mirror().addBox(-5.1173F, -3.5451F, -0.5977F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.0715F, 0.2046F, -1.4773F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(-1.0024F, -0.0217F, -0.3977F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.2152F, -0.0243F, -0.1347F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(77, 24).mirror().addBox(-1.0134F, -0.0471F, -0.4963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7249F, -3.917F, 0.1509F, -0.0446F, 0.0354F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 22).mirror().addBox(-1.2539F, -0.0441F, -0.55F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7249F, -3.917F, 0.1607F, 0.3521F, 0.0981F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-2.919F, -0.4291F, -0.0963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(73, 18).mirror().addBox(-2.919F, -0.4294F, -0.7963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7249F, -3.917F, 0.1564F, 0.0163F, -0.3526F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(-4.3909F, -1.7281F, -0.0963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(19, 73).mirror().addBox(-4.3909F, -1.7287F, -0.7963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7249F, -3.917F, 0.1315F, 0.0865F, -0.8282F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-2.1813F, -3.5551F, 2.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7249F, -3.917F, 0.1126F, -0.8277F, -1.4021F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(-1.8771F, -0.4031F, -0.2359F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(5, 77).mirror().addBox(-2.8771F, -0.4031F, -0.2359F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.2114F, 0.1788F, -0.4929F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-1.2566F, -0.0209F, -0.49F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.2266F, 0.3164F, -0.0578F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-2.918F, -0.4033F, -0.5977F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.2084F, 0.0593F, -0.5186F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-3.8112F, -1.6971F, 0.7339F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.1586F, -0.1618F, -1.0423F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-6.0965F, -3.5609F, -0.7963F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7249F, -3.917F, 0.0768F, 0.1374F, -1.3085F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-1.195F, -0.045F, -0.44F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7249F, -3.917F, 0.1609F, -0.355F, -0.0141F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(-1.6976F, -0.315F, -0.6803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.453F, 4.1036F, -5.1646F, -0.2288F, -0.3929F, -2.2979F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-4.402F, -1.7051F, -0.5977F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.1582F, 0.1484F, -0.9929F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-1.1079F, -0.0213F, -0.3367F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5249F, -6.017F, 0.2229F, -0.2629F, -0.1882F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(-1.9473F, 0.1434F, 0.0192F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.2751F, -8.317F, 0.3328F, 0.4318F, -0.6815F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2249F, -7.817F, 0.3378F, 0.0244F, -0.4045F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 68).mirror().addBox(-1.0F, -1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0045F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.3698F, -9.6339F, 0.9847F, -0.2944F, 0.1903F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 67).mirror().addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6182F, 4.8081F, -8.2949F, 1.3068F, -0.0063F, 0.1268F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(61, 29).mirror().addBox(-0.4918F, -0.5184F, -1.3423F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1148F, 3.8695F, -8.6033F, 1.3097F, -0.0403F, 0.0003F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(36, 62).mirror().addBox(-0.5F, -1.3456F, -1.3941F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1446F, 3.5921F, -7.6608F, 0.9432F, -0.0403F, 0.3319F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(66, 16).mirror().addBox(-0.5F, 0.0224F, -1.0434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1446F, 3.5921F, -7.6608F, 1.877F, -0.0403F, 0.3319F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(-0.5F, 0.3294F, -1.3546F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
		.texOffs(46, 18).mirror().addBox(-0.5F, -0.3705F, -1.5598F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 2.4649F, -8.3623F, 1.3097F, -0.0403F, 0.393F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(-0.5F, -1.3254F, 1.1037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 2.4649F, -8.3623F, 0.4894F, -0.0403F, 0.393F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(75, 4).addBox(-0.5F, -1.3254F, 1.1037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 2.4649F, -8.3623F, 0.4894F, 0.0403F, -0.393F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(66, 16).addBox(-0.5F, 0.0224F, -1.0434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1446F, 3.5921F, -7.6608F, 1.877F, 0.0403F, -0.3319F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(55, 42).addBox(-0.5F, 0.3294F, -1.3546F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
		.texOffs(46, 18).addBox(-0.5F, -0.3705F, -1.5598F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7F, 2.4649F, -8.3623F, 1.3097F, 0.0403F, -0.393F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(18, 67).addBox(-1.0F, -1.0F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6182F, 4.8081F, -8.2949F, 1.3068F, 0.0063F, -0.1268F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(61, 29).addBox(-0.5082F, -0.5184F, -1.3423F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1148F, 3.8695F, -8.6033F, 1.3097F, 0.0403F, -0.0003F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(13, 44).addBox(-4.1148F, -0.0623F, 0.0573F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1148F, 5.6695F, -8.6033F, 1.3796F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(30, 68).addBox(0.0F, -1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.0045F)), PartPose.offsetAndRotation(0.0F, 4.3698F, -9.6339F, 0.9847F, 0.2944F, -0.1903F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(68, 29).addBox(-3.6148F, -2.1096F, -1.4699F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1148F, 3.8695F, -8.6033F, 1.013F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, -1.3456F, -1.3941F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1446F, 3.5921F, -7.6608F, 0.9432F, 0.0403F, -0.3319F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(77, 22).addBox(0.254F, -0.0441F, -0.55F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7249F, -3.917F, 0.1607F, -0.3521F, -0.0981F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(77, 24).addBox(0.0134F, -0.0471F, -0.4963F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7249F, -3.917F, 0.1509F, 0.0446F, -0.0354F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 10).addBox(0.195F, -0.045F, -0.44F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7249F, -3.917F, 0.1609F, 0.355F, 0.0141F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 74).addBox(0.919F, -0.4291F, -0.0963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 18).addBox(0.919F, -0.4294F, -0.7963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7249F, -3.917F, 0.1564F, -0.0163F, 0.3526F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(73, 28).addBox(2.3909F, -1.7281F, -0.0963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 73).addBox(2.3909F, -1.7287F, -0.7963F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7249F, -3.917F, 0.1315F, -0.0865F, 0.8282F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(75, 50).addBox(1.1813F, -3.5551F, 2.4962F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7249F, -3.917F, 0.1126F, 0.8277F, 1.4021F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(64, 60).addBox(3.0965F, -3.5609F, -0.7963F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7249F, -3.917F, 0.0768F, -0.1374F, 1.3085F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(77, 12).addBox(0.2565F, -0.0209F, -0.49F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.2266F, -0.3164F, 0.0578F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(77, 26).addBox(0.0024F, -0.0217F, -0.3977F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.2152F, 0.0243F, 0.1347F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(76, 72).addBox(0.1079F, -0.0213F, -0.3367F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.2229F, 0.2629F, 0.1882F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(26, 73).addBox(0.918F, -0.4033F, -0.5977F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.2084F, -0.0593F, 0.5186F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(77, 14).addBox(0.8771F, -0.4031F, -0.2359F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 77).addBox(1.8771F, -0.4031F, -0.2359F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.2114F, -0.1788F, 0.4929F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(70, 14).addBox(1.8112F, -1.6971F, 0.7339F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.1586F, 0.1618F, 1.0423F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(73, 16).addBox(2.402F, -1.7051F, -0.5977F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.1582F, -0.1484F, 0.9929F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(73, 54).addBox(3.1173F, -3.5451F, -0.5977F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5249F, -6.017F, 0.0715F, -0.2046F, 1.4773F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(18, 61).addBox(-0.1193F, -0.3891F, -0.7128F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.353F, 2.5036F, 7.7354F, -0.9188F, 0.4894F, 1.6421F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(55, 69).addBox(1.7227F, -1.8673F, -0.4245F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.353F, 2.5036F, 7.7354F, -0.6189F, 1.0172F, 2.119F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(53, 62).addBox(-0.1503F, -0.4398F, -0.7932F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.453F, 3.5036F, 5.2354F, -0.8041F, 0.5569F, 1.944F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(68, 8).addBox(1.3799F, -2.1659F, -0.5114F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.453F, 3.5036F, 5.2354F, -0.0961F, 1.0657F, 2.8977F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(27, 62).addBox(-0.1503F, -0.4398F, -0.7932F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.053F, 3.7036F, 3.3354F, -0.7531F, 0.6149F, 1.9716F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(33, 54).addBox(1.3799F, -2.1659F, -0.5114F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.053F, 3.7036F, 3.3354F, 0.0518F, 1.061F, 3.0264F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(46, 12).addBox(-0.4691F, -0.3251F, -0.7989F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.253F, 5.9036F, 0.0354F, 0.0256F, 0.9008F, -3.1068F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(61, 26).addBox(-0.232F, -0.2476F, -0.5778F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.853F, 4.3036F, 1.2354F, -0.6023F, 0.5163F, 2.2243F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 42).addBox(-0.232F, -0.2476F, -0.5778F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.453F, 4.7036F, -0.4646F, -0.6023F, 0.5163F, 2.4861F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 15).addBox(1.7339F, -1.6126F, -0.5778F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.453F, 4.7036F, -0.4646F, -0.1665F, 0.7574F, -3.0889F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(43, 64).addBox(-0.232F, -0.2476F, -0.5778F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.153F, 4.7036F, -1.9646F, -0.5549F, 0.4605F, 2.5084F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(48, 24).addBox(1.7339F, -1.6126F, -0.5778F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(6.153F, 4.7036F, -1.9646F, -0.1713F, 0.6876F, -3.092F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(48, 27).addBox(1.0339F, -1.1126F, -0.5778F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.453F, 4.2036F, -3.3646F, -0.3569F, 0.6465F, 2.9204F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(68, 49).addBox(-0.232F, -0.2476F, -0.5778F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.453F, 4.2036F, -3.3646F, -0.6546F, 0.34F, 2.3138F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(33, 57).addBox(0.9376F, -1.1274F, -0.6803F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.453F, 4.1036F, -5.1646F, 0.0533F, 0.4487F, 2.9666F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(68, 39).addBox(-0.3024F, -0.315F, -0.6803F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.453F, 4.1036F, -5.1646F, -0.2288F, 0.3929F, 2.2979F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(12, 73).addBox(-0.0527F, 0.1434F, 0.0192F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.2751F, -8.317F, 0.3328F, -0.4318F, 0.6815F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(72, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2249F, -7.817F, 0.3378F, -0.0244F, 0.4045F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 78).addBox(0.0F, -1.0F, 4.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 78).addBox(0.0F, -1.0F, 2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 78).addBox(0.0F, -1.0F, 0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(-0.5F, -0.6F, 0.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -9.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(21, 43).addBox(-3.5F, -1.13F, -3.0677F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0654F, -3.244F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, -3.6F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(80, 4).addBox(0.0F, -1.1167F, 9.1658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 80).addBox(0.0F, -1.1167F, 7.1658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 79).addBox(0.0F, -1.1167F, 5.1658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 78).addBox(0.0F, -1.1167F, 3.1658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(74, 78).addBox(0.0F, -1.1167F, 1.1658F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -0.7167F, 0.1658F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0154F, -0.1441F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 25).addBox(-3.5F, -0.5161F, -0.1046F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.5154F, 5.6559F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(21, 36).addBox(-3.5F, -0.5126F, 0.7372F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7154F, -0.1441F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-1.3628F, 0.049F, -0.9015F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1251F, 10.083F, -0.1548F, -0.3429F, 0.0073F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-1.0304F, 0.0483F, -0.9871F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1251F, 10.083F, -0.1458F, -0.0323F, -0.0404F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-4.4739F, -1.6813F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(54, 74).mirror().addBox(-4.4739F, -1.6751F, -0.9871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1251F, 10.083F, -0.0693F, -0.1323F, -0.9108F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-2.9707F, -0.349F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(73, 46).mirror().addBox(-2.9707F, -0.3481F, -0.9871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1251F, 10.083F, -0.1225F, -0.0855F, -0.4302F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-0.8248F, 0.0094F, -1.3801F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6049F, 2.8806F, 9.8819F, 0.0001F, -0.6642F, -1.3954F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-4.1921F, -3.5571F, -1.2871F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1251F, 10.083F, 0.0001F, -0.1493F, -1.3953F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-1.361F, 0.049F, -0.9021F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0749F, 8.083F, -0.1548F, -0.3429F, 0.0946F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-1.0285F, 0.0485F, -0.9871F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0749F, 8.083F, -0.1458F, -0.0323F, 0.0469F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(75, 2).mirror().addBox(-4.4727F, -1.6798F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(47, 74).mirror().addBox(-4.4727F, -1.6791F, -0.8871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0749F, 8.083F, -0.0693F, -0.1323F, -0.8235F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(-2.9689F, -0.3483F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(73, 44).mirror().addBox(-2.9689F, -0.3481F, -0.8871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0749F, 8.083F, -0.1225F, -0.0855F, -0.3429F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(75, 48).mirror().addBox(-0.7793F, 0.0076F, -1.2147F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8294F, 2.3124F, 7.8819F, 0.0001F, -0.5507F, -1.3081F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-5.1916F, -3.5553F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0749F, 8.083F, 0.0001F, -0.1493F, -1.3081F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(62, 76).mirror().addBox(-1.0737F, 0.0149F, -1.3126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2749F, 6.083F, -0.0813F, 0.3648F, 0.1001F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 76).mirror().addBox(-1.3624F, 0.0144F, -0.9073F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2749F, 6.083F, -0.0808F, -0.3487F, 0.1568F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-1.0282F, 0.014F, -0.9925F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2749F, 6.083F, -0.076F, -0.0354F, 0.1318F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(73, 42).mirror().addBox(-4.446F, -1.7019F, -1.2925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(40, 73).mirror().addBox(-4.446F, -1.7011F, -0.8925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2749F, 6.083F, -0.0217F, -0.081F, -0.7413F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-2.9554F, -0.3802F, -1.2925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(71, 62).mirror().addBox(-2.9554F, -0.3751F, -0.8925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2749F, 6.083F, -0.0567F, -0.0618F, -0.2605F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(-0.9337F, -0.0141F, -1.2719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0218F, 1.7341F, 6.0489F, 0.0698F, -0.689F, -1.2694F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(66, 20).mirror().addBox(-6.1578F, -3.5625F, -1.2925F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2749F, 6.083F, 0.0182F, -0.0818F, -1.2229F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-1.0368F, -0.0151F, -1.1085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 4.083F, -0.0066F, 0.3629F, 0.179F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(57, 76).mirror().addBox(-1.3975F, -0.0156F, -1.004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 4.083F, -0.0066F, -0.3526F, 0.1836F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-1.0317F, -0.0163F, -1.0953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 4.083F, -0.0062F, -0.0385F, 0.1816F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 73).mirror().addBox(-4.4252F, -1.7238F, -1.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(73, 32).mirror().addBox(-4.4252F, -1.7231F, -0.6953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 4.083F, 0.0255F, -0.0295F, -0.6916F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(42, 71).mirror().addBox(-2.9472F, -0.4092F, -1.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(35, 71).mirror().addBox(-2.9472F, -0.409F, -0.6953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 4.083F, 0.009F, -0.0379F, -0.2114F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(75, 74).mirror().addBox(-2.6935F, -3.5651F, 2.1839F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 4.083F, 0.0652F, -0.9821F, -1.2252F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(33, 60).mirror().addBox(-7.1292F, -3.5724F, -1.3953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 4.083F, 0.0362F, -0.0144F, -1.1714F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(52, 76).mirror().addBox(-1.366F, -0.0552F, -0.9097F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 2.083F, 0.0678F, -0.3548F, 0.123F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-2.9312F, -0.4455F, -1.2959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(35, 48).mirror().addBox(-2.9312F, -0.4451F, -0.5959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 2.083F, 0.0746F, -0.0138F, -0.248F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-4.3943F, -1.7487F, -1.2959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(7, 71).mirror().addBox(-4.3943F, -1.7481F, -0.5959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 2.083F, 0.0725F, 0.0221F, -0.7266F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(25, 11).mirror().addBox(-7.0904F, -3.5802F, -1.2959F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 2.083F, 0.0542F, 0.0531F, -1.206F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-2.5895F, -3.5751F, 2.2081F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 2.083F, 0.0886F, -0.9136F, -1.2791F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-1.0749F, -0.0531F, -1.0167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 2.083F, 0.0679F, 0.3593F, 0.1704F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-1.0309F, -0.0558F, -0.9959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4749F, 2.083F, 0.0636F, -0.0413F, 0.1439F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(40, 78).addBox(3.1921F, -3.5571F, -1.2871F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1251F, 10.083F, 0.0001F, 0.1493F, 1.3953F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(61, 16).addBox(-0.1752F, 0.0094F, -1.3801F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6049F, 2.8806F, 9.8819F, 0.0001F, 0.6642F, 1.3954F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(73, 46).addBox(0.9707F, -0.3481F, -0.9871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 52).addBox(0.9707F, -0.349F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1251F, 10.083F, -0.1225F, 0.0855F, 0.4302F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(54, 74).addBox(2.4739F, -1.6751F, -0.9871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 74).addBox(2.4739F, -1.6813F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1251F, 10.083F, -0.0693F, 0.1323F, 0.9108F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(45, 78).addBox(0.0303F, 0.0483F, -0.9871F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1251F, 10.083F, -0.1458F, 0.0323F, 0.0404F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(10, 78).addBox(0.3628F, 0.049F, -0.9015F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1251F, 10.083F, -0.1548F, 0.3429F, -0.0073F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(73, 66).addBox(3.1916F, -3.5553F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0749F, 8.083F, 0.0001F, 0.1493F, 1.3081F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(75, 48).addBox(-0.2207F, 0.0076F, -1.2147F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8294F, 2.3124F, 7.8819F, 0.0001F, 0.5507F, 1.3081F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(73, 44).addBox(0.9689F, -0.3481F, -0.8871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 34).addBox(0.9689F, -0.3483F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0749F, 8.083F, -0.1225F, 0.0855F, 0.3429F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(47, 74).addBox(2.4727F, -1.6791F, -0.8871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 2).addBox(2.4727F, -1.6798F, -1.2871F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0749F, 8.083F, -0.0693F, 0.1323F, 0.8235F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(35, 78).addBox(0.0284F, 0.0485F, -0.9871F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0749F, 8.083F, -0.1458F, 0.0323F, -0.0469F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 78).addBox(0.361F, 0.049F, -0.9021F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0749F, 8.083F, -0.1548F, 0.3429F, -0.0946F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(66, 20).addBox(3.1578F, -3.5625F, -1.2925F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2749F, 6.083F, 0.0182F, 0.0818F, 1.2229F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 20).addBox(-0.0663F, -0.0141F, -1.2719F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0218F, 1.7341F, 6.0489F, 0.0698F, 0.689F, 1.2694F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 62).addBox(0.9554F, -0.3751F, -0.8925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 72).addBox(0.9554F, -0.3802F, -1.2925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2749F, 6.083F, -0.0567F, 0.0618F, 0.2605F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 73).addBox(2.446F, -1.7011F, -0.8925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 42).addBox(2.446F, -1.7019F, -1.2925F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2749F, 6.083F, -0.0217F, 0.081F, 0.7413F));

		PartDefinition cube_r137 = body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 78).addBox(0.0282F, 0.014F, -0.9925F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2749F, 6.083F, -0.076F, 0.0354F, -0.1318F));

		PartDefinition cube_r138 = body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(77, 76).addBox(0.3624F, 0.0144F, -0.9073F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2749F, 6.083F, -0.0808F, 0.3487F, -0.1568F));

		PartDefinition cube_r139 = body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(62, 76).addBox(0.0737F, 0.0149F, -1.3126F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2749F, 6.083F, -0.0813F, -0.3648F, -0.1001F));

		PartDefinition cube_r140 = body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(33, 60).addBox(3.1292F, -3.5724F, -1.3953F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 4.083F, 0.0362F, 0.0144F, 1.1714F));

		PartDefinition cube_r141 = body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(75, 74).addBox(1.6935F, -3.5651F, 2.1839F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 4.083F, 0.0652F, 0.9821F, 1.2252F));

		PartDefinition cube_r142 = body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 71).addBox(0.9472F, -0.409F, -0.6953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 71).addBox(0.9472F, -0.4092F, -1.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 4.083F, 0.009F, 0.0379F, 0.2114F));

		PartDefinition cube_r143 = body2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(73, 32).addBox(2.4252F, -1.7231F, -0.6953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 73).addBox(2.4252F, -1.7238F, -1.3953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 4.083F, 0.0255F, 0.0295F, 0.6916F));

		PartDefinition cube_r144 = body2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(25, 78).addBox(0.0317F, -0.0163F, -1.0953F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 4.083F, -0.0062F, 0.0385F, -0.1816F));

		PartDefinition cube_r145 = body2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(57, 76).addBox(0.3975F, -0.0156F, -1.004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 4.083F, -0.0066F, 0.3526F, -0.1836F));

		PartDefinition cube_r146 = body2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(15, 78).addBox(0.0368F, -0.0151F, -1.1085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 4.083F, -0.0066F, -0.3629F, -0.179F));

		PartDefinition cube_r147 = body2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(20, 78).addBox(0.0309F, -0.0558F, -0.9959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 2.083F, 0.0636F, 0.0413F, -0.1439F));

		PartDefinition cube_r148 = body2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(77, 34).addBox(0.0748F, -0.0531F, -1.0167F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 2.083F, 0.0679F, -0.3593F, -0.1704F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(35, 48).addBox(0.9312F, -0.4451F, -0.5959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 71).addBox(0.9312F, -0.4455F, -1.2959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 2.083F, 0.0746F, 0.0138F, 0.248F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(7, 71).addBox(2.3943F, -1.7481F, -0.5959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 30).addBox(2.3943F, -1.7487F, -1.2959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 2.083F, 0.0725F, -0.0221F, 0.7266F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(47, 76).addBox(1.5895F, -3.5751F, 2.2081F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 2.083F, 0.0886F, 0.9136F, 1.2791F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(25, 11).addBox(3.0904F, -3.5802F, -1.2959F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 2.083F, 0.0542F, -0.0531F, 1.206F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(52, 76).addBox(0.366F, -0.0552F, -0.9097F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4749F, 2.083F, 0.0678F, 0.3548F, -0.123F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3499F, 10.5694F, -0.0438F, 0.1308F, -0.0057F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(11, 80).addBox(0.0F, -0.8F, 4.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 80).addBox(0.0F, -0.8F, 2.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(80, 7).addBox(0.0F, -0.8F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 43).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2538F, 0.0872F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0222F, 5.0178F, 4.7615F, 0.8785F, -1.4346F, -0.8739F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-1.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(68, 4).addBox(1.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.8801F, 4.1582F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4671F, 3.7141F, 3.9878F, 0.1098F, 0.1245F, -0.5996F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-2.017F, 0.2717F, -0.4643F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3433F, 0.8299F, -0.0832F, -0.0262F, -0.2607F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(68, 74).mirror().addBox(-3.8081F, -0.9343F, -0.4643F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3433F, 0.8299F, -0.0532F, -0.0692F, -0.8708F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(59, 8).mirror().addBox(-1.5F, -0.3F, -2.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.8801F, 4.1582F, 0.2594F, 0.3383F, 0.0878F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(0.2678F, -1.0649F, -0.5919F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.8019F, 4.281F, -0.2567F, 0.1245F, -0.5996F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(21, 33).mirror().addBox(-0.6F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2014F, 2.0632F, 4.3545F, 0.0042F, 0.0751F, -0.1139F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-2.3403F, -1.1231F, -0.4955F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6567F, 4.2299F, -0.2332F, -0.1551F, -0.9302F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-1.7421F, -0.1513F, -0.4955F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6567F, 4.2299F, -0.2792F, 0.0044F, -0.3382F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 72).mirror().addBox(-3.0087F, 0.011F, 0.5439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4433F, 1.5299F, -0.0832F, -0.0262F, -0.4352F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-4.4709F, -1.7167F, 0.5439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4433F, 1.5299F, -0.0532F, -0.0692F, -1.0454F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(62, 72).addBox(-0.2579F, -0.1513F, -0.4955F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6567F, 4.2299F, -0.2792F, -0.0044F, 0.3382F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 76).addBox(1.3403F, -1.1231F, -0.4955F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6567F, 4.2299F, -0.2332F, 0.1551F, 0.9302F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(68, 74).addBox(1.8081F, -0.9343F, -0.4643F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3433F, 0.8299F, -0.0532F, 0.0692F, 0.8708F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(21, 33).addBox(-0.4F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2014F, 2.0632F, 4.3545F, 0.0042F, -0.0751F, 0.1139F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(25, 68).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4671F, 3.7141F, 3.9878F, 0.1098F, -0.1245F, 0.5996F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(50, 69).addBox(-1.2678F, -1.0649F, -0.5919F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.8019F, 4.281F, -0.2567F, -0.1245F, 0.5996F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(61, 12).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0222F, 5.0178F, 4.7615F, 0.8785F, 1.4346F, 0.8739F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(59, 8).addBox(-0.5F, -0.3F, -2.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.8801F, 4.1582F, 0.2594F, -0.3383F, -0.0878F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(73, 60).addBox(0.017F, 0.2717F, -0.4643F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3433F, 0.8299F, -0.0832F, 0.0262F, 0.2607F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(75, 0).addBox(2.4709F, -1.7167F, 0.5439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4433F, 1.5299F, -0.0532F, 0.0692F, 1.0454F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(55, 72).addBox(1.0087F, 0.011F, 0.5439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4433F, 1.5299F, -0.0832F, 0.0262F, 0.4352F));

		PartDefinition hindlegL2 = body3.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9528F, 5.0001F, 3.8184F, 0.4446F, 0.346F, 0.0475F));

		PartDefinition cube_r178 = hindlegL2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(48, 30).addBox(0.0F, -0.3F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0603F, 0.0F, 0.842F, -0.0193F, 0.2173F, -0.0894F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(57, 50).addBox(0.41F, -0.21F, -0.89F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(0.41F, -0.21F, 0.21F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.1397F, -0.7F, -0.558F, 0.0F, -0.5236F, 1.9199F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 0.8F, 0.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition hindlegL9 = hindlegL4.addOrReplaceChild("hindlegL9", CubeListBuilder.create().texOffs(46, 0).addBox(-0.48F, -2.49F, -0.28F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, -2.5671F, 1.0552F, -2.2656F));

		PartDefinition hindlegL5 = body3.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9528F, 5.0001F, 3.8184F, 0.0519F, -0.346F, -0.0475F));

		PartDefinition cube_r179 = hindlegL5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(48, 33).addBox(-5.0F, -0.3F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0603F, 0.0F, 0.842F, -0.0193F, -0.2173F, 0.0894F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create().texOffs(11, 58).addBox(-4.41F, -0.21F, -0.89F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 58).addBox(-4.41F, -0.21F, 0.21F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.1397F, -0.7F, -0.558F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hindlegL7 = hindlegL6.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 0.8F, 0.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition hindlegL8 = hindlegL7.addOrReplaceChild("hindlegL8", CubeListBuilder.create().texOffs(46, 6).addBox(-4.52F, -2.49F, -0.28F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0436F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8595F, 5.3375F, -0.1744F, 0.043F, -0.0076F));

		PartDefinition cube_r180 = tail.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(36, 11).mirror().addBox(-2.7705F, -0.1421F, -0.4002F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.037F, 1.133F, -0.2342F, 0.1554F, -0.3025F));

		PartDefinition cube_r181 = tail.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 58).mirror().addBox(-1.2F, 0.0F, 3.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(69, 72).mirror().addBox(-1.6F, 0.0F, 1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(61, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2082F, 3.2503F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition cube_r182 = tail.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(73, 58).addBox(-0.8F, 0.0F, 3.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(69, 72).addBox(-0.4F, 0.0F, 1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 34).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2082F, 3.2503F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition cube_r183 = tail.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(36, 11).addBox(-0.2295F, -0.1421F, -0.4002F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.037F, 1.133F, -0.2559F, 0.056F, 0.4291F));

		PartDefinition cube_r184 = tail.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(80, 19).addBox(0.0F, -0.8F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 80).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(80, 16).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 80).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1965F, -0.2277F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(27, 25).addBox(-0.49F, -0.4915F, 0.0151F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(14, 68).addBox(0.0F, -0.6915F, 0.0151F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 78).addBox(0.0F, -0.6915F, 2.0151F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 78).addBox(0.0F, -0.6915F, 4.0151F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5355F, 8.7398F, 0.0079F, 0.2182F, 0.0017F));

		PartDefinition cube_r185 = tail2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-0.4251F, 0.1133F, 4.0441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(76, 68).mirror().addBox(-0.6251F, 0.1133F, 2.0441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(67, 76).mirror().addBox(-0.8251F, 0.1133F, 0.0441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1176F, -0.0247F, -0.0328F, -0.0189F, -0.2174F));

		PartDefinition cube_r186 = tail2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(76, 70).addBox(-0.5749F, 0.1133F, 4.0441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 68).addBox(-0.3749F, 0.1133F, 2.0441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1176F, -0.0247F, -0.0328F, 0.0189F, 0.2174F));

		PartDefinition cube_r187 = tail2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(67, 76).addBox(-0.1749F, 0.1133F, 0.0441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1176F, -0.0247F, -0.0335F, 0.1933F, 0.2116F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.6587F, -0.3611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1372F, 9.2582F, 0.1749F, 0.3873F, 0.0666F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.49F, -0.5251F, -0.0008F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1487F, 8.5908F, 0.0673F, -0.3919F, -0.0257F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, -0.4036F, -0.0143F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0905F, 9.9988F, 0.0644F, -0.6535F, -0.0392F));

		PartDefinition hindlegRx = body3.addOrReplaceChild("hindlegRx", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.6962F, 5.2872F, 0.0873F, 0.0F, 0.0F));

		PartDefinition hindlegLx = body3.addOrReplaceChild("hindlegLx", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 3.7962F, 5.6872F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -8.4F, -0.2428F, -0.3448F, 0.0167F));

		PartDefinition cube_r188 = neck.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-1.4447F, -0.1185F, 0.1057F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3651F, -1.8197F, 0.0827F, 0.2978F, -0.4135F));

		PartDefinition cube_r189 = neck.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-1.3F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3651F, -3.3197F, 0.0853F, 0.3848F, -0.4057F));

		PartDefinition cube_r190 = neck.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(73, 56).addBox(-0.5553F, -0.1185F, 0.1057F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3651F, -1.8197F, 0.0827F, -0.2978F, 0.4135F));

		PartDefinition cube_r191 = neck.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(73, 64).addBox(-0.7F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3651F, -3.3197F, 0.0853F, -0.3848F, 0.4057F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(62, 78).addBox(0.0F, -0.6603F, 2.0602F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(59, 78).addBox(0.0F, -0.6603F, 0.0602F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 48).addBox(-0.5F, -0.3603F, 0.0602F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2748F, -3.89F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(66, 45).addBox(-0.49F, -0.4739F, -1.8928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 78).addBox(0.0F, -0.7739F, -1.8928F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4083F, -3.8176F, -0.3127F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2318F, -1.8405F, -0.0367F, -0.1684F, -0.0461F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4563F, 1.1254F, 0.5594F, 0.0F, 0.0F));

		PartDefinition cube_r193 = lowerjaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-1.5F, -0.3121F, -1.6611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
		.texOffs(68, 0).addBox(1.5F, -0.3121F, -1.6611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5F, 0.2F, 0.0F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r194 = lowerjaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(43, 67).mirror().addBox(-1.5F, -0.3309F, -1.8259F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(43, 67).addBox(1.5F, -0.3309F, -1.8259F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.3F, -1.1F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r195 = lowerjaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(32, 75).mirror().addBox(-1.5F, -0.2205F, -0.8666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(32, 75).addBox(1.5F, -0.2205F, -0.8666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -2.5F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r196 = lowerjaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(0.0F, -0.8302F, -0.8053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
		.texOffs(75, 7).addBox(2.4F, -0.8302F, -0.8053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.7F, -0.1081F, -3.3391F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r197 = lowerjaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(27, 75).mirror().addBox(-0.5F, -0.5464F, -0.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
		.texOffs(27, 75).addBox(2.5F, -0.5464F, -0.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.5F, -0.3081F, -2.8391F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r198 = lowerjaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(36, 67).mirror().addBox(-1.5F, -0.2186F, -1.819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
		.texOffs(36, 67).addBox(1.5F, -0.2186F, -1.819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.5F, -0.7F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r199 = lowerjaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-1.5F, -0.3121F, -1.5611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(0, 68).addBox(1.5F, -0.3121F, -1.5611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.2F, 0.0F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r200 = lowerjaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(55, 57).mirror().addBox(-1.0F, -0.8434F, -0.2368F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(55, 57).addBox(1.4F, -0.8434F, -0.2368F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, -0.2527F, -5.4205F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r201 = lowerjaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.6F, -0.6F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
		.texOffs(7, 68).addBox(-0.4F, -0.6F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.6527F, -5.7205F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r202 = lowerjaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(42, 75).mirror().addBox(-1.0F, -0.2968F, -0.1279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
		.texOffs(42, 75).addBox(1.4F, -0.2968F, -0.1279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.7F, -1.1F, -3.2F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r203 = lowerjaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(75, 39).mirror().addBox(-1.0F, -0.2968F, -1.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
		.texOffs(37, 75).mirror().addBox(-1.0F, -0.2968F, -1.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
		.texOffs(75, 36).mirror().addBox(-1.0F, -0.2968F, -2.6279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
		.texOffs(57, 18).mirror().addBox(-1.0F, -0.1967F, -2.7279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false)
		.texOffs(75, 39).addBox(1.4F, -0.2968F, -1.028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
		.texOffs(37, 75).addBox(1.4F, -0.2968F, -1.828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
		.texOffs(75, 36).addBox(1.4F, -0.2968F, -2.6279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
		.texOffs(57, 18).addBox(1.4F, -0.1967F, -2.7279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.7F, -1.1F, -3.2F, 0.0524F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8966F, -0.0522F));

		PartDefinition cube_r204 = upperjaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(-0.95F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(69, 69).addBox(0.01F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.53F, -0.4267F, -5.3392F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r205 = upperjaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(9, 61).mirror().addBox(-2.03F, -0.8379F, -2.1842F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(9, 61).addBox(-0.97F, -0.8379F, -2.1842F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -2.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r206 = upperjaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(12, 75).mirror().addBox(-3.0F, -0.7759F, -0.242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
		.texOffs(12, 75).addBox(0.0F, -0.7759F, -0.242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0F, -1.3F, -0.6F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r207 = upperjaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(22, 75).mirror().addBox(-3.0F, -0.187F, -0.2107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(22, 75).addBox(0.0F, -0.187F, -0.2107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.8F, 0.8F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r208 = upperjaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-3.0F, -0.8135F, -0.2492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
		.texOffs(17, 75).mirror().addBox(-3.0F, -0.8135F, 1.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(17, 75).addBox(0.0F, -0.8135F, 1.3508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(66, 65).addBox(0.0F, -0.8135F, -0.2492F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.0F, -0.7F, -0.5F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r209 = upperjaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(44, 57).addBox(-2.0F, -0.2167F, -0.1711F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.4F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r210 = upperjaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(57, 39).addBox(-2.0F, -0.1956F, 0.4494F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
		.texOffs(57, 36).addBox(-2.0F, -0.1956F, -0.1506F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -2.0F, -0.6F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r211 = upperjaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -0.1599F, -0.2133F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -2.2F, -1.1F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r212 = upperjaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(7, 73).addBox(-0.5F, -0.7648F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(35, 50).addBox(-2.0F, -0.7F, -2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r213 = upperjaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -0.7576F, -1.5201F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
		.texOffs(44, 60).addBox(-0.5F, -0.7576F, -1.0201F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0F, 0.1F, -4.0F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r214 = upperjaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(27, 65).addBox(-1.0F, -0.8952F, -0.8625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.1076F, -3.1668F, -1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r215 = upperjaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -0.8997F, -0.8312F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.2076F, -4.1668F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r216 = upperjaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(9, 65).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.2076F, -4.7668F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r217 = upperjaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(64, 57).addBox(-0.5F, -0.1704F, -0.1309F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.0F, -1.7F, -4.6F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r218 = upperjaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(70, 25).addBox(0.5F, -0.1102F, -0.1198F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, -0.9F, -5.9F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r219 = upperjaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 62).addBox(-0.5F, -0.1294F, -0.102F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -1.4F, -5.3F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r220 = upperjaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(70, 22).addBox(0.5F, -0.8581F, -1.4229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F))
		.texOffs(70, 11).addBox(0.5F, -0.8581F, -0.9229F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 0.5F, -5.1F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r221 = upperjaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(18, 64).addBox(-1.5F, -1.0158F, -0.9503F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r222 = upperjaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(11, 54).addBox(-1.5F, -1.1115F, -1.9877F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.1F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r223 = upperjaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(61, 23).addBox(-1.5F, 0.0209F, -1.0347F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.6F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r224 = upperjaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(22, 54).addBox(-1.0F, 0.3545F, -1.944F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
		.texOffs(46, 50).addBox(-1.0F, -0.0455F, -1.944F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -1.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r225 = upperjaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(-1.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2864F, -1.8414F, -2.4233F, 0.1427F, -0.2074F, -0.0296F));

		PartDefinition cube_r226 = upperjaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(66, 53).addBox(0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2864F, -1.8414F, -2.4233F, 0.1427F, 0.2074F, 0.0296F));

		PartDefinition forelegR = body.addOrReplaceChild("forelegR", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 3.9F, -7.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition forelegL = body.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.3F, -6.6F, 0.0F, -0.48F, 0.0F));

		PartDefinition forelegLx = forelegL.addOrReplaceChild("forelegLx", CubeListBuilder.create().texOffs(68, 36).addBox(1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(59, 0).addBox(3.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5541F, 0.0F, -1.0644F, 0.0867F, -0.2737F, 0.2212F));

		PartDefinition forelegL2 = forelegLx.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3F, -0.5F, -0.1F, 0.0F, 0.0F, 1.1781F));

		PartDefinition forelegLx2 = forelegL2.addOrReplaceChild("forelegLx2", CubeListBuilder.create().texOffs(44, 54).addBox(-0.09F, -1.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 55).addBox(-0.09F, -0.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3126F, 0.3236F, -0.1347F, 0.0375F, 0.5375F, 0.1738F));

		PartDefinition forelegL3 = forelegLx2.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4303F, -0.0732F, 0.3209F, 0.2062F, 1.0735F, 0.0944F));

		PartDefinition cube_r227 = forelegL3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(46, 36).addBox(-3.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.02F, 0.01F, -0.38F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forelegL5 = body.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.3F, -6.6F, 0.0F, 0.48F, 0.0F));

		PartDefinition forelegLx3 = forelegL5.addOrReplaceChild("forelegLx3", CubeListBuilder.create().texOffs(62, 69).addBox(-3.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(59, 4).addBox(-5.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(59, 65).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5541F, 0.0F, -1.0644F, 1.0205F, -1.47F, -1.2192F));

		PartDefinition forelegL6 = forelegLx3.addOrReplaceChild("forelegL6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3F, -0.5F, -0.1F, 0.0F, 0.0F, -1.1781F));

		PartDefinition forelegLx4 = forelegL6.addOrReplaceChild("forelegLx4", CubeListBuilder.create().texOffs(55, 47).addBox(-3.91F, -1.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 54).addBox(-3.91F, -0.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3126F, 0.3236F, -0.1347F, -1.0825F, -0.0772F, 0.0579F));

		PartDefinition forelegL7 = forelegLx4.addOrReplaceChild("forelegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4303F, -0.0732F, 0.3209F, 0.2062F, -1.0735F, -0.0944F));

		PartDefinition cube_r228 = forelegL7.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(13, 48).addBox(-1.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.02F, 0.01F, -0.38F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forelegL4 = body.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.0F, -6.6F, 0.0F, 0.48F, 0.0F));

		return LayerDefinition.create(meshdefinition, 84, 84);
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