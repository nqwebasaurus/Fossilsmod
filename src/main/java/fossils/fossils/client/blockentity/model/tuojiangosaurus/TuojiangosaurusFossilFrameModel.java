package fossils.fossils.client.blockentity.model.tuojiangosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TuojiangosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart tail2;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart tail3;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart tail4;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart tail7;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart body2;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart leftPlate7;
	private final ModelPart leftPlate20;
	private final ModelPart upperbody;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart chest;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart spike;
	private final ModelPart spike2;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart neck3;
	private final ModelPart neck5;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;
	private final ModelPart leftPlate16;
	private final ModelPart rightPlate16;
	private final ModelPart head2;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart eye;
	private final ModelPart jaw2;
	private final ModelPart eye2;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;

	public TuojiangosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.leftPlate8 = this.body.getChild("leftPlate8");
		this.rightPlate8 = this.body.getChild("rightPlate8");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.body.getChild("tail");
		this.leftPlate9 = this.tail.getChild("leftPlate9");
		this.rightPlate9 = this.tail.getChild("rightPlate9");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate10 = this.tail2.getChild("leftPlate10");
		this.rightPlate10 = this.tail2.getChild("rightPlate10");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate12 = this.tail3.getChild("leftPlate12");
		this.rightPlate12 = this.tail3.getChild("rightPlate12");
		this.leftPlate11 = this.tail3.getChild("leftPlate11");
		this.rightPlate11 = this.tail3.getChild("rightPlate11");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate14 = this.tail4.getChild("leftPlate14");
		this.rightPlate14 = this.tail4.getChild("rightPlate14");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftPlate13 = this.tail6.getChild("leftPlate13");
		this.rightPlate13 = this.tail6.getChild("rightPlate13");
		this.leftPlate19 = this.tail6.getChild("leftPlate19");
		this.rightPlate19 = this.tail6.getChild("rightPlate19");
		this.tail7 = this.tail6.getChild("tail7");
		this.leftPlate18 = this.tail5.getChild("leftPlate18");
		this.rightPlate18 = this.tail5.getChild("rightPlate18");
		this.body2 = this.body.getChild("body2");
		this.leftPlate6 = this.body2.getChild("leftPlate6");
		this.rightPlate6 = this.body2.getChild("rightPlate6");
		this.leftPlate7 = this.body2.getChild("leftPlate7");
		this.leftPlate20 = this.body2.getChild("leftPlate20");
		this.upperbody = this.body2.getChild("upperbody");
		this.leftPlate5 = this.upperbody.getChild("leftPlate5");
		this.rightPlate5 = this.upperbody.getChild("rightPlate5");
		this.chest = this.upperbody.getChild("chest");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.spike = this.chest.getChild("spike");
		this.spike2 = this.chest.getChild("spike2");
		this.leftPlate2 = this.chest.getChild("leftPlate2");
		this.rightPlate2 = this.chest.getChild("rightPlate2");
		this.leftPlate4 = this.chest.getChild("leftPlate4");
		this.rightPlate4 = this.chest.getChild("rightPlate4");
		this.bone4 = this.chest.getChild("bone4");
		this.bone2 = this.chest.getChild("bone2");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.leftPlate17 = this.neck4.getChild("leftPlate17");
		this.rightPlate17 = this.neck4.getChild("rightPlate17");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck5 = this.neck3.getChild("neck5");
		this.leftPlate15 = this.neck5.getChild("leftPlate15");
		this.rightPlate15 = this.neck5.getChild("rightPlate15");
		this.leftPlate16 = this.neck5.getChild("leftPlate16");
		this.rightPlate16 = this.neck5.getChild("rightPlate16");
		this.head2 = this.neck5.getChild("head2");
		this.leftFace2 = this.head2.getChild("leftFace2");
		this.rightFace2 = this.head2.getChild("rightFace2");
		this.eye = this.head2.getChild("eye");
		this.jaw2 = this.head2.getChild("jaw2");
		this.eye2 = this.head2.getChild("eye2");
		this.leftPlate3 = this.neck2.getChild("leftPlate3");
		this.rightPlate3 = this.neck2.getChild("rightPlate3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -23.0F, 10.0F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(0.0F, -36.4F, -15.8F, 1.0F, 37.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(6.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(-0.1F, -5.0F, 25.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -22.5F, -15.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -23.7711F, 10.9004F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 14).addBox(-0.5F, 2.0F, -0.75F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftPlate8 = body.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6065F, -4.9758F, 1.3964F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate8 = body.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6065F, -4.9758F, 1.3964F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.0F, 0.8915F, 2.7561F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.8915F, 2.7561F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.9151F, -0.1001F, 0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 12.7549F, 0.0089F, 0.6021F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0105F, 9.4915F, 0.0038F, -0.1735F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5119F, 1.2232F, -0.9138F, -0.48F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.9151F, -0.1001F, 0.2618F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 12.7549F, 0.0089F, 0.6458F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0105F, 9.4915F, 0.0038F, -0.1298F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5119F, 1.2232F, -0.9138F, -0.6545F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1422F, 4.8499F, -0.114F, -0.0867F, 0.0099F));

		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 38).addBox(-0.5F, -0.0422F, 0.9173F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0767F, -1.0587F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = tail.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5421F, -4.5473F, 4.0425F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate9 = tail.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5421F, -4.5473F, 4.0425F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7615F, 7.6696F, -0.033F, -0.1744F, 0.0057F));

		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 22).addBox(-0.5F, 0.1106F, 8.8797F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 14).addBox(-0.5F, 0.1106F, -0.8203F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0708F, 0.5071F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = tail2.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1225F, -4.4209F, 3.751F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate10 = tail2.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1225F, -4.4209F, 3.751F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5166F, 9.9012F, -0.0309F, -0.1743F, -0.0098F));

		PartDefinition cube_r5 = tail3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0545F, -0.8252F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0433F, 0.8169F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = tail3.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3995F, -4.128F, 10.0158F, 0.0675F, -0.0355F, 0.1711F));

		PartDefinition rightPlate12 = tail3.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3995F, -4.128F, 10.0158F, 0.0675F, 0.0355F, -0.1711F));

		PartDefinition leftPlate11 = tail3.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.686F, -3.9511F, 1.2259F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate11 = tail3.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.686F, -3.9511F, 1.2259F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0749F, 10.8635F, 0.2413F, -0.29F, -0.0972F));

		PartDefinition cube_r6 = tail4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 35).addBox(-0.5F, 0.2944F, 8.239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 27).addBox(-0.5F, 0.2944F, -0.461F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -0.104F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftPlate14 = tail4.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.393F, -2.7231F, 6.1965F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate14 = tail4.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.393F, -2.7231F, 6.1965F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(38, 38).addBox(-0.5F, 0.3216F, -0.6333F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 45).addBox(-0.5F, 0.3216F, 7.0667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0449F, 9.0714F, 0.2974F, -0.2928F, -0.0882F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(44, 27).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1216F, 7.8667F, -0.2628F, -0.2876F, 0.0823F));

		PartDefinition leftPlate13 = tail6.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5541F, -1.6718F, 1.4498F, 0.043F, 0.3061F, 0.5509F));

		PartDefinition rightPlate13 = tail6.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5541F, -1.6718F, 1.4498F, 0.043F, -0.3061F, -0.5509F));

		PartDefinition leftPlate19 = tail6.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6142F, -1.2123F, 5.0699F, -0.3061F, 0.3061F, 0.5509F));

		PartDefinition rightPlate19 = tail6.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6142F, -1.2123F, 5.0699F, -0.3061F, -0.3061F, -0.5509F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(64, 47).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0427F, -0.0211F, 7.9567F, -0.124F, -0.1732F, 0.0215F));

		PartDefinition leftPlate18 = tail5.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.542F, -2.4289F, 2.6308F, -0.0198F, -0.0355F, 0.1711F));

		PartDefinition rightPlate18 = tail5.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.542F, -2.4289F, 2.6308F, -0.0198F, 0.0355F, -0.1711F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5967F, -5.1249F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 5).addBox(-1.0F, -0.8893F, 10.0355F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 0).addBox(-1.0F, -0.8893F, 4.3354F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -10.0369F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -0.1006F, -0.4096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -10.0369F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftPlate6 = body2.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6784F, -3.1576F, -9.7731F, 0.4165F, -0.0355F, 0.1711F));

		PartDefinition rightPlate6 = body2.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6784F, -3.1576F, -9.7731F, 0.4165F, 0.0355F, -0.1711F));

		PartDefinition leftPlate7 = body2.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7319F, -4.4046F, -2.4648F, 0.2856F, -0.0355F, 0.1711F));

		PartDefinition leftPlate20 = body2.addOrReplaceChild("leftPlate20", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7319F, -4.4046F, -2.4648F, 0.2856F, 0.0355F, -0.1711F));

		PartDefinition upperbody = body2.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6797F, -10.4136F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r9 = upperbody.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 48).addBox(-1.0F, 0.2947F, 1.6204F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.3164F, -7.2176F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftPlate5 = upperbody.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5302F, -2.9241F, -4.4159F, 0.4175F, -0.0754F, 0.1534F));

		PartDefinition rightPlate5 = upperbody.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5302F, -2.9241F, -4.4159F, 0.4175F, 0.0754F, -0.1534F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3936F, 2.3346F, -5.1865F, 0.2127F, -0.0425F, -0.0083F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, 0.2947F, -6.3796F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8936F, -0.1506F, -1.7052F, 0.3054F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6828F, 7.4154F, -5.7188F, 1.0505F, -0.0552F, -0.1188F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2717F, 8.4964F, -1.227F, -0.9222F, 0.07F, 0.1047F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0321F, 6.1394F, 0.09F, 0.8943F, -0.0562F, -0.0206F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8956F, 7.4154F, -5.7188F, 0.8323F, 0.0552F, 0.1188F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2717F, 8.4964F, -1.227F, -0.835F, -0.07F, -0.1047F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0321F, 6.1394F, 0.09F, 0.9379F, 0.0562F, 0.0206F));

		PartDefinition spike = chest.addOrReplaceChild("spike", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5611F, 5.1384F, -4.7465F, 0.161F, 0.4504F, 0.1416F));

		PartDefinition spike2 = chest.addOrReplaceChild("spike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.774F, 5.1384F, -4.7465F, 0.161F, -0.4504F, -0.1416F));

		PartDefinition leftPlate2 = chest.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6975F, -2.3435F, -7.1768F, 0.6944F, 0.0092F, 0.1647F));

		PartDefinition rightPlate2 = chest.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9104F, -2.3435F, -7.1768F, 0.6944F, -0.0092F, -0.1647F));

		PartDefinition leftPlate4 = chest.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8823F, -4.0183F, -3.0469F, 0.5206F, 0.0005F, 0.1771F));

		PartDefinition rightPlate4 = chest.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0952F, -4.0183F, -3.0469F, 0.5206F, -0.0005F, -0.1771F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6064F, 0.1963F, -1.0423F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3936F, 0.1963F, -1.0423F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3936F, 1.7408F, -7.915F, -0.3217F, -0.0828F, 0.0276F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 62).addBox(0.0F, 0.6682F, -0.5564F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.2672F, -3.7014F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6944F, -3.4616F, -0.1259F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 14).addBox(0.0F, 0.758F, -0.142F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.3024F, -2.9519F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2654F, -2.6978F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(3, 67).addBox(0.0F, 0.05F, 2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 64).addBox(0.0F, 0.05F, -1.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate17 = neck4.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7603F, -2.1251F, -3.0005F, -0.1584F, 0.0762F, 0.2206F));

		PartDefinition rightPlate17 = neck4.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2397F, -2.1251F, -3.0005F, -0.1584F, -0.0762F, -0.2206F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.4251F, -3.8705F, -0.182F, -0.1019F, -0.0697F));

		PartDefinition cube_r14 = neck3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(90, 10).mirror().addBox(-1.0F, 0.05F, -1.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3256F, -2.9321F, 0.116F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 3).mirror().addBox(-1.0F, 0.05F, -1.85F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate15 = neck5.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3181F, -1.5328F, -2.4812F, 0.1034F, 0.0762F, 0.2206F));

		PartDefinition rightPlate15 = neck5.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3181F, -1.5328F, -2.4812F, 0.1034F, -0.0762F, -0.2206F));

		PartDefinition leftPlate16 = neck5.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2543F, -1.7209F, 0.1045F, -0.1584F, 0.0762F, 0.2206F));

		PartDefinition rightPlate16 = neck5.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2543F, -1.7209F, 0.1045F, -0.1584F, -0.0762F, -0.2206F));

		PartDefinition head2 = neck5.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6168F, -3.374F, 0.0989F, 0.0F, 0.0F));

		PartDefinition leftFace2 = head2.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(1.6028F, -1.0518F, -2.7607F));

		PartDefinition rightFace2 = head2.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(-1.6028F, -1.0518F, -2.7607F));

		PartDefinition eye = head2.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw2 = head2.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4684F, 0.2989F, 0.9119F, 0.0F, 0.0F));

		PartDefinition eye2 = head2.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck2.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8215F, -2.7737F, -0.1601F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition rightPlate3 = neck2.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8215F, -2.7737F, -0.1601F, 0.5223F, -0.0762F, -0.2206F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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