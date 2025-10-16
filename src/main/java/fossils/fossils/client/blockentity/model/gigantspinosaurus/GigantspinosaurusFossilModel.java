package fossils.fossils.client.blockentity.model.gigantspinosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GigantspinosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart chest;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart parascapularSpine;
	private final ModelPart parascapularSpine2;
	private final ModelPart neck4;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart neck;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone4;
	private final ModelPart jaw;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart tail;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart rightPlate13;
	private final ModelPart leftPlate20;
	private final ModelPart tail2;
	private final ModelPart leftPlate16;
	private final ModelPart rightPlate16;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;
	private final ModelPart tail3;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart tail4;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart tail5;
	private final ModelPart lefttailSpike2;
	private final ModelPart righttailSpike2;
	private final ModelPart lefttailSpike;
	private final ModelPart righttailSpike;

	public GigantspinosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftPlate12 = this.hips.getChild("leftPlate12");
		this.rightPlate12 = this.hips.getChild("rightPlate12");
		this.leftPlate11 = this.hips.getChild("leftPlate11");
		this.rightPlate11 = this.hips.getChild("rightPlate11");
		this.bone = this.hips.getChild("bone");
		this.bone6 = this.hips.getChild("bone6");
		this.backleftleg = this.hips.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.hips.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.leftPlate9 = this.body2.getChild("leftPlate9");
		this.rightPlate9 = this.body2.getChild("rightPlate9");
		this.chest = this.body2.getChild("chest");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.leftPlate5 = this.chest.getChild("leftPlate5");
		this.rightPlate5 = this.chest.getChild("rightPlate5");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.parascapularSpine = this.chest.getChild("parascapularSpine");
		this.parascapularSpine2 = this.chest.getChild("parascapularSpine2");
		this.neck4 = this.chest.getChild("neck4");
		this.leftPlate3 = this.neck4.getChild("leftPlate3");
		this.rightPlate3 = this.neck4.getChild("rightPlate3");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.leftPlate4 = this.neck2.getChild("leftPlate4");
		this.rightPlate4 = this.neck2.getChild("rightPlate4");
		this.neck = this.neck2.getChild("neck");
		this.neck5 = this.neck.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.head.getChild("rightFace");
		this.bone4 = this.rightFace.getChild("bone4");
		this.jaw = this.head.getChild("jaw");
		this.leftPlate2 = this.neck5.getChild("leftPlate2");
		this.rightPlate2 = this.neck5.getChild("rightPlate2");
		this.leftPlate7 = this.neck.getChild("leftPlate7");
		this.rightPlate7 = this.neck.getChild("rightPlate7");
		this.leftPlate10 = this.body.getChild("leftPlate10");
		this.rightPlate10 = this.body.getChild("rightPlate10");
		this.leftPlate8 = this.body.getChild("leftPlate8");
		this.rightPlate8 = this.body.getChild("rightPlate8");
		this.leftPlate6 = this.body.getChild("leftPlate6");
		this.rightPlate6 = this.body.getChild("rightPlate6");
		this.tail = this.hips.getChild("tail");
		this.leftPlate14 = this.tail.getChild("leftPlate14");
		this.rightPlate14 = this.tail.getChild("rightPlate14");
		this.rightPlate13 = this.tail.getChild("rightPlate13");
		this.leftPlate20 = this.tail.getChild("leftPlate20");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate16 = this.tail2.getChild("leftPlate16");
		this.rightPlate16 = this.tail2.getChild("rightPlate16");
		this.leftPlate15 = this.tail2.getChild("leftPlate15");
		this.rightPlate15 = this.tail2.getChild("rightPlate15");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate17 = this.tail3.getChild("leftPlate17");
		this.rightPlate17 = this.tail3.getChild("rightPlate17");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate19 = this.tail4.getChild("leftPlate19");
		this.rightPlate19 = this.tail4.getChild("rightPlate19");
		this.leftPlate18 = this.tail4.getChild("leftPlate18");
		this.rightPlate18 = this.tail4.getChild("rightPlate18");
		this.tail5 = this.tail4.getChild("tail5");
		this.lefttailSpike2 = this.tail5.getChild("lefttailSpike2");
		this.righttailSpike2 = this.tail5.getChild("righttailSpike2");
		this.lefttailSpike = this.tail5.getChild("lefttailSpike");
		this.righttailSpike = this.tail5.getChild("righttailSpike");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, -3.4506F, -4.7987F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.4F, 5.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 29).addBox(-0.504F, -0.0506F, 0.0013F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.4F, -0.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(100, 28).addBox(-0.5F, -2.8599F, -0.0294F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 2.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(111, 8).addBox(0.0F, 0.0444F, -0.0386F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.7F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, 0.4F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(1.0F, 0.4F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(0.0F, -0.1F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, -5.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = hips.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0431F, -3.5067F, 0.9237F, -0.6294F, -0.0206F, 0.1736F));

		PartDefinition cube_r5 = leftPlate12.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(90, 108).addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, 0.1897F, 0.0278F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftPlate12.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, 82).addBox(-0.5F, -0.175F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.4485F, -0.1919F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftPlate12.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 108).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.4485F, -0.1919F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftPlate12.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 91).addBox(-0.5F, -3.075F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1572F, -1.1674F, 0.2605F, -0.3149F, -0.0077F, -0.0048F));

		PartDefinition cube_r9 = leftPlate12.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 80).addBox(-0.5F, -4.2F, -0.175F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1556F, -0.4035F, -0.8432F, -0.4181F, 0.0089F, 0.0018F));

		PartDefinition rightPlate12 = hips.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0431F, -3.5067F, 0.9237F, -0.6294F, 0.0206F, -0.1736F));

		PartDefinition cube_r10 = rightPlate12.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(90, 108).mirror().addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.1897F, 0.0278F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r11 = rightPlate12.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(-0.5F, -0.175F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4485F, -0.1919F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightPlate12.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4485F, -0.1919F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r13 = rightPlate12.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 91).mirror().addBox(-0.5F, -3.075F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1572F, -1.1674F, 0.2605F, -0.3149F, 0.0077F, 0.0048F));

		PartDefinition cube_r14 = rightPlate12.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 80).mirror().addBox(-0.5F, -4.2F, -0.175F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -0.4035F, -0.8432F, -0.4181F, -0.0089F, -0.0018F));

		PartDefinition leftPlate11 = hips.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1844F, -3.7084F, -2.0121F, -0.3252F, -0.0355F, 0.1711F));

		PartDefinition cube_r15 = leftPlate11.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(106, 6).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(5, 106).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.4485F, -0.1919F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftPlate11.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 105).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.6495F, 0.4481F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftPlate11.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 105).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -1.5639F, 0.313F, -0.1317F, -0.0077F, -0.0048F));

		PartDefinition cube_r18 = leftPlate11.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -3.4F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1556F, -0.4035F, -0.8432F, -0.4879F, 0.0089F, 0.0018F));

		PartDefinition rightPlate11 = hips.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1844F, -3.7084F, -2.0121F, -0.3252F, 0.0355F, -0.1711F));

		PartDefinition cube_r19 = rightPlate11.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(5, 106).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4485F, -0.1919F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightPlate11.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 105).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6495F, 0.4481F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightPlate11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(70, 105).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.5639F, 0.313F, -0.1317F, 0.0077F, 0.0048F));

		PartDefinition cube_r22 = rightPlate11.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.5F, -3.4F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -0.4035F, -0.8432F, -0.4879F, -0.0089F, -0.0018F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.1561F, -0.8054F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(31, 58).addBox(1.3F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 24).addBox(1.3F, -0.7911F, -1.4495F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(94, 60).addBox(0.1275F, 1.7039F, 0.2798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.8F, 2.6F, 0.2033F, 0.0829F, 0.0687F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(93, 95).addBox(0.1275F, 0.0258F, -0.3416F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 3.8F, 2.6F, 0.5175F, 0.0829F, 0.0687F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(96, 90).addBox(-0.4168F, -2.1869F, -0.3567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.1F, 2.7F, 0.5175F, 0.0829F, 0.2257F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(9, 58).addBox(-0.945F, -0.4669F, -0.1443F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6048F, 2.9576F, 1.2347F, -1.041F, -0.2184F, -0.0431F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(37, 52).addBox(-0.8621F, -1.0118F, -3.4914F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7124F, 3.4435F, 0.8443F, -0.8156F, -0.3926F, 0.1769F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(38, 92).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0445F, 1.2729F, 1.869F, 0.0184F, -0.0916F, 0.5584F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(93, 73).addBox(-0.5F, -1.5F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1356F, 1.2236F, 1.248F, 0.6397F, -0.083F, 0.553F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(85, 29).addBox(-0.6659F, -0.3793F, -0.153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.1274F, 1.029F, -1.4973F, 0.0F, -0.2328F, -0.0748F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(98, 100).addBox(-0.6659F, -0.3749F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1274F, 1.029F, -1.4973F, 0.8029F, -0.2328F, -0.0748F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(89, 8).addBox(-0.7172F, -0.3466F, -1.9982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1274F, 1.029F, -1.4973F, 0.6124F, -0.5117F, -0.2684F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(85, 65).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.8F, 0.0837F, 2.8226F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(7, 69).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2601F, 0.014F, 3.6612F, -0.4243F, -0.3203F, 0.1413F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 43).addBox(1.3F, -1.7158F, -0.5907F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(71, 24).addBox(1.3F, -0.1262F, -0.0381F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.7F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 60).addBox(-2.0F, -0.2222F, -3.0757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3F, -1.5927F, 0.0028F, -0.2537F, 0.6772F, -0.1883F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(64, 0).addBox(0.3238F, -0.3732F, -2.5686F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4171F, -1.8641F, -2.7833F, -0.0945F, -0.2413F, 0.0961F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 10).addBox(-0.1822F, -0.5039F, -3.0955F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4171F, -1.8641F, -2.7833F, -0.0019F, -0.3349F, 0.0552F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(47, 85).addBox(1.5656F, -1.4512F, -4.1399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4171F, -1.8641F, -2.7833F, 0.3213F, -0.0479F, 0.1455F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(89, 45).addBox(-0.45F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9668F, -0.9982F, -6.0716F, -0.1532F, -0.2609F, 0.0246F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 89).addBox(-0.5856F, -1.4587F, -4.7139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4171F, -1.8641F, -2.7833F, 0.322F, -0.4763F, 0.0618F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(33, 80).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, -1.2717F, -2.138F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(37, 48).addBox(1.3F, -1.2296F, -1.9214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4625F, 0.0F, 0.0F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.1561F, -0.8054F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(-3.3F, -1.7911F, -3.3495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 24).mirror().addBox(-2.3F, -0.7911F, -1.4495F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-1.1275F, 1.7039F, 0.2798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.8F, 2.6F, 0.2033F, -0.0829F, -0.0687F));

		PartDefinition cube_r48 = bone6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(-1.1275F, 0.0258F, -0.3416F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.8F, 2.6F, 0.5175F, -0.0829F, -0.0687F));

		PartDefinition cube_r49 = bone6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(96, 90).mirror().addBox(-0.5832F, -2.1869F, -0.3567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.1F, 2.7F, 0.5175F, -0.0829F, -0.2257F));

		PartDefinition cube_r50 = bone6.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-0.055F, -0.4669F, -0.1443F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6048F, 2.9576F, 1.2347F, -1.041F, 0.2184F, 0.0431F));

		PartDefinition cube_r51 = bone6.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(37, 52).mirror().addBox(-0.1379F, -1.0118F, -3.4914F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7124F, 3.4435F, 0.8443F, -0.8156F, 0.3926F, -0.1769F));

		PartDefinition cube_r52 = bone6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(38, 92).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0445F, 1.2729F, 1.869F, 0.0184F, 0.0916F, -0.5584F));

		PartDefinition cube_r53 = bone6.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-0.5F, -1.5F, -0.85F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1356F, 1.2236F, 1.248F, 0.6397F, 0.083F, -0.553F));

		PartDefinition cube_r54 = bone6.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(85, 29).mirror().addBox(-0.3341F, -0.3793F, -0.153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1274F, 1.029F, -1.4973F, 0.0F, 0.2328F, 0.0748F));

		PartDefinition cube_r55 = bone6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(98, 100).mirror().addBox(-0.3341F, -0.3749F, -0.13F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1274F, 1.029F, -1.4973F, 0.8029F, 0.2328F, 0.0748F));

		PartDefinition cube_r56 = bone6.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-0.2828F, -0.3466F, -1.9982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1274F, 1.029F, -1.4973F, 0.6124F, 0.5117F, 0.2684F));

		PartDefinition cube_r57 = bone6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(85, 65).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.0837F, 2.8226F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = bone6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2601F, 0.014F, 3.6612F, -0.4243F, 0.3203F, -0.1413F));

		PartDefinition cube_r59 = bone6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(15, 43).mirror().addBox(-5.3F, -1.7158F, -0.5907F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 24).mirror().addBox(-2.3F, -0.1262F, -0.0381F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, 2.7F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 60).mirror().addBox(0.0F, -0.2222F, -3.0757F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3F, -1.5927F, 0.0028F, -0.2537F, -0.6772F, 0.1883F));

		PartDefinition cube_r62 = bone6.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-1.3238F, -0.3732F, -2.5686F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4171F, -1.8641F, -2.7833F, -0.0945F, 0.2413F, -0.0961F));

		PartDefinition cube_r63 = bone6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-1.8178F, -0.5039F, -3.0955F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4171F, -1.8641F, -2.7833F, -0.0019F, 0.3349F, -0.0552F));

		PartDefinition cube_r64 = bone6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(47, 85).mirror().addBox(-2.5656F, -1.4512F, -4.1399F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4171F, -1.8641F, -2.7833F, 0.3213F, 0.0479F, -0.1455F));

		PartDefinition cube_r65 = bone6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9668F, -0.9982F, -6.0716F, -0.1532F, 0.2609F, -0.0246F));

		PartDefinition cube_r66 = bone6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(28, 89).mirror().addBox(-0.4144F, -1.4587F, -4.7139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4171F, -1.8641F, -2.7833F, 0.322F, 0.4763F, -0.0618F));

		PartDefinition cube_r67 = bone6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -1.2717F, -2.138F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r68 = bone6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(37, 48).mirror().addBox(-2.3F, -1.2296F, -1.9214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4625F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(57, 46).addBox(0.0F, 0.5487F, -0.1449F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, 0.9301F, -0.1776F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r69 = backleftleg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 65).addBox(-1.0F, -4.4F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.0807F, -0.2552F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r70 = backleftleg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.35F, -0.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 8.0807F, -0.2552F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r71 = backleftleg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(82, 8).addBox(1.25F, -6.5F, 4.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r72 = backleftleg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -1.475F, -0.925F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.7495F, 0.7285F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = backleftleg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 70).addBox(-0.5F, -1.425F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7495F, 0.7285F, -0.1833F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(48, 73).addBox(-0.5F, -0.4527F, -0.5304F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 9.9433F, 0.1485F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r74 = backleftleg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(71, 15).addBox(-0.4255F, -0.4538F, 0.075F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5F, -0.3027F, 0.5696F, -0.1484F, -0.003F, 0.0435F));

		PartDefinition cube_r75 = backleftleg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 58).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 1.8817F, 0.4906F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r76 = backleftleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 39).addBox(-1.0F, -0.5741F, -1.0633F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 0.6473F, 1.9696F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r77 = backleftleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(80, 61).addBox(-1.0F, -5.388F, 0.6143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r78 = backleftleg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(80, 83).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.9115F, 0.236F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r79 = backleftleg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(26, 85).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 5.9115F, 0.236F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r80 = backleftleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 51).addBox(-1.0F, -3.4F, -0.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0081F, 7.2086F, -0.3815F, -0.6534F, -0.0084F, -0.0044F));

		PartDefinition cube_r81 = backleftleg3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 76).addBox(0.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4763F, -2.0453F, 1.6474F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create().texOffs(38, 6).addBox(-1.5F, -0.3778F, -2.733F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5237F, 1.3722F, -0.0022F, 0.2182F, 0.0F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(57, 56).addBox(-2.0F, 0.5487F, -0.1449F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.5F, 0.9301F, -0.1776F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r82 = backrightleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(54, 66).addBox(-1.0F, -4.4F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.0807F, -0.2552F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r83 = backrightleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(73, 47).addBox(-1.5F, -0.35F, -0.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 8.0807F, -0.2552F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r84 = backrightleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(82, 43).addBox(-3.25F, -6.5F, 4.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 14.5487F, -1.9449F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r85 = backrightleg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(78, 34).addBox(-1.5F, -1.475F, -0.925F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.7495F, 0.7285F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r86 = backrightleg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(78, 29).addBox(-1.5F, -1.425F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7495F, 0.7285F, -0.1833F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(23, 76).addBox(-1.5F, -0.4527F, -0.5304F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 9.9433F, 0.1485F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r87 = backrightleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 66).addBox(-0.5745F, -0.4538F, 0.075F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.5F, -0.3027F, 0.5696F, -0.1484F, 0.003F, -0.0435F));

		PartDefinition cube_r88 = backrightleg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(18, 65).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 1.8817F, 0.4906F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r89 = backrightleg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(79, 75).addBox(-1.0F, -0.5741F, -1.0633F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 0.6473F, 1.9696F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r90 = backrightleg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(80, 79).addBox(-1.0F, -5.388F, 0.6143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8473F, 0.3696F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r91 = backrightleg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(19, 85).addBox(-1.0F, -0.9F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.9115F, 0.236F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r92 = backrightleg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(33, 85).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 5.9115F, 0.236F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r93 = backrightleg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -3.4F, -0.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.7918F, 0.7623F, 0.0349F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0081F, 7.2086F, -0.3815F, -0.2607F, 0.0084F, 0.0044F));

		PartDefinition cube_r94 = backrightleg3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(76, 66).addBox(-3.0F, 2.0783F, -1.7449F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4763F, -2.0453F, 1.6474F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create().texOffs(43, 41).addBox(-2.5F, -0.3778F, -2.733F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5237F, 1.3722F, -0.0022F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -5.1F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(44, 100).addBox(-0.5F, -2.2574F, 0.0022F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2047F, -4.0027F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(41, 100).addBox(-0.5F, -2.2671F, -0.008F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, -2.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(95, 109).addBox(-0.5F, -1.9574F, 0.0022F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -6.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(87, 95).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -3.7948F, 0.0148F, 0.2082F, 0.0425F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(61, 66).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -3.7948F, 0.1023F, 0.1823F, 0.4866F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(41, 111).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -3.7948F, 0.1809F, -0.0632F, 1.8243F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(35, 111).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -5.7948F, 0.1454F, -0.1432F, 1.915F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(54, 60).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -5.7948F, 0.1726F, 0.1292F, 0.5846F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 93).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0494F, -5.7948F, 0.1019F, 0.1899F, 0.1468F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(109, 76).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -1.8948F, 0.1582F, 0.1024F, 1.6107F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(38, 100).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.2494F, -1.8948F, -0.0674F, 0.1958F, 0.2415F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(87, 95).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -3.7948F, 0.0148F, -0.2082F, -0.0425F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(61, 66).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -3.7948F, 0.1023F, -0.1823F, -0.4866F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(41, 111).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -3.7948F, 0.1809F, 0.0632F, -1.8243F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(35, 111).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -5.7948F, 0.1454F, 0.1432F, -1.915F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(54, 60).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -5.7948F, 0.1726F, -0.1292F, -0.5846F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(50, 93).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0494F, -5.7948F, 0.1019F, -0.1899F, -0.1468F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(109, 76).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -1.8948F, 0.1582F, -0.1024F, -1.6107F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(38, 100).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.2494F, -1.8948F, -0.0674F, -0.1958F, -0.2415F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(17, 29).addBox(-1.0F, -0.0574F, 0.0022F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.4F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(92, 28).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.5506F, -3.7948F, 0.2909F, 0.1432F, 0.2478F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(96, 43).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.5506F, -3.7948F, 0.3232F, 0.0093F, 0.6646F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(38, 111).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.5506F, -3.7948F, 0.0622F, -0.3174F, 2.0036F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.0506F, -1.7948F, 0.2226F, 0.1611F, 0.2026F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 95).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.0506F, -1.7948F, 0.2689F, 0.0533F, 0.6281F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(111, 36).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.0506F, -1.7948F, 0.0936F, -0.2544F, 1.9599F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(92, 28).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.5506F, -3.7948F, 0.2909F, -0.1432F, -0.2478F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(96, 43).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.5506F, -3.7948F, 0.3232F, -0.0093F, -0.6646F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(38, 111).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.5506F, -3.7948F, 0.0622F, 0.3174F, -2.0036F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(35, 89).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.0506F, -1.7948F, 0.2226F, -0.1611F, -0.2026F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(74, 95).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.0506F, -1.7948F, 0.2689F, -0.0533F, -0.6281F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(111, 36).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.0506F, -1.7948F, 0.0936F, 0.2544F, -1.9599F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(109, 63).addBox(-0.5F, -1.9673F, -0.0418F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0487F, -1.9775F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(109, 59).addBox(-0.5F, -1.9673F, -0.0418F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 11).addBox(-1.0F, -0.0673F, -0.0418F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -3.9F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = body2.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8301F, -2.6892F, -2.2713F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition cube_r129 = leftPlate9.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(109, 18).addBox(-0.5F, 0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.8583F, 0.304F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r130 = leftPlate9.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(60, 108).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(50, 108).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.8583F, 0.304F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r131 = leftPlate9.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(55, 108).addBox(-0.5F, -0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(25, 96).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r132 = leftPlate9.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(15, 109).addBox(-0.5F, -0.45F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.7891F, -0.7143F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftPlate9.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(109, 56).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3895F, -0.739F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r134 = leftPlate9.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(45, 108).addBox(-0.5F, 1.1762F, -1.4523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, 0.0998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftPlate9.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(86, 104).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -1.3035F, 0.0292F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r136 = leftPlate9.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(55, 105).addBox(-0.5F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.0725F, -0.5251F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightPlate9 = body2.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8301F, -2.6892F, -2.2713F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition cube_r137 = rightPlate9.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(109, 18).mirror().addBox(-0.5F, 0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8583F, 0.304F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightPlate9.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(60, 108).mirror().addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(50, 108).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8583F, 0.304F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r139 = rightPlate9.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(55, 108).mirror().addBox(-0.5F, -0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(25, 96).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightPlate9.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 109).mirror().addBox(-0.5F, -0.45F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7891F, -0.7143F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r141 = rightPlate9.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(109, 56).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3895F, -0.739F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightPlate9.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(45, 108).mirror().addBox(-0.5F, 1.1762F, -1.4523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, 0.0998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightPlate9.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(86, 104).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3035F, 0.0292F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightPlate9.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 105).mirror().addBox(-0.5F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0725F, -0.5251F, -0.8727F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.8F, -3.8F, 0.0431F, -0.1727F, -0.0504F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(85, 110).addBox(-0.5F, -2.7F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 109).addBox(-0.5F, -2.4F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 52).addBox(-1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.3F, -7.4F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(101, 3).mirror().addBox(0.0F, -0.9268F, 0.0445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 3).addBox(3.0F, -0.9268F, 0.0445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 8.1863F, -1.3372F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(90, 95).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.0506F, -3.6948F, 0.4778F, 0.0939F, 0.2176F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(35, 97).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.0506F, -3.6948F, 0.4749F, -0.1087F, 0.6047F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(47, 111).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 1.0506F, -3.6948F, -0.0286F, -0.4904F, 1.9871F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(44, 111).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.3506F, -1.8948F, 0.0226F, -0.3964F, 2.0175F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.3506F, -1.8948F, 0.3919F, -0.0445F, 0.6634F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(94, 49).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.3506F, -1.8948F, 0.3761F, 0.1213F, 0.259F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8579F, 8.2434F, 1.298F, -0.1622F, -0.8005F, 0.4196F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(43, 46).mirror().addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7461F, 8.2828F, 1.0334F, -0.2381F, -1.0534F, 0.4518F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(58, 41).mirror().addBox(0.2116F, -0.3874F, -0.5018F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 8.6F, -0.525F, -1.6214F, -1.4378F, 2.1776F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(42, 60).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8829F, 8.1988F, 0.7865F, -0.439F, -1.3169F, 0.804F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(85, 33).mirror().addBox(0.0F, -1.0396F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(85, 33).addBox(3.0F, -1.0396F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.0F, 8.6F, -0.525F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(38, 11).mirror().addBox(0.0F, -0.9268F, -1.0555F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 11).addBox(3.0F, -0.9268F, -1.0555F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 6.6F, -4.9F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(90, 95).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.0506F, -3.6948F, 0.4778F, -0.0939F, -0.2176F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(35, 97).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.0506F, -3.6948F, 0.4749F, 0.1087F, -0.6047F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(47, 111).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 1.0506F, -3.6948F, -0.0286F, 0.4904F, -1.9871F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 111).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.3506F, -1.8948F, 0.0226F, 0.3964F, -2.0175F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 97).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.3506F, -1.8948F, 0.3919F, 0.0445F, -0.6634F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(94, 49).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.3506F, -1.8948F, 0.3761F, -0.1213F, -0.259F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8579F, 8.2434F, 1.298F, -0.1622F, 0.8005F, -0.4196F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(43, 46).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7461F, 8.2828F, 1.0334F, -0.2381F, 1.0534F, -0.4518F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(58, 41).addBox(-1.2116F, -0.3874F, -0.5018F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.6F, -0.525F, -1.6214F, 1.4378F, -2.1776F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(42, 60).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8829F, 8.1988F, 0.7865F, -0.439F, 1.3169F, -0.804F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0332F, 5.8569F, -3.092F, 0.4832F, -0.0552F, -0.1188F));

		PartDefinition cube_r169 = frontleftleg2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(92, 20).addBox(-1.0F, -0.425F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.4714F, 1.1796F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r170 = frontleftleg2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(75, 4).addBox(-1.0F, -2.65F, 0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 2.8275F, 0.2109F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r171 = frontleftleg2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(25, 69).addBox(-1.0F, -3.5F, -0.525F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0511F, 0.8763F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r172 = frontleftleg2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(5, 74).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4686F, 0.3952F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r173 = frontleftleg2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(19, 80).addBox(0.0F, -1.8842F, -0.572F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.7117F, -1.1817F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r174 = frontleftleg2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(63, 84).addBox(0.0F, 1.375F, 0.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -0.1009F, -0.4074F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r175 = frontleftleg2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(12, 80).addBox(0.0F, 0.2F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -0.1009F, -0.4074F, 0.1745F, 0.0F, 0.0F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1463F, 6.6482F, 1.1997F, -0.355F, 0.07F, 0.1047F));

		PartDefinition cube_r176 = frontleftleg3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(70, 75).addBox(-1.0F, -0.525F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.3351F, 0.8725F, -0.6494F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r177 = frontleftleg3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(60, 28).addBox(-1.0F, -0.4F, -0.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.3351F, 2.6441F, -0.3153F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r178 = frontleftleg3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(40, 65).addBox(-1.0F, -2.8F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3351F, 2.6441F, -0.3153F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r179 = frontleftleg3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(82, 0).addBox(0.4996F, -2.6815F, -0.2927F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 2.6428F, 0.4536F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r180 = frontleftleg3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(60, 38).addBox(0.4803F, -0.39F, -0.1521F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8049F, -0.4152F, 1.0647F, 1.8781F, 0.0204F, 0.0057F));

		PartDefinition cube_r181 = frontleftleg3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(16, 72).addBox(0.4803F, -0.79F, -0.952F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8049F, -0.4152F, 1.0647F, 1.4418F, 0.0204F, 0.0057F));

		PartDefinition cube_r182 = frontleftleg3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(73, 10).addBox(0.4803F, -0.49F, -2.0521F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8049F, -0.4152F, 1.0647F, 0.4382F, 0.0204F, 0.0057F));

		PartDefinition cube_r183 = frontleftleg3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(5, 83).addBox(-1.0F, -1.725F, -0.475F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.3408F, 1.0254F, 0.657F, -0.3035F, 0.0204F, 0.0057F));

		PartDefinition cube_r184 = frontleftleg3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(82, 47).addBox(-1.0F, -0.7F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3407F, 1.1317F, 0.6919F, -0.1464F, 0.0204F, 0.0057F));

		PartDefinition cube_r185 = frontleftleg3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(66, 79).addBox(0.5016F, -0.9239F, -0.4773F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8348F, 2.6428F, 0.4536F, 0.0022F, 0.0234F, 0.0063F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0928F, 4.7846F, -0.4947F, -0.2825F, 0.1606F, 0.0032F));

		PartDefinition cube_r186 = frontleftleg4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(80, 51).addBox(-0.2F, -1.0F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9078F, 1.0265F, 0.5463F, -0.2618F, -0.4363F, 0.0F));

		PartDefinition cube_r187 = frontleftleg4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(97, 16).addBox(-1.0F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.082F, 1.0265F, 0.5463F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r188 = frontleftleg4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 87).addBox(-0.8F, -1.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3179F, 1.6268F, -1.1068F, -1.0401F, 0.422F, 0.2359F));

		PartDefinition cube_r189 = frontleftleg4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(59, 92).addBox(-1.0F, 0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4179F, 1.0265F, 0.0463F, -1.0893F, -0.0774F, -0.0404F));

		PartDefinition cube_r190 = frontleftleg4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(40, 84).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4179F, 1.0265F, -0.4537F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0332F, 5.8569F, -3.092F, -0.6076F, 0.0552F, 0.1188F));

		PartDefinition cube_r191 = frontrightleg2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(92, 36).addBox(-1.0F, -0.425F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.4714F, 1.1796F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r192 = frontrightleg2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(76, 14).addBox(-1.0F, -2.65F, 0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 2.8275F, 0.2109F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r193 = frontrightleg2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(32, 69).addBox(-1.0F, -3.5F, -0.525F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0511F, 0.8763F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r194 = frontrightleg2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(14, 76).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4686F, 0.3952F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r195 = frontrightleg2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(26, 80).addBox(-1.0F, -1.8842F, -0.572F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.7117F, -1.1817F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r196 = frontrightleg2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(70, 84).addBox(-1.0F, 1.375F, 0.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.1009F, -0.4074F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r197 = frontrightleg2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(80, 24).addBox(-1.0F, 0.2F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -0.1009F, -0.4074F, 0.1745F, 0.0F, 0.0F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1463F, 6.6482F, 1.1997F, -0.0932F, -0.07F, -0.1047F));

		PartDefinition cube_r198 = frontrightleg3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(76, 20).addBox(-1.0F, -0.525F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3351F, 0.8725F, -0.6494F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r199 = frontrightleg3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(60, 33).addBox(-1.0F, -0.4F, -0.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3351F, 2.6441F, -0.3153F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r200 = frontrightleg3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(47, 65).addBox(-1.0F, -2.8F, -0.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3351F, 2.6441F, -0.3153F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r201 = frontrightleg3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(82, 4).addBox(-2.4996F, -2.6815F, -0.2927F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 2.6428F, 0.4536F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r202 = frontrightleg3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(62, 21).addBox(-2.4803F, -0.39F, -0.1521F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8049F, -0.4152F, 1.0647F, 1.8781F, -0.0204F, -0.0057F));

		PartDefinition cube_r203 = frontrightleg3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(39, 72).addBox(-2.4803F, -0.79F, -0.952F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8049F, -0.4152F, 1.0647F, 1.4418F, -0.0204F, -0.0057F));

		PartDefinition cube_r204 = frontrightleg3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(73, 43).addBox(-2.4803F, -0.49F, -2.0521F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8049F, -0.4152F, 1.0647F, 0.4382F, -0.0204F, -0.0057F));

		PartDefinition cube_r205 = frontrightleg3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(83, 16).addBox(-1.0F, -1.725F, -0.475F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.3408F, 1.0254F, 0.657F, -0.3035F, -0.0204F, -0.0057F));

		PartDefinition cube_r206 = frontrightleg3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(83, 12).addBox(-1.0F, -0.7F, -0.55F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3407F, 1.1317F, 0.6919F, -0.1464F, -0.0204F, -0.0057F));

		PartDefinition cube_r207 = frontrightleg3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(73, 79).addBox(-2.5016F, -0.9239F, -0.4773F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8348F, 2.6428F, 0.4536F, 0.0022F, -0.0234F, -0.0063F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0928F, 4.7846F, -0.4947F, 0.6338F, -0.1606F, -0.0032F));

		PartDefinition cube_r208 = frontrightleg4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(80, 56).addBox(-0.8F, -1.0F, -1.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9078F, 1.0265F, 0.5463F, -0.2618F, 0.4363F, 0.0F));

		PartDefinition cube_r209 = frontrightleg4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(97, 52).addBox(0.0F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.082F, 1.0265F, 0.5463F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r210 = frontrightleg4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(7, 89).addBox(-1.2F, -1.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3179F, 1.6268F, -1.1068F, -1.0401F, -0.422F, -0.2359F));

		PartDefinition cube_r211 = frontrightleg4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(92, 63).addBox(-1.0F, 0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4179F, 1.0265F, 0.0463F, -1.0893F, 0.0774F, 0.0404F));

		PartDefinition cube_r212 = frontrightleg4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(12, 85).addBox(-1.0F, -1.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4179F, 1.0265F, -0.4537F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftPlate5 = chest.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0454F, -2.3691F, -1.5753F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition cube_r213 = leftPlate5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(20, 109).addBox(-0.5F, 0.225F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.8583F, 0.304F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftPlate5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(96, 39).addBox(-0.5F, -0.2751F, -0.7383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -1.3583F, 0.604F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftPlate5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(70, 108).addBox(-0.5F, -0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(30, 96).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftPlate5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(82, 91).addBox(-0.5F, -0.35F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.7891F, -0.7143F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftPlate5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(75, 91).addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1549F, -0.3895F, -0.739F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftPlate5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 108).addBox(-0.5F, 1.0012F, -1.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, 0.0998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftPlate5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(101, 0).addBox(-0.5F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -1.3034F, 0.0292F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftPlate5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(60, 105).addBox(-0.5F, -0.525F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.0725F, -0.5251F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightPlate5 = chest.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0454F, -2.3691F, -1.5753F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition cube_r221 = rightPlate5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(20, 109).mirror().addBox(-0.5F, 0.225F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.8583F, 0.304F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightPlate5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(96, 39).mirror().addBox(-0.5F, -0.2751F, -0.7383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3583F, 0.604F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightPlate5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(70, 108).mirror().addBox(-0.5F, -0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(30, 96).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightPlate5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(82, 91).mirror().addBox(-0.5F, -0.35F, -0.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7891F, -0.7143F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightPlate5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(75, 91).mirror().addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3895F, -0.739F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r226 = rightPlate5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(65, 108).mirror().addBox(-0.5F, 1.0012F, -1.2523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, 0.0998F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r227 = rightPlate5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-0.5F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3034F, 0.0292F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r228 = rightPlate5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(60, 105).mirror().addBox(-0.5F, -0.525F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0725F, -0.5251F, -0.7418F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 2.6449F, -6.2018F));

		PartDefinition cube_r229 = bone2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(48, 52).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0829F, 2.7451F, 2.3632F, 1.268F, 0.3734F, 0.3951F));

		PartDefinition cube_r230 = bone2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(51, 80).addBox(-0.5F, -0.725F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1428F, 0.0705F, 2.2325F, 0.9451F, 0.3734F, 0.3951F));

		PartDefinition cube_r231 = bone2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(62, 15).addBox(-0.5F, -0.144F, 0.5853F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0829F, 2.7451F, 2.3632F, 1.4251F, 0.3734F, 0.3951F));

		PartDefinition cube_r232 = bone2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, 0.1583F, -3.0814F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5F, -2.5962F, 4.5712F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r233 = bone2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(31, 63).addBox(-0.5F, -0.0621F, -2.9853F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -3.1089F, 5.3291F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r234 = bone2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -1.4621F, 0.2147F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, -1.7964F, 5.8559F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-1.5F, 2.6449F, -6.2018F));

		PartDefinition cube_r235 = bone5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(48, 52).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0829F, 2.7451F, 2.3632F, 1.268F, -0.3734F, -0.3951F));

		PartDefinition cube_r236 = bone5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.5F, -0.725F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.1428F, 0.0705F, 2.2325F, 0.9451F, -0.3734F, -0.3951F));

		PartDefinition cube_r237 = bone5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-0.5F, -0.144F, 0.5853F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0829F, 2.7451F, 2.3632F, 1.4251F, -0.3734F, -0.3951F));

		PartDefinition cube_r238 = bone5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5F, 0.1583F, -3.0814F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -2.5962F, 4.5712F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r239 = bone5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(31, 63).mirror().addBox(-0.5F, -0.0621F, -2.9853F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -3.1089F, 5.3291F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r240 = bone5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5F, -1.4621F, 0.2147F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.7964F, 5.8559F, 0.5236F, 0.0F, 0.0F));

		PartDefinition parascapularSpine = chest.addOrReplaceChild("parascapularSpine", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9711F, 1.3023F, -0.7851F, -0.6744F, 0.5565F, -1.3133F));

		PartDefinition cube_r241 = parascapularSpine.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 31).addBox(-3.95F, -0.5F, -3.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5049F, -0.9637F, 2.7254F, 1.9337F, -0.9483F, -0.8557F));

		PartDefinition cube_r242 = parascapularSpine.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 6).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.7097F, 4.3685F, 1.0867F, 2.5185F, -0.3651F, -1.7381F));

		PartDefinition cube_r243 = parascapularSpine.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(9, 64).addBox(-0.7222F, -0.5394F, -2.1017F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.3F, 3.0F, 2.5259F, -0.3366F, -1.7596F));

		PartDefinition cube_r244 = parascapularSpine.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(26, 48).addBox(-1.9472F, -0.5394F, -1.9267F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.3F, 3.0F, 2.5628F, -0.0834F, -1.9348F));

		PartDefinition cube_r245 = parascapularSpine.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(32, 19).addBox(-0.8839F, -0.0224F, -1.7519F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7F, 2.3F, 4.3F, 2.5604F, -0.1199F, -1.9108F));

		PartDefinition cube_r246 = parascapularSpine.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(53, 0).addBox(-0.075F, -0.5F, -2.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(7.0141F, 1.2511F, 9.0835F, 2.4911F, 0.4506F, -2.3092F));

		PartDefinition cube_r247 = parascapularSpine.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(91, 86).addBox(-0.875F, -0.5F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.095F, 1.5822F, 7.585F, 2.5219F, 0.3522F, -2.2305F));

		PartDefinition cube_r248 = parascapularSpine.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(90, 16).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.095F, 1.5822F, 7.585F, 2.5618F, 0.0994F, -2.0541F));

		PartDefinition cube_r249 = parascapularSpine.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(89, 41).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.7855F, 3.2386F, 6.115F, 2.5553F, 0.1722F, -2.1025F));

		PartDefinition cube_r250 = parascapularSpine.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(83, 70).addBox(-1.4339F, -0.0224F, -1.7519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.7F, 2.3F, 4.3F, 2.5638F, 0.0628F, -2.0301F));

		PartDefinition cube_r251 = parascapularSpine.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(47, 18).addBox(-1.1575F, -0.2072F, -1.252F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, 2.0F, -2.2F, 2.3535F, -0.6938F, -1.4178F));

		PartDefinition cube_r252 = parascapularSpine.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(19, 93).addBox(-1.0F, -0.1256F, -3.5263F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, 0.0F, -1.1F, 1.3931F, -0.9838F, -0.206F));

		PartDefinition cube_r253 = parascapularSpine.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(47, 31).addBox(-4.9492F, -1.1273F, -2.285F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.9F, 1.3F, 2.4172F, -0.6048F, -1.5231F));

		PartDefinition cube_r254 = parascapularSpine.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(53, 6).addBox(-3.5492F, -1.1273F, -2.11F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -0.9F, 1.3F, 2.5124F, -0.3863F, -1.7216F));

		PartDefinition parascapularSpine2 = chest.addOrReplaceChild("parascapularSpine2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9711F, 1.3023F, -0.7851F, -0.6744F, -0.5565F, 1.3133F));

		PartDefinition cube_r255 = parascapularSpine2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(32, 35).addBox(-0.05F, -0.5F, -3.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5049F, -0.9637F, 2.7254F, 1.9337F, 0.9483F, 0.8557F));

		PartDefinition cube_r256 = parascapularSpine2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(61, 72).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.7097F, 4.3685F, 1.0867F, 2.5185F, 0.3651F, 1.7381F));

		PartDefinition cube_r257 = parascapularSpine2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(64, 46).addBox(-0.2778F, -0.5394F, -2.1017F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, 2.3F, 3.0F, 2.5259F, 0.3366F, 1.7596F));

		PartDefinition cube_r258 = parascapularSpine2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(49, 35).addBox(0.9472F, -0.5394F, -1.9267F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1F, 2.3F, 3.0F, 2.5628F, 0.0834F, 1.9348F));

		PartDefinition cube_r259 = parascapularSpine2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(32, 27).addBox(-0.1161F, -0.0224F, -1.7519F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.7F, 2.3F, 4.3F, 2.5604F, 0.1199F, 1.9108F));

		PartDefinition cube_r260 = parascapularSpine2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(20, 54).addBox(-0.925F, -0.5F, -2.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-7.0141F, 1.2511F, 9.0835F, 2.4911F, -0.4506F, 2.3092F));

		PartDefinition cube_r261 = parascapularSpine2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(89, 91).addBox(-0.125F, -0.5F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-6.095F, 1.5822F, 7.585F, 2.5219F, -0.3522F, 2.2305F));

		PartDefinition cube_r262 = parascapularSpine2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(90, 69).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.095F, 1.5822F, 7.585F, 2.5618F, -0.0994F, 2.0541F));

		PartDefinition cube_r263 = parascapularSpine2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(47, 89).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.7855F, 3.2386F, 6.115F, 2.5553F, -0.1722F, 2.1025F));

		PartDefinition cube_r264 = parascapularSpine2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(85, 20).addBox(0.4339F, -0.0224F, -1.7519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-4.7F, 2.3F, 4.3F, 2.5638F, -0.0628F, 2.0301F));

		PartDefinition cube_r265 = parascapularSpine2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(47, 21).addBox(-4.8425F, -0.2072F, -1.252F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.3F, 2.0F, -2.2F, 2.3535F, 0.6938F, 1.4178F));

		PartDefinition cube_r266 = parascapularSpine2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(43, 93).addBox(-1.0F, -0.1256F, -3.5263F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 0.0F, -1.1F, 1.3931F, 0.9838F, 0.206F));

		PartDefinition cube_r267 = parascapularSpine2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(13, 48).addBox(0.9492F, -1.1273F, -2.285F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.9F, 1.3F, 2.4172F, 0.6048F, 1.5231F));

		PartDefinition cube_r268 = parascapularSpine2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(58, 24).addBox(-0.4508F, -1.1273F, -2.11F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, -0.9F, 1.3F, 2.5124F, 0.3863F, 1.7216F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -3.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r269 = neck4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(110, 24).addBox(-0.5F, -1.105F, -0.9697F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r270 = neck4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(97, 12).mirror().addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -1.9F, -0.3777F, -0.5346F, 0.1995F));

		PartDefinition cube_r271 = neck4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(97, 12).addBox(0.0F, -0.6402F, -0.0161F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -1.9F, -0.3777F, 0.5346F, -0.1995F));

		PartDefinition cube_r272 = neck4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(21, 89).addBox(-1.0F, -1.1F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck4.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8445F, -2.9389F, -0.2526F, 0.2517F, 0.0762F, 0.2206F));

		PartDefinition cube_r273 = leftPlate3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(77, 95).addBox(-0.5F, -1.6929F, -0.4104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftPlate3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(14, 89).addBox(-0.5F, 0.05F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftPlate3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(94, 78).addBox(-0.5F, -0.6F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.6301F, -1.0096F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftPlate3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(94, 56).addBox(-0.5F, -1.15F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -0.1713F, -0.5664F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftPlate3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(94, 23).addBox(-0.5F, -1.6F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -0.7666F, -0.2573F, -0.8116F, 0.0F, 0.0F));

		PartDefinition rightPlate3 = neck4.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8445F, -2.9389F, -0.2526F, 0.2517F, -0.0762F, -0.2206F));

		PartDefinition cube_r278 = rightPlate3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(77, 95).mirror().addBox(-0.5F, -1.6929F, -0.4104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightPlate3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(14, 89).mirror().addBox(-0.5F, 0.05F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightPlate3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(94, 78).mirror().addBox(-0.5F, -0.6F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.6301F, -1.0096F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightPlate3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(-0.5F, -1.15F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.1713F, -0.5664F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightPlate3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(94, 23).mirror().addBox(-0.5F, -1.6F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7666F, -0.2573F, -0.8116F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1504F, -1.8065F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(57, 73).addBox(-0.5F, -1.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 12).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.4F, -3.0F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(88, 111).mirror().addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, -2.0F, -0.684F, -0.2613F, 0.0837F));

		PartDefinition cube_r285 = neck3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(88, 111).addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, -2.0F, -0.684F, 0.2613F, -0.0837F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4577F, -1.9099F, -0.1463F, -0.3024F, 0.0439F));

		PartDefinition cube_r286 = neck2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(59, 111).addBox(-0.5F, -0.4F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 38).addBox(-1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8F, -4.1F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r287 = neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(91, 111).mirror().addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6F, -1.8F, -0.684F, -0.2613F, 0.0837F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(91, 111).addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -1.8F, -0.684F, 0.2613F, -0.0837F));

		PartDefinition leftPlate4 = neck2.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2768F, -1.7871F, 0.5102F, -0.3417F, 0.0762F, 0.2206F));

		PartDefinition cube_r289 = leftPlate4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(25, 109).addBox(-0.5F, -1.0286F, -0.0311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(30, 109).addBox(-0.5F, -1.4286F, -0.2311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r290 = leftPlate4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(51, 77).addBox(-0.5F, -1.0286F, -0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1549F, 0.3008F, 0.2509F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftPlate4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(64, 95).addBox(-0.5F, -2.073F, -0.2816F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.2008F, -0.8491F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftPlate4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(109, 33).addBox(-0.5F, -1.2333F, -0.5466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.0056F, -0.0002F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftPlate4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(104, 58).addBox(-0.5F, -0.6907F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 21).addBox(-0.5F, -1.2907F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.4056F, 0.1998F, 0.4276F, 0.0F, 0.0F));

		PartDefinition rightPlate4 = neck2.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2768F, -1.7871F, 0.5102F, -0.3417F, -0.0762F, -0.2206F));

		PartDefinition cube_r294 = rightPlate4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(25, 109).mirror().addBox(-0.5F, -1.0286F, -0.0311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(30, 109).mirror().addBox(-0.5F, -1.4286F, -0.2311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r295 = rightPlate4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(51, 77).mirror().addBox(-0.5F, -1.0286F, -0.3311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.3008F, 0.2509F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r296 = rightPlate4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(64, 95).mirror().addBox(-0.5F, -2.073F, -0.2816F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2008F, -0.8491F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightPlate4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(109, 33).mirror().addBox(-0.5F, -1.2333F, -0.5466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0056F, -0.0002F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightPlate4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(104, 58).mirror().addBox(-0.5F, -0.6907F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 21).mirror().addBox(-0.5F, -1.2907F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4056F, 0.1998F, 0.4276F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -2.4F, -0.5444F, -0.2635F, 0.1564F));

		PartDefinition cube_r299 = neck.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(62, 111).addBox(0.0F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 37).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r300 = neck.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(111, 107).mirror().addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.1F, -0.5531F, -0.2613F, 0.0837F));

		PartDefinition cube_r301 = neck.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(111, 107).addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.1F, -0.5531F, 0.2613F, -0.0837F));

		PartDefinition neck5 = neck.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.875F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r302 = neck5.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(111, 85).addBox(0.0F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 74).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r303 = neck5.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.1F, -0.5531F, -0.2613F, 0.0837F));

		PartDefinition cube_r304 = neck5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 112).addBox(0.0F, -0.6402F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.1F, -0.5531F, 0.2613F, -0.0837F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0554F, -1.4455F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r305 = head.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(10, 103).addBox(-0.5588F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0588F, 0.9047F, -4.3341F, 0.9238F, 0.0F, 0.0F));

		PartDefinition cube_r306 = head.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(5, 103).addBox(-0.5588F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0588F, 0.4191F, -3.8299F, 0.7668F, 0.0F, 0.0F));

		PartDefinition cube_r307 = head.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(66, 102).addBox(-0.5588F, -0.125F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0588F, -0.0334F, -3.3284F, 0.697F, 0.0F, 0.0F));

		PartDefinition cube_r308 = head.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(87, 55).addBox(-0.5588F, -0.1F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0588F, -1.0182F, -2.0294F, 0.6533F, 0.0F, 0.0F));

		PartDefinition cube_r309 = head.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(26, 93).addBox(-1.0588F, -0.275F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0588F, -1.3343F, -0.9141F, -0.3502F, 0.0F, 0.0F));

		PartDefinition cube_r310 = head.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(92, 66).addBox(-1.0588F, -0.1F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(66, 92).addBox(-1.0588F, -0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0588F, -1.1129F, -1.9143F, 0.3741F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.1637F, -0.6406F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(97, 49).addBox(-0.5476F, -0.4111F, -0.667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.3287F, 2.1202F, -3.6552F, 0.4877F, 0.1857F, 0.0595F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(38, 97).addBox(-0.5476F, -0.4111F, -0.167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.3287F, 2.1202F, -3.6552F, 0.5925F, 0.1857F, 0.0595F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(71, 61).addBox(-0.875F, -0.125F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.375F, -0.9107F, -1.2743F, 0.7F, 0.1505F, 0.1196F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(12, 93).addBox(-1.425F, -0.425F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 93).addBox(-1.425F, -0.425F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.575F, -1.0576F, -0.5509F, 0.3728F, 0.0319F, -0.0813F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(104, 79).addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4821F, -0.8473F, 0.5291F, -0.4158F, -0.2134F, -0.0842F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(104, 76).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(104, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6299F, -1.0516F, -0.2301F, -0.2413F, -0.2134F, -0.0842F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(32, 76).addBox(-1.7F, -0.3F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8382F, -1.0073F, -1.0548F, 0.6412F, 0.3554F, 0.1637F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(54, 87).addBox(-0.839F, 0.4308F, -0.2443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0062F, 1.1975F, -3.6398F, 0.6977F, 0.149F, 0.1546F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(87, 51).addBox(-0.7047F, -0.5727F, -1.6985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3812F, 0.8975F, -0.8648F, 0.3221F, 0.1908F, 0.1705F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(61, 102).addBox(-0.8528F, -0.264F, -0.1464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0062F, 1.1975F, -3.6398F, 0.7058F, 0.0725F, 0.1366F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(71, 56).addBox(-0.8528F, -0.264F, -0.1964F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0491F, 1.007F, -3.412F, 0.7009F, 0.131F, 0.0944F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(87, 24).addBox(-0.5F, -0.5092F, -0.4004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2426F, 1.9439F, -3.4782F, 0.6113F, 0.0899F, -0.01F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(56, 102).addBox(-0.4178F, -0.5257F, -0.6421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.3287F, 2.1202F, -3.6552F, 0.36F, 0.1155F, 0.1051F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(102, 52).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)), PartPose.offsetAndRotation(-0.2426F, 1.9439F, -3.4782F, 0.703F, 0.0899F, -0.01F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(15, 103).addBox(-0.5F, -0.525F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.2556F, 1.8526F, -3.8826F, 1.7926F, 0.0182F, 0.0861F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(102, 49).addBox(-0.5F, -0.525F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.251F, 1.8064F, -3.8515F, 1.4436F, 0.0182F, 0.0861F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(102, 15).addBox(-0.7602F, -0.6394F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0898F, 1.2155F, -3.5793F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(102, 12).addBox(-0.7602F, -0.898F, -0.4306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.0898F, 1.2155F, -3.5793F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -0.525F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.35F, 1.7065F, -3.9529F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(101, 89).addBox(-0.7602F, -0.8529F, -1.0704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-0.0898F, 1.2155F, -3.6543F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(98, 75).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.35F, 1.992F, -3.9561F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(87, 101).addBox(-0.5713F, -0.7805F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.2787F, 2.1202F, -3.6552F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(101, 38).addBox(-0.7899F, -0.2141F, -0.7472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0122F, 1.1444F, -3.6994F, 0.8962F, 0.0188F, 0.0582F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(18, 100).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3586F, -0.7828F, -0.1158F, 0.671F, 0.0F, 0.0F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(82, 99).addBox(-0.5F, -0.325F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(99, 78).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3586F, -0.6113F, 0.5351F, 0.9328F, 0.0F, 0.0F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(77, 99).addBox(-0.65F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.5086F, -0.0003F, 0.9897F, 1.8055F, 0.0F, 0.0F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(93, 99).addBox(-0.65F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5086F, 0.5558F, 0.3487F, 3.0708F, 0.0F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(28, 100).addBox(-0.65F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6586F, 0.3514F, 1.1802F, 2.7218F, 0.0F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(84, 87).addBox(-0.65F, -0.65F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.6586F, 0.3514F, 1.1802F, 2.5472F, 0.0F, 0.0F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(100, 25).addBox(-0.65F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6086F, -0.0003F, 0.9897F, 2.0673F, 0.0F, 0.0F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(99, 46).addBox(-0.65F, -0.725F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4586F, 0.3203F, -0.1782F, -2.0779F, 0.0F, 0.0F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(25, 65).addBox(-0.5F, -0.8828F, -0.5269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1836F, 0.0047F, -0.6413F, -1.5543F, 0.1745F, 0.0873F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(99, 19).addBox(-0.4769F, -0.3282F, -0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2292F, -0.3845F, -0.8724F, -2.6034F, 0.1528F, 0.087F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(3, 100).addBox(-0.4813F, -0.1342F, -0.6631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5114F, -0.3742F, 0.2888F, -2.337F, -0.0168F, -0.0057F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(63, 99).addBox(-0.5305F, -0.3389F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(99, 58).addBox(-0.5305F, -0.4889F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.5114F, -0.3742F, 0.2888F, -2.7297F, -0.0168F, -0.0057F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(99, 61).addBox(-0.5305F, -0.4721F, -0.3648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 99).addBox(-0.5305F, -0.2971F, -0.3648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.5114F, -0.3742F, 0.2888F, -3.0526F, -0.0168F, -0.0057F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(98, 72).addBox(-0.4981F, -0.5195F, -0.6493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1654F, 0.4907F, -1.7748F, -2.9669F, 0.1389F, 0.1732F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(97, 69).addBox(-0.4981F, -0.5195F, -0.3493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)), PartPose.offsetAndRotation(0.1654F, 0.4907F, -1.7748F, -2.7923F, 0.1389F, 0.1732F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(53, 97).addBox(-0.4981F, -0.4754F, -0.6105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(0.1654F, 0.4907F, -1.7748F, -3.0541F, 0.1389F, 0.1732F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(99, 43).addBox(-0.4981F, -0.4598F, -0.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1654F, 0.4907F, -1.7748F, -2.7051F, 0.1389F, 0.1732F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(13, 100).addBox(-0.4826F, -0.8603F, -0.4989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5114F, -0.3742F, 0.2888F, -2.4851F, -0.0154F, -0.0084F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(8, 100).addBox(-0.4826F, -0.8173F, -0.2473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.5114F, -0.3742F, 0.2888F, -1.9615F, -0.0154F, -0.0084F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(99, 55).addBox(-0.55F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(99, 55).addBox(-0.55F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1441F, -0.9966F, 0.0438F, -1.9217F, 0.0F, 0.0F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(99, 55).addBox(-0.5305F, -0.5546F, -0.344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.5114F, -0.3742F, 0.2888F, -2.18F, -0.0168F, -0.0057F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(98, 97).addBox(-0.5269F, -0.6757F, -0.4418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2292F, -0.3845F, -0.8724F, -1.5999F, 0.1528F, 0.087F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(23, 100).addBox(-0.3019F, -0.5056F, -0.4274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(99, 64).addBox(-0.4019F, -0.5056F, -0.4274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2292F, -0.3845F, -0.8724F, -1.1199F, 0.1528F, 0.087F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(98, 94).addBox(-0.5269F, -0.5056F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2292F, -0.3845F, -0.8724F, -1.2508F, 0.1528F, 0.087F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(98, 86).addBox(-0.5269F, -0.2825F, -0.5032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.2292F, -0.3845F, -0.8724F, -0.7708F, 0.1528F, 0.087F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(99, 35).addBox(-0.5F, 0.0F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1836F, 0.0047F, -0.6413F, -0.5507F, 0.1745F, 0.0873F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(31, 54).addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.1836F, 0.0047F, -0.6413F, -0.5515F, 0.1505F, 0.0815F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(71, 51).addBox(-0.8309F, -0.807F, -2.7647F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3812F, 0.8975F, -0.8648F, 0.3003F, 0.1611F, 0.14F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(101, 9).addBox(-0.4957F, -0.6322F, -0.5206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)), PartPose.offsetAndRotation(-0.1836F, 1.5362F, -3.7357F, -0.6643F, 0.0414F, 0.0329F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(101, 6).addBox(-0.4951F, -0.3673F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)), PartPose.offsetAndRotation(-0.1836F, 1.5362F, -3.7357F, -0.3815F, 0.0658F, 0.0984F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.3858F, -0.0327F, 0.5157F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.1637F, -0.6406F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(97, 49).mirror().addBox(-0.4524F, -0.4111F, -0.667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.3287F, 2.1202F, -3.6552F, 0.4877F, -0.1857F, -0.0595F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(38, 97).mirror().addBox(-0.4524F, -0.4111F, -0.167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(0.3287F, 2.1202F, -3.6552F, 0.5925F, -0.1857F, -0.0595F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-0.125F, -0.125F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.375F, -0.9107F, -1.2743F, 0.7F, -0.1505F, -0.1196F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(12, 93).mirror().addBox(-0.575F, -0.425F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 93).mirror().addBox(-0.575F, -0.425F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.575F, -1.0576F, -0.5509F, 0.3728F, -0.0319F, 0.0813F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4821F, -0.8473F, 0.5291F, -0.4158F, 0.2134F, 0.0842F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(104, 76).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(104, 64).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6299F, -1.0516F, -0.2301F, -0.2413F, 0.2134F, 0.0842F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(32, 76).mirror().addBox(-0.3F, -0.3F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8382F, -1.0073F, -1.0548F, 0.6412F, -0.3554F, -0.1637F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(54, 87).mirror().addBox(-0.161F, 0.4308F, -0.2443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.0062F, 1.1975F, -3.6398F, 0.6977F, -0.149F, -0.1546F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(87, 51).mirror().addBox(-0.2953F, -0.5727F, -1.6985F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3812F, 0.8975F, -0.8648F, 0.3221F, -0.1908F, -0.1705F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(61, 102).mirror().addBox(-0.1472F, -0.264F, -0.1464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.0062F, 1.1975F, -3.6398F, 0.7058F, -0.0725F, -0.1366F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(71, 56).mirror().addBox(-0.1472F, -0.264F, -0.1964F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0491F, 1.007F, -3.412F, 0.7009F, -0.131F, -0.0944F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(87, 24).mirror().addBox(-0.5F, -0.5092F, -0.4004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.2426F, 1.9439F, -3.4782F, 0.6113F, -0.0899F, 0.01F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(56, 102).mirror().addBox(-0.5822F, -0.5257F, -0.6421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.3287F, 2.1202F, -3.6552F, 0.36F, -0.1155F, -0.1051F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(102, 52).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(0.2426F, 1.9439F, -3.4782F, 0.703F, -0.0899F, 0.01F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(15, 103).mirror().addBox(-0.5F, -0.525F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(0.2556F, 1.8526F, -3.8826F, 1.7926F, -0.0182F, -0.0861F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(102, 49).mirror().addBox(-0.5F, -0.525F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.251F, 1.8064F, -3.8515F, 1.4436F, -0.0182F, -0.0861F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(102, 15).mirror().addBox(-0.2398F, -0.6394F, -0.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0898F, 1.2155F, -3.5793F, 2.3649F, 0.0F, 0.0F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(102, 12).mirror().addBox(-0.2398F, -0.898F, -0.4306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.0898F, 1.2155F, -3.5793F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, -0.525F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.35F, 1.7065F, -3.9529F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(101, 89).mirror().addBox(-0.2398F, -0.8529F, -1.0704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(0.0898F, 1.2155F, -3.6543F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(98, 75).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.35F, 1.992F, -3.9561F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(87, 101).mirror().addBox(-0.4287F, -0.7805F, -0.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.2787F, 2.1202F, -3.6552F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(-0.2101F, -0.2141F, -0.7472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0122F, 1.1444F, -3.6994F, 0.8962F, -0.0188F, -0.0582F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(18, 100).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, -0.7828F, -0.1158F, 0.671F, 0.0F, 0.0F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(82, 99).mirror().addBox(-0.5F, -0.325F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(99, 78).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3586F, -0.6113F, 0.5351F, 0.9328F, 0.0F, 0.0F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(77, 99).mirror().addBox(-0.35F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, -0.0003F, 0.9897F, 1.8055F, 0.0F, 0.0F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(93, 99).mirror().addBox(-0.35F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.5086F, 0.5558F, 0.3487F, 3.0708F, 0.0F, 0.0F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(28, 100).mirror().addBox(-0.35F, -0.675F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6586F, 0.3514F, 1.1802F, 2.7218F, 0.0F, 0.0F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(84, 87).mirror().addBox(-0.35F, -0.65F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.6586F, 0.3514F, 1.1802F, 2.5472F, 0.0F, 0.0F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(100, 25).mirror().addBox(-0.35F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6086F, -0.0003F, 0.9897F, 2.0673F, 0.0F, 0.0F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(-0.35F, -0.725F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4586F, 0.3203F, -0.1782F, -2.0779F, 0.0F, 0.0F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(25, 65).mirror().addBox(-0.5F, -0.8828F, -0.5269F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1836F, 0.0047F, -0.6413F, -1.5543F, -0.1745F, -0.0873F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(99, 19).mirror().addBox(-0.5231F, -0.3282F, -0.7641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.2292F, -0.3845F, -0.8724F, -2.6034F, -0.1528F, -0.087F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(3, 100).mirror().addBox(-0.5187F, -0.1342F, -0.6631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5114F, -0.3742F, 0.2888F, -2.337F, 0.0168F, 0.0057F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(63, 99).mirror().addBox(-0.4695F, -0.3389F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(99, 58).mirror().addBox(-0.4695F, -0.4889F, -0.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.5114F, -0.3742F, 0.2888F, -2.7297F, 0.0168F, 0.0057F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(99, 61).mirror().addBox(-0.4695F, -0.4721F, -0.3648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 99).mirror().addBox(-0.4695F, -0.2971F, -0.3648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.5114F, -0.3742F, 0.2888F, -3.0526F, 0.0168F, 0.0057F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(98, 72).mirror().addBox(-0.5019F, -0.5195F, -0.6493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1654F, 0.4907F, -1.7748F, -2.9669F, -0.1389F, -0.1732F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(97, 69).mirror().addBox(-0.5019F, -0.5195F, -0.3493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false), PartPose.offsetAndRotation(-0.1654F, 0.4907F, -1.7748F, -2.7923F, -0.1389F, -0.1732F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(53, 97).mirror().addBox(-0.5019F, -0.4754F, -0.6105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F)).mirror(false), PartPose.offsetAndRotation(-0.1654F, 0.4907F, -1.7748F, -3.0541F, -0.1389F, -0.1732F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(-0.5019F, -0.4598F, -0.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1654F, 0.4907F, -1.7748F, -2.7051F, -0.1389F, -0.1732F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(13, 100).mirror().addBox(-0.5174F, -0.8603F, -0.4989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5114F, -0.3742F, 0.2888F, -2.4851F, 0.0154F, 0.0084F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(8, 100).mirror().addBox(-0.5174F, -0.8173F, -0.2473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.5114F, -0.3742F, 0.2888F, -1.9615F, 0.0154F, 0.0084F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(99, 55).mirror().addBox(-0.45F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(99, 55).mirror().addBox(-0.45F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1441F, -0.9966F, 0.0438F, -1.9217F, 0.0F, 0.0F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(99, 55).mirror().addBox(-0.4695F, -0.5546F, -0.344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.5114F, -0.3742F, 0.2888F, -2.18F, 0.0168F, 0.0057F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(98, 97).mirror().addBox(-0.4731F, -0.6757F, -0.4418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2292F, -0.3845F, -0.8724F, -1.5999F, -0.1528F, -0.087F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(23, 100).mirror().addBox(-0.6981F, -0.5056F, -0.4274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(99, 64).mirror().addBox(-0.5981F, -0.5056F, -0.4274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2292F, -0.3845F, -0.8724F, -1.1199F, -0.1528F, -0.087F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(-0.4731F, -0.5056F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.2292F, -0.3845F, -0.8724F, -1.2508F, -0.1528F, -0.087F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(-0.4731F, -0.2825F, -0.5032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.2292F, -0.3845F, -0.8724F, -0.7708F, -0.1528F, -0.087F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(99, 35).mirror().addBox(-0.5F, 0.0F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1836F, 0.0047F, -0.6413F, -0.5507F, -0.1745F, -0.0873F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(31, 54).mirror().addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.1836F, 0.0047F, -0.6413F, -0.5515F, -0.1505F, -0.0815F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-0.1691F, -0.807F, -2.7647F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3812F, 0.8975F, -0.8648F, 0.3003F, -0.1611F, -0.14F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(101, 9).mirror().addBox(-0.5044F, -0.6322F, -0.5206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false), PartPose.offsetAndRotation(0.1836F, 1.5362F, -3.7357F, -0.6643F, -0.0414F, -0.0329F));

		PartDefinition cube_r416 = rightFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(101, 6).mirror().addBox(-0.5049F, -0.3673F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false), PartPose.offsetAndRotation(0.1836F, 1.5362F, -3.7357F, -0.3815F, -0.0658F, -0.0984F));

		PartDefinition bone4 = rightFace.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.3858F, -0.0327F, 0.5157F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4772F, 0.7469F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(25, 103).mirror().addBox(-0.5F, -0.2F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(20, 103).mirror().addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false)
				.texOffs(92, 102).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8157F, 0.0243F, -1.8168F, 0.5059F, -0.0426F, 0.0094F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(61, 88).mirror().addBox(-0.2903F, -1.0792F, -1.926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.3003F, -0.2522F, -0.0611F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.2903F, -0.6895F, -1.806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.1257F, -0.2522F, -0.0611F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(97, 103).mirror().addBox(-0.2903F, -0.7268F, -1.5784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.1432F, -0.2522F, -0.0611F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(103, 95).mirror().addBox(-0.2903F, -0.7986F, -1.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.1999F, -0.2522F, -0.0611F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.3019F, -0.4982F, -1.7077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6153F, 0.8482F, -3.2543F, 0.3429F, -0.165F, -0.06F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(104, 18).mirror().addBox(-0.3019F, -1.9572F, -1.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(103, 101).mirror().addBox(-0.3019F, -1.5572F, -1.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.6153F, 0.8482F, -3.2543F, 1.1806F, -0.165F, -0.06F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(103, 98).mirror().addBox(-0.3019F, -0.9556F, -1.9858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.6153F, 0.8482F, -3.2543F, 0.6134F, -0.165F, -0.06F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-0.3019F, -0.7939F, -1.7247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(68, 88).mirror().addBox(-0.3019F, -0.6439F, -1.7247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6153F, 0.8482F, -3.2543F, 0.3865F, -0.165F, -0.06F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(103, 92).mirror().addBox(-0.2903F, -1.3599F, -1.822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(103, 84).mirror().addBox(-0.2903F, -1.3599F, -1.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.4617F, -0.2522F, -0.0611F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(103, 73).mirror().addBox(-0.2914F, -1.3075F, -1.0938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.3912F, -0.2514F, -0.0581F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(103, 70).mirror().addBox(-0.2914F, -1.3068F, -0.7215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.3825F, -0.2514F, -0.0581F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(81, 102).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8306F, -0.139F, -1.4776F, 0.4102F, -0.0436F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-0.5F, -0.5F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.8601F, 0.0799F, -0.8027F, -0.4363F, -0.0436F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(76, 102).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.8618F, 0.1294F, -0.7637F, -0.0698F, -0.0436F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(71, 102).mirror().addBox(-0.3F, -0.1452F, -0.9786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0868F, 0.1076F, -0.4974F, -0.0436F, 0.0F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(87, 78).mirror().addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.8442F, 0.3091F, -1.1653F, 0.1745F, -0.0436F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(103, 31).mirror().addBox(-0.2827F, -1.0846F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 103).mirror().addBox(-0.2827F, -0.6847F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0404F, 0.8482F, -1.6543F, 0.0405F, -0.253F, -0.0701F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(103, 28).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8404F, 0.8482F, -1.2543F, 0.0393F, -0.0436F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(77, 87).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-0.8502F, 0.6224F, -1.0275F, -0.1134F, -0.0436F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(102, 67).mirror().addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.8819F, 0.6715F, -0.3031F, 0.4189F, -0.0436F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-0.3F, -1.65F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0868F, 0.1076F, 1.3352F, -0.0436F, 0.0F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(87, 59).mirror().addBox(-0.3F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0868F, 0.1076F, 0.2269F, -0.0436F, 0.0F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(25, 103).addBox(-0.5F, -0.2F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(20, 103).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.307F))
				.texOffs(92, 102).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8157F, 0.0243F, -1.8168F, 0.5059F, 0.0426F, -0.0094F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(61, 88).addBox(-0.7097F, -1.0792F, -1.926F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.3003F, 0.2522F, 0.0611F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(40, 88).addBox(-0.7097F, -0.6895F, -1.806F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.1257F, 0.2522F, 0.0611F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(97, 103).addBox(-0.7097F, -0.7268F, -1.5784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.1432F, 0.2522F, 0.0611F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(103, 95).addBox(-0.7097F, -0.7986F, -1.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.1999F, 0.2522F, 0.0611F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(89, 0).addBox(-0.6981F, -0.4982F, -1.7077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6153F, 0.8482F, -3.2543F, 0.3429F, 0.165F, 0.06F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(104, 18).addBox(-0.6981F, -1.9572F, -1.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(103, 101).addBox(-0.6981F, -1.5572F, -1.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.6153F, 0.8482F, -3.2543F, 1.1806F, 0.165F, 0.06F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(103, 98).addBox(-0.6981F, -0.9556F, -1.9858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.6153F, 0.8482F, -3.2543F, 0.6134F, 0.165F, 0.06F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(89, 4).addBox(-0.6981F, -0.7939F, -1.7247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.33F))
				.texOffs(68, 88).addBox(-0.6981F, -0.6439F, -1.7247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6153F, 0.8482F, -3.2543F, 0.3865F, 0.165F, 0.06F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(103, 92).addBox(-0.7097F, -1.3599F, -1.822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(103, 84).addBox(-0.7097F, -1.3599F, -1.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.4617F, 0.2522F, 0.0611F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(103, 73).addBox(-0.7086F, -1.3075F, -1.0938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.3912F, 0.2514F, 0.0581F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(103, 70).addBox(-0.7086F, -1.3068F, -0.7215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.3825F, 0.2514F, 0.0581F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(81, 102).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8306F, -0.139F, -1.4776F, 0.4102F, 0.0436F, 0.0F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(87, 82).addBox(-0.5F, -0.5F, -1.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.8601F, 0.0799F, -0.8027F, -0.4363F, 0.0436F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(76, 102).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.8618F, 0.1294F, -0.7637F, -0.0698F, 0.0436F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(71, 102).addBox(-0.7F, -0.1452F, -0.9786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1F, 0.0868F, 0.1076F, -0.4974F, 0.0436F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(87, 78).addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.8442F, 0.3091F, -1.1653F, 0.1745F, 0.0436F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(103, 31).addBox(-0.7173F, -1.0846F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 103).addBox(-0.7173F, -0.6847F, -0.7094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0404F, 0.8482F, -1.6543F, 0.0405F, 0.253F, 0.0701F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(103, 28).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8404F, 0.8482F, -1.2543F, 0.0393F, 0.0436F, 0.0F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(77, 87).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(0.8502F, 0.6224F, -1.0275F, -0.1134F, 0.0436F, 0.0F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(102, 67).addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.8819F, 0.6715F, -0.3031F, 0.4189F, 0.0436F, 0.0F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(95, 27).addBox(-0.7F, -1.65F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.1F, 0.0868F, 0.1076F, 1.3352F, 0.0436F, 0.0F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(87, 59).addBox(-0.7F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.1F, 0.0868F, 0.1076F, 0.2269F, 0.0436F, 0.0F));

		PartDefinition leftPlate2 = neck5.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1814F, -1.1075F, 0.441F, -0.2457F, 0.0762F, 0.2206F));

		PartDefinition cube_r463 = leftPlate2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(104, 55).addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.2258F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r464 = leftPlate2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(104, 44).addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.0008F, -0.7241F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r465 = leftPlate2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(104, 41).addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.5056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = neck5.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1814F, -1.1075F, 0.441F, -0.2457F, -0.0762F, -0.2206F));

		PartDefinition cube_r466 = rightPlate2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(104, 55).mirror().addBox(-0.5F, -0.9286F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2258F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r467 = rightPlate2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(-0.5F, -0.6978F, -0.4791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.0008F, -0.7241F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r468 = rightPlate2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(104, 41).mirror().addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.5056F, 0.0998F, 0.7418F, 0.0F, 0.0F));

		PartDefinition leftPlate7 = neck.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1814F, -1.2075F, 0.441F, -0.1604F, 0.0568F, 0.2263F));

		PartDefinition cube_r469 = leftPlate7.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(59, 95).addBox(-0.5F, -1.9286F, -0.7811F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r470 = leftPlate7.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(95, 31).addBox(-0.5F, -1.6978F, -0.4791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, 0.2008F, -0.5491F, -0.0047F, -0.0403F, -0.0001F));

		PartDefinition cube_r471 = leftPlate7.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(104, 34).addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -1.3056F, -0.0002F, 0.8727F, 0.0F, 0.0F));

		PartDefinition rightPlate7 = neck.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1814F, -1.2075F, 0.441F, -0.1604F, -0.0568F, -0.2263F));

		PartDefinition cube_r472 = rightPlate7.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(59, 95).mirror().addBox(-0.5F, -1.9286F, -0.7811F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.4008F, 0.1509F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r473 = rightPlate7.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(95, 31).mirror().addBox(-0.5F, -1.6978F, -0.4791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.2008F, -0.5491F, -0.0047F, 0.0403F, 0.0001F));

		PartDefinition cube_r474 = rightPlate7.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(104, 34).mirror().addBox(-0.5F, -0.8157F, -0.8099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3056F, -0.0002F, 0.8727F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = body.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3138F, -3.226F, -0.4144F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r475 = leftPlate10.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(108, 99).addBox(-0.5F, -0.75F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.024F, 0.1493F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r476 = leftPlate10.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(5, 96).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.2602F, 0.351F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r477 = leftPlate10.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5F, -1.2F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.4945F, -0.2715F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r478 = leftPlate10.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(0, 109).addBox(-0.5F, -0.925F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 3).addBox(-0.5F, -1.0F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 106).addBox(-0.5F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1549F, -0.4156F, -0.8576F, -0.4181F, 0.0089F, 0.0018F));

		PartDefinition cube_r479 = leftPlate10.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(109, 43).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3895F, -0.739F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r480 = leftPlate10.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(69, 95).addBox(-0.5F, -1.8F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -1.5078F, -0.1919F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r481 = leftPlate10.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(35, 105).addBox(-0.5F, -1.031F, -0.1628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -0.9225F, -0.7501F, -0.9163F, 0.0F, 0.0F));

		PartDefinition rightPlate10 = body.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3138F, -3.226F, -0.4144F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r482 = rightPlate10.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(108, 99).mirror().addBox(-0.5F, -0.75F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.024F, 0.1493F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r483 = rightPlate10.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.5F, -1.75F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2602F, 0.351F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r484 = rightPlate10.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.5F, -1.2F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4945F, -0.2715F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightPlate10.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.5F, -0.925F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 3).mirror().addBox(-0.5F, -1.0F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 106).mirror().addBox(-0.5F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4156F, -0.8576F, -0.4181F, -0.0089F, -0.0018F));

		PartDefinition cube_r486 = rightPlate10.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(109, 43).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3895F, -0.739F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r487 = rightPlate10.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(69, 95).mirror().addBox(-0.5F, -1.8F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.5078F, -0.1919F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r488 = rightPlate10.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(35, 105).mirror().addBox(-0.5F, -1.031F, -0.1628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.9225F, -0.7501F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftPlate8 = body.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3889F, -3.1598F, -2.8144F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition cube_r489 = leftPlate8.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(109, 21).addBox(-0.5F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.024F, 0.1493F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r490 = leftPlate8.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(10, 109).addBox(-0.5F, -0.75F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.1549F, -0.024F, 0.1493F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r491 = leftPlate8.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(15, 96).addBox(-0.5F, -1.75F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -0.2601F, 0.351F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r492 = leftPlate8.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(91, 105).addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1549F, -1.8487F, 0.1678F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r493 = leftPlate8.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(10, 96).addBox(-0.5F, -0.975F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r494 = leftPlate8.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(5, 109).addBox(-0.5F, -0.35F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.7891F, -0.7143F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r495 = leftPlate8.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(109, 53).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1549F, -0.3895F, -0.739F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r496 = leftPlate8.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(102, 104).addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -1.5077F, -0.1919F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r497 = leftPlate8.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(50, 105).addBox(-0.5F, -0.831F, -0.2128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -0.9225F, -0.7501F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightPlate8 = body.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3889F, -3.1598F, -2.8144F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition cube_r498 = rightPlate8.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(109, 21).mirror().addBox(-0.5F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.024F, 0.1493F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r499 = rightPlate8.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(-0.5F, -0.75F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.024F, 0.1493F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r500 = rightPlate8.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(-0.5F, -1.75F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2601F, 0.351F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r501 = rightPlate8.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(91, 105).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8487F, 0.1678F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r502 = rightPlate8.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(10, 96).mirror().addBox(-0.5F, -0.975F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r503 = rightPlate8.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-0.5F, -0.35F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7891F, -0.7143F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r504 = rightPlate8.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(109, 53).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3895F, -0.739F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r505 = rightPlate8.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(102, 104).mirror().addBox(-0.5F, -0.575F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.5077F, -0.1919F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r506 = rightPlate8.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(50, 105).mirror().addBox(-0.5F, -0.831F, -0.2128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.9225F, -0.7501F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftPlate6 = body.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4052F, -2.7535F, -5.2133F, 0.3293F, -0.0355F, 0.1711F));

		PartDefinition cube_r507 = leftPlate6.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(108, 96).addBox(-0.5F, -0.6F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(108, 93).addBox(-0.5F, -0.6F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.024F, 0.1493F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r508 = leftPlate6.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(80, 105).addBox(-0.5F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2601F, 0.351F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r509 = leftPlate6.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(75, 105).addBox(-0.5F, -0.35F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, -1.0997F, 0.1847F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r510 = leftPlate6.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(96, 4).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r511 = leftPlate6.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(108, 90).addBox(-0.5F, -0.35F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.7891F, -0.7143F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r512 = leftPlate6.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(109, 40).addBox(-0.5F, -0.175F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.3895F, -0.739F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r513 = leftPlate6.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(104, 61).addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1549F, -1.3034F, 0.0292F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r514 = leftPlate6.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(105, 24).addBox(-0.5F, -0.575F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.0725F, -0.5251F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightPlate6 = body.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4052F, -2.7535F, -5.2133F, 0.3293F, 0.0355F, -0.1711F));

		PartDefinition cube_r515 = rightPlate6.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(108, 96).mirror().addBox(-0.5F, -0.6F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(108, 93).mirror().addBox(-0.5F, -0.6F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.024F, 0.1493F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r516 = rightPlate6.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(80, 105).mirror().addBox(-0.5F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2601F, 0.351F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r517 = rightPlate6.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(75, 105).mirror().addBox(-0.5F, -0.35F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0997F, 0.1847F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r518 = rightPlate6.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r519 = rightPlate6.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(108, 90).mirror().addBox(-0.5F, -0.35F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.7891F, -0.7143F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r520 = rightPlate6.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(109, 40).mirror().addBox(-0.5F, -0.175F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.3895F, -0.739F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r521 = rightPlate6.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-0.5F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.3034F, 0.0292F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r522 = rightPlate6.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(105, 24).mirror().addBox(-0.5F, -0.575F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.0725F, -0.5251F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.7F, -0.1072F, 0.217F, -0.0232F));

		PartDefinition cube_r523 = tail.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(53, 100).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(50, 100).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r525 = tail.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(104, 110).addBox(0.0F, 1.1055F, 1.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 110).addBox(0.0F, -0.1945F, -0.1045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r526 = tail.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(47, 100).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r527 = tail.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(15, 37).mirror().addBox(-2.1F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0F, 1.0F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r528 = tail.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(15, 37).addBox(0.1F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0F, 1.0F, 0.0F, -0.1222F, 0.0F));

		PartDefinition leftPlate14 = tail.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.677F, -2.7562F, 5.103F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition cube_r529 = leftPlate14.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(43, 96).addBox(-0.5F, -1.85F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.0383F, -0.3189F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r530 = leftPlate14.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(65, 105).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1629F, -1.0838F, -0.4144F, -0.1404F, -0.0077F, -0.0048F));

		PartDefinition cube_r531 = leftPlate14.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -0.875F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.1573F, -1.1674F, 0.2605F, 0.261F, -0.0077F, -0.0048F));

		PartDefinition cube_r532 = leftPlate14.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(75, 108).addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.16F, -1.8041F, -0.6316F, -0.7061F, 0.0089F, 0.0018F));

		PartDefinition cube_r533 = leftPlate14.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(108, 73).addBox(-0.5F, -0.7F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1556F, -0.4035F, -0.8432F, -0.4879F, 0.0089F, 0.0018F));

		PartDefinition cube_r534 = leftPlate14.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(108, 70).addBox(-0.5F, -0.7F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1556F, -0.4035F, -0.8432F, -0.1519F, 0.0089F, 0.0018F));

		PartDefinition rightPlate14 = tail.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.677F, -2.7562F, 5.103F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition cube_r535 = rightPlate14.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(-0.5F, -1.85F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.0383F, -0.3189F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r536 = rightPlate14.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(65, 105).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1629F, -1.0838F, -0.4144F, -0.1404F, 0.0077F, 0.0048F));

		PartDefinition cube_r537 = rightPlate14.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.5F, -0.875F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.1573F, -1.1674F, 0.2605F, 0.261F, 0.0077F, 0.0048F));

		PartDefinition cube_r538 = rightPlate14.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.16F, -1.8041F, -0.6316F, -0.7061F, -0.0089F, -0.0018F));

		PartDefinition cube_r539 = rightPlate14.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(108, 73).mirror().addBox(-0.5F, -0.7F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -0.4035F, -0.8432F, -0.4879F, -0.0089F, -0.0018F));

		PartDefinition cube_r540 = rightPlate14.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(108, 70).mirror().addBox(-0.5F, -0.7F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -0.4035F, -0.8432F, -0.1519F, -0.0089F, -0.0018F));

		PartDefinition rightPlate13 = tail.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8981F, -3.5753F, 1.3875F, -0.0709F, 0.0206F, -0.1736F));

		PartDefinition cube_r541 = rightPlate13.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(107, 67).mirror().addBox(-0.5F, -0.85F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, 0.0383F, -0.3189F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r542 = rightPlate13.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(107, 50).mirror().addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.4485F, -0.1919F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r543 = rightPlate13.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(45, 105).mirror().addBox(-0.5F, -1.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(82, 95).mirror().addBox(-0.5F, -1.075F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1572F, -1.1674F, 0.2605F, -0.1753F, 0.0077F, 0.0048F));

		PartDefinition cube_r544 = rightPlate13.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(10, 106).mirror().addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1636F, -2.3213F, -0.3275F, -0.7584F, -0.0089F, -0.0018F));

		PartDefinition cube_r545 = rightPlate13.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(106, 9).mirror().addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.16F, -1.8041F, -0.6316F, -0.5315F, -0.0089F, -0.0018F));

		PartDefinition cube_r546 = rightPlate13.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(107, 47).mirror().addBox(-0.5F, -0.7F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -0.4035F, -0.8432F, -0.4879F, -0.0089F, -0.0018F));

		PartDefinition cube_r547 = rightPlate13.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.5F, -1.7F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -0.4035F, -0.8432F, -0.1519F, -0.0089F, -0.0018F));

		PartDefinition leftPlate20 = tail.addOrReplaceChild("leftPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8981F, -3.5753F, 1.3875F, -0.0709F, -0.0206F, 0.1736F));

		PartDefinition cube_r548 = leftPlate20.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(107, 67).addBox(-0.5F, -0.85F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1549F, 0.0383F, -0.3189F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r549 = leftPlate20.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(107, 50).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.4485F, -0.1919F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r550 = leftPlate20.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(45, 105).addBox(-0.5F, -1.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(82, 95).addBox(-0.5F, -1.075F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1572F, -1.1674F, 0.2605F, -0.1753F, -0.0077F, -0.0048F));

		PartDefinition cube_r551 = leftPlate20.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(10, 106).addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1636F, -2.3213F, -0.3275F, -0.7584F, 0.0089F, 0.0018F));

		PartDefinition cube_r552 = leftPlate20.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(106, 9).addBox(-0.5F, -0.85F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.16F, -1.8041F, -0.6316F, -0.5315F, 0.0089F, 0.0018F));

		PartDefinition cube_r553 = leftPlate20.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(107, 47).addBox(-0.5F, -0.7F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1556F, -0.4035F, -0.8432F, -0.4879F, 0.0089F, 0.0018F));

		PartDefinition cube_r554 = leftPlate20.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(20, 96).addBox(-0.5F, -1.7F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1556F, -0.4035F, -0.8432F, -0.1519F, 0.0089F, 0.0018F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, -0.0894F, 0.2173F, -0.0193F));

		PartDefinition cube_r555 = tail2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(110, 110).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r556 = tail2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(107, 110).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r557 = tail2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(63, 80).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r558 = tail2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(56, 111).addBox(0.0F, 3.6055F, 7.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 111).addBox(0.0F, 2.6055F, 5.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 111).addBox(0.0F, 1.9055F, 3.8955F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5174F, -4.9015F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r559 = tail2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-1.4F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 1.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r560 = tail2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(38, 0).addBox(-0.6F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition leftPlate16 = tail2.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4054F, -1.9157F, 5.2996F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition cube_r561 = leftPlate16.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(106, 37).addBox(-0.4995F, -0.2379F, -0.2105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1629F, -1.3839F, -0.6644F, -0.088F, -0.0075F, -0.0052F));

		PartDefinition cube_r562 = leftPlate16.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(96, 8).addBox(-0.5F, 0.25F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1636F, -2.3213F, -0.3275F, -0.1081F, -0.0381F, -0.0216F));

		PartDefinition cube_r563 = leftPlate16.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(30, 106).addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1599F, -1.8041F, -0.6316F, -0.7061F, 0.0089F, 0.0018F));

		PartDefinition cube_r564 = leftPlate16.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(101, 107).addBox(-0.504F, 0.3399F, -0.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1629F, -1.3839F, -0.6644F, -0.0123F, 0.0088F, 0.0022F));

		PartDefinition rightPlate16 = tail2.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4054F, -1.9157F, 5.2996F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition cube_r565 = rightPlate16.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(106, 37).mirror().addBox(-0.5005F, -0.2379F, -0.2105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1629F, -1.3839F, -0.6644F, -0.088F, 0.0075F, 0.0052F));

		PartDefinition cube_r566 = rightPlate16.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(96, 8).mirror().addBox(-0.5F, 0.25F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1636F, -2.3213F, -0.3275F, -0.1081F, 0.0381F, 0.0216F));

		PartDefinition cube_r567 = rightPlate16.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(30, 106).mirror().addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1599F, -1.8041F, -0.6316F, -0.7061F, -0.0089F, -0.0018F));

		PartDefinition cube_r568 = rightPlate16.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(101, 107).mirror().addBox(-0.496F, 0.3399F, -0.2401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1629F, -1.3839F, -0.6644F, -0.0123F, -0.0088F, -0.0022F));

		PartDefinition leftPlate15 = tail2.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.519F, -2.2172F, 2.3899F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition cube_r569 = leftPlate15.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(25, 106).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1629F, -1.0839F, -0.4144F, -0.1404F, -0.0077F, -0.0048F));

		PartDefinition cube_r570 = leftPlate15.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(94, 82).addBox(-0.5F, -0.8F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1572F, -1.1674F, 0.2605F, 0.0429F, -0.0077F, -0.0048F));

		PartDefinition cube_r571 = leftPlate15.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(20, 106).addBox(-0.5F, 0.25F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1636F, -2.3213F, -0.3275F, -0.1081F, -0.0381F, -0.0216F));

		PartDefinition cube_r572 = leftPlate15.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(15, 106).addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1599F, -1.8041F, -0.6316F, -0.7061F, 0.0089F, 0.0018F));

		PartDefinition cube_r573 = leftPlate15.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(85, 107).addBox(-0.5F, -0.65F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1556F, -0.4035F, -0.8432F, -0.0646F, 0.0089F, 0.0018F));

		PartDefinition rightPlate15 = tail2.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.519F, -2.2172F, 2.3899F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition cube_r574 = rightPlate15.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(25, 106).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1629F, -1.0839F, -0.4144F, -0.1404F, 0.0077F, 0.0048F));

		PartDefinition cube_r575 = rightPlate15.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(94, 82).mirror().addBox(-0.5F, -0.8F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1572F, -1.1674F, 0.2605F, 0.0429F, 0.0077F, 0.0048F));

		PartDefinition cube_r576 = rightPlate15.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(20, 106).mirror().addBox(-0.5F, 0.25F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1636F, -2.3213F, -0.3275F, -0.1081F, 0.0381F, 0.0216F));

		PartDefinition cube_r577 = rightPlate15.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(15, 106).mirror().addBox(-0.5F, -0.475F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1599F, -1.8041F, -0.6316F, -0.7061F, -0.0089F, -0.0018F));

		PartDefinition cube_r578 = rightPlate15.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(85, 107).mirror().addBox(-0.5F, -0.65F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1556F, -0.4035F, -0.8432F, -0.0646F, -0.0089F, -0.0018F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 41).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0148F, 5.9011F, -0.0983F, 0.2171F, -0.0212F));

		PartDefinition cube_r579 = tail3.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(111, 4).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r580 = tail3.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(111, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r581 = tail3.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(68, 111).addBox(0.0F, 6.1055F, 11.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 111).addBox(0.0F, 5.2055F, 9.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5322F, -10.8026F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate17 = tail3.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3142F, -1.7186F, 2.2354F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition cube_r582 = leftPlate17.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(68, 99).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1629F, -0.4921F, -0.0501F, -0.8298F, -0.0077F, -0.0048F));

		PartDefinition cube_r583 = leftPlate17.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(96, 106).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1811F, -1.008F, -0.0427F, -1.3298F, -0.0381F, -0.0216F));

		PartDefinition cube_r584 = leftPlate17.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(106, 87).addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1811F, -1.008F, -0.0427F, -0.5008F, -0.0381F, -0.0216F));

		PartDefinition cube_r585 = leftPlate17.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(106, 107).addBox(-0.5F, -0.975F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 104).addBox(-0.5F, -0.375F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1592F, -0.5408F, -0.4149F, 0.2059F, 0.0088F, 0.0022F));

		PartDefinition rightPlate17 = tail3.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3142F, -1.7186F, 2.2354F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition cube_r586 = rightPlate17.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(68, 99).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1629F, -0.4921F, -0.0501F, -0.8298F, 0.0077F, 0.0048F));

		PartDefinition cube_r587 = rightPlate17.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(96, 106).mirror().addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1811F, -1.008F, -0.0427F, -1.3298F, 0.0381F, 0.0216F));

		PartDefinition cube_r588 = rightPlate17.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(106, 87).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.1811F, -1.008F, -0.0427F, -0.5008F, 0.0381F, 0.0216F));

		PartDefinition cube_r589 = rightPlate17.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(106, 107).mirror().addBox(-0.5F, -0.975F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 104).mirror().addBox(-0.5F, -0.375F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1592F, -0.5408F, -0.4149F, 0.2059F, -0.0088F, -0.0022F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 21).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(80, 111).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.925F, -0.1715F, 0.2581F, -0.0442F));

		PartDefinition cube_r590 = tail4.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(77, 84).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r591 = tail4.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(77, 111).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r592 = tail4.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(66, 76).addBox(0.0F, 11.0055F, 21.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 111).addBox(0.0F, 10.1055F, 19.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 111).addBox(0.0F, 9.1055F, 17.8955F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5322F, -19.8026F, 0.4887F, 0.0F, 0.0F));

		PartDefinition leftPlate19 = tail4.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1157F, -1.1676F, 2.1936F, -0.4636F, -0.0206F, 0.1736F));

		PartDefinition cube_r593 = leftPlate19.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(40, 108).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1811F, -1.008F, -0.0427F, -1.3298F, -0.0381F, -0.0216F));

		PartDefinition cube_r594 = leftPlate19.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(35, 108).addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1811F, -1.008F, -0.0427F, -0.5008F, -0.0381F, -0.0216F));

		PartDefinition cube_r595 = leftPlate19.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(108, 30).addBox(-0.475F, -0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1592F, -0.5408F, -0.4149F, 0.4677F, 0.0088F, 0.0022F));

		PartDefinition rightPlate19 = tail4.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1157F, -1.1676F, 2.1936F, -0.4636F, 0.0206F, -0.1736F));

		PartDefinition cube_r596 = rightPlate19.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(40, 108).mirror().addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1811F, -1.008F, -0.0427F, -1.3298F, 0.0381F, 0.0216F));

		PartDefinition cube_r597 = rightPlate19.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1811F, -1.008F, -0.0427F, -0.5008F, 0.0381F, 0.0216F));

		PartDefinition cube_r598 = rightPlate19.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(108, 30).mirror().addBox(-0.55F, -0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1592F, -0.5408F, -0.4149F, 0.4677F, -0.0088F, -0.0022F));

		PartDefinition leftPlate18 = tail4.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1866F, -1.2965F, -0.1194F, -0.2454F, -0.0206F, 0.1736F));

		PartDefinition cube_r599 = leftPlate18.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(107, 15).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1811F, -1.008F, -0.0427F, -1.3298F, -0.0381F, -0.0216F));

		PartDefinition cube_r600 = leftPlate18.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(107, 12).addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1811F, -1.008F, -0.0427F, -0.5008F, -0.0381F, -0.0216F));

		PartDefinition cube_r601 = leftPlate18.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(108, 27).addBox(-0.475F, -0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1592F, -0.5408F, -0.4149F, 0.4677F, 0.0088F, 0.0022F));

		PartDefinition rightPlate18 = tail4.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1866F, -1.2965F, -0.1194F, -0.2454F, 0.0206F, -0.1736F));

		PartDefinition cube_r602 = rightPlate18.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(107, 15).mirror().addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1811F, -1.008F, -0.0427F, -1.3298F, 0.0381F, 0.0216F));

		PartDefinition cube_r603 = rightPlate18.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(107, 12).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1811F, -1.008F, -0.0427F, -0.5008F, 0.0381F, 0.0216F));

		PartDefinition cube_r604 = rightPlate18.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(108, 27).mirror().addBox(-0.525F, -0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1592F, -0.5408F, -0.4149F, 0.4677F, -0.0088F, -0.0022F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F))
				.texOffs(69, 43).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, -0.1787F, 0.2148F, -0.0385F));

		PartDefinition lefttailSpike2 = tail5.addOrReplaceChild("lefttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2471F, 0.03F, 4.0314F, -0.2025F, -0.0293F, 0.6423F));

		PartDefinition cube_r605 = lefttailSpike2.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(46, 77).addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0886F, -9.6639F, 8.1179F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r606 = lefttailSpike2.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0886F, 4.0648F, -2.8176F, -0.6545F, 0.0F, 0.0F));

		PartDefinition righttailSpike2 = tail5.addOrReplaceChild("righttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2471F, 0.03F, 4.0314F, -0.2025F, 0.0293F, -0.6423F));

		PartDefinition cube_r607 = righttailSpike2.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(46, 77).mirror().addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0886F, -9.6639F, 8.1179F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r608 = righttailSpike2.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0886F, 4.0648F, -2.8176F, -0.6545F, 0.0F, 0.0F));

		PartDefinition lefttailSpike = tail5.addOrReplaceChild("lefttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7276F, -0.9782F, 1.2682F, -0.0455F, -0.0293F, 0.6423F));

		PartDefinition cube_r609 = lefttailSpike.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0886F, -9.6639F, 8.1179F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r610 = lefttailSpike.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(41, 76).addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0886F, 4.0648F, -2.8176F, -0.6545F, 0.0F, 0.0F));

		PartDefinition righttailSpike = tail5.addOrReplaceChild("righttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7276F, -0.9782F, 1.2682F, -0.0455F, 0.0293F, -0.6423F));

		PartDefinition cube_r611 = righttailSpike.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, 7.0399F, -1.3202F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0886F, -9.6639F, 8.1179F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r612 = righttailSpike.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-0.5F, -10.5877F, -0.6862F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0886F, 4.0648F, -2.8176F, -0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 115, 115);
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