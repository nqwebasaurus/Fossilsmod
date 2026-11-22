package fossils.fossils.client.blockentity.model.piscogavialis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PiscogavialisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone9;
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
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body3;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart bone2;
	private final ModelPart bone13;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart bone8;
	private final ModelPart tail7;
	private final ModelPart bone10;
	private final ModelPart tail3;
	private final ModelPart bone7;
	private final ModelPart tail4;
	private final ModelPart bone6;
	private final ModelPart tail5;
	private final ModelPart bone5;
	private final ModelPart tail6;
	private final ModelPart bone4;
	private final ModelPart tail8;
	private final ModelPart bone3;
	private final ModelPart tail9;
	private final ModelPart bone11;
	private final ModelPart tail10;
	private final ModelPart bone12;

	public PiscogavialisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone9 = this.hips.getChild("bone9");
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
		this.body5 = this.body2.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body3 = this.body7.getChild("body3");
		this.frontleftleg = this.body3.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.body3.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.bone2 = this.body3.getChild("bone2");
		this.bone13 = this.body3.getChild("bone13");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.bone8 = this.tail2.getChild("bone8");
		this.tail7 = this.tail2.getChild("tail7");
		this.bone10 = this.tail7.getChild("bone10");
		this.tail3 = this.tail7.getChild("tail3");
		this.bone7 = this.tail3.getChild("bone7");
		this.tail4 = this.tail3.getChild("tail4");
		this.bone6 = this.tail4.getChild("bone6");
		this.tail5 = this.tail4.getChild("tail5");
		this.bone5 = this.tail5.getChild("bone5");
		this.tail6 = this.tail5.getChild("tail6");
		this.bone4 = this.tail6.getChild("bone4");
		this.tail8 = this.tail6.getChild("tail8");
		this.bone3 = this.tail8.getChild("bone3");
		this.tail9 = this.tail8.getChild("tail9");
		this.bone11 = this.tail9.getChild("bone11");
		this.tail10 = this.tail9.getChild("tail10");
		this.bone12 = this.tail10.getChild("bone12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 2.4F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -13.7131F, 38.5269F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(5, 50).addBox(-2.3F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 5.7765F, 1.1873F, -1.5708F, 0.1484F, 1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 54).addBox(0.1F, -7.9176F, 0.3432F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -5.3F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 46).addBox(0.1F, 0.6824F, -0.2568F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -4.9F, -0.1484F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.5307F, 1.8944F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone9 = hips.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 0.5307F, 1.8944F, -0.0436F, 0.0F, 0.0F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8123F, 3.8742F, 1.0811F, 0.6971F, -0.0381F, -1.0396F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.164F, 13.4336F, 3.3888F, 0.8886F, -0.2587F, 0.5623F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1784F, 9.2152F, 0.0363F, 1.2305F, -0.1571F, 0.0873F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8123F, 3.8742F, 1.0811F, -1.0665F, -0.1477F, 1.3694F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.164F, 13.4336F, 3.3888F, 1.7177F, 0.2587F, -0.5623F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1784F, 9.2152F, 0.0363F, 0.925F, 0.1571F, -0.0873F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.35F, -4.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 86).addBox(-1.5F, 1.15F, -0.4F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.6005F, -9.8782F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(24, 96).addBox(-0.5F, 0.675F, -8.3F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1505F, -9.9782F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(118, 92).addBox(-1.5F, 0.475F, -6.3F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 0.2F, -8.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(119, 10).addBox(-1.5F, 0.475F, -6.4F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(119, 41).addBox(-1.5F, 0.475F, -6.4F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body3 = body7.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.0316F, -6.0182F, -0.0476F, 0.0852F, -0.0476F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(2, 1).addBox(1.4F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 6.4242F, -9.5557F, -1.5708F, 0.0698F, -1.5708F));

		PartDefinition cube_r6 = body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 13).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.1F, 6.4242F, -9.5557F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1, 0).addBox(-1.6F, 1.1F, -7.5F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition frontleftleg = body3.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8098F, 4.7997F, -10.3F, 1.4854F, 0.1117F, -0.5456F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7887F, 12.1042F, -1.3687F, -0.5287F, -0.6854F, 0.635F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2098F, 6.8588F, 0.059F, 1.7888F, -0.0056F, 0.0699F));

		PartDefinition frontrightleg = body3.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8098F, 4.7997F, -10.3F, 1.6614F, -0.2851F, 0.4899F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7887F, 12.1042F, -1.3687F, -0.4119F, 0.6392F, -0.7289F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2098F, 6.8588F, 0.059F, 1.3166F, 0.261F, -0.0119F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -1.0518F, -7.4195F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone13 = body3.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -1.0518F, -7.4195F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(132, 64).addBox(-0.65F, -0.6F, -3.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 2.1912F, -16.1284F, -0.0893F, 0.173F, -0.023F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7045F, -3.388F, 0.0552F, 0.4175F, 0.0964F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 125).addBox(-1.0F, 0.225F, 4.825F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(121, 19).addBox(-1.05F, 0.225F, 4.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.3F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -5.0F, 0.2284F, 0.298F, 0.0681F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 120).addBox(-1.0F, 0.15F, 4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -0.2889F, -3.9706F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3693F, 1.0769F, -36.8723F, 0.0F, -0.0349F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6307F, 1.0769F, -36.8723F, 0.0F, 0.0349F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 2.9547F, 2.1105F, 0.8378F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.95F, 6.4F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 89).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.075F, 1.3962F, -0.1408F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(39, 42).addBox(-0.5F, 0.8406F, -0.1292F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.6038F, 8.7592F, 0.0093F, -0.3491F, -0.0032F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 52).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 1.8406F, 11.8708F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bone8 = tail2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-0.5F, -1.4594F, -11.0292F));

		PartDefinition tail7 = tail2.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(42, 13).addBox(-0.4F, 0.8406F, 0.5708F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, -0.004F, -0.35F, 0.0834F));

		PartDefinition bone10 = tail7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-0.5F, -1.4594F, -11.0292F));

		PartDefinition tail3 = tail7.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(71, 13).addBox(-0.5F, 0.9619F, -0.2468F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0913F, 12.4291F, -0.0361F, -0.2616F, 0.0094F));

		PartDefinition bone7 = tail3.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.8F, -3.3291F, 5.1975F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3785F, 10.9345F, -0.0366F, 0.3052F, -0.011F));

		PartDefinition cube_r13 = tail4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.05F, 1.587F, -0.2774F, 0.0087F, 0.0F, 0.0F));

		PartDefinition bone6 = tail4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.5F, -4.6162F, 7.32F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(25, 83).addBox(-0.5F, 0.6678F, -0.2375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3213F, 10.8101F, -0.0149F, 0.0899F, -0.0374F));

		PartDefinition bone5 = tail5.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.5F, -4.2949F, -3.49F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, 0.6311F, -0.7745F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 108).addBox(-0.5F, 0.6311F, 6.9255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0515F, 11.2098F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bone4 = tail6.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.5805F, 1.3849F));

		PartDefinition tail8 = tail6.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(110, 83).addBox(-1.0F, 0.2F, -0.35F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(116, 89).addBox(-1.0F, 0.2F, 6.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.4311F, 7.7255F, 0.0361F, 0.2616F, 0.0094F));

		PartDefinition bone3 = tail8.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0116F, -7.0406F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 111).addBox(-1.05F, 0.2F, -0.05F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0202F, 0.1296F, -0.0892F));

		PartDefinition bone11 = tail9.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0116F, -7.0406F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(85, 76).addBox(-1.0F, 0.2F, -0.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0638F, 0.2132F, -0.0989F));

		PartDefinition bone12 = tail10.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0116F, -7.0406F));

		return LayerDefinition.create(meshdefinition, 186, 186);
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