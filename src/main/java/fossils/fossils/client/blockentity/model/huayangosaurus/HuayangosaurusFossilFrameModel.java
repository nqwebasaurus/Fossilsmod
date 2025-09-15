package fossils.fossils.client.blockentity.model.huayangosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HuayangosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart tail;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart tail2;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart tail3;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart tail4;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart tail5;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart tail6;
	private final ModelPart lefttailSpike;
	private final ModelPart righttailSpike;
	private final ModelPart tail7;
	private final ModelPart lefttailSpike2;
	private final ModelPart righttailSpike2;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart upperbody;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart neck;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart neck3;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;

	public HuayangosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.bone = this.body.getChild("bone");
		this.bone6 = this.body.getChild("bone6");
		this.leftPlate9 = this.body.getChild("leftPlate9");
		this.rightPlate9 = this.body.getChild("rightPlate9");
		this.leftPlate18 = this.body.getChild("leftPlate18");
		this.rightPlate18 = this.body.getChild("rightPlate18");
		this.tail = this.body.getChild("tail");
		this.leftPlate10 = this.tail.getChild("leftPlate10");
		this.rightPlate10 = this.tail.getChild("rightPlate10");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate11 = this.tail2.getChild("leftPlate11");
		this.rightPlate11 = this.tail2.getChild("rightPlate11");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate12 = this.tail3.getChild("leftPlate12");
		this.rightPlate12 = this.tail3.getChild("rightPlate12");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate13 = this.tail4.getChild("leftPlate13");
		this.rightPlate13 = this.tail4.getChild("rightPlate13");
		this.tail5 = this.tail4.getChild("tail5");
		this.leftPlate14 = this.tail5.getChild("leftPlate14");
		this.rightPlate14 = this.tail5.getChild("rightPlate14");
		this.leftPlate19 = this.tail5.getChild("leftPlate19");
		this.rightPlate19 = this.tail5.getChild("rightPlate19");
		this.tail6 = this.tail5.getChild("tail6");
		this.lefttailSpike = this.tail6.getChild("lefttailSpike");
		this.righttailSpike = this.tail6.getChild("righttailSpike");
		this.tail7 = this.tail6.getChild("tail7");
		this.lefttailSpike2 = this.tail7.getChild("lefttailSpike2");
		this.righttailSpike2 = this.tail7.getChild("righttailSpike2");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.upperbody = this.body3.getChild("upperbody");
		this.leftPlate6 = this.upperbody.getChild("leftPlate6");
		this.rightPlate6 = this.upperbody.getChild("rightPlate6");
		this.neck = this.upperbody.getChild("neck");
		this.leftPlate3 = this.neck.getChild("leftPlate3");
		this.rightPlate3 = this.neck.getChild("rightPlate3");
		this.neck2 = this.neck.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.leftPlate17 = this.neck4.getChild("leftPlate17");
		this.rightPlate17 = this.neck4.getChild("rightPlate17");
		this.neck3 = this.neck4.getChild("neck3");
		this.leftPlate2 = this.neck3.getChild("leftPlate2");
		this.rightPlate2 = this.neck3.getChild("rightPlate2");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.frontleftleg2 = this.upperbody.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.upperbody.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.bone3 = this.upperbody.getChild("bone3");
		this.bone4 = this.upperbody.getChild("bone4");
		this.leftPlate4 = this.upperbody.getChild("leftPlate4");
		this.rightPlate4 = this.upperbody.getChild("rightPlate4");
		this.bone2 = this.upperbody.getChild("bone2");
		this.bone5 = this.upperbody.getChild("bone5");
		this.leftPlate7 = this.body3.getChild("leftPlate7");
		this.rightPlate7 = this.body3.getChild("rightPlate7");
		this.leftPlate8 = this.body2.getChild("leftPlate8");
		this.rightPlate8 = this.body2.getChild("rightPlate8");
		this.leftPlate5 = this.body2.getChild("leftPlate5");
		this.rightPlate5 = this.body2.getChild("rightPlate5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -22.0F, 6.4F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -5.5F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.0F, -15.5F, -11.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -15.5F, -11.5F, 0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.8F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -16.5F, 6.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.9983F, 6.1197F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.7F, 0.25F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 1.8344F, 1.3098F, 0.288F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 9.5823F, -0.0237F, 0.3142F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0037F, 8.2974F, -0.3292F, -0.6971F, -0.0084F, -0.0044F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5237F, 2.1273F, -0.2018F, 0.4363F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 1.8344F, 1.3098F, -0.2793F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 9.5823F, -0.0237F, 0.7941F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0037F, 8.2974F, -0.3292F, -0.6971F, 0.0084F, 0.0044F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5237F, 2.1273F, -0.2018F, 0.7418F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.0823F, 0.5253F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone6 = body.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.0823F, 0.5253F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = body.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3935F, -3.4729F, -2.5975F, 0.019F, 0.1095F, 0.2063F));

		PartDefinition rightPlate9 = body.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3935F, -3.4729F, -2.5975F, 0.019F, -0.1095F, -0.2063F));

		PartDefinition leftPlate18 = body.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2379F, -3.679F, 1.1173F, 0.0189F, 0.0659F, 0.2055F));

		PartDefinition rightPlate18 = body.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2379F, -3.679F, 1.1173F, 0.0189F, -0.0659F, -0.2055F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1278F, 4.9992F, 0.0915F, -0.1778F, 0.0272F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 55).addBox(-0.5F, -0.3422F, 4.3173F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 52).addBox(-0.5F, -0.3422F, 0.6173F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0767F, -1.0587F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = tail.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3741F, -3.7863F, 1.2089F, -0.0246F, 0.1095F, 0.2063F));

		PartDefinition rightPlate10 = tail.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3741F, -3.7863F, 1.2089F, -0.0246F, -0.1095F, -0.2063F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3361F, 3.8737F, 0.0774F, 0.0836F, 0.0501F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 22).addBox(-0.5F, -0.1894F, -0.5203F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0708F, 0.3071F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = tail2.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2848F, -2.8299F, 3.3974F, -0.1119F, 0.1095F, 0.2063F));

		PartDefinition rightPlate11 = tail2.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2848F, -2.8299F, 3.3974F, -0.1119F, -0.1095F, -0.2063F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.292F, 5.6763F, -0.1632F, -0.0861F, 0.0142F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.2455F, -0.9252F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0433F, 0.8169F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = tail3.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2848F, -2.9311F, 2.3357F, 0.1274F, 0.084F, 0.424F));

		PartDefinition rightPlate12 = tail3.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2848F, -2.9311F, 2.3357F, 0.1274F, -0.084F, -0.424F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8153F, 4.8009F, -0.0345F, -0.1731F, 0.0465F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(6, 26).addBox(-0.5F, 0.1944F, 6.539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 20).addBox(-0.5F, 0.1944F, -0.161F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -0.104F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftPlate13 = tail4.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1833F, -1.9916F, 3.2925F, -0.0471F, 0.084F, 0.424F));

		PartDefinition rightPlate13 = tail4.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1833F, -1.9916F, 3.2925F, -0.0471F, -0.084F, -0.424F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, 0.3216F, -0.0333F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0443F, 7.0318F, -0.1374F, 0.1573F, -0.1506F));

		PartDefinition leftPlate14 = tail5.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2311F, -1.8403F, 0.982F, -0.1344F, 0.084F, 0.424F));

		PartDefinition rightPlate14 = tail5.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2311F, -1.8403F, 0.982F, -0.1344F, -0.084F, -0.424F));

		PartDefinition leftPlate19 = tail5.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.079F, -1.6294F, 5.712F, -0.2548F, 0.1371F, 0.4107F));

		PartDefinition rightPlate19 = tail5.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.079F, -1.6294F, 5.712F, -0.2548F, -0.1371F, -0.4107F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(30, 31).addBox(-0.5F, 0.3216F, -0.3333F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0414F, 5.9303F, -0.0874F, 0.3478F, -0.0299F));

		PartDefinition lefttailSpike = tail6.addOrReplaceChild("lefttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7955F, -0.8082F, 3.7744F, -0.0166F, -0.0263F, 0.8605F));

		PartDefinition righttailSpike = tail6.addOrReplaceChild("righttailSpike", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7955F, -0.8082F, 3.7744F, -0.0166F, 0.0263F, -0.8605F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(39, 39).addBox(-0.5F, 0.3216F, -0.4333F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0142F, 5.9211F, -0.2148F, 0.1279F, -0.0278F));

		PartDefinition lefttailSpike2 = tail7.addOrReplaceChild("lefttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1744F, -0.2872F, 0.4704F, -0.2348F, -0.0263F, 0.8605F));

		PartDefinition righttailSpike2 = tail7.addOrReplaceChild("righttailSpike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1744F, -0.2872F, 0.4704F, -0.2348F, 0.0263F, -0.8605F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3607F, -4.1864F, 0.0788F, -0.087F, -0.0069F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 12).addBox(-1.0F, -1.1893F, 4.3355F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -10.9369F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.6218F, -6.7505F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -0.4007F, -0.4096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4075F, -4.1864F, 0.2705F, 0.0F, 0.0F));

		PartDefinition upperbody = body3.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.0656F, -4.667F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r11 = upperbody.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 34).addBox(-1.0F, 0.0947F, 6.7204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 29).addBox(-1.0F, 0.0947F, 1.0204F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.3164F, -7.2176F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftPlate6 = upperbody.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8673F, -1.1875F, -4.1764F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition rightPlate6 = upperbody.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8673F, -1.1875F, -4.1764F, 0.5223F, -0.0762F, -0.2206F));

		PartDefinition neck = upperbody.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1633F, -5.5959F, 0.0149F, 0.0878F, -0.0422F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(35, 78).addBox(0.0F, 0.2682F, 1.6436F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.2672F, -3.7014F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(81, 11).addBox(0.0F, 0.225F, 1.65F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.3671F, -5.7014F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5104F, -1.9885F, -1.7278F, -0.1148F, 0.0762F, 0.2206F));

		PartDefinition rightPlate3 = neck.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5104F, -1.9885F, -1.7278F, -0.1148F, -0.0762F, -0.2206F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0825F, -3.542F, -0.2565F, 0.2536F, -0.0657F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 82).addBox(0.0F, 0.233F, 1.158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.1976F, -2.9519F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.1976F, -1.8519F, -0.0584F, 0.2164F, -0.0139F));

		PartDefinition cube_r15 = neck4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 83).addBox(0.0F, 0.05F, 2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 82).addBox(0.0F, 0.05F, 1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate17 = neck4.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(1.061F, -1.9248F, 0.1856F, 0.147F, 0.0762F, 0.2206F));

		PartDefinition rightPlate17 = neck4.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.061F, -1.9248F, 0.1856F, 0.147F, -0.0762F, -0.2206F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.3624F, -1.9169F, 0.1201F, 0.26F, 0.031F));

		PartDefinition cube_r16 = neck3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 28).addBox(0.0F, 0.05F, -1.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate2 = neck3.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7005F, -2.0154F, 0.0308F, 0.0161F, 0.0762F, 0.2206F));

		PartDefinition rightPlate2 = neck3.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7005F, -2.0154F, 0.0308F, 0.0161F, -0.0762F, -0.2206F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2639F, -2.7457F, 0.025F, 0.2656F, 0.1576F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.1637F, -0.6406F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.1637F, -0.6406F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3576F, 0.4906F, 0.3491F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = upperbody.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5884F, 6.6516F, -2.4877F, 0.2214F, -0.0552F, -0.1188F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2756F, 7.9757F, 1.3448F, -0.3986F, 0.07F, 0.1047F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0704F, 6.0949F, -0.6064F, 0.1102F, 0.1606F, 0.0032F));

		PartDefinition frontrightleg2 = upperbody.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5884F, 6.6516F, -2.4877F, -0.2149F, 0.0552F, 0.1188F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2756F, 7.9757F, 1.3448F, -0.7477F, 0.0609F, -0.1055F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0704F, 6.0949F, -0.6064F, 0.8519F, -0.1606F, -0.0032F));

		PartDefinition bone3 = upperbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4882F, 3.4262F, -2.3171F, -0.6821F, 0.3387F, -0.9907F));

		PartDefinition bone4 = upperbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4882F, 3.4262F, -2.3171F, -0.6821F, -0.3387F, 0.9907F));

		PartDefinition leftPlate4 = upperbody.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8194F, -2.7353F, -0.2477F, 0.5223F, 0.0762F, 0.2206F));

		PartDefinition rightPlate4 = upperbody.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8194F, -2.7353F, -0.2477F, 0.5223F, -0.0762F, -0.2206F));

		PartDefinition bone2 = upperbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, 3.7164F, -6.4176F));

		PartDefinition bone5 = upperbody.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-1.5F, 3.7164F, -6.4176F));

		PartDefinition leftPlate7 = body3.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9677F, -2.1115F, -2.2723F, 0.3826F, 0.0762F, 0.2206F));

		PartDefinition rightPlate7 = body3.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9677F, -2.1115F, -2.2723F, 0.3826F, -0.0762F, -0.2206F));

		PartDefinition leftPlate8 = body2.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3296F, -2.6263F, -5.6124F, 0.3157F, 0.1095F, 0.2063F));

		PartDefinition rightPlate8 = body2.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3296F, -2.6263F, -5.6124F, 0.3157F, -0.1095F, -0.2063F));

		PartDefinition leftPlate5 = body2.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6513F, -3.1211F, -1.7411F, 0.0992F, 0.1354F, 0.1905F));

		PartDefinition rightPlate5 = body2.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6513F, -3.1211F, -1.7411F, 0.0992F, -0.1354F, -0.1905F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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